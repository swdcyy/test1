package com.kuaishou.live.longconnection.connector.l$c;
import java.lang.String;
import java.lang.Object;
import java.net.URL;
import java.lang.StringBuilder;
import java.net.MalformedURLException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public class l$c	// class@000c76
{
    public String a;
    public String b;
    public URL c;

    public void l$c(String p0,String p1){
       super();
       this.a = p0;
       try{
          this.b = p1;
          this.c = new URL("http://"+this.a);
       }catch(java.net.MalformedURLException e2){
          e2.printStackTrace();
       }
       return;
    }
    public String a(){
       l$c obj = PatchProxy.apply(null, this, l$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       String str = (obj == null)? "": obj.getHost();
       return str;
    }
    public int b(){
       l$c obj = PatchProxy.apply(null, this, l$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       int i = (obj == null)? -1: obj.getPort();
       return i;
    }
    public String c(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof l$c && (this.a).equals(p0.a))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ("ServerUriInfo{"+"mServerUri=\'"+this.a+'''+", mExtra=\'"+this.b+'''+", mURL="+this.c+'}').substring(0);
    }
}
