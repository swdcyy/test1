package com.yxcorp.login.bind.presenter.e0$a;
import java.util.concurrent.Callable;
import com.yxcorp.login.bind.presenter.e0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import z2d.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class e0$a implements Callable	// class@001a6c
{
    public final e0 b;

    public void e0$a(e0 p0){
       this.b = p0;
       super();
    }
    public Object call(){
       String str = PatchProxy.apply(null, this, e0$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          int i = 0x7f103bed;
          int i1 = i.d(a.b());
          if (i1 == 2) {
             i = 0x7f103bf6;
          }else if(i1 == 3){
             i = 0x7f103bf3;
          }
          str = this.b.getContext().getString(i);
       }
       return str;
    }
}
