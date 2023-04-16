package com.loc.ac;
import java.lang.String;
import com.loc.x;
import java.lang.Object;
import com.loc.o$a;
import com.loc.ac$1;
import android.content.Context;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.ad;
import com.loc.y;
import org.json.JSONException;
import java.lang.Throwable;
import com.loc.af;
import java.lang.StringBuilder;
import com.loc.bc;
import com.loc.aa;
import java.security.PublicKey;
import com.loc.ae;
import java.net.URLEncoder;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuffer;
import java.util.Locale;
import com.loc.p;

public final class ac	// class@001362
{
    public String g;
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static boolean f;

    static {
       ac.a = x.c("SRFZHZUVZT3BOa0ZiemZRQQ");
       ac.b = x.c("FbGJzX3Nkaw");
       ac.c = x.c("SWjJuYVh2eEMwSzVmNklFSmh0UXpVb2xtOVM4eU9Ua3E");
       ac.d = x.c("FQU5EU0RLMTA");
       ac.e = x.c("FMTAw");
       ac.f = false;
    }
    public void ac(){
       this.g = "";
    }
    public static o$a a(){
       return new ac$1();
    }
    public static String a(Context p0,String p1){
       try{
          JSONObject jSONObject = new JSONObject(p1);
          if (jSONObject.optInt(x.c("UY29kZQ")) == 1) {
             p1 = new JSONObject(jSONObject.optString(x.c("FZGF0YQ"))).optString(x.c("FYWRpdQ"));
             if (!TextUtils.isEmpty(p1)) {
                ad.a(p1);
                y.a(p0).a(p1);
                return p1;
             }
          }
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
       }
       return "";
    }
    public static String c(){
       return ad.a();
    }
    public final String a(String p0,String p1,String p2,String p3){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put(x.c("LdGlk"), p0);
       jSONObject.put(x.c("FZGl1"), p1);
       jSONObject.put(x.c("AZGl1Mg"), p2);
       jSONObject.put(x.c("EZGl1Mw"), p3);
       p0 = jSONObject.toString();
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       p1 = af.a();
       if (!TextUtils.isEmpty(p1)) {
          p0 = aa.a(bc.a((p0+"\xff\x02\xff\x02\x00").getBytes(), p1.getBytes()));
          if (!TextUtils.isEmpty(p0)) {
             return x.c("Fa2V5PQ")+URLEncoder.encode(aa.a(ae.a(p1.getBytes("utf-8"), ae.a(this.d()))))+x.c("SJmRhdGE9")+URLEncoder.encode(p0);
          }
       }
       return null;
    }
    public synchronized final Map b(){
       if (ac.f) {
          return null;
       }
       ac.f = true;
       HashMap hashMap = new HashMap();
       hashMap.put(x.c("FZW50"), x.c("FMg"));
       String b = ac.b;
       String d = ac.d;
       StringBuilder str = x.c("SY2hhbm5lbD0")+b+x.c("SJmRpdj0")+d;
       hashMap.put(x.c("FaW4"), aa.a(bc.a((str+x.c("FJnNpZ249")+(af.a(b+d+x.c("FQA")+ac.c)).toUpperCase(Locale.US)+x.c("SJm91dHB1dD1qc29u")+"\xff\x02\xff\x02\x00").getBytes(), (ac.a).getBytes())));
       hashMap.put(x.c("Sa2V5dA"), ac.e);
       return hashMap;
    }
    public final String d(){
       int i3;
       if (!TextUtils.isEmpty(this.g)) {
          return this.g;
       }
       String str = p.a("TUpJaVFGNk5LXHtSX1ZwQlRiV1VVZmtYWU1haV1hYWHCiXJtZcKLdmp8wpFewo1/wphwwoFzZmR8aWp6X2k6XsKDwoF+WGbChGdAScKLwoVXfmNxYEvCjcKLSG7CjGNvwoZtVFZ7WMKXYMKfwo5dZcKHfzZXUG85X0hNOVJrb2U8ZlJGW8KCe8KOV8KQWllrcGrCjcKIT25lUHPCicKGVsKKeG5fwp56XsKbc8KJbUVYR0pqU09gfE5/WT5YeHNAwoDCh1Z4V8KQT3JQYmxQbcKYwpFxdG/Ci3rCmMKQwop+YVbCmWFxwpxBdW07Zjp/ODlAbcKEY1pQwoJowohbV1VmV1laWmtcYGbClXfCk2NvesKdwohdWFnCol/CjWTCmMKicG1ENnAvPFtpcXtfclhfXsKAwolgRWNbS29OwpFafV3CkMKLTcKCwolrU3DCmGnCmX9wdsKPcXDCg3LCnFpGcDVTeTxNWW07bXJePVRfQn3ChGNraFhbwpNcwpXChMKNaFVjeVF8wojChm9YbmvChGDCmHvChGVQWjo0Z3o9djleOztWcVxSfWE9woLChkZdcGTCgVzCjMKUVE12wpV5bcKVwprCnntZworCgsKfwpHCksKnwpHClURURW9YaDtwXU1bck5YX3hSVFZUYlxKWFlua1xeYm9jU8KDa3ZrwpZ5am9Za3jCknR3fA");
       StringBuffer str1 = "";
       int i = 0;
       for (int i1 = 0; i1 < str.length(); i1 = i1 + 1) {
          int i2 = i1 % 48;
          i3 = str.charAt(i1) - i2;
          str1 = str1+(char)i3;
       }
       str = str1;
       str1 = "";
       i1 = str.length() / 2;
       while (i < i1) {
          i3 = str.length() - 1;
          i3 = i3 - i;
          i1 = str.charAt(i) + str.charAt(i3);
          i1 = i1 / 2;
          str1 = str1+(char)i1;
          i = i + 1;
       }
       str = str1;
       this.g = str;
       return str;
    }
}
