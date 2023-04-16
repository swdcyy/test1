package com.yxcorp.plugin.search.utils.j0$c;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j0$c extends ViewOutlineProvider	// class@0007a6
{
    public final int a;

    public void j0$c(int p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j0$c.class, "1")) {
          return;
       }
       j0$c ta = this.a;
       p1.setRoundRect(0, 0, p0.getWidth(), (p0.getHeight() + ta), (float)ta);
       return;
    }
}
