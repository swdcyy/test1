package f72.x;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kuaishou.android.model.mix.w;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import ga5.b;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.h;
import com.kwai.component.feedstaggercard.helper.GeneralCoverLabelDrawer;
import android.app.Activity;
import com.kwai.component.feedstaggercard.model.CardStyle;
import com.kwai.component.feedstaggercard.helper.GeneralCoverLabelDrawer$Companion;
import android.widget.ImageView;
import f72.w;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class x extends c	// class@0028e0
{
    public CommonMeta p;
    public boolean q;
    public KwaiImageView r;
    public View s;
    public View t;
    public View u;
    public QPhoto v;
    public static String sLivePresenterClassName = "LiveDoubleListFeedNormalBottomBarLabelPresenter";

    public void x(){
       super();
    }
    public void E8(){
       x tp;
       CommonMeta mCoverCommon1;
       x ox = x.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ox, "3")) {
          return;
       }
       QPhoto mEntity = this.v.mEntity;
       this.p = r1.w0(mEntity);
       this.q = w.k0(mEntity);
       if (!PatchProxy.applyVoid(objArray, this, ox, "5")) {
          tp = this.p;
          if (tp != null) {
             mCoverCommon1 = tp.mCoverCommonTags;
             if (mCoverCommon1 != null) {
                CoverCommonTagsModel mAuthorRight = mCoverCommon1.mAuthorRightSideTag;
                if (mAuthorRight == null || (mAuthorRight.disableTag == null && (this.q == null && !b.b(mAuthorRight)))) {
                   if (this.t == null) {
                      this.t = h.f(this.m8(), 0x7f0a1c8a, 0x7f0a1c84);
                   }
                   GeneralCoverLabelDrawer.i.b(this.getActivity(), this.t, mAuthorRight, 10.00f, 0, "footer_tag", false, 0xbf800000, CardStyle.NORMAL_CARD_NORMAL_BOTTOM, false);
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ox, "6")) {
          this.r.setVisibility(8);
          tp = this.p;
          if (tp != null) {
             mCoverCommon1 = tp.mCoverCommonTags;
             if (mCoverCommon1 != null) {
                CoverCommonTagsModel mAuthorRelat = mCoverCommon1.mAuthorRelationTag;
                if (mAuthorRelat == null || (mAuthorRelat.disableTag == null && (this.q == null && !b.b(mAuthorRelat)))) {
                   this.r.setVisibility(0);
                   this.r.a0(mAuthorRelat.bgImage, new w(this));
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, ox, "7")) {
          ox = this.p;
          if (ox != null) {
             CommonMeta mCoverCommon = ox.mCoverCommonTags;
             if (mCoverCommon != null) {
                CoverCommonTagsModel mRightBottom = mCoverCommon.mRightBottomTag;
                if (mRightBottom != null && (mRightBottom.disableTag == null && !b.b(mRightBottom))) {
                   if (this.u == null) {
                      this.u = h.f(this.m8(), 0x7f0a1c94, 0x7f0a0e1b);
                   }
                   GeneralCoverLabelDrawer.i.b(this.getActivity(), this.t, mRightBottom, 12.00f, 0, "photo_tag", false, 0xbf800000, CardStyle.NORMAL_CARD_NORMAL_BOTTOM, false);
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, x.class, "4")) {
          return;
       }
       int i = 8;
       this.r.setVisibility(i);
       x tt = this.t;
       if (tt != null) {
          tt.setVisibility(i);
       }
       tt = this.u;
       if (tt != null) {
          tt.setVisibility(i);
       }
       this.s.setVisibility(0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1c89);
       this.s = m1.f(p0, 0x7f0a0e29);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.v = this.q8(QPhoto.class);
       return;
    }
}
