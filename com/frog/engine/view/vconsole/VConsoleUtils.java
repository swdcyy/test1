package com.frog.engine.view.vconsole.VConsoleUtils;
import java.lang.Object;
import org.json.JSONArray;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.Exception;

public class VConsoleUtils	// class@0015aa
{

    public void VConsoleUtils(){
       super();
    }
    public static String appendArrayJSString(JSONArray p0,int p1){
       VConsoleUtils vConsoleUtil = VConsoleUtils.class;
       if (PatchProxy.isSupport(vConsoleUtil)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, vConsoleUtil, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          VConsoleUtils.appendJsonToJSString(p0.toString(), p1);
          return VConsoleUtils;
       }
    }
    public static String appendErrorJSString(String p0,String p1,String p2,String p3,int p4,String p5,int p6,int p7){
       VConsoleUtils vConsoleUtil = VConsoleUtils.class;
       if (PatchProxy.isSupport(vConsoleUtil)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,Integer.valueOf(p6),Integer.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, null, vConsoleUtil, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       FrogLog.d("VConsoleUtils", "appendErrorJSString name:"+p0+" message:"+p1+" stack:"+p2+" description:"+p3+" number:"+p4+" fileName:"+p5+" lineNumber:"+p6+" columnNumber:"+p7);
       return "var tem_appendErrorJSString_object=new Error\(\);tem_appendErrorJSString_object.name="+VConsoleUtils.translateToJsString(p0)+";tem_appendErrorJSString_object.message="+VConsoleUtils.translateToJsString(p1)+";tem_appendErrorJSString_object.stack="+VConsoleUtils.translateToJsString(p2)+";tem_appendErrorJSString_object.description="+VConsoleUtils.translateToJsString(p3)+";tem_appendErrorJSString_object.fileName="+VConsoleUtils.translateToJsString(p5)+";tem_appendErrorJSString_object.number="+p4+";tem_appendErrorJSString_object.lineNumber="+p6+";tem_appendErrorJSString_object.columnNumber="+p7+";console.error\(tem_appendErrorJSString_object\);";
    }
    public static String appendJsonToJSString(String p0,int p1){
       VConsoleUtils vConsoleUtil = VConsoleUtils.class;
       if (PatchProxy.isSupport(vConsoleUtil)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, vConsoleUtil, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }else {
          p0 = VConsoleUtils.translateToJsString(p0);
          if (p1) {
             if (p1 != 1) {
                if (p1 != 2) {
                   if (p1 != 3) {
                      p0 = (p1 != 4)? "": "var tem_appendObjectJSString_object="+p0+";console.error.apply\(console,JSON.parse\(tem_appendObjectJSString_object\)\);";
                   }else {
                      p0 = "var tem_appendObjectJSString_object="+p0+";console.warn.apply\(console,JSON.parse\(tem_appendObjectJSString_object\)\);";
                   }
                }else {
                   p0 = "var tem_appendObjectJSString_object="+p0+";console.info.apply\(console,JSON.parse\(tem_appendObjectJSString_object\)\);";
                }
             }else {
                p0 = "var tem_appendObjectJSString_object="+p0+";console.debug.apply\(console,JSON.parse\(tem_appendObjectJSString_object\)\);";
             }
          }else {
             p0 = "var tem_appendObjectJSString_object="+p0+";console.log.apply\(console,JSON.parse\(tem_appendObjectJSString_object\)\);";
          }
          return p0;
       }
    }
    public static String appendLogJSString(String p0,int p1){
       VConsoleUtils vConsoleUtil = VConsoleUtils.class;
       String str = null;
       if (PatchProxy.isSupport(vConsoleUtil)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), str, vConsoleUtil, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          if (p1 != 1) {
             if (p1 != 2) {
                if (p1 != 3) {
                   if (p1 == 4) {
                      str = "console.error\(\""+p0+"\"\);";
                   }
                }else {
                   str = "console.warn\(\""+p0+"\"\);";
                }
             }else {
                str = "console.info\(\""+p0+"\"\);";
             }
          }else {
             str = "console.debug\(\""+p0+"\"\);";
          }
       }else {
          str = "console.log\(\""+p0+"\"\);";
       }
       return str;
    }
    public static String appendObjectJSString(JSONObject p0,int p1){
       VConsoleUtils vConsoleUtil = VConsoleUtils.class;
       if (PatchProxy.isSupport(vConsoleUtil)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, vConsoleUtil, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          VConsoleUtils.appendJsonToJSString(p0.toString(), p1);
          return VConsoleUtils;
       }
    }
    public static String translateToJsString(String p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, null, VConsoleUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("a", p0);
          p0 = obj.toString();
          return p0.substring((p0.indexOf(":") + 1), (p0.length() - 1));
       }catch(java.lang.Exception e3){
          FrogLog.e("VConsoleUtils", "translateToJsString error:"+e3.getMessage());
          return "";
       }
    }
}
