package com.google.gson.FieldNamingPolicy$5;
import com.google.gson.FieldNamingPolicy;
import java.lang.String;
import com.google.gson.FieldNamingPolicy$1;
import java.lang.reflect.Field;
import java.util.Locale;

public final class FieldNamingPolicy$5 extends FieldNamingPolicy	// class@00054a
{

    public void FieldNamingPolicy$5(String p0,int p1){
       super(p0, p1, null);
    }
    public String translateName(Field p0){
       return (FieldNamingPolicy.separateCamelCase(p0.getName(), "-")).toLowerCase(Locale.ENGLISH);
    }
}
