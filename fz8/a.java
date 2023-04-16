package fz8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fz8.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.text.SpannableStringBuilder;
import android.app.Application;
import o56.a;
import nsd.r0;
import java.lang.Double;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink;
import fz8.b;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import bz8.n;

public final class a extends PresenterV2	// class@0023a3
{
    public PhotoAdvertisement$PrivacyData p;
    public QPhoto q;
    public View r;
    public View s;
    public TextView t;
    public TextView u;
    public TextView v;
    public static final a$a w;

    static {
       a.w = new a$a(null);
    }
    public void a(){
       super();
    }
    public void E8(){
       a tp;
       SpannableStringBuilder spannableStr1;
       a tp1;
       String str1;
       a tp3;
       PhotoAdvertisement$PrivacyData mDeveloper;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          MovementMethod movementMeth = 8;
          String str = "mPrivacyData";
          if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             tp3 = this.p;
             if (tp3 == null) {
                a.S(str);
             }
             mDeveloper = tp3.mAppName;
             tp3 = (mDeveloper == null || !mDeveloper.length())? 1: null;
             str1 = "mLayoutAppName";
             if (tp3) {
                tp3 = this.r;
                if (tp3 == null) {
                   a.S(str1);
                }
                tp3.setVisibility(movementMeth);
             }else {
                tp3 = this.r;
                if (tp3 == null) {
                   a.S(str1);
                }
                tp3.setVisibility(0);
                tp3 = this.t;
                if (tp3 == null) {
                   a.S("mTvAppName");
                }
                tp1 = this.p;
                if (tp1 == null) {
                   a.S(str);
                }
                tp3.setText(tp1.mAppName);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
             tp3 = this.p;
             if (tp3 == null) {
                a.S(str);
             }
             mDeveloper = tp3.mDeveloper;
             tp3 = (mDeveloper == null || !mDeveloper.length())? 1: null;
             str1 = "mLayoutDeveloper";
             if (tp3) {
                tp3 = this.s;
                if (tp3 == null) {
                   a.S(str1);
                }
                tp3.setVisibility(movementMeth);
             }else {
                tp3 = this.s;
                if (tp3 == null) {
                   a.S(str1);
                }
                tp3.setVisibility(0);
                tp3 = this.u;
                if (tp3 == null) {
                   a.S("mTvDeveloper");
                }
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                tp3.setText(tp.mDeveloper);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
             a tv = this.v;
             if (tv == null) {
                a.S("mTvPrivacy");
             }
             tv.setMovementMethod(LinkMovementMethod.getInstance());
             tv = this.v;
             if (tv == null) {
                a.S("mTvPrivacy");
             }
             tv.setHighlightColor(0);
             SpannableStringBuilder spannableStr = new SpannableStringBuilder();
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             PhotoAdvertisement$PrivacyData mAppVersion = tp.mAppVersion;
             Application uApplication = (mAppVersion == null || !mAppVersion.length())? 1: null;
             if (!uApplication) {
                spannableStr.append(a.b().getString(R.string.arg_RES_7f100084));
                spannableStr1 = spannableStr;
                tp1 = this.p;
                if (tp1 == null) {
                   a.S(str);
                }
                spannableStr1.append(tp1.mAppVersion).append(' ');
             }
             spannableStr.append(a.b().getString(R.string.arg_RES_7f100101));
             spannableStr1 = spannableStr;
             Object[] objArray1 = new Object[1];
             a tp2 = this.p;
             if (tp2 == null) {
                a.S(str);
             }
             double d = (double)1024.00f;
             objArray1[0] = Double.valueOf(((tp2.mPackageSize / d) / d));
             str1 = String.format("%.2fM", Arrays.copyOf(objArray1, 1));
             a.o(str1, "java.lang.String.format\(format, *args\)");
             spannableStr1.append(str1);
             String str2 = (spannableStr.length() > 0)? 1: null;
             if (str2) {
                spannableStr.append(10);
             }
             if (!PatchProxy.applyVoidOneRefs(spannableStr, this, uoa, "8")) {
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                mAppVersion = tp.mLinks;
                int i = (mAppVersion != null)? mAppVersion.size(): 0;
                i = i - 1;
                tp1 = this.p;
                if (tp1 == null) {
                   a.S(str);
                }
                PhotoAdvertisement$PrivacyData mLinks = tp1.mLinks;
                if (mLinks != null) {
                   Iterator iterator = mLinks.iterator();
                   int i1 = 0;
                   while (iterator.hasNext()) {
                      Object obj = iterator.next();
                      int i2 = i1 + 1;
                      if (i1 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      a.o(obj, "link");
                      if (!PatchProxy.applyVoidTwoRefs(spannableStr, obj, this, uoa, "9")) {
                         PhotoAdvertisement$HalfPrivacyLink mLinkText = obj.mLinkText;
                         String str3 = (mLinkText == null || !mLinkText.length())? 1: null;
                         if (!str3) {
                            spannableStr.append(obj.mLinkText);
                            spannableStr.setSpan(new b(this, obj), spannableStr.length(), spannableStr.length(), 33);
                         }
                      }
                      if (i1 != i) {
                         spannableStr.append(" | ");
                      }
                      i1 = i2;
                   }
                }
             }
             uoa = this.v;
             if (uoa == null) {
                a.S("mTvPrivacy");
             }
             uoa.setText(spannableStr);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.layout_app_name);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.layout_app_name\)");
       this.r = view;
       view = m1.f(p0, R.id.layout_developer);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.layout_developer\)");
       this.s = view;
       view = m1.f(p0, R.id.tv_app_name);
       a.o(view, "ViewBindUtils.bindWidget¡­otView, R.id.tv_app_name\)");
       this.t = view;
       view = m1.f(p0, R.id.tv_developer);
       a.o(view, "ViewBindUtils.bindWidget¡­tView, R.id.tv_developer\)");
       this.u = view;
       p0 = m1.f(p0, R.id.tv_privacy_info);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew, R.id.tv_privacy_info\)");
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.q8(n.class);
       a.o(obj, "inject\(HalfLandingItem::class.java\)");
       this.p = obj.a();
       return;
    }
}
