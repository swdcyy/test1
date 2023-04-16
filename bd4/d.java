package bd4.d;
import android.view.View$OnClickListener;
import bd4.g;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bd4.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel$ProductConvergenceInfo;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel$ItemRelatedVideo;
import android.app.Activity;
import java.util.List;
import com.kuaishou.merchant.transaction.base.detail.guesslike.GuessLikePhotoListHolder;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import ot3.z;
import brd.t;
import com.yxcorp.gifshow.feed.g;
import t45.d;
import brd.z;
import bd4.f;
import sfc.a;
import t90.q;
import erd.g;
import erd.a;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;

public final class d implements View$OnClickListener	// class@000389
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, og, "8")) {
       }else {
          a t = tb.t;
          if (t != null) {
             MerchantRecommendInfoModel$ProductConvergenceInfo mItemRelated = t.mItemRelatedVideo;
             if (mItemRelated != null) {
                MerchantRecommendInfoModel$ItemRelatedVideo mShowType = mItemRelated.mShowType;
                if (mShowType == 1) {
                   if (!PatchProxy.applyVoid(null, tb, og, "10")) {
                      g w = tb.w;
                      if (w != null && !w.isFinishing()) {
                         if (q.f(tb.C.getRequestPhotoIds())) {
                            tb.X8();
                         }else {
                            ProgressFragment progressFrag = z.a(tb.w);
                            Objects.requireNonNull(progressFrag);
                            tb.X7(g.g(tb.C.getRequestPhotoIds()).observeOn(d.a).subscribe(new f(tb), new a(), new q(progressFrag)));
                         }
                      }
                   }
                }else if(mShowType == 2){
                   tb.W8(mItemRelated.mVideoInterpretationUrl);
                }else {
                   tb.W8(tb.s.mJumpUrl);
                }
             }else {
             label_0084 :
                tb.W8(tb.s.mJumpUrl);
             }
          }else {
             goto label_0084 ;
          }
          tb.V8();
       }
       return;
    }
}
