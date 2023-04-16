package ch8.a;
import n88.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dh8.e;
import dh8.d;
import ch8.b;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import dh8.c;
import org.json.JSONException;
import zi8.u0;
import zh8.g;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import oi8.l;
import zi8.g1;

public class a	// class@00041e
{
    public final String a;
    public final b b;
    public c c;
    public int d;

    public void a(b p0,String p1){
       super();
       this.d = -1;
       this.a = p1;
       this.b = p0;
       this.a(p1);
    }
    public void a(b p0,String p1,int p2){
       super();
       this.d = -1;
       this.a = p1;
       this.b = p0;
       this.d = p2;
       this.a(p1);
    }
    public void a(b p0,boolean p1){
       super();
       this.d = -1;
       String str = (p1)? "PLC": "LIVE";
       this.a = str;
       this.b = p0;
       this.a(str);
       return;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       if (("PLC").equalsIgnoreCase(p0)) {
          this.c = new e();
       }else if(("LIVE").equalsIgnoreCase(p0)){
          this.c = new d();
       }
       return;
    }
    public void b(b p0){
       b a;
       int i;
       JSONObject jSONObject1;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       a tc = this.c;
       if (tc != null && this.b != null) {
          JSONObject jSONObject = PatchProxy.applyTwoRefs(p0, tc, this, uoa, "3");
          MiniAppInfo miniAppInfo = null;
          if (jSONObject != PatchProxyResult.class) {
          }else if(TextUtils.isEmpty(p0.a)){
             a = p0.a;
             Objects.requireNonNull(a);
             switch (a.hashCode()){
                 case 0x8bd883b0:
                   if (!a.equals("verify_data")) {
                   label_00a3 :
                      i = -1;
                   }else {
                      i = 0;
                   }
                   break;
                 case 0x9d457f55:
                   if (!a.equals("mini_list_page_exit")) {
                      goto label_00a3 ;
                   }else {
                      i = 1;
                   }
                   break;
                 case 0xbd997416:
                   if (!a.equals("mini_list_show")) {
                      goto label_00a3 ;
                   }else {
                      i = 2;
                   }
                   break;
                 case 0xed525a2e:
                   if (!a.equals("click_cancel_btn")) {
                      goto label_00a3 ;
                   }else {
                      i = 3;
                   }
                   break;
                 case 0xf19db2f5:
                   if (!a.equals("relate_end")) {
                      goto label_00a3 ;
                   }else {
                      i = 4;
                   }
                   break;
                 case 0x2141505e:
                   if (!a.equals("user_click_item")) {
                      goto label_00a3 ;
                   }else {
                      i = 5;
                   }
                   break;
                 case 0x5e6ece17:
                   if (!a.equals("js_cb_suc")) {
                      goto label_00a3 ;
                   }else {
                      i = 6;
                   }
                   break;
                 case 0x65aa6eff:
                   if (!a.equals("miniapp_open")) {
                      goto label_00a3 ;
                   }else {
                      i = 7;
                   }
                   break;
                 case 0x6e58f38d:
                   if (!a.equals("click_relate_btn")) {
                      goto label_00a3 ;
                   }else {
                      i = 8;
                   }
                   break;
                 default:
                   goto label_00a3 ;
             }
             switch (i){
                 case 0:
                   jSONObject1 = tc.a(p0);
                   break;
                 case 1:
                   jSONObject1 = tc.g(p0);
                   break;
                 case 2:
                   jSONObject1 = tc.b(p0);
                   break;
                 case 3:
                   jSONObject1 = tc.c(p0);
                   break;
                 case 4:
                   jSONObject1 = tc.d(p0);
                   break;
                 case 5:
                   jSONObject1 = tc.f(p0);
                   break;
                 case 6:
                   jSONObject1 = tc.i(p0);
                   break;
                 case 7:
                   jSONObject1 = tc.e(p0);
                   break;
                 case 8:
                   jSONObject1 = tc.h(p0);
                   break;
                 default:
             }
             jSONObject = jSONObject1;
          }
          jSONObject = miniAppInfo;
          if (jSONObject == null) {
             jSONObject = new JSONObject();
          }
          Object obj = jSONObject;
          try{
             obj.put("action_from", this.a);
          }catch(org.json.JSONException e12){
             e12.printStackTrace();
          }
          if (!u0.f()) {
             miniAppInfo = this.b.i0().M5().d;
          }
          MiniAppInfo miniAppInfo1 = miniAppInfo;
          if (!TextUtils.isEmpty(miniAppInfo1) && this.d != -1) {
             this.b.n0().technologyPageEventLog(miniAppInfo1, "kwapp_mini_plc_live_event", this.d, obj);
          }else {
             this.b.n0().technologyEventLog(miniAppInfo1, "kwapp_mini_plc_live_event", obj, g1.a());
          }
       }
       return;
    }
}
