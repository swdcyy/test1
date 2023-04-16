package com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption$Level;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class KwaiBubbleOption	// class@00199f
{
    public final KwaiBubbleOption$Level a;
    public final int b;
    public final Object c;
    public static final KwaiBubbleOption d;
    public static final KwaiBubbleOption e;
    public static final KwaiBubbleOption f;
    public static final KwaiBubbleOption g;

    static {
       KwaiBubbleOption.d = new KwaiBubbleOption(KwaiBubbleOption$Level.LEVEL_S, Integer.MAX_VALUE);
       KwaiBubbleOption.e = new KwaiBubbleOption(KwaiBubbleOption$Level.LEVEL_1, 0);
       KwaiBubbleOption.f = new KwaiBubbleOption(KwaiBubbleOption$Level.LEVEL_2, Integer.MAX_VALUE);
       KwaiBubbleOption.g = new KwaiBubbleOption(KwaiBubbleOption$Level.LEVEL_3, Integer.MAX_VALUE);
    }
    public void KwaiBubbleOption(KwaiBubbleOption$Level p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = null;
    }
    public String toString(){
       return "KwaiBubbleOption{mLevel="+this.a+", mPriority="+this.b+", mExtra="+this.c+'}';
    }
}
