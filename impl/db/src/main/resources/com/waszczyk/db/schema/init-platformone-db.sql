--DROP SCHEMA "public"; #--;

--http://www.postgresql.org/docs/7.4/static/ddl-constraints.html#DDL-CONSTRAINTS-FK#--;

CREATE SCHEMA "${db.liquibase.schema.name}"; #--;
ALTER SCHEMA "${db.liquibase.schema.name}" OWNER TO "${db.liquibase.user.name}"; #--;

REVOKE ALL ON DATABASE "${db.liquibase.name}" FROM public; #--;
REVOKE ALL ON SCHEMA "${db.liquibase.schema.name}" FROM public; #--;

GRANT CONNECT ON DATABASE "${db.liquibase.name}" TO "${db.liquibase.user.name}"; #--;
GRANT USAGE ON SCHEMA "${db.liquibase.schema.name}" TO "${db.liquibase.user.name}"; #--;
		
GRANT CONNECT ON DATABASE "${db.liquibase.name}" TO "${db.liquibase.client.user.name}"; #--;
GRANT USAGE ON SCHEMA "${db.liquibase.schema.name}" TO "${db.liquibase.client.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT INSERT, SELECT, UPDATE, DELETE ON TABLES TO "${db.liquibase.client.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT ALL ON SEQUENCES TO "${db.liquibase.client.user.name}"; #--;
ALTER DEFAULT PRIVILEGES GRANT EXECUTE ON FUNCTIONS TO "${db.liquibase.client.user.name}"; #--;



