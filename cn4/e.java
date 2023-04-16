package cn4.e;
import java.lang.Runnable;
import com.kuaishou.merchant.web.trilateral.b;
import d7.a;
import java.lang.Object;
import java.lang.String;
import n04.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class e implements Runnable	// class@000499
{
    public final b b;
    public final a c;

    public void e(b p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       if (tb.H()) {
       }else {
          String str = tc.b();
          Object[] objArray = new Object[0];
          a.C().w("MerchantTrilateralYodaWebViewClient", "h5PayResultModel, code=["+tc.a()+"] url=["+str+"]", objArray);
          if (!TextUtils.x(str)) {
             b q = tb.q;
             if (q != null) {
                q.loadUrl(str);
             }
          }
       }
       return;
    }
}
