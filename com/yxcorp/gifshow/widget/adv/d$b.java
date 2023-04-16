package com.yxcorp.gifshow.widget.adv.d$b;
import com.yxcorp.gifshow.widget.adv.model.TextBubbleConfig$ScaleMode;
import java.lang.Enum;

public class d$b	// class@00191d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TextBubbleConfig$ScaleMode.values().length];
       try{
          d$b.a = ointArray;
          ointArray[TextBubbleConfig$ScaleMode.NONE.ordinal()] = 1;
          try{
             d$b.a[TextBubbleConfig$ScaleMode.HORIZONTAL.ordinal()] = 2;
             try{
                d$b.a[TextBubbleConfig$ScaleMode.VERTICAL.ordinal()] = 3;
                try{
                   d$b.a[TextBubbleConfig$ScaleMode.BOTH.ordinal()] = 4;
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
