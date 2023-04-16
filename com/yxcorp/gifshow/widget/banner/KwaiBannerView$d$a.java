package com.yxcorp.gifshow.widget.banner.KwaiBannerView$d$a;
import ub.a;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class KwaiBannerView$d$a extends a	// class@001940
{

    public void KwaiBannerView$d$a(){
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KwaiBannerView$d$a.class, "1")) {
       }else if(p2 != null){
          p2.start();
       }
       return;
    }
}
