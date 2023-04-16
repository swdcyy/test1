package com.yxcorp.gifshow.v3.z$a;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.v3.z;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import com.yxcorp.gifshow.model.RectInfo;

public final class z$a extends ViewOutlineProvider	// class@00167e
{
    public final z a;
    public final float b;

    public void z$a(z p0,float p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "outline");
       p1.setRoundRect(0, 0, (int)this.a.b.width(), (int)this.a.b.height(), (this.a.c.getRadiusOuter() * this.b));
       return;
    }
}
