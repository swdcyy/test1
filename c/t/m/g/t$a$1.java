package c.t.m.g.t$a$1;
import c.t.m.g.bq$d;
import c.t.m.g.t$a;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import c.t.m.g.bk;
import c.t.m.g.bb;
import c.t.m.g.bl;
import android.content.SharedPreferences;
import c.t.m.g.ca;
import java.lang.System;
import java.lang.Long;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import java.lang.Throwable;

public class t$a$1 implements bq$d	// class@000ca8
{
    public final t$a a;

    public void t$a$1(t$a p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       JSONObject jSONObject = new JSONObject(p0);
       int intx = jSONObject.getInt("status");
       if (!intx) {
          String str = jSONObject.getString("version");
          String str1 = bk.a(jSONObject.getString("key"));
          bl.a(bb.a(str1), str);
          SharedPreferences sharedPrefer = ca.a();
          ca.a(sharedPrefer, "loc_comm_rsa_pub_key_ver", str);
          ca.a(sharedPrefer, "loc_comm_rsa_pub_key_64", str1);
          ca.a(sharedPrefer, "loc_comm_rsa_key_update_time", Long.valueOf(System.currentTimeMillis()));
       }else {
          bt.a("UpdateRsaPublicKey", "parse json status:"+intx+", json="+p0);
       }
       return;
    }
    public void b(String p0){
       bt.a("UpdateRsaPublicKey", "onFailed:"+p0);
    }
}
