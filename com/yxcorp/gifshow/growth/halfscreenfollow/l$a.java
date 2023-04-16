package com.yxcorp.gifshow.growth.halfscreenfollow.l$a;
import qoa.b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import o07.o;
import qoa.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tna.j;
import java.lang.Integer;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import java.lang.StringBuilder;
import java.lang.System;
import oe6.g;
import tna.a;
import wkd.b;
import tna.h;
import java.util.Objects;
import lnc.u1;

public class l$a implements b	// class@001392
{
    public final int b;

    public void l$a(int p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void M(int p0){
       a.b(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void U(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, l$a.class, str)) {
          return;
       }
       l$a tb = this.b;
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tb), objArray, oj, str)) {
          g.a(n.b().edit().putBoolean("PREF_KEY_FOLLOW_DIALOG_GUIDE_SHOW"+tb, true).putLong("PREF_KEY_FOLLOW_DIALOG_GUIDE_SHOW_TIME", System.currentTimeMillis()));
       }
       if (!a.c() && this.b == 4) {
          h oh = b.a(0x3091e11c);
          Objects.requireNonNull(oh);
          if (!PatchProxy.applyVoid(objArray, oh, h.class, "3")) {
             u1.b(oh);
          }
       }
       return;
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
    public void s(){
       a.a(this);
    }
}
