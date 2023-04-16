package com.yxcorp.gifshow.activity.share.util.TextProcessor$e;
import com.yxcorp.gifshow.activity.share.util.TextProcessor$d;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.text.Spannable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

public class TextProcessor$e extends TextProcessor$d	// class@001492
{
    public final List g;
    public final a h;

    public void TextProcessor$e(a p0){
       a.p(p0, "factory");
       super();
       this.h = p0;
       this.g = new ArrayList();
    }
    public void d(Spannable p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TextProcessor$e.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TextProcessor$e.class, "1")) {
          return;
       }
       a.p(p0, "spannable");
       Object obj = CollectionsKt___CollectionsKt.F2(this.g, p3);
       if (obj == null) {
          obj = this.h.invoke();
          this.g.add(obj);
       }
       p0.setSpan(obj, p1, p2, 33);
       return;
    }
}
