package com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.f;
import erd.g;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaishanSegmentVideoEditFragment;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import grc.l;
import java.lang.Runnable;
import android.os.Handler;

public final class f implements g	// class@001021
{
    public final KuaishanSegmentVideoEditFragment b;
    public final QMedia c;
    public final QMedia d;
    public final float[] e;

    public void f(KuaishanSegmentVideoEditFragment p0,QMedia p1,QMedia p2,float[] p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       Objects.requireNonNull(tb);
       if (p0.intValue() == 100) {
          tb.s = true;
          if (tb.u == null) {
             tb.u = new l(tb, tc, td, te);
          }
          tb.t.postDelayed(tb.u, 100);
       }
       return;
    }
}
