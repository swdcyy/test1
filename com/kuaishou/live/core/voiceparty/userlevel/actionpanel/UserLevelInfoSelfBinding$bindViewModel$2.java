package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$bindViewModel$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlin.Pair;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.Boolean;
import lnc.a1;

public final class UserLevelInfoSelfBinding$bindViewModel$2 extends Lambda implements l	// class@001a5c
{
    public static final UserLevelInfoSelfBinding$bindViewModel$2 INSTANCE;

    static {
       UserLevelInfoSelfBinding$bindViewModel$2.INSTANCE = new UserLevelInfoSelfBinding$bindViewModel$2();
    }
    public void UserLevelInfoSelfBinding$bindViewModel$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(Pair p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, UserLevelInfoSelfBinding$bindViewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "<name for destructuring parameter 0>");
       int i = p0.component1().intValue();
       if (!p0.component2().booleanValue()) {
          str = a1.p(R.string.arg_RES_7f10350f);
          a.o(str, "CommonUtil.string\(R.string.mic_seat_max_level_tip\)");
       }else if(i == -1){
          str = a1.p(R.string.arg_RES_7f10395c);
       }else {
          str = a1.r(R.string.arg_RES_7f103938, String.valueOf(i));
       }
       a.o(str, "if \(nextGainMinutes == -¡­nutes.toString\(\)\)\n      }");
       return str;
    }
}
