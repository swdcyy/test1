package com.yxcorp.gifshow.hot.stagger.HomeHotFragment$b;
import ha5.e;
import com.yxcorp.gifshow.hot.stagger.HomeHotFragment;
import java.lang.Object;
import java.lang.String;
import ha5.d;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import ab5.a;
import io.reactivex.subjects.PublishSubject;
import vm5.h$a;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CommonMeta;

public class HomeHotFragment$b implements e	// class@00189a
{
    public final HomeHotFragment a;

    public void HomeHotFragment$b(HomeHotFragment p0){
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
       HomeHotFragment$b uob = HomeHotFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       HomeItemFragment h = this.a.H;
       h.i = p1;
       h.j.onNext(p0);
       return;
    }
    public void d(h$a p0,int p1){
       d.e(this, p0, p1);
    }
    public int[] e(CoverMeta p0,CommonMeta p1){
       return d.a(this, p0, p1);
    }
}