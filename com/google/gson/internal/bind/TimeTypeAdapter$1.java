package com.google.gson.internal.bind.TimeTypeAdapter$1;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.sql.Time;
import com.google.gson.internal.bind.TimeTypeAdapter;

public class TimeTypeAdapter$1 implements j	// class@000584
{

    public void TimeTypeAdapter$1(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       TimeTypeAdapter timeTypeAdap = (p1.getRawType() == Time.class)? new TimeTypeAdapter(): null;
       return timeTypeAdap;
    }
}
