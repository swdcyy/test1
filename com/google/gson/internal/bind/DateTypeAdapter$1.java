package com.google.gson.internal.bind.DateTypeAdapter$1;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.util.Date;
import com.google.gson.internal.bind.DateTypeAdapter;

public class DateTypeAdapter$1 implements j	// class@000577
{

    public void DateTypeAdapter$1(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       DateTypeAdapter uDateTypeAda = (p1.getRawType() == Date.class)? new DateTypeAdapter(): null;
       return uDateTypeAda;
    }
}
