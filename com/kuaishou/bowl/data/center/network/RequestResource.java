package com.kuaishou.bowl.data.center.network.RequestResource;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import yz7.e;
import java.net.URLDecoder;
import java.lang.reflect.Type;

public class RequestResource implements Serializable	// class@0011fa
{
    public Map extraTemplateMap;
    public List materialIds;
    public String resourceCode;
    public static final long serialVersionUID = 0xb8f70dd689056c48;

    public void RequestResource(String p0,List p1,Map p2){
       super();
       this.resourceCode = p0;
       this.materialIds = p1;
       this.extraTemplateMap = p2;
    }
    public static Map splitQuery2Map(String p0){
       String str1;
       HashMap obj = PatchProxy.applyOneRefs(p0, null, RequestResource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return new HashMap();
       }
       if (p0.startsWith("{") && p0.endsWith("}")) {
          return e.a(p0, Map.class);
       }
       obj = new HashMap();
       String[] stringArray = p0.split("&");
       int len = stringArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = stringArray[i];
          int i1 = oobject.indexOf("=");
          String str = (i1 > 0)? URLDecoder.decode(oobject.substring(0, i1), "UTF-8"): oobject;
          if (i1 > 0) {
             i1 = i1 + 1;
             if (oobject.length() > i1) {
                str1 = URLDecoder.decode(oobject.substring(i1), "UTF-8");
             label_006f :
                obj.put(str, str1);
             }
          }
          str1 = null;
          goto label_006f ;
       }
       return obj;
    }
    public static String splitQuery2String(String p0){
       String str1;
       HashMap obj = PatchProxy.applyOneRefs(p0, null, RequestResource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       if (p0.startsWith("{") && p0.endsWith("}")) {
          return p0;
       }
       obj = new HashMap();
       String[] stringArray = p0.split("&");
       int len = stringArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = stringArray[i];
          int i1 = oobject.indexOf("=");
          String str = (i1 > 0)? URLDecoder.decode(oobject.substring(0, i1), "UTF-8"): oobject;
          if (i1 > 0) {
             i1 = i1 + 1;
             if (oobject.length() > i1) {
                str1 = URLDecoder.decode(oobject.substring(i1), "UTF-8");
             label_0066 :
                obj.put(str, str1);
             }
          }
          str1 = null;
          goto label_0066 ;
       }
       return e.e(obj, String.class, String.class);
    }
}
