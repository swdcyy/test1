package bpd.a0;
import so7.a;
import bpd.b0;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import org.json.JSONObject;
import org.json.JSONException;
import apd.i;
import apd.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class a0 implements a	// class@000298
{
    public final b0 a;

    public void a0(b0 p0){
       this.a = p0;
    }
    public final Object b(String p0,String p1){
       String str;
       JSONException jSONExceptio;
       CharSequence uCharSequenc;
       a0 ta = this.a;
       Objects.requireNonNull(ta);
       try{
          str = "";
          JSONObject jSONObject = new JSONObject(p1);
          p1 = jSONObject.get("targetUrl").toString();
          try{
             str = jSONObject.get("tachItemId").toString();
          label_0029 :
             Objects.requireNonNull(p0);
             if (!p0.equals("tachikoma.sharelib.onTargetUrlClick")) {
                if (p0.equals("tachikoma.sharelib.onCloseBtnClick")) {
                   b0 s = ta.s;
                   if (s != null) {
                      s.j();
                      i f = s.f;
                      if (f != null) {
                         f.e();
                      }
                   }
                }
             }else if(ta.s != null && !TextUtils.x(uCharSequenc)){
                ta.s.d(str, uCharSequenc);
             }
             return null;
          }catch(org.json.JSONException e2){
          }
          jSONExceptio.printStackTrace();
          goto label_0029 ;
       }catch(org.json.JSONException e6){
          jSONExceptio = e6;
          uCharSequenc = str;
          goto label_0026 ;
       }
    }
}
