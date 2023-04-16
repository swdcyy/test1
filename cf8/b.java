package cf8.b;
import java.lang.Object;
import android.content.Context;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.net.Uri;

public final class b	// class@000402
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(Context p0,StringBuilder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       try{
          p0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p1)));
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
