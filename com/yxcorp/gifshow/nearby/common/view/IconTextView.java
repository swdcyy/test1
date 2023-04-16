package com.yxcorp.gifshow.nearby.common.view.IconTextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yxcorp.gifshow.nearby.common.view.IconTextView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class IconTextView extends AppCompatTextView	// class@002134
{
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public Drawable k;
    public static final IconTextView$a l;

    static {
       IconTextView.l = new IconTextView$a(null);
    }
    public void IconTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void IconTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void IconTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       if (PatchProxy.isSupport(IconTextView.class) && (!PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, IconTextView.class, "1") && p1 != null)) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.k1);
          a.o(typedArray, "context.obtainStyledAttr¡­R.styleable.IconTextView\)");
          this.f = typedArray.getDimension(5, 0);
          this.g = typedArray.getDimension(0, 0);
          this.h = typedArray.getDimension(2, 0);
          this.i = typedArray.getDimension(3, 0);
          this.k = typedArray.getDrawable(1);
          this.j = typedArray.getInt(4, 0);
          typedArray.recycle();
       }
       return;
    }
    public void IconTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, IconTextView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(null, this, IconTextView.class, "3")) {
          IconTextView tk = this.k;
          if (tk != null) {
             IconTextView th = this.h;
             int i = (int)th;
             tk.setBounds(i, 0, (int)(this.f + th), (int)this.g);
             if (this.j != 1) {
                this.setCompoundDrawables(tk, null, null, null);
             }else {
                this.setCompoundDrawables(null, null, tk, null);
             }
          }
       }
       return;
    }
}
