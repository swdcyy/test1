package com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText$b;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.graphics.drawable.Drawable;

public final class CommonDrawerEditText$b extends ShapeDrawable	// class@00150b
{
    public final int a;
    public final int b;

    public void CommonDrawerEditText$b(int p0,int p1,int p2,int p3){
       super();
       this.a = p1;
       this.b = p3;
       this.setDither(false);
       Paint paint = this.getPaint();
       a.o(paint, "paint");
       paint.setColor(p0);
       if (p2 > 0) {
          this.setIntrinsicWidth(p2);
       }
       return;
    }
    public void setBounds(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CommonDrawerEditText$b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CommonDrawerEditText$b.class, "1")) {
          return;
       }
       CommonDrawerEditText$b tb = this.b;
       p1 = p1 + tb;
       CommonDrawerEditText$b ta = this.a;
       int i = (ta > null)? ta + p1: p3 + tb;
       super.setBounds(p0, p1, p2, i);
       return;
    }
}
