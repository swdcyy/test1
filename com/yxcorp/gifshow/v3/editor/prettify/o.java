package com.yxcorp.gifshow.v3.editor.prettify.o;
import android.os.MessageQueue$IdleHandler;
import java.lang.Object;
import rsc.c;
import faa.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.e;
import h16.n;
import ge9.c;

public final class o implements MessageQueue$IdleHandler	// class@00119c
{
    public static final o a;

    static {
       o.a = new o();
    }
    public void o(){
       super();
    }
    public final boolean queueIdle(){
       Object[] objArray = new Object[0];
       a.D().s("PrettifyEditor", "prefetch edit pretty", objArray);
       c.b(new e());
       return 0;
    }
}
