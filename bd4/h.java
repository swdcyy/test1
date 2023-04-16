package bd4.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zd4.a;
import q87.c;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel$ProductConvergenceInfo;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel$ItemRelatedVideo;
import android.widget.TextView;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.SpannableStringBuilder;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.yxcorp.widget.selector.view.SelectShapeTextView;

public class h extends PresenterV2	// class@00038d
{
    public SelectShapeTextView p;
    public a q;
    public MerchantRecommendInfoModel r;

    public void h(){
       super();
    }
    public void E8(){
       SpannableStringBuilder spannableStr;
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("GuessLikeRelatedVideoPresenter", "onBind", objArray);
       a c = this.q.c;
       this.r = c;
       MerchantRecommendInfoModel mProductConv = c.mProductConvergenceInfo;
       if (mProductConv != null) {
          MerchantRecommendInfoModel$ProductConvergenceInfo mItemRelated = mProductConv.mItemRelatedVideo;
          if (mItemRelated != null && mItemRelated.mShowType != null) {
             this.p.setVisibility(i);
             h tp = this.p;
             MerchantRecommendInfoModel$ItemRelatedVideo mShowType = this.r.mProductConvergenceInfo.mItemRelatedVideo.mShowType;
             if (PatchProxy.isSupport(oh)) {
                spannableStr = PatchProxy.applyOneRefs(Integer.valueOf(mShowType), this, oh, "6");
                if (spannableStr != PatchProxyResult.class) {
                label_0072 :
                   tp.setText(spannableStr);
                label_007d :
                   return;
                }
             }
             spannableStr = new SpannableStringBuilder();
             Resources resources = this.getContext().getResources();
             i = (mShowType == 1)? 0x7f105163: 0x7f102721;
             spannableStr.append(resources.getString(i));
             goto label_0072 ;
          }
       }
       this.p.setVisibility(8);
       goto label_007d ;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("GuessLikeRelatedVideoPresenter", "onCreate", objArray);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("GuessLikeRelatedVideoPresenter", "onUnbind", objArray);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.p = p0.findViewById(0x7f0a41d1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       return;
    }
}
