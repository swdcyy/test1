package l89.a;
import com.yxcorp.gifshow.apm.ApmTracker$Dex2oatInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Long;
import com.yxcorp.gifshow.apm.ApmTracker$Dex2oatFileInfo;
import java.util.ArrayList;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import ukd.a;
import java.lang.Integer;
import ekd.e0;
import android.content.Context;
import java.io.File;
import java.lang.NullPointerException;
import java.lang.Throwable;
import android.content.pm.ApplicationInfo;
import com.yxcorp.utility.AbiUtil;

public final class a	// class@002cce
{
    public static ApmTracker$Dex2oatInfo a;
    public static boolean b;
    public static final a c;

    static {
       a.c = new a();
       a.a = new ApmTracker$Dex2oatInfo();
    }
    public void a(){
       super();
    }
    public final void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       if (this.c().extraInfos == null) {
          this.c().extraInfos = new HashMap();
       }
       ApmTracker$Dex2oatInfo extraInfos = this.c().extraInfos;
       a.o(extraInfos, "dex2oatInfo.extraInfos");
       extraInfos.put(p0, p1);
       return;
    }
    public final void b(String p0,long p1,long p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, a.class, "3")) {
          return;
       }
       ApmTracker$Dex2oatFileInfo uDex2oatFile = new ApmTracker$Dex2oatFileInfo();
       uDex2oatFile.filename = p0;
       uDex2oatFile.filesize = p1;
       uDex2oatFile.filemodify = p2;
       if (this.c().dex2oatFileInfoList == null) {
          p0.dex2oatFileInfoList = new ArrayList();
       }
       this.c().dex2oatFileInfoList.add(uDex2oatFile);
       return;
    }
    public final ApmTracker$Dex2oatInfo c(){
       File uFile1;
       long l3;
       a uoa = a.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.b) {
          obj = "GlobalConfig.CONTEXT";
          if (!PatchProxy.applyVoid(objArray, this, uoa, "2") && !a.b) {
             boolean b = true;
             a.b = b;
             int i = 2;
             int i1 = 0;
             Object[] objArray1 = new Object[i1];
             Context obj1 = a.b("android.os.UserHandle", "myUserId", objArray1);
             if (obj1 != null) {
                Object[] objArray2 = new Object[i];
                objArray2[i1] = Integer.valueOf(obj1.intValue());
                obj1 = e0.b;
                a.o(obj1, obj);
                String packageName = obj1.getPackageName();
                a.o(packageName, "GlobalConfig.CONTEXT.packageName");
                objArray2[b] = packageName;
                File obj2 = a.b("android.os.Environment", "getDataProfilesDePackageDirectory", objArray2);
                if (obj2 != null) {
                   File uFile = new File(obj2, "primary.prof");
                   long l = uFile.lastModified();
                   long l1 = uFile.length();
                   this.c().primaryFileSize = l1;
                   this.c().primaryFileLastModified = l;
                   this.b("primary.prof", l1, l);
                   Context b1 = e0.b;
                   a.o(b1, obj);
                   obj2 = new File(b1.getApplicationInfo().nativeLibraryDir);
                   String str = "nativeLibDir.parentFile";
                   if (AbiUtil.b()) {
                      obj2 = obj2.getParentFile();
                      a.o(obj2, str);
                      uFile1 = new File(obj2.getParentFile(), "oat/arm64");
                   }else {
                      obj2 = obj2.getParentFile();
                      a.o(obj2, str);
                      uFile1 = new File(obj2.getParentFile(), "oat/arm");
                   }
                   File[] uFileArray = new File[]{new File(uFile1.getAbsolutePath(), "base.odex"),new File(uFile1.getAbsolutePath(), "base.vdex"),new File(uFile1.getAbsolutePath(), "base.art")};
                   for (; i1 < 3; i1 = i1 + 1) {
                      object oobject = uFileArray[i1];
                      a.m(oobject);
                      String name = oobject.getName();
                      long l2 = 0;
                      if (oobject.exists()) {
                         l3 = oobject.lastModified();
                         l2 = oobject.length();
                      }else {
                         l3 = l2;
                      }
                      this.b(name, l2, l3);
                   }
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type java.io.File");
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
             }
          }
       }
       return a.a;
    }
}
