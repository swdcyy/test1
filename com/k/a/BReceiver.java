package com.k.a.BReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.k.a.BSProvider;
import java.util.concurrent.atomic.AtomicBoolean;
import com.k.a.BSProvider$a;
import gx7.k;
import dx7.f;
import com.k.a.BReceiver$a;
import java.lang.Runnable;
import f97.d;

public class BReceiver extends BroadcastReceiver	// class@0006ea
{

    public void BReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       a.p(p0, "context");
       a.p(p1, "intent");
       k.a.j();
       f.d.d();
       d.b(new BReceiver$a(this, p0, p1, BSProvider.d.a().getAndSet(false)));
    }
}
