package com.yxcorp.gifshow.push.badge.impl.d$a$a;
import android.content.AsyncQueryHandler;
import android.content.Context;
import com.yxcorp.gifshow.push.badge.impl.BaseBadger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.ContentResolver;
import android.os.Looper;
import android.os.Handler;
import com.yxcorp.gifshow.push.badge.impl.d$a$a$a;

public final class d$a$a extends AsyncQueryHandler	// class@00163a
{
    public final Context a;
    public final BaseBadger b;

    public void d$a$a(Context p0,BaseBadger p1){
       a.p(p0, "context");
       a.p(p1, "badger");
       Context applicationC = p0.getApplicationContext();
       a.o(applicationC, "context.applicationContext");
       super(applicationC.getContentResolver());
       this.a = p0;
       this.b = p1;
    }
    public Handler createHandler(Looper p0){
       return new d$a$a$a(this, p0, p0);
    }
}
