package com.google.gson.FieldNamingPolicy$2;
import com.google.gson.FieldNamingPolicy;
import java.lang.String;
import com.google.gson.FieldNamingPolicy$1;
import java.lang.reflect.Field;

public final class FieldNamingPolicy$2 extends FieldNamingPolicy	// class@000547
{

    public void FieldNamingPolicy$2(String p0,int p1){
       super(p0, p1, null);
    }
    public String translateName(Field p0){
       return FieldNamingPolicy.upperCaseFirstLetter(p0.getName());
    }
}
