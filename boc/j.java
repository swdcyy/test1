package boc.j;
import com.kwai.framework.cache.a$a;
import java.lang.Object;
import qfc.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import boc.k;
import o56.c;
import o56.a;
import xf6.g;
import xf6.l;
import com.kwai.framework.abtest.f;
import java.lang.System;
import org.json.JSONArray;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import ekd.k1;
import qkd.b;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import boc.b0;
import org.json.JSONObject;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Throwable;
import v56.f;

public class j implements a$a	// class@000445
{

    public void j(){
       super();
    }
    public boolean a(boolean p0,boolean p1){
       boolean b;
       Object[] objArray = new Object[0];
       a.C().w("ResourceCacheCleanHandler", "customClean :"+p0+", "+p1, objArray);
       _monitor_enter(k.class);
       if (k.b - null <= 0) {
          _monitor_exit(k.class);
       }else if(!p1){
          if (a.a().c()) {
             b = (g.o1())? l.c("KEY_ENABLE_MODEL_AUTO_CLEAN", 0): false;
             if (b) {
             label_0058 :
                if (!b || !p0) {
                label_011e :
                   _monitor_exit(k.class);
                }
             }
          }
          b = f.a("enableAutoClear");
          goto label_0058 ;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("ResourceCacheUtils", "start cleanUnUseModelFiles", objArray1);
       long l = System.currentTimeMillis();
       JSONArray jSONArray = new JSONArray();
       Iterator iterator = k.b().iterator();
       while (iterator.hasNext()) {
          File uFile = iterator.next();
          if (k1.t(uFile.lastModified()) - k.b > 0) {
             Object[] objArray2 = new Object[0];
             a.C().w("ResourceCacheUtils", "delete model : "+uFile, objArray2);
             jSONArray.put(uFile.getName());
             b.l0(uFile);
             MagicEmojiResourceHelper.v(uFile.getName(), 0);
             b0.e(uFile.getName(), 0);
          }
       }
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("isDiskUnSufficient", p0);
       jSONObject.put("isMannual", p1);
       jSONObject.put("count", jSONArray.length());
       jSONObject.put("modelList", jSONArray);
       PostUtils.x("cleanModel", jSONObject.toString());
       Object[] objArray3 = new Object[0];
       a.C().w("ResourceCacheUtils", "end cleanUnUseModelFiles cost : "+k1.t(l), objArray3);
       goto label_011e ;
       return true;
    }
    public long b(boolean p0){
       return k.a();
    }
    public List c(boolean p0){
       return f.b(this, p0);
    }
    public long d(){
       return k.a();
    }
    public long e(boolean p0){
       return f.h(this, p0);
    }
    public List f(boolean p0){
       return f.f(this, p0);
    }
    public void g(boolean p0){
       f.a(this, p0);
    }
    public void h(boolean p0){
       f.j(this, p0);
    }
    public List i(boolean p0){
       return f.c(this, p0);
    }
    public int j(boolean p0){
       return f.e(this, p0);
    }
    public List k(boolean p0){
       return f.i(this, p0);
    }
    public String name(){
       return "ytechModel";
    }
}
