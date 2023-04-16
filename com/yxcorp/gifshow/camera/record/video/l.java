package com.yxcorp.gifshow.camera.record.video.l;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.video.n;
import java.lang.Object;
import android.widget.ImageView;
import oh9.i0;
import android.view.View$OnClickListener;
import oh9.k0;
import com.yxcorp.gifshow.camera.record.widget.RecordButton$c;
import com.yxcorp.gifshow.camera.record.widget.RecordButton;
import com.yxcorp.gifshow.camera.record.base.d;
import wd9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import oh9.l0;
import com.yxcorp.gifshow.widget.record.BaseRecordButton$b;
import com.yxcorp.gifshow.widget.record.BaseRecordButton;

public final class l implements Runnable	// class@000f8b
{
    public final n b;

    public void l(n p0){
       this.b = p0;
    }
    public final void run(){
       l tb = this.b;
       if (tb.v == null) {
          n u = tb.u;
          if (u != null) {
             u.setVisibility(4);
             tb.u.setOnClickListener(new i0(tb));
          }
       }
       tb.o.setOnTouchCallback(new k0(tb));
       if (tb.d.d(a.i).a != null) {
          tb.o.E = true;
       }else {
          tb.o.b(new l0(tb));
       }
       return;
    }
}
