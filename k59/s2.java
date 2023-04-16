package k59.s2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k59.s2$a;
import nsd.u;
import k59.s2$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import android.view.View;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Number;
import android.widget.RelativeLayout$LayoutParams;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import androidx.core.view.ViewGroupKt$b;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import ekd.i;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import r0.a;
import com.yxcorp.gifshow.webview.helper.StateListImageView;
import android.widget.ImageView;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;

public final class s2 extends PresenterV2	// class@002b18
{
    public BaseFeed p;
    public f q;
    public f r;
    public KwaiYodaWebViewFragment s;
    public KwaiYodaWebViewFragment t;
    public FrameLayout u;
    public View v;
    public int w;
    public final WebViewFragment$a x;
    public static final s2$a y;

    static {
       s2.y = new s2$a(null);
    }
    public void s2(){
       super();
       this.x = new s2$b(this);
    }
    public void E8(){
       int i1;
       int i2;
       Object[] objArray1;
       s2 os2 = s2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os2, "2")) {
          return;
       }
       s2 tq = this.q;
       View view = (tq != null)? tq.get(): objArray;
       if (view != null) {
          s2 tr = this.r;
          String str = "mReplaceHeadHeight";
          if (tr == null) {
             a.S(str);
          }
          Integer integer = tr.get();
          if (integer != null && !integer.intValue()) {
             return;
          }else {
             View view1 = view.findViewById(R.id.ad_webview_head);
             a.o(view1, "headView.findViewById\(R.id.ad_webview_head\)");
             this.u = view1;
             view = view.findViewById(R.id.ad_webview_head_statusbar);
             a.o(view, "headView.findViewById\(R.¡­d_webview_head_statusbar\)");
             this.v = view;
             if (view == null) {
                a.S("mStatusBarView");
             }
             Context context = this.getContext();
             a.m(context);
             view.getLayoutParams().height = n.A(context);
             int i = 0x7f0a3f6a;
             if (!PatchProxy.applyVoid(objArray, this, os2, "6")) {
                view = this.m8().findViewById(i);
                if (!view instanceof KwaiActionBar) {
                   objArray1 = objArray;
                }
                if (objArray1 != null) {
                   objArray1.s(R.color.arg_RES_7f0620c7);
                   View view4 = objArray1.findViewById(R.id.left_btn);
                   KwaiYodaWebViewFragment kwaiYodaWebV1 = this.P8();
                   String str1 = (kwaiYodaWebV1 != null)? kwaiYodaWebV1.Ah(): objArray;
                   i2 = 0x7f0800c7;
                   i1 = (TextUtils.equals(str1, "close"))? 0x7f0800c7: 0x7f0800c6;
                   this.R8(view4, i1);
                   this.R8(objArray1.findViewById(R.id.left_close_btn), i2);
                   this.R8(objArray1.findViewById(R.id.right_btn), R.drawable.arg_RES_7f080093);
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, os2, "8") && this.getActivity() != null) {
                view = this.m8().findViewById(i);
                if (view != null) {
                   ViewParent parent = view.getParent();
                   if (!parent instanceof ViewGroup) {
                      parent = objArray;
                   }
                   if (parent != null) {
                      view.setBackground(a1.f(R.drawable.arg_RES_7f0802c9));
                      parent.removeView(view);
                      FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(view.getLayoutParams().width, view.getLayoutParams().height);
                      Context context1 = this.getContext();
                      a.m(context1);
                      layoutParams.topMargin = n.A(context1);
                      s2 tu = this.u;
                      if (tu == null) {
                         a.S("mHeadViewLayout");
                      }
                      tu.addView(view, layoutParams);
                      context1 = this.getContext();
                      a.m(context1);
                      i1 = n.A(context1);
                      Context context2 = this.getContext();
                      s2 tr1 = this.r;
                      if (tr1 == null) {
                         a.S(str);
                      }
                      i1 = i1 + n.c(context2, (float)tr1.get().intValue());
                      this.w = view.getLayoutParams().height + i1;
                      s2 tq1 = this.q;
                      View view2 = (tq1 != null)? tq1.get(): objArray;
                      parent.addView(view2, 0, new ViewGroup$LayoutParams(layoutParams.width, (view.getLayoutParams().height + i1)));
                      FrameLayout uFrameLayout = this.m8().findViewById(R.id.webView);
                      if (uFrameLayout != null) {
                         ViewGroup$LayoutParams layoutParams1 = uFrameLayout.getLayoutParams();
                         a.o(layoutParams1, "webViewLayout.layoutParams");
                         if (!layoutParams1 instanceof RelativeLayout$LayoutParams) {
                            layoutParams1 = objArray;
                         }
                         if (layoutParams1 != null) {
                            layoutParams1.removeRule(3);
                            layoutParams1.topMargin = view.getLayoutParams().height + i1;
                         }
                         Iterator iterator = ViewGroupKt.b(parent).iterator();
                         Iterator iterator1 = iterator;
                         while (iterator1.hasNext()) {
                            view1 = iterator1.next();
                            s2 tq2 = this.q;
                            View view3 = (tq2 != null)? tq2.get(): objArray;
                            i2 = a.g(view1, view3) ^ 0x01;
                            if (i2) {
                               i2 = a.g(view1, uFrameLayout) ^ 0x01;
                               if (i2) {
                                  ViewGroup$LayoutParams layoutParams2 = view1.getLayoutParams();
                                  if (!layoutParams2 instanceof ViewGroup$MarginLayoutParams) {
                                     layoutParams2 = objArray;
                                  }
                                  if (layoutParams2 != null) {
                                     ViewGroup$MarginLayoutParams topMargin = layoutParams2.topMargin;
                                     if (topMargin != null) {
                                        i2 = topMargin + i1;
                                        layoutParams2.topMargin = i2;
                                     }
                                  }
                               }
                            }
                         }
                         Activity activity = this.getActivity();
                         a.m(activity);
                         activity.findViewById(0x1020002).setPadding(0, 0, 0, 0);
                         activity = this.getActivity();
                         Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
                         i.h(activity, 0, 0);
                      }
                   }
                }
             }
          label_020b :
             if (!PatchProxy.applyVoid(objArray, this, os2, "3") && SystemUtil.a(21)) {
                KwaiYodaWebViewFragment kwaiYodaWebV = this.P8();
                if (kwaiYodaWebV != null) {
                   kwaiYodaWebV.ch(this.x);
                }
             }
          }
       }
    label_0228 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s2.class, "9")) {
          return;
       }
       KwaiYodaWebViewFragment kwaiYodaWebV = this.P8();
       if (kwaiYodaWebV != null) {
          kwaiYodaWebV.fh(this.x);
       }
       return;
    }
    public final KwaiYodaWebViewFragment P8(){
       s2 ts = this.s;
       if (ts != null) {
       }else {
          ts = this.t;
       }
       return ts;
    }
    public final void R8(View p0,int p1){
       s2 os2 = s2.class;
       if (PatchProxy.isSupport(os2) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, os2, "7")) {
          return;
       }
       Context context = this.getContext();
       a.m(context);
       Drawable uDrawable = a.d(context, p1);
       if (uDrawable != null) {
          if (p0 instanceof StateListImageView) {
             p0.b(uDrawable);
             p0.d(uDrawable);
          }else if(p0 instanceof ImageView){
             p0.setImageDrawable(uDrawable);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s2.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       this.s = this.s8(AdYodaFragment.class);
       this.t = this.s8(AdYodaFragment2.class);
       this.q = this.x8("REPLACE_VIEW");
       f uof = this.x8("REPLACE_TITLE_HEIGHT");
       a.o(uof, "injectRef\(AdWebAccessIds.REPLACE_TITLE_HEIGHT\)");
       this.r = uof;
       return;
    }
}
