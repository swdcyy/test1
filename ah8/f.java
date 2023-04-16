package ah8.f;
import java.lang.Runnable;
import com.mini.plcmanager.live.a;
import java.lang.ref.WeakReference;
import com.mini.plcmanager.PlcModel;
import java.lang.Object;
import hh8.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n88.b;
import yg8.s;
import zh8.g;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import com.mini.plcmanager.PlcMiniManagerImpl;
import android.os.Bundle;
import android.os.Parcelable;
import w78.b;
import com.mini.channel.b;
import ah8.j;
import w78.c;
import gh8.a;

public final class f implements Runnable	// class@00009a
{
    public final a b;
    public final WeakReference c;
    public final PlcModel d;

    public void f(a p0,WeakReference p1,PlcModel p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       tb.c.destroy();
       if (PatchProxy.applyVoidTwoRefs(tc, td, tb, a.class, "9")) {
       }else if(tc == null){
          td.g = tb.f.i0().M5().m;
          td.f = tb.f.i0().M5().n;
          td.h = tb.f.i0().M5().d;
          td.i = PlcMiniManagerImpl.i;
          td.k = tb.e;
          td.l = s.b(tb.f);
          td.j = -1;
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("key_channel_param", td);
          tb.f.i().getChannel().g("key_channel_live_dialog_intent_request", "key_channel_live_dialog_intent_result", uBundle, new j(tb, tc));
       }
       tb.d.a(false, td.c, true, false, td.d);
       return;
    }
}
