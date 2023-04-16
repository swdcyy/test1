package com.horcrux.svg.TextLayoutAlgorithm$1;
import com.horcrux.svg.TextProperties$TextAnchor;
import java.lang.Enum;

public class TextLayoutAlgorithm$1	// class@000602
{
    public static final int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;

    static {
       int[] ointArray = new int[TextProperties$TextAnchor.values().length];
       try{
          TextLayoutAlgorithm$1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = ointArray;
          ointArray[TextProperties$TextAnchor.start.ordinal()] = 1;
          try{
             TextLayoutAlgorithm$1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties$TextAnchor.middle.ordinal()] = 2;
             try{
                TextLayoutAlgorithm$1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties$TextAnchor.end.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
