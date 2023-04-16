package com.kuaishou.live.basic.textstyle.LiveSpannable;
import android.text.SpannableStringBuilder;
import java.lang.Object;
import android.text.style.ReplacementSpan;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.text.style.ImageSpan;
import y51.a;
import y51.d;
import y51.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import java.lang.Number;
import com.kuaishou.live.basic.textstyle.LiveSpannable$1;
import android.text.style.AbsoluteSizeSpan;
import y51.c;
import android.view.View$OnClickListener;
import rnc.i;
import java.lang.Boolean;

public class LiveSpannable	// class@000d07
{
    public final SpannableStringBuilder a;
    public boolean b;

    public void LiveSpannable(){
       super(null);
    }
    public void LiveSpannable(SpannableStringBuilder p0){
       super();
       this.b = true;
       if (p0 != null) {
       }else {
          p0 = new SpannableStringBuilder();
       }
       this.a = p0;
       return;
    }
    public LiveSpannable a(ReplacementSpan p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSpannable.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b("\x27\x02\x00");
       this.n(p0);
       return this;
    }
    public LiveSpannable b(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSpannable.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this;
       }
       this.a.append(p0);
       return this;
    }
    public LiveSpannable c(){
       Object obj = PatchProxy.apply(null, this, LiveSpannable.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b("  ");
       return this;
    }
    public LiveSpannable d(){
       Object obj = PatchProxy.apply(null, this, LiveSpannable.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b("   ");
       return this;
    }
    public LiveSpannable e(){
       Object obj = PatchProxy.apply(null, this, LiveSpannable.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b(" ");
       return this;
    }
    public LiveSpannable f(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveSpannable liveSpannabl = LiveSpannable.class;
       if (PatchProxy.isSupport(liveSpannabl)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveSpannabl, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (!p0) {
          return this;
       }else {
          Drawable uDrawable = a1.f(p0);
          liveSpannabl = PatchProxy.applyOneRefs(uDrawable, this, liveSpannabl, "7");
          if (liveSpannabl != patchProxyRe) {
          }else if(uDrawable == null){
             liveSpannabl = this;
          }else {
             liveSpannabl = this.h(new LiveSpannable$a(uDrawable));
          }
          return liveSpannabl;
       }
    }
    public LiveSpannable g(ImageSpan p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSpannable.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return this;
       }
       this.b("\x27\x02\x00");
       this.o(p0, (this.m() - 1), this.m());
       return this;
    }
    public LiveSpannable h(LiveSpannable$a p0){
       LiveSpannable$a obj = PatchProxy.applyOneRefs(p0, this, LiveSpannable.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.a != null) {
          this.b("\x27\x02\x00");
          a uoa = new a(p0.a, "\x27\x02\x00");
          obj = p0.b;
          if (obj > null) {
             LiveSpannable$a c = p0.c;
             if (c > null) {
                uoa.b(obj, c);
             label_003d :
                obj = p0.e;
                if (obj != null) {
                   uoa.f = obj;
                }
                obj = p0.d;
                if (obj != null) {
                   this.n(obj);
                }
                int i = this.m() - 1;
                int i1 = this.m();
                if (p0.f != null) {
                   d uod = new d(3.00f, 0, 3.00f, p0.f);
                   uod.a(1);
                   this.o(uod, i, i1);
                }
                this.o(uoa, i, i1);
             }
          }
          uoa.b(p0.a.getIntrinsicWidth(), p0.a.getIntrinsicHeight());
          goto label_003d ;
       }
       return this;
    }
    public LiveSpannable i(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSpannable.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0.k)) {
          return this;
       }
       this.b(p0.k);
       this.o(p0, this.m(), this.m());
       return this;
    }
    public LiveSpannable j(LiveSpannable$b p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSpannable.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null && !TextUtils.isEmpty(p0.a)) {
          this.b(p0.a);
          int i = this.m();
          d obj1 = PatchProxy.apply(null, p0, LiveSpannable$b.class, "3");
          int i1 = (obj1 != patchProxyRe)? obj1.intValue(): p0.a.length();
          i1 = i - i1;
          if (p0.b != null) {
             this.o(new LiveSpannable$1(this, p0.b, p0), i1, i);
          }
          if (p0.d != null) {
             obj1 = new d(3.00f, 0, 3.00f, p0.d);
             obj1.a(true);
             this.o(obj1, i1, i);
          }
          if (p0.c > null) {
             this.o(new AbsoluteSizeSpan(p0.c), i1, i);
          }
          if (p0.g != null) {
             this.o(new c(p0.g), i1, i);
          }
       }
    label_007c :
       return this;
    }
    public SpannableStringBuilder k(){
       Object obj = PatchProxy.apply(null, this, LiveSpannable.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b != null) {
          i.j(this.a);
       }
       return this.a;
    }
    public SpannableStringBuilder l(boolean p0){
       LiveSpannable liveSpannabl = LiveSpannable.class;
       if (PatchProxy.isSupport(liveSpannabl)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, liveSpannabl, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b = p0;
       return this.k();
    }
    public int m(){
       Object obj = PatchProxy.apply(null, this, LiveSpannable.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.length();
    }
    public LiveSpannable n(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSpannable.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.setSpan(p0, (this.m() - 1), this.m(), 33);
       return this;
    }
    public LiveSpannable o(Object p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveSpannable.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveSpannable.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a.setSpan(p0, p1, p2, 33);
       return this;
    }
}
