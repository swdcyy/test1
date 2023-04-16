package com.google.gson.internal.bind.SqlDateTypeAdapter$1;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.sql.Date;
import com.google.gson.internal.bind.SqlDateTypeAdapter;

public class SqlDateTypeAdapter$1 implements j	// class@000582
{

    public void SqlDateTypeAdapter$1(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       SqlDateTypeAdapter sqlDateTypeA = (p1.getRawType() == Date.class)? new SqlDateTypeAdapter(): null;
       return sqlDateTypeA;
    }
}
