package com.yxcorp.gifshow.activity.share.presenter.p1$b;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.activity.share.presenter.p1;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class p1$b extends ViewOutlineProvider	// class@001420
{
    public final float a;
    public final p1 b;

    public void p1$b(p1 p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p1$b.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), this.a);
       return;
    }
}
