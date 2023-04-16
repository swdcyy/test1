package com.yxcorp.gifshow.channel.stagger.a;
import vm5.o;
import java.lang.Object;
import android.content.Intent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.framework.model.feed.BaseFeed;

public final class a implements o	// class@00105e
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(Intent p0,PhotoDetailParam p1){
       p1.getDetailLogParam().addSlideSessionParams(p1.getBaseFeed());
    }
}
