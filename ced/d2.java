package ced.d2;
import ced.f2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import com.yxcorp.plugin.search.result.hashtag.entity.TagCategory;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import ded.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import lnc.a1;
import android.view.View;
import android.widget.TextView;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.feed.ImageFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import com.kwai.component.feedstaggercard.helper.GeneralCoverLabelDrawer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.feedstaggercard.model.CardStyle;
import com.kwai.component.feedstaggercard.helper.GeneralCoverLabelDrawer$Companion;
import com.kwai.framework.model.user.User;
import b06.e;
import ekd.m1;
import com.kuaishou.android.model.mix.PhotoMeta;

public class d2 extends f2	// class@00054a
{
    public ViewStub q;
    public ViewStub r;
    public ViewStub s;
    public ViewStub t;
    public ViewStub u;
    public ViewStub v;
    public QPhoto w;
    public PhotoMeta x;
    public TagInfo y;
    public TagCategory z;

    public void d2(){
       super();
    }
    public void E8(){
       boolean b;
       Object obj = this;
       f2 uof2 = f2.class;
       d2 uod2 = d2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uod2, "3")) {
          return;
       }
       int i = 8;
       obj.S8(obj.s, i);
       obj.S8(obj.t, i);
       obj.S8(obj.u, i);
       d2 y = obj.y;
       String str = "5";
       if (y != null) {
          d2 z = obj.z;
          if (z != null && z == TagCategory.MUSIC) {
             z = obj.w;
             TagInfo mMusic = y.mMusic;
             Object obj1 = PatchProxy.applyTwoRefs(z, mMusic, objArray, k.class, str);
             int i1 = 0;
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(z == null || (mMusic == null || (z.getSoundTrack() != null && (!TextUtils.x(mMusic.mId) && TextUtils.n(z.getSoundTrack().mId, mMusic.mId))))){
                b = true;
             }else {
                b = false;
             }
             if (b && obj.w.getTopFeedIndex() <= 0) {
                uod2 = obj.u;
                int i2 = 0x7f103715;
                if (!PatchProxy.isSupport(uof2) || !PatchProxy.applyVoidTwoRefs(uod2, Integer.valueOf(i2), obj, uof2, str)) {
                   String str1 = a1.p(i2);
                   if (!PatchProxy.applyVoidTwoRefs(uod2, str1, obj, uof2, "6")) {
                      View view1 = obj.P8(uod2);
                      view1.findViewById(R.id.tag_text_mark).setText(str1);
                      view1.setVisibility(i1);
                   }
                }
                uod2 = obj.u;
                if (!PatchProxy.isSupport(uof2) || !PatchProxy.applyVoidTwoRefs(uod2, Integer.valueOf(0x7f081f09), obj, uof2, "4")) {
                   View view = obj.P8(uod2);
                   view.setVisibility(i1);
                   view.setBackgroundResource(R.drawable.arg_RES_7f081f09);
                }
                return;
             }
          }
       }
    label_00cf :
       if (!PatchProxy.applyVoid(objArray, obj, uod2, str)) {
          QPhoto mEntity = obj.w.mEntity;
          if (mEntity instanceof VideoFeed) {
             objArray = mEntity.mCommonMeta.mCoverCommonTags;
          }else if(mEntity instanceof ImageFeed){
             objArray = mEntity.mCommonMeta.mCoverCommonTags;
          }else if(mEntity instanceof LiveStreamFeed){
             objArray = mEntity.mCommonMeta.mCoverCommonTags;
          }
          if (objArray != null) {
             CoverCommonTagsModel mLeftTopTag = objArray.mLeftTopTag;
             if (mLeftTopTag != null) {
                if (!PatchProxy.applyVoidOneRefs(mLeftTopTag, obj, uod2, "6")) {
                   if (mLeftTopTag.disableTag != null) {
                      this.V8();
                   }else {
                      GeneralCoverLabelDrawer.i.c(this.getActivity(), obj.P8(obj.v), mLeftTopTag, 9.00f, 0, "photo_tag", false, 0xbf800000, CardStyle.NORMAL_CARD_NORMAL_BOTTOM, true, 2.00f, 2.00f, 4.00f, 14.00f, a1.e(8.00f), true);
                   }
                }
             }
          }
          obj.S8(obj.v, i);
          this.V8();
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, d2.class, "4")) {
          return;
       }
       if (this.w.getUser() != null && !this.w.isPublic()) {
          this.R8(this.r, R.drawable.arg_RES_7f080520);
       }else {
          int i = 8;
          this.S8(this.r, i);
          int i1 = e.d(this.w);
          if (!i1) {
             this.S8(this.q, i);
          }else {
             this.R8(this.q, i1);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d2.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a136c);
       this.r = m1.f(p0, 0x7f0a3226);
       this.s = m1.f(p0, 0x7f0a2f3f);
       this.t = m1.f(p0, 0x7f0a3ce0);
       this.u = m1.f(p0, 0x7f0a0ec0);
       this.v = m1.f(p0, 0x7f0a1746);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d2.class, "1")) {
          return;
       }
       QPhoto qPhoto = this.t8("DATA");
       this.w = qPhoto;
       if (qPhoto == null) {
          this.w = this.q8(QPhoto.class);
       }
       this.x = this.q8(PhotoMeta.class);
       this.y = this.t8("TagInfo");
       this.z = this.t8("TagCategory");
       return;
    }
}
