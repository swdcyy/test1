package com.yxcorp.gifshow.ad.fill.AdNotShownCache;
import androidx.collection.LruCache;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache$Companion$INSTANCE$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;

public final class AdNotShownCache extends LruCache	// class@001772
{
    public static final p a;
    public static final long b;
    public static final AdNotShownCache$a c;

    static {
       AdNotShownCache.c = new AdNotShownCache$a(null);
       AdNotShownCache.a = s.b(LazyThreadSafetyMode.SYNCHRONIZED, AdNotShownCache$Companion$INSTANCE$2.INSTANCE);
       AdNotShownCache.b = a.t().b("unexposedAdExpiredMinutes", 0);
    }
    public void AdNotShownCache(){
       super(5);
    }
    public void AdNotShownCache(u p0){
       super(5);
    }
}
