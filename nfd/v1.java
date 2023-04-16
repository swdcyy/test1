package nfd.v1;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.SearchPreferenceObject;
import x6d.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Long;
import java.lang.System;
import com.yxcorp.gifshow.util.cdnresource.m;
import java.util.Objects;
import wkd.b;
import j80.c;
import java.io.File;
import java.util.Map;
import qkd.b;
import com.yxcorp.gifshow.util.cdnresource.CdnResource;

public class v1 implements Runnable	// class@001e17
{

    public void v1(){
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, v1.class, "1")) {
          return;
       }
       Type g = SearchPreferenceObject.G;
       String str = a.a.getString("lastLikeResource", "null");
       Object[] objArray = (str == null || str == "")? null: b.a(str, g);
       if (objArray == null) {
          return;
       }else {
          Iterator iterator = objArray.keySet().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             long l = objArray.get(str1).longValue() * 1000;
             Map map = 1;
             long l1 = (System.currentTimeMillis() - l > 0)? 1: 0;
             Objects.requireNonNull(m.b);
             File uFile = new File(b.a(-1504323719).j("like_resource_search"), str1);
             if (!uFile.exists()) {
                uFile = null;
             }
             if (uFile == null) {
                continue ;
             }else if(l1){
                if (!m.a.containsKey(str1)) {
                   b.m(uFile);
                }
             }else if(m.a.containsKey(str1)){
                continue ;
             }else {
                try{
                   m.a.put(str1, CdnResource.f(uFile, str1, map));
                }catch(java.lang.Exception e0){
                   goto label_0032 ;
                }
             }
          }
          return;
       }
    }
}
