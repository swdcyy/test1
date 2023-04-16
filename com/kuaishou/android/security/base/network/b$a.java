package com.kuaishou.android.security.base.network.b$a;
import java.lang.Runnable;
import com.kuaishou.android.security.base.network.b;
import com.kuaishou.android.security.base.network.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.base.network.e;
import org.json.JSONException;

public class b$a implements Runnable	// class@000eeb
{
    public final f a;
    public final b b;

    public void b$a(b p0,f p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       e uoe;
       String str1;
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       if (ta != null && ta.a() == 200) {
          String str = this.a.b();
          try{
             d.a(str);
             b.a(this.b).a(this.a.b());
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
          }
       }else if(this.a == null){
          uoe = b.a(this.b);
          str1 = "response is null";
       }else {
          uoe = b.a(this.b);
          int i = this.a.a();
          str1 = this.a.b();
       }
       uoe.onFailed(-1, str1);
    }
}
