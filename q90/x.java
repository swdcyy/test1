package q90.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q90.x$a;
import nsd.u;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import q90.w;
import uc.c;
import uc.b;
import android.graphics.Bitmap$Config;
import lnc.a1;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import q90.x$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.gifshow.kuaishan.KSSource;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import java.util.Objects;
import java.lang.Boolean;
import k90.a;
import y8c.d;
import kotlin.Pair;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import brd.t;
import q90.x$f;
import erd.g;
import crd.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.ui.ColorRoundTextView;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$TemplateTag;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.GradientDrawable;
import kotlin.collections.ArraysKt___ArraysKt;
import android.widget.LinearLayout;
import a2.i0;
import t36.f;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import android.widget.RelativeLayout;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import android.app.Activity;
import u80.d;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$a;
import java.lang.System;
import t90.k;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import q46.l;
import lnc.g7;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPostPreviewActivity;
import t90.j;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import org.json.JSONObject;
import w46.b;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import lnc.i3;
import q90.x$g;
import java.lang.Runnable;
import lxa.a;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import android.text.TextUtils;
import s0d.f;
import java.util.Collection;
import java.lang.Number;
import s0d.a;
import s0d.e;
import androidx.recyclerview.widget.RecyclerView;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ekd.m1;
import android.text.TextPaint;
import q90.x$b;
import android.view.View$OnClickListener;
import q90.x$c;
import q90.x$d;

public final class x extends PresenterV2	// class@0029b1
{
    public KSLaunchParams A;
    public d B;
    public final b C;
    public final int D;
    public final m1 E;
    public final c F;
    public final View G;
    public final BaseFragment H;
    public View p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public ColorRoundTextView t;
    public ColorRoundTextView u;
    public RelativeLayout v;
    public RelativeLayout w;
    public LinearLayout x;
    public boolean y;
    public KSTemplateDetailInfo z;
    public static final x$a I;

