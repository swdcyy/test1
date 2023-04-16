package com.tachikoma.component.imageview.TKAnimatedImage;
import android.os.Handler$Callback;
import com.tachikoma.core.component.e;
import gx4.f;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import vn8.s;
import android.os.Handler;
import crd.b;
import android.os.Message;
import java.lang.Boolean;
import java.util.List;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import android.graphics.drawable.Drawable;
import java.lang.IndexOutOfBoundsException;
import java.lang.Throwable;
import zp8.a;
import com.tkruntime.v8.V8Value;
import ln8.a;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import wp8.a;
import un8.w;
import java.lang.CharSequence;
import android.text.TextUtils;
import tx4.x;
import iq8.d;
import java.lang.StringBuilder;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.tachikoma.component.imageview.TKAnimatedImage$a;
import java.lang.Runnable;
import iq8.x;
import com.tachikoma.core.utility.f;
import com.tkruntime.v8.V8Array;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import com.tachikoma.core.utility.b;
import brd.a0;
import java.lang.Iterable;
import brd.t;
import iq8.i;
import erd.o;
import iq8.h;
import brd.z;
import io.reactivex.android.schedulers.a;
import un8.e;
import un8.a;
import erd.g;
import java.lang.Double;
import un8.g;
import java.util.concurrent.Callable;
import lrd.b;
import un8.d;
import com.tachikoma.component.imageview.a;
import yp8.a;
import jq8.a;
import lg.i;
import android.graphics.Bitmap;
import iq8.b;
import android.graphics.drawable.BitmapDrawable;
import un8.i;
import java.lang.reflect.Type;
import el.a;
import un8.h;
import un8.f;
import java.lang.RuntimeException;
import android.graphics.drawable.AnimationDrawable;
import iq8.g;
import un8.b;
import un8.c;

public class TKAnimatedImage extends e implements Handler$Callback	// class@000cf9
{
    public int A;
    public int B;
    public boolean C;
    public JsValueRef D;
    public JsValueRef E;
    public JsValueRef F;
    public JsValueRef G;
    public JsValueRef H;
    public int I;
    public b J;
    public long K;
    public boolean L;
    public String M;
    public String N;
    public b O;
    public boolean isAnimating;
    public boolean playNow;
    public String src;
    public String uri;
    public List v;
    public Handler w;
    public int x;
    public int y;
    public long z;

