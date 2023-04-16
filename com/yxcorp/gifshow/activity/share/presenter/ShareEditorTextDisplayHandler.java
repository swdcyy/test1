package com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$b;
import nsd.u;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$Gone;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$f;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$e;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$arrowImageSpanTextProcessor$1;
import msd.a;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$foregroundColorSpanTextProcessor$1;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$a;
import com.yxcorp.gifshow.activity.share.util.TextProcessor;
import java.util.HashMap;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$c;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$d;
import android.text.Editable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import vw8.b;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import java.util.Map$Entry;
import com.gifshow.twitter.widget.Extractor$Entity;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.EditText;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$a;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import com.kwai.library.widget.edittext.SafeEditText;
import android.text.InputFilter;
import trd.n;
import com.yxcorp.gifshow.widget.EmojiEditText$e;
import java.util.Arrays;
import java.util.List;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$b;
import java.lang.StringBuilder;
import zsd.u;

public final class ShareEditorTextDisplayHandler extends KSTextDisplayHandler	// class@0013a5
{
    public final TextProcessor$Gone D;
    public final TextProcessor$f E;
    public final TextProcessor$e F;
    public final TextProcessor$e G;
    public final TextProcessor$a H;
    public final HashMap I;
    public final HashMap J;
    public CharSequence K;
    public boolean L;
    public final ShareEditorTextDisplayHandler$c M;
    public final ShareEditorTextDisplayHandler$d N;
    public final EmojiEditText O;
    public static final ShareEditorTextDisplayHandler$b P;

