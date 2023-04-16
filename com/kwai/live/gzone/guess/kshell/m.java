package com.kwai.live.gzone.guess.kshell.m;
import y8c.g;
import android.app.Activity;
import com.kwai.live.gzone.guess.kshell.m$b;
import y8c.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import o57.b;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.kwai.live.gzone.guess.kshell.l;
import ml8.c;
import android.widget.TextView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import p57.o1;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import com.kwai.live.gzone.guess.kshell.m$a;

public class m extends g	// class@000d50
{
    public Activity w;
    public m$b x;

    public void m(Activity p0){
       super();
       this.w = p0;
       this.x = new m$b();
    }
    public f$b d1(f$b p0){
       return this.x;
    }
    public int f0(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       b uob = this.N0(p0);
       if (uob != null && uob.mIsFoot != null) {
          return 1;
       }else {
          return 0;
       }
    }
    public f h1(ViewGroup p0,int p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, om, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p1 != 1) {
          return new f(a.i(p0, 0x7f0d0b4b), new l());
       }else {
          TextView textView = PatchProxy.applyOneRefs(p0, this, om, "4");
          if (textView != patchProxyRe) {
          }else {
             textView = new TextView(p0.getContext());
             textView.setLayoutParams(new ViewGroup$LayoutParams(-1, a1.e(42.00f)));
             textView.setGravity(17);
             textView.setText(R.string.arg_RES_7f1022fe);
             textView.setTextColor(a1.a(R.color.arg_RES_7f061454));
          }
          return new f(textView, new o1());
       }
    }
    public void r1(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "1")) {
          return;
       }
       this.W0(new ArrayList(p0));
       p0.i = p1;
       return;
    }
    public void s1(m$a p0){
       this.x.h = p0;
    }
}
