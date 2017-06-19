DROP TABLE IF EXISTS `navriti_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `navriti_details` (
  `idea_id` bigint(50) NOT NULL AUTO_INCREMENT,
  `emp_user_id` bigint(50) NOT NULL,
  `idea_stage` varchar(30) DEFAULT NULL,
  `stage_outcome` varchar(30) DEFAULT NULL,
  `submission_date` date DEFAULT NULL,
  `portfolio` varchar(30) DEFAULT NULL,
  `application_name` varchar(30) DEFAULT NULL,
  `submitted_by` varchar(30) DEFAULT NULL,
  `idea_classification` varchar(100) DEFAULT NULL,
  `problem_statement` varchar(500) DEFAULT NULL,
  `solution_description` varchar(1000) DEFAULT NULL,
  `ideation_date` date DEFAULT NULL,
  `per_hour_dollar_rate` int(11) DEFAULT NULL,
  `annual_effort_savings` bigint(50) DEFAULT NULL,
  `sme_review_date` date DEFAULT NULL,
  `council_review_date` date DEFAULT NULL,
  `client_review_date` date DEFAULT NULL,
  `implementation_date` date DEFAULT NULL,
  `savings` bigint(50) DEFAULT NULL,
  `elapsed_time` int(11) DEFAULT NULL,
  `client` varchar(20) DEFAULT NULL,
  `technology` varchar(20) DEFAULT NULL,
  `comments` text,
  PRIMARY KEY (`idea_id`),
  KEY `navritiEmpFk_idx` (`emp_user_id`),
  CONSTRAINT `navritiEmpFk` FOREIGN KEY (`emp_user_id`) REFERENCES `employee_details` (`emp_user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

commit;
