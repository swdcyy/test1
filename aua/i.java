package aua.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.widget.TextView;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.component.feedstaggercard.helper.LiveAudienceUpdateHelper;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class i extends PresenterV2	// class@000310
{
    public TextView p;
    public KwaiBindableImageView q;
    public View r;
    public ViewStubInflater2 s;
    public LiveStreamModel t;
    public CommonMeta u;
    public BaseFragment v;
    public QPhoto w;
    public LifecycleObserver x;

    public void i(){
       super();
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       i ts = this.s;
       if (ts != null) {
          this.r = ts.b(0x7f0a02d6);
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "7")) {
          ts = this.r;
          if (ts != null) {
             ts.setVisibility(8);
          }
          ts = this.p;
          if (ts != null && this.q != null) {
             ts.setVisibility(0);
             String str = "";
             if (TextUtils.x(this.t.mAudienceCount)) {
                this.p.setText(str);
             }else {
                ts = this.u;
                if (ts != null) {
                   CommonMeta mCoverCommon = ts.mCoverCommonTags;
                   if (mCoverCommon != null && mCoverCommon.mAuthorRightSideTag != null) {
                      this.p.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                      this.p.setText(str);
                   }
                }
                this.p.setText(this.t.mAudienceCount);
                this.P8();
                if (!PatchProxy.applyVoid(objArray, this, oi, "6")) {
                   LifecycleObserver lifecycleObs = LiveAudienceUpdateHelper.a(this.p, this.w);
                   this.x = lifecycleObs;
                   if (lifecycleObs != null) {
                      this.v.getLifecycle().addObserver(this.x);
                   }
                }
                this.q.setVisibility(8);
                this.p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f080a16, 0, 0, 0);
             }
          }
       }
    label_009f :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       if (this.x != null) {
          this.v.getLifecycle().removeObserver(this.x);
          this.x = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3bd9);
       this.q = m1.f(p0, 0x7f0a3bde);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.s = this.t8("AUDIENCE_COUNT_VIEW_STUB_INFLATER");
       this.t = this.s8(LiveStreamModel.class);
       this.u = this.q8(CommonMeta.class);
       this.v = this.r8("FRAGMENT");
       this.w = this.q8(QPhoto.class);
       return;
    }
}
