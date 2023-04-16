package b4d.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b4d.a0$a;
import nsd.u;
import b4d.a0$c;
import b4d.a0$g;
import b4d.a0$b;
import mrd.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.ViewGroup;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextPaint;
import android.widget.EditText;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.util.List;
import com.yxcorp.gifshow.widget.EmojiEditText$e;
import b4d.a0$d;
import erd.g;
import crd.b;
import brd.t;
import b4d.a0$e;
import com.yxcorp.gifshow.util.rx.RxBus;
import zu5.a;
import t45.d;
import brd.z;
import b4d.a0$f;
import java.lang.Runnable;
import ekd.k1;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import java.util.Set;
import android.animation.Animator;
import e17.i;
import lnc.a1;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.StringBuilder;
import kotlin.text.StringsKt__StringsKt;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import java.util.HashSet;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Objects;
import com.yxcorp.gifshow.model.CDNUrl;
import android.view.View;
import ekd.m1;
import com.kwai.feature.api.social.SelectUserView;

public final class a0 extends PresenterV2	// class@000354
{
    public Animator A;
    public boolean B;
    public String C;
    public String D;
    public final EmojiEditText$c E;
    public final EmojiEditText$e F;
    public final Runnable G;
    public EmotionFloatEditorFragment p;
    public BaseEditorFragment$Arguments q;
    public c r;
    public t s;
    public View t;
    public ViewGroup u;
    public SelectUserView v;
    public EmojiEditText w;
    public TextView x;
    public View y;
    public Animator z;
    public static final a0$a H;

