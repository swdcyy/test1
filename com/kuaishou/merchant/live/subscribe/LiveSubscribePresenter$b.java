package com.kuaishou.merchant.live.subscribe.LiveSubscribePresenter$b;
import erd.r;
import java.lang.Object;
import ja6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveSubscribePresenter$b implements r	// class@001ad5
{
    public static final LiveSubscribePresenter$b b;

    static {
       LiveSubscribePresenter$b.b = new LiveSubscribePresenter$b();
    }
    public void LiveSubscribePresenter$b(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSubscribePresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.b() && (!TextUtils.x(p0.a) && (TextUtils.n(p0.c, "FOLLOW") && TextUtils.n(p0.d, "PLC_FOLLOW_OUTSIDE")))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
