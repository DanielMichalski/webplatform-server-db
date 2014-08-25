liquibase-tutorial-quickstart
=============================

Commands:
liquibase --driver=oracle.jdbc.OracleDriver
      --classpath=\path\to\classes:jdbcdriver.jar
      --changeLogFile=com/example/db.changelog.xml
      --url="jdbc:oracle:thin:@localhost:1521:XE"
      --username=scott
      --password=tiger
      generateChangeLog



clean compile db:create
clean compile db:schema
clean compile db:update

clean compile liquibase:update -Dliquibase.contexts=dev
clean compile liquibase:dropAll liquibase:update -Dliquibase.contexts=dev 
 
 
Links:
http://www.liquibase.org/documentation/generating_changelogs.html <-- Liquibase can generate change logs file ! ! ! ;-))


