package com.kuaishou.live.core.basic.activity.k0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader;
import rj3.a;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import rj3.d;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.content.Context;
import com.kuaishou.live.core.basic.activity.LivePlayerLoader$a;
import m02.p1;
import ekd.k1;

public final class k0 implements Runnable	// class@001841
{
    public final LivePlayerLoader b;
    public final a c;
    public final View d;

    public void k0(LivePlayerLoader p0,a p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       k0 tb = this.b;
       k0 td = this.d;
       Objects.requireNonNull(tb);
       LivePlayTextureView livePlayText = this.c.d().a();
       if (livePlayText == null) {
          livePlayText = new LivePlayTextureView(tb.g.requireContext());
       }
       tb.a(livePlayText);
       tb.g.h7(true);
       td.setBackgroundColor(0xff000000);
       k1.s(new p1(tb), tb, 50);
       return;
    }
}
