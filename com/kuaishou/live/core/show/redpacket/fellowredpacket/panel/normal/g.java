package com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.g;
import erd.g;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.h;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.LiveFellowRedPacketPanelFragment;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveGiftPackage;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.model.LiveFellowRedPacketListResponse;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pm8.a;
import zg2.g;
import u07.t$a;
import android.app.Activity;
import u07.f;
import xg2.k;
import u07.u;
import xg2.j;
import com.kwai.library.widget.popup.common.c$b;
import xg2.t;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import com.kuaishou.live.core.show.redpacket.fellowredpacket.panel.normal.h$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import android.os.SystemClock;
import k2b.e0;
import java.lang.Throwable;
import com.google.gson.JsonElement;

public final class g implements g	// class@000eaf
{
    public final h b;
    public final boolean c;
    public final LiveFellowRedPacketPanelFragment d;
    public final LiveGiftPackage e;
    public final int f;
    public final long g;
    public final int h;

    public void g(h p0,boolean p1,LiveFellowRedPacketPanelFragment p2,LiveGiftPackage p3,int p4,long p5,int p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g td = this.d;
       g te = this.e;
       g tf = this.f;
       g tg = this.g;
       g th = this.h;
       if (tb.g(this.c)) {
          tb.b();
          s.h(a1.p(R.string.arg_RES_7f1021e0));
       }else {
          td.a();
          p0 = td.getActivity();
          if (!PatchProxy.applyVoidOneRefs(p0, tb, h.class, "9") && (p0 != null && a.o())) {
             h j = tb.j;
             String str = (j != null && j.f())? a1.p(R.string.arg_RES_7f102c58): a1.p(R.string.arg_RES_7f102c5c);
             p0 = f.e(new t$a(p0));
             p0.X0(a1.p(R.string.arg_RES_7f102c5d));
             p0.z0(str);
             p0.T0(a1.p(R.string.arg_RES_7f102c5b));
             p0.Q0(R.string.arg_RES_7f102c5a);
             p0.u0(new k(tb));
             p0.t0(new j(tb));
             p0.v(true);
             boolean b = false;
             p0.A(b);
             p0.Y(new t(tb));
             p0 = a.a.edit();
             p0.putBoolean("isFirstShowRedPacketSuccessDialog", b);
             g.a(p0);
          }
       }
       d.a(0x630bc993).d1().f();
       tb.f(te.mGiftPackageId);
       p0 = tb.i;
       if (p0 != null) {
          p0.a();
       }
       tb.d(tb.b.b(), tf, te, 1, 0, (SystemClock.elapsedRealtime() - tg), th, tb.h);
       return;
    }
}
