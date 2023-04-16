package w75.a;
import java.lang.Runnable;
import android.content.Intent;
import java.lang.Object;
import com.kwai.chat.kwailink.net.NetworkChangeReceiver;
import java.lang.String;
import com.kwai.chat.kwailink.base.b;
import m75.h;
import com.kwai.chat.kwailink.service.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.adapter.KlinkAdapter;
import com.kwai.link.Klink;

public final class a implements Runnable	// class@002720
{
    public final Intent b;

    public void a(Intent p0){
       this.b = p0;
    }
    public final void run(){
       if (!("android.net.conn.CONNECTIVITY_CHANGE").equals(this.b.getAction())) {
       }else if(b.h()){
          h.f();
       }
       if (b.i()) {
          a uoa = a.N1();
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(null, uoa, a.class, "31")) {
             a.e("KwaiLinkServiceBinder", "notifyNetworkChanged");
             KlinkAdapter klinkAdapter = uoa.M1();
             Objects.requireNonNull(klinkAdapter);
             if (!PatchProxy.applyVoid(null, klinkAdapter, KlinkAdapter.class, "13")) {
                klinkAdapter.b.notifyNetworkChanged();
             }
          }
       }
    label_0051 :
       return;
    }
}
