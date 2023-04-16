package com.google.gson.internal.bind.TypeAdapters$25;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import java.util.Currency;
import com.google.gson.stream.b;

public class TypeAdapters$25 extends TypeAdapter	// class@00059a
{

    public void TypeAdapters$25(){
       super();
    }
    public Object read(a p0){
       return Currency.getInstance(p0.E());
    }
    public void write(b p0,Object p1){
       p0.O(p1.getCurrencyCode());
    }
}
