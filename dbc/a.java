package dbc.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.net.Uri$Builder;
import android.content.Context;
import cbc.a;
import xh7.b;
import qh7.b;
import qh7.a;

public class a	// class@00215b
{

    public void a(){
       super();
    }
    public static String a(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Uri$Builder uBuilder = new Uri$Builder().scheme("kwai").authority("krn").appendQueryParameter("bundleId", "SocialIntimateSquare").appendQueryParameter("componentName", "IntimateSquare").appendQueryParameter("source", "5");
       uBuilder.appendQueryParameter("ownerId", p0);
       Uri$Builder uBuilder1 = uBuilder;
       return uBuilder1.appendQueryParameter("currentRelation", String.valueOf(p1)).appendQueryParameter("themeStyle", "3").appendQueryParameter("enterType", "0").toString()+"&bgColor=%23000000";
    }
    public static String b(int p0){
       Uri$Builder obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Uri$Builder().scheme("kwai").authority("krn").appendQueryParameter("bundleId", "SocialIntimateInvitation").appendQueryParameter("componentName", "IntimateInvitation").appendQueryParameter("pushOrientation", "vertical").appendQueryParameter("themeStyle", "1");
       obj.appendQueryParameter("source", p0);
       Uri$Builder uBuilder = obj;
       return uBuilder.appendQueryParameter("bgColor", "%23000000").toString();
    }
    public static String c(String p0,int p1){
       Uri$Builder uBuilder;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(uoa)) {
          uBuilder = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "5");
          if (uBuilder != patchProxyRe) {
          label_0070 :
             return uBuilder.authority("krn").toString();
          }
       }
       Uri$Builder uBuilder1 = new Uri$Builder().scheme("kwai").appendQueryParameter("bundleId", "SocialIntimateList").appendQueryParameter("componentName", "IntimateList").appendQueryParameter("themeStyle", "1");
       uBuilder1.appendQueryParameter("ownerId", p0);
       Uri$Builder uBuilder2 = uBuilder1;
       uBuilder2 = uBuilder2.appendQueryParameter("currentRelation", String.valueOf(p1)).appendQueryParameter("useMotion", "1");
       uBuilder2.appendQueryParameter("title", "");
       uBuilder = uBuilder2;
       goto label_0070 ;
    }
    public static void d(Context p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "6")) {
          return;
       }
       String str = a.b(p1);
       a.a("scheme:"+str);
       a.b(b.j(p0, str), null);
       return;
    }
    public static void e(Context p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, a.class, "1")) {
          return;
       }
       Uri$Builder uBuilder = new Uri$Builder().scheme("kwai").authority("krn").appendQueryParameter("bundleId", "SocialIntimationshipINTView").appendQueryParameter("componentName", "IntimateRelationshipMain").appendQueryParameter("themeStyle", "1");
       uBuilder.appendQueryParameter("visitorId", p1);
       Uri$Builder uBuilder1 = uBuilder;
       uBuilder1 = uBuilder1.appendQueryParameter("relationType", String.valueOf(p2)).appendQueryParameter("source", String.valueOf(p3)).appendQueryParameter("title", "").toString();
       a.a("scheme:"+uBuilder1);
       b uob = b.j(p0, uBuilder1);
       a.b(uob, null);
       return;
    }
}
