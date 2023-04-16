package eja.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import im8.f;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.TextView;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.component.feedstaggercard.helper.LiveAudienceUpdateHelper;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class o extends PresenterV2	// class@0026e7
{
    public BaseFragment p;
    public LiveCoverIconView q;
    public QPhoto r;
    public TextView s;
    public LiveStreamModel t;
    public f u;
    public CommonMeta v;
    public LifecycleObserver w;
    public CardStyle x;

    public void o(CardStyle p0){
       a.p(p0, "mCardStyle");
       super();
       this.x = p0;
    }
    public void E8(){
       boolean b;
       o tt;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "3")) {
          return;
       }
       o obj = PatchProxy.apply(objArray, this, oo, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(CardStyle.isV4Bottom(this.x.mBottomType) || CardStyle.isV5Bottom(this.x.mBottomType)){
          obj = this.u;
          Boolean uBoolean = (obj != null)? obj.get(): objArray;
          if (!a.g(uBoolean, Boolean.TRUE)) {
          label_0048 :
             obj = this.v;
             if (obj != null) {
                CommonMeta mCoverCommon = obj.mCoverCommonTags;
                if (mCoverCommon != null) {
                   CoverCommonTagsModel mAuthorRight = mCoverCommon.mAuthorRightSideTag;
                label_0054 :
                   if (mAuthorRight == null) {
                      obj = this.t;
                      tt = 1;
                      o oo1 = (obj != null && obj.mIsGRPRCustomized == tt)? 1: null;
                      if (!oo1) {
                         LiveStreamModel mAudienceCou1 = (obj != null)? obj.mAudienceCount: objArray;
                         if (!TextUtils.x(mAudienceCou1)) {
                            obj = this.t;
                            mAudienceCou1 = (obj != null)? obj.mAudienceCount: objArray;
                            if (!TextUtils.n(mAudienceCou1, "0")) {
                               b = true;
                            }
                         }
                      }
                   }
                }
             }
             Object[] objArray1 = objArray;
             goto label_0054 ;
          }
       }else {
          goto label_0048 ;
       }
    label_0084 :
       b = false;
       if (b) {
          if (!PatchProxy.applyVoid(objArray, this, oo, "8")) {
             obj = this.s;
             if (obj != null) {
                int i = (CardStyle.isV5Bottom(this.x.mBottomType))? 0x7f080dc6: 0x7f080a16;
                if (CardStyle.isV5Bottom(this.x.mBottomType)) {
                   Drawable uDrawable = a1.f(i);
                   uDrawable.setBounds(0, 0, a1.e(14.00f), a1.e(14.00f));
                   obj.setCompoundDrawables(uDrawable, objArray, objArray, objArray);
                }else {
                   obj.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
                }
                tt = this.t;
                LiveStreamModel mAudienceCou = (tt != null)? tt.mAudienceCount: objArray;
                obj.setText(mAudienceCou);
                obj.setVisibility(0);
             }
          }
          this.P8();
          if (!PatchProxy.applyVoid(objArray, this, oo, "7")) {
             oo = this.s;
             o tr = this.r;
             if (tr == null) {
                a.S("mPhoto");
             }
             LifecycleObserver lifecycleObs = LiveAudienceUpdateHelper.a(oo, tr);
             this.w = lifecycleObs;
             if (lifecycleObs != null) {
                tr = this.p;
                if (tr == null) {
                   a.S("mFragment");
                }
                tr.getLifecycle().addObserver(lifecycleObs);
             }
          }
       }
    label_0104 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, o.class, "6")) {
          return;
       }
       o tw = this.w;
       if (tw != null) {
          o tp = this.p;
          if (tp == null) {
             a.S("mFragment");
          }
          tp.getLifecycle().removeObserver(tw);
       }
       this.w = null;
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.live_mark);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.live_mark\)");
       this.q = view;
       this.s = m1.f(p0, 0x7f0a3bd9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.t = this.s8(LiveStreamModel.class);
       this.v = this.s8(CommonMeta.class);
       this.u = this.w8("AD_MARK_SHOW_SUBJECT_VIEW");
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       return;
    }
}
