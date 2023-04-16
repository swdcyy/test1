package com.sina.weibo.sdk.a.c$2;
import com.sina.weibo.sdk.a.c$d;
import com.sina.weibo.sdk.a.c;
import java.lang.Object;
import android.os.Process;

public final class c$2 extends c$d	// class@000b90
{
    public final c Q;

    public void c$2(c p0){
       this.Q = p0;
       super(0);
    }
    public final Object call(){
       Process.setThreadPriority(this.Q.O);
       return this.Q.l();
    }
}
