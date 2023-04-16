package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$m;
import android.os.Handler;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.Message;
import android.content.Context;
import android.widget.LinearLayout;
import android.app.Activity;
import e3a.a;
import ug1.g;
import msd.a;
import k51.b;

public class GiftAnimContainerView$m extends Handler	// class@001125
{
    public long a;
    public boolean b;
    public int c;
    public int d;
    public final GiftAnimContainerView e;

    public void GiftAnimContainerView$m(GiftAnimContainerView p0){
       this.e = p0;
       super();
       this.c = 0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView$m.class, "2")) {
          return;
       }
       if (this.d != null && this.b == null) {
          this.b = true;
          long l = System.currentTimeMillis();
          long l1 = 200;
          if ((l - this.a) - l1 > 0) {
             this.removeMessages(true);
             this.sendEmptyMessage(true);
          }else {
             this.removeMessages(true);
             this.sendEmptyMessageDelayed(true, (l1 - (l - this.a)));
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, GiftAnimContainerView$m.class, "3")) {
          return;
       }
       if (this.d != null && this.b == null) {
          this.removeMessages(1);
          this.sendEmptyMessageDelayed(1, 500);
       }
       return;
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView$m.class, "1")) {
          return;
       }
       Activity uActivity = a.b(this.e.getContext());
       if (uActivity != null && !uActivity.isFinishing()) {
          this.a = System.currentTimeMillis();
          this.b = false;
          b.b("GiftAnimContainerView.display", new g(this));
       }
       return;
    }
}
