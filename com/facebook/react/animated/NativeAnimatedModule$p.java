package com.facebook.react.animated.NativeAnimatedModule$p;
import com.facebook.react.animated.NativeAnimatedModule$v;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import sd.l;
import android.util.SparseArray;
import java.lang.String;
import sd.o;
import sd.s;
import sd.m;
import com.facebook.react.bridge.UIManager;
import sd.i;
import sd.a;
import sd.p;
import sd.g;
import sd.k;
import sd.j;
import sd.f;
import sd.r;
import sd.q;
import sd.b;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;

public class NativeAnimatedModule$p implements NativeAnimatedModule$v	// class@00118f
{
    public final int a;
    public final ReadableMap b;
    public final NativeAnimatedModule c;

    public void NativeAnimatedModule$p(NativeAnimatedModule p0,int p1,ReadableMap p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(l p0){
       o oo;
       NativeAnimatedModule$p ta = this.a;
       NativeAnimatedModule$p tb = this.b;
       if (p0.a.get(ta) != null) {
          throw new JSApplicationIllegalArgumentException("Animated node with tag "+ta+" already exists");
       }
       String str = tb.getString("type");
       if (("style").equals(str)) {
          oo = new o(tb, p0);
       }else if(("value").equals(str)){
          oo = new s(tb);
       }else if(("props").equals(str)){
          oo = new m(tb, p0, p0.f);
       }else if(("interpolation").equals(str)){
          oo = new i(tb);
       }else if(("addition").equals(str)){
          oo = new a(tb, p0);
       }else if(("subtraction").equals(str)){
          oo = new p(tb, p0);
       }else if(("division").equals(str)){
          oo = new g(tb, p0);
       }else if(("multiplication").equals(str)){
          oo = new k(tb, p0);
       }else if(("modulus").equals(str)){
          oo = new j(tb, p0);
       }else if(("diffclamp").equals(str)){
          oo = new f(tb, p0);
       }else if(("transform").equals(str)){
          oo = new r(tb, p0);
       }else if(("tracking").equals(str)){
          oo = new q(tb, p0);
       }else {
          throw new JSApplicationIllegalArgumentException("Unsupported node type: "+str);
       }
       oo.d = ta;
       p0.a.put(ta, oo);
       p0.c.put(ta, oo);
       return;
    }
}
