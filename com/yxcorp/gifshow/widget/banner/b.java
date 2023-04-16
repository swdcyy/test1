package com.yxcorp.gifshow.widget.banner.b;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$b;
import com.yxcorp.gifshow.widget.banner.DotsIndicator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b implements DotsIndicator$b	// class@001956
{
    public final DotsIndicator a;

    public void b(DotsIndicator p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.a.d();
       return;
    }
}
