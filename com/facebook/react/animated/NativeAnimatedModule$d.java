package com.facebook.react.animated.NativeAnimatedModule$d;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import sd.l;

public class NativeAnimatedModule$d implements NativeAnimatedModule$v	// class@001183
{
    public final int a;
    public final int b;
    public final ReadableMap c;
    public final Callback d;
    public final NativeAnimatedModule e;

    public void NativeAnimatedModule$d(NativeAnimatedModule p0,int p1,int p2,ReadableMap p3,Callback p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(l p0){
       p0.d(this.a, this.b, this.c, this.d);
    }
}
