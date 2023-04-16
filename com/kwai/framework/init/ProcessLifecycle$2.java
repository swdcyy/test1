package com.kwai.framework.init.ProcessLifecycle$2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a76.e;
import java.util.Iterator;
import java.util.List;
import java.lang.Runnable;

public class ProcessLifecycle$2 extends BroadcastReceiver	// class@001568
{

    public void ProcessLifecycle$2(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProcessLifecycle$2.class, "1")) {
          return;
       }
       Iterator iterator = e.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       return;
    }
}
