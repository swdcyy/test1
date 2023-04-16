package dl9.c1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.comment.g;
import com.kuaishou.android.model.mix.QComment;
import java.lang.String;
import kotlin.jvm.internal.a;
import yk9.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.android.model.mix.AttachmentInfo;
import nx9.c;
import hl9.t;
import android.widget.ImageView;
import java.lang.Float;
import com.kuaishou.android.model.mix.ImageLayoutInfo;
import java.io.File;
import s0d.f;
import android.net.Uri;
import s0d.e;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.model.mix.ImageContent;
import com.kuaishou.android.model.mix.UrlInfo;
import dl9.d1;
import android.view.View$OnClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import dl9.e1;
import android.view.View$OnLongClickListener;
import com.kwai.library.widget.popup.common.c;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import java.lang.Math;
import zf6.k;
import android.content.Context;
import android.widget.TextView;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import dl9.c1$a;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.misc.report.ReportInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.component.misc.report.ReportActivity;
import xl8.b;

public final class c1 extends PresenterV2	// class@001f50
{
    public final float A;
    public final float B;
    public a C;
    public final int D;
    public final String E;
    public final g F;
    public QComment p;
    public d q;
    public QPhoto r;
    public RecyclerFragment s;
    public b t;
    public KwaiImageView u;
    public KwaiImageView v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public void c1(){
       super();
       this.w = 156.00f;
       this.x = 0x42f80000;
       this.y = 60.00f;
       this.z = 132.00f;
       this.A = 108.00f;
       this.B = 52.00f;
       this.D = 100;
       this.E = "BUBBLE_POSITION";
       this.F = new g();
    }
    public static final QComment P8(c1 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mComment");
       }
       return p0;
    }
    public static final d R8(c1 p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mCommentLogger");
       }
       return p0;
    }
    public void E8(){
       boolean b;
       QComment attachmentLi;
       String str1;
       e[] uoeArray;
       a$a uoa;
       a uoa1;
       d uod;
       c1 tv;
       AbstractDraweeController uAbstractDra;
       c1 tv1;
       String url;
       float f;
       c1 uoc1 = c1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc1, "3")) {
          return;
       }
       this.W8(this.m8());
       c1 obj = PatchProxy.apply(objArray, this, uoc1, "4");
       d1 d uod1 = 1;
       String str = "mComment";
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.p;
          if (obj == null) {
             a.S(str);
          }
          if (obj.mQMedia != null) {
             obj = this.p;
             if (obj == null) {
                a.S(str);
             }
             attachmentLi = obj.mQMedia;
             if (attachmentLi != null && attachmentLi.isImage() == uod1) {
             label_0082 :
                b = true;
             }
          }
       label_0044 :
          obj = this.p;
          if (obj == null) {
             a.S(str);
          }
          if (obj.attachmentList != null) {
             obj = this.p;
             if (obj == null) {
                a.S(str);
             }
             attachmentLi = obj.attachmentList;
             String str3 = "mComment.attachmentList";
             a.o(attachmentLi, str3);
             if (attachmentLi.isEmpty() ^ uod1) {
                obj = this.p;
                if (obj == null) {
                   a.S(str);
                }
                attachmentLi = obj.attachmentList;
                a.o(attachmentLi, str3);
                if (a.g(CollectionsKt___CollectionsKt.m2(attachmentLi).getType(), "PICTURE")) {
                   goto label_0082 ;
                }
             }
          }
       label_0084 :
          b = false;
       }
       int i = 8;
       if (b) {
          if (c.f() && this.v == null) {
             t.l9(this.m8(), R.id.layout_emotion_image);
             this.W8(this.m8());
          }
          obj = this.u;
          if (obj != null) {
             obj.setVisibility(i);
          }
          obj = this.v;
          if (obj != null) {
             obj.setVisibility(0);
          }
          obj = this.p;
          if (obj == null) {
             a.S(str);
          }
          attachmentLi = obj.attachmentList;
          AttachmentInfo uAttachmentI = (attachmentLi != null)? CollectionsKt___CollectionsKt.m2(attachmentLi): objArray;
          c1 tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          QComment mQMedia = tp.mQMedia;
          if (!PatchProxy.applyVoidTwoRefs(uAttachmentI, mQMedia, this, uoc1, "6")) {
             if (mQMedia != null) {
                this.X8(Float.valueOf((float)mQMedia.mWidth), Float.valueOf((float)mQMedia.mHeight));
             }else if(uAttachmentI != null){
                ImageLayoutInfo layout = uAttachmentI.getLayout();
                if (layout != null) {
                   Float width = layout.getWidth();
                   str1 = null;
                   f = (width != null)? width.floatValue(): 0;
                   if (f - str1 > 0) {
                      width = layout.getHeight();
                      f = (width != null)? width.floatValue(): 0;
                      if (f - str1 > 0) {
                         this.X8(layout.getWidth(), layout.getHeight());
                      }
                   }
                   this.X8(layout.getThumbWidth(), layout.getThumbHeight());
                }
             }
             if (!PatchProxy.applyVoidTwoRefs(uAttachmentI, mQMedia, this, uoc1, "12")) {
                QMedia path = (mQMedia != null)? mQMedia.path: objArray;
                str1 = ":ks-components:comment";
                String str2 = "KwaiImageRequestGroupBui¡­\n        .buildRequests\(\)";
                if (path != null && new File(mQMedia.path).exists()) {
                   uoeArray = f.x().s(Uri.fromFile(new File(mQMedia.path))).w();
                   a.o(uoeArray, str2);
                   uoa = a.d();
                   uoa.b(str1);
                   uoa.d(ImageSource.COMMENT_PICTURE);
                   uoa1 = uoa.a();
                   uod = Fresco.newDraweeControllerBuilder();
                   uod.q(uod1);
                   uod1 = uod.r(uoa1);
                   tv = this.v;
                   if (tv != null) {
                      objArray = tv.getController();
                   }
                   uod1.y(objArray);
                   uod1.v(uoeArray, 0);
                   uAbstractDra = uod1.e();
                   a.o(uAbstractDra, "Fresco.newDraweeControll¡­, false\)\n        .build\(\)");
                   tv1 = this.v;
                   if (tv1 != null) {
                      tv1.setController(uAbstractDra);
                   }
                }else if(uAttachmentI != null){
                   ImageContent content = uAttachmentI.getContent();
                   if (content != null) {
                      List smallUrl = content.getSmallUrl();
                      if (smallUrl != null) {
                         UrlInfo urlInfo = CollectionsKt___CollectionsKt.m2(smallUrl);
                         if (urlInfo != null) {
                            str = urlInfo.getUrl();
                         label_01c2 :
                            if (str != null) {
                               f uof = f.x();
                               ImageContent content1 = uAttachmentI.getContent();
                               if (content1 != null) {
                                  List smallUrl1 = content1.getSmallUrl();
                                  if (smallUrl1 != null) {
                                     UrlInfo urlInfo1 = CollectionsKt___CollectionsKt.m2(smallUrl1);
                                     if (urlInfo1 != null) {
                                        url = urlInfo1.getUrl();
                                     label_01e2 :
                                        uoeArray = uof.t(url).w();
                                        a.o(uoeArray, str2);
                                        uoa = a.d();
                                        uoa.b(str1);
                                        uoa.d(ImageSource.COMMENT_PICTURE);
                                        uoa1 = uoa.a();
                                        uod = Fresco.newDraweeControllerBuilder();
                                        uod.q(uod1);
                                        uod1 = uod.r(uoa1);
                                        tv = this.v;
                                        if (tv != null) {
                                           objArray = tv.getController();
                                        }
                                        uod1.y(objArray);
                                        uod1.v(uoeArray, 0);
                                        uAbstractDra = uod1.e();
                                        a.o(uAbstractDra, "Fresco.newDraweeControll¡­, false\)\n        .build\(\)");
                                        tv1 = this.v;
                                        if (tv1 != null) {
                                           tv1.setController(uAbstractDra);
                                        }
                                     }
                                  }
                               }
                               url = objArray;
                               goto label_01e2 ;
                            }
                         }
                      }
                   }
                }
                Object[] objArray1 = objArray;
                goto label_01c2 ;
             }
          label_0226 :
             if (!PatchProxy.applyVoidTwoRefs(uAttachmentI, mQMedia, this, uoc1, "7")) {
                this.X7(c.a(this.v, new d1(this, uAttachmentI, mQMedia)));
             }
             if (!PatchProxy.applyVoidOneRefs(uAttachmentI, this, uoc1, "8")) {
                this.X7(c.b(this.v, new e1(this, uAttachmentI)));
             }
          }
       }else {
          uoc1 = this.v;
          if (uoc1 != null) {
             uoc1.setVisibility(i);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c1.class, "5")) {
          return;
       }
       c1 tC = this.C;
       if (tC != null) {
          tC.q(0);
       }
       this.F.a();
       return;
    }
    public final void S8(boolean p0){
       c1 uoc1 = c1.class;
       if (PatchProxy.isSupport(uoc1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc1, "14")) {
          return;
       }
       uoc1 = this.s;
       if (uoc1 != null) {
          RecyclerView recyclerView = uoc1.h0();
          if (recyclerView != null) {
             recyclerView.requestDisallowInterceptTouchEvent(p0);
          }
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, c1.class, "18")) {
          return;
       }
       c1 tC = this.C;
       if (tC != null) {
          tC.o();
       }
       return;
    }
    public final void W8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c1.class, "2")) {
          return;
       }
       if (this.v != null && this.u != null) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a0878);
       this.u = m1.f(p0, 0x7f0a0861);
       return;
    }
    public final void X8(Float p0,Float p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c1.class, "13")) {
          return;
       }
       if (p0 != null && p1 != null) {
          float f = (float)0;
          if (p0.floatValue() - f > 0 && p1.floatValue() - f > 0) {
             c1 tp = this.p;
             String str = "mComment";
             if (tp == null) {
                a.S(str);
             }
             tp = (!tp.isSub())? this.w: this.z;
             c1 tp1 = this.p;
             if (tp1 == null) {
                a.S(str);
             }
             tp1 = (!tp1.isSub())? this.x: this.A;
             c1 tp2 = this.p;
             if (tp2 == null) {
                a.S(str);
             }
             c1 ty = (!tp2.isSub())? this.y: this.B;
             float f1 = ty / tp;
             float f2 = tp / ty;
             float f3 = tp / tp1;
             float f4 = tp1 / tp;
             float f5 = p0.floatValue() / p1.floatValue();
             c1 tv = this.v;
             ViewGroup$LayoutParams layoutParams = (tv != null)? tv.getLayoutParams(): null;
             if (f5 - f2 >= 0) {
                if (layoutParams != null) {
                   layoutParams.width = a1.e(tp);
                }
                if (layoutParams) {
                   layoutParams.height = a1.e(ty);
                }
             }else if(f5 - f1 <= 0){
                if (layoutParams != null) {
                   layoutParams.width = a1.e(ty);
                }
                if (layoutParams) {
                   layoutParams.height = a1.e(tp);
                }
             }else if(f5 - f4 >= 0 && f5 - f3 < 0){
                float f6 = tp1 / Math.min(p0.floatValue(), p1.floatValue());
                if (layoutParams != null) {
                   layoutParams.width = a1.e((p0.floatValue() * f6));
                }
                if (layoutParams) {
                   layoutParams.height = a1.e((p1.floatValue() * f6));
                }
             }else {
                float f7 = tp / Math.max(p0.floatValue(), p1.floatValue());
                if (layoutParams != null) {
                   layoutParams.width = a1.e((p0.floatValue() * f7));
                }
                if (layoutParams) {
                   layoutParams.height = a1.e((p1.floatValue() * f7));
                }
             }
             c1 tv1 = this.v;
             if (tv1 != null) {
                tv1.setLayoutParams(layoutParams);
             }
          }
       }
    label_0103 :
       return;
    }
    public final void Y8(View p0,boolean p1){
       int color;
       c1 uoc1 = c1.class;
       if (PatchProxy.isSupport(uoc1) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc1, "19")) {
          return;
       }
       if (!k.d()) {
          return;
       }
       View view = p0.findViewById(R.id.emotion_popup);
       int i = 0x7f080405;
       if (k.e()) {
          if (t.W8(this.getContext())) {
             view.setBackgroundResource(R.drawable.bubble_black_background);
             ColorStateList colorStateLi = ContextCompat.getColorStateList(p0.getContext(), R.color.arg_RES_7f060a0b);
             p0.findViewById(R.id.emotion_add).setTextColor(colorStateLi);
             p0.findViewById(R.id.save_to_album).setTextColor(colorStateLi);
             p0.findViewById(R.id.emotion_report).setTextColor(colorStateLi);
          }else {
             view.setBackgroundResource(R.drawable.bubble_white_background);
             color = p0.getResources().getColor(R.color.arg_RES_7f06203c);
             p0.findViewById(R.id.emotion_divider).setBackgroundColor(color);
             p0.findViewById(R.id.emotion_divider_2).setBackgroundColor(color);
             p0 = p0.findViewById(R.id.arrow);
             if (!p1) {
                i = 0x7f080402;
             }
             p0.setBackgroundResource(i);
          }
       }else {
          color = p0.getResources().getColor(R.color.arg_RES_7f06203c);
          p0.findViewById(R.id.emotion_divider).setBackgroundColor(color);
          p0.findViewById(R.id.emotion_divider_2).setBackgroundColor(color);
          p0 = p0.findViewById(R.id.arrow);
          if (!p1) {
             i = 0x7f080402;
          }
          p0.setBackgroundResource(i);
       }
       return;
    }
    public final void Z8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c1.class, "11")) {
          return;
       }
       this.V8();
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined()) {
          d.a(-1712118428).x00(this.getActivity(), 0, new LoginParams$a().a(), new c1$a(this));
          return;
       }else {
          Activity activity = this.getActivity();
          if (!activity instanceof GifshowActivity) {
             activity = objArray;
          }
          ReportInfo reportInfo = new ReportInfo();
          String url = (activity != null)? activity.getUrl(): objArray;
          reportInfo.mRefer = url;
          if (activity != null) {
             objArray = activity.U2();
          }
          reportInfo.mPreRefer = objArray;
          reportInfo.mSourceType = "comment";
          c1 tp = this.p;
          if (tp == null) {
             a.S("mComment");
          }
          reportInfo.mCommentId = tp.getId();
          tp = this.r;
          if (tp == null) {
             a.S("mPhoto");
          }
          reportInfo.mPhotoId = tp.getPhotoId();
          ReportActivity.P3(activity, WebEntryUrls.k, reportInfo);
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c1.class, "1")) {
          return;
       }
       Object obj = this.q8(QComment.class);
       a.o(obj, "inject\(QComment::class.java\)");
       this.p = obj;
       obj = this.q8(d.class);
       a.o(obj, "inject\(CommentLogger::class.java\)");
       this.q = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("COMMENT_RECYCLE_VIEW_SCROLL_FAST_STATE");
       return;
    }
}
