package com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText;
import com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText;
import android.content.Context;
import juc.b;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$HintParams;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$TextParams;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$StyleableParams;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$StyleAttrParams;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.lang.CharSequence;
import android.graphics.Color;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$ShadowParams;
import lnc.a1;
import com.yxcorp.gifshow.v3.f;
import java.lang.Boolean;
import kotlin.Pair;
import android.text.Layout;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$PointParams;
import com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1;
import msd.r;
import com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2;
import com.yxcorp.gifshow.v3.editor.text.dynamic.TemplateEditText$drawDifferentLineStyle$1;
import android.text.TextPaint;
import android.widget.EditText;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import java.lang.Float;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Shader;
import java.lang.Character;
import java.lang.Number;
import usd.k;
import usd.q;
import usd.i;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import rnc.i;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;
import android.view.View;
import a2.i0;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.widget.TextView;
import java.lang.reflect.Method;
import android.graphics.Typeface;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$GradientParams;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$b;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$ColorParams;
import android.graphics.Shader$TileMode;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Paint$Style;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$StrokeParams;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams$FillParams;

public class TemplateEditText extends CommonDrawerEditText	// class@0013c2
{
    public int k;
    public boolean l;
    public TextStyleValue m;
    public DynamicTextParams n;
    public HashMap o;

