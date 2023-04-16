package com.yxcorp.gifshow.follow.stagger.selector.presenter.i$a;
import fr6.e;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.i;
import java.lang.Object;
import wq6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import mrd.a;

public class i$a implements e	// class@001247
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(h p0,float p1,int p2){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, i$a.class, "1")) {
          return;
       }
       this.a.A.onNext(Float.valueOf(p1));
       return;
    }
}
