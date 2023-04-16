package com.horcrux.svg.RenderableView$1;
import com.horcrux.svg.RNSVGMarkerType;
import java.lang.Enum;

public class RenderableView$1	// class@0005bd
{
    public static final int[] $SwitchMap$com$horcrux$svg$RNSVGMarkerType;

    static {
       int[] ointArray = new int[RNSVGMarkerType.values().length];
       try{
          RenderableView$1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType = ointArray;
          ointArray[RNSVGMarkerType.kStartMarker.ordinal()] = 1;
          try{
             RenderableView$1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType[RNSVGMarkerType.kMidMarker.ordinal()] = 2;
             try{
                RenderableView$1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType[RNSVGMarkerType.kEndMarker.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
