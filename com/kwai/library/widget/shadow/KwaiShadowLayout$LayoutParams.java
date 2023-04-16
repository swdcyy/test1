package com.kwai.library.widget.shadow.KwaiShadowLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.library.widget.shadow.KwaiShadowLayout$LayoutParams$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;

public final class KwaiShadowLayout$LayoutParams extends ViewGroup$MarginLayoutParams	// class@0009f8
{
    public int a;
    public static final KwaiShadowLayout$LayoutParams$a b;

    static {
       KwaiShadowLayout$LayoutParams.b = new KwaiShadowLayout$LayoutParams$a(null);
    }
    public void KwaiShadowLayout$LayoutParams(Context p0,AttributeSet p1){
       a.p(p0, "c");
       super(p0, p1);
       this.a = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.h2);
       a.o(typedArray, "c.obtainStyledAttributes¡­KwaiShadowLayout_gravity\)");
       this.a = typedArray.getInt(0, -1);
       typedArray.recycle();
    }
    public void KwaiShadowLayout$LayoutParams(ViewGroup$LayoutParams p0){
       a.p(p0, "source");
       super(p0);
       this.a = -1;
    }
}
