package fq1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import w51.a;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.lang.Number;
import com.kwai.framework.abtest.f;
import com.google.gson.JsonElement;
import com.google.gson.c;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import java.lang.Throwable;

public final class b	// class@002380
{
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;

    public static final boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, b.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "123");
       b = false;
       boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): l.c("enableAudienceOldMultiChat", b);
       if (b1) {
          return true;
       }else if(b.b == null){
          obj = "disableAudienceNewMultiChat";
          b.b = Boolean.valueOf(a.t().u("SOURCE_LIVE").d(obj, b));
          b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveMultiChatSwitch", obj, b.b);
       }
       Boolean b2 = b.b;
       Objects.requireNonNull(b2, "null cannot be cast to non-null type kotlin.Boolean");
       return b2.booleanValue();
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("disableEditChatLabel", false);
    }
    public static final boolean c(){
       Boolean obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.c == null) {
          b.c = Boolean.valueOf(a.t().u("SOURCE_LIVE").d("disableLiteAudienceNewMultiChat", false));
          b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveMultiChatSwitch", "disableLiteAudienceNewMultiChat", b.c);
       }
       obj = b.c;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
       return obj.booleanValue();
    }
    public static final boolean d(){
       Boolean a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "124");
       String str = null;
       int i = (obj != patchProxyRe)? obj.intValue(): l.e("enableAnchorNewMultiChat", str);
       if (b.a == null) {
          if (!i) {
             b.a = Boolean.valueOf(f.a("enableAnchorNewMultiChat"));
             b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveMultiChatSwitch", "enableAnchorNewMultiChat", b.a);
          }else if(i == 1){
             str = true;
          }
          b.a = Boolean.valueOf(str);
       }
       a = b.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.Boolean");
       return a.booleanValue();
    }
    public static final boolean e(String p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (b.a()) {
          return b;
       }
       try{
          b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveMultiChatSwitch AudienceExtraInfo", "extraInfo", p0);
          JsonElement jsonElement = c.d(p0);
          a.o(jsonElement, "JsonParser.parseString\(extraInfo\)");
          jsonElement = jsonElement.r().e0("enableUpdateLayoutTheme");
          a.o(jsonElement, "jsonObject[\"enableUpdateLayoutTheme\"]");
          b = jsonElement.d();
       }catch(java.lang.Exception e4){
          b.I(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveMultiChatSwitch AudienceExtraInfoParseError", e4);
       }
       return b;
    }
}
