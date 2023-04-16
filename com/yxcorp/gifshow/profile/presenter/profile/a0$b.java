package com.yxcorp.gifshow.profile.presenter.profile.a0$b;
import ub.a;
import com.yxcorp.gifshow.profile.presenter.profile.a0$c;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;
import hc.a;

public final class a0$b extends a	// class@00147d
{
    public final a0$c b;

    public void a0$b(a0$c p0){
       super();
       this.b = p0;
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a0$b.class, "2")) {
          return;
       }
       this.b.onFailure(p0, p1);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a0$b.class, "1")) {
       }else if(!p2 instanceof a){
          this.b.a(p2);
       }
       return;
    }
}
