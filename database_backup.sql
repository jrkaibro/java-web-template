CREATE DATABASE IF NOT EXISTS knetapp;
USE knetapp;
DROP PROCEDURE IF EXISTS init;
DELIMITER //
CREATE PROCEDURE init ()
LANGUAGE SQL
  BEGIN
    DECLARE user_exist, data_present INT;
    SET user_exist = (SELECT EXISTS (SELECT DISTINCT user FROM mysql.user WHERE user = "knetapp"));
    IF user_exist = 0 THEN
      CREATE USER 'knetapp'@'%' IDENTIFIED BY 'knetapp@@2021';
      GRANT ALL PRIVILEGES ON knetapp.* TO 'knetapp'@'%';
      FLUSH PRIVILEGES;
    END IF;
    CREATE TABLE IF NOT EXISTS technology (
      id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(64),
      value INT
    );
    SET data_present = (SELECT COUNT(*) FROM technology);
    IF data_present = 0 THEN
      INSERT INTO technology (name, value) VALUES
        ('Java', 10),
        ('Genexus', 20),
        ('Flutter', 15),
        ('C#', 5),
        ('ReactJS', 3),
        ('AngularJS', 7),
        ('ReactNative', 9),
        ('Android', 12),
        ('PHP', 4),
        ('JavaScript', 8);
    END IF;
  END;//
DELIMITER ;
CALL init();