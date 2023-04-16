package com.gifshow.tuna.player.poi.a;
import android.view.View$OnClickListener;
import com.gifshow.tuna.player.poi.f;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import oj.l;
import brd.t;
import cjd.e;
import erd.o;
import com.gifshow.tuna.player.poi.d;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import nj.a;
import nj.g;
import k2b.e0;
import nj.b;
import oj.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a implements View$OnClickListener	// class@0015f0
{
    public final f b;
    public final boolean c;

    public void a(f p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a tc = this.c;
       String str = tb.e();
       if (!TextUtils.x(str)) {
          l ol = b.a(-1882797052);
          int i = (tc == null)? 1: -1;
          tb.c(ol.h(str, i, 3).map(new e()).subscribe(new d(tb, tc, str), e.b));
       }
       tb = tb.a;
       if (tb != null) {
          g a = tb.a;
          if (a != null) {
             e0 uoe0 = a.c();
             h oh = h.class;
             if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(uoe0, Boolean.valueOf(tc), null, oh, "2")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "COLLECT_BUTTON";
                i3 oi3 = i3.f();
                String str1 = (tc != null)? "CANCEL": "COLLECT";
                oi3.d("button_name", str1);
                uElementPack.params = oi3.e();
                u1.L("", uoe0, 1, uElementPack, null);
             }
          }
       }
       return;
    }
}
