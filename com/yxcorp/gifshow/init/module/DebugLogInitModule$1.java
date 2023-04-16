package com.yxcorp.gifshow.init.module.DebugLogInitModule$1;
import i85.c;
import com.yxcorp.gifshow.init.module.DebugLogInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import pxa.e;
import java.lang.StringBuilder;
import q87.c;
import fg6.a;
import com.yxcorp.gifshow.init.module.DebugLogInitModule$1$1;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Map;
import com.kwai.framework.debuglog.RetrieveType;
import o56.a;
import f66.m;
import java.util.Set;
import e66.c;
import android.content.Context;
import java.io.File;
import com.kwai.framework.debuglog.i;
import com.kwai.framework.fileuploader.UploadUtils$CommonUploadBizType;
import brd.t;
import com.kwai.framework.fileuploader.UploadUtils;
import f66.k;
import erd.a;
import f66.l;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.Throwable;
import android.util.Log;
import wkd.b;
import db6.a;

public class DebugLogInitModule$1 implements c	// class@001972
{
    public final DebugLogInitModule a;

    public void DebugLogInitModule$1(DebugLogInitModule p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2){
       Application b;
       Object[] objArray1;
       Set a;
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, DebugLogInitModule$1.class, "1")) {
          return;
       }
       if ((QCurrentUser.ME.getId()).equals(p0)) {
          int i = 0;
          Object[] objArray = new Object[i];
          e.C().w("ks://"+p1, "uid = "+p0+"  signal = "+p1+" extra = "+p2, objArray);
          Map map = a.a.i(p2, new DebugLogInitModule$1$1(this).getType());
          String str = "type";
          str = (map.containsKey(str))? map.get(str): null;
          RetrieveType retrieveType = RetrieveType.toEnum(str);
          if (retrieveType != null) {
             b = a.B;
             p2 = String.valueOf(p2);
             if (!PatchProxy.applyVoidFourRefs(b, retrieveType, p2, map, null, m.class, "1")) {
                String str1 = "Type ";
                if (m.a.contains(retrieveType)) {
                   objArray1 = new Object[i];
                   c.C().w("OatFile", str1+retrieveType+"in progress to ignore", objArray1);
                }else {
                   a = m.a;
                   try{
                      a.add(retrieveType);
                      File uFile = i.b(b, retrieveType, map);
                      l ol = new l(uFile);
                      b uob = UploadUtils.uploadFile(uFile, UploadUtils$CommonUploadBizType.APP_DEBUG_LOG_FILE.mType, p2, "zip").doFinally(new k(retrieveType)).subscribe(ol, Functions.d());
                      objArray1 = new Object[i];
                      c.C().w("OatFile", str1+retrieveType+" isDisposed "+uob.isDisposed(), objArray1);
                   }catch(java.lang.Exception e10){
                      m.a.remove(retrieveType);
                      objArray1 = new Object[objArray1];
                      c.C().A("OatFile", Log.getStackTraceString(e10), objArray1);
                   }
                }
             }
          }else {
             b.a(0x31e909fc).d();
          }
       }
    }
}
