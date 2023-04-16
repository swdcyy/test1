package com.google.gson.FieldNamingPolicy$3;
import com.google.gson.FieldNamingPolicy;
import java.lang.String;
import com.google.gson.FieldNamingPolicy$1;
import java.lang.reflect.Field;

public final class FieldNamingPolicy$3 extends FieldNamingPolicy	// class@000548
{

    public void FieldNamingPolicy$3(String p0,int p1){
       super(p0, p1, null);
    }
    public String translateName(Field p0){
       return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(p0.getName(), " "));
    }
}