    public void TemplateEditText(Context p0,b p1,DynamicTextParams p2){
       a.p(p0, "context");
       a.p(p1, "textDrawer");
       a.p(p2, "dynamicParams");
       super(p0, p1);
       this.n = p2;
       this.k = p2.hint.hintType;
       DynamicTextParams text = p2.text;
       boolean b = true;
       if (text.repeatCount != b || text.topCount != null) {
          b = false;
       }
       this.l = b;
       this.j(p2);
       return;
    }
    public static void e(TemplateEditText p0,Canvas p1,Paint p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       p0.d(p1, p2, p3);
       return;
    }
    public final void c(DynamicTextParams$c p0,int p1,Paint p2){
       String str1;
       Object[] objArray1;
       if (PatchProxy.isSupport(TemplateEditText.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, TemplateEditText.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TemplateEditText", "changeWithCustomStyleIfNeed: "+p1, objArray);
       TemplateEditText tm = this.m;
       if (tm != null) {
          DynamicTextParams styleablePar = this.n.styleableParams;
          if (styleablePar != null && styleablePar.enable != null) {
             DynamicTextParams$StyleableParams attrs = styleablePar.attrs;
             String str = 1;
             if (attrs.fillList.contains(Integer.valueOf(p1))) {
                str1 = (tm.e().length() > 0)? 1: null;
                if (str1) {
                   p2.setColor(Color.parseColor(tm.e()));
                   objArray1 = new Object[0];
                   a.D().w("TemplateEditText", "changeWithCustomStyleIfNeed fillColor: "+tm.e(), objArray1);
                }
             }
             if (attrs.strokeList.contains(Integer.valueOf(p1))) {
                str1 = (tm.g().length() > 0)? 1: null;
                if (str1) {
                   p2.setColor(Color.parseColor(tm.g()));
                   objArray1 = new Object[0];
                   a.D().w("TemplateEditText", "changeWithCustomStyleIfNeed strokeColor: "+tm.g(), objArray1);
                }
             }
             if (attrs.shadowList.contains(Integer.valueOf(p1))) {
                if (tm.f().length() <= 0) {
                   str = null;
                }
                if (str) {
                   DynamicTextParams$c shadow = p0.shadow;
                   if (shadow != null) {
                      p2.setShadowLayer(f.i((float)a1.e(shadow.blur)), (float)a1.e(p0.shadow.dx), (float)a1.e(p0.shadow.dy), Color.parseColor(tm.f()));
                      Object[] objArray2 = new Object[0];
                      a.D().w("TemplateEditText", "changeWithCustomStyleIfNeed shadow "+f.i((float)a1.e(p0.shadow.blur))+' '+(float)a1.e(p0.shadow.dx)+' '+(float)a1.e(p0.shadow.dy)+' '+tm.f(), objArray2);
                   }
                }
                p2.clearShadowLayer();
                Object[] objArray3 = new Object[0];
                a.D().w("TemplateEditText", "changeWithCustomStyleIfNeed clearShadowLayer", objArray3);
             }
          }
       }
       return;
    }
    public final void d(Canvas p0,Paint p1,boolean p2){
       Object[] objArray;
       float this;
       Iterator iterator1;
       TemplateEditText templateEdit = this;
       Object obj = p0;
       Object obj1 = p1;
       if (PatchProxy.isSupport(TemplateEditText.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, TemplateEditText.class, "8")) {
          return;
       }
       a.p(obj, "canvas");
       a.p(obj1, "paint");
       Pair pair = templateEdit.i(p2);
       Object obj2 = pair.getSecond();
       Object obj3 = pair.getFirst();
       String str = "TemplateEditText";
       int i = 0;
       if (templateEdit.l != null) {
          if (!PatchProxy.applyVoidFourRefs(p0, p1, obj3, obj2, this, TemplateEditText.class, "12")) {
             objArray = new Object[i];
             a.D().w(str, "drawUnifiedLineStyle", objArray);
             DynamicTextParams$a layers = templateEdit.n.text.repeatLayers.get(i).layers;
             a.o(layers, "layers");
             Iterator iterator = layers.iterator();
             int i1 = 0;
             while (iterator.hasNext()) {
                DynamicTextParams$c obj4 = iterator.next();
                int i2 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                Object obj5 = obj4;
                this = p1.ascent();
                float f = p1.descent() - this;
                obj4 = obj5.offset;
                int i3 = 0;
                if (!obj4.x - i3 && !obj4.y - i3) {
                   TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1 uodrawUnifie = v9;
                   iterator1 = iterator;
                   TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1 uodrawUnifie1 = v9;
                   uodrawUnifie = new TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$1(f, obj5, i1, this, this, p1, obj3, obj2, p0);
                   templateEdit.g(obj3, obj2, uodrawUnifie1);
                }else {
                   iterator1 = iterator;
                   p0.save();
                   obj.translate((float)a1.e(obj5.offset.x), (float)a1.e(obj5.offset.y));
                   TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2 uodrawUnifie2 = new TemplateEditText$drawUnifiedLineStyle$$inlined$forEachIndexed$lambda$2(f, obj5, i1, this, this, p1, obj3, obj2, p0);
                   templateEdit.g(obj3, obj2, iterator);
                   p0.restore();
                }
                iterator = iterator1;
                i1 = i2;
             }
          }
       }else if(PatchProxy.applyVoidFourRefs(p0, p1, obj3, obj2, this, TemplateEditText.class, "10")){
          objArray = new Object[i];
          a.D().w(str, "drawDifferentLineStyle", objArray);
          templateEdit.g(obj3, obj2, new TemplateEditText$drawDifferentLineStyle$1(templateEdit, obj1, obj));
       }
       return;
    }
    public final void f(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateEditText.class, "7")) {
          return;
       }
       a.p(p0, "canvas");
       TextPaint textPaint = new TextPaint(this.getPaint());
       textPaint.setAlpha(255);
       if (this.getLayoutParams() == null && Build$VERSION.SDK_INT < 23) {
          this.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       }
       this.d(p0, textPaint, true);
       return;
    }
    public final void g(String p0,Layout p1,r p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TemplateEditText.class, "16")) {
          return;
       }
       if (p1 != null && p0 != null) {
          try{
             int i = 0;
             int i1 = (p0.length() > 0)? 1: 0;
             if (i1) {
                i1 = p1.getLineCount();
                int totalPadding = this.getTotalPaddingTop();
                for (; i < i1; i = i + 1) {
                   String str = p0.substring(p1.getLineStart(i), p1.getLineEnd(i));
                   a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                   float f = p1.getLineLeft(i) + (float)this.getPaddingLeft();
                   int i2 = p1.getLineTop(i) + totalPadding;
                   p2.invoke(Integer.valueOf(i), str, Float.valueOf(f), Float.valueOf((float)i2));
                }
             }
          }catch(java.lang.Exception e8){
             PostUtils.D("TemplateEditText", "drawTextLayer", e8);
          }
       }
    }
    public final Layout getAvailableLayout(){
       Object obj = PatchProxy.apply(null, this, TemplateEditText.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getAvailableLayoutInfo().getSecond();
    }
    public final Pair getAvailableLayoutInfo(){
       Object obj = PatchProxy.apply(null, this, TemplateEditText.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i(false);
    }
    public final void h(float p0,String p1,Paint p2,Canvas p3,float p4,float p5,boolean p6){
       i obj1;
       int i1;
       int i2;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       if (PatchProxy.isSupport(TemplateEditText.class)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),oobject,oobject1,oobject2,Float.valueOf(p4),Float.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, TemplateEditText.class, "13")) {
             return;
          }
       }
       Shader shader = p2.getShader();
       float f = p0;
       int i = 0;
       while (i < p1.length()) {
          boolean b = Character.isSupplementaryCodePoint(oobject.codePointAt(i));
          if (b) {
             if (PatchProxy.isSupport(TemplateEditText.class)) {
                obj1 = PatchProxy.applyTwoRefs(oobject, Integer.valueOf(i), obj, TemplateEditText.class, "14");
                if (obj1 != PatchProxyResult.class) {
                   i1 = obj1.intValue();
                }
             }
             obj1 = q.S0(q.n1(i, p1.length()), 2);
             i2 = obj1.l();
             int i3 = obj1.m();
             i1 = obj1.n();
             if (i1 >= 0) {
                if (i2 <= i3) {
                label_0098 :
                   int i4 = 0;
                   while (Character.isSupplementaryCodePoint(oobject.codePointAt(i2))) {
                      i4 = i4 + 2;
                      if (i2 != i3) {
                         i2 = i2 + i1;
                      }else {
                         break ;
                      }
                   }
                   i1 = i4;
                }
             }else if(i2 >= i3){
                goto label_0098 ;
             }
             i1 = 0;
          }else {
             i1 = 1;
          }
          Shader shader1 = null;
          if (this.getSelfDrawBackground()) {
             oobject1.setColor(0);
             oobject1.setAlpha(255);
             Xfermode xfermode = (b)? shader1: new PorterDuffXfermode(PorterDuff$Mode.CLEAR);
             oobject1.setXfermode(xfermode);
          }
          if (!b) {
             shader1 = shader;
          }
          oobject1.setShader(shader1);
          i2 = i + i1;
          String str = oobject.substring(i, i2);
          a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          String str1 = (b)? i.j(str).toString(): str;
          if (!b || p6) {
             float f1 = p4 - p5;
             oobject2.drawText(str1, f, f1, oobject1);
          }
          f = f + (float)(int)oobject1.measureText(str);
          if (!b) {
             i1 = 1;
          }
          i = i + i1;
       }
       return;
    }
    public final Pair i(boolean p0){
       String obj;
       int i1;
       Layout$Alignment aLIGN_NORMAL;
       StaticLayout staticLayout1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(TemplateEditText.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, TemplateEditText.class, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = String.valueOf(this.getText());
       Rect rect = null;
       boolean b = true;
       b uob = (obj.length() > 0)? 1: null;
       if (!uob) {
          obj = (p0)? this.getTextDrawer().q().b(): "";
       }
    label_0042 :
       Layout layout = (obj.length() > 0)? 1: null;
       if (layout) {
          if (this.getLayout() == null || !i0.Y(this)) {
             TextDrawConfigParam textDrawConf = this.getTextDrawer().r();
             int i = (this.getTextDrawer().m() - textDrawConf.w().left) - textDrawConf.w().right;
             if (PatchProxy.isSupport(TemplateEditText.class)) {
                layout = PatchProxy.applyTwoRefs(Integer.valueOf(i), obj, this, TemplateEditText.class, "9");
                if (layout != patchProxyRe) {
                }
             }
             TemplateEditText tm = this.m;
             if (tm != null) {
                a.m(tm);
                i1 = tm.h();
             }else {
                i1 = this.getTextDrawer().r().q();
             }
             TextPaint paint = this.getPaint();
             if (i1 != b) {
                aLIGN_NORMAL = (i1 != 2)? Layout$Alignment.ALIGN_NORMAL: Layout$Alignment.ALIGN_OPPOSITE;
             }else {
                aLIGN_NORMAL = Layout$Alignment.ALIGN_CENTER;
             }
             StaticLayout staticLayout = new StaticLayout(obj, paint, i, aLIGN_NORMAL, this.getLineSpacingMultiplier(), this.getLineSpacingExtra(), false);
             staticLayout1 = patchProxyRe;
          }else {
             staticLayout1 = this.getLayout();
          }
          return new Pair(obj, layout);
       }else {
          Object[] objArray = null;
          if (this.getHint() != null) {
             Pair pair = (this.getHint().toString().length() > 0)? 1: null;
             if (pair) {
                String str = this.getHint().toString();
                Object obj1 = PatchProxy.apply(objArray, this, CommonDrawerEditText.class, "11");
                if (obj1 != patchProxyRe) {
                }else {
                   try{
                      Class[] uClassArray = new Class[rect];
                      Method declaredMeth = TextView.class.getDeclaredMethod("getHintLayout", uClassArray);
                      a.o(declaredMeth, "method");
                      declaredMeth.setAccessible(b);
                      Object[] objArray1 = new Object[rect];
                      Object[] objArray2 = declaredMeth.invoke(this, objArray1);
                      if (!objArray2 instanceof Layout) {
                         objArray2 = objArray;
                      }
                      Object obj2 = objArray2;
                   }catch(java.lang.Exception e0){
                      PostUtils.D("CommonDrawerEditText", "reflectGetHintLayout", e0);
                   }
                   obj1 = objArray;
                }
                return new Pair(str, obj1);
             }
          }
          return new Pair(objArray, objArray);
       }
    }
    public final void j(DynamicTextParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateEditText.class, "1")) {
          return;
       }
       a.p(p0, "newParams");
       this.n = p0;
       DynamicTextParams hint = p0.hint;
       this.k = hint.hintType;
       DynamicTextParams text = p0.text;
       boolean b = (text.repeatCount == 1 && text.topCount == null)? true: false;
       this.l = b;
       this.m = null;
       if (hint.enable == null) {
          this.setHint("");
       }
       TextPaint paint = this.getPaint();
       a.o(paint, "paint");
       paint.setFakeBoldText(p0.bold);
       paint = this.getPaint();
       a.o(paint, "paint");
       TextPaint paint1 = this.getPaint();
       a.o(paint1, "paint");
       paint.setTypeface(Typeface.create(paint1.getTypeface(), p0.text.fontType));
       this.setTextColor(0);
       if (this.k == 1) {
          this.setHintTextColor(0);
       }
       TextDrawConfigParam textDrawConf = this.getTextDrawer().r();
       a.o(textDrawConf, "textDrawer.textDrawConfigParam");
       this.b(textDrawConf);
       return;
    }
    public final void k(Paint p0,DynamicTextParams$GradientParams p1,Rect p2){
       Shader$TileMode rEPEAT;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TemplateEditText.class, "18")) {
          return;
       }
       int[] ointArray = new int[p1.stops.size()];
       float[] uofloatArray = new float[p1.stops.size()];
       DynamicTextParams$GradientParams stops = p1.stops;
       a.o(stops, "gradientParams.stops");
       int i = 0;
       Iterator iterator = stops.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          ointArray[i] = obj.color.b();
          uofloatArray[i] = obj.position;
          i = i1;
       }
       stops = p1.tileMode;
       if (stops != null) {
          rEPEAT = (stops != 2)? Shader$TileMode.REPEAT: Shader$TileMode.MIRROR;
       }else {
          rEPEAT = Shader$TileMode.CLAMP;
       }
       Shader$TileMode tileMode = rEPEAT;
       Rect left = p2.left;
       int i2 = p2.right - left;
       p2 = p2.top;
       int float i3 = p2.bottom - p2;
       float f = (float)left;
       DynamicTextParams$GradientParams startPoint = p1.startPoint;
       float f1 = (float)i2;
       float f2 = (startPoint.x * f1) + f;
       float f3 = (float)p2;
       i3 = (float)i3;
       float f4 = (startPoint.y * i3) + f3;
       DynamicTextParams$GradientParams gradientType = p1.gradientType;
       if (gradientType == null) {
          p1 = p1.endPoint;
          LinearGradient linearGradie = new LinearGradient(f2, f4, ((p1.x * f1) + f), ((p1.y * i3) + f3), ointArray, uofloatArray, tileMode);
          p0.setShader(f3);
       }else if(gradientType == 1){
          RadialGradient radialGradie = new RadialGradient(f2, f4, (float)a1.e(p1.radius), ointArray, uofloatArray, tileMode);
          p0.setShader(1);
       }
       return;
    }
    public final void l(DynamicTextParams$c p0,Paint p1,Rect p2,int p3){
       DynamicTextParams$c stroke;
       float f;
       Paint$Cap bUTT;
       Paint$Join mITER;
       Object[] objArray1;
       DynamicTextParams$StrokeParams gradient;
       if (PatchProxy.isSupport(TemplateEditText.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, TemplateEditText.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TemplateEditText", "setPaintParams: "+p3, objArray);
       Shader shader = null;
       String str = 1;
       if (p0.layerType == str) {
          p1.setStyle(Paint$Style.STROKE);
          stroke = p0.stroke;
          f = (float)a1.e(stroke.width);
          DynamicTextParams$StrokeParams cap = stroke.cap;
          Rect rect = 2;
          if (cap != str) {
             bUTT = (cap != rect)? Paint$Cap.BUTT: Paint$Cap.SQUARE;
          }else {
             bUTT = Paint$Cap.ROUND;
          }
          p1.setStrokeCap(bUTT);
          cap = stroke.join;
          if (cap != str) {
             mITER = (cap != rect)? Paint$Join.MITER: Paint$Join.BEVEL;
          }else {
             mITER = Paint$Join.ROUND;
          }
          p1.setStrokeJoin(mITER);
          p1.setStrokeWidth(f);
          cap = stroke.strokeType;
          if (cap == null) {
             p1.setShader(shader);
             p1.setColor(stroke.color.b());
             objArray1 = new Object[0];
             a.D().w("TemplateEditText", "setNormalStroke: "+f+' '+stroke.color, objArray1);
          }else if(cap == str){
             gradient = stroke.gradient;
             a.o(gradient, "stroke.gradient");
             this.k(p1, gradient, new Rect((int)((float)p2.left - f), (int)((float)p2.top - f), (int)((float)p2.right + f), (int)((float)p2.bottom + f)));
             objArray1 = new Object[0];
             a.D().w("TemplateEditText", "setGradientStroke: "+f+' '+stroke.gradient, objArray1);
          }
       }else {
          stroke = p0.fill;
          p1.setStyle(Paint$Style.FILL);
          DynamicTextParams$FillParams fillType = stroke.fillType;
          if (fillType == null) {
             p1.setShader(shader);
             p1.setColor(stroke.color.b());
             objArray1 = new Object[0];
             a.D().w("TemplateEditText", "setNormalFill: "+stroke.color, objArray1);
          }else if(fillType == str){
             DynamicTextParams$FillParams gradient1 = stroke.gradient;
             a.o(gradient1, "fill.gradient");
             this.k(p1, gradient1, p2);
             objArray1 = new Object[0];
             a.D().w("TemplateEditText", "setGradientFill: "+stroke.gradient, objArray1);
          }
       }
       p0 = p0.shadow;
       if (p0 != null) {
          a.o(p0, "oneLayerParams.shadow");
          if (!PatchProxy.applyVoidTwoRefs(p1, p0, this, TemplateEditText.class, "19")) {
             p1.setShadowLayer(f.i((float)a1.e(p0.blur)), (float)a1.e(p0.dx), (float)a1.e(p0.dy), p0.color.b());
             Object[] objArray2 = new Object[0];
             a.D().w("TemplateEditText", "setPaintShadow shadow "+f.i((float)a1.e(p0.blur))+' '+(float)a1.e(p0.dx)+' '+(float)a1.e(p0.dy)+' '+p0.color, objArray2);
          }
       }else {
          p1.clearShadowLayer();
          Object[] objArray3 = new Object[0];
          a.D().w("TemplateEditText", "clearShadowLayer", objArray3);
       }
       return;
    }
    public void onDraw(Canvas p0){
       TextPaint paint;
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplateEditText.class, "2")) {
          return;
       }
       a.p(p0, "canvas");
       if (!this.getSelfDrawBackground()) {
          if (this.k == null) {
             TextPaint textPaint = (!String.valueOf(this.getText()).length())? 1: null;
             if (!textPaint) {
             label_002f :
                textPaint = this.getPaint();
                a.o(textPaint, "paint");
                textPaint.setAlpha(255);
                paint = this.getPaint();
                a.o(paint, "paint");
                TemplateEditText.e(this, p0, paint, false, 4, null);
                textPaint = this.getPaint();
                a.o(textPaint, "paint");
                textPaint.setAlpha(0);
                this.getPaint().clearShadowLayer();
                super.onDraw(p0);
                return;
             }
          }else {
             goto label_002f ;
          }
       }
       super.onDraw(p0);
       return;
    }
}
