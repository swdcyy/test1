package com.horcrux.svg.SVGLength$1;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;

public class SVGLength$1	// class@0005f0
{
    public static final int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

    static {
       int[] ointArray = new int[ReadableType.values().length];
       try{
          SVGLength$1.$SwitchMap$com$facebook$react$bridge$ReadableType = ointArray;
          ointArray[ReadableType.Number.ordinal()] = 1;
          try{
             SVGLength$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
             try{
                SVGLength$1.$SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
