package com.yxcorp.gifshow.activity.share.presenter.p1$a;
import lnc.o;
import com.yxcorp.gifshow.activity.share.presenter.p1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.activity.share.player.a;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import android.content.Context;
import androidx.core.content.ContextCompat;
import zf6.k;
import tkd.b;
import tkd.d;
import pca.d0;

public class p1$a extends o	// class@00141f
{
    public final p1 b;

    public void p1$a(p1 p0){
       this.b = p0;
       super();
    }
    public void b(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1$a.class, "2")) {
          return;
       }
       this.b.r.setVisibility(4);
       p1 s = this.b.s;
       if (s instanceof a) {
          s.j();
       }
       s = this.b.s;
       boolean b = true;
       if (s != null) {
          s.e(b);
       }
       p1$a tb = this.b;
       tb.e(ContextCompat.getColor(tb.q, R.color.arg_RES_7f06008d), (b ^ k.d()));
       d.a(0x66204fb9).resumeAll();
       tb = this.b;
       tb.a = 0;
       tb.b = 0;
       tb.c = 0x3f800000;
       tb.i = 0x3f800000;
       return;
    }
    public void c(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1$a.class, "1")) {
          return;
       }
       p1$a tb = this.b;
       if (tb.p != null && tb.n != null) {
          tb.q();
       }
       return;
    }
}
