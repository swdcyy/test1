package com.kuaishou.growth.privacy.dialog.helper.q;
import java.lang.Thread;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import wkd.b;
import hu5.a;

public class q extends Thread	// class@00071f
{

    public void q(String p0){
       super(p0);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       Process.setThreadPriority(10);
       b.a(-553173080).a();
       return;
    }
}
