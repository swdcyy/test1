package com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import p91.m;
import iy1.g;
import android.view.View;
import android.content.Context;
import jt5.b;
import ba2.r;
import ry1.b;
import jv1.b;
import x67.j;
import java.lang.Object;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$b;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$c;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$d;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$e;
import fa2.a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewParent;
import android.view.ViewGroup;
import ba2.p;

public class a	// class@000c43
{
    public final View a;
    public final m b;
    public g c;
    public final Context d;
    public final b e;
    public final r f;
    public final b g;
    public final b h;
    public final j i;
    public b j;
    public boolean k;
    public long l;
    public int m;
    public LiveHourlyRankStrengthNoticeView n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public final Object s;
    public final Runnable t;
    public final Runnable u;
    public final g v;
    public final p w;
    public final c x;
    public final g y;

    public void a(m p0,g p1,View p2,Context p3,b p4,r p5,b p6,b p7,j p8){
       super();
       this.k = false;
       this.l = 0;
       this.m = 1;
       this.o = -1;
       this.p = 0;
       this.q = -1;
       this.r = false;
       this.s = new Object();
       this.t = new a$a(this);
       this.u = new a$b(this);
       this.v = new a$c(this);
       this.w = new a$d(this);
       this.x = new a$e(this);
       this.y = new a(this);
       this.b = p0;
       this.c = p1;
       this.a = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public void a(LiveHourlyRankStrengthNoticeView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.topMargin = 0;
          int i = (this.b() > 0)? this.b(): a1.d(R.dimen.arg_RES_7f07034b);
          layoutParams.leftMargin = i;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public int b(){
       a obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.f;
       if (obj != null) {
          return obj.b();
       }
       return 0;
    }
    public void c(LiveHourlyRankStrengthNoticeView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       b.P(LiveLogTag.HOURLY_RANK.appendTag("LiveHourlyRankStrengthNoticeController"), "hideStrengthView hourlyRankStrength");
       p0.setVisibility(8);
       p0.e();
       this.k = false;
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(p0);
       }
       a tf = this.f;
       if (tf != null) {
          tf.e(this.w);
       }
       return;
    }
}
