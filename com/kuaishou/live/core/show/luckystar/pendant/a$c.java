package com.kuaishou.live.core.show.luckystar.pendant.a$c;
import com.kuaishou.live.core.show.luckystar.pendant.a$b;
import android.content.Context;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.luckystar.pendant.LiveBaseLuckyStarPendantView;
import ks5.m;
import ks5.l;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Long;
import fc2.c;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import java.lang.Enum;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;
import ks5.i;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantView;
import android.widget.RelativeLayout;

public class a$c implements a$b	// class@000cf2
{
    public final Context a;
    public final View$OnClickListener b;
    public LiveBaseLuckyStarPendantView c;

    public void a$c(Context p0,View$OnClickListener p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public View b(ViewGroup p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a$c.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.t();
    }
    public boolean c(){
       return l.d(this);
    }
    public void d(ViewGroup p0){
       l.e(this, p0);
    }
    public void e(ViewGroup p0){
       l.f(this, p0);
    }
    public void f(long p0,CDNUrl[] p1){
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, a$c.class, "6")) {
          return;
       }
       this.t().e(p0);
       return;
    }
    public void g(CDNUrl[] p0){
       c.b(this, p0);
    }
    public String getId(){
       return "liveLuckyStar";
    }
    public int getLayoutOrder(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.LUCKY_STAR.ordinal();
    }
    public String h(){
       return l.c(this);
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "5")) {
          return;
       }
       this.t().c();
       return;
    }
    public int l(){
       return l.b(this);
    }
    public int m(){
       return 2;
    }
    public int n(){
       return 2;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.LUCKY_STAR.ordinal();
    }
    public int[] q(){
       return l.a(this);
    }
    public void r(i p0){
       c.a(this, p0);
    }
    public void release(){
       c.c(this);
    }
    public void s(Drawable p0){
       c.d(this, p0);
    }
    public LiveBaseLuckyStarPendantView t(){
       LiveLuckyStarNewPendantView obj = PatchProxy.apply(null, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new LiveLuckyStarNewPendantView(this.a);
          this.c = obj;
          obj.setOnClickListener(this.b);
       }
       return this.c;
    }
}
