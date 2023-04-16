package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment$b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.b;
import java.lang.String;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.c;
import mm8.a;

public final class d implements b	// class@00160e
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(BaseFeed.class, new a(this, p1));
       b uob = new b(this, p1);
       String str = "POPSHOW_FRAGMENT";
       try{
          p0.i(str, uob);
          p0.h(PopShowFragment$b.class, new c(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
