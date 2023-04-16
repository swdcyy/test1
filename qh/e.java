package qh.e;
import wd5.f;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.UUID;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import k2b.u1;

public final class e implements f	// class@0029db
{
    public final String b;

    public void e(int p0){
       super();
       this.b = "bizId:"+p0+"_"+UUID.randomUUID().toString();
    }
    public String N8(){
       return this.b;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       Log.g("MilanoContainer", "pageSessionId="+this.b+": create factory");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       Log.g("MilanoContainer", "pageSessionId="+this.b+" Null QPhoto!");
       u1.Q("MilanoNullPhotoAttached", "pageSessionId="+this.b);
       return;
    }
}
