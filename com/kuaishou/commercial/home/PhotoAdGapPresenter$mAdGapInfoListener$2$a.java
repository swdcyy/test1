package com.kuaishou.commercial.home.PhotoAdGapPresenter$mAdGapInfoListener$2$a;
import qx.b;
import com.kuaishou.commercial.home.PhotoAdGapPresenter$mAdGapInfoListener$2;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.commercial.home.PhotoAdGapPresenter;
import java.util.List;
import qvb.i;
import com.yxcorp.gifshow.photoad.g;

public final class PhotoAdGapPresenter$mAdGapInfoListener$2$a implements b	// class@0014ce
{
    public final PhotoAdGapPresenter$mAdGapInfoListener$2 a;

    public void PhotoAdGapPresenter$mAdGapInfoListener$2$a(PhotoAdGapPresenter$mAdGapInfoListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(BaseFeed p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdGapPresenter$mAdGapInfoListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "feed");
       a.p(p1, "clientAdLog");
       if (a.g(p0, this.a.this$0.P8().getEntity())) {
          PhotoAdGapPresenter r = this.a.this$0.r;
          a.m(r);
          g.a(this.a.this$0.P8(), p1, r.getItems());
       }
       return;
    }
}
