package com.yxcorp.gifshow.camera.record.frame.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.frame.l;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import com.yxcorp.gifshow.camera.record.base.d;
import tg9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camera.record.frame.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.c;

public final class i implements Runnable	// class@000de7
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final void run(){
       i tb = this.b;
       if (tb.z.z1()) {
          if (tb.r != null) {
             tb.d.j().addView(tb.r);
             d h = tb.h;
             if (h != null && h.M()) {
                tb.l2(true);
             }else {
                tb.l2(false);
             }
             tb.p2(tb.z.p1());
          }
          l s = tb.s;
          if (s != null) {
             s.setOnClickListener(new g(tb));
          }
       }
       tb.m2((tb.z.w1() ^ true));
       tb.v = false;
       tb.u.u(RecordBubbleItem.FRAME);
       return;
    }
}
