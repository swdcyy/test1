package ata.a;
import ata.a$a;
import nsd.u;
import lnc.a1;
import wq6.h;
import wq6.f;
import android.widget.FrameLayout;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xq6.a;
import ata.a$c;
import com.yxcorp.gifshow.widget.RedPointNotifyView;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import tra.b;
import java.lang.StringBuilder;
import com.kwai.kcube.TabIdentifier;
import q87.c;
import ata.a$b;
import erd.a;
import crd.b;
import com.kwai.component.kcube.model.startup.c;
import android.widget.RelativeLayout;
import java.lang.Integer;
import java.util.Arrays;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import java.io.File;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ata.a$d;
import android.content.Context;
import com.kwai.kcube.ext.widget.TabAutoSizeLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import qrd.l1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.kwai.feature.api.feed.home.kcubehome.widget.TriangleView;
import android.util.AttributeSet;
import bd.f;

public final class a	// class@0002f4
{
    public int a;
    public TabViewInfo$TabIcon b;
    public KwaiImageView c;
    public RelativeLayout d;
    public RedPointNotifyView e;
    public TriangleView f;
    public final a g;
    public CDNUrl[] h;
    public b i;
    public boolean j;
    public final a$c k;
    public final h l;
    public final f m;
    public final FrameLayout n;
    public final View o;
    public static final int p;
    public static final a$a q;

