# bristle_chief
This version has connected successfully to mariaDB on synology nas in a docker container
http://192.168.88.6:8085/getAll -> return all columns
http://192.168.88.6:8085/test -> return eee

Local image name on synology nas: connected_mariadb_image     latest    8b7f9d5c16bf   25 minutes ago   697MB
Local Container name on synology nas: 507bfaa32931   connected_mariadb_image    "java -jar anderson_…"   2 minutes ago   Up 2 minutes    0.0.0.0:8085->8085/tcp   frosty_aryabhata

![image](https://user-images.githubusercontent.com/82254679/154835417-29e1d3fe-7d79-472a-85a1-c02f80afa100.png)
USE AndyTest; -> this is database name

CREATE TABLE andys_table(
id int Primary Key,
name varchar(255),
note varchar(255));

