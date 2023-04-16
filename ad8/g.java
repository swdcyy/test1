package ad8.g;
import xd8.m;
import cd8.f$a;
import qc8.a;
import ma8.i;
import com.mini.js.jscomponent.input.model.InputParameter;
import ma8.g;
import com.mini.js.jscomponent.base.JSComponentBean$a;
import java.lang.String;
import java.lang.Object;
import com.google.common.base.Optional;
import ad8.c;
import ok.h;
import android.view.ViewGroup;
import com.mini.js.jscomponent.text.BlockFocusEditText;
import android.content.Context;
import android.widget.EditText;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.mini.js.jscomponent.base.JSComponentBean$Style;
import zi8.o;
import zi8.m1;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import fa8.a;
import ad8.a;
import android.view.View$OnFocusChangeListener;
import ad8.b;
import android.widget.TextView$OnEditorActionListener;
import ad8.f;
import android.text.TextWatcher;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.mini.d;
import java.lang.StringBuilder;
import com.mini.js.jscomponent.keyboard.GlobalKeyboard;
import zi8.e0;
import bd8.a;
import android.os.Handler;
import android.os.Looper;
import ad8.e;
import java.lang.Runnable;
import java.lang.Float;
import ad8.g$a;
import be8.u;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.Integer;
import android.text.InputFilter;
import android.text.InputFilter$LengthFilter;
import ja8.e;
import com.mini.js.jscomponent.keyboard.GlobalKeyboard$KeyboardType;
import cd8.f;
import zi8.n0;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import java.lang.Number;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import cd8.g;
import java.util.Objects;
import org.json.JSONObject;
import org.json.JSONException;
import zi8.p;
import zi8.y;
import java.lang.Math;
import ad8.d;
import com.mini.js.jscomponent.input.model.b;
import yd8.b;
import com.mini.js.jscomponent.base.JSComponentBean$Position;

public class g extends a implements m, f$a	// class@00007f
{
    public String r;
    public EditText s;
    public boolean t;
    public boolean u;
    public ViewGroup v;
    public boolean w;
    public InputParameter x;
    public boolean y;
    public i z;

