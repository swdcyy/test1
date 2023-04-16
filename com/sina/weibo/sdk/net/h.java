package com.sina.weibo.sdk.net.h;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public final class h	// class@000bc7
{
    public HashMap q;

    public void h(){
       super();
       this.q = new HashMap();
    }
    public final String g(){
       String str = "UTF-8";
       StringBuilder str1 = "";
       Iterator iterator = this.q.keySet().iterator();
       int i = 1;
       while (iterator.hasNext()) {
          String str2 = iterator.next();
          if (i) {
             i = 0;
          }else {
             str1 = str1+"&";
          }
          String str3 = this.q.get(str2);
          if (!TextUtils.isEmpty(str3)) {
             try{
                str1 = str1+URLEncoder.encode(str2, str)+"="+URLEncoder.encode(str3, str);
             }catch(java.io.UnsupportedEncodingException e4){
                e4.printStackTrace();
                goto label_0012 ;
             }
          }
       }
       return str1;
    }
    public final void put(String p0,String p1){
       this.q.put(p0, p1);
    }
}
