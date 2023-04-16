package com.yxcorp.gifshow.widget.adv.MultiPartColorView$a;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class MultiPartColorView$a implements Cloneable	// class@00190d
{
    public int b;
    public int c;
    public int d;

    public void MultiPartColorView$a(int p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public MultiPartColorView$a a(){
       Object obj = PatchProxy.apply(null, this, MultiPartColorView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MultiPartColorView$a(this.b, this.c, this.d);
    }
    public Object clone(){
       return this.a();
    }
}
