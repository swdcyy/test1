package com.kuaishou.pagedy.container.component.DynamicNestListComponent$setupLoadMore$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ho4.h;
import iv.a;
import java.lang.String;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kuaishou.pagedy.container.adapter.DynamicComponentAdapter;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import su.g$a;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import kotlin.jvm.internal.a;
import su.g;
import com.kuaishou.pagedy.PageDy;
import androidx.fragment.app.Fragment;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.pagedy.container.component.DynamicNestListComponent$setupLoadMore$1$a;
import co4.d;

public final class DynamicNestListComponent$setupLoadMore$1 extends Lambda implements a	// class@000a54
{
    public final a $callerContext;
    public final Ref$ObjectRef $channelParams;
    public final DynamicComponentAdapter $dynamicComponentAdapter;
    public final String $loadMoreURL;
    public final h this$0;

    public void DynamicNestListComponent$setupLoadMore$1(h p0,a p1,String p2,Ref$ObjectRef p3,DynamicComponentAdapter p4){
       this.this$0 = p0;
       this.$callerContext = p1;
       this.$loadMoreURL = p2;
       this.$channelParams = p3;
       this.$dynamicComponentAdapter = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DynamicNestListComponent$setupLoadMore$1.class, "1")) {
          return;
       }
       g$a uoa = new g$a("", "", "");
       Map map = this.this$0.o();
       if (map != null) {
          uoa.k(true);
          DynamicNestListComponent$setupLoadMore$1 tthis$0 = this.this$0;
          DynamicNestListComponent$setupLoadMore$1 t$callerCont = this.$callerContext;
          if (t$callerCont != null) {
             objArray = t$callerCont.b("localApiParam");
          }
          tthis$0.l(map, objArray);
          DynamicNestListComponent$setupLoadMore$1 tthis$01 = this.this$0;
          Objects.requireNonNull(tthis$01);
          if (!PatchProxy.applyVoidOneRefs(map, tthis$01, h.class, "9")) {
             h d = tthis$01.d;
             if (d != null) {
                Set set = d.entrySet();
                if (set != null) {
                   Iterator iterator = set.iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      if (uEntry.getKey() instanceof String && uEntry.getValue() != null) {
                         Object value = uEntry.getValue();
                         a.m(value);
                         map.put(uEntry.getKey(), value);
                      }
                   }
                }
             }
          }
          uoa.u(map);
       }
       uoa.v(this.$loadMoreURL);
       PageDy.e().p(this.this$0.getCurFragment(), uoa.a(), new DynamicNestListComponent$setupLoadMore$1$a(this));
       return;
    }
}
