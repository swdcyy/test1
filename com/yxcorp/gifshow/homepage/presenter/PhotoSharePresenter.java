package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$a;
import nsd.u;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$mMockMagicFaceRecoAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$mShareIconAdapter$2;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$e;
import java.util.ArrayList;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import ada.a;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$onBind$1;
import yta.s2;
import msd.l;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import dsa.e;
import q87.c;
import om6.q;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import yta.p2;
import erd.o;
import yta.q2;
import yta.r2;
import cua.a;
import lnc.s6;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.view.View;
import android.view.ViewStub;
import yta.n2;
import android.view.View$OnClickListener;
import qrd.l1;
import gua.a;
import com.yxcorp.gifshow.widget.magicFaceReco.HomeMockMagicFaceRecoRecyclerView;
import android.widget.TextView;
import yta.o2;
import android.graphics.drawable.Drawable;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$LayoutParams;
import com.kwai.framework.model.user.QCurrentUser;
import zsd.u;
import android.widget.RelativeLayout$LayoutParams;
import a2.i0;
import yta.j2;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import java.lang.Number;
import java.lang.Long;
import msa.d;
import k2b.u1;
import android.text.SpannableString;
import yta.i2;
import lnc.u9;
import y17.a;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import yta.f3;
import yta.g3;
import java.lang.System;
import com.yxcorp.utility.n;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$g;
import java.lang.Runnable;
import ekd.k1;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.kwai.framework.model.feed.BaseFeed;
import zp.d;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMetaExt;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gzc.a;
import jzc.a;
import java.util.List;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;
import v8c.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.TextUtils;
import lnc.e0;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.Iterable;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import gua.b;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$c;
import androidx.recyclerview.widget.RecyclerView$r;
import ekd.m1;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$handleShareIcon$layoutManager$1;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$d;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import wh5.c;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import yta.l3;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.f0;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$h;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$i;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$j;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$k;

public final class PhotoSharePresenter extends PresenterV2 implements g	// class@0017ad
{
    public PublishSubject A;
    public View B;
    public View C;
    public View D;
    public View E;
    public TextView F;
    public RecyclerView G;
    public HomeMockMagicFaceRecoRecyclerView H;
    public final p I;
    public final p J;
    public TextView K;
    public View L;
    public TextView M;
    public View N;
    public View O;
    public String P;
    public ProgressFragment Q;
    public b R;
    public boolean S;
    public long T;
    public final Runnable U;
    public a U0;
    public long V;
    public a V0;
    public List W;
    public final a$b W0;
    public List X;
    public final CardStyle X0;
    public String Y;
    public b Z;
    public PhotoMeta p;
    public QPhoto q;
    public CoverMeta r;
    public BaseFeed s;
    public BaseFragment t;
    public ViewStub u;
    public ViewStub v;
    public View w;
    public ViewGroup x;
    public PublishSubject y;
    public PublishSubject z;
    public static final PhotoSharePresenter$a Y0;

