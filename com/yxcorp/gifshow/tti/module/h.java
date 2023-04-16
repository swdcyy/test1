package com.yxcorp.gifshow.tti.module.h;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.tti.module.RefreshEncodeConfigInitModule;
import com.kwai.feature.post.api.encode.d;
import o56.c;
import o56.a;
import android.app.Application;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import android.content.Context;

public final class h implements Runnable	// class@001dda
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void run(){
       d.a().b(a.a().a(), false, RequestTiming.ON_HOME_PAGE_CREATED);
    }
}
