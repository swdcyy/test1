package ara.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import ara.e$c;
import java.util.concurrent.ExecutorService;
import t45.c;
import kb.e;
import java.util.concurrent.Executor;
import android.os.Build$VERSION;
import ara.e$a;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import vma.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.content.pm.ShortcutManager;
import wh5.c;
import java.util.ArrayList;
import cra.w;
import q87.c;
import oe6.a;
import java.util.Iterator;
import com.yxcorp.gifshow.growth.uninstall.model.UninstallAppDetainment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.Math;
import java.util.HashMap;
import ara.e$b;
import java.util.Map;

public final class e	// class@0002cd
{
    public static AtomicBoolean a;

    static {
       e.a = new AtomicBoolean(false);
    }
    public void e(){
       super();
    }
    public static void a(String p0,ImageCallback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "7")) {
          return;
       }
       Fresco.getImagePipeline().fetchDecodedImage(ImageRequest.c(p0), null).f(new e$c(p1), c.c());
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, e.class, "3")) {
          return;
       }
       e.a.set(true);
       return;
    }
    public static void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, e.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 25) {
          List list = a.j(new e$a().getType());
          Context applicationC = a.a().a().getApplicationContext();
          Object obj = applicationC.getSystemService("shortcut");
          if (c.b()) {
             obj.setDynamicShortcuts(new ArrayList());
             return;
          }else {
             String str = "UninstallAppDetainmentHelper";
             int i = 0;
             if (list == null) {
                obj.setDynamicShortcuts(new ArrayList());
                objArray = new Object[i];
                w.C().s(str, "uninstallAppDetainments = null, return", objArray);
                return;
             }else if(!a.a()){
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   UninstallAppDetainment uninstallApp = iterator.next();
                   if (!TextUtils.x(uninstallApp.mScheme) && (uninstallApp.mScheme).contains("//retain?")) {
                      objArray = uninstallApp;
                   }
                }
                if (objArray != null) {
                   list.remove(objArray);
                }
             }
             Object[] objArray1 = new Object[i];
             w.C().s(str, "uninstallAppDetainments : "+list, objArray1);
             int i1 = Math.min(list.size(), obj.getMaxShortcutCountPerActivity());
             HashMap hashMap = new HashMap();
             ArrayList uArrayList = new ArrayList(i1);
             int i2 = 0;
             while (i2 < i1) {
                UninstallAppDetainment uninstallApp1 = list.get(i2);
                if (uninstallApp1 == null || (TextUtils.x(uninstallApp1.mIcon) || (!TextUtils.x(uninstallApp1.mScheme) && !TextUtils.x(uninstallApp1.mText)))) {
                   uArrayList.add(list.get(i2));
                }
                i2 = i2 + 1;
             }
             for (int i3 = 0; i3 < uArrayList.size(); i3 = i3 + 1) {
                Object obj1 = uArrayList.get(i3);
                e$b uob = new e$b(hashMap, obj1, uArrayList, i1, applicationC, obj);
                e.a(obj1.mIcon, v14);
             }
          }
       }
       return;
    }
}
