package com.yxcorp.gifshow.v3.editor.effect.model.a;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.effect.model.AEEffectConfig$a;
import java.lang.Math;

public final class a implements Comparator	// class@000f21
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       float f = (((float)p0.mWidth * 0x3f800000) / (float)p0.mHeight) - (((float)p1.mWidth * 0x3f800000) / (float)p1.mHeight);
       double d = (f >= 0)? Math.ceil((double)f): Math.floor((double)f);
       return (int)d;
    }
}
