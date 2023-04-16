package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$bindViewModel$1;
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
import java.lang.StringBuilder;

public final class UserLevelInfoSelfBinding$bindViewModel$1 extends Lambda implements l	// class@001a5b
{
    public static final UserLevelInfoSelfBinding$bindViewModel$1 INSTANCE;

    static {
       UserLevelInfoSelfBinding$bindViewModel$1.INSTANCE = new UserLevelInfoSelfBinding$bindViewModel$1();
    }
    public void UserLevelInfoSelfBinding$bindViewModel$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(Pair p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserLevelInfoSelfBinding$bindViewModel$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "<name for destructuring parameter 0>");
       long l = p0.component1().longValue();
       boolean b = p0.component2().booleanValue();
       String str = (!l - -1 || !b)? "": '+'+l;
       return str;
    }
}
