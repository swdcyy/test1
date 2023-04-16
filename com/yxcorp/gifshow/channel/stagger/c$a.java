package com.yxcorp.gifshow.channel.stagger.c$a;
import pa5.n$c;
import y8c.f$b;
import com.yxcorp.gifshow.log.e;
import com.kwai.framework.model.channel.HotChannel;
import com.kwai.component.photo.reduce.f;
import ha5.e;
import pa5.a;
import com.yxcorp.gifshow.channel.stagger.b;
import com.yxcorp.gifshow.channel.stagger.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.channel.stagger.f;
import java.util.Map;

public class c$a extends n$c	// class@001064
{
    public o p;
    public final HotChannel q;

    public void c$a(f$b p0,e p1,HotChannel p2,f p3,e p4,a p5){
       super(p0, p1, p3, p4, p5);
       this.q = p2;
       this.j = new b(p5);
       this.p = a.a;
    }
    public String c(){
       return "HOT";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(c$a.class, new f());
       }else {
          obj.put(c$a.class, null);
       }
       return obj;
    }
}
