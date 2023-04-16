package ae5.a;
import erd.a;
import com.kwai.component.photo.detail.core.media.a;
import java.lang.Object;
import android.content.Intent;
import com.kwai.component.photo.detail.core.media.MediaButtonService;
import android.content.Context;
import java.lang.Class;
import ae5.b;
import android.content.ServiceConnection;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.String;
import java.lang.RuntimeException;
import k2b.u1;

public final class a implements a	// class@00007f
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       if (tb.e == null) {
       }else {
          Intent intent = new Intent(tb.a, MediaButtonService.class);
          b uob = new b(tb);
          try{
             tb.b = uob;
             tb.d = a.a(tb.a, intent, uob, 1);
          }catch(java.lang.RuntimeException e1){
             tb.d = false;
             u1.Q("MediaServiceHolder:bind", e1.toString());
          }
       }
    }
}
