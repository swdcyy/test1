package com.yxcorp.plugin.search.utils.j0$b;
import ytd.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class j0$b implements b	// class@0007a5
{
    public final View b;

    public void j0$b(View p0){
       this.b = p0;
       super();
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, j0$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.canScrollHorizontally(-1) ^ 0x01);
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, j0$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.b.canScrollHorizontally(1) ^ 1);
    }
    public View getView(){
       return this.b;
    }
}
