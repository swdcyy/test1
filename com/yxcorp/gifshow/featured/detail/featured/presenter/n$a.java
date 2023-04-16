package com.yxcorp.gifshow.featured.detail.featured.presenter.n$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class n$a implements Runnable	// class@000f83
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, n$a.class, "1")) {
          return;
       }
       this.b.H.w1();
       this.b.H.P1(false);
       return;
    }
}
