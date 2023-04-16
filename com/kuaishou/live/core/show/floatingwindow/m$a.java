package com.kuaishou.live.core.show.floatingwindow.m$a;
import android.os.Handler;
import com.kuaishou.live.core.show.floatingwindow.m;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;

public class m$a extends Handler	// class@000b8b
{
    public final m a;

    public void m$a(m p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.FLOATING_WINDOW, "close because of jump out of app");
       this.a.a(LiveFloatingWindowCloseType.ENTER_OTHER_PAGE_TEMP_CLOSE, true);
       return;
    }
}
