package com.kuaishou.live.preview.item.presenter.n$f;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.preview.item.presenter.n;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class n$f extends ViewOutlineProvider	// class@000e36
{
    public final int a;
    public final n b;

    public void n$f(n p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n$f.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)this.a);
       return;
    }
}
