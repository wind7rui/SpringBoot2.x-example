CREATE TABLE `student` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `number` varchar(20) NOT NULL DEFAULT '' COMMENT '学号',
  `name` varchar(30) NOT NULL DEFAULT '' COMMENT '姓名',
  `age` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '年龄',
  `sex` tinyint(1) unsigned NOT NULL COMMENT '性别 1-男 2-女',
  `grade` tinyint(1) unsigned NOT NULL COMMENT '年级',
  `clazz` tinyint(1) unsigned NOT NULL COMMENT '班级',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_key_number` (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;