    public void TKAnimatedImage(f p0){
       super(p0);
       this.B = -1;
       this.playNow = true;
       this.isAnimating = false;
       this.I = 2;
       this.K = 0;
       this.L = false;
    }
    public JSONObject collectViewAttrs(){
       JSONObject obj = PatchProxy.apply(null, this, TKAnimatedImage.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.collectViewAttrs();
       try{
          obj.put("src", this.src);
          obj.put("uri", this.uri);
          obj.put("placeholder", this.M);
          obj.put("fallbackImage", this.N);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return obj;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public ImageView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKAnimatedImage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n().h(p0);
    }
    public void destroyOnMainThread(){
       if (PatchProxy.applyVoid(null, this, TKAnimatedImage.class, "3")) {
          return;
       }
       TKAnimatedImage tw = this.w;
       if (tw != null) {
          tw.removeCallbacksAndMessages(null);
          this.w = null;
       }
       tw = this.J;
       if (tw != null && !tw.isDisposed()) {
          this.J.dispose();
       }
       tw = this.O;
       if (tw != null && !tw.isDisposed()) {
          this.O.dispose();
       }
       return;
    }
    public boolean getIsAnimating(){
       return this.isAnimating;
    }
    public boolean handleMessage(Message p0){
       TKAnimatedImage tH;
       int i1;
       TKAnimatedImage obj = PatchProxy.applyOneRefs(p0, this, TKAnimatedImage.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       if (obj != null && obj.size() > 0) {
          p0 = p0.what;
          Object[] objArray = null;
          String str = 3;
          int i = 2;
          if (p0 != true) {
             if (p0 != i) {
                if (p0 == str) {
                   tH = this.H;
                   if (tH != null) {
                      this.m(tH.get());
                   }
                }
             }else {
                tH = this.D;
                if (tH != null) {
                   this.m(tH.get());
                }
                if (!PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "43") && this.B >= null) {
                   i1 = this.B % this.v.size();
                   this.A = i1;
                   this.s(this.v.get(i1));
                }
                this.isAnimating = false;
             }
          }else if(this.C != null){
             tH = this.D;
             if (tH != null) {
                this.m(tH.get());
             }
             return true;
          }else if(PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "42")){
             int i2 = this.v.size();
             i1 = this.A % i2;
             if (i1 == (this.v.size() - true)) {
                int i3 = this.x + true;
                this.x = i3;
                TKAnimatedImage ty = this.y;
                if (i3 >= ty && ty != null) {
                   this.w.removeMessages(true);
                   this.w.sendEmptyMessageDelayed(i, this.z);
                }else {
                   this.w.sendEmptyMessageDelayed(str, this.z);
                   this.w.sendEmptyMessageDelayed(true, this.z);
                }
             }else {
                this.w.sendEmptyMessageDelayed(true, this.z);
             }
             this.A = this.A + true;
             if (i1 < 0 || i1 >= i2) {
                a.g("updateFrameAnimation", new IndexOutOfBoundsException("updateFrameAnimation"));
             }else {
                this.s(this.v.get(i1));
             }
          }
       }
       return true;
    }
    public final void m(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "40")) {
          return;
       }
       if (p0 != null && !p0.isReleased()) {
          if (a.c.booleanValue()) {
             p0.setFunctionName("TKAnimatedImage_executeFrameAnimationCallback");
          }
          if (y.a(p0)) {
             Object[] objArray = new Object[0];
             p0.call(null, objArray);
          }
       }
    label_0037 :
       return;
    }
    public final s n(){
       Object obj = PatchProxy.apply(null, this, TKAnimatedImage.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return w.b().b;
    }
    public final String o(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, TKAnimatedImage.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       obj = (this.getRootDir()).concat(x.a(p0, "bundle://"));
       if (d.a(obj)) {
          return obj;
       }
       a.g("showBundleImage", new Exception(p0+" not exist"));
       return null;
    }
    public void onAnimationDidException(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "38")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKAnimatedImage_onAnimationDidException");
       }
       y.c(this.F);
       this.F = y.b(p0, this);
       return;
    }
    public void onAnimationDidRepeat(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "35")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKAnimatedImage_onAnimationDidRepeat");
       }
       y.c(this.H);
       this.H = y.b(p0, this);
       return;
    }
    public void onAnimationDidStart(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "37")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKAnimatedImage_onAnimationDidStart");
       }
       y.c(this.E);
       this.E = y.b(p0, this);
       return;
    }
    public void onAnimationDidStop(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "36")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKAnimatedImage_onAnimationDidStop");
       }
       y.c(this.D);
       this.D = y.b(p0, this);
       return;
    }
    public void onAnimationImagesDidLoaded(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "39")) {
          return;
       }
       if (a.c.booleanValue() && p0 != null) {
          p0.setFunctionName("TKAnimatedImage_onAnimationImagesDidLoaded");
       }
       y.c(this.G);
       this.G = y.b(p0, this);
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       if (PatchProxy.isSupport(TKAnimatedImage.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, TKAnimatedImage.class, "2")) {
          return;
       }
       super.onDestroy(p0, p1);
       if (p1) {
          this.destroyOnMainThread();
       }else {
          x.f(new TKAnimatedImage$a(this));
       }
       return;
    }
    public final String p(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, TKAnimatedImage.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = null;
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       if (p0.startsWith("bundle://")) {
          return this.o(p0);
       }
       obj = "file://";
       if (p0.startsWith(obj)) {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, TKAnimatedImage.class, "12");
          if (obj1 != patchProxyRe) {
             str = obj1;
          }else if(TextUtils.isEmpty(p0)){
             String str1 = x.a(p0, obj);
             if (!d.a(str1)) {
                a.g("showFileImage", new Exception(p0+" not exist"));
             }else {
                str = str1;
             }
          }
          return str;
       }else if(p0.startsWith("asset://")){
          Object obj2 = PatchProxy.applyOneRefs(p0, this, TKAnimatedImage.class, "13");
          if (obj2 != patchProxyRe) {
             str = obj2;
          }else if(TextUtils.isEmpty(p0)){
             p0 = x.b(p0);
             if (!f.a(p0, "drawable", str)) {
                a.g("showAssetImage", new Exception(this.uri+" not exist"));
             }else {
                str = p0;
             }
          }
          return str;
       }else if(p0.startsWith("http://") || p0.startsWith("https://")){
          p0 = this.o(p0);
       }
       return p0;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, TKAnimatedImage.class, "25")) {
          return;
       }
       TKAnimatedImage tv = this.v;
       if (tv == null || tv.size() <= 0) {
          a.a("setAnimationImages", "frame list is empty!!!");
          tv = this.F;
          if (tv != null) {
             this.m(tv.get());
          }
          return;
       }else if(this.w == null){
          this.w = new Handler(this);
       }
       this.x = 0;
       this.A = 0;
       this.C = false;
       this.isAnimating = true;
       this.w.removeMessages(true);
       this.w.removeMessages(2);
       this.w.removeMessages(3);
       this.w.sendEmptyMessage(true);
       tv = this.E;
       if (tv != null) {
          this.m(tv.get());
       }
       return;
    }
    public final void r(boolean p0){
       if (PatchProxy.isSupport(TKAnimatedImage.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TKAnimatedImage.class, "28")) {
          return;
       }
       if (2 != this.I) {
          return;
       }
       int id = this.getView().getId();
       if (id == -1) {
          id = 0x7f0a021b;
          this.getView().setId(id);
       }
       this.getView().setTag(id, Boolean.valueOf(p0));
       return;
    }
    public final void s(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "44")) {
          return;
       }
       this.getView().setImageDrawable(p0);
       return;
    }
    public void setAnimationImages(V8Array p0,int p1,int p2){
       TKAnimatedImage tF;
       a0 uoa0;
       if (PatchProxy.isSupport(TKAnimatedImage.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKAnimatedImage.class, "24")) {
          return;
       }
       int i = 1;
       this.I = i;
       TKAnimatedImage tJ = this.J;
       if (tJ != null && !tJ.isDisposed()) {
          this.J.dispose();
       }
       if (this.isAnimating != null) {
          tJ = this.D;
          if (tJ != null) {
             this.m(tJ.get());
          }
       }
       tJ = this.w;
       int i1 = 3;
       if (tJ != null) {
          tJ.removeMessages(i);
          this.w.removeMessages(2);
          this.w.removeMessages(i1);
       }
       String str = "TKAnimatedImage";
       if (p0 != null && (p0.length() <= 0 || p1 <= 0)) {
          a.a(str, "setAnimationsImages params illegal -- 1");
          tF = this.F;
          if (tF != null) {
             this.m(tF.get());
          }
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          uArrayList.addAll(p0.getList());
          if (uArrayList.size() <= 0 || p1 <= 0) {
             a.a(str, "setAnimationsImages params illegal -- 2");
             tF = this.F;
             if (tF != null) {
                this.m(tF.get());
             }
             return;
          }else {
             int i2 = 0;
             String str1 = uArrayList.get(i2);
             int i3 = str1.indexOf(58);
             if (i3 == -1) {
                a.a(str, "setAnimationsImages params illegal -- 3");
                tF = this.F;
                if (tF != null) {
                   this.m(tF.get());
                }
                return;
             }else {
                str1 = str1.substring(i2, i3)+"://";
                Objects.requireNonNull(str1);
                if (!str1.equals("https://") && !str1.equals("http://")) {
                   Context context = this.getContext();
                   String str2 = this.getTKJSContext().e();
                   String rootDir = this.getRootDir();
                   if (PatchProxy.isSupport(b.class)) {
                      Object[] objArray = new Object[]{context,uArrayList,str2,rootDir,Integer.valueOf(i2),Integer.valueOf(i2)};
                      uoa0 = PatchProxy.apply(objArray, null, b.class, "4");
                      if (uoa0 != PatchProxyResult.class) {
                      }else if(uArrayList.isEmpty()){
                         uoa0 = a0.s(new Throwable("urilist is null or empty"));
                      }else {
                         i oi = new i(context, str2, rootDir, 0, 0);
                         t ot = t.fromIterable(uArrayList).concatMap(i);
                         uoa0 = ot.map(new h(context)).observeOn(a.c()).toList();
                      }
                   }else {
                      goto label_011a ;
                   }
                   this.J = uoa0.R(new e(this, p1, p2, uArrayList), new a(this));
                   return;
                }else {
                   a.a(str, "setAnimationsImages params illegal -- 4");
                   tF = this.F;
                   if (tF != null) {
                      this.m(tF.get());
                   }
                   return;
                }
             }
          }
       }
    }
    public void setAnimationRepeatCount(int p0){
       if (PatchProxy.isSupport(TKAnimatedImage.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKAnimatedImage.class, "27")) {
          return;
       }
       this.y = p0;
       if (2 == this.I) {
          this.getView().setTag(R.id.animated_repeat_count, Integer.valueOf(this.y));
       }
       return;
    }
    public void setAutoPlay(boolean p0){
    }
    public void setBorderColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "22")) {
          return;
       }
       this.n().d(this.getView(), p0);
       return;
    }
    public void setBorderRadius(int p0){
       if (PatchProxy.isSupport(TKAnimatedImage.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKAnimatedImage.class, "23")) {
          return;
       }
       this.n().c(this.getView(), p0);
       return;
    }
    public void setBorderWidth(double p0){
       if (PatchProxy.isSupport(TKAnimatedImage.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, TKAnimatedImage.class, "21")) {
          return;
       }
       this.n().a(this.getView(), p0);
       return;
    }
    public void setCDNUrls(String p0,int p1,int p2,String p3,String p4,int p5){
       if (PatchProxy.isSupport(TKAnimatedImage.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "18")) {
             return;
          }
       }
       TKAnimatedImage tJ = this.J;
       if (tJ != null && !tJ.isDisposed()) {
          this.J.dispose();
       }
       if (!PatchProxy.applyVoidOneRefs(p3, this, TKAnimatedImage.class, "19")) {
          if (TextUtils.isEmpty(p3)) {
             this.s(null);
          }else {
             this.setUri(p3);
          }
       }
       this.J = a0.y(new g(this, p0)).T(b.c()).G(a.c()).R(new d(this, p1, p2, p4), a.b);
       return;
    }
    public void setContentMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "20")) {
          return;
       }
       if (this.getView() == null) {
          return;
       }
       this.L = true;
       this.n().b(this.getView(), p0);
       return;
    }
    public void setFallbackImage(String p0){
       this.N = p0;
    }
    public void setPlaceholder(String p0){
       this.M = p0;
    }
    public void setPlayNow(boolean p0){
       this.playNow = p0;
    }
    public void setSrc(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "5")) {
          return;
       }
       this.src = p0;
       if (p0.startsWith("//")) {
          this.src = "https:"+this.src;
       }
       if (this.L == null) {
          this.n().b(this.getView(), "contain");
       }
       this.n().j(this.getView(), p0, this.getRootDir(), this.getTKJSContext().e());
       return;
    }
    public void setStayFrameEnd(int p0){
       this.B = p0;
    }
    public void setUri(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKAnimatedImage.class, "7")) {
          return;
       }
       if (p0 != null && p0.equals(this.uri)) {
          return;
       }
       this.uri = p0;
       this.r(this.playNow);
       Drawable uDrawable = null;
       this.s(uDrawable);
       int i = (int)this.getDomNode().c().d().a;
       int i1 = (int)this.getDomNode().c().l().a;
       if (p0 != null && (p0.startsWith("data:image") || p0.startsWith("data:Image"))) {
          if (!PatchProxy.applyVoid(uDrawable, this, TKAnimatedImage.class, "8")) {
             Bitmap uBitmap = b.c(this.uri);
             if (uBitmap != null) {
                this.s(new BitmapDrawable(uBitmap));
             }
          }
          return;
       }else {
          this.t(this.M, i1, i);
          return;
       }
    }
    public void setUriWith(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKAnimatedImage.class, "9")) {
          return;
       }
       this.uri = p0;
       this.r(this.playNow);
       this.s(null);
       this.t(this.M, (int)this.getDomNode().c().l().a, (int)this.getDomNode().c().d().a);
       return;
    }
    public void setUrlAndPlaceHolder(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKAnimatedImage.class, "14")) {
          return;
       }
       this.r(this.playNow);
       this.src = p0;
       if (p0.startsWith("//")) {
          this.src = "https:"+this.src;
       }
       this.n().k(this.getView(), p0, p1, this.getRootDir(), (int)this.getDomNode().c().l().a, (int)this.getDomNode().c().d().a, this.getTKJSContext().e());
       return;
    }
    public void setUrls(String p0,int p1,int p2){
       TKAnimatedImage tKAnimatedIm = this;
       if (PatchProxy.isSupport(TKAnimatedImage.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKAnimatedImage.class, "15")) {
          return;
       }
       if (!PatchProxy.isSupport(TKAnimatedImage.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKAnimatedImage.class, "16")) {
          long l = 1 + tKAnimatedIm.K;
          tKAnimatedIm.K = l;
          this.n().l(this.getView(), null, p1, p2, this.getTKJSContext().e());
          f uof = new f(this, l, p1, p2);
          a0.y(new h(p0, new i(this).getType())).T(b.c()).G(a.c()).Q(v8);
       }
       return;
    }
    public void startImageAnimation(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "29")) {
          return;
       }
       TKAnimatedImage tI = this.I;
       boolean b = true;
       if (b == tI) {
          if (!PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "30")) {
             tI = this.v;
             if (tI == null || tI.size() <= 0) {
                a.g("startImageAnimation", new RuntimeException("please set params first"));
             }
             tI = this.J;
             if (tI != null && !tI.isDisposed()) {
                this.playNow = b;
             }else {
                this.q();
             }
          }
       }else if(2 != tI || PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "31")){
          this.n().m(this.getView());
       }
       return;
    }
    public void stopImageAnimation(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "32")) {
          return;
       }
       TKAnimatedImage tI = this.I;
       int i = 2;
       if (true == tI) {
          if (!PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "33")) {
             this.C = true;
             this.isAnimating = false;
             if (this.getView().getDrawable() instanceof AnimationDrawable) {
                tI = this.w;
                if (tI != null) {
                   tI.removeMessages(true);
                   this.w.removeMessages(i);
                   this.w.removeMessages(3);
                }
             }
          }
       }else if(i != tI || PatchProxy.applyVoid(objArray, this, TKAnimatedImage.class, "34")){
          this.n().e(this.getView());
       }
       return;
    }
    public boolean supportAsyncPrepareView(){
       return true;
    }
    public final void t(String p0,int p1,int p2){
       String this;
       a0 uoa0;
       TKAnimatedImage tKAnimatedIm = this;
       int i = p1;
       int i1 = p2;
       if (PatchProxy.isSupport(TKAnimatedImage.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKAnimatedImage.class, "17")) {
          return;
       }
       TKAnimatedImage o = tKAnimatedIm.O;
       if (o != null && !o.isDisposed()) {
          tKAnimatedIm.O.dispose();
       }
       if (tKAnimatedIm.L == null) {
          this.n().b(this.getView(), "contain");
       }
       if (TextUtils.isEmpty(p0)) {
          this.n().i(this.getView(), this.p(tKAnimatedIm.uri), null, this.p(tKAnimatedIm.N), p1, p2, this.getTKJSContext().e());
          return;
       }else {
          Context context = this.getContext();
          String str = this.getTKJSContext().e();
          this = this.getRootDir();
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray = new Object[]{context,p0,str,this,Integer.valueOf(p1),Integer.valueOf(p2)};
             uoa0 = PatchProxy.apply(objArray, null, uob, "2");
             if (uoa0 != PatchProxyResult.class) {
             label_00ca :
                tKAnimatedIm.O = uoa0.R(new b(this, i, i1), new c(this, i, i1));
                return;
             }
          }
          uoa0 = b.g(context, p0, str, this, p1, p2).C(new g(context));
          goto label_00ca ;
       }
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKAnimatedImage.class, "4")) {
          return;
       }
       super.unRetainAllJsObj();
       y.c(this.E);
       y.c(this.D);
       y.c(this.F);
       y.c(this.G);
       y.c(this.H);
       return;
    }
}
