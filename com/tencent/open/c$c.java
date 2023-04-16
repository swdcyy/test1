package com.tencent.open.c$c;
import com.tencent.tauth.DefaultUiListener;
import android.content.Context;
import java.lang.String;
import com.tencent.tauth.IUiListener;
import java.lang.ref.WeakReference;
import java.lang.Object;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import org.json.JSONException;
import com.tencent.tauth.UiError;
import com.tencent.open.b.h;
import java.lang.StringBuilder;
import android.os.SystemClock;

public class c$c extends DefaultUiListener	// class@000f56
{
    public String a;
    public String b;
    public WeakReference c;
    public String d;
    public IUiListener e;

    public void c$c(Context p0,String p1,String p2,String p3,IUiListener p4){
       super();
       this.c = new WeakReference(p0);
       this.d = p1;
       this.a = p2;
       this.b = p3;
       this.e = p4;
    }
    public static void a(c$c p0,String p1){
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
       c$c te = this.e;
       if (te != null) {
          te.onCancel();
          this.e = null;
       }
       return;
    }
    public void onComplete(Object p0){
       h.a().a(this.d+"_H5", SystemClock.elapsedRealtime(), 0, 0, p0.optInt("ret", -6), this.a, false);
       c$c te = this.e;
       if (te != null) {
          te.onComplete(p0);
          this.e = null;
       }
       return;
    }
    public void onError(UiError p0){
       String str = (p0.errorMessage != null)? p0.errorMessage+this.a: this.a;
       h.a().a(this.d+"_H5", SystemClock.elapsedRealtime(), 0, 0, p0.errorCode, str, false);
       c$c te = this.e;
       if (te != null) {
          te.onError(p0);
          this.e = null;
       }
       return;
    }
}
