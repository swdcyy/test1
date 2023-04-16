package com.yxcorp.gifshow.growth.push.permission.PushPermissionManager$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.growth.push.permission.PushPermissionManager;
import iqa.b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cra.w;
import q87.c;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Set;
import java.lang.Integer;
import o07.o;

public final class PushPermissionManager$f implements PopupInterface$h	// class@0014b0
{
    public final PushPermissionManager b;
    public final b c;

    public void PushPermissionManager$f(PushPermissionManager p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushPermissionManager$f.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       Object[] objArray = new Object[0];
       w.C().w("PushPermissionManager", "dialog onshow", objArray);
       Iterator iterator = this.b.i.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().c().clear();
       }
       this.b.h(11, true);
       PushPermissionManager$f tc = this.c;
       if (tc != null) {
          tc.g(true);
       }
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(PushPermissionManager$f.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PushPermissionManager$f.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       PushPermissionManager$f tc = this.c;
       if (tc != null) {
          tc.g(false);
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
