package yf.i;
import com.facebook.react.uimanager.LayoutShadowNode;
import android.os.Build$VERSION;
import yf.s;
import android.text.SpannableStringBuilder;
import java.util.List;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.views.text.ReactRawTextShadowNode;
import com.facebook.react.views.text.TextTransform;
import java.lang.CharSequence;
import yf.m;
import yf.i$a;
import yf.t;
import yf.k;
import ze.x;
import lg.i;
import com.facebook.yoga.YogaUnit;
import yf.u;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.lang.StringBuilder;
import com.facebook.react.views.text.ReactForegroundColorSpan;
import com.facebook.react.views.text.ReactBackgroundColorSpan;
import java.lang.Float;
import yf.a;
import com.facebook.react.views.text.ReactAbsoluteSizeSpan;
import yd.e;
import yf.h;
import ze.n0;
import android.content.res.AssetManager;
import android.content.ContextWrapper;
import yf.c;
import com.facebook.react.views.text.ReactUnderlineSpan;
import com.facebook.react.views.text.ReactStrikethroughSpan;
import android.graphics.Color;
import yf.q;
import yf.b;
import yf.l;
import ze.n;
import android.text.Spannable;
import com.kwai.robust.PatchProxyResult;
import od.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import ze.z;
import yf.p;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import ze.p;

public abstract class i extends LayoutShadowNode	// class@003126
{
    public s b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public float t;
    public int u;
    public int v;
    public String w;
    public String x;
    public boolean y;
    public Map z;

