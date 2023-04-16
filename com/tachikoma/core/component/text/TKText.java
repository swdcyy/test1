package com.tachikoma.core.component.text.TKText;
import com.tachikoma.core.component.e;
import gx4.f;
import java.lang.String;
import android.text.Spanned;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import android.text.Html;
import com.tkruntime.v8.JsValueRef;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import java.lang.Exception;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.text.SpannableString;
import java.lang.CharSequence;
import android.text.TextUtils;
import hp8.b;
import java.util.Map;
import java.lang.Float;
import java.lang.Integer;
import java.util.HashMap;
import iq8.n;
import android.text.TextPaint;
import android.text.StaticLayout$Builder;
import android.text.Layout$Alignment;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.text.StaticLayout;
import android.text.Layout;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.tachikoma.core.bridge.c;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;
import iq8.p;
import com.tkruntime.v8.V8Object;
import android.graphics.Shader;
import hp8.e;
import android.graphics.Typeface;
import wo8.b;
import com.tachikoma.core.component.text.TKText$c;
import com.tachikoma.core.component.text.a$d;
import com.tachikoma.core.component.text.a;
import yp8.a;
import jq8.a;
import java.lang.Number;
import android.graphics.Rect;
import kp8.b;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import com.tachikoma.core.component.text.TKText$b;
import android.view.View$OnLayoutChangeListener;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.feature.KDSFeature;
import android.graphics.Paint$FontMetricsInt;
import com.tachikoma.core.component.text.TKText$a;
import com.tachikoma.core.component.text.richtext.RichTextHelper;
import com.tachikoma.core.component.text.richtext.RichTextHelper$a;
import ip8.d;
import java.util.Iterator;
import gx4.c;
import com.tachikoma.core.component.text.TKSpan;
import com.tkruntime.v8.V8Array;
import hp8.g;
import tx4.y;
import zp8.a;
import java.util.Collection;
import com.tachikoma.core.component.text.c;
import java.util.Objects;
import hp8.m;
import android.view.View$OnLongClickListener;
import android.text.TextUtils$TruncateAt;

public class TKText extends e	// class@000d93
{
    public float A;
    public float B;
    public float C;
    public float D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public V8Object I;
    public int J;
    public int K;
    public List L;
    public String M;
    public String N;
    public boolean O;
    public boolean P;
    public boolean adjustFontSizeWithSystemChange;
    public Map fontFace;
    public String formattedText;
    public String mFontFamily;
    public String mFontStyle;
    public String mFontWeight;
    public SpannableString mRichTextSpannableString;
    public Object richText;
    public String text;
    public final int v;
    public final int w;
    public final int x;
    public int y;
    public int z;

