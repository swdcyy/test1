package com.kuaishou.live.core.show.wishlist.i$a;
import com.kuaishou.live.core.show.wishlist.i$b;
import com.kuaishou.live.core.show.wishlist.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;

public class i$a implements i$b	// class@0012dc
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       i obj = PatchProxy.apply(null, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.v;
       boolean b = (obj != null && obj.getVisibility() != 8)? true: false;
       return b;
    }
}
