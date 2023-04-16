package com.kuaishou.live.core.show.wishlist.sendgift.c$a;
import com.kuaishou.live.core.show.wishlist.sendgift.c$e;
import com.kuaishou.live.core.show.wishlist.sendgift.c;
import java.lang.Object;
import java.util.List;
import on2.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.wishlist.sendgift.b;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import ad5.a;
import crd.b;
import lnc.b9;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import sfc.a;

public class c$a implements c$e	// class@0012f6
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       this.a.z = p0;
    }
    public void b(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, c.class, "3")) {
          ta.I = p0;
          p0.d = new b(ta);
       }
       return;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$a.class, "2")) {
          return;
       }
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "6") && QCurrentUser.me().isLogined()) {
          b.a(0x4c90014d).l();
          b9.a(ta.A);
          ta.A = b.a(0x4c90014d).a().subscribe(Functions.d(), new a());
       }
       return;
    }
}
