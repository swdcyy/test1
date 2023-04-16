package com.kuaishou.live.gzone.barrage.m;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.barrage.p;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import t02.a0;
import jv1.b;
import oq5.b;
import b53.m0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.CharSequence;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import z12.x;
import b53.u0;

public final class m implements View$OnClickListener	// class@001c40
{
    public final p b;
    public final TextView c;

    public void m(p p0,TextView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       m tb = this.b;
       m tc = this.c;
       p s = tb.s;
       if (s.p1 != null && !s.x.H2()) {
          tb.s.p1.d();
          k1.s(new m0(tb), tb, 0);
          String str = (tc.getText() == null)? "": tc.getText().toString();
          u0.e(str, tb.s.Z2.a(), x.p(tb.getActivity()));
       }
       return;
    }
}
