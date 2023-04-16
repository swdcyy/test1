package com.tencent.connect.auth.a$b;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.connect.auth.a;
import java.lang.String;
import com.tencent.tauth.IUiListener;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import java.lang.Object;
import org.json.JSONException;
import com.tencent.tauth.UiError;
import com.tencent.open.b.h;
import java.lang.StringBuilder;
import android.os.SystemClock;

public class a$b extends DefaultUiListener	// class@000e27
{
    public String a;
    public String b;
    public final a c;
    public String d;
    public IUiListener e;

    public void a$b(a p0,String p1,String p2,String p3,IUiListener p4){
       this.c = p0;
       super();
       this.d = p1;
       this.a = p2;
       this.b = p3;
       this.e = p4;
    }
    public static void a(a$b p0,String p1){
       p0.a(p1);
    }
    public final void a(String p0){
       try{
          this.onComplete(k.d(p0));
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
          this.onError(new UiError(-4, "服务器返回数据格式有误!", p0));
       }
       return;
    }
    public void onCancel(){
       a$b te = this.e;
       if (te != null) {
          te.onCancel();
          this.e = null;
       }
       return;
    }
    public void onComplete(Object p0){
       h.a().a(this.d+"_H5", SystemClock.elapsedRealtime(), 0, 0, p0.optInt("ret", -6), this.a, false);
       a$b te = this.e;
       if (te != null) {
          te.onComplete(p0);
          this.e = null;
       }
       return;
    }
    public void onError(UiError p0){
       String str = (p0.errorMessage != null)? p0.errorMessage+this.a: this.a;
       h.a().a(this.d+"_H5", SystemClock.elapsedRealtime(), 0, 0, p0.errorCode, str, false);
       a.a(this.c, str);
       a$b te = this.e;
       if (te != null) {
          te.onError(p0);
          this.e = null;
       }
       return;
    }
}
