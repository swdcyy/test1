package com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import nsd.u;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$Companion$LazyInstance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.lang.Boolean;
import e17.i;
import kzc.e;
import cg6.b;
import java.util.List;
import com.yxcorp.gifshow.widget.popup.c;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import kzc.c;
import com.kwai.library.widget.popup.bubble.a;

public final class SlideGuideManager	// class@000ef6
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public static final p l;
    public static final SlideGuideManager$a m;

    static {
       SlideGuideManager.m = new SlideGuideManager$a(null);
       SlideGuideManager.l = s.c(SlideGuideManager$Companion$LazyInstance$2.INSTANCE);
    }
    public void SlideGuideManager(){
       super();
    }
    public static final SlideGuideManager a(){
       Object obj = PatchProxy.apply(null, null, SlideGuideManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlideGuideManager.m.a();
    }
    public final boolean b(Activity p0){
       boolean b1;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideGuideManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null || (!this.c(p0) && !this.d(p0))) {
          p0 = PatchProxy.apply(null, this, SlideGuideManager.class, "3");
          if (p0 != PatchProxyResult.class) {
             b1 = p0.booleanValue();
          }else {
             i oi = i.l();
             b1 = (oi != null && oi.s())? true: false;
          }
          if (b1 || (this.c != null || (this.f != null || (this.g != null || (this.h != null || (this.b != null || (this.i != null || (this.j != null || (this.d == null && this.e == null))))))))) {
             b = false;
          }
       }
    label_006a :
       return b;
    }
    public final boolean c(Activity p0){
       boolean b;
       Object obj1;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideGuideManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       List list = b.b().l(p0);
       b = false;
       if (list != null) {
          a.o(list, "KwaiPopupManagerHolder.g\x20\x02\)\n        ?: return false\x00");
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj1 = iterator.next();
                Object obj2 = obj1;
                a.o(obj2, "it");
                if (!obj2.K()) {
                   continue ;
                }
             }else {
                obj1 = null;
             }
             if (obj1 != null) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public final boolean d(Activity p0){
       boolean b;
       Object obj1;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideGuideManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       List list = b.a().l(p0);
       b = false;
       if (list != null) {
          a.o(list, "KwaiPopupManagerHolder.g\x20\x02\)\n        ?: return false\x00");
          Iterator iterator = list.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj1 = iterator.next();
                Object obj2 = obj1;
                a.o(obj2, "it");
                if (!obj2.K()) {
                   continue ;
                }
             }else {
                obj1 = null;
             }
             if (obj1 != null) {
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public final void e(boolean p0){
       this.d = p0;
    }
    public final void f(boolean p0){
       this.b = p0;
    }
    public final void g(boolean p0){
       this.k = p0;
    }
}
