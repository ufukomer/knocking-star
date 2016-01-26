package com.knockingstar.cofiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Ömer Ufuk Efendioglu
 */
@ConfigurationProperties(prefix = "hibernate",
        locations = "classpath:hibernate.properties")
public class HibernateProperties {

    private String dialect;
    private String showSql;
    private String hbm2ddl;
    private String packagesToScan;

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String getShowSql() {
        return showSql;
    }

    public void setShowSql(String showSql) {
        this.showSql = showSql;
    }

    public String getHbm2ddl() {
        return hbm2ddl;
    }

    public void setHbm2ddl(String hbm2ddl) {
        this.hbm2ddl = hbm2ddl;
    }

    public String getPackagesToScan() {
        return packagesToScan;
    }

    public void setPackagesToScan(String packagesToScan) {
        this.packagesToScan = packagesToScan;
    }
}
