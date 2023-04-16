package de9.a$a;
import com.yxcorp.gifshow.camera.record.base.b$a;
import de9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import elb.a;
import n4b.a;

public final class a$a implements b$a	// class@001f1c
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public Object getData(){
       a uoa = PatchProxy.apply(null, this, a$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = this.a.n.d;
       }
       return uoa;
    }
}
