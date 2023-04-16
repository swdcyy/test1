package com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl;
import bn5.a;
import com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.growth.model.DeepLinkAdSource;
import android.content.Intent;
import androidx.core.app.a;
import android.net.Uri;
import java.lang.CharSequence;
import ekd.x0;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import vma.a;
import java.util.ArrayList;
import java.util.Iterator;
import cra.w;
import q87.c;
import lnc.u1;
import com.kwai.feature.api.feed.growth.model.DeepLinkAdSource$a;
import java.lang.Integer;
import java.util.Map;
import java.lang.ref.WeakReference;
import android.view.View;
import android.os.IBinder;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import i2b.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import jna.c;
import com.yxcorp.gifshow.growth.deeplink.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.growth.deeplink.AdvertisementFloatingManagerImpl$a;
import android.view.View$OnTouchListener;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.b;
import k2b.c;
import com.yxcorp.gifshow.log.b;
import jna.a;
import android.view.View$OnClickListener;
import nf6.i;
import xkd.b;
import nf6.a;
import android.content.ComponentName;
import java.lang.Float;
import java.lang.Number;
import com.yxcorp.utility.n;
import o56.a;
import com.kwai.feature.api.feed.growth.model.DeepLinkAdSource$BackDataSource;
import java.lang.StringBuilder;
import jna.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import android.graphics.Color;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import b66.k$a;

public class AdvertisementFloatingManagerImpl implements a	// class@00135b
{
    public boolean a;
    public int b;
    public int c;
    public List d;
    public Map e;
    public String f;
    public DeepLinkAdSource g;
    public String h;
    public Activity i;
    public static final Type j;

