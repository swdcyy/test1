package bua.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ok.o;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import kp.r1;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$ReasonTextInfo;
import android.widget.TextView;
import qua.a;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.component.feedstaggercard.helper.LiveAudienceUpdateHelper;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.textview.AdjustSizeTextView;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;

public class b extends PresenterV2	// class@000472
{
    public LiveStreamModel p;
    public CommonMeta q;
    public BaseFeed r;
    public f s;
    public o t;
    public PhotoItemViewParam u;
    public AdjustSizeTextView v;
    public CardStyle w;
    public BaseFragment x;
    public QPhoto y;
    public LifecycleObserver z;

    public void b(CardStyle p0){
       super();
       this.w = p0;
    }
    public void E8(){
       int i;
       Object obj;
       boolean b;
       int b1;
       b tp;
       Drawable uDrawable;
       LifecycleObserver lifecycleObs;
       LiveCoverWidgetModel liveCoverWid;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (this.s.get().booleanValue()) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoid(objArray, this, uob, "7") && (this.v != null && !TextUtils.x(this.p.mAudienceCount))) {
             b tt = this.t;
             if (tt == null || tt.apply(this.p.mAudienceCount)) {
                tt = this.q;
                if (tt != null) {
                   CommonMeta mCoverCommon = tt.mCoverCommonTags;
                   if (mCoverCommon == null || mCoverCommon.mAuthorRightSideTag == null) {
                   }
                }else {
                }
             }
          }
       }
    label_0155 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tv = this.v;
       if (tv != null && tv.getPaint() != null) {
          this.v.getPaint().setFakeBoldText(false);
       }
       this.R8();
       return;
    }
    public final boolean P8(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.x;
       b = false;
       if (obj instanceof RecyclerFragment && obj.getPage() == 15) {
          b = true;
       }
       return b;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (this.z != null) {
          this.x.getLifecycle().removeObserver(this.z);
          this.z = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a3bd9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(LiveStreamModel.class);
       this.q = this.q8(CommonMeta.class);
       this.r = this.q8(BaseFeed.class);
       this.s = this.x8("HOME_ENABLE_LIVE_AUTO_PLAY");
       this.t = this.t8("HOME_LIVE_AUDIENCE_PREDICATE");
       this.x = this.r8("FRAGMENT");
       this.u = this.t8("FEED_ITEM_VIEW_PARAM");
       this.y = this.q8(QPhoto.class);
       return;
    }
}
