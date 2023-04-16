package com.tencent.open.a;
import java.lang.Object;
import java.util.HashMap;
import com.tencent.open.a$b;
import java.lang.String;
import java.util.List;
import com.tencent.open.a$a;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import com.kuaishou.webkit.WebView;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class a	// class@000f3f
{
    public HashMap a;

    public void a(){
       super();
       this.a = new HashMap();
    }
    public void a(a$b p0,String p1){
       this.a.put(p1, p0);
    }
    public void a(String p0,String p1,List p2,a$a p3){
       SLog.v("openSDK_LOG.JsBridge", "getResult---objName = "+p0+" methodName = "+p1);
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
          SLog.d("openSDK_LOG.JsBridge", "call----");
          uob.call(p1, p2, p3);
       }else {
          SLog.d("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
          if (p3 != null) {
             p3.a();
          }
       }
       return;
    }
    public boolean a(WebView p0,String p1){
       SLog.v("openSDK_LOG.JsBridge", "-->canHandleUrl---url = "+p1);
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       if (!(Uri.parse(p1).getScheme()).equals("jsbridge")) {
          return b;
       }
       ArrayList uArrayList = new ArrayList(Arrays.asList((p1+"/#").split("/")));
       if (uArrayList.size() < 6) {
          return b;
       }
       p0.getUrl();
       this.a(uArrayList.get(2), uArrayList.get(3), uArrayList.subList(4, (uArrayList.size() - 1)), new a$a(p0, 4, p1));
       return 1;
    }
}