    static {
       a.q = new a$a(null);
       a.p = a1.d(0x7f070fdf);
    }
    public void a(h p0,f p1,FrameLayout p2,View p3){
       a.p(p0, "tab");
       a.p(p1, "containerController");
       a.p(p2, "parent");
       a.p(p3, "textView");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.a = -1;
       this.g = new a();
       this.j = true;
       this.k = new a$c(this);
    }
    public static final RedPointNotifyView a(a p0){
       p0 = p0.e;
       if (p0 == null) {
          a.S("redPointView");
       }
       return p0;
    }
    public final void b(TabViewInfo$TabIcon p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       int i = 0;
       if (p0 != null) {
          Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p0.a() && (this.f(p0.mSelectedTabIconUrl) && (this.f(p0.mLightDefaultTabIconUrls) && this.f(p0.mDarkDefaultTabIconUrls)))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             this.b = p0;
             if (this.d()) {
                this.h();
                a ta = this.a;
                if (ta > -1) {
                   this.e(ta);
                }
             }else {
                this.c();
             }
             return;
          }
       }
       this.b = null;
       if (p0 != null && this.i == null) {
          Object[] objArray = new Object[i];
          b.C().w("TabIconViewHelper", "prepareIconResources "+this.l.M2()+' '+p0, objArray);
          this.i = c.d(p0, new a$b(p0, this));
       }
       this.c();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.o.setVisibility(0);
       a td = this.d;
       if (td != null) {
          if (td == null) {
             a.S("rootView");
          }
          td.setVisibility(8);
       }
       return;
    }
    public final boolean d(){
       TabViewInfo$TabIcon mSelectedTab;
       int i;
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = false;
       if (obj != null) {
          if (this.l.isSelected()) {
             mSelectedTab = obj.mSelectedTabIconUrl;
             if (mSelectedTab != null) {
                i = (!mSelectedTab.length)? 1: 0;
                if ((i ^ 1) == 1) {
                label_002f :
                   i = 1;
                label_0056 :
                   if (i) {
                      b = true;
                   }
                }
             }
          }else {
             a ta = this.a;
             if (ta == 2) {
                mSelectedTab = obj.mLightDefaultTabIconUrls;
                if (mSelectedTab != null) {
                   i = (!mSelectedTab.length)? 1: 0;
                   if ((i ^ 1) == 1) {
                      goto label_002f ;
                   }
                }
             }else if(ta != -1){
                mSelectedTab = obj.mDarkDefaultTabIconUrls;
                if (mSelectedTab != null) {
                   i = (!mSelectedTab.length)? 1: 0;
                   if ((i ^ 1) == 1) {
                      goto label_002f ;
                   }
                }
             }
          }
          i = 0;
          goto label_0056 ;
       }
       return b;
    }
    public final void e(int p0){
       TabViewInfo$TabIcon mSelectedTab;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "9")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          if (this.l.isSelected()) {
             mSelectedTab = uoa.mSelectedTabIconUrl;
             a.m(mSelectedTab);
             a.o(mSelectedTab, "icon.mSelectedTabIconUrl!!");
          }else if(p0 == 2){
             mSelectedTab = uoa.mLightDefaultTabIconUrls;
             a.m(mSelectedTab);
             a.o(mSelectedTab, "icon.mLightDefaultTabIconUrls!!");
          }else {
             mSelectedTab = uoa.mDarkDefaultTabIconUrls;
             a.m(mSelectedTab);
             a.o(mSelectedTab, "icon.mDarkDefaultTabIconUrls!!");
          }
          String str = "iconView";
          if (Arrays.equals(this.h, mSelectedTab)) {
             uoa = this.c;
             if (uoa == null) {
                a.S(str);
             }
             if (uoa.getLayoutParams().width != null) {
                this.g();
                return;
             }
          }
          this.h = mSelectedTab;
          File uFile = c.b(ArraysKt___ArraysKt.Ey(mSelectedTab));
          if (uFile == null) {
             Object[] objArray = new Object[0];
             b.C().w("TabIconViewHelper", "bind tab image from network:"+mSelectedTab, objArray);
             uoa = this.c;
             if (uoa == null) {
                a.S(str);
             }
             uoa.b0(mSelectedTab, this.k, 0, 0);
          }else {
             a tc = this.c;
             if (tc == null) {
                a.S(str);
             }
             tc.w(uFile, 0, 0, new a$d(this, mSelectedTab));
          }
       }
       return;
    }
    public final boolean f(CDNUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          int i = (!p0.length)? 1: 0;
          if (!i && !c.c(ArraysKt___ArraysKt.Ey(p0))) {
          label_002a :
             return b;
          }
       }
    label_0029 :
       b = true;
       goto label_002a ;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.o.setVisibility(4);
       a td = this.d;
       if (td != null) {
          if (td == null) {
             a.S("rootView");
          }
          td.setVisibility(0);
       }
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       RelativeLayout relativeLayo = new RelativeLayout(this.n.getContext());
       int i = 0;
       TabAutoSizeLayout$LayoutParams layoutParams = new TabAutoSizeLayout$LayoutParams(i, a.p);
       int i1 = 17;
       layoutParams.gravity = i1;
       layoutParams.a = true;
       relativeLayo.setLayoutParams(layoutParams);
       relativeLayo.setClipToPadding(i);
       relativeLayo.setClipChildren(i);
       int i2 = 8;
       relativeLayo.setVisibility(i2);
       this.d = relativeLayo;
       KwaiImageView kwaiImageVie = new KwaiImageView(this.n.getContext());
       int i3 = 0x7f0a130c;
       kwaiImageVie.setId(i3);
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(i, a1.d(0x7f0702c5));
       layoutParams1.addRule(13);
       kwaiImageVie.setLayoutParams(layoutParams1);
       a hierarchy = kwaiImageVie.getHierarchy();
       a.o(hierarchy, "hierarchy");
       hierarchy.x(i);
       hierarchy = kwaiImageVie.getHierarchy();
       a.o(hierarchy, "hierarchy");
       hierarchy.u(t$b.c);
       this.c = kwaiImageVie;
       a td = this.d;
       if (td == null) {
          a.S("rootView");
       }
       a tc = this.c;
       if (tc == null) {
          a.S("iconView");
       }
       td.addView(tc);
       if (this.l.l()) {
          Context context = this.n.getContext();
          a.o(context, "parent.context");
          TriangleView triangleView = new TriangleView(context, null, 0, 6, null);
          td.setId(R.id.triangle);
          td.setTriangleRadius((float)a1.e(0x3f000000));
          RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(a1.d(0x7f07033f), a1.d(0x7f07031b));
          layoutParams2.addRule(15);
          layoutParams2.addRule(i1, i3);
          layoutParams2.setMarginStart(a1.d(R.dimen.arg_RES_7f0702e3));
          td.setLayoutParams(layoutParams2);
          td.setVisibility(i2);
          this.f = td;
          td = this.d;
          if (td == null) {
             a.S("rootView");
          }
          a tf = this.f;
          if (tf == null) {
             a.S("triangleView");
          }
          td.addView(tf);
       }
       RedPointNotifyView redPointNoti = new RedPointNotifyView(this.n.getContext());
       RelativeLayout$LayoutParams layoutParams3 = new RelativeLayout$LayoutParams(a1.d(0x7f07025d), a1.d(0x7f07025d));
       layoutParams3.addRule(19, i3);
       layoutParams3.setMarginEnd(a1.e(-5.00f));
       layoutParams3.setMargins(i, a1.e(8.50f), i, i);
       redPointNoti.setRedDotColor(a1.a(R.color.arg_RES_7f060aee));
       redPointNoti.setRedPointStrokeColor(a1.a(R.color.arg_RES_7f0606da));
       redPointNoti.setRedPointStrokeWidth((float)a1.e(0x3fc00000));
       redPointNoti.setVisibility(i2);
       redPointNoti.setLayoutParams(layoutParams3);
       this.e = redPointNoti;
       td = this.d;
       if (td == null) {
          a.S("rootView");
       }
       a te = this.e;
       if (te == null) {
          a.S("redPointView");
       }
       td.addView(te);
       td = this.n;
       te = this.d;
       if (te == null) {
          a.S("rootView");
       }
       td.addView(te, true);
       return;
    }
    public final void i(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       if (p0 != null) {
          a tc = this.c;
          String str = "iconView";
          if (tc == null) {
             a.S(str);
          }
          int i = (int)((float)tc.getLayoutParams().height * ((float)p0.getWidth() / (float)p0.getHeight()));
          tc = this.c;
          if (tc == null) {
             a.S(str);
          }
          if (tc.getLayoutParams().width != i) {
             tc = this.c;
             if (tc == null) {
                a.S(str);
             }
             tc.getLayoutParams().width = i;
             a tc1 = this.c;
             if (tc1 == null) {
                a.S(str);
             }
             tc1.requestLayout();
          }
          b uob = b.C();
          StringBuilder str1 = "updateViewSize: ";
          a tc2 = this.c;
          if (tc2 == null) {
             a.S(str);
          }
          str1 = str1+tc2.getLayoutParams().width+", ";
          tc2 = this.c;
          if (tc2 == null) {
             a.S(str);
          }
          Object[] objArray = new Object[0];
          uob.w("TabIconViewHelper", str1+tc2.getLayoutParams().height, objArray);
          this.g();
       }
       return;
    }
}