    static {
       AdvertisementFloatingManagerImpl.j = new AdvertisementFloatingManagerImpl$1().getType();
    }
    public void AdvertisementFloatingManagerImpl(){
       super();
       this.f = null;
       this.e = new HashMap();
       this.b = Integer.MIN_VALUE;
       this.c = Integer.MIN_VALUE;
    }
    public void a(String p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdvertisementFloatingManagerImpl.class, "5")) {
          return;
       }
       this.f = p0;
       this.c(p1);
       return;
    }
    public boolean b(Activity p0){
       AdvertisementFloatingManagerImpl obj = PatchProxy.applyOneRefs(p0, this, AdvertisementFloatingManagerImpl.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (obj == null || obj.mExitKwaiAppDirectly == null) {
          return 0;
       }
       this.k(p0, obj);
       this.g();
       p0.setResult(0, null);
       a.a(p0);
       this.a = false;
       return true;
    }
    public void c(Activity p0){
       int b1;
       DeepLinkAdSource mInitPositio;
       CharSequence uCharSequenc;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdvertisementFloatingManagerImpl uAdvertiseme = AdvertisementFloatingManagerImpl.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdvertiseme, "3")) {
          return;
       }
       AdvertisementFloatingManagerImpl obj = PatchProxy.applyOneRefs(p0, this, uAdvertiseme, "21");
       String str = null;
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(("SplashV2Activity").equalsIgnoreCase(p0.getClass().getSimpleName()) || ("SplashV3Activity").equalsIgnoreCase(p0.getClass().getSimpleName())){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          return;
       }else {
          obj = this.g;
          String str1 = "returnBack";
          AdvertisementFloatingManagerImpl uAdvertiseme1 = PatchProxy.applyOneRefs(p0, this, uAdvertiseme, "10");
          View view = null;
          if (uAdvertiseme1 != patchProxyRe) {
          }else {
             Intent intent = p0.getIntent();
             if (intent != null && (intent.getData() != null && intent.getData().isHierarchical())) {
                try{
                   uCharSequenc = ((intent.getData().toString()).contains(str1))? x0.a(intent.getData(), str1): x0.a(intent.getData(), "openFrom");
                }catch(java.lang.UnsupportedOperationException e5){
                   ExceptionHandler.handleCaughtException(e5);
                   uCharSequenc = view;
                }
                if (!TextUtils.x(uCharSequenc)) {
                   if (uCharSequenc.equals(this.h)) {
                      this.g = this.l(p0, this.g, intent.getData());
                   }else {
                      DeepLinkAdSource uDeepLinkAdS = PatchProxy.applyOneRefs(uCharSequenc, this, uAdvertiseme, "17");
                      String str2 = "AdvertisementFloatingMa";
                      if (uDeepLinkAdS != patchProxyRe) {
                      }else {
                         AdvertisementFloatingManagerImpl uAdvertiseme2 = PatchProxy.apply(view, this, uAdvertiseme, "1");
                         if (uAdvertiseme2 != patchProxyRe) {
                         }else if(this.d == null){
                            List list = a.c(AdvertisementFloatingManagerImpl.j);
                            this.d = list;
                            if (list == null) {
                               this.d = new ArrayList();
                            }
                         }
                         uAdvertiseme2 = this.d;
                         if (uAdvertiseme2 != null && !uAdvertiseme2.isEmpty()) {
                            Iterator iterator = uAdvertiseme2.iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  DeepLinkAdSource uDeepLinkAdS2 = iterator.next();
                                  if (uDeepLinkAdS2 != null && (!TextUtils.x(uDeepLinkAdS2.mOpenFromRegex) && uCharSequenc.matches(uDeepLinkAdS2.mOpenFromRegex))) {
                                     uDeepLinkAdS = uDeepLinkAdS2.clone();
                                  }
                               }
                            }
                         }else {
                            Object[] objArray1 = new Object[str];
                            w.C().w(str2, "No Deep Link sources", objArray1);
                         }
                         uDeepLinkAdS = view;
                      }
                      DeepLinkAdSource uDeepLinkAdS1 = this.l(p0, uDeepLinkAdS, intent.getData());
                      if (uDeepLinkAdS1 != null) {
                         this.h = uCharSequenc;
                         this.g = uDeepLinkAdS1;
                         this.i = view;
                         u1.b(this);
                      }else {
                         this.i = p0;
                         u1.a(this);
                         Object[] objArray = new Object[str];
                         w.C().A(str2, "No found matched deepLinkAdSource!", objArray);
                      }
                   }
                }
             }
          label_013d :
             AdvertisementFloatingManagerImpl tg = this.g;
             View obj1 = PatchProxy.applyOneRefs(tg, this, uAdvertiseme, "16");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else if(tg == null || TextUtils.x(tg.mName)){
                if (tg.mHideIfNoBackData != null) {
                   mInitPositio = tg.mContextData;
                   if (mInitPositio != null) {
                      if (mInitPositio.b == null) {
                         b2 = mInitPositio.c;
                      }
                   }
                }
                b2 = 1;
             }
          label_0162 :
             b2 = false;
             if (b2 != null) {
                uAdvertiseme1 = this.g;
             }else {
                obj1 = view;
             }
          }
          if (uAdvertiseme1 != null) {
             this.a = b;
          }
          if (!TextUtils.x(this.f)) {
             if ((this.f).equals("open")) {
                this.a = b;
             }else {
                this.a = str;
                this.g();
             }
          }
          if (this.e.get(Integer.valueOf(p0.hashCode())) != null) {
             view = this.e.get(Integer.valueOf(p0.hashCode())).get();
          }
          mInitPositio = (uAdvertiseme1 != null)? uAdvertiseme1.mInitPosition: 0xbf800000;
          if (this.a != null) {
             if (view != null && view.getWindowToken() != null) {
                p0.getWindowManager().updateViewLayout(view, this.h(p0, mInitPositio));
                if (uAdvertiseme1 != null && !uAdvertiseme1.equals(obj)) {
                   this.e(view, p0, uAdvertiseme1);
                   this.n(view, uAdvertiseme1, p0.getWindowManager());
                }
             }else {
                b1 = 0x7f0d009c;
                if (uAdvertiseme1 != null && !TextUtils.x(uAdvertiseme1.mStyle)) {
                   DeepLinkAdSource mStyle = uAdvertiseme1.mStyle;
                   int i = mStyle.hashCode();
                   if (i != -1986416409) {
                      if (i != 0x100e0 || !mStyle.equals("BIG")) {
                      label_021c :
                         str = -1;
                      }
                   }else if(mStyle.equals("NORMAL")){
                      str = 1;
                   }else {
                      goto label_021c ;
                   }
                   if (!str) {
                      b1 = 0x7f0d009d;
                   }
                }
             label_0223 :
                View view1 = a.a(p0, b1);
                if (!PatchProxy.applyVoidTwoRefs(p0, view1, this, uAdvertiseme, "6") && p0 instanceof GifshowActivity) {
                   p0.m().subscribe(new c(this, p0, view1), a.b);
                }
                WindowManager windowManage = p0.getWindowManager();
                WindowManager$LayoutParams layoutParams = this.h(p0, mInitPositio);
                view1.setOnTouchListener(new AdvertisementFloatingManagerImpl$a(this, windowManage, layoutParams));
                this.e(view1, p0, uAdvertiseme1);
                this.e.put(Integer.valueOf(p0.hashCode()), new WeakReference(view1));
                if (uAdvertiseme1 != null) {
                   this.n(view1, uAdvertiseme1, windowManage);
                }
                windowManage.addView(view1, layoutParams);
             }
          }else if(view != null && view.getWindowToken() != null){
             this.m(p0, view);
          }
          return;
       }
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, AdvertisementFloatingManagerImpl.class, "2")) {
          return;
       }
       this.f = null;
       b uob = b.a(0x4b316083).l0();
       Object[] objArray = (uob == null)? null: uob.c();
       if (objArray == null) {
          this.g = null;
          this.h = null;
          this.a = false;
       }
       return;
    }
    public final void e(View p0,Activity p1,DeepLinkAdSource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AdvertisementFloatingManagerImpl.class, "7")) {
          return;
       }
       p0.setOnClickListener(new a(this, p1, p2));
       return;
    }
    public final Intent f(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AdvertisementFloatingManagerImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Intent intent = b.a(0x66dce92a).c(p0, b.g(p1), true, true);
       if (intent == null || !a.a(intent)) {
          return null;
       }
       intent.addCategory("android.intent.category.BROWSABLE");
       intent.setComponent(null);
       intent.setSelector(null);
       return intent;
    }
    public final void g(){
       this.g = null;
       this.h = null;
    }
    public final WindowManager$LayoutParams h(Activity p0,float p1){
       Object obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdvertisementFloatingManagerImpl uAdvertiseme = AdvertisementFloatingManagerImpl.class;
       if (PatchProxy.isSupport(uAdvertiseme)) {
          obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uAdvertiseme, "19");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       WindowManager$LayoutParams layoutParams = new WindowManager$LayoutParams(-2, -2, 2, 8, -3);
       obj.gravity = 51;
       if (this.b == Integer.MIN_VALUE) {
          this.b = 0;
       }
       obj.x = this.b;
       if (PatchProxy.isSupport(uAdvertiseme)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uAdvertiseme, "20");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          label_0075 :
             obj.y = i;
             return obj;
          }
       }
       if (this.c == Integer.MIN_VALUE) {
          this.c = (!p1 - 0xbf800000)? n.t(p0) - n.c(a.B, 100.00f): (int)((float)n.t(p0) * p1);
       }
    label_0073 :
       i = this.c;
       goto label_0075 ;
    }
    public final String i(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AdvertisementFloatingManagerImpl.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && (!p0.isHierarchical() || TextUtils.x(p1))) {
          return null;
       }
       return x0.a(p0, p1);
    }
    public final boolean j(String p0,String p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, AdvertisementFloatingManagerImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.x(p0) && !TextUtils.x(p1)) {
          return p0.matches(p1);
       }
       return TextUtils.x(p1);
    }
    public final void k(Activity p0,DeepLinkAdSource p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdvertisementFloatingManagerImpl.class, "15")) {
          return;
       }
       if (p1 != null) {
          p1 = p1.mContextData;
          if (p1 != null) {
             DeepLinkAdSource$a a = p1.a;
             if (a != null) {
                p0.startActivity(a);
             }
          }
       }
       return;
    }
    public final DeepLinkAdSource l(Activity p0,DeepLinkAdSource p1,Uri p2){
       Object[] objArray;
       DeepLinkAdSource uDeepLinkAdS;
       String str;
       Intent intent;
       DeepLinkAdSource obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdvertisementFloatingManagerImpl.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p1 == null) {
          return obj;
       }
       DeepLinkAdSource mBackDataSou = p1.mBackDataSource;
       if (mBackDataSou != null) {
          p1.mContextData = new DeepLinkAdSource$a();
          DeepLinkAdSource$BackDataSource mType = mBackDataSou.mType;
          if (mType != true) {
             if (mType != 2) {
                objArray = new Object[0];
                w.C().w("AdvertisementFloatingMa", "unknown type", objArray);
                DeepLinkAdSource$a uoa = new DeepLinkAdSource$a();
                p1.mContextData = uoa;
                uoa.b = true;
                uDeepLinkAdS = obj;
             }else {
                str = this.i(p2, mBackDataSou.mBackDataKey);
                if (!TextUtils.x(str)) {
                   p1.mContextData.c = true;
                }
                if (this.j(str, p1.mBackDataSource.mBackDataPattern)) {
                   intent = this.f(p0, str);
                   if (intent != null) {
                      p1.mContextData.a = intent;
                   }else {
                      Object[] objArray2 = new Object[0];
                      w.C().w("AdvertisementFloatingMa", "build intent failed", objArray2);
                   }
                }
                uDeepLinkAdS = this.i(p2, p1.mBackDataSource.mBtnNameKey);
                if (p1.mBackDataSource.mHideIfNoBtnName != null || !TextUtils.x(uDeepLinkAdS)) {
                   p1.mName = uDeepLinkAdS;
                }
             }
          }else {
             str = this.i(p2, mBackDataSou.mBackDataKey);
             if (!TextUtils.x(str)) {
                p2.c = true;
             }
             if (this.j(str, p1.mBackDataSource.mBackDataPattern)) {
                intent = this.f(p0, str);
                if (intent != null) {
                   p2.a = intent;
                }else {
                   objArray = new Object[0];
                   w.C().w("AdvertisementFloatingMa", "build intent failed", objArray);
                }
             }
             uDeepLinkAdS = this.i(b.g(str), p1.mBackDataSource.mBtnNameKey);
             if (p1.mBackDataSource.mHideIfNoBtnName != null || !TextUtils.x(uDeepLinkAdS)) {
                p1.mName = uDeepLinkAdS;
             }
          }
          Object[] objArray1 = new Object[0];
          w.C().w("AdvertisementFloatingMa", "url "+TextUtils.k(obj)+" btn name "+TextUtils.k(uDeepLinkAdS), objArray1);
       }
       return p1;
    }
    public final void m(Activity p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdvertisementFloatingManagerImpl.class, "4")) {
          return;
       }
       p0.getWindowManager().removeView(p1);
       this.e.remove(Integer.valueOf(p0.hashCode()));
       return;
    }
    public final void n(View p0,DeepLinkAdSource p1,WindowManager p2){
       GradientDrawable gradientDraw;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AdvertisementFloatingManagerImpl.class, "8")) {
          return;
       }
       View view = p0.findViewById(R.id.floating_close);
       DeepLinkAdSource mEnableClose = p1.mEnableClose;
       int i = 4;
       if (mEnableClose == null || mEnableClose.booleanValue()) {
          view.setVisibility(0);
          view.setOnClickListener(new b(this, p2, p0));
       }else {
          view.setVisibility(i);
       }
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.floating_icon);
       int i1 = 8;
       if (!TextUtils.x(p1.mIconUrl)) {
          kwaiImageVie.setVisibility(0);
          kwaiImageVie.L(p1.mIconUrl);
       }else {
          kwaiImageVie.setVisibility(i1);
       }
       int i2 = 0x7f0a0f21;
       if (!TextUtils.x(p1.mName)) {
          p0.findViewById(i2).setText(p1.mName);
       }
       if (!TextUtils.x(p1.mTextColor)) {
          p0.findViewById(i2).setTextColor(Color.parseColor(p1.mTextColor));
       }
       if (!TextUtils.x(p1.mBackgroundColor)) {
          SelectShapeLinearLayout selectShapeL = p0.findViewById(R.id.floatingBg);
          int i3 = 60;
          int i4 = Color.parseColor(p1.mBackgroundColor);
          AdvertisementFloatingManagerImpl uAdvertiseme = AdvertisementFloatingManagerImpl.class;
          if (PatchProxy.isSupport(uAdvertiseme)) {
             gradientDraw = PatchProxy.applyTwoRefs(Integer.valueOf(i3), Integer.valueOf(i4), this, uAdvertiseme, "9");
             if (gradientDraw != PatchProxyResult.class) {
             label_00e0 :
                selectShapeL.setBackground(gradientDraw);
             }
          }
          float[] uofloatArray = new float[i1];
          uofloatArray[0] = 0;
          uofloatArray[1] = 0;
          float f = (float)i3;
          uofloatArray[2] = f;
          uofloatArray[3] = f;
          uofloatArray[i] = f;
          uofloatArray[5] = f;
          uofloatArray[6] = 0;
          uofloatArray[7] = 0;
          GradientDrawable gradientDraw1 = new GradientDrawable();
          gradientDraw1.setShape(0);
          gradientDraw1.setGradientType(0);
          gradientDraw1.setCornerRadii(uofloatArray);
          gradientDraw1.setColor(i4);
          gradientDraw = gradientDraw1;
          goto label_00e0 ;
       }
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdvertisementFloatingManagerImpl.class, "22")) {
          return;
       }
       if (p0.a == 2 && this.i != null) {
          this.d = a.c(AdvertisementFloatingManagerImpl.j);
          this.c(this.i);
       }
       return;
    }
}
