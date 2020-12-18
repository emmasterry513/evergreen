
-- *************** Species table****************;
-- ***************************************************;
-- ******* fields ********
-- recommended_water ( recommended water in ml )
-- water_frencuency (water frecuency in hours, e.g 24h, 72h...)

CREATE TABLE "species"
(
 "id"                int NOT NULL,
 "specie_name"       varchar(50) NOT NULL,
 "recommended_water" decimal NOT NULL,
 "water_frencuency"  int,
 "plant_location"    varchar(50) NOT NULL,
 "sun_requeriment"   varchar(50) NOT NULL,
 CONSTRAINT "PK_species" PRIMARY KEY ( "id" )
);

CREATE TABLE "plant"
(
 "id"           int NOT NULL,
 "name"         varchar(50) NOT NULL,
 "age"          int NOT NULL,
 "size"         decimal NOT NULL,
 "alive"        boolean NOT NULL,
 "specie_id"    int NOT NULL,
 CONSTRAINT "PK_plant" PRIMARY KEY ( "id" ),
 CONSTRAINT "FK_45" FOREIGN KEY ( "specie_id" ) REFERENCES "species" ( "id" )
);

CREATE INDEX "fkIdx_45" ON "plant"
(
 "specie_id"
);

-- ************************************** "water_log"

CREATE TABLE "public"."events_log"
(
 "event_timestamp" timestamp NOT NULL,
 "plant_id"        int NOT NULL,
 "event_type"      varchar(50) NOT NULL,
 "water_ammount"   int NOT NULL,
 CONSTRAINT "PK_water_log" PRIMARY KEY ( "event_timestamp", "plant_id" ),
 CONSTRAINT "FK_46" FOREIGN KEY ( "plant_id" ) REFERENCES "public"."plant" ( "id" )
);

CREATE INDEX "fkIdx_46" ON "public"."events_log"
(
 "plant_id"
);

