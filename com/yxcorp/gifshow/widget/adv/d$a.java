package com.yxcorp.gifshow.widget.adv.d$a;
import android.os.Handler;
import com.yxcorp.gifshow.widget.adv.d;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d$a extends Handler	// class@00191c
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       if (p0.what == 1) {
          d$a ta = this.a;
          d e = ta.E;
          if (e != null && ta.D != null) {
             e.sendEmptyMessageDelayed(1, 500);
          }
       }
       return;
    }
}
