package com.kuaishou.live.core.show.redpacket.widget.a;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$c;
import java.util.Objects;
import android.view.View;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ProgressBar;

public class a extends CountDownTimer	// class@000fc3
{
    public final LiveRedPackSnatchView a;

    public void a(LiveRedPackSnatchView p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a.f();
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, a.class, "1")) {
          return;
       }
       long l = (p0 + 1000) / 1000;
       a ta = this.a;
       if (ta.j != null && (ta.getTag() == null || this.a.getTag().longValue() - l)) {
          this.a.setTag(Long.valueOf(l));
          this.a.j.c(l);
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LiveRedPackSnatchView.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), ta, LiveRedPackSnatchView.class, "13")) {
          int i = 0;
          if (l - 60 >= 0) {
             ta.j(ta.g, i);
             ta.j(ta.e, 8);
             ta.f.setText(a1.r(R.string.arg_RES_7f103824, String.valueOf(((int)l / 60))));
          }else {
             ta.j(ta.g, 8);
             ta.j(ta.e, i);
             ta.e.setText(String.valueOf(l));
          }
       }
       this.a.c.setProgress((int)p0);
       return;
    }
}
