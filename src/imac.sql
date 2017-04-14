/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 100121
Source Host           : localhost:3306
Source Database       : imac

Target Server Type    : MYSQL
Target Server Version : 100121
File Encoding         : 65001

Date: 2017-04-14 15:32:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `modify` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `role` int(2) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'njj0803', '123456', '2017-04-14 11:02:00', '倪晶晶', 'njj0803@gmail.com', '18962817998', '1');
INSERT INTO `tb_user` VALUES ('2', 'test', 'test', '2017-04-06 11:03:02', 'test', 'test@gmail.com', '18962817998', '0');
