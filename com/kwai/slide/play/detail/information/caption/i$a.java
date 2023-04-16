package com.kwai.slide.play.detail.information.caption.i$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.slide.play.detail.information.caption.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import qp7.d;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import java.util.Objects;
import com.kwai.slide.play.detail.information.caption.l$b;
import kotlin.jvm.internal.a;

public class i$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0017da
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, i$a.class, str)) {
          return;
       }
       int i = n.k(this.b.k());
       i$a tb = this.b;
       if (i != tb.C && (tb.o != null && tb.q != null)) {
          SpannableStringBuilder spannableStr = new SpannableStringBuilder();
          spannableStr.append(this.b.q);
          i o = this.b.o;
          Objects.requireNonNull(o);
          if (!PatchProxy.applyVoidOneRefs(spannableStr, o, l$b.class, str)) {
             a.p(spannableStr, "<set-?>");
             o.a = spannableStr;
          }
          this.b.x();
          this.b.C = i;
       }
    label_0052 :
       return;
    }
}
