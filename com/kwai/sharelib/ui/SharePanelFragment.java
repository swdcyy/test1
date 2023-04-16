package com.kwai.sharelib.ui.SharePanelFragment;
import androidx.fragment.app.Fragment;
import com.kwai.sharelib.model.ShareInitResponse$ShareTheme;
import com.kwai.sharelib.ui.SharePanelFragment$b;
import java.util.ArrayList;
import com.kwai.sharelib.ui.SharePanelFragment$d;
import com.kwai.sharelib.KsShareApi;
import com.kwai.sharelib.KsShareApi$b;
import so7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yo7.b;
import mp7.a;
import mp7.c;
import android.view.View;
import mp7.e;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import uo7.j0;
import java.util.List;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import com.kwai.sharelib.ui.SharePanelFragment$c;
import ya.i;
import kb.e;
import java.util.concurrent.Executor;
import qrd.l1;
import androidx.fragment.app.FragmentActivity;
import com.kwai.sharelib.model.PainterModel;
import com.kwai.sharelib.ui.poster.PosterType;
import com.kwai.sharelib.ui.poster.BigPicPoster;
import com.kwai.sharelib.ui.poster.BigQrPoster;
import com.kwai.sharelib.ui.poster.LongPicPoster;
import op7.f;
import android.content.Context;
import android.app.Activity;
import java.lang.ref.WeakReference;
import com.kwai.sharelib.model.TkConfig;
import com.kwai.sharelib.ui.poster.ShortPicPoster;
import com.kwai.sharelib.model.PosterConfig;
import ap7.a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import ag6.a;
import com.kwai.sharelib.ui.SharePanelFragment$a;
import android.view.View$OnClickListener;
import crd.b;
import op7.a;
import so7.b;
import android.widget.TextView;
import com.kwai.sharelib.model.ShareInitResponse$ThemeElement;
import java.lang.Number;
import ip7.j;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Iterator;
import java.lang.Iterable;
import mp7.l;
import java.lang.Boolean;
import op7.e;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.utility.TextUtils;
import op7.c;
import op7.d;
import so7.a;
import to7.b;
import com.kwai.sharelib.ui.SharePanelFragment$onDataSourceChanged$$inlined$apply$lambda$1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.i;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.ColorDrawable;
import androidx.recyclerview.widget.RecyclerView$n;
import mp7.k;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.sharelib.ui.RoundLinearLayout;
import kotlin.Result;
import mp7.b;
import java.lang.Throwable;
import qrd.j0;

public final class SharePanelFragment extends Fragment	// class@00170d
{
    public ShareInitResponse$ShareTheme b;
    public RecyclerView c;
    public RecyclerView$n d;
    public boolean e;
    public int f;
    public e g;
    public List h;
    public a i;
    public b j;
    public c k;
    public b l;
    public c m;
    public b n;
    public j0 o;
    public PosterConfig p;
    public PainterModel q;
    public a r;
    public a s;
    public ArrayList t;
    public c u;
    public i0 v;
    public boolean w;

