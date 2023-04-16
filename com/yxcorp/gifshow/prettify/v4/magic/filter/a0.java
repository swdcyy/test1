package com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$b;
import nsd.u;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$d;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$f;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$c;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$h;

public abstract class a0	// class@0011b6
{
    public final int a;
    public static final a0$b b;

    static {
       a0.b = new a0$b(null);
    }
    public void a0(int p0){
       super();
       this.a = p0;
    }
    public void a0(int p0,u p1){
       super(p0);
    }
    public static final boolean g(a0 p0,a0 p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a0$b obj = PatchProxy.applyTwoRefs(p0, p1, null, a0.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = a0.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, a0$b.class, "2");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "old");
          a.p(p1, "new");
          v0 = p0 instanceof a0$d;
          if (patchProxyRe && p1 instanceof a0$d) {
             b = true;
          }else if(patchProxyRe && (!p1 instanceof a0$d || (!patchProxyRe && p1 instanceof a0$d))){
             b = false;
          }else {
             b = a.g(p0.getClass().getName(), p1.getClass().getName());
          }
       }
       return b;
    }
    public static final a0$f h(){
       Object obj = PatchProxy.apply(null, null, a0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(a0.b);
       return a0$f.c;
    }
    public static final a0$d i(){
       Object obj = PatchProxy.apply(null, null, a0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a0.b.a();
    }
    public final int a(){
       return this.a;
    }
    public final boolean b(){
       return this instanceof a0$a;
    }
    public final boolean c(){
       return this instanceof a0$c;
    }
    public final boolean d(){
       return this instanceof a0$f;
    }
    public final boolean e(){
       return this instanceof a0$d;
    }
    public final boolean f(){
       return this instanceof a0$h;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, a0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getClass().getSimpleName();
       a.o(obj, "javaClass.simpleName");
       return obj;
    }
}
