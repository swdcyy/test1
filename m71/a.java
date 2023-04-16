package m71.a;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import m71.a$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkStartPkInfo;
import java.lang.Boolean;
import java.util.List;
import o63.m;
import o63.m$a;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kuaishou.live.common.core.component.line.model.LiveMultiPkStartPkExtraInfo;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.model.LiveMultiPkCohesionInfo;
import java.lang.Exception;
import ps1.a;
import lp3.c;
import m71.b;
import zs1.g;
import csd.b;
import dsd.e;

public final class a extends AbstractLiveJsCommand	// class@003131
{

    public void a(){
       super();
    }
    public Class a(){
       return a$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       boolean b;
       LiveMultiPkStartPkInfo liveMultiPkS1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       LiveMultiPkStartPkExtraInfo liveMultiPkS = null;
       p1 = (!p0 instanceof a$a)? liveMultiPkS: p0;
       if (p1) {
          p0 = p0.b();
          Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "4");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             c uoc = 1;
             if (p0 == null || p0.getPlayType() != 3) {
                if (p0 != null) {
                   liveMultiPkS = p0.getTeams();
                }
                if (liveMultiPkS == null || (p0.getPlayType() != uoc && p0.getPlayType() != 2)) {
                   b = false;
                }
             }
          label_0054 :
             b = true;
          }
          if (!b) {
             return m.g.c("invalid params, isStartMultiPkParamsValid = false");
          }else {
             b = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
             if (!PatchProxy.applyVoidTwoRefs(p1, b, this, uoa, "2")) {
                if (PatchProxy.applyVoidOneRefs(p1, this, uoa, "3") || (p1.b() != null && !TextUtils.x(p1.a()))) {
                   try{
                      Object obj1 = a.a.h(p1.a(), LiveMultiPkStartPkExtraInfo.class);
                      a.o(obj1, "Gsons.KWAI_GSON.fromJson¡­tPkExtraInfo::class.java\)");
                      LiveMultiPkStartPkInfo liveMultiPkS2 = p1.b();
                      liveMultiPkS2.setReopenMultiPk(obj1.isReopenMultiPk());
                      liveMultiPkS2.setReopenMultiPkId(obj1.getReopenMultiPkId());
                      liveMultiPkS2.setCohesionInfo(obj1.getCohesionInfo());
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                }
             }
             b = b.b();
             if (b == b.h()) {
                e.c(p2);
             }
             return b;
          }
       }else {
          return m.g.c("invalid params");
       }
    }
}
