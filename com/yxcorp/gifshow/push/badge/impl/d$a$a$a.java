package com.yxcorp.gifshow.push.badge.impl.d$a$a$a;
import android.content.AsyncQueryHandler$WorkerHandler;
import com.yxcorp.gifshow.push.badge.impl.d$a$a;
import android.os.Looper;
import android.content.AsyncQueryHandler;
import android.os.Message;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import l6c.a;
import android.content.Context;
import com.yxcorp.gifshow.push.badge.a;
import java.lang.Throwable;

public final class d$a$a$a extends AsyncQueryHandler$WorkerHandler	// class@001639
{
    public final d$a$a a;
    public final Looper b;

    public void d$a$a$a(d$a$a p0,Looper p1,Looper p2){
       this.a = p0;
       this.b = p1;
       super(p0, p2);
    }
    public void handleMessage(Message p0){
       try{
          a.p(p0, "msg");
          super.handleMessage(p0);
       }catch(java.lang.Exception e4){
          a.d.b(this.a.a, this.a.b, e4);
       }
       return;
    }
}
