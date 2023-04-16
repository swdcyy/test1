package com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.e;
import erd.g;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import java.lang.Object;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import p90.g;
import java.lang.Runnable;
import android.os.Handler;

public final class e implements g	// class@001ac3
{
    public final KuaishanVideoClipFragment b;

    public void e(KuaishanVideoClipFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       KuaishanVideoClipFragment m = tb.m;
       if (m != null && m.isAdded()) {
          tb.m.Nh(p0.intValue());
       }
       if (p0.intValue() == 100) {
          tb.v = true;
          if (tb.x == null) {
             tb.x = new g(tb);
          }
          tb.w.postDelayed(tb.x, 100);
       }
       return;
    }
}
