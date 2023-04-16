package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;

public class PersistentStorage$a	// class@00114d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsonToken.values().length];
       try{
          PersistentStorage$a.a = ointArray;
          ointArray[JsonToken.BOOLEAN.ordinal()] = 1;
          try{
             PersistentStorage$a.a[JsonToken.NULL.ordinal()] = 2;
             try{
                PersistentStorage$a.a[JsonToken.NUMBER.ordinal()] = 3;
                try{
                   PersistentStorage$a.a[JsonToken.STRING.ordinal()] = 4;
                   try{
                      PersistentStorage$a.a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
