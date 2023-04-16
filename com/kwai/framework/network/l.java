package com.kwai.framework.network.l;
import ok.x;
import java.lang.Object;
import ta6.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.SharedPreferences;

public final class l implements x	// class@000c41
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object get(){
       Object obj = PatchProxy.apply(null, null, p.class, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p.b().getBoolean("enableNewCommonParams", false);
       return Boolean.valueOf(b);
    }
}
