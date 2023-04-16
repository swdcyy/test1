package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$1$8$8;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import m6c.a;

public final class GrowthTestPage$inflate$1$8$8 extends Lambda implements a	// class@00153b
{
    public static final GrowthTestPage$inflate$1$8$8 INSTANCE;

    static {
       GrowthTestPage$inflate$1$8$8.INSTANCE = new GrowthTestPage$inflate$1$8$8();
    }
    public void GrowthTestPage$inflate$1$8$8(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestPage$inflate$1$8$8.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       JsonObject jsonObject1 = new JsonObject();
       jsonObject1.c0("id", "local1");
       jsonObject1.a0("startTime", Integer.valueOf(0x12c9db));
       jsonObject1.a0("endTime", Integer.valueOf(0xbbe223));
       JsonObject jsonObject2 = new JsonObject();
       jsonObject2.c0("id", "local2");
       jsonObject2.a0("startTime", Integer.valueOf(0x12c9db));
       jsonObject2.a0("endTime", Integer.valueOf(0xbbe223));
       jsonObject.G("calendarId1", jsonObject1);
       jsonObject.G("calendarId2", jsonObject2);
       String[] stringArray = new String[]{"calendarId3","calendarId4"};
       a.a.j(1, "X0V84bSbWWZrlZZ0702o4SFN68CALENDAR11b1w9yGwooANDROID_bf27d1bbd785ec0cgHUAWEI\(LIO-AN00\)", jsonObject, CollectionsKt__CollectionsKt.L(stringArray));
       return;
    }
}
