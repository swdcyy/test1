package com.yxcorp.plugin.search.utils.j0$d;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j0$d extends ViewOutlineProvider	// class@0007a7
{
    public final int a;

    public void j0$d(int p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j0$d.class, "1")) {
          return;
       }
       p1.setRoundRect(0, (- this.a), p0.getWidth(), p0.getHeight(), (float)this.a);
       return;
    }
}
