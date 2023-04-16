package com.yxcorp.gifshow.ad.detail.router.AdLoginDetectionHandler$b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.router.AdLoginDetectionHandler$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdProcessUtils;

public final class AdLoginDetectionHandler$b$a implements Runnable	// class@0016e8
{
    public final AdLoginDetectionHandler$b b;

    public void AdLoginDetectionHandler$b$a(AdLoginDetectionHandler$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdLoginDetectionHandler$b$a.class, "1")) {
          return;
       }
       AdLoginDetectionHandler$b$a tb = this.b;
       AdProcessUtils.o(tb.b, new PhotoAdDataWrapper(tb.c.mEntity), this.b.d);
       return;
    }
}
