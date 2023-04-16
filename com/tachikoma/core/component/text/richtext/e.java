package com.tachikoma.core.component.text.richtext.e;
import com.tachikoma.core.component.text.a$d;
import android.text.SpannableString;
import ip8.d;
import java.lang.Object;
import android.graphics.Typeface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.text.CustomTypefaceSpan;

public final class e implements a$d	// class@000da8
{
    public final SpannableString a;
    public final int b;
    public final int c;
    public final d d;

    public void e(SpannableString p0,int p1,int p2,d p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.a.setSpan(new CustomTypefaceSpan(null, p0), this.b, this.c, 17);
          e td = this.d;
          if (td != null) {
             td.a(this.a);
          }
       }
       return;
    }
}