    public void g(i p0,InputParameter p1){
       boolean parent1;
       float f;
       g og = p0.h();
       InputParameter parent = p1.parent;
       JSComponentBean$a uoa = (parent != null)? parent.a: 0;
       super(og, uoa, p1.nodeId, p1.inputId, p1.fixed);
       this.r = "<input>";
       this.z = p0;
       this.x = p1;
       this.v = Optional.fromNullable(p0.h()).transform(c.b).orNull();
       BlockFocusEditText uBlockFocusE = new BlockFocusEditText(p0.p());
       this.s = uBlockFocusE;
       uBlockFocusE.setPadding(0, 0, 0, 0);
       this.S(p1.defaultValue);
       InputParameter style = p1.style;
       String str = "bold";
       if (!PatchProxy.applyVoidOneRefs(style, this, g.class, "5") && style != null) {
          this.L(style);
          this.U(o.b(style.color, 0xff000000));
          this.M(style.fontSize);
          JSComponentBean$Style uBlockFocusE1 = style.padding;
          if (PatchProxy.applyVoidOneRefs(uBlockFocusE1, this, g.class, "6") || (uBlockFocusE1 != null && uBlockFocusE1.length >= 4)) {
             this.s.setPadding(m1.a(uBlockFocusE1[3]), m1.a(uBlockFocusE1[0]), m1.a(uBlockFocusE1[1]), m1.a(uBlockFocusE1[2]));
          }
       label_00a1 :
          if (TextUtils.equals(style.fontWeight, str)) {
             this.s.setTypeface(null, 1);
          }
          this.T(style.textAlign);
       }
       g ts = this.s;
       m1.w(ts, (int)ts.getTextSize(), o.b(p1.cursorColor, -117146));
       this.Q(p1.maxLength);
       this.O(p1);
       this.P(p1);
       this.w = p1.adjustPosition;
       this.s.setMaxLines(1);
       this.s.setSingleLine(1);
       if (!PatchProxy.applyVoidOneRefs(p1, this, g.class, "2")) {
          if (!TextUtils.isEmpty(p1.placeholder)) {
             style = p1.placeholder;
             parent = p1.placeholderStyle;
             if (parent != null) {
                parent1 = TextUtils.equals(parent.fontWeight, str);
                JSComponentBean$Style fontSize = p1.placeholderStyle.fontSize;
             label_0107 :
                if (!TextUtils.isEmpty(style)) {
                   int i = -1;
                   int i1 = o.b(p1.placeholderStyle.color, i);
                   int i2 = 0;
                   SpannableStringBuilder spannableStr = (!parent1 && (fontSize - i2 > 0 || i1 != i))? 1: null;
                   if (spannableStr) {
                      spannableStr = new SpannableStringBuilder();
                      spannableStr.append(style);
                      f = (fontSize - i2 > 0)? (float)m1.x(this.s.getContext(), fontSize): this.s.getTextSize();
                      AbsoluteSizeSpan uAbsoluteSiz = new AbsoluteSizeSpan((int)f, 0);
                      ForegroundColorSpan uForegroundC = new ForegroundColorSpan(i1);
                      if (parent1) {
                         spannableStr.setSpan(new StyleSpan(1), 0, style.length(), 17);
                      }
                      spannableStr.setSpan(uAbsoluteSiz, 0, style.length(), 17);
                      spannableStr.setSpan(uForegroundC, 0, style.length(), 17);
                      this.s.setHint(spannableStr);
                   }else {
                      this.s.setHint(style);
                   }
                }
             }
          }else {
             String str1 = "";
          }
          f = 0xbf800000;
          parent1 = false;
          goto label_0107 ;
       }
       this.j(p1.getPosition());
       this.i();
       if (!PatchProxy.applyVoid(null, this, g.class, "18")) {
          this.s.setOnFocusChangeListener(new a(this));
          this.s.setOnEditorActionListener(new b(this));
          this.s.addTextChangedListener(new f(this));
       }
       this.s.setFocusable(1);
       this.s.setFocusableInTouchMode(1);
       ts = this.s;
       ts.setSelection(ts.getText().length());
       if (this.s.getInputType() & 0x0080) {
          this.s.setTransformationMethod(PasswordTransformationMethod.getInstance());
       }
       this.s.setVisibility(8);
       return;
    }
    public void H(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "24")) {
          return;
       }
       this.j(p0);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(this.p(), this.o());
       layoutParams.leftMargin = this.q();
       layoutParams.topMargin = this.t();
       this.s.setLayoutParams(layoutParams);
       return;
    }
    public void J(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "21")) {
          return;
       }
       if (d.f()) {
          d.a(this.r, "input finish "+this.t);
       }
       if (this.t == null) {
          this.t = true;
          GlobalKeyboard.a().b();
          this.K();
          if (e0.b(this.s)) {
             if (d.f()) {
                d.a(this.r, "当前编辑未完成，补充发送onKeyboardValueChange 事件 : editText 文字是"+this.s.getText());
             }
             g ts = this.s;
             this.z.f.e(ts, this.e, this.d, 0, ts.length(), false, this.n());
          }
          if (GlobalKeyboard.a().g(this.z.m())) {
             GlobalKeyboard.a().f(this);
          }
          if (!PatchProxy.applyVoid(objArray, this, og, "22")) {
             new Handler(Looper.getMainLooper()).postDelayed(new e(this, this.n()), 100);
          }
       }
       return;
    }
    public final void K(){
       if (PatchProxy.applyVoid(null, this, g.class, "20")) {
          return;
       }
       g tv = this.v;
       if (tv != null && Float.compare(tv.getTranslationY(), 0)) {
          this.v.postDelayed(new g$a(this), 100);
       }
       return;
    }
    public void L(JSComponentBean$Style p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "13")) {
          return;
       }
       g ts = this.s;
       if (!PatchProxy.applyVoidTwoRefs(ts, p0, null, u.class, "1")) {
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setColor(o.a(p0.backgroundColor));
          gradientDraw.setCornerRadius((float)m1.a(p0.cornerRadius));
          gradientDraw.setStroke(m1.a(p0.borderWidth), o.a(p0.borderColor));
          ts.setBackground(gradientDraw);
       }
       return;
    }
    public void M(float p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, og, "12")) {
          return;
       }
       if (p0 > 0) {
          this.s.setTextSize(1, p0);
       }
       return;
    }
    public final void O(InputParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       int i = 6;
       if (!TextUtils.equals(p0.confirmType, "done")) {
          if (TextUtils.equals(p0.confirmType, "search")) {
             i = 3;
          }else if(TextUtils.equals(p0.confirmType, "go")){
             i = 2;
          }else if(TextUtils.equals(p0.confirmType, "next")){
             i = 5;
          }else if(TextUtils.equals(p0.confirmType, "send")){
             i = 4;
          }
       }
       if (this.s.getImeOptions() == i) {
          return;
       }else {
          this.s.setImeOptions(i);
          return;
       }
    }
    public final void P(InputParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       int i = 1;
       if (p0.password != null) {
          i = 129;
       }
       if (this.s.getInputType() == i) {
          return;
       }else {
          this.s.setInputType(i);
          return;
       }
    }
    public final void Q(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "9")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       InputFilter[] inputFilterA = new InputFilter[]{new InputFilter$LengthFilter(p0)};
       this.s.setFilters(inputFilterA);
       return;
    }
    public void S(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "16")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.s.setText(p0);
          this.s.setSelection(p0.length());
       }else {
          this.s.setText("");
       }
       return;
    }
    public final void T(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       if (TextUtils.isEmpty(p0) || TextUtils.equals(p0, "left")) {
          this.s.setGravity(19);
          return;
       }else if(TextUtils.equals(p0, "right")){
          this.s.setGravity(21);
          return;
       }else if(TextUtils.equals(p0, "center")){
          this.s.setGravity(17);
       }
       return;
    }
    public void U(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "14")) {
          return;
       }
       this.s.setTextColor(p0);
       return;
    }
    public void b(Integer p0,e p1,int p2){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, g.class, "11")) {
          return;
       }
       int i = 0;
       this.s.setVisibility(i);
       if (!PatchProxy.applyVoid(null, this, og, "1") && this.x != null) {
          GlobalKeyboard.a().b();
          this.t = i;
          GlobalKeyboard.a().e(this.z, GlobalKeyboard$KeyboardType.get(this.x.type), this.s, this);
       }
       return;
    }
    public void d(f p0,int p1){
       int i2;
       int[] obj3;
       int b1;
       int i3;
       int[] obj4;
       int i5;
       JSONObject obj5;
       boolean b = this;
       a obj = p0;
       int i = p1;
       n0 on0 = n0.class;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(p1), b, og, "23")) {
          return;
       }
       g v = b.v;
       if (v == null) {
          return;
       }
       FragmentActivity uFragmentAct = b.z.g();
       Object obj1 = null;
       g obj2 = PatchProxy.applyOneRefs(uFragmentAct, obj1, on0, "2");
       int i1 = 0;
       if (obj2 != PatchProxyResult.class) {
          i2 = obj2.intValue();
       }else {
          ViewGroup viewGroup1 = n0.a(uFragmentAct);
          i2 = (viewGroup1 != null)? viewGroup1.getLayoutParams().bottomMargin: 0;
       }
       if (d.f()) {
          obj2 = b.r;
          StringBuilder str = "input 引起 键盘弹起, 键盘高度是: "+i+" nav height "+i2+" nav is open ";
          FragmentActivity uFragmentAct1 = b.z.g();
          obj3 = PatchProxy.applyOneRefs(uFragmentAct1, obj1, on0, "1");
          if (obj3 != PatchProxyResult.class) {
             b1 = obj3.booleanValue();
          }else {
             ViewGroup viewGroup = n0.a(uFragmentAct1);
             ViewGroup$MarginLayoutParams bottomMargin = (viewGroup != null)? viewGroup.getLayoutParams().bottomMargin: null;
             if (bottomMargin != null) {
                b1 = true;
             }else {
                b1 = false;
             }
          }
          d.a(obj2, str+b1);
       }
       b.u = true;
       b1 = m1.u((float)i);
       if (obj instanceof g) {
          b1 = b1 - m1.u((float)i2);
          i3 = i;
       }else {
          i3 = i + i2;
       }
       i f = b.z.f;
       obj = b.d;
       String str1 = b.s.getText().toString();
       Objects.requireNonNull(f);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(obj), str1, Integer.valueOf(b1), f, a.class, "7")) {
          try{
             try{
                obj5 = new JSONObject();
                obj5.put("nodeId", obj);
                obj5.put("value", str1);
                obj5.put("height", b1);
             label_0106 :
                if (p.d() && d.f()) {
                   d.a("<textArea>|<input>", "发送onInputFocus 事件，JSON： "+obj5);
                }
                obj = f.c;
                obj.d(obj.h(), "onInputFocus", obj5);
             }catch(org.json.JSONException e0){
                i5 = obj5;
             }
             e0.printStackTrace();
             obj5 = obj1;
             goto label_0106 ;
          }catch(org.json.JSONException e0){
             goto label_0102 ;
          }
       }
       b.z.f.d(b.e, b.d);
       if (b.w != null) {
          g s = b.s;
          if (PatchProxy.isSupport(og)) {
             obj4 = PatchProxy.applyThreeRefs(v, s, Integer.valueOf(i3), this, g.class, "26");
             if (obj4 != PatchProxyResult.class) {
                obj4.booleanValue();
             }
          }
          if (s != null) {
             obj3 = new int[2];
             obj4 = new int[2];
             s.getLocationInWindow(obj3);
             v.getLocationInWindow(obj4);
             int i4 = m1.j();
             i2 = y.b(s)[1];
             if (b.w != null) {
                i5 = (obj3[1] + s.getHeight()) - (i4 - i3);
                if (i5 > 0) {
                   int i6 = (int)Math.min((float)i5, ((i2 + (float)obj3[1]) - (float)obj4[1]));
                   if (b.b != null) {
                      v.setTranslationY((float)(- i6));
                   }else {
                      ViewGroup webView = this.n().getWebView();
                      if (webView != null) {
                         webView.postDelayed(new d(b, webView, i6, v), 50);
                      }
                   }
                }
             }
             if (((float)obj3[1] + i2) - (float)obj4[1] < 0) {
                g og1 = this.n();
                i = - (int)((float)obj4[1] - ((float)obj3[1] + i2));
                if (i2) {
                   i1 = s.getLineHeight();
                }
                og1.F((i - i1));
             }
          }
       }
    label_01df :
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, g.class, "17")) {
          return;
       }
       if (d.f()) {
          d.a(this.r, "InputNativeViewModel.destroy id = "+this.e);
       }
       this.t = true;
       GlobalKeyboard.a().f(this);
       super.destroy();
       return;
    }
    public boolean e(Integer p0,e p1,int p2){
       InputParameter obj;
       boolean b;
       g og = this;
       e uoe = p1;
       g og1 = g.class;
       if (PatchProxy.isSupport(og1)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, g.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       InputParameter inputParamet = b.a(p1.g());
       if (inputParamet == null) {
          d.c(og.r, "更新input 错误，因为使用GSON解析InputUpdateParameter出错 , JSON参数为： "+p1.toString());
          og.I(uoe, b.a(101, "解析InputUpdateParameter出错"));
          return false;
       }else {
          og.x = inputParamet;
          obj = inputParamet.style;
          if (obj != null) {
             og.M(obj.fontSize);
             og.U(o.a(inputParamet.style.color));
             og.L(inputParamet.style);
             og.T(inputParamet.style.textAlign);
          }
          if (!TextUtils.isEmpty(inputParamet.cursorColor)) {
             g s = og.s;
             m1.w(s, (int)s.getTextSize(), o.b(inputParamet.cursorColor, -117146));
          }
          obj = inputParamet.placeholderStyle;
          if (obj != null) {
             InputParameter placeholder = inputParamet.placeholder;
             b = TextUtils.equals(obj.fontWeight, "bold");
             obj = inputParamet.placeholderStyle;
             JSComponentBean$Style fontSize = obj.fontSize;
             JSComponentBean$Style color = obj.color;
             if (PatchProxy.isSupport(og1) && (!PatchProxy.applyVoidFourRefs(placeholder, Boolean.valueOf(b), Float.valueOf(fontSize), color, this, g.class, "8") && !TextUtils.isEmpty(placeholder))) {
                int i = -1;
                int i1 = o.b(color, i);
                String str = null;
                SpannableStringBuilder spannableStr = (!b && (fontSize - str > 0 || i1 != i))? 1: null;
                if (spannableStr) {
                   spannableStr = new SpannableStringBuilder();
                   spannableStr.append(placeholder);
                   float f = (fontSize - str > 0)? (float)m1.x(og.s.getContext(), fontSize): og.s.getTextSize();
                   AbsoluteSizeSpan uAbsoluteSiz = new AbsoluteSizeSpan((int)f, false);
                   ForegroundColorSpan uForegroundC = new ForegroundColorSpan(i1);
                   i1 = 17;
                   if (b) {
                      spannableStr.setSpan(super(true), false, placeholder.length(), i1);
                   }
                   spannableStr.setSpan(uAbsoluteSiz, false, placeholder.length(), i1);
                   spannableStr.setSpan(uForegroundC, false, placeholder.length(), i1);
                   og.s.setHint(spannableStr);
                }else {
                   og.s.setHint(placeholder);
                }
             }
          }
          obj = inputParamet.maxLength;
          if (obj >= null) {
             og.Q(obj);
          }
          og.O(inputParamet);
          og.P(inputParamet);
          if (!JSComponentBean$Position.isEmptyPosition(inputParamet.position)) {
             og.H(a.a(inputParamet.position));
          }
          if (TextUtils.equals(inputParamet.defaultValue, og.s.getText())) {
             d.c(og.r, "更新input 错误， 因为JS要更新的文字和EditText文字一样 "+og.s.getText());
             og.I(uoe, b.a(342, "要更新的文字和EditText文字一样"));
             return true;
          }else {
             og.y = true;
             og.S(inputParamet.defaultValue);
             Objects.toString(inputParamet.position);
             og.y = false;
             if (p.d() && d.f()) {
                d.a(og.r, "更新input 成功!!! "+p1.toString());
             }
             return true;
          }
       }
    }
    public void f(Integer p0,e p1,int p2){
    }
    public void h(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "25")) {
          return;
       }
       this.s.setVisibility(8);
       if (d.f()) {
          g tr = this.r;
          StringBuilder str = "input 引起 键盘消失 ";
          String str1 = (this.u != null)? "此时执行input 的finish": "此时mHasShowKeyboard是false";
          d.a(tr, str+str1);
       }
       if (this.u != null) {
          this.J();
       }
       if (!this.s.isFocused()) {
          GlobalKeyboard.a().f(this);
       }
       this.u = false;
       this.K();
       return;
    }
    public View u(){
       return this.s;
    }
}
