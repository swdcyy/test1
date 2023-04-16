package com.tachikoma.core.component.text.richtext.b;
import oo8.b;
import com.tachikoma.core.component.text.richtext.RichTextHelper$a;
import com.tachikoma.core.component.text.TKText;
import android.text.SpannableString;
import ip8.d;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iq8.n;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.Context;
import com.tachikoma.core.component.TKBaseNativeModule;
import android.content.res.Resources;
import ip8.c;
import ip8.a;
import com.tachikoma.core.component.text.richtext.RichTextHelper;
import hp8.a;

public final class b implements b	// class@000da5
{
    public final RichTextHelper$a a;
    public final TKText b;
    public final SpannableString c;
    public final int d;
    public final int e;
    public final d f;

    public void b(RichTextHelper$a p0,TKText p1,SpannableString p2,int p3,int p4,d p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void a(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       RichTextHelper$a j = this.a.j;
       int i = (j > null)? n.b(j): p0.getIntrinsicWidth();
       RichTextHelper$a k = this.a.k;
       int i1 = (k > null)? n.b(k): p0.getIntrinsicHeight();
       int i2 = i1;
       int i3 = n.a((this.a.n * 2.00f));
       p0.setBounds(0, 0, i, i2);
       if (this.a.n - null) {
          int i4 = (i3 > 0)? i3: - i3;
          int i5 = i2 + i4;
          BitmapDrawable uBitmapDrawa = new BitmapDrawable(this.b.getContext().getResources(), Bitmap.createBitmap(i, i5, Bitmap$Config.ARGB_8888));
          c uoc = (i3 > 0)? new c(uBitmapDrawa, p0, i, i5, 0, 0): new c(uBitmapDrawa, p0, i, i5, 0, i4);
          c uoc1 = v10;
       }
       a uoa = new a(p0, "");
       uoa.i = (float)n.a(RichTextHelper.b);
       i2 = (i3 > 0)? i2 + i3: i2 - i3;
       a uoa1 = uoa.b(i, i2);
       uoa1.c((float)n.a(this.a.m));
       uoa1.d((float)n.a(this.a.l));
       uoa1.e((float)i3);
       this.c.setSpan(uoa, this.d, this.e, 17);
       b tf = this.f;
       if (tf != null) {
          tf.a(this.c);
       }
       return;
    }
}
