package com.yxcorp.gifshow.featured.feedprefetcher.config.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class a implements x	// class@000fb3
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("disableSaveCacheSizeToLocal", false));
    }
}
