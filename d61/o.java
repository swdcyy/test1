package d61.o;
import java.lang.String;
import java.util.regex.Pattern;
import java.lang.Object;
import lnc.i3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o56.c;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import k2b.u1;

public class o	// class@001f3b
{
    public static final String a = "type";
    public static final Pattern b;

    static {
       o.b = Pattern.compile("ks://live/\(\\d*\)/\([^/]*\)/.*");
    }
    public void o(){
       super();
    }
    public static i3 a(String p0,String p1,String p2,int p3){
       i3 obj;
       if (PatchProxy.isSupport(o.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, o.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("liveStreamId", p0);
       obj.d("followId", p1);
       obj.d("followReferer", p2);
       obj.c("followSource", Integer.valueOf(p3));
       return obj;
    }
    public static void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, o.class, "12")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_FLOW_DIVERSION, p0);
       if (a.a().c() && SystemUtil.J()) {
          i.d(R.style.arg_RES_7f110668, p0);
       }
       return;
    }
    public static void c(String p0,int p1,int p2,String p3){
       Object[] objArray;
       String str2;
       long l;
       object oobject = p0;
       String str = p3;
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, o.class, "7")) {
          return;
       }
       int i = 5;
       int i1 = 4;
       int i2 = 2;
       int i3 = 1;
       String str1 = "投放工具场景";
       int i4 = 0;
       if (TextUtils.x(p0)) {
          objArray = new Object[]{str1,"liveStreamId字段错误","liveStreamId",oobject,"liveStreamId","字符串"};
          str2 = String.format("[投资付费参数异常][%s][%s]：错误 %s=%s，预期格式为%s=%s，有疑问可联系wangzhibo03、fanrenyi", objArray);
          l = 1;
       }else if(TextUtils.x(p3)){
          objArray = new Object[]{str1,"extraMessage字段错误","extraMessage",str,"extraMessage","非空"};
          str2 = String.format("[投资付费参数异常][%s][%s]：错误 %s=%s，预期格式为%s=%s，有疑问可联系wangzhibo03、fanrenyi", objArray);
          l = 2;
       }else {
          str2 = "";
          l = 0;
       }
       if (l) {
          i3 oi3 = i3.f();
          i3 oi31 = i3.f();
          oi31.d("liveStreamId", oobject);
          oi31.c("type", Integer.valueOf(p1));
          oi31.c("bizType", Integer.valueOf(p2));
          oi31.d("extraMessage", str);
          oi3.c("code", Long.valueOf(l));
          oi3.d("param", oi31.e());
          oi3.d("action", "DATA_REPORT");
          oi3.d("errorMsg", str2);
          u1.R("LIVE_REVENUE_DELIVERY_DATA_REPORT", oi3.toString(), 3);
          o.b(oi3.toString());
       }
       return;
    }
}
