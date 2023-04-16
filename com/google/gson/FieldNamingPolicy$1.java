package com.google.gson.FieldNamingPolicy$1;
import com.google.gson.FieldNamingPolicy;
import java.lang.String;
import java.lang.reflect.Field;

public final class FieldNamingPolicy$1 extends FieldNamingPolicy	// class@000546
{

    public void FieldNamingPolicy$1(String p0,int p1){
       super(p0, p1, null);
    }
    public String translateName(Field p0){
       return p0.getName();
    }
}
