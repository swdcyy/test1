package com.yxcorp.gifshow.moment_downloader.lazyfragment.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.moment_downloader.lazyfragment.ReminderKrnMomentFragment;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.moment_downloader.model.MomentPublishPageConfig;
import java.lang.String;
import java.lang.reflect.Type;

public final class a implements x	// class@001fc2
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return a.t().getValue("momentPublishPageConfig", MomentPublishPageConfig.class, new MomentPublishPageConfig());
    }
}
