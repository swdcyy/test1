package com.yxcorp.gifshow.corona.krn.view.CoronaConnerFrameLayout$a;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.corona.krn.view.CoronaConnerFrameLayout;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class CoronaConnerFrameLayout$a extends ViewOutlineProvider	// class@001287
{
    public final CoronaConnerFrameLayout a;

    public void CoronaConnerFrameLayout$a(CoronaConnerFrameLayout p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoronaConnerFrameLayout$a.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)this.a.b);
       return;
    }
}