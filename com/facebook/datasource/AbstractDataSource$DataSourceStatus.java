package com.facebook.datasource.AbstractDataSource$DataSourceStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AbstractDataSource$DataSourceStatus extends Enum	// class@001075
{
    public static final AbstractDataSource$DataSourceStatus[] $VALUES;
    public static final AbstractDataSource$DataSourceStatus FAILURE;
    public static final AbstractDataSource$DataSourceStatus IN_PROGRESS;
    public static final AbstractDataSource$DataSourceStatus SUCCESS;

    static {
       AbstractDataSource$DataSourceStatus uDataSourceS = new AbstractDataSource$DataSourceStatus("IN_PROGRESS", 0);
       AbstractDataSource$DataSourceStatus.IN_PROGRESS = uDataSourceS;
       AbstractDataSource$DataSourceStatus uDataSourceS1 = new AbstractDataSource$DataSourceStatus("SUCCESS", 1);
       AbstractDataSource$DataSourceStatus.SUCCESS = uDataSourceS1;
       AbstractDataSource$DataSourceStatus uDataSourceS2 = new AbstractDataSource$DataSourceStatus("FAILURE", 2);
       AbstractDataSource$DataSourceStatus.FAILURE = uDataSourceS2;
       AbstractDataSource$DataSourceStatus[] uDataSourceS3 = new AbstractDataSource$DataSourceStatus[]{uDataSourceS,uDataSourceS1,uDataSourceS2};
       AbstractDataSource$DataSourceStatus.$VALUES = uDataSourceS3;
    }
    public void AbstractDataSource$DataSourceStatus(String p0,int p1){
       super(p0, p1);
    }
    public static AbstractDataSource$DataSourceStatus valueOf(String p0){
       return Enum.valueOf(AbstractDataSource$DataSourceStatus.class, p0);
    }
    public static AbstractDataSource$DataSourceStatus[] values(){
       return AbstractDataSource$DataSourceStatus.$VALUES.clone();
    }
}
