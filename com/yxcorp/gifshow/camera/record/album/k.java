package com.yxcorp.gifshow.camera.record.album.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.album.o;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import tg9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import sb9.q;
import ekd.k1;

public final class k implements Runnable	// class@001cba
{
    public final o b;

    public void k(o p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       if (tb.A != null) {
       }else if(tb.p != null){
          tb.d.j().addView(tb.p);
       }else {
          tb.d.j().addView(tb.q);
       }
       q oq = new q(tb);
       tb.E = oq;
       k1.r(oq, 1500);
       return;
    }
}
