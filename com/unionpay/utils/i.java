package com.unionpay.utils.i;
import java.lang.Object;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import com.unionpay.utils.j;

public final class i	// class@001011
{

    public void i(){
       super();
    }
    public static Object a(JSONArray p0,int p1){
       if (p0 != null && (p1 < p0.length() && p1 >= 0)) {
          try{
             p0 = p0.get(p1);
          label_0014 :
             return p0;
          }catch(org.json.JSONException e1){
             e1.printStackTrace();
          }
       label_0013 :
          p0 = null;
          goto label_0014 ;
       }else {
          goto label_0013 ;
       }
    }
    public static String a(JSONObject p0,String p1){
       String str;
       if (i.c(p0, p1)) {
          try{
             str = p0.getString(p1);
          label_0031 :
             return str;
          }catch(org.json.JSONException e0){
             j.b("uppay", i.class.toString()+" get "+p1+" failed!!");
          }
          str = "";
          goto label_0031 ;
       }else {
          goto label_002f ;
       }
    }
    public static JSONArray b(JSONObject p0,String p1){
       JSONArray jSONArray;
       if (i.c(p0, p1)) {
          try{
             jSONArray = p0.getJSONArray(p1);
          label_0030 :
             return jSONArray;
          }catch(org.json.JSONException e0){
             j.b("uppay", i.class.toString()+" get "+p1+" failed!!");
          }
          jSONArray = null;
          goto label_0030 ;
       }else {
          goto label_002f ;
       }
    }
    public static boolean c(JSONObject p0,String p1){
       boolean b = (p0 != null && p0.has(p1))? true: false;
       return b;
    }
}
