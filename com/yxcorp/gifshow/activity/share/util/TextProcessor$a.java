package com.yxcorp.gifshow.activity.share.util.TextProcessor$a;
import com.yxcorp.gifshow.activity.share.util.TextProcessor;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.text.Editable;
import java.util.Iterator;
import java.lang.Iterable;
import android.text.Spannable;

public final class TextProcessor$a implements TextProcessor	// class@00148d
{
    public final List a;

    public void TextProcessor$a(TextProcessor[] p0){
       a.p(p0, "processors");
       super();
       this.a = CollectionsKt__CollectionsKt.P(Arrays.copyOf(p0, p0.length));
    }
    public CharSequence a(CharSequence p0,int p1,int p2){
       if (PatchProxy.isSupport(TextProcessor$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TextProcessor$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "cs");
       return p0;
    }
    public void b(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextProcessor$a.class, "3")) {
          return;
       }
       a.p(p0, "editable");
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(Spannable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextProcessor$a.class, "2")) {
          return;
       }
       a.p(p0, "spannable");
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
}
