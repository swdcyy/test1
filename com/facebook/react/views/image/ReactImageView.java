package com.facebook.react.views.image.ReactImageView;
import com.facebook.drawee.view.GenericDraweeView;
import android.graphics.Matrix;
import android.content.Context;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import pf.a;
import pf.g;
import pf.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yb.a;
import yb.b;
import android.content.res.Resources;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.react.views.image.ImageResizeMethod;
import yd.e;
import android.graphics.Shader$TileMode;
import pf.d;
import xb.t$b;
import com.facebook.react.views.image.ReactImageView$d;
import com.facebook.react.views.image.ReactImageView$e;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import com.facebook.react.views.image.ReactImageView$LastResizeViewState;
import com.facebook.react.views.image.ReactImageView$a;
import java.lang.Number;
import android.widget.ImageView;
import java.lang.Math;
import pf.h;
import com.facebook.react.views.image.ReactImageView$LastResizeViewState$ExceptionType;
import java.lang.Integer;
import android.view.View;
import lg.d;
import java.lang.Boolean;
import java.util.List;
import xb.p;
import java.lang.Float;
import ze.p;
import hd.b;
import ze.d;
import ub.b;
import qf.c;
import android.graphics.drawable.Drawable;
import com.facebook.react.bridge.ReadableMap;
import xb.c;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import df.c;
import com.facebook.react.bridge.ReadableArray;
import qf.a;
import android.net.Uri;
import java.lang.StringBuilder;
import cb.a;
import qf.b$b;
import qf.b;
import ib.c;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.generic.RoundingParams$RoundingMethod;
import jd.c;
import pf.e;
import uc.d;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import wd.a;
import com.facebook.react.views.image.ReactImageView$b;
import dd.d;
import uc.c;
import uc.b;
import android.graphics.Bitmap$Config;
import oe.b;
import ac.a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.drawee.controller.ForwardingControllerListener;
import com.facebook.react.views.image.ReactImageView$c;
import ub.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import java.util.Objects;
import java.util.Arrays;

public class ReactImageView extends GenericDraweeView	// class@0013c2
{
    public final ReactImageView$e A;
    public b B;
    public b C;
    public b D;
    public a E;
    public final Object F;
    public int G;
    public boolean H;
    public ReadableMap I;
    public g J;
    public c K;
    public AtomicBoolean L;
    public ReactImageView$LastResizeViewState M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public String S;
    public String T;
    public ImageResizeMethod h;
    public boolean i;
    public final List j;
    public a k;
    public a l;
    public Drawable m;
    public Drawable n;
    public p o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public float[] u;
    public t$b v;
    public Shader$TileMode w;
    public boolean x;
    public final AbstractDraweeControllerBuilder y;
    public final ReactImageView$d z;
    public static float[] U;
    public static float U0;
    public static final Matrix V;
    public static final Matrix V0;
    public static final Matrix W;

