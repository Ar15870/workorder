CREATE TABLE project
(id BIGINT PRIMARY KEY AUTO_INCREMENT
,project_name VARCHAR(50) NOT NULL
);

CREATE TABLE workorder
(id BIGINT PRIMARY KEY AUTO_INCREMENT
,project_id BIGINT NOT NULL
,executor VARCHAR(50) NOT NULL
,description VARCHAR(255) NOT NULL
,order_level TINYINT NOT NULL
,create_date DATE NOT NULL
);

ALTER TABLE workorder
    ADD CONSTRAINT fk_project_id
FOREIGN KEY (project_id) REFERENCES project(id);

INSERT INTO project(project_name) VALUES ('系统开发部');
INSERT INTO project(project_name) VALUES ('课件制作中心Java项目组');
INSERT INTO project(project_name) VALUES ('产品设计中心项目组');

