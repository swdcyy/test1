package com.kwaishou.merchant.daccore.data.model.DataSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DataSource extends Enum	// class@001316
{
    public int source;
    public static final DataSource[] $VALUES;
    public static final DataSource ENTER_MATERIAL;
    public static final DataSource MATERIAL;
    public static final DataSource NONE;
    public static final DataSource PAGE_AGGREMENT;
    public static final DataSource PAGE_BACK_DATA;
    public static final DataSource ROUTER;
    public static final DataSource SIGNAL;

    static {
       DataSource uDataSource;
       DataSource[] uDataSourceA = new DataSource[]{uDataSource,uDataSource,uDataSource,uDataSource,uDataSource,uDataSource,uDataSource};
       uDataSource = new DataSource("NONE", 0, 0);
       DataSource.NONE = uDataSource;
       uDataSource = new DataSource("SIGNAL", 1, 1);
       DataSource.SIGNAL = uDataSource;
       uDataSource = new DataSource("ENTER_MATERIAL", 2, 2);
       DataSource.ENTER_MATERIAL = uDataSource;
       uDataSource = new DataSource("MATERIAL", 3, 3);
       DataSource.MATERIAL = uDataSource;
       uDataSource = new DataSource("PAGE_AGGREMENT", 4, 4);
       DataSource.PAGE_AGGREMENT = uDataSource;
       uDataSource = new DataSource("ROUTER", 5, 5);
       DataSource.ROUTER = uDataSource;
       uDataSource = new DataSource("PAGE_BACK_DATA", 6, 6);
       DataSource.PAGE_BACK_DATA = uDataSource;
       DataSource.$VALUES = uDataSourceA;
    }
    public void DataSource(String p0,int p1,int p2){
       super(p0, p1);
       this.source = p2;
    }
    public static DataSource valueOf(String p0){
       return Enum.valueOf(DataSource.class, p0);
    }
    public static DataSource[] values(){
       return DataSource.$VALUES.clone();
    }
    public final int getSource(){
       return this.source;
    }
    public final void setSource(int p0){
       this.source = p0;
    }
}
