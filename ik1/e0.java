package ik1.e0;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.util.HashMap;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.util.Map;
import com.kuaishou.android.live.log.b;

public final class e0 implements g	// class@002923
{
    public final String b;

    public void e0(String p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int errorCode;
       e0 tb = this.b;
       String message = p0.getMessage();
       if (p0 instanceof KwaiException) {
          errorCode = p0.getErrorCode();
          p0 = p0.getMessage();
       }else {
          p0 = message;
          errorCode = 0;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("errorCode", String.valueOf(errorCode));
       hashMap.put("errorMessage", p0);
       b.h0(LiveLogTag.GIFT, tb, hashMap);
       return;
    }
}
