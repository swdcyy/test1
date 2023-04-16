package com.google.gson.FieldNamingPolicy$6;
import com.google.gson.FieldNamingPolicy;
import java.lang.String;
import com.google.gson.FieldNamingPolicy$1;
import java.lang.reflect.Field;
import java.util.Locale;

public final class FieldNamingPolicy$6 extends FieldNamingPolicy	// class@00054b
{

    public void FieldNamingPolicy$6(String p0,int p1){
       super(p0, p1, null);
    }
    public String translateName(Field p0){
       return (FieldNamingPolicy.separateCamelCase(p0.getName(), ".")).toLowerCase(Locale.ENGLISH);
    }
}
