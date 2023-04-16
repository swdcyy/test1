package m6.c;
import java.util.concurrent.Callable;
import s6.a;
import android.content.Context;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import android.os.ConditionVariable;
import m6.b;
import java.util.Map;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$InitResultListener;
import java.lang.Throwable;
import u6.c;
import k6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public final class c implements Callable	// class@0025b6
{
    public final a b;
    public final Context c;
    public final HashMap d;

    public void c(a p0,Context p1,HashMap p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       c tb = this.b;
       String[] stringArray = new String[]{""};
       ConditionVariable uConditionVa = new ConditionVariable();
       APSecuritySdk.getInstance(this.c).initToken(0, this.d, new b(stringArray, uConditionVa));
       uConditionVa.block(3000);
       if (TextUtils.isEmpty(stringArray[0])) {
          a.h(tb, "third", "GetApdidNull", "missing token");
       }
       c.e("mspl", "ap:"+stringArray[0]);
       return stringArray[0];
    }
}
