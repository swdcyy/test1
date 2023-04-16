package com.yxcorp.gifshow.prettify.makeup.k;
import l16.b;
import com.yxcorp.gifshow.prettify.makeup.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class k implements b	// class@00118a
{
    public final int a;
    public final l b;

    public void k(l p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.b.j1(this.a);
       return;
    }
    public void onError(){
    }
    public void onProgress(float p0){
    }
}
