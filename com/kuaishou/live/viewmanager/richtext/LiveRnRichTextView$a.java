package com.kuaishou.live.viewmanager.richtext.LiveRnRichTextView$a;
import android.text.Spannable$Factory;
import java.lang.CharSequence;
import android.text.Spannable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveRnRichTextView$a extends Spannable$Factory	// class@000ff7
{

    public void LiveRnRichTextView$a(){
       super();
    }
    public Spannable newSpannable(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRnRichTextView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Spannable) {
          return p0;
       }
       Spannable spannable = super.newSpannable(p0);
       a.o(spannable, "super.newSpannable\(source\)");
       return spannable;
    }
}
