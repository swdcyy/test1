package com.kwai.feature.api.feed.home.wrapper.kcube.util.e;
import ok.x;
import java.lang.Object;
import so5.a;
import xf6.d;
import java.lang.String;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import java.lang.Boolean;

public final class e implements x	// class@000f3a
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       Boolean uBoolean;
       int i = 0;
       int i1 = l.e("KEY_KCUBE_BOTTOM_ACTIONBAR_OPT", i);
       if (i1 != 1) {
          uBoolean = (i1 != 2)? Boolean.valueOf(a.t().d("enableNewBottomActionBarSkin", i)): Boolean.FALSE;
       }else {
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