    static {
       float[] uofloatArray = new float[4];
       ReactImageView.U = uofloatArray;
       ReactImageView.V = new Matrix();
       ReactImageView.W = new Matrix();
       ReactImageView.U0 = 3.00f;
       ReactImageView.V0 = new Matrix();
    }
    public void ReactImageView(Context p0,AbstractDraweeControllerBuilder p1,a p2,g p3,c p4){
       a uoa = PatchProxy.applyOneRefs(p0, null, ReactImageView.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          b uob = new b(p0.getResources());
          uob.z(RoundingParams.c(0));
          uoa = uob.a();
       }
       super(p0, uoa);
       this.h = ImageResizeMethod.AUTO;
       this.i = e.f;
       this.p = 0;
       this.t = Float.NaN;
       this.w = d.a();
       this.G = -1;
       this.N = 0;
       this.R = 0;
       this.S = null;
       this.T = null;
       this.v = d.b();
       this.y = p1;
       this.z = new ReactImageView$d(this);
       this.A = new ReactImageView$e(this);
       this.E = p2;
       this.F = null;
       this.j = new LinkedList();
       this.J = p3;
       this.K = p4;
       this.L = new AtomicBoolean(e.x);
       this.M = new ReactImageView$LastResizeViewState(null);
       return;
    }
    public static void setScaleThreshold(float p0){
       ReactImageView.U0 = p0;
    }
    public final float getIdealSize(){
       Object obj = PatchProxy.apply(null, this, ReactImageView.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)((Math.max(this.getWidth(), this.getHeight()) * 2) + 1);
    }
    public final float getResizeBitmapSize(){
       ReactImageView obj = PatchProxy.apply(null, this, ReactImageView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       if (!this.L.get()) {
          return f;
       }
       if (this.getWidth() <= 0 || this.getHeight() <= 0) {
          this.M.f = ReactImageView$LastResizeViewState$ExceptionType.INVALID_VIEW_SIZE;
          return f;
       }else {
          obj = this.v;
          if (obj == t$b.h || obj == h.l) {
             this.M.f = ReactImageView$LastResizeViewState$ExceptionType.SCALE_TYPE;
             return f;
          }else {
             obj = this.M;
             if (obj.e != this.k) {
                obj.f = ReactImageView$LastResizeViewState$ExceptionType.SOURCE_CHANGED;
                return this.getIdealSize();
             }else if(obj.a == null || (obj.b == null && (this.getWidth() && this.getHeight()))){
                return this.getIdealSize();
             }else {
                obj = this.M;
                ReactImageView$LastResizeViewState d = obj.d;
                if (!d - f || (!d - Float.MAX_VALUE || (obj.a == this.getWidth() && this.M.b == this.getHeight()))) {
                   return f;
                }
                obj = this.N;
                this.N = obj + 1;
                if (obj <= 3) {
                   return this.getIdealSize();
                }
                this.M.f = ReactImageView$LastResizeViewState$ExceptionType.SIZE_CHANGED;
                return Float.MAX_VALUE;
             }
          }
       }
    }
    public boolean hasOverlappingRendering(){
       return false;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactImageView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactImageView.class, "15")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && p1 > 0) {
          boolean b = (this.x == null && (this.s() || this.t()))? true: false;
          this.x = b;
          this.u();
       }
       return;
    }
    public void r(float[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageView.class, "12")) {
          return;
       }
       ReactImageView tt = (!d.a(this.t))? this.t: null;
       ReactImageView tu = this.u;
       int i = 0;
       int i1 = (tu != null && !d.a(tu[i]))? this.u[i]: tt;
       p0[i] = i1;
       tu = this.u;
       i = 1;
       i1 = (tu != null && !d.a(tu[i]))? this.u[i]: tt;
       p0[i] = i1;
       tu = this.u;
       i = 2;
       i1 = (tu != null && !d.a(tu[i]))? this.u[i]: tt;
       p0[i] = i1;
       tu = this.u;
       if (tu != null && !d.a(tu[3])) {
          tt = this.u[3];
       }
       p0[3] = tt;
       return;
    }
    public final boolean s(){
       Object obj = PatchProxy.apply(null, this, ReactImageView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.j.size() <= b) {
          b = false;
       }
       return b;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(ReactImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactImageView.class, "4")) {
          return;
       }
       if (this.p != p0) {
          if (this.P != null) {
             this.O = true;
          }
          this.p = p0;
          this.o = new p(p0);
          this.x = true;
       }
       return;
    }
    public void setBlurRadius(float p0){
       if (PatchProxy.isSupport(ReactImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactImageView.class, "3")) {
          return;
       }
       if (this.P != null && this.R - p0) {
          this.O = true;
       }
       this.R = p0;
       int i = (int)p.c(p0);
       this.B = (!i)? null: new b(i);
       this.x = true;
       return;
    }
    public void setBorderColor(int p0){
       if (this.P != null && this.q != p0) {
          this.O = true;
       }
       this.q = p0;
       this.x = true;
       return;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(ReactImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactImageView.class, "6")) {
          return;
       }
       if (!d.a(this.t, p0)) {
          if (this.P != null) {
             this.O = true;
          }
          this.t = p0;
          this.x = true;
       }
       return;
    }
    public void setBorderWidth(float p0){
       if (PatchProxy.isSupport(ReactImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactImageView.class, "5")) {
          return;
       }
       p0 = p.c(p0);
       if (this.P != null && this.s - p0) {
          this.O = true;
       }
       this.s = p0;
       this.x = true;
       return;
    }
    public void setControllerListener(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageView.class, "14")) {
          return;
       }
       this.D = p0;
       this.x = true;
       this.u();
       return;
    }
    public void setDefaultSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageView.class, "10")) {
          return;
       }
       if (this.P != null) {
          if (p0 == null || p0.equals(this.S)) {
             ReactImageView tS = this.S;
             if (tS == null || tS.equals(p0)) {
             label_0026 :
                this.S = p0;
                this.m = c.a().b(this.getContext(), p0);
                this.x = true;
                return;
             }
          }
          this.O = true;
          goto label_0026 ;
       }else {
          goto label_0026 ;
       }
    }
    public void setFadeDuration(int p0){
       this.G = p0;
    }
    public void setHeaders(ReadableMap p0){
       this.I = p0;
    }
    public void setLoadingIndicatorSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageView.class, "11")) {
          return;
       }
       if (this.P != null) {
          if (p0 == null || p0.equals(this.T)) {
             ReactImageView tT = this.T;
             if (tT == null || tT.equals(p0)) {
             label_0026 :
                this.T = p0;
                Drawable uDrawable = c.a().b(this.getContext(), p0);
                c uoc = (uDrawable != null)? new c(uDrawable, 1000): null;
                this.n = uoc;
                this.x = true;
                return;
             }
          }
          this.O = true;
          goto label_0026 ;
       }else {
          goto label_0026 ;
       }
    }
    public void setOverlayColor(int p0){
       if (this.P != null && this.r != p0) {
          this.O = true;
       }
       this.r = p0;
       this.x = true;
       return;
    }
    public void setProgressiveRenderingEnabled(boolean p0){
       this.H = p0;
    }
    public void setResizeMethod(ImageResizeMethod p0){
       if (this.P != null && this.h != p0) {
          this.O = true;
       }
       this.h = p0;
       this.x = true;
       return;
    }
    public void setScaleType(t$b p0){
       if (this.P != null && this.v != p0) {
          this.O = true;
       }
       this.v = p0;
       this.x = true;
       return;
    }
    public void setShouldNotifyLoadEvents(boolean p0){
       if (PatchProxy.isSupport(ReactImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReactImageView.class, "2")) {
          return;
       }
       if (this.P != null && this.Q != p0) {
          this.O = true;
       }
       this.Q = p0;
       this.C = (!p0)? null: new ReactImageView$a(this, this.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher());
       this.x = true;
       return;
    }
    public void setSource(ReadableArray p0){
       a obj;
       int b;
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageView.class, "9")) {
          return;
       }
       String str = "uri";
       int i = 0;
       if (this.P != null) {
          obj = PatchProxy.applyOneRefs(p0, this, ReactImageView.class, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p0 == null){
             b = 0;
             while (true) {
                if (b < p0.size()) {
                   String str1 = p0.getMap(b).getString(str);
                   int i1 = 0;
                   String str2 = null;
                   while (i1 < this.j.size()) {
                      String str3 = this.j.get(i1).c().toString();
                      if (str1 != null && str1.equals(str3)) {
                         str2 = 1;
                      }
                      i1 = i1 + 1;
                   }
                   if (str2) {
                      b = b + 1;
                   }
                }else {
                   b = true;
                }
             }
          }
          b = false;
          if (!b) {
             this.O = true;
          }
       }
       this.j.clear();
       if (p0 == null || !p0.size()) {
          this.j.add(new a(this.getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAAXNSR0IArs4c6QAAAFBlWElmTU0AKgAAAAgAAgESAAMAAAABAAEAAIdpAAQAAAABAAAAJgAAAAAAA6ABAAMAAAABAAEAAKACAAQAAAABAAAAAaADAAQAAAABAAAAAQAAAADr/7PgAAABWWlUWHRYTUw6Y29tLmFkb2JlLnhtcAAAAAAAPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0az0iWE1QIENvcmUgNi4wLjAiPgogICA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgogICAgICA8cmRmOkRlc2NyaXB0aW9uIHJkZjphYm91dD0iIgogICAgICAgICAgICB4bWxuczp0aWZmPSJodHRwOi8vbnMuYWRvYmUuY29tL3RpZmYvMS4wLyI+CiAgICAgICAgIDx0aWZmOk9yaWVudGF0aW9uPjE8L3RpZmY6T3JpZW50YXRpb24+CiAgICAgIDwvcmRmOkRlc2NyaXB0aW9uPgogICA8L3JkZjpSREY+CjwveDp4bXBtZXRhPgoZXuEHAAAAC0lEQVQIHWNgAAIAAAUAAY27m/MAAAAASUVORK5CYII="));
       }else if(p0.size() == 1){
          obj = new a(this.getContext(), p0.getMap(i).getString(str));
          this.j.add(obj);
          Uri.EMPTY.equals(obj.c());
       }else {
          for (; i < p0.size(); i = i + 1) {
             ReadableMap map = p0.getMap(i);
             a uoa = new a(this.getContext(), map.getString(str), map.getDouble("width"), map.getDouble("height"));
             this.j.add(v11);
             Uri.EMPTY.equals(v11.c());
          }
       }
       this.x = true;
       return;
    }
    public void setTileMode(Shader$TileMode p0){
       if (this.P != null && this.w != p0) {
          this.O = true;
       }
       this.w = p0;
       this.x = true;
       return;
    }
    public final boolean t(){
       boolean b = (this.w != Shader$TileMode.CLAMP)? true: false;
       return b;
    }
    public void u(){
       boolean b2;
       ReactImageView b3;
       ReactImageView e;
       c uoc1;
       boolean b = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, ReactImageView.class, "13")) {
          return;
       }
       if (b.P != null && b.O == null) {
          return;
       }
       float resizeBitmap = this.getResizeBitmapSize();
       float f = 0;
       boolean b1 = true;
       if (v6 = resizeBitmap - f) {
          StringBuilder str = "resizeBitmapSize lastBitmapSize:"+b.M.d+" currentSize:"+resizeBitmap+" vieww:"+this.getWidth()+" viewh:"+this.getHeight()+" imagesource:";
          ReactImageView k = b.k;
          String str1 = (k != null)? k.toString(): "null";
          a.k("ReactImageView", str+str1);
          b.x = b1;
       }
       if (b.x == null) {
          return;
       }else if(this.s() && (this.getWidth() <= 0 || this.getHeight() <= 0)){
          return;
       }else if(PatchProxy.applyVoid(objArray, b, ReactImageView.class, "17")){
          b.k = objArray;
          if (b.j.isEmpty()) {
             b.j.add(new a(this.getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAAXNSR0IArs4c6QAAAFBlWElmTU0AKgAAAAgAAgESAAMAAAABAAEAAIdpAAQAAAABAAAAJgAAAAAAA6ABAAMAAAABAAEAAKACAAQAAAABAAAAAaADAAQAAAABAAAAAQAAAADr/7PgAAABWWlUWHRYTUw6Y29tLmFkb2JlLnhtcAAAAAAAPHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyIgeDp4bXB0az0iWE1QIENvcmUgNi4wLjAiPgogICA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgogICAgICA8cmRmOkRlc2NyaXB0aW9uIHJkZjphYm91dD0iIgogICAgICAgICAgICB4bWxuczp0aWZmPSJodHRwOi8vbnMuYWRvYmUuY29tL3RpZmYvMS4wLyI+CiAgICAgICAgIDx0aWZmOk9yaWVudGF0aW9uPjE8L3RpZmY6T3JpZW50YXRpb24+CiAgICAgIDwvcmRmOkRlc2NyaXB0aW9uPgogICA8L3JkZjpSREY+CjwveDp4bXBtZXRhPgoZXuEHAAAAC0lEQVQIHWNgAAIAAAUAAY27m/MAAAAASUVORK5CYII="));
          }else if(this.s()){
             b$b uob2 = b.a(this.getWidth(), this.getHeight(), b.j);
             b.k = uob2.a();
             b.l = uob2.b();
          }
          b.k = b.j.get(0);
       }
       ReactImageView k1 = b.k;
       if (k1 == null) {
          return;
       }else {
          a obj = PatchProxy.applyOneRefs(k1, b, ReactImageView.class, "23");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else {
             b3 = b.h;
             if (b3 == ImageResizeMethod.AUTO) {
                if (c.h(k1.c()) || c.i(k1.c())) {
                label_010f :
                   b2 = true;
                }
             }else if(b3 == ImageResizeMethod.RESIZE){
                goto label_010f ;
             }
             b2 = false;
          }
          if (b2 && (this.getWidth() <= 0 || this.getHeight() <= 0)) {
             return;
          }else if(this.t() && (this.getWidth() <= 0 || this.getHeight() <= 0)){
             return;
          }else {
             obj = this.getHierarchy();
             obj.u(b.v);
             ReactImageView m = b.m;
             if (m != null) {
                obj.G(m, b.v);
             }
             m = b.n;
             if (m != null) {
                obj.G(m, t$b.g);
             }
             m = b.v;
             int i = (m != t$b.i && m != t$b.j)? 1: 0;
             RoundingParams roundingPara = obj.n();
             b.r(ReactImageView.U);
             float[] u = ReactImageView.U;
             roundingPara.m(u[0], u[b1], u[2], u[3]);
             ReactImageView o = b.o;
             if (o != null) {
                o.setBorder(b.q, b.s);
                b.o.l(roundingPara.e());
                obj.v(b.o);
             }
             if (i) {
                roundingPara.n(f);
             }
             roundingPara.j(b.q, b.s);
             ReactImageView r = b.r;
             if (r != null) {
                roundingPara.o(r);
             }else {
                roundingPara.r(RoundingParams$RoundingMethod.BITMAP_ONLY);
             }
             obj.L(roundingPara);
             r = b.G;
             if (r < null) {
                int i1 = (b.k.d())? 0: 300;
             }
          label_01c1 :
             obj.x(r);
             LinkedList linkedList = new LinkedList();
             if (i) {
                linkedList.add(b.z);
             }
             b3 = b.B;
             if (b3 != null) {
                linkedList.add(b3);
             }
             if (this.t()) {
                linkedList.add(b.A);
             }
             c uoc = e.d(linkedList);
             float f1 = 2048.00f;
             if (!b2 && v6) {
                f1 = resizeBitmap;
                b2 = true;
             }
             d uod = (b2)? new d(this.getWidth(), this.getHeight(), f1): objArray;
             ImageRequestBuilder imageRequest = ImageRequestBuilder.k(b.k.c());
             imageRequest.r(uoc);
             imageRequest.v(uod);
             imageRequest = imageRequest.l(b1);
             imageRequest.p = Boolean.FALSE;
             imageRequest.s(b.H);
             if (a.a) {
                imageRequest.t(new ReactImageView$b(b));
             }
             if (!PatchProxy.applyVoidOneRefs(imageRequest, b, ReactImageView.class, "18")) {
                b3 = b.J;
                if (b3 != null && b3.D()) {
                   uoc1 = b.b();
                   uoc1.b(Bitmap$Config.RGB_565);
                   imageRequest.o(uoc1.a());
                }else {
                   b3 = b.I;
                   if (b3 != null) {
                      String str2 = "bitmapConfig";
                      if (b3.hasKey(str2)) {
                         String str3 = b.I.getString(str2);
                         Object obj1 = PatchProxy.applyOneRefs(str3, b, ReactImageView.class, "19");
                         if (obj1 != patchProxyRe) {
                            objArray = obj1;
                         }else if(("RGB_565").equalsIgnoreCase(str3)){
                            objArray = Bitmap$Config.RGB_565;
                         }else if(("ARGB_8888").equalsIgnoreCase(str3)){
                            objArray = Bitmap$Config.ARGB_8888;
                         }
                         if (objArray != null) {
                            uoc1 = b.b();
                            uoc1.b(objArray);
                            imageRequest.o(uoc1.a());
                         }
                      }
                   }
                }
             }
             b uob = b.x(imageRequest, b.I);
             e = b.E;
             if (e != null) {
                e.a(b.k.c());
             }
             b.y.p();
             e = b.y;
             e.q(b1);
             e.y(this.getController());
             e.w(uob);
             e = b.l;
             if (e != null) {
                ImageRequestBuilder imageRequest1 = ImageRequestBuilder.k(e.c());
                imageRequest1.r(uoc);
                imageRequest1.v(uod);
                imageRequest1 = imageRequest1.l(b1);
                imageRequest1.s(b.H);
                b.y.x(imageRequest1.a());
             }
             ForwardingControllerListener uForwardingC = new ForwardingControllerListener();
             r = b.C;
             if (r != null) {
                uForwardingC.addListener(r);
             }
             r = b.D;
             if (r != null) {
                uForwardingC.addListener(r);
             }
             r = b.J;
             if (r != null) {
                b uob1 = r.a();
                if (uob1 != null) {
                   uForwardingC.addListener(uob1);
                }
             }
             if (a.a) {
                uForwardingC.addListener(new ReactImageView$c(b));
             }
             r = b.K;
             if (r != null) {
                uForwardingC.addListener(r.a(uob));
             }
             b.y.s(uForwardingC);
             ReactImageView j = b.J;
             if (j != null) {
                b.y.r(j.b(b, b.k));
             }else {
                j = b.F;
                if (j != null) {
                   b.y.r(j);
                }
             }
             b.setController(b.y.e());
             b.x = false;
             b.y.p();
             j = b.M;
             Objects.requireNonNull(j);
             ReactImageView$LastResizeViewState lastResizeVi = ReactImageView$LastResizeViewState.class;
             if (PatchProxy.isSupport(lastResizeVi) && (!PatchProxy.applyVoidTwoRefs(b, Float.valueOf(resizeBitmap), j, lastResizeVi, "1") && e.x)) {
                j.a = this.getWidth();
                j.b = this.getHeight();
                j.c = b.v;
                j.e = b.k;
                j.d = resizeBitmap;
             }
             return;
          }
       }
    }
    public void v(float p0,int p1){
       if (PatchProxy.isSupport(ReactImageView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, ReactImageView.class, "7")) {
          return;
       }
       if (this.u == null) {
          float[] uofloatArray = new float[4];
          this.u = uofloatArray;
          Arrays.fill(uofloatArray, Float.NaN);
       }
       if (!d.a(this.u[p1], p0)) {
          if (this.P != null) {
             this.O = true;
          }
          this.u[p1] = p0;
          this.x = true;
       }
       return;
    }
}
