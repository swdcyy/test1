package com.tencent.open.web.security.b;
import com.tencent.open.a;
import java.lang.String;
import java.util.List;
import com.tencent.open.a$a;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import java.lang.Object;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import com.tencent.open.a$b;
import com.kuaishou.webkit.WebView;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Long;
import com.tencent.open.web.security.c;

public class b extends a	// class@000f8a
{

    public void b(){
       super();
    }
    public void a(String p0,String p1,List p2,a$a p3){
       SLog.v("openSDK_LOG.SecureJsBridge", "-->getResult, objectName: "+p0+" | methodName: "+p1);
       int i = p2.size();
       int i1 = 0;
       while (i1 < i) {
          try{
             p2.set(i1, URLDecoder.decode(p2.get(i1), "UTF-8"));
          }catch(java.io.UnsupportedEncodingException e3){
             e3.printStackTrace();
          }
          i1 = i1 + 1;
       }
       a$b uob = this.a.get(p0);
       if (uob != null) {
          SLog.d("openSDK_LOG.SecureJsBridge", "-->handler != null");
          uob.call(p1, p2, p3);
       }else {
          SLog.e("openSDK_LOG.SecureJsBridge", "-->handler == null objName: "+p0);
          if (p3 != null) {
             p3.a();
          }
       }
       return;
    }
    public boolean a(WebView p0,String p1){
       String str = "openSDK_LOG.SecureJsBridge";
       SLog.i(str, "-->canHandleUrl---url = "+p1);
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       if (!(Uri.parse(p1).getScheme()).equals("jsbridge")) {
          return b;
       }
       ArrayList uArrayList = new ArrayList(Arrays.asList((p1+"/#").split("/")));
       if (uArrayList.size() < 7) {
          return b;
       }
       String str1 = uArrayList.get(2);
       String str2 = uArrayList.get(3);
       String str3 = uArrayList.get(4);
       Object obj = uArrayList.get(5);
       SLog.i(str, "-->canHandleUrl, objectName: "+str1+" | methodName: "+str2+" | snStr: "+str3);
       if (!TextUtils.isEmpty(str1) && (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
          return b;
       }
       try{
          c uoc = new c(p0, Long.parseLong(str3), p1, obj);
          this.a(str1, str2, uArrayList.subList(6, (uArrayList.size() - 1)), b);
          return 1;
       }catch(java.lang.Exception e0){
       }
    }
}
