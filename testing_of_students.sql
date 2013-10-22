-- phpMyAdmin SQL Dump
-- version 4.0.5
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1:3306
-- Час створення: Жов 15 2013 р., 01:04
-- Версія сервера: 5.6.13-log
-- Версія PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База даних: `testing_of_students`
--

-- --------------------------------------------------------

--
-- Структура таблиці `lab`
--

CREATE TABLE IF NOT EXISTS `lab` (
  `idLab` int(11) NOT NULL AUTO_INCREMENT,
  `labName` varchar(255) NOT NULL,
  `topicID` int(11) NOT NULL,
  PRIMARY KEY (`idLab`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Дамп даних таблиці `lab`
--

INSERT INTO `lab` (`idLab`, `labName`, `topicID`) VALUES
(1, 'Лаб 1', 4),
(2, 'Лаба 5', 3),
(3, 'Лаба №1', 1);

-- --------------------------------------------------------

--
-- Структура таблиці `questions`
--

CREATE TABLE IF NOT EXISTS `questions` (
  `idQuestion` int(11) NOT NULL AUTO_INCREMENT,
  `idLab` int(11) NOT NULL,
  `Question` varchar(255) NOT NULL,
  `answer_a` varchar(255) NOT NULL,
  `answer_b` varchar(255) NOT NULL,
  `answer_c` varchar(255) NOT NULL,
  `answer_d` varchar(255) NOT NULL,
  `correctAnswerID` int(11) NOT NULL,
  PRIMARY KEY (`idQuestion`),
  UNIQUE KEY `idQuestion` (`idQuestion`),
  KEY `correctAnswerID` (`correctAnswerID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Дамп даних таблиці `questions`
--

INSERT INTO `questions` (`idQuestion`, `idLab`, `Question`, `answer_a`, `answer_b`, `answer_c`, `answer_d`, `correctAnswerID`) VALUES
(1, 1, 'функция BackSpace …?', 'удаление символа', 'выделение символа с лева от курсора', 'удаление символа слева от курсора', 'возвращение на место', 3),
(2, 0, 'fghjk', '1', '2', '3', '4', 2),
(3, 0, 'jhkhjkhjkhjkhjkhjkh', 'hgkhjkh', 'khjk', 'hjkhj', 'asdasdasdas', 1);

-- --------------------------------------------------------

--
-- Структура таблиці `results_of_students`
--

CREATE TABLE IF NOT EXISTS `results_of_students` (
  `idResult` int(11) NOT NULL AUTO_INCREMENT,
  `labID` int(11) NOT NULL,
  `studGgroup` varchar(255) NOT NULL COMMENT 'назва групи в якій навчається студент',
  `studentName` varchar(302) NOT NULL COMMENT 'ПІБ',
  `hostName` varchar(255) NOT NULL,
  `hostAddress` varchar(255) NOT NULL,
  `result` int(11) NOT NULL COMMENT 'кількість правильних відповідей',
  PRIMARY KEY (`idResult`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблиці `sys_users`
--

CREATE TABLE IF NOT EXISTS `sys_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `info` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп даних таблиці `sys_users`
--

INSERT INTO `sys_users` (`id`, `username`, `password`, `info`) VALUES
(1, 'Admin', 'root', 'Admin');

-- --------------------------------------------------------

--
-- Структура таблиці `topic`
--

CREATE TABLE IF NOT EXISTS `topic` (
  `idTopic` int(11) NOT NULL AUTO_INCREMENT,
  `topic` varchar(255) NOT NULL,
  PRIMARY KEY (`idTopic`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Дамп даних таблиці `topic`
--

INSERT INTO `topic` (`idTopic`, `topic`) VALUES
(1, '1'),
(2, '2'),
(3, '3'),
(4, '4'),
(5, '5');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
