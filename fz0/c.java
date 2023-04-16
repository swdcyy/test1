package fz0.c;
import ok.x;
import fz0.k;
import java.lang.Object;
import fz0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import iw1.a;
import lp3.c;
import lp3.e;
import com.kuaishou.live.common.core.component.pk.audience.LiveAudiencePKState;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Number;
import w91.a;
import java.util.Map;
import ug1.v0;

public final class c implements x	// class@0023de
{
    public final k b;

    public void c(k p0){
       this.b = p0;
    }
    public final Object get(){
       k m = this.b.M;
       JsonObject jsonObject = PatchProxy.applyOneRefs(m, null, a.class, "1");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          a uoa = m.a(a.class);
          JsonObject jsonObject1 = new JsonObject();
          String str = uoa.m();
          if (uoa.zh() == LiveAudiencePKState.PLAYING) {
             jsonObject1.c0("pk_id", TextUtils.k(str));
             jsonObject1.a0("pk_type", Integer.valueOf(1));
          }else if(uoa.zh() == LiveAudiencePKState.PRE_PUNISH || uoa.zh() == LiveAudiencePKState.PUNISH){
             jsonObject1.c0("pk_id", TextUtils.k(str));
             jsonObject1.a0("pk_type", Integer.valueOf(2));
          }
          m.a(a.class).d6().a(jsonObject1, m.a(a.class).d6());
          jsonObject = jsonObject1;
       }
       return jsonObject;
    }
}
