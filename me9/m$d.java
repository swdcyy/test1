package me9.m$d;
import erd.g;
import me9.m;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.concurrent.ConcurrentHashMap;
import java.io.File;
import com.google.gson.JsonObject;
import java.util.Map;
import j8c.a;
import java.lang.StringBuilder;
import w46.b;
import fg6.a;
import qkd.b;
import com.google.gson.Gson;
import q87.c;

public final class m$d implements g	// class@003004
{
    public final m b;

    public void m$d(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       SimpleMagicFace mId;
       if (PatchProxy.applyVoidOneRefs(p0, this, m$d.class, "1")) {
       }else {
          m$d tb = this.b;
          a.o(p0, "it");
          _monitor_enter(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, m.class, "8")) {
             _monitor_exit(tb);
          }else if(tb.c.containsKey(p0.mId)){
             _monitor_exit(tb);
          }else {
             File uFile = tb.h(p0);
             int i = 0;
             if (!uFile.exists()) {
                if (!tb.c.containsKey(p0.mId)) {
                   mId = p0.mId;
                   a.o(mId, "magicFace.mId");
                   tb.c.put(mId, new JsonObject());
                }
                Object[] objArray = new Object[i];
                a.D().t("MagicRequestStatusHandler", "no persistent file : "+p0.mId, objArray);
                _monitor_exit(tb);
             }else {
                JsonObject jsonObject = a.a.h(b.g0(uFile, "utf-8"), JsonObject.class);
                Object[] objArray1 = new Object[i];
                a.D().w("MagicRequestStatusHandler", "read persistentData success : "+p0.mId, objArray1);
                if (!tb.c.containsKey(p0.mId)) {
                   m c = tb.c;
                   p0 = p0.mId;
                   a.o(p0, "magicFace.mId");
                   if (jsonObject == null) {
                      jsonObject = new JsonObject();
                   }
                   c.put(p0, jsonObject);
                }
             label_00f1 :
                _monitor_exit(tb);
             }
          }
       }
       return;
    }
}
