package elb.h0;
import java.lang.Object;
import java.io.File;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import elb.h0$a;
import java.util.Collection;
import ekd.q;
import com.kwai.sdk.switchconfig.a;
import java.util.Iterator;
import com.yxcorp.gifshow.model.FileMd5Info;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.a0;
import org.json.JSONObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public final class h0	// class@00274e
{

    public void h0(){
       super();
    }
    public static boolean a(File p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, h0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return h0.b(p0, p1, null);
    }
    public static boolean b(File p0,List p1,h0$a p2){
       FileMd5Info obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, h0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (q.f(p1)) {
          return b;
       }
       if (a.t().d("disableResourceMd5Check", false)) {
          return b;
       }
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return b;
          }
          obj = iterator.next();
          if (!TextUtils.x(obj.mMd5)) {
             File uFile = new File(p0, obj.mFileName);
             obj = obj.mMd5;
             String str = a0.b(uFile);
             if (!TextUtils.n(obj, str)) {
                try{
                   String absolutePath = uFile.getAbsolutePath();
                   if (!PatchProxy.applyVoidOneRefs(absolutePath, null, h0.class, "3")) {
                      JSONObject jSONObject = new JSONObject();
                      jSONObject.put("matter_name", absolutePath);
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "MATTER_CHECK_FAIL";
                      uElementPack.params = jSONObject.toString();
                      h$b uob = h$b.e(8, "MATTER_CHECK_FAIL");
                      uob.k(uElementPack);
                      u1.p0(null, null, uob);
                   }
                }catch(org.json.JSONException e0){
                }
                if (p2 != null) {
                   p2.a(uFile.getAbsolutePath(), obj, str);
                   break ;
                }
                break ;
             }
          }
       }
       return false;
    }
}
