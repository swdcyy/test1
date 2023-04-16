package com.kuaishou.live.core.show.liveslidesquare.a$a;
import xq5.a;
import com.kuaishou.live.core.show.liveslidesquare.a;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import qvb.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class a$a implements a	// class@000c90
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(List p0,int p1,String p2,int p3,int p4,q p5){
       a$a uoa = this;
       a$a uoa1 = a$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "1")) {
             return;
          }
       }
       uoa.a.P8(p0, p1, p2, p3, p4, null, null, null, p5);
       return;
    }
}
