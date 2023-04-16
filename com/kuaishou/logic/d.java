package com.kuaishou.logic.d;
import java.lang.Object;
import java.util.List;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.plugin.dva.Dva;
import java.lang.Integer;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import pr3.i;
import io.reactivex.g;

public final class d	// class@0014bd
{

    public void d(){
       super();
    }
    public static t a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "]";
       Object[] objArray = new Object[0];
       a.D().w("RxDvaAPI", "install\(\) called with: soNames = ["+p0+str, objArray);
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (!Dva.instance().isLoaded(str1)) {
             obj.add(str1);
          }
       }
       if (obj.isEmpty()) {
          return t.just(Integer.valueOf(100));
       }
       PluginDownloadExtension.k.b(p0);
       Object[] objArray1 = new Object[0];
       a.D().w("RxDvaAPI", "install\(\) called with: needInstallSo = ["+obj+str, objArray1);
       return t.create(new i(obj));
    }
}
