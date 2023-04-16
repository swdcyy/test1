package com.horcrux.svg.RNSVGMarkerPosition$1;
import com.horcrux.svg.ElementType;
import java.lang.Enum;
import com.horcrux.svg.RNSVGMarkerType;

public class RNSVGMarkerPosition$1	// class@0005b7
{
    public static final int[] $SwitchMap$com$horcrux$svg$ElementType;
    public static final int[] $SwitchMap$com$horcrux$svg$RNSVGMarkerType;

    static {
       int[] ointArray = new int[ElementType.values().length];
       RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$ElementType = ointArray;
       try{
          int i = 1;
          ointArray[ElementType.kCGPathElementAddCurveToPoint.ordinal()] = i;
          int i1 = 2;
          try{
             RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$ElementType[ElementType.kCGPathElementAddQuadCurveToPoint.ordinal()] = i1;
             int i2 = 3;
             try{
                RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$ElementType[ElementType.kCGPathElementMoveToPoint.ordinal()] = i2;
                try{
                   RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$ElementType[ElementType.kCGPathElementAddLineToPoint.ordinal()] = 4;
                   try{
                      RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$ElementType[ElementType.kCGPathElementCloseSubpath.ordinal()] = 5;
                      int[] ointArray1 = new int[RNSVGMarkerType.values().length];
                      try{
                         RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType = ointArray1;
                         ointArray1[RNSVGMarkerType.kStartMarker.ordinal()] = i;
                         try{
                            RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType[RNSVGMarkerType.kMidMarker.ordinal()] = e0;
                            try{
                               RNSVGMarkerPosition$1.$SwitchMap$com$horcrux$svg$RNSVGMarkerType[RNSVGMarkerType.kEndMarker.ordinal()] = i2;
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
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
