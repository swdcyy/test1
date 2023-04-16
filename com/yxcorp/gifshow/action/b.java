package com.yxcorp.gifshow.action.b;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.yxcorp.gifshow.action.startup.FeedRealActionsBizConfig;
import f8c.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.yxcorp.gifshow.action.c;
import yv8.b;
import java.lang.Boolean;

public final class b implements Callable	// class@001310
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object call(){
       FeedRealActionsBizConfig uFeedRealAct = FeedRealActionsBizConfig.class;
       String str = a.a.getString("feedRealActionBizConfig", "null");
       uFeedRealAct = (str == null || str == "")? null: b.a(str, uFeedRealAct);
       c.a = uFeedRealAct;
       if (uFeedRealAct != null) {
          b.c("RealActionHelper", "updateFeedRealActionBizConfig", "config", "v2");
       }else {
          b.c("RealActionHelper", "updateFeedRealActionBizConfig", "config", "v1");
       }
       return Boolean.TRUE;
    }
}
