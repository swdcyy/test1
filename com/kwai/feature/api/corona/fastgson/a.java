package com.kwai.feature.api.corona.fastgson.a;
import ok.x;
import java.lang.Object;
import com.kwai.feature.api.corona.fastgson.CoronaCollectionTypeAdapterFactory;
import java.lang.String;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;

public final class a implements x	// class@000dea
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       String str = "enableCoronaFastJson";
       int i = l.e(str, 0);
       if (i != 1) {
          uBoolean = (i != 2)? Boolean.valueOf(a.t().d(str, 0)): Boolean.FALSE;
       }else {
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
