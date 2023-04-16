package com.yxcorp.gifshow.camerasdk.g;
import org.wysaid.nativePort.CGEEventLogger$ILogger;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.j;
import com.yxcorp.gifshow.util.PostUtils;
import qi9.q1;
import java.lang.StringBuilder;
import q87.c;

public final class g implements CGEEventLogger$ILogger	// class@001017
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final void report(String p0,String p1){
       PostUtils.x(p0, p1);
       Object[] objArray = new Object[0];
       q1.C().t("cge logger", p0+":"+p1, objArray);
    }
}
