package com.kwai.emotionsdk.core.c;
import erd.r;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionPackage;

public final class c implements r	// class@000d92
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (p0 != null && EmotionPackage.EMPTY_PKG != p0)? true: false;
       return b;
    }
}
