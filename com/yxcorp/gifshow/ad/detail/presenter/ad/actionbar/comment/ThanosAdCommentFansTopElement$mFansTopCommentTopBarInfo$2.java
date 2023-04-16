package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentFansTopElement$mFansTopCommentTopBarInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentFansTopElement;
import com.kuaishou.android.model.fanstop.FansTopCommentTopBarInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;

public final class ThanosAdCommentFansTopElement$mFansTopCommentTopBarInfo$2 extends Lambda implements a	// class@001561
{
    public final ThanosAdCommentFansTopElement this$0;

    public void ThanosAdCommentFansTopElement$mFansTopCommentTopBarInfo$2(ThanosAdCommentFansTopElement p0){
       this.this$0 = p0;
       super(0);
    }
    public final FansTopCommentTopBarInfo invoke(){
       Object[] objArray = null;
       ThanosAdCommentFansTopElement obj = PatchProxy.apply(objArray, this, ThanosAdCommentFansTopElement$mFansTopCommentTopBarInfo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.d;
       if (obj != null) {
          objArray = obj.getFansTopCommentTopBarInfo();
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
