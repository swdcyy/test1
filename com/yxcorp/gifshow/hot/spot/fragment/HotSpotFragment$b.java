package com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment$b;
import ha5.e;
import wua.a;
import java.lang.Object;
import java.lang.String;
import ha5.d;
import com.kwai.framework.model.feed.BaseFeed;
import vm5.h$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import g9c.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotExperimentUtils;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;

public final class HotSpotFragment$b implements e	// class@001830
{
    public final a a;

    public void HotSpotFragment$b(a p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,int p5){
       d.d(this, p0, p1, p2, p3, p4, p5);
    }
    public void b(BaseFeed p0,int p1){
       d.c(this, p0, p1);
    }
    public void c(BaseFeed p0,int p1){
       d.b(this, p0, p1);
    }
    public void d(h$a p0,int p1){
       HotSpotFragment$b uob = HotSpotFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "context");
       List list = (this.a.getItemCount() > p1)? this.a.Q0().subList(p1, this.a.getItemCount()): CollectionsKt__CollectionsKt.E();
       p0.M = list;
       p0.N = HotSpotExperimentUtils.b();
       return;
    }
    public int[] e(CoverMeta p0,CommonMeta p1){
       return d.a(this, p0, p1);
    }
}