    public void SharePanelFragment(){
       super();
       this.b = new ShareInitResponse$ShareTheme();
       this.f = -1;
       this.g = new SharePanelFragment$b();
       this.h = new ArrayList();
       this.i = new SharePanelFragment$d();
       KsShareApi$b uob = KsShareApi.s.d();
       c uoc = (uob != null)? uob.b(): null;
       this.u = uoc;
       return;
    }
    public final void Ug(){
       if (PatchProxy.applyVoid(null, this, SharePanelFragment.class, "14")) {
          return;
       }
       SharePanelFragment tn = this.n;
       if (tn != null) {
          tn.g("CANCEL_BUTTON");
       }
       this.i.dismiss();
       tn = this.k;
       if (tn != null) {
          tn.onCancel();
       }
       return;
    }
    public final ShareInitResponse$ShareTheme Vg(){
       return this.b;
    }
    public final void Wg(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SharePanelFragment.class, "25")) {
          return;
       }
       this.bh(p0);
       return;
    }
    public final void Xg(int p0,e p1){
       if (PatchProxy.isSupport(SharePanelFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, SharePanelFragment.class, "12")) {
          return;
       }
       a.p(p1, "shareUiController");
       this.f = p0;
       this.g = p1;
       return;
    }
    public final void Yg(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SharePanelFragment.class, "13")) {
          return;
       }
       this.Xg(-1, p0);
       return;
    }
    public final void Zg(ShareInitResponse$ShareTheme p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SharePanelFragment.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void ah(View p0,j0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SharePanelFragment.class, "23")) {
          return;
       }
       this.w = true;
       ShareInitResponse$SharePanelElement sharePanelEl = p1.a().get(0).a();
       ImageRequest imageRequest = ImageRequest.c(sharePanelEl.mIconUrl);
       if (imageRequest != null) {
          c uoc = Fresco.getImagePipeline().fetchDecodedImage(imageRequest, sharePanelEl);
          this.m = uoc;
          if (uoc != null) {
             uoc.f(new SharePanelFragment$c(this, sharePanelEl, p0, p1), i.d());
          }
       }else {
          this.Wg(p0);
          l1 a = l1.a;
       }
       return;
    }
    public final void bh(View p0){
       SharePanelFragment tq;
       BigPicPoster uBigPicPoste;
       l1 a;
       FragmentActivity activity;
       LongPicPoster longPicPoste;
       f uof;
       FragmentActivity activity1;
       Context applicationC;
       l1 a1;
       if (PatchProxy.applyVoidOneRefs(p0, this, SharePanelFragment.class, "22")) {
          return;
       }
       if (this.p != null && (this.q != null && this.getActivity() != null)) {
          String str = "activity!!";
          if (this.r == null) {
             tq = this.q;
             a.m(tq);
             PainterModel mPosterTkCon = tq.mPosterTkConfig;
             SharePanelFragment tq1 = this.q;
             a.m(tq1);
             PainterModel mType = tq1.mType;
             if (a.g(mType, PosterType.BIG_PIC.getValue())) {
                uBigPicPoste = new BigPicPoster();
                uBigPicPoste.u(this.k);
                uBigPicPoste.t(this.n);
                a = l1.a;
             }else if(a.g(mType, PosterType.BIG_QR.getValue())){
                uBigPicPoste = new BigQrPoster();
                uBigPicPoste.u(this.k);
                uBigPicPoste.t(this.n);
                a = l1.a;
             }else {
                String str1 = "activity!!.applicationContext";
                if (a.g(mType, PosterType.LONG_PIC.getValue())) {
                   longPicPoste = new LongPicPoster();
                   longPicPoste.x(this.k);
                   longPicPoste.v(this.n);
                   if (mPosterTkCon != null && this.u != null) {
                      uof = new f();
                      activity1 = this.getActivity();
                      a.m(activity1);
                      a.o(activity1, str);
                      applicationC = activity1.getApplicationContext();
                      a.o(applicationC, str1);
                      uof.q(applicationC);
                      uof.p(new WeakReference(this.getActivity()));
                      uof.s(mPosterTkCon);
                      tq = this.u;
                      a.m(tq);
                      uof.r(tq);
                      longPicPoste.w(uof);
                   }
                   a1 = l1.a;
                }else if(a.g(mType, PosterType.SHORT_PIC.getValue())){
                   longPicPoste = new ShortPicPoster();
                   longPicPoste.x(this.k);
                   longPicPoste.v(this.n);
                   if (mPosterTkCon != null && this.u != null) {
                      uof = new f();
                      activity1 = this.getActivity();
                      a.m(activity1);
                      a.o(activity1, str);
                      applicationC = activity1.getApplicationContext();
                      a.o(applicationC, str1);
                      uof.q(applicationC);
                      uof.p(new WeakReference(this.getActivity()));
                      uof.s(mPosterTkCon);
                      tq = this.u;
                      a.m(tq);
                      uof.r(tq);
                      longPicPoste.w(uof);
                   }
                   a1 = l1.a;
                }else {
                   uBigPicPoste = null;
                }
                uBigPicPoste = longPicPoste;
             }
             this.r = uBigPicPoste;
          }
          tq = this.r;
          if (tq != null) {
             activity = this.getActivity();
             a.m(activity);
             a.o(activity, str);
             SharePanelFragment tp = this.p;
             a.m(tp);
             SharePanelFragment tq2 = this.q;
             a.m(tq2);
             tq.k(activity, tp, tq2, p0);
          }
       }
    label_013e :
       return;
    }
    public final RecyclerView h0(){
       return this.c;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SharePanelFragment.class, "16");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (!Fresco.hasBeenInitialized()) {
          Fresco.initialize(KsShareApi.s.k());
       }
       SharePanelFragment tf = this.f;
       if (tf == -1) {
          tf = 0x7f0d0250;
       }
       View view = a.c(p0, tf, p1, false);
       View view1 = view.findViewById(R.id.cancel_button);
       if (view1 != null) {
          view1.setOnClickListener(new SharePanelFragment$a(this));
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SharePanelFragment.class, "19")) {
          return;
       }
       super.onDestroy();
       SharePanelFragment tl = this.l;
       if (tl != null) {
          if (!(tl.isDisposed() ^ 0x01)) {
             tl = null;
          }
          if (tl != null) {
             tl.dispose();
          }
       }
       tl = this.m;
       if (tl != null) {
          tl.close();
       }
       tl = this.s;
       if (tl != null && !PatchProxy.applyVoid(null, tl, a.class, "9")) {
          a i = tl.i;
          if (i != null) {
             i.destroy();
          }
          tl.i = null;
          tl.k = null;
          tl.j = null;
          tl.f = null;
          tl.g = null;
       }
       tl = this.r;
       if (tl != null) {
          tl.destroy();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SharePanelFragment.class, "18")) {
          return;
       }
       super.onDestroyView();
       SharePanelFragment tn = this.n;
       if (tn != null) {
          tn.e(this);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       SharePanelFragment j;
       List obj2;
       TkConfig tkConfig;
       List list;
       View view;
       boolean b;
       TkConfig isRetryNativ;
       Integer integer1;
       ShareInitResponse$ThemeElement mCornerRadiu2;
       GradientDrawable gradientDraw1;
       j0 oj0 = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, oj0, SharePanelFragment.class, "17")) {
          return;
       }
       a.p(obj, "view");
       super.onViewCreated(p0, p1);
       int i = 0x7f0a2f6f;
       RoundLinearLayout roundLinearL = null;
       int i1 = 0;
       int i2 = 1;
       if (!PatchProxy.applyVoidOneRefs(obj, oj0, SharePanelFragment.class, "20")) {
          ShareInitResponse$ShareTheme mCancelButto = oj0.b.mCancelButton;
          if (mCancelButto != null) {
             View view1 = obj.findViewById(R.id.cancel_button);
             if (view1 != null && view1 instanceof TextView) {
                ShareInitResponse$ThemeElement mFontSize = mCancelButto.mFontSize;
                if (mFontSize != null) {
                   view1.setTextSize(2, (float)mFontSize.intValue());
                }
                mFontSize = mCancelButto.mFontColour;
                if (mFontSize != null) {
                   integer1 = j.b(mFontSize);
                   if (integer1 != null) {
                      view1.setTextColor(integer1.intValue());
                   }
                }
                mFontSize = mCancelButto.mBackgroundColour;
                ShareInitResponse$ThemeElement mHighlighted = mCancelButto.mHighlightedBackgroundColour;
                ShareInitResponse$ThemeElement mCornerRadiu1 = mCancelButto.mCornerRadius;
                StateListDrawable stateListDra = PatchProxy.applyThreeRefs(mFontSize, mHighlighted, mCornerRadiu1, null, j.class, "2");
                if (stateListDra != patchProxyRe) {
                }else if(mFontSize != null && (mHighlighted == null || mCornerRadiu1 == null)){
                   integer1 = j.b(mFontSize);
                   if (integer1 != null) {
                      int i4 = integer1.intValue();
                      Integer integer3 = j.b(mHighlighted);
                      if (integer3 != null) {
                         GradientDrawable gradientDraw2 = new GradientDrawable();
                         gradientDraw2.setColor(i4);
                         gradientDraw2.setCornerRadius((float)j.a((float)mCornerRadiu1.intValue()));
                         gradientDraw1 = new GradientDrawable();
                         gradientDraw1.setColor(integer3.intValue());
                         gradientDraw1.setCornerRadius((float)j.a((float)mCornerRadiu1.intValue()));
                         StateListDrawable stateListDra1 = new StateListDrawable();
                         int[] ointArray = new int[i2];
                         ointArray[i1] = 0x10100a7;
                         stateListDra1.addState(ointArray, gradientDraw1);
                         int[] ointArray1 = new int[i2];
                         ointArray1[i1] = -16842919;
                         stateListDra1.addState(ointArray1, gradientDraw2);
                         stateListDra = stateListDra1;
                      }
                   }
                }
                stateListDra = roundLinearL;
                if (stateListDra != null) {
                   view1.setBackground(stateListDra);
                }
             }
          }
          mCancelButto = oj0.b.mPanel;
          GradientDrawable gradientDraw = PatchProxy.applyOneRefs(mCancelButto, roundLinearL, j.class, "1");
          if (gradientDraw != patchProxyRe) {
          }else if(mCancelButto != null){
             mCornerRadiu2 = mCancelButto.mCornerRadius;
          }else {
             mCornerRadiu2 = roundLinearL;
          }
          if (mCornerRadiu2 != null) {
             Integer integer2 = j.b(mCancelButto.mBackgroundColour);
             if (integer2 != null) {
                gradientDraw1 = new GradientDrawable();
                gradientDraw1.setColor(integer2.intValue());
                gradientDraw1.setCornerRadius((float)j.a((float)mCancelButto.mCornerRadius.intValue()));
                gradientDraw = gradientDraw1;
             }
          }
          gradientDraw = roundLinearL;
          if (gradientDraw != null) {
             view = obj.findViewById(i);
             if (view != null) {
                view.setBackground(gradientDraw);
             }
          }
       }
    label_012e :
       if (!PatchProxy.applyVoidOneRefs(obj, oj0, SharePanelFragment.class, "21") && oj0.h.size()) {
          RoundLinearLayout roundLinearL1 = oj0.h.get(i1);
          ArrayList obj1 = roundLinearL1;
          String str = "banner";
          obj1 = (obj1.a().size() == i2 && a.g(str, obj1.a().get(i1).a().mElementType))? 1: null;
          if (!obj1) {
             roundLinearL1 = roundLinearL;
          }
          oj0.o = roundLinearL1;
          SharePanelFragment t = oj0.t;
          if (t != null) {
             obj1 = new ArrayList();
             Iterator iterator = t.iterator();
             while (iterator.hasNext()) {
                obj2 = iterator.next();
                if (a.g(obj2.mViewArea, str)) {
                   obj1.add(obj2);
                }
             }
             if (obj1.isEmpty() ^ i2) {
                tkConfig = obj1.get(i1);
             label_01af :
                if (tkConfig != null && oj0.u != null) {
                   a uoa = a.class;
                   if (!PatchProxy.applyVoidTwoRefs(obj, tkConfig, oj0, SharePanelFragment.class, "24")) {
                      oj0.w = i2;
                      l ol = new l(oj0, tkConfig, obj);
                      a uoa1 = new a();
                      WeakReference weakReferenc = new WeakReference(this.getActivity());
                      String str1 = "<set-?>";
                      if (!PatchProxy.applyVoidOneRefs(weakReferenc, uoa1, uoa, "2")) {
                         a.p(weakReferenc, str1);
                         uoa1.a = weakReferenc;
                      }
                      if (!PatchProxy.applyVoidOneRefs(tkConfig, uoa1, uoa, "4")) {
                         a.p(tkConfig, str1);
                         uoa1.b = tkConfig;
                      }
                      SharePanelFragment u = oj0.u;
                      a.m(u);
                      if (!PatchProxy.applyVoidOneRefs(u, uoa1, uoa, "8")) {
                         a.p(u, str1);
                         uoa1.h = u;
                      }
                      if (!PatchProxy.applyVoidOneRefs(obj, uoa1, uoa, "6")) {
                         a.p(obj, str1);
                         uoa1.d = obj;
                      }
                      uoa1.e = ol;
                      oj0.s = uoa1;
                      String obj3 = PatchProxy.apply(roundLinearL, uoa1, uoa, "10");
                      if (obj3 != patchProxyRe) {
                         b = obj3.booleanValue();
                      }else {
                         a e = uoa1.e;
                         if (e != null) {
                            e.a("START");
                         }
                         e = uoa1.b;
                         obj3 = "mTkBannerConfig";
                         if (e == null) {
                            a.S(obj3);
                         }
                         isRetryNativ = e.mTkTemplateId;
                         e = (isRetryNativ == null || !isRetryNativ.length())? 1: null;
                         String str2 = "FAIL";
                         if (e) {
                            e = uoa1.e;
                            if (e != null) {
                               e.a(str2);
                            }
                         }else {
                            e = uoa1.b;
                            if (e == null) {
                               a.S(obj3);
                            }
                            TkConfig mTkTemplateI = e.mTkTemplateId;
                            a.o(mTkTemplateI, "it");
                            String[] stringArray = new String[]{"|"};
                            String[] stringArray1 = new String[i1];
                            Object[] objArray = StringsKt__StringsKt.H4(mTkTemplateI, stringArray, false, 0, 6, null).toArray(stringArray1);
                            Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                            object oobject = objArray[i1];
                            uoa1.f = oobject;
                            uoa1.g = objArray[i2];
                            if (TextUtils.x(oobject) || TextUtils.x(uoa1.g)) {
                               e = uoa1.e;
                               if (e != null) {
                                  e.a(str2);
                               }
                            }else {
                               e = uoa1.h;
                               if (e == null) {
                                  a.S("mTkManagerFactory");
                               }
                               b uob = e.a(uoa1.f);
                               uoa1.i = uob;
                               if (uob != null) {
                                  uoa1.k = new c(uoa1);
                                  a i3 = uoa1.i;
                                  a.m(i3);
                                  e = uoa1.a;
                                  if (e == null) {
                                     a.S("mActivityRef");
                                  }
                                  i3.a(e.get(), "", uoa1.k, uoa1.g, new d(uoa1));
                                  b = true;
                               }else {
                                  e = uoa1.e;
                                  if (e != null) {
                                     e.a(str2);
                                  }
                               }
                            }
                         }
                      label_02eb :
                         b = false;
                      }
                      if (!b) {
                         isRetryNativ = tkConfig.isRetryNative;
                         a.o(isRetryNativ, "tkConfig.isRetryNative");
                         if (isRetryNativ.booleanValue()) {
                            j = oj0.o;
                            if (j != null) {
                               oj0.ah(obj, j);
                            }else {
                               this.Wg(p0);
                            }
                         }else {
                            this.Wg(p0);
                         }
                      }
                   }
                }else {
                   j = oj0.o;
                   if (j != null) {
                      a.m(j);
                      oj0.ah(obj, j);
                   }else {
                      oj0.w = i1;
                   }
                }
                if (oj0.o != null) {
                   j = oj0.h;
                   list = j.subList(i2, j.size());
                }else {
                   list = oj0.h;
                }
                obj2 = list;
                RecyclerView recyclerView = obj.findViewById(R.id.recyclerView);
                SharePanelFragment$onDataSourceChanged$$inlined$apply$lambda$1 oonDataSourc = new SharePanelFragment$onDataSourceChanged$$inlined$apply$lambda$1(p0.getContext(), oj0, obj2, obj);
                oonDataSourc.setOrientation(i2);
                recyclerView.setLayoutManager(oonDataSourc);
                if (oj0.e != null) {
                   t = oj0.d;
                }else {
                   KsShareApi s = KsShareApi.s;
                   i oi = new i(s.k(), i2);
                   ShareInitResponse$ShareTheme mPanel1 = oj0.b.mPanel;
                   if (mPanel1 != null) {
                      ShareInitResponse$ThemeElement mSeparatorCo = mPanel1.mSeparatorColour;
                      if (mSeparatorCo != null) {
                         Integer integer = j.b(mSeparatorCo);
                         if (integer != null) {
                            i2 = integer.intValue();
                         label_0376 :
                            oi.i(new ColorDrawable(i2));
                         }
                      }
                   }
                   i2 = ContextCompat.getColor(s.k(), R.color.arg_RES_7f060b1b);
                   goto label_0376 ;
                }
                if (t != null) {
                   recyclerView.addItemDecoration(t);
                }
                k ok = new k(obj2, oj0.b, oj0.i, oj0.k, oj0.n, oj0.g);
                recyclerView.setAdapter(t);
                oj0.c = recyclerView;
                ShareInitResponse$ShareTheme mPanel = oj0.b.mPanel;
                if (mPanel != null) {
                   ShareInitResponse$ThemeElement mCornerRadiu = mPanel.mCornerRadius;
                   if (mCornerRadiu != null) {
                      i1 = mCornerRadiu.intValue();
                   }
                }
                float f = (float)j.a((float)i1);
                view = obj.findViewById(i);
                if (view instanceof RoundLinearLayout) {
                   roundLinearL = view;
                }
                if (roundLinearL != null) {
                   roundLinearL.setRadius(f);
                }
             }
          }
          tkConfig = roundLinearL;
          goto label_01af ;
       }
    label_03bd :
       if (oj0.w == null) {
          this.bh(p0);
       }
       j = oj0.j;
       if (j != null) {
          j.u7(obj);
          obj = Result.constructor-impl(l1.a);
          Result.box-impl(obj);
       }
       return;
    }
}
