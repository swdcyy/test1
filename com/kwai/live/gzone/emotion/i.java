package com.kwai.live.gzone.emotion.i;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.kwai.live.gzone.emotion.f$b;

public final class i implements Comparator	// class@000ce2
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (int)(p1.mPayTime - p0.mPayTime);
    }
}
