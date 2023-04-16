package com.kwai.framework.network.cronet.diagnostic.c;
import erd.g;
import java.lang.Object;
import com.kwai.framework.network.cronet.diagnostic.DiagnosticUploadResponse;
import com.kwai.framework.network.cronet.diagnostic.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ta6.c;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import q87.c;
import com.kwai.framework.network.cronet.diagnostic.DiagnosticUploadResponse$DiagnosticConfigModel;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import com.google.common.primitives.Ints;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class c implements g	// class@0017a9
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray1;
       int i = 0;
       if (p0 != null) {
          DiagnosticUploadResponse data = p0.data;
          if (data != null) {
             if (!PatchProxy.applyVoidOneRefs(data, null, a.class, "2")) {
                try{
                   Object[] objArray = new Object[i];
                   c.C().w("AegonDiagnosticConfig", "Got response from API server "+a.a.q(data), objArray);
                   if (data.errorCodeSwitch != null) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = data.errorCodeSwitch.entrySet().iterator();
                      while (iterator.hasNext()) {
                         Map$Entry uEntry = iterator.next();
                         if (uEntry.getValue().booleanValue()) {
                            uArrayList.add(Integer.valueOf(Integer.parseInt(uEntry.getKey())));
                         }
                      }
                      DiagnosticManager.setAttentionErrorCodes(Ints.e(uArrayList));
                   }
                }catch(java.lang.Exception e1){
                   objArray1 = new Object[i];
                   c.C().t("AegonDiagnosticConfig", "Got exception while processing response "+e1, objArray1);
                }
             }
          }else {
          label_0099 :
             objArray1 = new Object[i];
             c.C().t("AegonDiagnosticResultReporter", "Got empty response "+p0, objArray1);
          }
       }else {
          goto label_0099 ;
       }
    }
}
