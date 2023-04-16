package com.yxcorp.gifshow.activity.share.presenter.n$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.share.presenter.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class n$a implements Runnable	// class@001410
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
       this.b.P8();
       return;
    }
}
