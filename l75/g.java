package l75.g;
import bv7.a;
import com.kwai.chat.kwailink.a;
import java.lang.Object;
import com.kwai.link.extensions.HttpTransaction;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;
import com.kwai.link.TransactionBase;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.data.HttpResponse;
import java.util.ArrayList;
import s75.a;
import com.kwai.link.extensions.HttpTransaction$HttpHeader;

public final class g implements a	// class@001d53
{
    public final a a;

    public void g(a p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       try{
          g ta = this.a;
          String str = "KlinkAdapter";
          a.e(str, "HttpTransaction complete");
          int errorCode = p0.getErrorCode();
          if (errorCode) {
             p0 = p0.getErrorMessage();
             a.e(str, "HttpTransaction failed, errorCode="+errorCode+", errorMsg="+p0);
             if (ta != null) {
                ta.onFailed(errorCode, p0);
             }
          }else {
             errorCode = p0.getStatusCode();
             a.e(str, "HttpTransaction succeeded, statusCode="+errorCode);
             if (ta != null) {
                HttpResponse httpResponse = new HttpResponse();
                httpResponse.b = errorCode;
                ArrayList responseHead = p0.getResponseHeaders();
                int i = responseHead.size();
                a[] uoaArray = new a[i];
                for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                   HttpTransaction$HttpHeader httpHeader = responseHead.get(i1);
                   a uoa = new a();
                   uoa.a = httpHeader.key;
                   uoa.b = httpHeader.value;
                   uoaArray[i1] = uoa;
                }
                httpResponse.c = uoaArray;
                httpResponse.d = p0.getResponseBody();
                ta.a(httpResponse);
             }
          }
          return;
       }catch(android.os.RemoteException e0){
       }
    }
}
