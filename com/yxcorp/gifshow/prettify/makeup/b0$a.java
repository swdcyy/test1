package com.yxcorp.gifshow.prettify.makeup.b0$a;
import l16.b;
import com.yxcorp.gifshow.prettify.makeup.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b0$a implements b	// class@001166
{
    public final int a;
    public final b0 b;

    public void b0$a(b0 p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, b0$a.class, "1")) {
          return;
       }
       b0$a tb = this.b;
       b0$a ta = this.a;
       if (tb.j == ta) {
          tb.t1(ta);
       }
       return;
    }
    public void onError(){
    }
    public void onProgress(float p0){
    }
}
