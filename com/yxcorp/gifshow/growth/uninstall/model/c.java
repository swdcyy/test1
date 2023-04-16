package com.yxcorp.gifshow.growth.uninstall.model.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.growth.uninstall.model.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.growth.uninstall.model.UninstallAppDetainments;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ena.i;
import com.yxcorp.gifshow.growth.uninstall.model.UninstallAppDetainment;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.growth.uninstall.model.b;
import java.lang.Iterable;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import vma.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import ara.e;
import java.util.concurrent.atomic.AtomicBoolean;

public class c extends ConfigAutoParseJsonConsumer	// class@001589
{

    public void c(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else {
          boolean b = i.b(1);
          if (b) {
             p0 = new UninstallAppDetainments();
          }
          if (p0 != null) {
             if (b) {
                UninstallAppDetainment uninstallApp = new UninstallAppDetainment();
                uninstallApp.mIcon = "http://ali2.a.yximgs.com/kos/nlav10225/cleaner_long_click_icon.png";
                uninstallApp.mText = "À¬»ø´ýÇåÀí";
                uninstallApp.mScheme = "kwai://cleaner";
                if (p0.mUninstallAppDetainments == null) {
                   p0.mUninstallAppDetainments = new ArrayList();
                }
                p0.mUninstallAppDetainments.add(uninstallApp);
             }
             if (!i.a(1)) {
                UninstallAppDetainments mUninstallAp = p0.mUninstallAppDetainments;
                if (mUninstallAp != null) {
                   p0.mUninstallAppDetainments = CollectionsKt___CollectionsKt.X1(mUninstallAp, b.b);
                }
             }
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putString("uninstallAppDetainments", b.e(p0.mUninstallAppDetainments));
             g.a(uEditor);
             if (!PatchProxy.applyVoid(null, null, e.class, "4") && e.a.compareAndSet(1, false)) {
                e.c();
             }
          }
       }
    label_007e :
       return;
    }
}
