Create TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userAddress` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

Insert INTO `user` VALUES ('1', 'tom凌', '100', '深圳,广东');
