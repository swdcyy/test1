package com.kwai.live.gzone.emotion.module.a;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionInfo;

public final class a implements Comparator	// class@000cf1
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (int)(p1.mPayTime - p0.mPayTime);
    }
}