    static {
       a0.H = new a0$a(null);
    }
    public void a0(){
       super();
       this.C = "";
       this.D = "";
       this.E = new a0$c(this);
       this.F = new a0$g(this);
       this.G = new a0$b(this);
    }
    public static final c P8(a0 p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mAtFloatPanelShowHideSubject");
       }
       return p0;
    }
    public static final EmotionFloatEditorFragment R8(a0 p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mFloatEditorFragment");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0.class, "5")) {
          return;
       }
       a0 tu = this.u;
       if (tu != null) {
          tu.setTranslationY((float)n.c(tu.getContext(), 5.50f));
       }
       this.l9();
       tu = this.w;
       if (tu != null) {
          a0 tx = this.x;
          ViewGroup$LayoutParams layoutParams = (tx != null)? tx.getLayoutParams(): objArray;
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             objArray = layoutParams;
          }
          if (objArray != null) {
             objArray.leftMargin = ((int)tu.getPaint().measureText("@") + tu.getPaddingLeft()) + n.c(this.getContext(), 2.00f);
          }
       }
       tu = this.w;
       if (tu != null) {
          a0 tE = this.E;
          if (!PatchProxy.applyVoidOneRefs(tE, tu, EmojiEditText.class, "2")) {
             tu.getOnKeyPreImeListeners().add(tE);
          }
       }
       tu = this.w;
       if (tu != null) {
          tu.f(this.F);
       }
       tu = this.r;
       if (tu == null) {
          a.S("mAtFloatPanelShowHideSubject");
       }
       this.X7(tu.subscribe(new a0$d(this)));
       tu = this.s;
       if (tu == null) {
          a.S("mEditorTextChangedObservable");
       }
       this.X7(tu.subscribe(new a0$e(this)));
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new a0$f(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "29")) {
          return;
       }
       k1.m(this.G);
       this.W8();
       a0 tw = this.w;
       if (tw != null) {
          a0 tE = this.E;
          if (!PatchProxy.applyVoidOneRefs(tE, tw, EmojiEditText.class, "3")) {
             tw.getOnKeyPreImeListeners().remove(tE);
          }
       }
       tw = this.w;
       if (tw != null) {
          tw.l(this.F);
       }
       this.j9();
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "26")) {
          return;
       }
       a0 tw = this.w;
       if (tw != null) {
          Editable text = tw.getText();
          if (text != null && (this.d9(text.toString()) && (tw.getSelectionStart() == 1 && tw.getSelectionEnd() == 1))) {
             tw = this.p;
             if (tw == null) {
                a.S("mFloatEditorFragment");
             }
             if (tw.Fi()) {
                this.B = true;
                tw = this.x;
                if (tw != null) {
                   tw.setVisibility(0);
                }
                this.B = false;
             }
          }
       }
    label_0048 :
       return;
    }
    public final boolean V8(){
       a0 obj = PatchProxy.apply(null, this, a0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       String str = "mArguments";
       if (obj == null) {
          a.S(str);
       }
       boolean b = true;
       if (obj.mAtFriendMaxLimit != -1) {
          int i = this.b9().size();
          a0 tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          if (i >= tq.mAtFriendMaxLimit) {
             b = false;
          }
       }
       return b;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "28")) {
          return;
       }
       a0 tA = this.A;
       if (tA != null) {
          tA.cancel();
       }
       this.A = null;
       tA = this.z;
       if (tA != null) {
          tA.cancel();
       }
       this.z = null;
       return;
    }
    public final boolean X8(){
       int b;
       a0 obj = PatchProxy.apply(null, this, a0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.V8()) {
          b = true;
       }else {
          obj = this.q;
          String str = "mArguments";
          if (obj == null) {
             a.S(str);
          }
          if (obj.mAtFriendMaxLimitToastResId <= null) {
             i.a(R.style.arg_RES_7f110668, 0x7f1007a4);
          }else {
             b = 0x7f11066a;
             a0 tq = this.q;
             if (tq == null) {
                a.S(str);
             }
             BaseEditorFragment$Arguments mAtFriendMax = tq.mAtFriendMaxLimitToastResId;
             a0 tq1 = this.q;
             if (tq1 == null) {
                a.S(str);
             }
             i.d(b, a1.q(mAtFriendMax, tq1.mAtFriendMaxLimit));
          }
          b = false;
       }
       return b;
    }
    public final void Y8(EditText p0,Editable p1){
       String str;
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa0, "20")) {
          return;
       }
       int selectionSta = p0.getSelectionStart();
       int i = (this.C).length() + 1;
       boolean b = false;
       if (PatchProxy.isSupport(uoa0)) {
          Editable obj = PatchProxy.applyTwoRefs(Integer.valueOf(selectionSta), Integer.valueOf(i), this, uoa0, "31");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(selectionSta >= i){
             uoa0 = this.w;
             int i1 = (uoa0 != null)? uoa0.length(): 0;
             if (i1 >= selectionSta) {
                uoa0 = this.w;
                if (uoa0 != null) {
                   obj = uoa0.getText();
                   if (obj != null) {
                      str = obj.subSequence((selectionSta - i), selectionSta).toString();
                   label_005c :
                      b = a.g(str, '@'+this.C);
                   }
                }
                str = null;
                goto label_005c ;
             }
          }
       }else {
          goto label_0037 ;
       }
       if (b) {
          p1.delete((selectionSta - i), selectionSta);
       }
       this.C = "";
       this.D = "";
       return;
    }
    public final boolean Z8(String p0){
       a0 obj = PatchProxy.applyOneRefs(p0, this, a0.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       boolean b = false;
       if (obj != null) {
          Editable text = obj.getText();
          if (text != null) {
             a.o(text, "it");
             int i = StringsKt__StringsKt.i3(text, p0, 0, false, 6, null);
             int i1 = p0.length() + i;
             if (i >= 0 && text.length() >= i1) {
                b = true;
                if (i == b && this.h9(i)) {
                   i = i - 1;
                }
                int i2 = i1 + 1;
                if (this.h9(i2)) {
                   i1 = i2;
                }
                text.delete(i, i1);
             }
          }
       }
       return b;
    }
    public final String a9(Collection p0,boolean p1){
       StringBuilder obj;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa0, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       if (p1) {
          obj = obj+" ";
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj = obj+iterator.next().getAtIdWithAt()+" ";
       }
       String str = obj;
       a.o(str, "sb.toString\(\)");
       return str;
    }
    public final Set b9(){
       HashSet obj = PatchProxy.apply(null, this, a0.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       a0 tw = this.w;
       if (tw != null) {
          Editable text = tw.getText();
          if (text != null) {
             Matcher matcher = c0.a.matcher(text);
             while (matcher.find()) {
                String str = matcher.group(1);
                a.o(str, "name");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String str1 = str.substring(1);
                a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
                User user = new User(matcher.group(2), str1, null, null, null);
                obj.add(v10);
             }
          }
       }
       return obj;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, a0.class, "25")) {
          return;
       }
       this.S8();
       this.k9(false);
       return;
    }
    public final boolean d9(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.g(p0, "@") || a.g(p0, "£À"))? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "4")) {
          return;
       }
       a.p(p0, "rootView");
       this.t = p0;
       this.u = m1.f(p0, 0x7f0a0272);
       this.w = m1.f(p0, 0x7f0a0ca8);
       this.x = m1.f(p0, 0x7f0a1404);
       this.y = m1.f(p0, 0x7f0a026f);
       return;
    }
    public final boolean e9(int p0){
       String str;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa0, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 >= 1) {
          a0 tw = this.w;
          int i = (tw != null)? tw.length(): 0;
          if (i >= p0) {
             tw = this.w;
             if (tw != null) {
                Editable text = tw.getText();
                if (text != null) {
                   str = text.subSequence((p0 - 1), p0).toString();
                label_0044 :
                   if (a.g("\n", str) || a.g("\r", str)) {
                      b = true;
                   }
                }
             }
             str = null;
             goto label_0044 ;
          }
       }
    label_0055 :
       return b;
    }
    public final boolean h9(int p0){
       Editable obj;
       String str;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa0, "32");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 >= 1) {
          a0 tw = this.w;
          int i = (tw != null)? tw.length(): 0;
          if (i >= p0) {
             uoa0 = this.w;
             if (uoa0 != null) {
                obj = uoa0.getText();
                if (obj != null) {
                   str = obj.subSequence((p0 - 1), p0).toString();
                label_0044 :
                   return a.g(" ", str);
                }
             }
             str = null;
             goto label_0044 ;
          }
       }
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "3")) {
          return;
       }
       Object obj = this.r8("floateditor");
       a.o(obj, "inject\(EditorCallerContext.FLOATEDITOR\)");
       this.p = obj;
       obj = this.r8("args");
       a.o(obj, "inject\(EditorCallerContext.ARGUMNTS\)");
       this.q = obj;
       obj = this.r8("AT_FLOAT_PANEL_SHOW_HIDE");
       a.o(obj, "inject\(EditorCallerConte¡­AT_FLOAT_PANEL_SHOW_HIDE\)");
       this.r = obj;
       obj = this.r8("EMOTION_EDITOR_TEXT_CHANGED");
       a.o(obj, "inject\(EditorCallerConte¡­TION_EDITOR_TEXT_CHANGED\)");
       this.s = obj;
       return;
    }
    public final void j9(){
       if (PatchProxy.applyVoid(null, this, a0.class, "13")) {
          return;
       }
       this.D = "";
       a0 tv = this.v;
       if (tv != null) {
          tv.a();
       }
       this.v = null;
       tv = this.u;
       if (tv != null) {
          tv.removeAllViews();
       }
       return;
    }
    public final void k9(boolean p0){
       a0 tp;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa0, "27")) {
          return;
       }
       uoa0 = this.w;
       if (uoa0 != null) {
          Editable text = uoa0.getText();
          if (text != null) {
             if (!p0) {
                a.o(text, "it");
                if (this.d9(text.subSequence(0, text.length()).toString()) && (uoa0.getSelectionStart() == 1 || uoa0.getSelectionEnd() == 1)) {
                   tp = this.p;
                   if (tp == null) {
                      a.S("mFloatEditorFragment");
                   }
                   if (tp.Fi()) {
                   label_0062 :
                      return;
                   }
                }
             }
             this.B = true;
             tp = this.x;
             if (tp != null) {
                tp.setVisibility(8);
             }
             this.B = false;
             goto label_0062 ;
          }else {
             goto label_0062 ;
          }
       }else {
          goto label_0062 ;
       }
    }
    public final void l9(){
       if (PatchProxy.applyVoid(null, this, a0.class, "34")) {
          return;
       }
       a0 ty = this.y;
       if (ty != null) {
          float f = (this.V8())? 0x3f800000: 0x3f000000;
          ty.setAlpha(f);
       }
       return;
    }
}
