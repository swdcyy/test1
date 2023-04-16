package com.yxcorp.gifshow.activity.share.util.TextProcessor$d;
import com.yxcorp.gifshow.activity.share.util.TextProcessor;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$d$a;
import nsd.u;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.ArrayList;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.text.Editable;
import android.text.Spanned;
import android.text.SpannableStringBuilder;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Number;
import android.text.Spannable;
import kotlin.Pair;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$c;
import qrd.r0;

public abstract class TextProcessor$d implements TextProcessor	// class@001491
{
    public final int a;
    public final String b;
    public final String c;
    public final List d;
    public static int e;
    public static final TextProcessor$d$a f;

    static {
       TextProcessor$d.f = new TextProcessor$d$a(null);
       TextProcessor$d.e = 100;
    }
    public void TextProcessor$d(){
       super();
       Objects.requireNonNull(TextProcessor$d.f);
       if (TextProcessor$d.e > 999) {
          TextProcessor$d.e = 100;
       }
       int e = TextProcessor$d.e;
       TextProcessor$d.e = e + 1;
       this.a = e;
       this.b = " ["+e+'[';
       StringBuilder str = ']'+e;
       this.c = str+"] ";
       this.d = new ArrayList();
       return;
    }
    public CharSequence a(CharSequence p0,int p1,int p2){
       Editable uEditable;
       if (PatchProxy.isSupport(TextProcessor$d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TextProcessor$d.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "cs");
       if (p0 instanceof Editable) {
          uEditable = p0.insert(p2, this.c).insert(p1, this.b);
          a.o(uEditable, "cs.insert\(end, markR\).insert\(start, markL\)");
       }else if(p0 instanceof Spanned){
          p0 = this.a(new SpannableStringBuilder(p0), p1, p2);
       }else {
          uEditable = ((new StringBuilder(p0)).insert(p2, this.c)).insert(p1, this.b);
          a.o(uEditable, "StringBuilder\(cs\).insert¡­rkR\).insert\(start, markL\)");
       }
       return uEditable;
    }
    public void b(Editable p0){
       int i5;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextProcessor$d.class, "3")) {
          return;
       }
       a.p(p0, "editable");
       int i = - (this.c).length();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          i = i + i1;
          int i3 = i + (this.c).length();
          Integer integer = Integer.valueOf(StringsKt__StringsKt.i3(p0, this.b, i3, false, 4, null));
          int i4 = 1;
          if (integer.intValue() >= 0) {
             i5 = 1;
          label_003b :
             Integer integer1 = null;
             if (!i5) {
                integer = integer1;
             }
             if (integer != null) {
                i = integer.intValue();
                i5 = i1 + i;
                int i6 = i5 + (this.b).length();
                Integer integer2 = Integer.valueOf(StringsKt__StringsKt.i3(p0, this.c, i6, false, 4, null));
                if (integer2.intValue() < 0) {
                   i4 = 0;
                }
                if (i4) {
                   integer1 = integer2;
                }
                if (integer1 != null) {
                   i5 = integer1.intValue();
                   i4 = i2 + 1;
                   i3 = (this.b).length() + i;
                   int i7 = (this.c).length() + i5;
                   p0.delete(i5, i7);
                   p0.delete(i, i3);
                   i = i - i3;
                   i = i + this.e(p0, i3, i5, i2);
                   i2 = i5 - i7;
                   i = i + i2;
                   i1 = i1 + i;
                   i = i5;
                   i2 = i4;
                }
             }
             break ;
          }else {
             i5 = 0;
             goto label_003b ;
          }
       }
       return;
    }
    public void c(Spannable p0){
       int i4;
       Pair pair;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextProcessor$d.class, "5")) {
          return;
       }
       a.p(p0, "spannable");
       int i = - (this.c).length();
       int i1 = 0;
       while (true) {
          i = i + 0;
          int i2 = i + (this.c).length();
          Integer integer = Integer.valueOf(StringsKt__StringsKt.i3(p0, this.b, i2, false, 4, null));
          int i3 = 1;
          if (integer.intValue() >= 0) {
             i4 = 1;
          label_003a :
             Integer integer1 = null;
             if (!i4) {
                integer = integer1;
             }
             if (integer != null) {
                i = integer.intValue();
                i4 = 0 + i;
                int i5 = i4 + (this.b).length();
                Integer integer2 = Integer.valueOf(StringsKt__StringsKt.i3(p0, this.c, i5, false, 4, null));
                if (integer2.intValue() < 0) {
                   i3 = 0;
                }
                if (i3) {
                   integer1 = integer2;
                }
                if (integer1 != null) {
                   i4 = integer1.intValue();
                   i3 = i1 + 1;
                   i2 = (this.b).length() + i;
                   int i6 = (this.c).length() + i4;
                   if (PatchProxy.isSupport(TextProcessor$d.class)) {
                      pair = PatchProxy.applyOneRefs(Integer.valueOf(i1), this, TextProcessor$d.class, "1");
                      if (pair != PatchProxyResult.class) {
                      }else {
                      label_0095 :
                         pair = CollectionsKt___CollectionsKt.F2(this.d, i1);
                         if (pair == null) {
                            pair = r0.a(new TextProcessor$c(), new TextProcessor$c());
                            this.d.add(pair);
                         }
                      }
                   }else {
                      goto label_0095 ;
                   }
                   int i7 = 33;
                   p0.setSpan(pair.getFirst(), i, i2, i7);
                   this.d(p0, i2, i4, i1);
                   p0.setSpan(pair.getSecond(), i4, i6, i7);
                   i = i4;
                   i1 = i3;
                }
             }
             break ;
          }else {
             i4 = 0;
             goto label_003a ;
          }
       }
       return;
    }
    public void d(Spannable p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TextProcessor$d.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TextProcessor$d.class, "6")) {
          return;
       }
       a.p(p0, "spannable");
       return;
    }
    public int e(Editable p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TextProcessor$d.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TextProcessor$d.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "editable");
       return 0;
    }
}
