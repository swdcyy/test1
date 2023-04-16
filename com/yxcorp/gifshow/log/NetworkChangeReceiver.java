package com.yxcorp.gifshow.log.NetworkChangeReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.d2;
import java.lang.Runnable;
import t45.c;

public class NetworkChangeReceiver extends BroadcastReceiver	// class@0011d6
{
    public int a;
    public static final int b;

    public void NetworkChangeReceiver(){
       super();
    }
    public int a(){
       return this.a;
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkChangeReceiver.class, "1")) {
          return;
       }
       c.a(new d2(this, p0));
       return;
    }
}
