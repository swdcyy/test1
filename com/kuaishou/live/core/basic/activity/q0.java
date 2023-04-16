package com.kuaishou.live.core.basic.activity.q0;
import com.kuaishou.live.core.basic.activity.o0;
import en8.a;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;
import com.kuaishou.live.core.basic.activity.q0$a;
import pp.c;
import com.kuaishou.android.live.log.b;

public class q0	// class@00184f
{
    public a a;
    public String b;
    public LinkedList c;
    public a d;
    public static final c e;

    static {
       q0.e = o0.b;
    }
    public void q0(a p0,String p1){
       super();
       this.c = new LinkedList();
       this.d = new q0$a(this);
       this.a = p0;
       this.b = p1;
       b.d0(q0.e, "LiveWillShowLoader init", "taskDispatcher", p0, "liveStreamId", p1);
    }
}
