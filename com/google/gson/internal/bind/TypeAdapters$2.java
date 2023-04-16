package com.google.gson.internal.bind.TypeAdapters$2;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.util.BitSet;
import com.google.gson.stream.JsonToken;
import com.google.gson.internal.bind.TypeAdapters$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Integer;
import com.google.gson.JsonSyntaxException;
import java.lang.StringBuilder;
import com.google.gson.stream.b;

public class TypeAdapters$2 extends TypeAdapter	// class@0005a0
{

    public void TypeAdapters$2(){
       super();
    }
    public Object read(a p0){
       BitSet uBitSet = new BitSet();
       p0.a();
       JsonToken jsonToken = p0.J();
       int i = 0;
       while (true) {
          if (jsonToken != JsonToken.END_ARRAY) {
             int i1 = TypeAdapters$a.a[jsonToken.ordinal()];
             boolean b = true;
             if (i1 != b) {
                if (i1 != 2) {
                   if (i1 == 3) {
                      String str = p0.E();
                      try{
                         if (!Integer.parseInt(str)) {
                         label_0068 :
                            b = false;
                         }
                      }catch(java.lang.NumberFormatException e0){
                         throw new JsonSyntaxException("Error: Expecting: bitset number value \(1, 0\), Found: "+Integer.parseInt(str));
                      }
                   }else {
                      break ;
                   }
                }else {
                   b = p0.s();
                }
             }else if(p0.v()){
             }
             if (b) {
                uBitSet.set(i);
             }
             i = i + 1;
             jsonToken = p0.J();
          }else {
             p0.g();
             return uBitSet;
          }
       }
       throw new JsonSyntaxException("Invalid bitset value type: "+jsonToken);
    }
    public void write(b p0,Object p1){
       p0.c();
       int i = p1.length();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          p0.K((long)p1.get(i1));
       }
       p0.g();
       return;
    }
}
