package com.yxcorp.gifshow.activity.c;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import android.util.Pair;
import java.lang.Boolean;

public final class c implements Callable	// class@00133f
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object call(){
       return new Pair(Boolean.valueOf(a.t().d("activityEntranceGq-kuaishou", false)), Boolean.valueOf(a.t().d("activityEntranceGq", false)));
    }
}
