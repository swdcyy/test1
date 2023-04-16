package com.kwai.performance.overhead.battery.monitor.model.StackTree;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import org.json.JSONObject;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;
import java.security.MessageDigest;
import java.lang.Integer;

public class StackTree implements Serializable	// class@001142
{
    public Integer childCount;
    public final Map children;
    public Integer count;
    public Integer depth;
    public Integer level;
    public String md5;
    public Integer samplingCount;
    public String stackDetail;
    public String stackFrame;
    public Long threadId;
    public String threadName;

    public void StackTree(){
       super();
       this.md5 = null;
       this.stackDetail = null;
       this.children = new HashMap();
    }
    public final void a(JSONObject p0,String p1,Object p2){
       if (p2 != null) {
          p0.put(p1, p2);
       }
       return;
    }
    public final JSONObject b(){
       if (this.children.isEmpty()) {
          return new JSONObject();
       }
       JSONObject jSONObject = new JSONObject();
       Iterator iterator = this.children.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          StackTree stackTree = this.children.get(str);
          if (stackTree == null) {
             continue ;
          }else {
             jSONObject.put(str, stackTree.convertToJsonObject());
          }
       }
       return jSONObject;
    }
    public int buildStack(){
       ArrayList uArrayList = new ArrayList();
       this.c(uArrayList);
       this.md5 = "UNKNOWN";
       this.stackDetail = "UNKNOWN";
       if (uArrayList.size()) {
          String str = "";
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             str = str+iterator.next()+"\n";
          }
          int i = 0;
          str = str.substring(i, (str.length() - 1));
          this.stackDetail = str;
          MessageDigest instance = MessageDigest.getInstance("md5");
          instance.update(str.getBytes("utf-8"));
          byte[] uobyteArray = instance.digest();
          StringBuilder str1 = "";
          int len = uobyteArray.length;
          while (i < len) {
             int i1 = uobyteArray[i] & 0x00ff;
             str1 = ((Integer.toHexString(i1)).length() == 1)? str1+"0"+Integer.toHexString(i1): str1+Integer.toHexString(i1);
             i = i + 1;
          }
          str = str1;
          this.md5 = str;
       }
       return uArrayList.size();
    }
    public final void c(List p0){
       p0.add(this.stackFrame);
       Iterator iterator = this.children.keySet().iterator();
       StackTree stackTree = null;
       StackTree stackTree1 = null;
       while (iterator.hasNext()) {
          StackTree stackTree2 = this.children.get(iterator.next());
          if (stackTree2 != null && stackTree2.count.intValue() > stackTree) {
             stackTree = stackTree2.count.intValue();
             stackTree1 = stackTree2;
          }
       }
       if (stackTree1 != null) {
          stackTree1.c(p0);
       }
       return;
    }
    public JSONObject convertToJsonObject(){
       try{
          JSONObject jSONObject = new JSONObject();
          this.a(jSONObject, "threadName", this.threadName);
          this.a(jSONObject, "threadId", this.threadId);
          this.a(jSONObject, "childCount", this.childCount);
          this.a(jSONObject, "samplingCount", this.samplingCount);
          this.a(jSONObject, "stackFrame", this.stackFrame);
          this.a(jSONObject, "md5", this.md5);
          this.a(jSONObject, "stackDetail", this.stackDetail);
          this.a(jSONObject, "level", this.level);
          this.a(jSONObject, "count", this.count);
          this.a(jSONObject, "depth", this.depth);
          jSONObject.put("children", this.b());
          return e0;
       }catch(org.json.JSONException e0){
       }
    }
}
