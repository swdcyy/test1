package com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import r16.f;
import lnc.x6;
import lnc.y6;
import r26.a;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import android.view.View;
import com.yxcorp.gifshow.follow.stagger.post.fragment.TopSnackBarFragment;
import java.lang.Boolean;
import com.kwai.feature.post.api.feature.upload.model.UploadSystemForbidNotify;
import java.lang.reflect.Type;
import rq.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import lnc.a1;
import android.content.res.ColorStateList;
import com.kwai.feature.post.api.feature.upload.model.UploadPostForbidNotify;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter$b;
import com.kwai.feature.post.api.feature.upload.model.UploadPostForbidNotify$PunishTopDialog;
import android.widget.Button;
import lnc.s6;
import java.lang.CharSequence;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter$c;
import java.util.Objects;
import g36.a;
import com.yxcorp.gifshow.follow.stagger.post.MockUploadFailedPresenter$e;

public final class MockUploadFailedPresenter extends PresenterV2 implements LifecycleObserver	// class@0011d0
{
    public TopSnackBarFragment p;
    public KwaiImageView q;
    public Button r;
    public ImageView s;
    public View t;
    public TextView u;
    public QPhoto v;
    public static final MockUploadFailedPresenter$a w;

    static {
       MockUploadFailedPresenter.w = new MockUploadFailedPresenter$a(null);
    }
    public void MockUploadFailedPresenter(){
       super();
    }
    public static final QPhoto P8(MockUploadFailedPresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("qPhoto");
       }
       return p0;
    }
    public void E8(){
       MockUploadFailedPresenter tv;
       int i;
       MockUploadFailedPresenter mockUploadFa = MockUploadFailedPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mockUploadFa, "4")) {
          return;
       }
       MockUploadFailedPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.getLifecycle().addObserver(this);
       tp = this.q;
       String str = "qPhoto";
       if (tp != null) {
          tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          tp.U(tv.getCoverThumbnailUrls());
       }
       tp = this.t;
       if (tp != null) {
          Object obj = PatchProxy.apply(objArray, this, mockUploadFa, "8");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             i = 0;
             tv = this.v;
             if (tv == null) {
                a.S(str);
             }
             if (!tv.getMoodTemplateId()) {
                tv = this.v;
                if (tv == null) {
                   a.S(str);
                }
                if (!tv.isUserStatusPhoto()) {
                   tv = this.v;
                   if (tv == null) {
                      a.S(str);
                   }
                   if (!tv.isRecreationPhoto()) {
                   label_0075 :
                      f uof = y6.r(f.class);
                      if (uof != null) {
                         MockUploadFailedPresenter tv1 = this.v;
                         if (tv1 == null) {
                            a.S(str);
                         }
                         objArray = uof.L0(tv1.getPostWorkInfoId());
                      }
                      if (objArray != null) {
                         EncodeInfo encodeInfo = objArray.getEncodeInfo();
                         if (encodeInfo == null || (encodeInfo.isCrashInEncodingAndGiveUpWorkspace() == true || !objArray.isSaveWorkSpace())) {
                            i = 8;
                         }
                      }
                   }
                }
             }
          label_0073 :
             i = 8;
             goto label_0075 ;
          }
          tp.setVisibility(i);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MockUploadFailedPresenter.class, "5")) {
          return;
       }
       MockUploadFailedPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.getLifecycle().removeObserver(this);
       return;
    }
    public final TopSnackBarFragment R8(){
       MockUploadFailedPresenter obj = PatchProxy.apply(null, this, MockUploadFailedPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj;
    }
    public final boolean S8(){
       UploadSystemForbidNotify obj = PatchProxy.apply(null, this, MockUploadFailedPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.I(UploadSystemForbidNotify.class);
       boolean b = (obj != null && obj.mForbidden != null)? true: false;
       return b;
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockUploadFailedPresenter.class, "7")) {
          return;
       }
       a.p(p0, "clickType");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PHOTO_UPLOAD_FAIL";
       i3 oi3 = i3.f();
       oi3.d("click_type", p0);
       uElementPack.params = oi3.e();
       u1.M(null, null, 6, uElementPack, null, null);
       return;
    }
    public void doBindView(View p0){
       MockUploadFailedPresenter ts;
       MockUploadFailedPresenter tr;
       String str;
       Button uButton1;
       MockUploadFailedPresenter mockUploadFa = MockUploadFailedPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mockUploadFa, "6")) {
          return;
       }
       Button uButton = null;
       View view = (p0 != null)? p0.findViewById(R.id.subtitle): uButton;
       this.t = view;
       if (p0 != null) {
          view = p0.findViewById(R.id.mock_feed_error_layout);
          if (view != null) {
             view.setOnClickListener(MockUploadFailedPresenter$d.b);
          }
       }
       KwaiImageView kwaiImageVie = (p0 != null)? p0.findViewById(R.id.mock_failed_feed_thumb): uButton;
       this.q = kwaiImageVie;
       if (kwaiImageVie != null) {
          kwaiImageVie.setOverlayColor(R.color.arg_RES_7f0600a7);
       }
       TextView textView = (p0 != null)? p0.findViewById(R.id.textView): uButton;
       this.u = textView;
       ImageView imageView = (p0 != null)? p0.findViewById(R.id.mock_close_btn): uButton;
       this.s = imageView;
       Drawable background = (imageView != null)? imageView.getBackground(): uButton;
       if (background != null) {
          background = a.r(background);
          a.o(background, ColorStateList.valueOf(a1.a(R.color.arg_RES_7f0616a7)));
          ts = this.s;
          if (ts != null) {
             ts.setBackground(background);
          }
       }
       UploadPostForbidNotify uploadPostFo = a.H(UploadPostForbidNotify.class);
       uploadPostFo = (uploadPostFo != null)? uploadPostFo.mPunishTopDialog: uButton;
       ts = this.s;
       if (ts != null) {
          ts.setOnClickListener(new MockUploadFailedPresenter$b(this, uploadPostFo));
       }
       if (p0 != null) {
          uButton = p0.findViewById(0x7f0a2bd4);
       }
       this.r = uButton;
       if (s6.B() && (this.S8() && uploadPostFo != null)) {
          tr = this.r;
          if (tr != null) {
             tr.setText(uploadPostFo.mButton1Text);
          }
          tr = this.r;
          if (tr != null) {
             tr.setOnClickListener(new MockUploadFailedPresenter$c(uploadPostFo, this));
          }
          tr = this.u;
          if (tr != null) {
             tr.setText(uploadPostFo.mTitle);
          }
          tr = this.t;
          Objects.requireNonNull(tr, "null cannot be cast to non-null type android.widget.TextView");
          MockUploadFailedPresenter mockUploadFa1 = tr;
          boolean b = (tr != null && tr.getVisibility() == 8)? true: false;
          UploadPostForbidNotify$PunishTopDialog mDescription = uploadPostFo.mDescription;
          if (PatchProxy.isSupport(mockUploadFa)) {
             str = PatchProxy.applyTwoRefs(Boolean.valueOf(b), mDescription, this, mockUploadFa, "10");
             if (str != PatchProxyResult.class) {
             }else if(b){
                String str1 = a1.p(R.string.arg_RES_7f104fa5);
                a.o(str1, "CommonUtil.string\(R.stri¡­escription_without_draft\)");
                str = str1;
             }else if(mDescription != null){
                mDescription = a1.p(R.string.arg_RES_7f104fa4);
             }
             a.o(mDescription, "originDescription ?: Com\x20\x02d_description_with_draft\)\x00");
             str = mDescription;
          }else {
             goto label_0104 ;
          }
          mockUploadFa1.setText(str);
          tr = this.t;
          if (tr != null) {
             tr.setVisibility(0);
          }
          a.b();
       }else {
          tr = this.r;
          if (tr != null) {
             tr.setOnClickListener(new MockUploadFailedPresenter$e(this));
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MockUploadFailedPresenter.class, "3")) {
          return;
       }
       Object obj = this.q8(TopSnackBarFragment.class);
       a.o(obj, "inject\(TopSnackBarFragment::class.java\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.v = obj;
       return;
    }
}
