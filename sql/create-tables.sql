CREATE TABLE news (
	newsid INT NOT NULL,
	title VARCHAR(50) NOT NULL DEFAULT '',
	content MEDIUMTEXT NOT NULL,
	url VARCHAR(50),
	category VARCHAR(30),
	createdAt (
	PRIMARY KEY (newsid)
);