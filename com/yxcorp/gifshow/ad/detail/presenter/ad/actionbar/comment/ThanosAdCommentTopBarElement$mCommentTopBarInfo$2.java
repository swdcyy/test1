package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentTopBarElement$mCommentTopBarInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentTopBarElement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;

public final class ThanosAdCommentTopBarElement$mCommentTopBarInfo$2 extends Lambda implements a	// class@001565
{
    public final ThanosAdCommentTopBarElement this$0;

    public void ThanosAdCommentTopBarElement$mCommentTopBarInfo$2(ThanosAdCommentTopBarElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final PhotoAdvertisement$CommentTopBarInfo invoke(){
       Object[] objArray = null;
       PhotoAdvertisement obj = PatchProxy.apply(objArray, this, ThanosAdCommentTopBarElement$mCommentTopBarInfo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.B(this.this$0.d);
       if (obj != null) {
          PhotoAdvertisement$AdData adData = obj.getAdData();
          if (adData != null) {
             objArray = adData.mCommentTopBarInfo;
          }
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
