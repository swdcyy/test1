package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$a;
import android.text.TextWatcher;
import android.widget.EditText;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$b;
import android.view.View$OnScrollChangeListener;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$c;
import com.yxcorp.gifshow.widget.EmojiEditText$e;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$d;
import android.view.View$OnClickListener;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import xw8.p0;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import ow8.c;
import zsd.u;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Integer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import lnc.a1;
import java.lang.Character;
import fx8.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$e;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$f;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$g;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$h;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$i;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$j;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class ShareHintTextPresenter extends PresenterV2	// class@0013b1
{
    public EmojiEditText p;
    public EmojiEditText q;
    public GifshowActivity r;
    public p0 s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;

    public void ShareHintTextPresenter(){
       super();
    }
    public static final EmojiEditText P8(ShareHintTextPresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("editor");
       }
       return p0;
    }
    public static final EmojiEditText R8(ShareHintTextPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("editorHint");
       }
       return p0;
    }
    public static void a9(ShareHintTextPresenter p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 0;
       }
       p0.Z8(p1);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ShareHintTextPresenter.class, "3")) {
          return;
       }
       this.b9();
       ShareHintTextPresenter tp = this.p;
       String str = "editor";
       if (tp == null) {
          a.S(str);
       }
       tp.addTextChangedListener(new ShareHintTextPresenter$a(this));
       if (Build$VERSION.SDK_INT >= 23) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          tp.setOnScrollChangeListener(new ShareHintTextPresenter$b(this));
       }
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       tp.f(new ShareHintTextPresenter$c(this));
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       tp.setOnClickListener(new ShareHintTextPresenter$d(this));
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, ShareHintTextPresenter.class, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.b().w("ShareHintTextPresenter", "appendLine\(\) called isLineAdded="+this.v, objArray);
       if (this.v != null) {
          return;
       }
       ShareHintTextPresenter ts = this.s;
       String str = "sharePagePresenterModel";
       if (ts == null) {
          a.S(str);
       }
       ts.H = i;
       ts = this.p;
       String str1 = "editor";
       if (ts == null) {
          a.S(str1);
       }
       String str2 = String.valueOf(ts.getText());
       ShareHintTextPresenter tp = this.p;
       if (tp == null) {
          a.S(str1);
       }
       tp.setTextKeepState(str2+"\n");
       ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       ts.H = true;
       this.v = true;
       return;
    }
    public final void V8(){
       ShareHintTextPresenter tq;
       if (PatchProxy.applyVoid(null, this, ShareHintTextPresenter.class, "9")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "ShareHintTextPresenter";
       a.b().w(str, "clearSearchWord\(\) called", objArray);
       if (this.u != null || this.w == null) {
          Object[] objArray1 = new Object[i];
          a.b().w(str, "clearSearchWord: isHintShow="+this.u+' '+"isUnderlineShow="+this.w, objArray1);
          return;
       }else {
          String str1 = "editor";
          if (c.b()) {
             tq = this.q;
             if (tq == null) {
                a.S("editorHint");
             }
             ShareHintTextPresenter tp = this.p;
             if (tp == null) {
                a.S(str1);
             }
             tq.setText(String.valueOf(tp.getText()));
          }else {
             tq = this.s;
             if (tq == null) {
                a.S("sharePagePresenterModel");
             }
             tq.H = i;
             tq = this.p;
             if (tq == null) {
                a.S(str1);
             }
             ShareHintTextPresenter tp1 = this.p;
             if (tp1 == null) {
                a.S(str1);
             }
             tq.setTextKeepState(String.valueOf(tp1.getText()));
             tq = this.s;
             if (tq == null) {
                a.S("sharePagePresenterModel");
             }
             tq.H = true;
          }
          this.w = i;
          return;
       }
    }
    public final void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ShareHintTextPresenter.class, "11")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.b().w("ShareHintTextPresenter", "deleteLine\(\) called isLineAdded="+this.v, objArray1);
       if (this.v == null) {
          objArray = new Object[0];
          a.b().w("ShareHintTextPresenter", "deleteLine\(\) return", objArray);
          return;
       }else {
          ShareHintTextPresenter tp = this.p;
          String str = "editor";
          if (tp == null) {
             a.S(str);
          }
          String str1 = String.valueOf(tp.getText());
          this.v = false;
          if (u.H1(str1, "\n", 0, 2, objArray)) {
             ShareHintTextPresenter ts = this.s;
             if (ts == null) {
                a.S("sharePagePresenterModel");
             }
             ts.H = false;
             ts = this.p;
             if (ts == null) {
                a.S(str);
             }
             ts.setTextKeepState(StringsKt__StringsKt.U3(str1, (str1.length() - 1), str1.length()).toString());
             tp = this.s;
             if (tp == null) {
                a.S("sharePagePresenterModel");
             }
             tp.H = true;
             objArray = new Object[0];
             a.b().w("ShareHintTextPresenter", "deleteLine: true delete", objArray);
          }
          return;
       }
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, ShareHintTextPresenter.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.b().w("ShareHintTextPresenter", "hideHint\(\) called isHintShow="+this.u, objArray);
       if (this.u == null) {
          return;
       }
       this.u = i;
       this.t = i;
       ShareHintTextPresenter tq = this.q;
       if (tq == null) {
          a.S("editorHint");
       }
       ShareHintTextPresenter tp = this.p;
       if (tp == null) {
          a.S("editor");
       }
       tq.setTextKeepState(tp.getText());
       return;
    }
    public final void Y8(String p0,int p1){
       ShareHintTextPresenter shareHintTex = ShareHintTextPresenter.class;
       if (PatchProxy.isSupport(shareHintTex) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, shareHintTex, "6")) {
          return;
       }
       if (this.t == p1) {
          Object[] objArray = new Object[0];
          a.b().w("ShareHintTextPresenter", "showHintIfNeed: is show, return", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[0];
          a.b().w("ShareHintTextPresenter", "showHint\(\) called with: hint = "+p0, objArray1);
          this.W8();
          shareHintTex = this.p;
          String str = "editor";
          if (shareHintTex == null) {
             a.S(str);
          }
          String str1 = String.valueOf(shareHintTex.getText());
          boolean b = true;
          StringBuilder str2 = (str1.length() > 0)? 1: null;
          str1 = (str2)? str1+' '+p0: str1+p0;
          this.S8();
          this.u = b;
          this.t = p1;
          SpannableString spannableStr = new SpannableString(str1);
          spannableStr.setSpan(new ForegroundColorSpan(a1.a(R.color.arg_RES_7f0616aa)), (str1.length() - p0.length()), str1.length(), 33);
          ShareHintTextPresenter tq = this.q;
          str1 = "editorHint";
          if (tq == null) {
             a.S(str1);
          }
          tq.setPadding(0, 0, 0, 0);
          tq = this.q;
          if (tq == null) {
             a.S(str1);
          }
          tq.setTextKeepState(spannableStr);
          int i = a1.d(R.dimen.arg_RES_7f0702e8);
          shareHintTex = this.p;
          if (shareHintTex == null) {
             a.S(str);
          }
          shareHintTex.scrollBy(0, i);
          Object[] objArray2 = new Object[0];
          a.b().w("ShareHintTextPresenter", "showHint: resultText="+spannableStr, objArray2);
          return;
       }
    }
    public final void Z8(int p0){
       char c;
       String str;
       ShareHintTextPresenter shareHintTex = ShareHintTextPresenter.class;
       if (PatchProxy.isSupport(shareHintTex) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, shareHintTex, "5")) {
          return;
       }
       shareHintTex = this.p;
       if (shareHintTex == null) {
          a.S("editor");
       }
       int selectionSta = shareHintTex.getSelectionStart();
       ShareHintTextPresenter tp = this.p;
       if (tp == null) {
          a.S("editor");
       }
       boolean selectionEnd = tp.getSelectionEnd();
       if (selectionSta == selectionEnd) {
          shareHintTex = this.s;
          if (shareHintTex == null) {
             a.S("sharePagePresenterModel");
          }
          if (shareHintTex.H != null) {
             if (this.v != null) {
                shareHintTex = this.p;
                if (shareHintTex == null) {
                   a.S("editor");
                }
                if (selectionEnd == (shareHintTex.length() - 1)) {
                label_0060 :
                   if (selectionEnd > 0) {
                      shareHintTex = this.p;
                      if (shareHintTex == null) {
                         a.S("editor");
                      }
                      c = (String.valueOf(shareHintTex.getText())).charAt((selectionEnd - 1));
                   }else {
                      c = ' ';
                   }
                   Character uCharacter = Character.valueOf(c);
                   Object obj = PatchProxy.applyOneRefs(uCharacter, null, s.class, "1");
                   int i = 0;
                   if (obj != PatchProxyResult.class) {
                      selectionEnd = obj.booleanValue();
                   }else if(uCharacter.charValue() == 0xff03 || uCharacter.charValue() == '#'){
                      selectionEnd = true;
                   }else {
                      selectionEnd = false;
                   }
                   if (selectionEnd) {
                      str = a1.p(R.string.arg_RES_7f104015);
                      a.o(str, "hintText");
                      this.Y8(str, 2);
                   }else if(a.g("@", String.valueOf(c)) || a.g("£À", String.valueOf(c))){
                      str = a1.p(R.string.arg_RES_7f104038);
                      a.o(str, "hintText");
                      this.Y8(str, 3);
                   }else if(p0 == 4){
                      ShareHintTextPresenter tp1 = this.p;
                      if (tp1 == null) {
                         a.S("editor");
                      }
                      if (!String.valueOf(tp1.getText()).length()) {
                         i = 1;
                      }
                      if (!i) {
                         if (this.v != null) {
                            tp1 = this.p;
                            if (tp1 == null) {
                               a.S("editor");
                            }
                            if (tp1.length() != 1) {
                            label_0101 :
                               str = a1.p(R.string.arg_RES_7f10403d);
                            label_0110 :
                               a.o(str, "hintText");
                               this.Y8(str, 4);
                            }
                         }else {
                            goto label_0101 ;
                         }
                      }
                      str = a1.p(R.string.arg_RES_7f10403e);
                      goto label_0110 ;
                   }else {
                      this.X8();
                   }
                }
             }
             if (this.v == null) {
                shareHintTex = this.p;
                if (shareHintTex == null) {
                   a.S("editor");
                }
                if (selectionEnd == shareHintTex.length()) {
                   goto label_0060 ;
                }
             }
             this.X8();
          }
       }
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, ShareHintTextPresenter.class, "4")) {
          return;
       }
       ShareHintTextPresenter ts = this.s;
       String str = "sharePagePresenterModel";
       if (ts == null) {
          a.S(str);
       }
       this.X7(ts.b.subscribe(new ShareHintTextPresenter$e(this), ShareHintTextPresenter$f.b));
       ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       this.X7(ts.K.subscribe(new ShareHintTextPresenter$g(this), ShareHintTextPresenter$h.b));
       this.X7(t.interval(10, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new ShareHintTextPresenter$i(this), ShareHintTextPresenter$j.b));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareHintTextPresenter.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.editor);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.editor\)");
       this.p = view;
       p0 = m1.f(p0, R.id.editor_hint);
       a.o(p0, "ViewBindUtils.bindWidget¡­otView, R.id.editor_hint\)");
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ShareHintTextPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("SHARE_ACTIVITY");
       a.o(obj, "inject\(AccessIds.SHARE_ACTIVITY\)");
       this.r = obj;
       obj = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       a.o(obj, "inject\(AccessIds.SHARE_PAGE_PRESENTER_MODEL\)");
       this.s = obj;
       return;
    }
}