    public void i(){
       super();
       boolean b = false;
       this.c = b;
       this.e = b;
       int i = -1;
       this.g = i;
       this.h = b;
       int i1 = (Build$VERSION.SDK_INT < 23)? 0: 1;
       this.i = i1;
       this.j = b;
       this.k = b;
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 0x55000000;
       this.p = b;
       this.q = b;
       this.r = true;
       this.s = b;
       this.t = 0;
       this.u = i;
       this.v = i;
       this.w = null;
       this.x = null;
       this.y = b;
       this.b = new s();
       return;
    }
    public static void b(i p0,SpannableStringBuilder p1,List p2,s p3,boolean p4,Map p5,int p6){
       ReactShadowNodeImpl reactShadowN;
       int i4;
       int i5;
       int reactTag;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p5;
       int i = p6;
       i oi = i.class;
       int i1 = 0;
       int i2 = 1;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,Boolean.valueOf(p4),oobject4,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, oi, "1")) {
             return;
          }
       }
       s os = (oobject3 != null)? oobject3.a(oobject.b): oobject.b;
       s os1 = os;
       int childCount = p0.getChildCount();
       int i3 = 0;
       while (true) {
          if (i3 < childCount) {
             ReactShadowNodeImpl childAt = oobject.getChildAt(i3);
             if (childAt instanceof ReactRawTextShadowNode) {
                oobject1.append(TextTransform.apply(childAt.b(), os1.i()));
                reactShadowN = childAt;
                i4 = i3;
             }else if(childAt instanceof i){
                reactShadowN = childAt;
                i4 = i3;
                i.b(childAt, p1, p2, os1, p4, p5, p1.length());
             }else {
                reactShadowN = childAt;
                i4 = i3;
                String str = "0";
                if (reactShadowN instanceof m) {
                   oobject1.append(str);
                   i5 = p1.length() - 1;
                   oobject2.add(new i$a(i5, p1.length(), reactShadowN.b()));
                }else if(p4){
                   reactTag = reactShadowN.getReactTag();
                   i styleWidth = reactShadowN.getStyleWidth();
                   i styleHeight = reactShadowN.getStyleHeight();
                   YogaUnit pOINT = YogaUnit.POINT;
                   if (styleWidth.b == pOINT && styleHeight.b == pOINT) {
                      oobject1.append(str);
                      int i6 = p1.length() - 1;
                      oobject2.add(new i$a(i6, p1.length(), new u(reactTag, (int)styleWidth.a, (int)styleHeight.a)));
                      oobject4.put(Integer.valueOf(reactTag), reactShadowN);
                   }else {
                      throw new IllegalViewOperationException("Views nested within a <Text> must have a width and height");
                   }
                }else {
                   throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: "+reactShadowN.getClass());
                }
             }
             reactShadowN.markUpdateSeen();
             i3 = i4 + 1;
             reactShadowN = 1;
          }else {
             reactTag = p1.length();
             if (reactTag >= i) {
                if (oobject.c != null) {
                   oobject2.add(new i$a(i, reactTag, new ReactForegroundColorSpan(oobject.d)));
                }
                if (oobject.e != null) {
                   oobject2.add(new i$a(i, reactTag, new ReactBackgroundColorSpan(oobject.f)));
                }
                float f = os1.d();
                if (!Float.isNaN(f) && (oobject3 == null || p3.d() - f)) {
                   oobject2.add(new i$a(i, reactTag, new a(f)));
                }
                i5 = os1.c();
                if (oobject3 == null || p3.c() != i5) {
                   oobject2.add(new i$a(i, reactTag, new ReactAbsoluteSizeSpan(i5)));
                }
                if (e.Z) {
                   h oh = new h(oobject.u, oobject.v, oobject.x, oobject.w, p0.getThemedContext().getAssets());
                   oobject2.add(new i$a(i, reactTag, oobject4));
                }else {
                   n0 on0 = -1;
                   if (oobject.u == on0 && (oobject.v != on0 || oobject.w != null)) {
                      c uoc = new c(oobject.u, oobject.v, oobject.x, oobject.w, p0.getThemedContext().getAssets());
                      oobject2.add(new i$a(i, reactTag, oobject4));
                   }
                }
                if (oobject.p != null) {
                   oobject2.add(new i$a(i, reactTag, new ReactUnderlineSpan()));
                }
                if (oobject.q != null) {
                   oobject2.add(new i$a(i, reactTag, new ReactStrikethroughSpan()));
                }
                q oq = null;
                if (!oobject.l - oq && (oobject.m - oq || (oobject.n - oq && Color.alpha(oobject.o)))) {
                   oobject2.add(new i$a(i, reactTag, new q(oobject.l, oobject.m, oobject.n, oobject.o)));
                }
                f = os1.e();
                if (!Float.isNaN(f) && (oobject3 == null || p3.e() - f)) {
                   oobject2.add(new i$a(i, reactTag, new b(f)));
                }
                oobject2.add(new i$a(i, reactTag, new l(p0.getReactTag())));
                break ;
             }
             break ;
          }
       }
       return;
    }
    public Spannable c(i p0,String p1,boolean p2,n p3){
       int i;
       i$a a;
       i oi = p0;
       String str = p1;
       Object obj = p3;
       if (PatchProxy.isSupport(i.class)) {
          Object obj1 = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, i.class, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       boolean b = false;
       boolean b1 = (!p2 || obj)? true: false;
       a.b(b1, "nativeViewHierarchyOptimizer is required when inline views are supported");
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       ArrayList uArrayList = new ArrayList();
       HashMap hashMap = (p2)? new HashMap(): null;
       if (str) {
          spannableStr.append(TextTransform.apply(str, oi.b.i()));
       }
       i.b(p0, spannableStr, uArrayList, null, p2, hashMap, 0);
       oi.y = b;
       oi.z = hashMap;
       float f = Float.NaN;
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          i$a uoa = iterator.next();
          i$a c = uoa.c;
          if ((v4 = c instanceof t) || c instanceof u) {
             if (v4) {
                i = c.b();
                oi.y = true;
             }else {
                int i2 = c.a();
                x ox = hashMap.get(Integer.valueOf(c.b()));
                Objects.requireNonNull(p3);
                if (!PatchProxy.applyVoidOneRefs(ox, obj, n.class, "9") && ox.isLayoutOnly()) {
                   obj.l(ox, null);
                }
                ox.setLayoutParent(oi);
                i = i2;
             }
             if (Float.isNaN(f) || (float)i - f > 0) {
                f = (float)i;
             }
          }
          c = i$a.class;
          if (!PatchProxy.isSupport(c) || !PatchProxy.applyVoidTwoRefs(spannableStr, Integer.valueOf(b), uoa, c, "1")) {
             i = 34;
             a = uoa.a;
             if (a == null) {
                i = 18;
             }
             i = i & -16711681;
             int i1 = b << 16;
             i1 = i1 & 0xff0000;
             i = i | i1;
             spannableStr.setSpan(uoa.c, a, uoa.b, i);
          }
          b = b + 1;
       }
       oi.b.f = f;
       return spannableStr;
    }
    public void setAdjustFontSizeToFit(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "23")) {
          return;
       }
       if (p0 != this.s) {
          this.s = p0;
          this.markUpdated();
       }
       return;
    }
    public void setAllowFontScaling(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "7")) {
          return;
       }
       if (p0 != this.b.b()) {
          this.b.j(p0);
          this.markUpdated();
       }
       return;
    }
    public void setBackgroundColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "12")) {
          return;
       }
       if (this.isVirtual()) {
          boolean b = (p0 != null)? true: false;
          this.e = b;
          if (b) {
             this.f = p0.intValue();
          }
          this.markUpdated();
       }
       return;
    }
    public void setColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "11")) {
          return;
       }
       boolean b = (p0 != null)? true: false;
       this.c = b;
       if (b) {
          this.d = p0.intValue();
       }
       this.markUpdated();
       return;
    }
    public void setFontFamily(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "13")) {
          return;
       }
       this.w = p0;
       this.markUpdated();
       return;
    }
    public void setFontSize(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "10")) {
          return;
       }
       this.b.k(p0);
       this.markUpdated();
       return;
    }
    public void setFontStyle(String p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "16")) {
          return;
       }
       i = p.c(p0);
       if (i != this.u) {
          this.u = i;
          this.markUpdated();
       }
       return;
    }
    public void setFontVariant(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "15")) {
          return;
       }
       String str = p.d(p0);
       if (!Objects.equals(str, this.x)) {
          this.x = str;
          this.markUpdated();
       }
       return;
    }
    public void setFontWeight(String p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "14")) {
          return;
       }
       i = p.e(p0);
       if (i != this.v) {
          this.v = i;
          this.markUpdated();
       }
       return;
    }
    public void setIncludeFontPadding(boolean p0){
       this.r = p0;
    }
    public void setLetterSpacing(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "6")) {
          return;
       }
       this.b.l(p0);
       this.markUpdated();
       return;
    }
    public void setLineHeight(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "5")) {
          return;
       }
       this.b.c = p0;
       this.markUpdated();
       return;
    }
    public void setMaxFontSizeMultiplier(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "8")) {
          return;
       }
       if (p0 - this.b.h()) {
          this.b.m(p0);
          this.markUpdated();
       }
       return;
    }
    public void setMinimumFontScale(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "24")) {
          return;
       }
       if (p0 - this.t) {
          this.t = p0;
          this.markUpdated();
       }
       return;
    }
    public void setNumberOfLines(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "4")) {
          return;
       }
       if (!p0) {
          p0 = -1;
       }
       this.g = p0;
       this.markUpdated();
       return;
    }
    public void setTextAlign(String p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "9")) {
          return;
       }
       i = 1;
       int i1 = 3;
       if (("justify").equals(p0)) {
          if (Build$VERSION.SDK_INT >= 26) {
             this.k = i;
          }
          this.h = i1;
       }else if(Build$VERSION.SDK_INT >= 26){
          this.k = 0;
       }
       if (p0 == null || ("auto").equals(p0)) {
          this.h = 0;
       }else if(("left").equals(p0)){
          this.h = i1;
       }else if(("right").equals(p0)){
          this.h = 5;
       }else if(("center").equals(p0)){
          this.h = i;
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid textAlign: "+p0);
       }
       this.markUpdated();
       return;
    }
    public void setTextBreakStrategy(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "18")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       if (p0 == null || ("highQuality").equals(p0)) {
          this.i = 1;
       }else if(("simple").equals(p0)){
          this.i = 0;
       }else if(("balanced").equals(p0)){
          this.i = 2;
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: "+p0);
       }
       this.markUpdated();
       return;
    }
    public void setTextDecorationLine(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "17")) {
          return;
       }
       boolean b = false;
       this.p = b;
       this.q = b;
       if (p0 != null) {
          String[] stringArray = p0.split(" ");
          int len = stringArray.length;
          while (b < len) {
             object oobject = stringArray[b];
             if (("underline").equals(oobject)) {
                this.p = true;
             }else if(("line-through").equals(oobject)){
                this.q = true;
             }
             b = b + 1;
          }
       }
       this.markUpdated();
       return;
    }
    public void setTextShadowColor(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "21")) {
          return;
       }
       if (p0 != this.o) {
          this.o = p0;
          this.markUpdated();
       }
       return;
    }
    public void setTextShadowOffset(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "19")) {
          return;
       }
       float f = 0;
       this.l = f;
       this.m = f;
       if (p0 != null) {
          String str = "width";
          if (p0.hasKey(str) && !p0.isNull(str)) {
             this.l = p.b(p0.getDouble(str));
          }
          str = "height";
          if (p0.hasKey(str) && !p0.isNull(str)) {
             this.m = p.b(p0.getDouble(str));
          }
       }
    label_0042 :
       this.markUpdated();
       return;
    }
    public void setTextShadowRadius(float p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oi, "20")) {
          return;
       }
       if (p0 - this.n) {
          this.n = p0;
          this.markUpdated();
       }
       return;
    }
    public void setTextTransform(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "22")) {
          return;
       }
       if (p0 == null) {
          this.b.n(TextTransform.UNSET);
       }else if(("none").equals(p0)){
          this.b.n(TextTransform.NONE);
       }else if(("uppercase").equals(p0)){
          this.b.n(TextTransform.UPPERCASE);
       }else if(("lowercase").equals(p0)){
          this.b.n(TextTransform.LOWERCASE);
       }else if(("capitalize").equals(p0)){
          this.b.n(TextTransform.CAPITALIZE);
       }else {
          throw new JSApplicationIllegalArgumentException("Invalid textTransform: "+p0);
       }
       this.markUpdated();
       return;
    }
}