    public void TKText(f p0){
       super(p0);
       this.v = 0;
       this.w = 1;
       this.x = 2;
       this.y = 0;
       this.A = 0xbf800000;
       this.G = false;
       this.H = false;
       this.J = 0;
       this.K = 0;
       this.O = false;
    }
    public static Spanned fromHtml(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKText.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Build$VERSION.SDK_INT >= 24) {
          return Html.fromHtml(p0, 0);
       }
       return Html.fromHtml(p0);
    }
    public void addJSValueRef(JsValueRef p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "43")) {
          return;
       }
       if (p0 != null) {
          if (this.L == null) {
             this.L = new ArrayList();
          }
          this.L.add(p0);
       }
       return;
    }
    public JSONObject collectViewAttrs(){
       JSONObject obj = PatchProxy.apply(null, this, TKText.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.collectViewAttrs();
       try{
          obj.put("text", this.text);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return obj;
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public AppCompatTextView createViewInstance(Context p0){
       AppCompatTextView obj = PatchProxy.applyOneRefs(p0, this, TKText.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AppCompatTextView(p0);
       if (Build$VERSION.SDK_INT >= 28) {
          obj.setFallbackLineSpacing(false);
       }
       return obj;
    }
    public int getFontSize(){
       return this.z;
    }
    public String getTextDecoration(){
       return this.N;
    }
    public final SpannableString m(String p0,SpannableString p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TKText.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B - null && !TextUtils.isEmpty(p0)) {
          if (p1 == null) {
             p1 = new SpannableString(p0);
          }
          p1.setSpan(new b(this.B), 0, p0.length(), 34);
       }
       return p1;
    }
    public Map measureForText(CharSequence p0,float p1,int p2){
       HashMap obj;
       StaticLayout staticLayout;
       float f1;
       int i = p2;
       if (PatchProxy.isSupport(TKText.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, TKText.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i1 = 0;
       int i2 = 0;
       if (TextUtils.isEmpty(p0) || p1 - i1 <= 0) {
          obj = new HashMap();
          obj.put("height", Integer.valueOf(i2));
          obj.put("width", Integer.valueOf(i2));
          obj.put("startIndex", Integer.valueOf(i2));
          obj.put("endIndex", Integer.valueOf(i2));
       }
       TextView view = this.getView();
       int i3 = n.a(p1);
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 23) {
          StaticLayout$Builder uBuilder = StaticLayout$Builder.obtain(p0, i2, p0.length(), view.getPaint(), i3).setAlignment(this.p()).setTextDirection(TextDirectionHeuristics.LTR).setLineSpacing(view.getLineSpacingExtra(), view.getLineSpacingMultiplier()).setIncludePad(view.getIncludeFontPadding()).setBreakStrategy(view.getBreakStrategy()).setHyphenationFrequency(view.getHyphenationFrequency());
          int i4 = (i > 0)? i: Integer.MAX_VALUE;
          uBuilder = uBuilder.setMaxLines(i4);
          if (sDK_INT >= 0.00f) {
             uBuilder = uBuilder.setJustificationMode(view.getJustificationMode());
          }
          staticLayout = uBuilder.build();
          i1 = i3;
       }else {
          i1 = i3;
          StaticLayout staticLayout1 = new StaticLayout(p0, view.getPaint(), i3, this.p(), view.getLineSpacingMultiplier(), view.getLineSpacingExtra(), view.getIncludeFontPadding());
          staticLayout = v16;
       }
       sDK_INT = staticLayout.getLineCount();
       if (i <= 0 || i > sDK_INT) {
          i = sDK_INT;
       }
       float f = 0;
       for (sDK_INT = 0; sDK_INT < i; sDK_INT = sDK_INT + 1) {
          f = Math.max(f, staticLayout.getLineWidth(sDK_INT));
       }
       if (i > 0) {
          i = i - 1;
          sDK_INT = staticLayout.getLineStart(i);
          i = staticLayout.getLineEnd(i);
          f1 = (float)staticLayout.getLineBottom(i);
          i2 = sDK_INT;
       }else {
          i = 0;
          f1 = 0;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("height", Float.valueOf(n.g(f1)));
       hashMap.put("width", Float.valueOf(n.g(Math.min((float)i1, f))));
       hashMap.put("startIndex", Integer.valueOf(i2));
       hashMap.put("endIndex", Integer.valueOf(i));
       return hashMap;
    }
    public Map measureText(float p0,int p1){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, tKText, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.measureForText(this.getView().getText(), p0, p1);
    }
    public final void n(String p0,boolean p1){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKText, "37")) {
          return;
       }
       String[] stringArray = p0.split(" ");
       if (stringArray.length != 4) {
          a.b(new Exception("text shadow is error "+p0), this.getJSContext().i());
          return;
       }else {
          int i = 3;
          float[] uofloatArray = new float[i];
          int i1 = 0;
          int i2 = 0;
          while (i2 < i) {
             uofloatArray[i2] = (((stringArray[i2]).toLowerCase()).contains("px"))? Float.parseFloat((stringArray[i2]).replace("px", "")): (float)n.a(Float.parseFloat(stringArray[i2]));
             i2 = i2 + 1;
          }
          Integer integer = Integer.valueOf(p.c(stringArray[i], this.getJSContext()));
          if (integer == null) {
             return;
          }
          int i3 = 2;
          if (p1) {
             uofloatArray[i3] = 0;
          }
          this.getView().setShadowLayer(uofloatArray[i3], uofloatArray[i1], uofloatArray[1], integer.intValue());
          return;
       }
    }
    public final void o(float p0){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKText, "31")) {
          return;
       }
       if (!this.B - p0) {
          return;
       }
       this.B = p0;
       if (TextUtils.isEmpty(this.text) && this.richText == null) {
          return;
       }
       boolean b = true;
       this.G = b;
       tKText = this.y;
       if (b == tKText) {
          this.setSpan(this.text, this.I);
       }else if(2 == tKText){
          this.setRichTextSpannableString(this.mRichTextSpannableString);
       }else {
          this.setText(this.text);
       }
       this.G = false;
       return;
    }
    public final Layout$Alignment p(){
       Layout$Alignment obj = PatchProxy.apply(null, this, TKText.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.getView().getGravity() & 0x800007;
       if (i != 1) {
          if (i != 3) {
             if (i != 5) {
                if (i != 0x800003) {
                   obj = (i != 0x800005)? Layout$Alignment.ALIGN_NORMAL: Layout$Alignment.ALIGN_OPPOSITE;
                }else {
                   obj = Layout$Alignment.ALIGN_NORMAL;
                }
             }else if(Build$VERSION.SDK_INT >= 28){
                obj = Layout$Alignment.ALIGN_RIGHT;
             }else {
                obj = Layout$Alignment.ALIGN_OPPOSITE;
             }
          }else if(Build$VERSION.SDK_INT >= 28){
             obj = Layout$Alignment.ALIGN_LEFT;
          }else {
             obj = Layout$Alignment.ALIGN_NORMAL;
          }
       }else {
          obj = Layout$Alignment.ALIGN_CENTER;
       }
       return obj;
    }
    public void setColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "14")) {
          return;
       }
       this.H = false;
       this.F = p0;
       int i = p.c(p0, this.getJSContext());
       if (!TextUtils.isEmpty(this.E)) {
          String str = null;
          this.E = str;
          this.getView().getPaint().setShader(str);
       }
       this.getView().setTextColor(i);
       return;
    }
    public void setFontFace(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "45")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          this.fontFace = p0;
          String str = p0.get("src");
          String str1 = p0.get("fileName");
          if (!TextUtils.isEmpty(str1)) {
             TKText tmFontFamily = this.mFontFamily;
             if (tmFontFamily == null || !tmFontFamily.equals(str1)) {
                this.mFontFamily = str1;
                if (e.c().b(str1, 0) != null) {
                   b.a(this.getView(), str1, this.mFontWeight, this.mFontStyle, this.getRootDir());
                   return;
                }else {
                   a.b(this.getContext(), str, str1, new TKText$c(this, str1));
                }
             }
          }
       }
       return;
    }
    public void setFontFamily(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "20")) {
          return;
       }
       TKText tmFontFamily = this.mFontFamily;
       if (tmFontFamily != null && tmFontFamily.equals(p0)) {
          return;
       }
       this.mFontFamily = p0;
       b.a(this.getView(), p0, this.mFontWeight, this.mFontStyle, this.getRootDir());
       return;
    }
    public void setFontSize(int p0){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKText, "21")) {
          return;
       }
       if (this.z == p0) {
          return;
       }
       this.z = p0;
       this.getDomNode().c().b();
       if (this.adjustFontSizeWithSystemChange != null) {
          this.getView().setTextSize(2, (float)p0);
       }else {
          this.getView().setTextSize(1, (float)p0);
       }
       this.setMinimumScaleFactor(this.A);
       TKText tC = this.C;
       if (tC) {
          this.setLineHeight(Float.valueOf(tC));
       }
       tC = this.richText;
       if (tC != null) {
          this.setRichText(tC);
       }
       return;
    }
    public void setFontStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "23")) {
          return;
       }
       TKText tmFontStyle = this.mFontStyle;
       if (tmFontStyle != null && tmFontStyle.equals(p0)) {
          return;
       }
       this.mFontStyle = p0;
       b.a(this.getView(), this.mFontFamily, this.mFontWeight, p0, this.getRootDir());
       return;
    }
    public void setFontWeight(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "22")) {
          return;
       }
       TKText tmFontWeight = this.mFontWeight;
       if (tmFontWeight != null && tmFontWeight.equals(p0)) {
          return;
       }
       this.mFontWeight = p0;
       b.a(this.getView(), this.mFontFamily, p0, this.mFontStyle, this.getRootDir());
       return;
    }
    public void setFormattedText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "12")) {
          return;
       }
       this.formattedText = p0;
       this.getView().setText(TKText.fromHtml(this.formattedText));
       return;
    }
    public void setGradient(String p0,Rect p1){
       int i3;
       int i4;
       Object obj = this;
       String[] obj1 = p0;
       Object obj2 = p1;
       String str = " ";
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, TKText.class, "39")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       obj1 = obj1.split(",");
       if (obj1.length >= 3) {
          int i = 0;
          try{
             int i1 = Integer.parseInt((obj1[i]).trim());
             int[] ointArray = new int[(obj1.length - 1)];
             float[] uofloatArray = new float[(obj1.length - 1)];
             int i2 = 1;
             String[] stringArray = null;
             while (i2 < obj1.length) {
                String str1 = (obj1[i2]).trim();
                if (str1.contains(str)) {
                   stringArray = str1.split(str);
                   i3 = i2 - 1;
                   ointArray[i3] = p.c((stringArray[i]).trim(), this.getJSContext());
                   uofloatArray[i3] = Float.parseFloat(stringArray[1]);
                   stringArray = 1;
                }else {
                   i4 = i2 - 1;
                   ointArray[i4] = p.c(str1, this.getJSContext());
                }
                i2 = i2 + 1;
             }
             float[] uofloatArray1 = b.a(i1, obj2);
             int i5 = uofloatArray1[i];
             i3 = uofloatArray1[1];
             i4 = uofloatArray1[2];
             int i6 = uofloatArray1[3];
             float[] uofloatArray2 = (stringArray != null)? uofloatArray: null;
             LinearGradient linearGradie = new LinearGradient(i5, i3, i4, i6, ointArray, uofloatArray2, Shader$TileMode.CLAMP);
             if (TextUtils.isEmpty(obj.F)) {
                this.getView().setTextColor(-1);
             }
             this.getView().getPaint().setShader(obj2);
             this.getView().invalidate();
          }catch(java.lang.Exception e0){
             a.a(e0, this.getJSContext().i());
          }
       }
    }
    public void setGradientTextColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "38")) {
          return;
       }
       this.H = true;
       TKText tE = this.E;
       if (tE != null && tE.equals(p0)) {
          return;
       }
       this.E = p0;
       if (!this.getView().getWidth()) {
          this.getView().addOnLayoutChangeListener(new TKText$b(this, p0));
       }else {
          this.setGradient(p0, new Rect(0, 0, this.getView().getWidth(), this.getView().getHeight()));
       }
       return;
    }
    public void setIncludeFontPadding(boolean p0){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKText, "18")) {
          return;
       }
       this.getView().setIncludeFontPadding(p0);
       return;
    }
    public void setLetterSpacing(float p0){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKText, "33")) {
          return;
       }
       this.setTextLetterSpace(Float.valueOf(p0));
       return;
    }
    public void setLineClamp(int p0){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKText, "26")) {
          return;
       }
       this.setTextLineClamp(p0);
       return;
    }
    public void setLineHeight(Number p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "30")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       KDSFeature kDSFeature = this.getTKJSContext().f("KDSFeature");
       if (kDSFeature != null && kDSFeature.lineHeightFactor != null) {
          float f = p0.floatValue();
          this.C = f;
          this.o(((float)this.getView().getPaint().getFontMetricsInt(null) * f));
       }else {
          this.setTextLineHeightClamp(p0);
       }
       return;
    }
    public void setMinimumScaleFactor(float p0){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, tKText, "34")) {
          return;
       }
       if (!this.A - p0) {
          return;
       }
       this.A = p0;
       tKText = 0;
       if (p0 - tKText >= 0 && p0 - 0x3f800000 < 0) {
          if (!p0 - tKText) {
             p0 = 0.10f;
          }
          tKText = this.z;
          float f = (tKText == null)? 14.00f: (float)tKText;
          this.getView().setAutoSizeTextTypeUniformWithConfiguration((int)(p0 * f), (int)f, 1, 1);
       }
       return;
    }
    public void setRichText(Object p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0 instanceof String) {
          this.setText(p0);
          return;
       }else {
          String str = null;
          this.text = str;
          this.y = 2;
          this.richText = p0;
          TKText$a uoa = new TKText$a(this);
          if (!PatchProxy.applyVoidThreeRefs(this, p0, uoa, null, RichTextHelper.class, "1")) {
             RichTextHelper.c = false;
             RichTextHelper.b = 0;
             if (p0 instanceof Map) {
                uArrayList = new ArrayList();
                uArrayList.add(RichTextHelper.d(this, p0));
                RichTextHelper.c(this, uArrayList, uoa);
             }else if(p0 instanceof List){
                uArrayList = PatchProxy.applyTwoRefs(this, p0, str, RichTextHelper.class, "3");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                   uArrayList = new ArrayList();
                   p0 = p0.iterator();
                   while (p0.hasNext()) {
                      Object obj = p0.next();
                      if (obj instanceof String) {
                         uArrayList.add(new RichTextHelper$a(obj));
                      }else if(obj instanceof Map){
                         uArrayList.add(RichTextHelper.d(this, obj));
                      }
                   }
                }
                RichTextHelper.c(this, uArrayList, uoa);
             }
          }
          return;
       }
    }
    public void setRichTextHasDecoration(boolean p0){
       this.O = p0;
    }
    public void setRichTextSpannableString(SpannableString p0){
       TKText tKText = TKText.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, tKText, "6")) {
          return;
       }
       if (!TextUtils.isEmpty(this.text)) {
          this.m(this.text, null);
          return;
       }else {
          this.getDomNode().c().b();
          int i = 0;
          if (this.B - i) {
             if (PatchProxy.applyOneRefs(p0, this, tKText, "9") != PatchProxyResult.class) {
             }else {
                tKText = this.B;
                if (tKText - i && p0 != null) {
                   p0.setSpan(new b(tKText), 0, p0.length(), 34);
                }
             }
          }
          this.getView().setText(p0);
          return;
       }
    }
    public void setShadow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "35")) {
          return;
       }
       this.n(p0, false);
       return;
    }
    public void setSpan(String p0,V8Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKText.class, "4")) {
          return;
       }
       TKSpan nativeModule = this.getNativeModule(p1);
       if (nativeModule == null) {
          return;
       }
       this.y = 1;
       this.text = p0;
       if (this.I == p1) {
          nativeModule.clearSpan();
       }
       this.I = p1;
       this.getDomNode().c().b();
       this.getView().setText(this.m(p0, nativeModule.getSpannableString(p0, this.getView())));
       return;
    }
    public void setSpanText(String p0,V8Array p1){
       String str = this;
       Object obj = p0;
       c obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, str, TKText.class, "7")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          str.setText("");
          return;
       }else if(obj1 == null || p1.length() <= 0){
          int i = p1.length();
          if (i <= 0) {
             return;
          }else {
             ArrayList uArrayList = new ArrayList();
             int i1 = 0;
             String str1 = "2";
             while (i1 < i) {
                Object obj2 = obj1.get(i1);
                if (obj2 instanceof V8Object) {
                   Object obj3 = null;
                   V8Array obj4 = PatchProxy.applyOneRefs(obj2, obj3, g.class, str1);
                   if (obj4 != PatchProxyResult.class) {
                      obj3 = obj4;
                   }else if(!y.a(obj2)){
                      obj4 = obj2.getArray("spanArray");
                      if (obj4 != null && obj4.length() > 0) {
                         ArrayList uArrayList1 = new ArrayList();
                         int i2 = obj4.length();
                         int i3 = -1;
                         int i4 = g.a(obj2, "start", Integer.valueOf(i3)).intValue();
                         int i5 = g.a(obj2, "end", Integer.valueOf(i3)).intValue();
                         int i6 = g.a(obj2, "index", Integer.valueOf(i3)).intValue();
                         if (i3 != i4 || (i3 != i5 || i3 != i6)) {
                            int i7 = 0;
                            while (i7 < i2) {
                               g og = g.b(i4, i5, i6, obj4.getObject(i7));
                               if (og != null) {
                                  uArrayList1.add(og);
                               }
                               i7 = i7 + 1;
                            }
                            obj3 = uArrayList1;
                         }
                      }
                   }
                   if (obj3 != null) {
                      uArrayList.addAll(obj3);
                   }
                }
                i1 = i1 + 1;
             }
             if (uArrayList.size() <= 0) {
                return;
             }else {
                obj1 = new c(this.getContext(), this.getRootDir());
                if (!PatchProxy.applyVoidOneRefs(uArrayList, obj1, c.class, str1)) {
                   obj1.c.addAll(uArrayList);
                }
                str.text = obj;
                this.getDomNode().c().b();
                this.getView().setText(str.m(obj, obj1.b(obj, this.getView(), this.getTKJSContext())));
             }
          }
       }
       return;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "2")) {
          return;
       }
       this.takeControlOfPaddingSet(p0);
       super.setStyle(p0);
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "3")) {
          return;
       }
       if (p0 != null && (p0.equals(this.text) && this.G == null)) {
          return;
       }
       this.y = 0;
       this.text = p0;
       Object obj = null;
       this.richText = obj;
       if (this.getDomNode().c() == null) {
          return;
       }
       this.getDomNode().c().b();
       if (this.B) {
          this.getView().setText(this.m(p0, obj));
          return;
       }else {
          this.getView().setText(p0);
          return;
       }
    }
    public void setTextAlign(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "15")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xaeb2cc55:
             if (p0.equals("center")) {
                i = 0;
             }
             break;
           case 0x32a007:
             if (p0.equals("left")) {
                i = 1;
             }
             break;
           case 0x677c21c:
             if (p0.equals("right")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             i = 17;
             this.getView().setGravity(i);
             this.J = i;
             break;
           case 1:
             this.getView().setGravity(3);
             this.J = 0x800013;
             break;
           case 2:
             this.getView().setGravity(5);
             this.J = 0x800015;
             break;
           default:
       }
       if (this.K != null) {
          this.getView().setGravity((this.J | this.K));
       }
       return;
    }
    public void setTextCopyEnable(boolean p0){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKText, "42")) {
          return;
       }
       if (p0) {
          this.getView().setOnLongClickListener(new m(this));
       }
       return;
    }
    public void setTextDecoration(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "19")) {
          return;
       }
       if (this.O != null) {
          return;
       }
       this.N = p0;
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xba27e9ec:
             if (p0.equals("line-through")) {
                i = 0;
             }
             break;
           case 0xc2c9c6cc:
             if (p0.equals("underline")) {
                i = 1;
             }
             break;
           case 0x33af38:
             if (p0.equals("none")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.getView().getPaint().setFlags(17);
             break;
           case 1:
             this.getView().getPaint().setFlags(9);
             break;
           case 2:
             this.getView().getPaint().setFlags(((this.getView().getPaintFlags() & 0xf7) & 0xef));
             break;
           default:
       }
       this.getView().invalidate();
       return;
    }
    public void setTextLetterSpace(Number p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "32")) {
          return;
       }
       if (p0 != null) {
          float f = p0.floatValue();
          if (!this.D - f) {
             return;
          }else {
             this.D = f;
             TKText tz = this.z;
             float f1 = (tz == null)? 14.00f: (float)tz;
             this.getView().setLetterSpacing((f / f1));
          }
       }
       return;
    }
    public void setTextLineClamp(int p0){
       TKText tKText = TKText.class;
       if (PatchProxy.isSupport(tKText) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKText, "25")) {
          return;
       }
       AppCompatTextView view = this.getView();
       if (p0 <= 0) {
          p0 = Integer.MAX_VALUE;
       }
       view.setMaxLines(p0);
       return;
    }
    public void setTextLineHeight(Number p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "28")) {
          return;
       }
       if (p0 != null) {
          this.getView().setLineHeight((int)(float)n.a(p0.floatValue()));
       }
       return;
    }
    public void setTextLineHeightClamp(Number p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "29")) {
          return;
       }
       if (p0 != null) {
          this.o((float)n.a(p0.floatValue()));
       }
       return;
    }
    public void setTextLineSpace(Number p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "27")) {
          return;
       }
       if (p0 != null) {
          this.getView().setLineSpacing((float)n.a(p0.floatValue()), 0x3f800000);
       }
       return;
    }
    public void setTextOverflow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "24")) {
          return;
       }
       if (("clip").equalsIgnoreCase(p0)) {
          this.getView().setEllipsize(null);
       }else if(("ellipsis").equalsIgnoreCase(p0)){
          this.getView().setEllipsize(TextUtils$TruncateAt.valueOf("END"));
       }
       return;
    }
    public void setTextShadow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "36")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (("none").equals(p0) && !TextUtils.isEmpty(this.M)) {
          this.n(this.M, true);
       }else {
          this.n(p0, false);
       }
       this.M = p0;
       return;
    }
    public void setTextVerticalAlign(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKText.class, "16")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       p0 = p0.toLowerCase();
       int i = -1;
       int i1 = p0.hashCode();
       if (i1 != -1383228885) {
          if (i1 != -1364013995) {
             if (i1 == 0x1c155 && p0.equals("top")) {
                i = 2;
             }
          }else if(p0.equals("center")){
             i = 0;
          }
       }else if(p0.equals("bottom")){
          i = 3;
       }
       if (i != 2) {
          if (i != 3) {
             i = 16;
             this.getView().setGravity(i);
             this.K = i;
          }else {
             i = 80;
             this.getView().setGravity(i);
             this.K = i;
          }
       }else {
          i = 48;
          this.getView().setGravity(i);
          this.K = i;
       }
       if (this.J != null) {
          this.getView().setGravity((this.J | this.K));
       }
       return;
    }
    public boolean styleFilter(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKText.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = p0.length();
       boolean b = true;
       if (i != 5) {
          if (i != 17) {
             return super.styleFilter(p0);
          }else if(this.H == null && ("gradientTextColor").equals(p0)){
             b = false;
          }
          return b;
       }else if(this.H != null && ("color").equals(p0)){
          b = false;
       }
       return b;
    }
    public boolean supportAsyncPrepareView(){
       boolean b = (Build$VERSION.SDK_INT > 25)? true: false;
       return b;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, TKText.class, "44")) {
          return;
       }
       super.unRetainAllJsObj();
       TKText tL = this.L;
       if (tL != null && tL.size() > 0) {
          Iterator iterator = this.L.iterator();
          while (iterator.hasNext()) {
             y.c(iterator.next());
          }
          this.L.clear();
       }
       return;
    }
}
