package com.heytap.mcssdk.b$1;
import java.lang.Runnable;
import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import java.lang.Object;
import java.util.List;
import com.heytap.mcssdk.d.c;
import java.util.Iterator;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.e.c;

public final class b$1 implements Runnable	// class@000523
{
    public final Context a;
    public final Intent b;
    public final IDataMessageCallBackService c;

    public void b$1(Context p0,Intent p1,IDataMessageCallBackService p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       List list = c.a(this.a, this.b);
       if (list == null) {
          return;
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          BaseMode uBaseMode = iterator.next();
          if (uBaseMode != null) {
             Iterator iterator1 = PushService.getInstance().getProcessors().iterator();
             while (iterator1.hasNext()) {
                c uoc = iterator1.next();
                if (uoc != null) {
                   uoc.a(this.a, uBaseMode, this.c);
                }else {
                   continue ;
                }
             }
          }
       }
       return;
    }
}
