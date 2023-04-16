package com.kwai.android.pushlog.PushLogger;
import java.util.LinkedHashMap;
import com.kwai.android.pushlog.PushLogger$actionEvent$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.android.pushlog.PushLogger$initEvent$2;
import com.kwai.android.pushlog.PushLogger$processNotificationEvent$2;
import com.kwai.android.pushlog.PushLogger$processCommandEvent$2;
import com.kwai.android.pushlog.PushLogger$tokenEvent$2;
import com.kwai.android.pushlog.PushLogger$internalEvent$2;
import java.lang.Object;
import p45.a;
import p45.c;
import p45.f;
import p45.d;
import p45.e;
import p45.g;
import java.util.Map;

public final class PushLogger	// class@0009cf
{
    public static final Map a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final PushLogger h;

    static {
       PushLogger.h = new PushLogger();
       PushLogger.a = new LinkedHashMap();
       PushLogger.b = s.c(PushLogger$actionEvent$2.INSTANCE);
       PushLogger.c = s.c(PushLogger$initEvent$2.INSTANCE);
       PushLogger.d = s.c(PushLogger$processNotificationEvent$2.INSTANCE);
       PushLogger.e = s.c(PushLogger$processCommandEvent$2.INSTANCE);
       PushLogger.f = s.c(PushLogger$tokenEvent$2.INSTANCE);
       PushLogger.g = s.c(PushLogger$internalEvent$2.INSTANCE);
    }
    public void PushLogger(){
       super();
    }
    public static final a a(){
       return PushLogger.b.getValue();
    }
    public static final c b(){
       return PushLogger.c.getValue();
    }
    public static final f c(){
       return PushLogger.g.getValue();
    }
    public static final d d(){
       return PushLogger.e.getValue();
    }
    public static final e e(){
       return PushLogger.d.getValue();
    }
    public static final g g(){
       return PushLogger.f.getValue();
    }
    public final Map f(){
       return PushLogger.a;
    }
}
