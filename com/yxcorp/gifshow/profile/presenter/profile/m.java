package com.yxcorp.gifshow.profile.presenter.profile.m;
import n3d.a;
import com.yxcorp.gifshow.profile.presenter.profile.u;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ekd.k1;
import j4c.o;
import java.lang.Runnable;

public final class m implements a	// class@001562
{
    public final u b;

    public void m(u p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(u.class) && (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, tb, u.class, "9") && (p0 == 100 && tb.y == null))) {
          boolean b = false;
          if (p2 != null) {
             b = p2.getBooleanExtra("CLOSED_TOP_COIN_BANNER", b);
          }
          if (k1.g()) {
             tb.P8(b);
          }else {
             k1.o(new o(tb, b));
          }
       }
    label_0045 :
       return;
    }
}
