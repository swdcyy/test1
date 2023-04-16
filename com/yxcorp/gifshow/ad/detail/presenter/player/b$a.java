package com.yxcorp.gifshow.ad.detail.presenter.player.b$a;
import ub.a;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class b$a extends a	// class@001670
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$a.class, "1")) {
          return;
       }
       this.b.S8();
       return;
    }
}
