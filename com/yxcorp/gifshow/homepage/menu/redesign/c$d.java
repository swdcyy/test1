package com.yxcorp.gifshow.homepage.menu.redesign.c$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.homepage.menu.redesign.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.m;
import tra.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import nc5.i;
import xl8.b;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class c$d extends m	// class@001781
{
    public final c c;

    public void c$d(c p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       c u;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       if (!this.c.u.getVisibility()) {
          u = this.c.u;
          if (!PatchProxy.applyVoidOneRefs(u, null, m.class, "28")) {
             m.g(true, u);
          }
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("home_sidebar_v3_more_red_dot_shown", true);
          g.a(uEditor);
       }
       i.b(1107, this.c.getActivity());
       u = this.c.N;
       u.d(Boolean.valueOf((u.a().booleanValue() ^ true)));
       this.c.P8();
       c$d tc = this.c;
       String str = (tc.N.a().booleanValue())? "UNFOLD": "CLOSE";
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(str, tc, c.class, "12")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "UNFOLD_MORE_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("click_type", str);
          uElementPack.params = oi3.toString();
          u1.u(true, uElementPack, null);
       }
       this.c.R8();
       return;
    }
}
