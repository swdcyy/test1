package com.yxcorp.gifshow.relation.friend.reduce.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.friend.reduce.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import ekd.p0;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import androidx.fragment.app.Fragment;
import qa9.s;
import java.lang.Boolean;
import z1.a;
import uac.m;
import com.kwai.framework.model.feed.BaseFeed;

public class b$a extends m	// class@0018cf
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       b s;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       boolean b = true;
       if (!p0.C(this.c.getActivity())) {
          i.f(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1038e7), b);
          s.b(this.c.p);
          s = this.c.s;
          if (s != null) {
             s.accept(Boolean.FALSE);
          }
          return;
       }else {
          b$a tc = this.c;
          tc.v = b;
          s.b(tc.p);
          tc = this.c;
          b r = tc.r;
          b t = tc.t;
          String str = tc.W8();
          if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(r, Boolean.valueOf(t), str, null, m.class, "2")) {
             m.a("confirm", r, t, str);
          }
          tc = this.c;
          tc.X8(tc.s);
          return;
       }
    }
}