    static {
       PhotoSharePresenter.Y0 = new PhotoSharePresenter$a(null);
    }
    public void PhotoSharePresenter(CardStyle p0){
       a.p(p0, "mCardStyle");
       super();
       this.X0 = p0;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.y = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.z = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.A = publishSubje;
       this.I = s.c(new PhotoSharePresenter$mMockMagicFaceRecoAdapter$2(this));
       this.J = s.c(PhotoSharePresenter$mShareIconAdapter$2.INSTANCE);
       this.U = new PhotoSharePresenter$e(this);
       this.W = new ArrayList();
       this.X = new ArrayList();
       this.Y = "";
       this.W0 = new PhotoSharePresenter$f(this);
    }
    public void E8(){
       PostStatus uPLOAD_COMPL;
       PhotoSharePresenter p;
       PhotoSharePresenter p1;
       PhotoSharePresenter t;
       String photoId;
       PhotoSharePresenter q;
       Object[] objArray2;
       Boolean uBoolean;
       Boolean tRUE;
       Boolean uBoolean1;
       boolean i;
       ViewGroup$LayoutParams layoutParams1;
       long l;
       PhotoSharePresenter p2;
       PhotoSharePresenter m;
       int i2;
       boolean i3;
       int intrinsicWid;
       Object[] objArray3;
       int i4;
       View view;
       Object[] objArray7;
       String str = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoSharePresenter photoSharePr = PhotoSharePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, str, photoSharePr, "16")) {
          return;
       }
       str.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new s2(new PhotoSharePresenter$onBind$1(str))));
       String str1 = "mPhoto";
       String str2 = "PhotoSharePresenter";
       boolean b = false;
       if (!PatchProxy.applyVoid(objArray, str, photoSharePr, "23")) {
          uPLOAD_COMPL = PostStatus.UPLOADING;
          p = str.p;
          if (p == null) {
             a.S("mPhotoMeta");
          }
          if (uPLOAD_COMPL == p.mPostWorkStatus && this.S8()) {
             p1 = str.p;
             if (p1 == null) {
                a.S("mPhotoMeta");
             }
             if (p1.mMockFeedTarget == null && this.j9()) {
                p1 = str.Y;
                p = str.q;
                if (p == null) {
                   a.S(str1);
                }
                if (!TextUtils.n(p1, p.getMockFeedMagicFaceRecoTaskId())) {
                   p1 = str.q;
                   if (p1 == null) {
                      a.S(str1);
                   }
                   photoId = p1.getMockFeedMagicFaceRecoTaskId();
                   a.o(photoId, "mPhoto.mockFeedMagicFaceRecoTaskId");
                   str.Y = photoId;
                   Object[] objArray6 = new Object[b];
                   e.C().w(str2, "requestMagicFaceMockInfo", objArray6);
                   str.Z = y6.s(q.class, LoadPolicy.SILENT_IMMEDIATE).w(new p2(str)).subscribe(new q2(str), r2.b);
                }
             }
          }
       }
    label_00b1 :
       uPLOAD_COMPL = PostStatus.UPLOAD_COMPLETE;
       p = str.p;
       if (p == null) {
          a.S("mPhotoMeta");
       }
       String str3 = 1;
       if (uPLOAD_COMPL == p.mPostWorkStatus) {
          p1 = str.p;
          if (p1 == null) {
             a.S("mPhotoMeta");
          }
          if (p1.mMockFeedTarget != null) {
             this.h9();
          }else {
             a uoa = PatchProxy.apply(objArray, str, photoSharePr, "17");
             StringBuilder str4 = 9;
             String str5 = 6;
             Object[] objArray1 = 7;
             if (uoa != patchProxyRe) {
             }else {
                intrinsicWid = s6.v();
                boolean b1 = s6.F();
                if (this.S8()) {
                   Object obj2 = PatchProxy.apply(objArray, str, photoSharePr, "26");
                   if (obj2 != patchProxyRe) {
                      i4 = obj2.booleanValue();
                   }else {
                      q = str.W;
                      i4 = (q == null || q.isEmpty())? 1: 0;
                      i4 = i4 ^ str3;
                   }
                   if (i4) {
                      i4 = true;
                   label_0113 :
                      boolean b2 = (intrinsicWid != 5 && (intrinsicWid != objArray1 || !i4))? true: false;
                      boolean b3 = (b1 && i4)? true: false;
                      boolean b4 = (intrinsicWid != 5 && (intrinsicWid == str5 || (!i4 && (s6.E() || intrinsicWid == str4))))? true: false;
                      boolean b5 = (s6.E() && i4)? true: false;
                      p = str.X0;
                      i3 = (p == CardStyle.NORMAL_CARD_NORMAL_BOTTOM || (p == CardStyle.FOLLOW_CARD_V1 && b3))? true: false;
                      i = (intrinsicWid != 5 && (intrinsicWid != objArray1 || (!i4 && (intrinsicWid == str5 || (intrinsicWid == 8 && i4)))))? true: false;
                      a uoa2 = new a(Boolean.valueOf(b1), Integer.valueOf(intrinsicWid), Boolean.valueOf(i4), Boolean.valueOf(b2), Boolean.valueOf(b3), Boolean.valueOf(b4), Boolean.valueOf(b5), Boolean.valueOf(i3), Boolean.valueOf(i));
                      objArray2 = new Object[b];
                      e.C().w(str2, "buildMagicFaceRecoConfig "+str.V0, objArray2);
                      uoa = v32;
                   }
                }
                i4 = false;
                goto label_0113 ;
             }
             str.V0 = uoa;
             if (!PatchProxy.applyVoid(objArray, str, photoSharePr, "20")) {
                if (str.C == null) {
                   p1 = str.u;
                   if (p1 == null) {
                      a.S("mViewStubShare");
                   }
                   view = p1.inflate();
                   str.C = view;
                   if (view != null) {
                      View view1 = view.findViewById(R.id.photo_share_container);
                      view1.setOnClickListener(new n2(str));
                      str.B = view1;
                      p = str.N;
                      a uoa1 = (p != null)? new a(p): objArray;
                      str.U0 = uoa1;
                      str.H = view.findViewById(0x7f0a12b7);
                      str.F = view.findViewById(0x7f0a3912);
                      str.L = view.findViewById(0x7f0a4341);
                      str.M = view.findViewById(0x7f0a4342);
                      TextView textView = view.findViewById(R.id.upload_share_text_exp1);
                      textView.setOnClickListener(new o2(str));
                      str.K = textView;
                      view = view.findViewById(R.id.photo_share_background_mask);
                      if (view != null) {
                         p = str.V0;
                         tRUE = (p != null)? p.g(): objArray;
                         if (a.g(tRUE, Boolean.TRUE)) {
                            view.setBackground(a1.f(R.color.arg_RES_7f061c15));
                         }
                      }else {
                         Object[] objArray4 = objArray;
                      }
                      str.E = view;
                   }
                }
                p1 = str.V0;
                uBoolean = (p1 != null)? p1.d(): objArray;
                tRUE = Boolean.TRUE;
                if (a.g(uBoolean, tRUE) && str.D == null) {
                   p1 = str.v;
                   if (p1 == null) {
                      a.S("mViewStubBottom");
                   }
                   view = p1.inflate();
                   str.D = view;
                   view = (view != null)? view.findViewById(R.id.share_recycler_bottom_layout_wrap): objArray;
                   str.O = view;
                }
                p1 = str.D;
                if (p1 != null) {
                   q = str.V0;
                   uBoolean1 = (q != null)? q.a(): objArray;
                   Drawable uDrawable1 = (a.g(uBoolean1, tRUE) ^ 1)? a1.f(R.drawable.arg_RES_7f080da1): a1.f(R.drawable.arg_RES_7f080da2);
                   p1.setBackground(uDrawable1);
                }
                p1 = str.N;
                if (p1 != null) {
                   view = p1.findViewById(R.id.photo_share_main_layout);
                   if (view != null) {
                      q = str.V0;
                      uBoolean1 = (q != null)? q.d(): objArray;
                      i4 = (a.g(uBoolean1, tRUE))? a1.d(R.dimen.arg_RES_7f07030d): 0;
                      view.setPadding(b, b, b, i4);
                   }
                }
                p1 = str.V0;
                uBoolean = (p1 != null)? p1.c(): objArray;
                i3 = 0x7f0a1118;
                if (a.g(uBoolean, tRUE)) {
                   objArray2 = new Object[b];
                   e.C().w(str2, "initLayout shareIconStyleV2", objArray2);
                   str.G = str.k8(0x7f0a1119);
                   p1 = str.O;
                   if (p1 != null) {
                      p1.setVisibility(b);
                   }
                   p1 = str.N;
                   if (p1 != null) {
                      view = p1.findViewById(i3);
                      if (view != null) {
                         view.setVisibility(8);
                      }
                   }
                }else {
                   objArray2 = new Object[b];
                   e.C().w(str2, "initLayout shareIcon normal style", objArray2);
                   str.G = str.k8(i3);
                   p1 = str.O;
                   if (p1 != null) {
                      p1.setVisibility(8);
                   }
                }
             }
          label_0332 :
             if (!PatchProxy.applyVoid(objArray, str, photoSharePr, "22")) {
                p1 = str.B;
                if (p1 != null) {
                   p1.getLayoutParams();
                }
                p1 = str.q;
                if (p1 == null) {
                   a.S(str1);
                }
                photoId = p1.getPhotoId();
                if (photoId != null) {
                   QCurrentUser qCurrentUser = QCurrentUser.me();
                   a.o(qCurrentUser, "QCurrentUser.me\(\)");
                   if (u.H1(photoId, "-"+qCurrentUser.getId(), b, 2, objArray) == true) {
                      e uoe = e.C();
                      str4 = "PhotoId Err: ";
                      q = str.q;
                      if (q == null) {
                         a.S(str1);
                      }
                      objArray2 = new Object[b];
                      uoe.t(str2, str4+q.getPhotoId(), objArray2);
                   }
                }
                p1 = str.V0;
                uBoolean = (p1 != null)? p1.d(): objArray;
                tRUE = Boolean.TRUE;
                if (a.g(uBoolean, tRUE)) {
                   objArray2 = new Object[b];
                   e.C().w(str2, "enable show bottom view", objArray2);
                   p1 = str.D;
                   ViewGroup$LayoutParams layoutParams = (p1 != null)? p1.getLayoutParams(): objArray;
                   if (layoutParams instanceof RelativeLayout$LayoutParams) {
                      q = str.V0;
                      uBoolean1 = (q != null)? q.a(): objArray;
                      i = 12;
                      if (a.g(uBoolean1, tRUE)) {
                         objArray1 = new Object[b];
                         e.C().w(str2, "shareContainer align parent bottom", objArray1);
                         layoutParams1 = layoutParams;
                         layoutParams1.removeRule(8);
                         layoutParams1.addRule(i);
                      }else {
                         Object[] objArray5 = new Object[b];
                         e.C().w(str2, "shareContainer align photo_cover_container ", objArray5);
                         layoutParams1 = layoutParams;
                         layoutParams1.removeRule(i);
                         layoutParams1.addRule(8, R.id.photo_cover_container);
                      }
                      q = str.D;
                      if (q != null) {
                         q.setLayoutParams(layoutParams);
                      }
                      p1 = str.D;
                      if (p1 != null) {
                         p1.setVisibility(b);
                      }
                   }
                }else {
                   p1 = str.D;
                   if (p1 != null) {
                      p1.setVisibility(8);
                   }
                }
                p1 = str.C;
                if (p1 != null) {
                   p1.setVisibility(b);
                }
                p1 = str.B;
                if (p1 != null) {
                   p1.setVisibility(b);
                }
                if (this.j9()) {
                   objArray2 = new Object[b];
                   e.C().w(str2, "view visible", objArray2);
                }
                p1 = str.B;
                a.m(p1);
                if (i0.X(p1)) {
                   p1 = str.p;
                   if (p1 == null) {
                      a.S("mPhotoMeta");
                   }
                   p1.mPostWorkStatus = objArray;
                }else {
                   p1 = str.B;
                   if (p1 != null) {
                      p1.addOnAttachStateChangeListener(new j2(str));
                   }
                }
                p1 = str.F;
                if (p1 != null) {
                   p1.setText(R.string.arg_RES_7f103c52);
                }
                p1 = str.q;
                if (p1 == null) {
                   a.S(str1);
                }
                if (p1.getShowFlowFeedback()) {
                   p1 = str.V0;
                   uBoolean = (p1 != null)? p1.g(): objArray;
                   if (a.g(uBoolean, tRUE) ^ 1) {
                      str.A.onNext(tRUE);
                      str.y.onNext(Boolean.FALSE);
                      if (this.W8() - 0x3f200000 < 0) {
                         p1 = str.G;
                         if (p1 != null) {
                            p1.setVisibility(8);
                         }
                         p1 = str.H;
                         if (p1 != null) {
                            p1.setVisibility(8);
                         }
                      }else {
                         this.e9();
                         this.d9();
                      }
                   }else {
                   label_04af :
                      str.A.onNext(Boolean.FALSE);
                      p1 = str.V0;
                      uBoolean = (p1 != null)? p1.e(): objArray;
                      i4 = 1;
                      if (a.g(uBoolean, tRUE) ^ i4) {
                         p1 = str.V0;
                         uBoolean = (p1 != null)? p1.d(): objArray;
                         if (a.g(uBoolean, tRUE) ^ i4) {
                            objArray2 = new Object[b];
                            e.C().w(str2, "doUploadComplete FansPromote normal style", objArray2);
                            str.y.onNext(tRUE);
                         }
                      }
                      this.e9();
                      this.d9();
                   }
                }else {
                   goto label_04af ;
                }
                p1 = str.q;
                if (p1 == null) {
                   a.S(str1);
                }
                Drawable obj = PatchProxy.apply(objArray, str, photoSharePr, "33");
                if (obj != patchProxyRe) {
                   l = obj.longValue();
                }else {
                   p2 = str.q;
                   if (p2 == null) {
                      a.S(str1);
                   }
                   Long longx = Long.valueOf(p2.getUserId());
                   a.o(longx, "java.lang.Long.valueOf\(mPhoto.userId\)");
                   l = longx.longValue();
                }
                d uod = d.class;
                if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(p1, Long.valueOf(l), objArray, uod, "8")) {
                   d.d("2", p1, l);
                }
                str.P = u1.f();
                if (!PatchProxy.applyVoid(objArray, str, photoSharePr, "38")) {
                   p1 = str.L;
                   if (p1 != null) {
                      p1.setVisibility(b);
                   }
                   p1 = str.p;
                   if (p1 == null) {
                      a.S("mPhotoMeta");
                   }
                   PhotoMeta mMockFeedUpl = p1.mMockFeedUploadSuccessText;
                   PhotoSharePresenter v0 = str.V0;
                   Boolean uBoolean2 = (v0 != null)? v0.g(): objArray;
                   if (a.g(uBoolean2, tRUE)) {
                      v0 = str.M;
                      float f = 14.00f;
                      if (v0 != null) {
                         v0.setTextSize(b, (float)a1.e(f));
                      }
                      v0 = str.K;
                      if (v0 != null) {
                         v0.setTextSize(b, (float)a1.e(f));
                      }
                   }
                   obj = a1.f(R.drawable.arg_RES_7f0821f6);
                   obj.setBounds(b, b, a1.e(5.00f), a1.e(9.00f));
                   q = str.K;
                   if (q != null) {
                      q.setCompoundDrawables(objArray, objArray, obj, objArray);
                   }
                   if (mMockFeedUpl != null) {
                      p2 = str.p;
                      if (p2 == null) {
                         a.S("mPhotoMeta");
                      }
                      if (p2.isPublic()) {
                         m = str.M;
                         if (m != null) {
                            m.setPadding(a1.e(19.00f), b, a1.e(19.00f), b);
                         }
                         m = str.M;
                         if (m != null) {
                            p2 = str.p;
                            if (p2 == null) {
                               a.S("mPhotoMeta");
                            }
                            PhotoMeta mMockFeedPos = p2.mMockFeedPostAgainText;
                            a obj1 = PatchProxy.applyTwoRefs(mMockFeedUpl, mMockFeedPos, str, photoSharePr, "39");
                            if (obj1 != patchProxyRe) {
                               mMockFeedUpl = obj1;
                            }else if(mMockFeedPos == null || !mMockFeedPos.length()){
                               i = 1;
                            }else {
                               i = 0;
                            }
                            if (!i) {
                               int i1 = mMockFeedUpl.length();
                               i2 = mMockFeedPos.length() + i1;
                               i3 = i2 + 1;
                               SpannableString spannableStr = new SpannableString(mMockFeedUpl+mMockFeedPos+"#"+"_");
                               spannableStr.setSpan(new i2(str), i1, i2, 17);
                               spannableStr.setSpan(new u9(a1.d(R.dimen.arg_RES_7f07031b)), i2, i3, 17);
                               Drawable uDrawable = a1.f(R.drawable.arg_RES_7f0821f6).mutate();
                               a.o(uDrawable, "CommonUtil.drawable\(R.dr¡­moreshot_arrows\).mutate\(\)");
                               obj1 = new a(uDrawable, "_");
                               intrinsicWid = uDrawable.getIntrinsicWidth();
                               obj1.c(intrinsicWid, uDrawable.getIntrinsicHeight());
                               spannableStr.setSpan(obj1, i3, (i3 + 1), 17);
                               mMockFeedUpl = spannableStr;
                            }
                            m.setText(mMockFeedUpl);
                         }
                         t = str.K;
                         if (t != null) {
                            t.setVisibility(8);
                         }
                         t = str.p;
                         if (t == null) {
                            a.S("mPhotoMeta");
                         }
                         PhotoMeta mMockFeedPos1 = t.mMockFeedPostAgainText;
                         if (mMockFeedPos1 == null || !mMockFeedPos1.length()) {
                            b = true;
                         }
                         if (!b) {
                            t = str.M;
                            if (t != null) {
                               t.setMovementMethod(LinkMovementMethod.getInstance());
                            }
                            this.o9();
                         }
                      }else {
                      label_067c :
                         t = str.V0;
                         Boolean uBoolean3 = (t != null)? t.g(): objArray;
                         i2 = 0x7f104fad;
                         if (a.g(uBoolean3, tRUE)) {
                            t = str.V0;
                            uBoolean3 = (t != null)? t.f(): objArray;
                            if (a.g(uBoolean3, tRUE)) {
                               t = str.K;
                               if (t != null) {
                                  t.setVisibility(8);
                               }
                               t = str.M;
                               if (t != null) {
                                  t.setPadding(b, b, b, b);
                               }
                               t = str.V0;
                               if (t != null) {
                                  objArray = t.b;
                               }
                               if (objArray != null && (objArray.intValue() == 5 || (objArray != null && objArray.intValue() == 6))) {
                                  t = str.M;
                                  if (t != null) {
                                     t.setText(a1.p(R.string.arg_RES_7f100fea));
                                  }
                                  t = str.K;
                                  if (t != null) {
                                     t.setVisibility(8);
                                  }
                               }else if(objArray != null && (objArray.intValue() == 7 || (objArray != null && objArray.intValue() == 8))){
                                  t = str.M;
                                  if (t != null) {
                                     t.setText(a1.p(R.string.arg_RES_7f10102f));
                                  }
                                  t = str.K;
                                  if (t != null) {
                                     t.setVisibility(8);
                                  }
                               }else if(objArray != null && objArray.intValue() == 9){
                                  t = str.M;
                                  if (t != null) {
                                     t.setPadding(b, b, b, b);
                                  }
                                  t = str.M;
                                  if (t != null) {
                                     t.setText(a1.p(i2));
                                  }
                                  t = str.K;
                                  if (t != null) {
                                     t.setText(a1.p(R.string.arg_RES_7f101030));
                                  }
                                  t = str.K;
                                  if (t != null) {
                                     t.setVisibility(b);
                                  }
                                  t = str.K;
                                  if (t != null) {
                                     t.setOnClickListener(new f3(str));
                                  }
                                  d.c();
                               }else {
                                  t = str.M;
                                  if (t != null) {
                                     t.setText(a1.p(i2));
                                  }
                                  t = str.K;
                                  if (t != null) {
                                     t.setVisibility(8);
                                  }
                               }
                            }
                         }
                         t = str.M;
                         if (t != null) {
                            t.setPadding(b, b, b, b);
                         }
                         t = str.M;
                         if (t != null) {
                            t.setText(a1.p(i2));
                         }
                         t = str.K;
                         if (t != null) {
                            t.setText(a1.p(R.string.arg_RES_7f104fac));
                         }
                         t = str.K;
                         if (t != null) {
                            t.setVisibility(b);
                         }
                         t = str.K;
                         if (t != null) {
                            t.setOnClickListener(new g3(str));
                         }
                         this.o9();
                      }
                   }else {
                      goto label_067c ;
                   }
                label_0794 :
                   t = str.F;
                   if (t != null) {
                      t.setVisibility(8);
                   }
                }
             }
          label_079b :
             str.T = System.currentTimeMillis();
          }
       }else {
          long l1 = System.currentTimeMillis() - str.T;
          i = (l1 - (long)500 > 0)? true: false;
          if (this.j9()) {
             m = str.p;
             if (m == null) {
                a.S("mPhotoMeta");
             }
             if (m.mPostWorkStatus == null) {
                objArray7 = new Object[b];
                e.C().w(str2, "needGone = "+i+" time diff = "+l1, objArray7);
             }
          }
          if (i) {
             View[] viewArray = new View[]{str.C,str.B,str.D};
             n.Z(8, viewArray);
             if (this.j9()) {
                objArray7 = new Object[b];
                e.C().w(str2, "view gone", objArray7);
             }
          }
       }
       t = str.t;
       if (t == null) {
          a.S("mFragment");
       }
       str.X7(t.m().subscribe(new PhotoSharePresenter$g(str)));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, PhotoSharePresenter.class, "15")) {
          return;
       }
       PhotoSharePresenter tR = this.R;
       if (tR != null && tR != null) {
          tR.dispose();
       }
       tR = this.Z;
       if (tR != null && tR != null) {
          tR.dispose();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, PhotoSharePresenter.class, "19")) {
          return;
       }
       k1.m(this.U);
       return;
    }
    public final String P8(String p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, this, PhotoSharePresenter.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("magic_face_id", p0);
       p0 = obj.toString();
       a.o(p0, "jsonObject.toString\(\)");
       return p0;
    }
    public final String R8(){
       JsonObject obj = PatchProxy.apply(null, this, PhotoSharePresenter.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("record_task_id", this.P);
       String str = obj.toString();
       a.o(str, "jsonObject.toString\(\)");
       return str;
    }
    public final boolean S8(){
       PhotoSharePresenter obj = PatchProxy.apply(null, this, PhotoSharePresenter.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.W8() - (float)1 > 0) {
          obj = this.q;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (!TextUtils.x(obj.getMockFeedMagicFaceRecoId())) {
             obj = this.q;
             if (obj == null) {
                a.S("mPhoto");
             }
             if (!TextUtils.x(obj.getMockFeedMagicFaceRecoTaskId())) {
                return 1;
             }
          }
       }
    label_0043 :
       return false;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, PhotoSharePresenter.class, "49")) {
          return;
       }
       PhotoSharePresenter tQ = this.Q;
       if (tQ != null && (tQ.isAdded() == true && this.S == null)) {
          tQ = this.Q;
          if (tQ != null) {
             tQ.dismiss();
          }
          this.Q = null;
       }
    label_0024 :
       this.R = null;
       return;
    }
    public final float W8(){
       PhotoSharePresenter obj = PatchProxy.apply(null, this, PhotoSharePresenter.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.s;
       if (obj == null) {
          a.S("mFeed");
       }
       float f = d.a(obj);
       if (f - (float)0 < 0) {
          obj = this.r;
          if (obj == null) {
             a.S("mCoverMeta");
          }
          f = CoverMetaExt.getCoverAspectRatio(obj);
       }
       return f;
    }
    public final BaseFragment X8(){
       PhotoSharePresenter obj = PatchProxy.apply(null, this, PhotoSharePresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj;
    }
    public final a Y8(){
       Object obj = PatchProxy.apply(null, this, PhotoSharePresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.getValue();
    }
    public final QPhoto Z8(){
       PhotoSharePresenter obj = PatchProxy.apply(null, this, PhotoSharePresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final a a9(){
       Object obj = PatchProxy.apply(null, this, PhotoSharePresenter.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.J.getValue();
    }
    public final long b9(){
       return this.V;
    }
    public final int c9(boolean p0){
       int i = (p0)? 1: 3;
       return i;
    }
    public final void d9(){
       Object[] objArray1;
       Object[] objArray2;
       PhotoSharePresenter tU0;
       a c;
       Object[] objArray4;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoSharePresenter.class, "24")) {
          return;
       }
       PhotoSharePresenter tV0 = this.V0;
       Boolean uBoolean = (tV0 != null)? tV0.f(): objArray;
       Boolean tRUE = Boolean.TRUE;
       String str = "PhotoShareMagicFaceViewBinder";
       int i = 8;
       String str1 = "PhotoSharePresenter";
       int i1 = 0;
       if (a.g(uBoolean, tRUE) ^ 0x01) {
          objArray1 = new Object[i1];
          e.C().w(str1, "hide magicFaceReco", objArray1);
          tV0 = this.H;
          if (tV0 != null) {
             tV0.setVisibility(i);
          }
          this.W.clear();
          this.X.clear();
          tV0 = this.U0;
          if (tV0 != null && !PatchProxy.applyVoid(objArray, tV0, uoa, "2")) {
             objArray2 = new Object[i1];
             e.C().w(str, "hideLayout", objArray2);
             tV0.a();
             if (!PatchProxy.applyVoid(objArray, tV0, uoa, "3")) {
                uoa = tV0.a;
                if (uoa != null) {
                   uoa.setVisibility(i);
                }
                uoa = tV0.b;
                if (uoa != null) {
                   uoa.setVisibility(i);
                }
             }
          }
          return;
       }else {
          Object[] objArray3 = new Object[i1];
          e.C().w(str1, "show magicFaceReco", objArray3);
          tV0 = this.V0;
          uBoolean = (tV0 != null)? tV0.g(): objArray;
          if (a.g(uBoolean, tRUE)) {
             objArray1 = new Object[i1];
             e.C().w(str1, "show magicFaceReco NewMockFeedCardStyle", objArray1);
             tV0 = this.U0;
             if (tV0 != null && !PatchProxy.applyVoid(objArray, tV0, uoa, "1")) {
                objArray2 = new Object[i1];
                e.C().w(str, "attach", objArray2);
                RelativeLayout relativeLayo = tV0.h.findViewById(R.id.photo_share_container_bottom);
                tV0.a = relativeLayo;
                relativeLayo = (relativeLayo != null)? relativeLayo.findViewById(R.id.home_follow_mock_magic_face_card_v1_bottom): objArray;
                tV0.b = relativeLayo;
                tV0.c = tV0.h.findViewById(0x7f0a12b6);
             }
             tV0 = this.U0;
             if (tV0 != null) {
                a uoa1 = this.W.get(i1);
                if (!PatchProxy.applyVoidOneRefs(uoa1, tV0, uoa, "6")) {
                   a.p(uoa1, "magicInfo");
                   if (s6.F()) {
                      if (s6.E()) {
                         objArray3 = new Object[i1];
                         e.C().w(str, "showMagicFaceCard:  isMockCardStyleV2 show middle card", objArray3);
                         c = tV0.c;
                         if (!PatchProxy.applyVoid(objArray, tV0, uoa, "5")) {
                            uoa = tV0.b;
                            if (uoa != null) {
                               uoa.setVisibility(i);
                            }
                         }
                      }else {
                         Object[] objArray5 = new Object[i1];
                         e.C().w(str, "showMagicFaceCard:  isMockCardStyleV2 show bottom card", objArray5);
                         uoa = tV0.a;
                         if (uoa != null) {
                            uoa.setVisibility(i1);
                         }
                         c = tV0.b;
                         tV0.a();
                      }
                      if (c != null) {
                         c.setVisibility(i1);
                      }
                      KwaiImageView kwaiImageVie = (c != null)? c.findViewById(R.id.magic_face_image): objArray;
                      tV0.e = kwaiImageVie;
                      TextView textView = (c != null)? c.findViewById(R.id.magic_face_title_text): objArray;
                      tV0.d = textView;
                      textView = (c != null)? c.findViewById(R.id.magic_face_to_record_text): objArray;
                      tV0.f = textView;
                      uoa = tV0.d;
                      if (uoa != null) {
                         uoa.setText(uoa1.d());
                      }
                      if (!TextUtils.isEmpty(uoa1.b())) {
                         uoa = tV0.e;
                         if (uoa != null) {
                            String[] stringArray = e0.a(uoa1.c(), uoa1.b());
                            a.o(stringArray, "\(CDNUtil.convertToUrls\(\n¡­agicInfo.image\n        \)\)");
                            uoa.O(ArraysKt___ArraysKt.uy(stringArray), objArray);
                         }
                      }
                      uoa = tV0.f;
                      if (uoa != null) {
                         uoa.setOnClickListener(new b(tV0, uoa1));
                      }
                   }
                }
             }
             this.k9(this.W.get(i1).a());
             tU0 = this.U0;
             if (tU0 != null) {
                tU0.g = new PhotoSharePresenter$b(this);
             }
          }else {
             Object[] objArray6 = new Object[i1];
             e.C().w(str1, "show magicFaceReco oldMockFeedCardStyle, show recycler", objArray6);
             tU0 = this.H;
             if (tU0 != null) {
                tU0.setLayoutManager(new LinearLayoutManager(this.getContext(), i1, i1));
             }
             tU0 = this.H;
             if (tU0 != null) {
                tU0.setAdapter(this.Y8());
             }
             this.Y8().W0(this.W);
             tU0 = this.H;
             if (tU0 != null) {
                tU0.setVisibility(i1);
             }
             this.Y8().k0();
             this.X.clear();
             tU0 = this.H;
             if (tU0 != null) {
                tU0.addOnScrollListener(new PhotoSharePresenter$c(this));
             }
          }
          return;
       }
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoSharePresenter.class, "14")) {
          return;
       }
       a.p(p0, "view");
       this.N = p0;
       view = m1.f(p0, R.id.photo_share_container);
       a.o(view, "ViewBindUtils.bindWidget¡­id.photo_share_container\)");
       this.u = view;
       view = m1.f(p0, R.id.player_cover);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.player_cover\)");
       this.w = view;
       view = m1.f(p0, R.id.container);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.container\)");
       this.x = view;
       p0 = m1.f(p0, R.id.photo_share_container_bottom_stub);
       a.o(p0, "ViewBindUtils.bindWidget¡­re_container_bottom_stub\)");
       this.v = p0;
       return;
    }
    public final void e9(){
       PhotoSharePresenter tG1;
       int i2;
       Boolean obj;
       int i4;
       int b;
       PhotoSharePresenter tV0;
       PhotoSharePresenter tO;
       TextView textView;
       PhotoSharePresenter tG2;
       Object[] objArray1;
       a d;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoSharePresenter photoSharePr = PhotoSharePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoSharePr, "29")) {
          return;
       }
       PhotoSharePresenter tG = this.G;
       int i = 0;
       if (tG != null) {
          tG.setVisibility(i);
       }
       tG = this.G;
       RecyclerView$Adapter adapter = (tG != null)? tG.getAdapter(): objArray;
       if (adapter == null) {
          PhotoSharePresenter$handleShareIcon$layoutManager$1 ohandleShare = new PhotoSharePresenter$handleShareIcon$layoutManager$1(this, this.getContext(), i, i);
          tG1 = this.G;
          if (tG1 != null) {
             tG1.setLayoutManager(ohandleShare);
          }
          tG = this.G;
          if (tG != null) {
             tG.setAdapter(this.a9());
          }
          tG = this.G;
          if (tG != null) {
             tG.addItemDecoration(new PhotoSharePresenter$d(this));
          }
       }
       a uoa = this.a9();
       tG1 = this.q;
       if (tG1 == null) {
          a.S("mPhoto");
       }
       uoa.w = tG1;
       Context context = this.getContext();
       List list = PatchProxy.applyOneRefs(context, this, photoSharePr, "35");
       int i1 = 2;
       Boolean uBoolean = 3;
       if (list != patchProxyRe) {
       }else {
          ArrayList uArrayList = PatchProxy.applyOneRefs(context, this, photoSharePr, "36");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             if (SystemUtil.U(context)) {
                uArrayList.add(KwaiOp.FORWARD_WECHAT_FRIEND);
                uArrayList.add(KwaiOp.FORWARD_WECHAT_MOMENT);
             }
             if (SystemUtil.Q(context)) {
                uArrayList.add(KwaiOp.FORWARD_QQ);
                uArrayList.add(KwaiOp.FORWARD_QZONE);
             }
             if (SystemUtil.V(context)) {
                uArrayList.add(KwaiOp.FORWARD_WEIBO);
             }
             uArrayList.add(KwaiOp.FORWARD_IMFRIEND);
             uArrayList.add(KwaiOp.COPY_LINK);
          }
          b = (uArrayList.size() >= uBoolean)? 3: uArrayList.size();
          List list1 = uArrayList.subList(i, b);
          Boolean obj1 = PatchProxy.apply(objArray, this, photoSharePr, "34");
          i2 = (obj1 != patchProxyRe)? obj1.booleanValue(): c.h() ^ 1;
          if (i2) {
             list1 = new ArrayList();
             list1.add(KwaiOp.SAVE_ALBUM);
          }else {
             tV0 = this.V0;
             obj1 = (tV0 != null)? tV0.e(): objArray;
             obj = Boolean.TRUE;
             if (a.g(obj1, obj)) {
                list1 = new ArrayList();
                list1.add(uArrayList.get(i));
                tG1 = this.V0;
                d = (tG1 != null)? tG1.d: objArray;
                if (a.g(d, obj)) {
                   list1.add(KwaiOp.SAVE_ALBUM);
                }
                list1.add(KwaiOp.FANS_PROMOTE);
             }else if(list1.size() == uBoolean){
                list1 = list1.subList(i, i1);
                list1.add(KwaiOp.SAVE_ALBUM);
             }else {
                list1.add(KwaiOp.SAVE_ALBUM);
             }
          }
          list = list1;
       }
       this.a9().W0(list);
       uoa = this.a9();
       i2 = this.a9().Q0().size();
       int i3 = 0x7f070313;
       if (PatchProxy.isSupport(photoSharePr)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(i2), this, photoSharePr, "30");
          if (obj != patchProxyRe) {
             i4 = obj.intValue();
          }else {
          label_0162 :
             tG2 = this.V0;
             Boolean uBoolean2 = (tG2 != null)? tG2.b(): objArray;
             obj = Boolean.TRUE;
             if (a.g(uBoolean2, obj)) {
                i4 = (i2 < uBoolean)? 0x7f070313: 0x7f07030d;
                i4 = a1.d(i4);
             }else {
                tG2 = this.V0;
                uBoolean2 = (tG2 != null)? tG2.c(): objArray;
                if (a.g(uBoolean2, obj)) {
                   i4 = (i2 < uBoolean)? 0x7f0702ef: 0x7f0702df;
                   i4 = a1.d(i4);
                }else {
                   i4 = -1;
                }
             }
          }
       }else {
          goto label_0162 ;
       }
       uoa.y = i4;
       this.a9().k0();
       this.a9().x = this.W0;
       if (!PatchProxy.applyVoid(objArray, this, photoSharePr, "37")) {
          float f = this.W8();
          photoSharePr = this.G;
          ViewGroup$LayoutParams layoutParams = (photoSharePr != null)? photoSharePr.getLayoutParams(): objArray;
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          tG = this.V0;
          Boolean uBoolean1 = (tG != null)? tG.b(): objArray;
          uBoolean = Boolean.TRUE;
          b = a.g(uBoolean1, uBoolean);
          tV0 = this.V0;
          if (tV0 != null) {
             objArray = tV0.c();
          }
          boolean b1 = a.g(objArray, uBoolean);
          if (b || b1) {
             i2 = this.a9().getItemCount();
             if (b) {
                layoutParams.topMargin = (f - 0x3f200000 <= 0)? a1.d(0x7f070271): a1.d(0x7f0702cc);
             }
          label_029e :
             if (i2 != 1) {
                i4 = 0x7f0a2a13;
                if (i2 != i1) {
                   if (b1) {
                      layoutParams.width = a1.d(0x7f070354);
                      tO = this.O;
                      if (tO != null) {
                         tO.setPadding(a1.d(R.dimen.arg_RES_7f07034b), i, a1.d(R.dimen.arg_RES_7f07034b), i);
                      }
                      tO = this.O;
                      if (tO != null) {
                         textView = tO.findViewById(i4);
                         if (textView != null) {
                            textView.setTextSize(1, 11.00f);
                         }
                      }
                   }else {
                      layoutParams.width = a1.d(0x7f070c0d);
                   }
                }else if(b1){
                   layoutParams.width = a1.d(0x7f07033b);
                   tO = this.O;
                   if (tO != null) {
                      tO.setPadding(a1.d(R.dimen.arg_RES_7f07025d), i, a1.d(R.dimen.arg_RES_7f07025d), i);
                   }
                   tO = this.O;
                   if (tO != null) {
                      textView = tO.findViewById(i4);
                      if (textView != null) {
                         textView.setTextSize(1, 12.00f);
                      }
                   }
                }else {
                   layoutParams.width = a1.d(0x7f070268);
                }
             }else if(b1){
                i3 = 0x7f07032c;
             }
             layoutParams.width = a1.d(i3);
          }else {
             v2 = f - 0x3f200000;
             if (b1 <= 0) {
                layoutParams.topMargin = i;
             }else if(f - 0x3f400000 <= 0){
                layoutParams.topMargin = a1.d(0x7f071051);
             }else {
                layoutParams.topMargin = a1.d(0x7f071052);
             }
             tG2 = this.G;
             if (tG2 != null) {
                tG2.setPadding(i, i, i, i);
             }
             i4 = this.a9().getItemCount();
             if (i4 == 1) {
                layoutParams.width = (b1 <= 0)? a1.d(0x7f071055): a1.d(0x7f071054);
                tG2 = this.G;
                if (tG2 != null) {
                   tG2.setPadding(a1.d(R.dimen.arg_RES_7f07104d), i, i, i);
                }
             }else if(i4 == i1){
                if (b1 <= 0) {
                   layoutParams.width = a1.d(0x7f07105a);
                }else {
                   layoutParams.width = a1.d(0x7f071059);
                }
             }else if(b1 <= 0){
                layoutParams.width = a1.d(0x7f071058);
             }else {
                layoutParams.width = a1.d(0x7f071057);
             }
          }
       label_0322 :
          tG2 = this.G;
          if (tG2 != null) {
             tG2.setLayoutParams(layoutParams);
          }
       }
       if (list == null || list.isEmpty()) {
          i = 1;
       }
       if (!i && list.contains(KwaiOp.FANS_PROMOTE)) {
          d.c();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoSharePresenter.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l3();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PhotoSharePresenter.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PhotoSharePresenter.class, new l3());
       }else {
          obj.put(PhotoSharePresenter.class, null);
       }
       return obj;
    }
    public final void h9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoSharePresenter.class, "31")) {
          return;
       }
       PhotoSharePresenter tp = this.p;
       if (tp == null) {
          a.S("mPhotoMeta");
       }
       tp.mPostWorkStatus = objArray;
       k1.m(this.U);
       k1.r(this.U, 100);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoSharePresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(PhotoMeta.class);
       a.o(obj, "inject\(PhotoMeta::class.java\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.q8(CoverMeta.class);
       a.o(obj, "inject\(CoverMeta::class.java\)");
       this.r = obj;
       obj = this.r8("feed");
       a.o(obj, "inject\(FeedFieldConst.FEED\)");
       this.s = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\( AccessIds.FRAGMENT\)");
       this.t = obj;
       return;
    }
    public final boolean j9(){
       PhotoSharePresenter obj = PatchProxy.apply(null, this, PhotoSharePresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPhotoMeta");
       }
       boolean b = (obj.mPostWorkInfoId >= null)? true: false;
       return b;
    }
    public final void k9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoSharePresenter.class, "43")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PUBLISH_MAGIC_FACE_ITEM";
       uElementPack.params = this.P8(p0);
       u1.v0(3, uElementPack, null, null);
       return;
    }
    public final void l9(String p0){
       PhotoSharePresenter photoSharePr = PhotoSharePresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, photoSharePr, "27")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "it");
          this.m9(activity, p0);
          if (!PatchProxy.applyVoidOneRefs(p0, this, photoSharePr, "44")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PUBLISH_MAGIC_FACE_ITEM";
             uElementPack.params = this.P8(p0);
             u1.v(1, uElementPack, null, null);
          }
       }
       return;
    }
    public final void m9(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoSharePresenter.class, "28")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("PhotoSharePresenter", "openCameraActivityWithMagicFace magicFaceId: "+p1, objArray);
       if (!p0 instanceof GifshowActivity) {
          p0 = null;
       }
       if (p0 != null) {
          y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).g(p0.E2(ActivityEvent.DESTROY)).R(new PhotoSharePresenter$h(p0, p1), PhotoSharePresenter$i.b);
       }
       return;
    }
    public final void n9(){
       Activity activity;
       PhotoSharePresenter photoSharePr = PhotoSharePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoSharePr, "40")) {
          return;
       }
       int i = 1;
       if (!PatchProxy.applyVoid(objArray, this, photoSharePr, "42")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_TAKE_ANOTHER_PHOTO";
          uElementPack.params = this.R8();
          u1.u(i, uElementPack, objArray);
       }
       photoSharePr = this.H;
       if (photoSharePr != null && (!photoSharePr.getVisibility() && this.getActivity() != null)) {
          a uoa = this.Y8();
          if (uoa != null) {
             List list = uoa.Q0();
             if (list != null && (i ^ list.isEmpty())) {
                activity = this.getActivity();
                a.m(activity);
                a.o(activity, "activity!!");
                this.m9(activity, list.get(0).a());
                return;
             }
          }
       }
       Activity activity1 = this.getActivity();
       if (activity1 != null) {
          Activity activity2 = this.getActivity();
          if (activity2 instanceof GifshowActivity) {
             activity = activity2;
          }
          if (objArray != null) {
             y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).g(objArray.E2(ActivityEvent.DESTROY)).R(new PhotoSharePresenter$j(activity1, this), PhotoSharePresenter$k.b);
          }
       }
       return;
    }
    public final void o9(){
       if (PatchProxy.applyVoid(null, this, PhotoSharePresenter.class, "41")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHOW_TAKE_ANOTHER_PHOTO";
       uElementPack.params = this.R8();
       u1.u0(6, uElementPack, null);
       return;
    }
}
