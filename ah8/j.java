package ah8.j;
import w78.c;
import com.mini.plcmanager.live.a;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Intent;
import android.app.Activity;
import zi8.c;

public class j implements c	// class@00009e
{
    public final WeakReference a;
    public final a b;

    public void j(a p0,WeakReference p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       if (p0 != null) {
          Bundle data = p0.getData();
          if (data != null) {
             Intent parcelable = data.getParcelable("key_channel_result");
             if (parcelable != null) {
                Activity uActivity = this.a.get();
                if (!c.b(uActivity)) {
                   return;
                }else {
                   uActivity.startActivity(parcelable);
                   this.b.e(1);
                }
             }
          }
       }
       return;
    }
}
