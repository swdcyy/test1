package d85.g;
import s75.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.Throwable;
import com.kwai.chat.kwailink.log.a;
import d85.h;
import java.lang.StringBuilder;
import java.lang.Integer;
import android.util.SparseArray;

public class g implements b	// class@001481
{
    public String a;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;

    public void g(String p0){
       super();
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          obj.booleanValue();
       }else if(TextUtils.isEmpty(p0)){
          try{
             obj = new JSONObject(p0);
             this.a = obj.optString("serverIp", null);
             this.b = obj.optInt("serverPort");
             this.c = obj.optString("proxyIp", null);
             this.d = obj.optInt("proxyPort");
             this.e = obj.optInt("protocol");
             this.f = obj.optInt("serverType");
          }catch(org.json.JSONException e3){
             a.d("", e3);
          }
       }
    }
    public void g(String p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = null;
       this.d = 0;
       this.e = p2;
       this.f = p3;
    }
    public String a(){
       return this.a;
    }
    public boolean parseJSONString(String p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       try{
          obj = new JSONObject(p0);
          this.a = obj.optString("serverIp", null);
          this.b = obj.optInt("serverPort");
          this.c = obj.optString("proxyIp", null);
          this.d = obj.optInt("proxyPort");
          this.e = obj.optInt("protocol");
          this.f = obj.optInt("serverType");
          return true;
       }catch(org.json.JSONException e4){
          a.d("", e4);
          return v1;
       }
    }
    public JSONObject toJSONObject(){
       JSONObject obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          if (!TextUtils.isEmpty(this.a)) {
             obj.put("serverIp", this.a);
          }
          obj.put("serverPort", this.b);
          if (!TextUtils.isEmpty(this.c)) {
             obj.put("proxyIp", this.c);
          }
          obj.put("proxyPort", this.d);
          obj.put("protocol", this.e);
          obj.put("serverType", this.f);
       }catch(org.json.JSONException e1){
          a.d("", e1);
       }
       return obj;
    }
    public String toJSONString(){
       JSONObject obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, og, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj1 = PatchProxy.apply(objArray, this, og, "5");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new JSONObject();
             if (!TextUtils.isEmpty(this.a)) {
                obj1.put("serverIp", this.a);
             }
             obj1.put("serverPort", this.b);
             if (!TextUtils.isEmpty(this.c)) {
                obj1.put("proxyIp", this.c);
             }
             obj1.put("proxyPort", this.d);
             obj1.put("protocol", this.e);
             obj1.put("serverType", this.f);
          }
       }catch(org.json.JSONException e0){
          a.d("", e0);
       }
       return obj1.toString();
    }
    public String toString(){
       String str1;
       String str2;
       h oh = h.class;
       StringBuilder obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "[ "+"sIP="+this.a+", sPort="+this.b+", pIP="+this.c+", pPort="+this.d+", protocol=";
       g te = this.e;
       String str = "";
       if (PatchProxy.isSupport(oh)) {
          str1 = PatchProxy.applyOneRefs(Integer.valueOf(te), null, oh, "1");
          if (str1 != PatchProxyResult.class) {
          }else {
          label_0064 :
             String str3 = h.a.get(te);
             str1 = (str3 == null)? str: str3;
          }
       }else {
          goto label_0064 ;
       }
       obj = obj+str1+", type=";
       te = this.f;
       if (PatchProxy.isSupport(oh)) {
          str2 = PatchProxy.applyOneRefs(Integer.valueOf(te), null, oh, "2");
          if (str2 != PatchProxyResult.class) {
          label_009b :
             return obj+str2+" ]";
          }
       }
       str2 = h.b.get(te);
       if (str2 != null) {
          str = str2;
       }
       str2 = str;
       goto label_009b ;
    }
}
