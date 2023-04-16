package com.kuaishou.live.core.show.divertpush.c$a;
import b72.a;
import com.kuaishou.live.core.show.divertpush.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.LinearLayout;

public class c$a implements a	// class@000af8
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       c obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.W;
       if (obj != null) {
          return obj.isShown();
       }
       return false;
    }
    public long b(){
       return 5000;
    }
}
