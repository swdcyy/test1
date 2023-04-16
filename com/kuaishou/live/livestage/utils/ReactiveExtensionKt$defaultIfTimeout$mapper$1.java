package com.kuaishou.live.livestage.utils.ReactiveExtensionKt$defaultIfTimeout$mapper$1;
import erd.o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Boolean;

public final class ReactiveExtensionKt$defaultIfTimeout$mapper$1 extends AtomicBoolean implements o	// class@000bfc
{
    public final Object $defaultValue;

    public void ReactiveExtensionKt$defaultIfTimeout$mapper$1(Object p0,boolean p1){
       this.$defaultValue = p0;
       super(p1);
    }
    public t apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactiveExtensionKt$defaultIfTimeout$mapper$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "t");
       boolean b = true;
       if (p0 == this) {
          p0 = (this.compareAndSet(false, b))? t.just(new Pair(Boolean.TRUE, this.$defaultValue)): t.empty();
          a.o(p0, "if \(this.compareAndSet\(f¡­ervable.empty\(\)\n        }");
       }else {
          this.set(b);
          p0 = t.just(new Pair(Boolean.FALSE, p0));
          a.o(p0, "Observable.just\(Pair\(false, t as T\)\)");
       }
       return p0;
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}
