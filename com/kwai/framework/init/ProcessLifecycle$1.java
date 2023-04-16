package com.kwai.framework.init.ProcessLifecycle$1;
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

public class ProcessLifecycle$1 extends BroadcastReceiver	// class@001567
{

    public void ProcessLifecycle$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProcessLifecycle$1.class, "1")) {
          return;
       }
       Iterator iterator = e.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       return;
    }
}
