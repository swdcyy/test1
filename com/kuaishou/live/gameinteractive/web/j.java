package com.kuaishou.live.gameinteractive.web.j;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a$k;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n43.b;
import pp.a;
import q87.c;
import v43.c;
import com.kuaishou.live.gameinteractive.web.a;

public class j implements g	// class@001c15
{
    public final int b;
    public final Gift c;
    public final a$k d;

    public void j(a$k p0,int p1,Gift p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else if(p0 != null && p0.a() != null){
          Object[] objArray = new Object[0];
          a.C().s("GameInteractiveCommonBridgeImpl", "real start send gift after fetching token", objArray);
          j td = this.d;
          td.d.W8(this.b, p0.a().token, this.c, td.c);
       }
       return;
    }
}
