package com.kuaishou.live.core.show.closepage.audience.basicinfo.b$b;
import androidx.fragment.app.c$b;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import crd.b;
import lnc.b9;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b$b extends c$b	// class@000a33
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "1")) {
          return;
       }
       this.a.p.setVisibility(4);
       this.a.r.setVisibility(4);
       b9.a(this.a.v);
       k1.m(this.a.C);
       b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenter"), " CountDown paused");
       return;
    }
}