    static {
       ShareEditorTextDisplayHandler.P = new ShareEditorTextDisplayHandler$b(null);
    }
    public void ShareEditorTextDisplayHandler(EmojiEditText p0){
       a.p(p0, "editor");
       super(p0);
       this.O = p0;
       TextProcessor$Gone gone = new TextProcessor$Gone();
       this.D = gone;
       TextProcessor$f uof = new TextProcessor$f();
       this.E = uof;
       TextProcessor$e uoe = new TextProcessor$e(new ShareEditorTextDisplayHandler$arrowImageSpanTextProcessor$1(this));
       this.F = uoe;
       TextProcessor$e uoe1 = new TextProcessor$e(new ShareEditorTextDisplayHandler$foregroundColorSpanTextProcessor$1(this));
       this.G = uoe1;
       TextProcessor[] textProcesso = new TextProcessor[]{uof,gone,uoe,uoe1};
       this.H = new TextProcessor$a(textProcesso);
       this.I = new HashMap();
       this.J = new HashMap();
       this.M = new ShareEditorTextDisplayHandler$c(this);
       this.N = new ShareEditorTextDisplayHandler$d(this);
    }
    public void a(Editable p0){
       ShareEditorTextDisplayHandler shareEditorT1;
       b a;
       ShareEditorTextDisplayHandler shareEditorT = ShareEditorTextDisplayHandler.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, shareEditorT, str)) {
          return;
       }
       super.a(p0);
       if (p0 != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, shareEditorT, "2")) {
             shareEditorT1 = this.K;
             if (shareEditorT1 != null) {
                Object obj = null;
                if (!StringsKt__StringsKt.R4(p0, shareEditorT1, 0, 2, obj)) {
                   if (this.L != null) {
                      p0.replace(0, shareEditorT1.length(), shareEditorT1);
                   }else {
                      p0.insert(0, shareEditorT1);
                   }
                   a = b.a;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoid(obj, a, b.class, str)) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "SAME_FRAME_STYLE";
                      u1.u0(3, uElementPack, obj);
                   }
                }
                this.H.c(p0);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, shareEditorT, "7")) {
             ArrayList uArrayList = new ArrayList();
             ArrayList uArrayList1 = this.e();
             a.o(uArrayList1, "allTags");
             Set set = this.I.keySet();
             a.o(set, "specialTagMap.keys");
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                if (!uArrayList1.contains(str1)) {
                   uArrayList.add(str1);
                }
             }
             Iterator iterator1 = this.J.entrySet().iterator();
             while (iterator1.hasNext()) {
                p0.removeSpan(iterator1.next().getValue());
             }
             Iterator iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                str = iterator2.next();
                this.I.remove(str);
                this.J.remove(str);
             }
             uArrayList = this.d();
             a.o(uArrayList, "allTagEntries");
             iterator2 = uArrayList.iterator();
             while (iterator2.hasNext()) {
                Extractor$Entity uEntity = iterator2.next();
                a.o(uEntity, "it");
                if (this.I.containsKey(uEntity.d())) {
                   Integer integer = this.I.get(uEntity.d());
                   if (integer == null) {
                      integer = Integer.valueOf(0);
                   }
                   a.o(integer, "specialTagMap[it.value] ?: 0");
                   Integer integer1 = uEntity.b();
                   ShareEditorTextDisplayHandler tL = this.L;
                   if (integer.intValue() == 3) {
                      shareEditorT1 = (tL != null)? 0x7f080a87: 0x7f080a60;
                   }else {
                      shareEditorT1 = -1;
                   }
                   if (shareEditorT1 < 0) {
                      continue ;
                   }else {
                      Drawable uDrawable = a1.f(shareEditorT1);
                      float f = this.O.getTextSize() * 0x3f8ccccd;
                      uDrawable.setBounds(0, 0, (int)f, (int)f);
                      a.o(uDrawable, "icon");
                      int i = (this.L == null)? 255: 0;
                      uDrawable.setAlpha(i);
                      ShareEditorTextDisplayHandler$a uoa = new ShareEditorTextDisplayHandler$a(uDrawable);
                      a.o(integer1, "start");
                      int i1 = integer1.intValue() + 1;
                      p0.setSpan(uoa, integer1.intValue(), i1, 17);
                      str = uEntity.d();
                      a.o(str, "it.value");
                      this.J.put(str, uoa);
                   }
                }
             }
          }
       }
       return;
    }
    public final void t(String p0,int p1){
       ShareEditorTextDisplayHandler shareEditorT = ShareEditorTextDisplayHandler.class;
       if (PatchProxy.isSupport(shareEditorT) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, shareEditorT, "6")) {
          return;
       }
       a.p(p0, "keyWord");
       this.I.put(p0, Integer.valueOf(p1));
       return;
    }
    public final EmojiEditText u(){
       return this.O;
    }
    public final String v(){
       SpannableStringBuilder obj = PatchProxy.apply(null, this, ShareEditorTextDisplayHandler.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Editable text = this.O.getText();
       if (text == null) {
          return "";
       }
       obj = new SpannableStringBuilder(text);
       this.H.b(obj);
       String str = obj.toString();
       a.o(str, "SpannableStringBuilder\(e¡­Text\)\n        .toString\(\)");
       return str;
    }
    public final boolean w(){
       return this.L;
    }
    public final void x(String p0){
       ShareEditorTextDisplayHandler shareEditorT;
       CharSequence uCharSequenc = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, uCharSequenc, ShareEditorTextDisplayHandler.class, "3")) {
          return;
       }
       a.p(obj, "author");
       InputFilter[] filters = uCharSequenc.O.getFilters();
       String str = "editor.filters";
       a.o(filters, str);
       int len = filters.length;
       int i = 0;
       while (true) {
          int i1 = 1;
          if (i < len) {
             if (a.g(filters[i], uCharSequenc.M)) {
                shareEditorT = null;
             label_0035 :
                if (shareEditorT) {
                   shareEditorT = uCharSequenc.O;
                   InputFilter[] filters1 = shareEditorT.getFilters();
                   a.o(filters1, str);
                   shareEditorT.setFilters(n.T2(filters1, uCharSequenc.M));
                }
                uCharSequenc.O.l(uCharSequenc.N);
                uCharSequenc.O.f(uCharSequenc.N);
                String str1 = a1.p(R.string.arg_RES_7f10479f);
                a.o(str1, "tagTemplate");
                Object[] objArray = new Object[i1];
                objArray[0] = "|${author}|";
                String str2 = String.format(str1, Arrays.copyOf(objArray, i1));
                a.o(str2, "java.lang.String.format\(this, *args\)");
                String[] stringArray = new String[]{"|"};
                List list = StringsKt__StringsKt.H4(str2, stringArray, false, 0, 6, null);
                SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                Iterator iterator = list.iterator();
                str = " ";
                while (iterator.hasNext()) {
                   SpannableStringBuilder obj1 = iterator.next();
                   if (a.g(obj1, "${author}")) {
                      spannableStr.append(TextProcessor$b.a(uCharSequenc.F, ">", 0, 0, 6, null));
                      SpannableStringBuilder spannableStr1 = spannableStr;
                      spannableStr1.append(str);
                      obj1 = spannableStr1;
                      obj1.append(TextProcessor$b.a(uCharSequenc.G, p0, 0, 0, 6, null));
                   }else {
                      String str3 = "#";
                      if (StringsKt__StringsKt.O2(obj1, str3, 0, 2, null)) {
                         int i2 = 0;
                         spannableStr.append(TextProcessor$b.a(uCharSequenc.G, u.g2(obj1, "#", str3+TextProcessor$b.a(uCharSequenc.D, " ", i2, 0, 6, null), i2, 4, null), 0, 0, 6, null));
                         continue ;
                      }else {
                         spannableStr.append(obj1);
                         continue ;
                      }
                   }
                }
                spannableStr.append(str);
                uCharSequenc.K = TextProcessor$b.a(uCharSequenc.E, spannableStr, 0, 0, 6, null);
                shareEditorT = uCharSequenc.O;
                shareEditorT.setText(shareEditorT.getText());
                return;
             }else {
                i = i + 1;
             }
          }else {
             shareEditorT = 1;
             goto label_0035 ;
          }
       }
    }
}
