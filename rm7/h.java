package rm7.h;
import rm7.a;
import pm7.h;
import java.lang.String;
import pm7.m;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.robust2.patchmanager.model.PatchModel;
import java.util.HashMap;
import java.lang.System;
import java.io.File;
import com.kwai.robust2.patchmanager.b;
import android.content.Context;
import com.kwai.robust.PatchFile;
import java.lang.CharSequence;
import android.text.TextUtils;
import qkd.b;
import java.lang.Class;
import com.kwai.robust.Patch$Builder;
import com.kwai.robust.Robust;
import com.kwai.robust.Patch;
import com.kwai.robust2.patchmanager.DownloadHelper;
import rm7.k;
import java.lang.Throwable;
import java.lang.ClassLoader;
import rm7.j;
import rm7.i;
import pm7.e;
import pm7.d;
import pm7.b;
import rm7.i$a;

public class h extends a	// class@0023a3
{

    public void h(h p0){
       super(p0, "Robust2PatchDownload", false, false);
    }
    public void e(m p0){
       this.j(this.a());
    }
    public Map i(){
       Map map = super.i();
       List list = this.a();
       ArrayList uArrayList = new ArrayList();
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().patchId);
          }
       }
       map.put("patchIds", uArrayList);
       return map;
    }
    public final void j(List p0){
       String str;
       CharSequence uCharSequenc;
       String path1;
       Patch patch;
       a uoa = this;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       long l = System.currentTimeMillis();
       if (p0 != null && p0.size() > 0) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj.isRollback != null) {
                uArrayList1.add(obj);
             }else {
                long l1 = System.currentTimeMillis();
                File uFile = new File(b.d(uoa.d.e(), obj.robustId, obj.patchId), "patch.jar");
                b.j(uFile.getParentFile());
                Context uContext = uoa.d.b();
                if (b.p(uFile)) {
                   b.v(uContext, obj, uFile, PatchFile.getOrCreate(uFile.getPath()));
                   str = 1;
                }else {
                   str = null;
                }
                if (str) {
                   PatchFile orCreate = PatchFile.getOrCreate(uFile.getPath());
                   if (b.o(orCreate)) {
                      try{
                         b.u(uoa.d, obj, uFile);
                      }catch(java.lang.Exception e0){
                         try{
                            String path = b.g(uoa.d.e(), obj.robustId, obj.patchId).getPath();
                            e0.extractNativePatch(uoa.d.b(), b.k(), new File(path));
                            b.u(uoa.d, obj, uFile);
                         }catch(java.lang.Exception e0){
                            uCharSequenc = null;
                         }
                         if (!TextUtils.isEmpty(uCharSequenc)) {
                            b.q(new File(uCharSequenc));
                         }
                         throw e0;
                      }catch(java.lang.Exception e0){
                         goto label_00c2 ;
                      }
                   }else {
                      path1 = null;
                   }
                   uArrayList.add(Patch$Builder.patch(PatchModel.class).withId(obj.patchId).withMd5(obj.md5).withRobustId(Robust.get().getRobustId(uoa.d.b())).withLocalPath(uFile.getPath()).withExtra(obj).withFeatureName(obj.featureName).withFeatureVersion(obj.featureVersion).withNativeInstallPath(path1).withApplyTime(e0.getApplyTime()).build());
                   uoa.k(obj);
                }else {
                   b.q(uFile.getParentFile());
                   patch = DownloadHelper.b(uoa.d, obj, uFile);
                   k ok = new k(uoa.d);
                   long l2 = System.currentTimeMillis() - l1;
                   ok.g(l2, null);
                   ok.f(patch);
                   uoa.d.j(ok);
                   uArrayList.add(patch);
                   uoa.k(obj);
                   if (patch.isFeaturePatch() && Robust.get().getCustomLoader(patch.getFeatureName()) == null) {
                      uoa.d.l.put(patch.getId(), patch.getFeatureName());
                      uArrayList.remove(patch);
                   }
                }
             }
          }
       }
       a d = uoa.d;
       i oi = new i(d);
       i$a uoa1 = new i$a(uArrayList, uArrayList1);
       oi.f(uoa1);
       d.j(oi);
       return;
    }
    public final void k(PatchModel p0){
       b.q0(b.e(this.d.e(), this.d.f(), p0.patchId), p0.toJsonString());
    }
}
