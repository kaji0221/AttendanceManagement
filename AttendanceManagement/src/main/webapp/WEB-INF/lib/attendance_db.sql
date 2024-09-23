-- 勤怠管理システム用のデータベース作成
CREATE DATABASE attendance_db;

-- 作成したデータベースを使用
USE attendance_db;

-- ユーザーテーブルの作成
CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

-- 勤怠テーブルの作成
CREATE TABLE attendance (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    date DATE NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    status VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES user (id)
);

-- 残業テーブルの作成
CREATE TABLE overtime (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    date DATE NOT NULL,
    overtime_hours DECIMAL(5, 2),
    FOREIGN KEY (user_id) REFERENCES user (id)
);