databaseChangeLog = {

    changeSet(author: "mkotova (generated)", id: "1465270007007-1") {
        createTable(tableName: "QUOTE") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT(19)") {
                constraints(primaryKey: "true", primaryKeyName: "QUOTEPK")
            }

            column(name: "VERSION", type: "BIGINT(19)") {
                constraints(nullable: "false")
            }

            column(name: "TEXT", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }
    include file: 'week-5A.groovy'
}
