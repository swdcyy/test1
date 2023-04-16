package com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import p91.m;
import iy1.g;
import android.view.View;
import android.content.Context;
import jt5.b;
import ba2.r;
import ry1.b;
import ry1.a;
import jv1.b;
import x67.j;
import java.lang.Object;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$b;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$c;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$d;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$e;
import crd.a;
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
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewParent;
import android.view.ViewGroup;
import ba2.p;

public class i	// class@000c52
{
    public final View a;
    public final m b;
    public final g c;
    public final Context d;
    public final b e;
    public final r f;
    public final b g;
    public final a h;
    public final b i;
    public final j j;
    public a k;
    public boolean l;
    public long m;
    public int n;
    public LiveHourlyRankStrengthNoticeView o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public final Object t;
    public final Runnable u;
    public final Runnable v;
    public final g w;
    public final p x;
    public final c y;

    public void i(m p0,g p1,View p2,Context p3,b p4,r p5,b p6,a p7,b p8,j p9){
       super();
       this.l = false;
       this.m = 0;
       this.n = 1;
       this.p = -1;
       this.q = 0;
       this.r = -1;
       this.s = false;
       this.t = new Object();
       this.u = new i$a(this);
       this.v = new i$b(this);
       this.w = new i$c(this);
       this.x = new i$d(this);
       this.y = new i$e(this);
       this.b = p0;
       this.c = p1;
       this.a = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = new a();
    }
    public void a(LiveHourlyRankStrengthNoticeView p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "7")) {
          return;
       }
       if (p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.topMargin = 0;
          i = (this.b() > 0)? this.b(): a1.d(R.dimen.arg_RES_7f07034b);
          layoutParams.leftMargin = i;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public int b(){
       i obj = PatchProxy.apply(null, this, i.class, "8");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "10")) {
          return;
       }
       b.Z(LiveLogTag.HOURLY_RANK, "hideStrengthView hourlyRankStrength");
       p0.setVisibility(8);
       p0.e();
       this.l = false;
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(p0);
       }
       i tf = this.f;
       if (tf != null) {
          tf.e(this.x);
       }
       return;
    }
}
