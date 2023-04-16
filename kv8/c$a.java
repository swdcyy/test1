package kv8.c$a;
import android.os.Handler;
import fv8.b;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.response.a;
import java.util.Map;
import java.lang.StringBuilder;
import nv8.b;
import java.util.Objects;
import lv8.c;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;

public class c$a extends Handler	// class@002c21
{
    public WeakReference a;

    public void c$a(b p0){
       this.a = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       b uob = this.a.get();
       if (uob == null) {
          return;
       }
       a uoa = new a(p0.obj);
       b.o("AliPay", "AlipayPayResult: "+uoa.b());
       String str = uoa.a();
       Objects.requireNonNull(str);
       int i = -1;
       int i1 = 2;
       int i2 = 1;
       switch (str.hashCode()){
           case 0x19463b:
             if (str.equals("6001")) {
                i = 0;
             }
             break;
           case 0x1a2ef8:
             if (str.equals("8000")) {
                i = 1;
             }
             break;
           case 0x1aa357:
             if (str.equals("9000")) {
                i = 2;
             }
             break;
           default:
       }
       try{
       label_006e :
          str = null;
          switch (i){
              case 0:
                uob.onPayFinish(3, str);
                break;
              case 1:
              case 2:
                uob.onPayFinish(i2, str);
                break;
              default:
                String str1 = uoa.a();
                c uoc = c.class;
                if (PatchProxy.isSupport(uoc)) {
                   str = PatchProxy.applyTwoRefs(str1, Integer.valueOf(i1), str, uoc, "15");
                   if (str != PatchProxyResult.class) {
                      i1 = str.intValue();
                   }else if(TextUtils.isEmpty(str1)){
                      i1 = Integer.parseInt(str1);
                   }
                }else {
                   goto label_0093 ;
                }
                uob.onPayFinish(i1, uoa.b());
          }
       }catch(java.lang.NumberFormatException e0){
       }
       return;
    }
}
