package com.facebook.react.animated.NativeAnimatedModule$t;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;

public class NativeAnimatedModule$t implements NativeAnimatedModule$v	// class@001193
{
    public final int a;
    public final NativeAnimatedModule b;

    public void NativeAnimatedModule$t(NativeAnimatedModule p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(l p0){
       NativeAnimatedModule$t ta = this.a;
       p0.a.remove(ta);
       p0.c.remove(ta);
    }
}
