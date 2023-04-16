package com.vivo.push.d.m;
import java.lang.Runnable;
import com.vivo.push.d.l;
import com.vivo.push.b.m;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.b.s;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import com.vivo.push.sdk.PushMessageCallback;

public final class m implements Runnable	// class@00106c
{
    public final m a;
    public final l b;

    public void m(l p0,m p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       m tb = this.b;
       tb.b.onListTags(l.a(tb), this.a.h(), this.a.d(), this.a.g());
    }
}
