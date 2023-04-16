package com.kuaishou.live.lite.performance.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.lite.performance.a$a;

public class a	// class@000a43
{
    public boolean a;
    public final List b;
    public final Runnable c;
    public static final boolean d;

    static {
       a.d = a.t().u("SOURCE_LIVE").d("liveLiteViewPerformanceMonitor", false);
    }
    public void a(){
       super();
       this.a = false;
       this.b = new ArrayList();
       this.c = new a$a(this);
    }
}
