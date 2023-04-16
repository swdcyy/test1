package com.yxcorp.gifshow.profile.presenter.profile.a0$a;
import com.yxcorp.gifshow.profile.presenter.profile.a0$c;
import com.yxcorp.gifshow.profile.presenter.profile.a0;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import hc.a;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class a0$a implements a0$c	// class@00147c
{
    public final a0 a;

    public void a0$a(a0 p0){
       this.a = p0;
       super();
    }
    public void a(Animatable p0){
       this.a.v = p0;
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a0$a.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}
