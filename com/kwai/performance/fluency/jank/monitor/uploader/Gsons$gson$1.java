package com.kwai.performance.fluency.jank.monitor.uploader.Gsons$gson$1;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.b;
import org.json.JSONArray;
import java.lang.Object;
import java.lang.String;
import java.lang.Number;
import java.lang.Boolean;
import org.json.JSONObject;
import com.google.gson.stream.a;

public final class Gsons$gson$1 extends TypeAdapter	// class@00108f
{

    public void Gsons$gson$1(){
       super();
    }
    public void a(b p0,JSONArray p1){
       if (p0 == null) {
       }else {
          p0.c();
       }
       if (p1 != null) {
          int i = 0;
          int i1 = p1.length();
          if (i1 > 0) {
             while (true) {
                int i2 = i + 1;
                Object obj = p1.get(i);
                if (obj instanceof String) {
                   if (p0 == null) {
                   label_0061 :
                      if (i2 < i1) {
                         i = i2;
                      }
                   }else {
                      p0.O(obj);
                      goto label_0061 ;
                   }
                }else if(obj instanceof Number){
                   if (p0 == null) {
                      goto label_0061 ;
                   }else {
                      p0.M(obj);
                      goto label_0061 ;
                   }
                }else if(obj instanceof Boolean){
                   if (p0 == null) {
                      goto label_0061 ;
                   }else {
                      p0.P(obj.booleanValue());
                      goto label_0061 ;
                   }
                }else if(obj instanceof JSONObject){
                   if (p0 == null) {
                      goto label_0061 ;
                   }else {
                      p0.p(obj.toString());
                      goto label_0061 ;
                   }
                }else if(obj instanceof JSONArray){
                   this.a(p0, obj);
                   goto label_0061 ;
                }else if(p0 == null){
                   goto label_0061 ;
                }else {
                   p0.u();
                   goto label_0061 ;
                }
             }
          }
       }
       if (p0 != null) {
          p0.g();
       }
       return;
    }
    public Object read(a p0){
       return new JSONArray();
    }
    public void write(b p0,Object p1){
       this.a(p0, p1);
    }
}
