package me9.a$b;
import com.kwai.bridge.context.AbsBridgeContext;
import me9.a;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a$b extends AbsBridgeContext	// class@002fdb
{
    public final a h;

    public void a$b(a p0){
       this.h = p0;
       super();
    }
    public String getBizId(){
       return "magicface";
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.d;
    }
}
