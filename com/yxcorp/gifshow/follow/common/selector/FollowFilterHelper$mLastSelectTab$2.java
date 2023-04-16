package com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper$mLastSelectTab$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kha.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;

public final class FollowFilterHelper$mLastSelectTab$2 extends Lambda implements a	// class@001086
{
    public static final FollowFilterHelper$mLastSelectTab$2 INSTANCE;

    static {
       FollowFilterHelper$mLastSelectTab$2.INSTANCE = new FollowFilterHelper$mLastSelectTab$2();
    }
    public void FollowFilterHelper$mLastSelectTab$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, FollowFilterHelper$mLastSelectTab$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.getString(b.d("user")+"follow_sizer_select_tab_name", "");
    }
}
