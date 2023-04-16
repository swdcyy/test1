package lj7.a;
import android.content.Context;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.hook.component.PluginApplication;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import lj7.c;
import qj7.d;
import li7.a;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.util.List;
import ii7.a;
import java.util.Iterator;
import com.kwai.plugin.dva.repository.model.ContentProviderInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qj7.h;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.ContentProvider;
import com.kwai.plugin.dva.hook.component.contentprovider.ProxyContentProvider;
import java.lang.ClassLoader;

public class a	// class@001d9b
{
    public final Context a;
    public final Map b;

    public void a(Context p0){
       super();
       this.b = new HashMap();
       this.a = p0;
    }
    public void a(Plugin p0,PluginApplication p1){
       boolean b;
       ContentProvider uContentProv1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       p1.setHostApplication(this.a);
       a ta = this.a;
       if (!PatchProxy.applyVoidTwoRefs(ta, p0, null, c.class, "1")) {
          d.c("register contentProviders");
          if (!p0.getPluginInfo().contentProviders.isEmpty()) {
             String str = a.a(ta);
             Iterator iterator = p0.getPluginInfo().contentProviders.iterator();
             while (iterator.hasNext()) {
                ContentProviderInfo uContentProv = iterator.next();
                if (str.equals(uContentProv.authorities)) {
                   continue ;
                }else {
                   ContentProviderInfo process = uContentProv.process;
                   String obj = PatchProxy.applyTwoRefs(ta, process, null, c.class, "2");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else {
                      obj = h.a(ta);
                      if (obj != null) {
                         StringBuilder str1 = ta.getPackageName();
                         if (process == null) {
                            process = "";
                         }
                         if (obj.equals(str1+process)) {
                            b = true;
                         }
                      }
                      b = false;
                   }
                   if (!b) {
                      continue ;
                   }else if(TextUtils.isEmpty(uContentProv.process)){
                      uContentProv1 = c.a(ta, p0, uContentProv);
                      if (uContentProv1 == null || PatchProxy.applyVoidTwoRefs(uContentProv, uContentProv1, null, c.class, "4")) {
                         continue ;
                      }
                   }else {
                      c.a(ta, p0, uContentProv);
                   }
                }
                ProxyContentProvider.getInstance().registerContentProvider(uContentProv.authorities, uContentProv1);
             }
          }
       }
       p1.onCreate();
       return;
    }
    public final PluginApplication b(Context p0,Plugin p1){
       PluginInfo application;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ClassLoader obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       d.c("create application for "+p1.getName());
       if (p1.getPluginInfo() != null) {
          obj = p1.getClassLoader();
          application = p1.getPluginInfo().application;
          PluginApplication pluginApplic = PatchProxy.applyThreeRefs(p0, obj, application, this, a.class, "4");
          if (pluginApplic != patchProxyRe) {
          }else if(TextUtils.isEmpty(application)){
             pluginApplic = null;
          }else {
             try{
                pluginApplic = obj.loadClass(application).newInstance();
             }catch(java.lang.Exception e0){
             }
          }
       }
       return new PluginApplication();
    }
}