    static {
       x.I = new x$a(null);
    }
    public void x(View p0,BaseFragment p1){
       a.p(p0, "parentView");
       a.p(p1, "mFragment");
       super();
       this.G = p0;
       this.H = p1;
       this.U7(new w(false, 1, null));
       c uoc = b.b();
       uoc.b(Bitmap$Config.RGB_565);
       b uob = uoc.a();
       a.o(uob, "ImageDecodeOptions.newBu¡­p.Config.RGB_565\).build\(\)");
       this.C = uob;
       this.D = a1.a(0x7f062046);
       m1 om1 = m1.w0();
       a.o(om1, "KuaiShanManager.getInstance\(\)");
       this.E = om1;
       this.F = new x$e(this);
    }
    public void E8(){
       x obj1;
       int b;
       x b1;
       KSTemplateDetailInfo mCoverUrls;
       x x;
       StringBuilder str3;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, ox, "3")) {
          return;
       }
       x z = obj.z;
       if (z != null) {
          x r = obj.r;
          if (r == null) {
             a.S("mTemplateName");
          }
          r.setText(z.mName);
          r = obj.A;
          if (r != null) {
             KSSource kSSource = (r != null)? r.getKSSource(): objArray;
             if (kSSource == KSSource.SEARCH) {
                KSDataManager kSDataManage = KSDataManager.q.a();
                Objects.requireNonNull(kSDataManage);
                obj1 = PatchProxy.apply(objArray, kSDataManage, KSDataManager.class, "40");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   kSDataManage = kSDataManage.o;
                   b = (kSDataManage != null)? kSDataManage.a(): true;
                }
                if (!b) {
                   b1 = obj.B;
                   a.m(b1);
                   if (b1.get() > 0) {
                      b1 = obj.B;
                      a.m(b1);
                      b = b1.get() - 1;
                   label_0078 :
                      r.setPositionInGroup(b);
                   }
                }
             }
          label_006f :
             b1 = obj.B;
             a.m(b1);
             b = b1.get();
             goto label_0078 ;
          }
          Pair pair = PatchProxy.apply(objArray, obj, ox, "11");
          String str = "mTemplateCover";
          if (pair != patchProxyRe) {
          }else {
             float f = (float)obj.G.getWidth() / 2.00f;
             obj1 = obj.z;
             KSTemplateDetailInfo mHeight = (obj1 != null)? obj1.mHeight: 1;
             float f1 = (float)mHeight * f;
             KSTemplateDetailInfo mWidth = (obj1 != null)? obj1.mWidth: 1;
             f1 = f1 / (float)mWidth;
             float f2 = 0x3f100000;
             if ((f / f1) - f2 < 0) {
                f1 = f / f2;
             }
             obj1 = obj.q;
             if (obj1 == null) {
                a.S(str);
             }
             ViewGroup$LayoutParams layoutParams = obj1.getLayoutParams();
             layoutParams.width = (int)f;
             layoutParams.height = (int)f1;
             r = obj.q;
             if (r == null) {
                a.S(str);
             }
             r.setLayoutParams(layoutParams);
             pair = new Pair(Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
          }
          obj1 = obj.q;
          if (obj1 == null) {
             a.S(str);
          }
          obj1.setPlaceHolderImage(z.mPlaceholderDrawable);
          if (obj.H.K0()) {
             obj1 = obj.q;
             if (obj1 == null) {
                a.S(str);
             }
             mCoverUrls = z.mCoverUrls;
             a.o(mCoverUrls, "it.mCoverUrls");
             obj.V8(obj1, mCoverUrls, pair);
          }
          obj.X7(obj.H.n1().subscribe(new x$f(z, pair, obj)));
          int i = 0x7f062057;
          int i1 = 4;
          String str1 = "mTemplateUseCount";
          if (z.mUseCount - null > 0) {
             b1 = obj.t;
             if (b1 == null) {
                a.S(str1);
             }
             b1.setVisibility(0);
             b1 = obj.t;
             if (b1 == null) {
                a.S(str1);
             }
             b1.setText(TextUtils.N(z.mUseCount)+a1.p(R.string.arg_RES_7f10186d));
             b1 = obj.t;
             if (b1 == null) {
                a.S(str1);
             }
             ColorRoundTextView.v(b1, a1.a(i), 0, 2, objArray);
          }else {
             b1 = obj.t;
             if (b1 == null) {
                a.S(str1);
             }
             b1.setVisibility(i1);
          }
          if (!PatchProxy.applyVoidOneRefs(z, obj, ox, "6")) {
             str3 = "mTemplateMediaCount";
             if (z.mMediaCount <= null) {
                b1 = obj.s;
                if (b1 == null) {
                   a.S(str3);
                }
                b1.setVisibility(8);
             }else {
                b1 = obj.s;
                if (b1 == null) {
                   a.S(str3);
                }
                b1.setVisibility(0);
                b1 = obj.s;
                if (b1 == null) {
                   a.S(str3);
                }
                str3 = String.valueOf(z.mMediaCount);
                str1 = e.n(z);
                if (str1 == null) {
                   str1 = "";
                }
                b1.setText(str3+str1);
             }
          }
          mCoverUrls = z.mTag;
          if (!PatchProxy.applyVoidOneRefs(mCoverUrls, obj, ox, "9")) {
             str3 = "mTemplateTag";
             if (mCoverUrls == null || TextUtils.x(mCoverUrls.mTag)) {
                x = obj.u;
                if (x == null) {
                   a.S(str3);
                }
                x.setVisibility(i1);
             }else {
                x u = obj.u;
                if (u == null) {
                   a.S(str3);
                }
                u.setVisibility(0);
                u = obj.u;
                if (u == null) {
                   a.S(str3);
                }
                ColorRoundTextView.v(u, a1.a(i), 0, 2, objArray);
                x u1 = obj.u;
                if (u1 == null) {
                   a.S(str3);
                }
                u1.setText(mCoverUrls.mTag);
                Context context = this.getContext();
                a.m(context);
                Drawable drawable = ContextCompat.getDrawable(context, R.drawable.arg_RES_7f080f77);
                Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                Integer[] integerArray = PatchProxy.applyOneRefs(mCoverUrls, obj, ox, "10");
                if (integerArray != patchProxyRe) {
                }else if(a.g(mCoverUrls.mColor, "") && a.g(mCoverUrls.mSecondColor, "")){
                   integerArray = new Integer[]{Integer.valueOf(obj.D),Integer.valueOf(obj.D)};
                }else if((a.g(mCoverUrls.mColor, "") ^ 1) && (a.g(mCoverUrls.mSecondColor, "") ^ 1)){
                   integerArray = new Integer[]{Integer.valueOf(mCoverUrls.mKSTagColor),Integer.valueOf(mCoverUrls.mKSTagSecondColor)};
                }else if(a.g(mCoverUrls.mColor, "")){
                   integerArray = new Integer[]{Integer.valueOf(mCoverUrls.mKSTagSecondColor),Integer.valueOf(mCoverUrls.mKSTagSecondColor)};
                }else {
                   integerArray = new Integer[]{Integer.valueOf(mCoverUrls.mKSTagColor),Integer.valueOf(mCoverUrls.mKSTagColor)};
                }
                drawable.setColors(ArraysKt___ArraysKt.ny(integerArray));
             }
          }
          String str2 = "mKuaiyingTemplateTag";
          if (z.mTemplateType == 12) {
             x = obj.x;
             if (x == null) {
                a.S(str2);
             }
             x.setVisibility(0);
          }else {
             x = obj.x;
             if (x == null) {
                a.S(str2);
             }
             x.setVisibility(8);
          }
          x = obj.w;
          if (x == null) {
             a.S("mTemplateMainArea");
          }
          i0.N0(x, "kuaishan_"+z.mTemplateId);
       }
       return;
    }
    public void J8(){
       x ox = x.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ox, "4")) {
          return;
       }
       this.E.c(this.F);
       if (!PatchProxy.applyVoid(objArray, this, ox, "5")) {
          o1 oo1 = this.E.v0();
          if (oo1 != null) {
             oo1.close();
          }
          this.E.y0(objArray);
       }
       ox = this.v;
       if (ox == null) {
          a.S("mTemplateBottomArea");
       }
       ox.setVisibility(0);
       ox = this.x;
       if (ox == null) {
          a.S("mKuaiyingTemplateTag");
       }
       ox.setVisibility(8);
       return;
    }
    public final void P8(o1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSPreviewFragmentVertical", "goToKuaiShanEditPage: template="+p0.getTemplateId(), objArray);
       x tA = this.A;
       a.m(tA);
       Activity activity = this.getActivity();
       a.m(activity);
       a.o(activity, "activity!!");
       KuaiShanEditActivityV2.X.a(tA, p0, activity);
       return;
    }
    public final void R8(boolean p0){
       long l;
       k a;
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ox, "13")) {
          return;
       }
       if (this.getActivity() != null) {
          ox = this.A;
          if (ox != null) {
             a.m(ox);
             ox.resetTemplateSrc();
             ox = this.A;
             a.m(ox);
             ox.setEnableStrengthenEntrance(p0);
             ox = this.z;
             if (ox != null) {
                int i = 0;
                if (p0) {
                   l = System.currentTimeMillis();
                   ox.mRecentViewedTime = l;
                   ox.mRecentUsedTime = l;
                   a = k.a;
                   KSTemplateDetailInfo[] kSTemplateDe = new KSTemplateDetailInfo[]{ox};
                   KSDataManager$a q = KSDataManager.q;
                   a.e(CollectionsKt__CollectionsKt.r(kSTemplateDe), q.a());
                   a.d(ox, q.a());
                }
                l.i(ox.getId(), "template");
                if (ox.mTemplateType == 12 && p0) {
                   e.u(this.getContext(), ox);
                   return;
                }else {
                   boolean b = g7.b(ox);
                   if (b && p0) {
                      this.P8(new o1(ox, KSDownloadHelperX.o.d(ox)));
                   }else if(!b && (!ox.isShimmer() && (KSDownloadHelperX.o.e(ox) && p0))){
                      this.E.c(this.F);
                      this.E.d(this.F);
                      this.E.x0(ox);
                   }else {
                      x tA = this.A;
                      a.m(tA);
                      Activity activity = this.getActivity();
                      a.m(activity);
                      x tw = this.w;
                      if (tw == null) {
                         a.S("mTemplateMainArea");
                      }
                      KSPostPreviewActivity.J3(tA, activity, i, tw);
                   }
                }
             }
          }
       }
       return;
    }
    public final void S8(boolean p0,boolean p1){
       x a;
       KSSource kSSource;
       String str4;
       x z1;
       ClientContent$ContentPackage uContentPack;
       JSONObject jSONObject;
       Object[] objArray4;
       String str5;
       Object obj = this;
       boolean b = p0;
       boolean b1 = p1;
       j oj = j.class;
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), obj, ox, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSTemplateFeedListItemPresenter", "on template click, cover click:"+b+" useEntrance"+" click:"+b1, objArray);
       String str = "2";
       String str1 = "is_kuaiying_template";
       String str2 = "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage";
       String str3 = "";
       int i = 1;
       if (!b1) {
          x z = obj.z;
          if (z != null) {
             Activity activity = this.getActivity();
             Objects.requireNonNull(activity, str2);
             Activity uActivity = activity;
             a = obj.A;
             if (a != null) {
                kSSource = a.getKSSource();
                if (kSSource != null) {
                label_0072 :
                   if (kSSource == KSSource.SEARCH) {
                      str2 = str;
                   }else {
                      a = obj.A;
                      if (a != null) {
                         str2 = a.getGroupId();
                         if (str2 != null) {
                         label_0084 :
                            a.o(str2, "mKSLaunchParam?.groupId ?: \"\"");
                         }
                      }
                      str2 = str3;
                      goto label_0084 ;
                   }
                   x a1 = obj.A;
                   if (a1 != null) {
                      String groupName = a1.getGroupName();
                      if (groupName != null) {
                         str3 = groupName;
                      }
                   }
                   KSTemplateDetailInfo mTemplateId = z.mTemplateId;
                   KSTemplateDetailInfo mName = z.mName;
                   x b2 = obj.B;
                   int i1 = (b2 != null)? b2.get(): 0;
                   boolean b3 = (z.mFriendUseCount > 0)? true: false;
                   boolean b4 = (z.mTemplateType == 12)? true: false;
                   if (PatchProxy.isSupport(oj)) {
                      Object[] objArray1 = new Object[9];
                      objArray1[0] = uActivity;
                      objArray1[i] = str2;
                      objArray1[2] = str3;
                      objArray1[3] = mTemplateId;
                      objArray1[4] = mName;
                      objArray1[5] = Integer.valueOf(i1);
                      objArray1[6] = Boolean.valueOf(p0);
                      objArray1[7] = Boolean.valueOf(b3);
                      objArray1[8] = Boolean.valueOf(b4);
                      str4 = str;
                      if (!PatchProxy.applyVoid(objArray1, null, oj, "32")) {
                      }
                   }else {
                      str4 = str;
                   }
                }
             }
             kSSource = KSSource.EXTERNAL;
             goto label_0072 ;
          }else {
             str4 = str;
          }
       }else {
          str4 = str;
          z1 = obj.z;
          if (z1 != null) {
             Activity activity2 = this.getActivity();
             Objects.requireNonNull(activity2, str2);
             KSTemplateDetailInfo mTemplateId1 = z1.mTemplateId;
             b = (z1.mTemplateType == 12)? true: false;
             if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidThreeRefs(activity2, mTemplateId1, Boolean.valueOf(b), null, j.class, "34")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "USE_KUAISHAN_TEMPLATE_BUTTON";
                i3 oi3 = i3.f();
                oi3.d("template_id", mTemplateId1);
                oi3.a(str1, Boolean.valueOf(b));
                uElementPack.params = oi3.e();
                u1.L(str3, activity2, i, uElementPack, null);
             }
          }
       }
       z1 = obj.z;
       if (z1 == null) {
          Object[] objArray2 = new Object[0];
          e.D().t("KSTemplateFeedListItemPresenter", "template info is null", objArray2);
          return;
       }else {
          a.m(z1);
          if (e.q(z1) && (e.z() && b1)) {
             ox = obj.z;
             a.m(ox);
             Object[] objArray3 = new Object[0];
             e.D().w("KSTemplateFeedListItemPresenter", "showFaceChangeDialog when use button click , "+"templateId is "+ox.getId(), objArray3);
             Activity activity1 = this.getActivity();
             a.m(activity1);
             x z2 = obj.z;
             a.m(z2);
             ox = obj.z;
             a.m(ox);
             e.C(activity1, new x$g(obj, b1), null, z2.mPrivacyPolicyTitle, ox.mPrivacyPolicyUrl);
             return;
          }else {
             z1 = obj.A;
             KSSource kSSource1 = (z1 != null)? z1.getKSSource(): null;
             if (kSSource1 == KSSource.SEARCH) {
                z1 = obj.A;
                if (z1 != null) {
                   KSDataManager.q.a().G0(str4, z1.getPositionInGroup());
                }
             }
             obj.R8(b1);
             return;
          }
       }
    }
    public final void V8(KwaiImageView p0,List p1,Pair p2){
       boolean b1;
       boolean b2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, x.class, "8")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = null;
       Iterator obj1 = PatchProxy.applyOneRefs(p1, obj, uoa, "4");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(p1.isEmpty()){
          obj1 = p1.iterator();
          while (true) {
             if (obj1.hasNext()) {
                CDNUrl mUrl = obj1.next().mUrl;
                Object obj2 = PatchProxy.applyOneRefs(mUrl, obj, uoa, "3");
                if (obj2 != patchProxyRe) {
                   b2 = obj2.booleanValue();
                }else if(TextUtils.isEmpty(mUrl)){
                   String str = mUrl.toUpperCase();
                   if (str.endsWith(".JPG") || str.endsWith(".JPEG")) {
                      b2 = true;
                   }
                }
                b2 = false;
                if (b2) {
                   continue ;
                }
             }else {
                b1 = true;
             }
          }
       }
       b1 = false;
       a uoa1 = f.x().q(p1).o((int)(p2.getFirst().doubleValue() / 0x3ff8000000000000), (int)(p2.getSecond().doubleValue() / 0x3ff8000000000000));
       a.o(uoa1, "KwaiImageRequestGroupBui¡­ze.second / 1.5\).toInt\(\)\)");
       if (b1) {
          uoa1.j(this.C);
       }
       e[] uoeArray = uoa1.w();
       a.o(uoeArray, "requestBuilder.buildRequests\(\)");
       x tG = this.G;
       Objects.requireNonNull(tG, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
       if (tG.getScrollState() == b || this.G.getScrollState() == 2) {
          Object[] objArray = new Object[0];
          e.D().w("KSTemplateFeedListItemPresenter", "setImage\(\) disable autoplay", objArray);
          b = false;
       }
       d uod = Fresco.newDraweeControllerBuilder();
       uod.y(p0.getController());
       uod.q(b);
       uod.u(uoeArray);
       AbstractDraweeController uAbstractDra = uod.e();
       a.o(uAbstractDra, "Fresco.newDraweeControll¡­equests\)\n        .build\(\)");
       p0.setController(uAbstractDra);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.p = p0;
       View view = m1.f(p0, R.id.ks_template_cover);
       a.o(view, "bindWidget\(rootView, R.id.ks_template_cover\)");
       this.q = view;
       view = m1.f(p0, R.id.ks_template_name);
       a.o(view, "bindWidget\(rootView, R.id.ks_template_name\)");
       this.r = view;
       view = m1.f(p0, R.id.ks_template_media_count);
       a.o(view, "bindWidget\(rootView, R.id.ks_template_media_count\)");
       this.s = view;
       view = m1.f(p0, R.id.ks_template_use_count);
       a.o(view, "bindWidget\(rootView, R.id.ks_template_use_count\)");
       this.t = view;
       view = m1.f(p0, R.id.ks_template_tag);
       a.o(view, "bindWidget\(rootView, R.id.ks_template_tag\)");
       this.u = view;
       view = m1.f(p0, R.id.ks_feed_card_bottom_area);
       a.o(view, "bindWidget\(rootView, R.i¡­ks_feed_card_bottom_area\)");
       this.v = view;
       view = m1.f(p0, R.id.ks_feed_card_main_area);
       a.o(view, "bindWidget\(rootView, R.id.ks_feed_card_main_area\)");
       this.w = view;
       view = m1.f(p0, R.id.kuaiying_template_tag);
       a.o(view, "bindWidget\(rootView, R.id.kuaiying_template_tag\)");
       this.x = view;
       p0 = m1.f(p0, R.id.kuaishan_use_button);
       x tr = this.r;
       if (tr == null) {
          a.S("mTemplateName");
       }
       TextPaint paint = tr.getPaint();
       a.o(paint, "mTemplateName.paint");
       paint.setFakeBoldText(true);
       p0.setOnClickListener(new x$b(this));
       x tq = this.q;
       if (tq == null) {
          a.S("mTemplateCover");
       }
       tq.setOnClickListener(new x$c(this));
       tq = this.r;
       if (tq == null) {
          a.S("mTemplateName");
       }
       tq.setOnClickListener(new x$d(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.z = this.q8(KSTemplateDetailInfo.class);
       this.A = this.q8(KSLaunchParams.class);
       this.B = this.r8("ADAPTER_POSITION_GETTER");
       return;
    }
}
