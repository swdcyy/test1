package com.kwai.video.ksmodelmanager.ModelRepo$1;
import com.kwai.video.ksmodelmanager.CachePolicy;
import java.lang.Enum;

public class ModelRepo$1	// class@00090f
{
    public static final int[] $SwitchMap$com$kwai$video$ksmodelmanager$CachePolicy;

    static {
       int[] ointArray = new int[CachePolicy.values().length];
       try{
          ModelRepo$1.$SwitchMap$com$kwai$video$ksmodelmanager$CachePolicy = ointArray;
          ointArray[CachePolicy.ANY.ordinal()] = 1;
          try{
             ModelRepo$1.$SwitchMap$com$kwai$video$ksmodelmanager$CachePolicy[CachePolicy.EQUAL.ordinal()] = 2;
             try{
                ModelRepo$1.$SwitchMap$com$kwai$video$ksmodelmanager$CachePolicy[CachePolicy.LESS_OR_EQUAL.ordinal()] = 3;
                try{
                   ModelRepo$1.$SwitchMap$com$kwai$video$ksmodelmanager$CachePolicy[CachePolicy.GREATER_OR_EQUAL.ordinal()] = 4;
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
