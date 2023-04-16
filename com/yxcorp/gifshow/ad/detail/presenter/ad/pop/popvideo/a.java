package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.popvideo.PopShowFragment$b;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;

public class a extends Accessor	// class@00160b
{
    public final PopShowFragment$b c;
    public final d d;

    public void a(d p0,PopShowFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
