package bi7.e;
import bi7.d;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.io.File;
import bi7.e$b;
import java.util.Map;
import java.lang.Integer;
import com.kwai.video.hodor.util.Timber;
import java.util.Collection;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import bi7.e$a;
import java.lang.Runnable;
import bi7.a;
import java.lang.Boolean;

public class e extends d	// class@00041a
{
    public final Map e;

    public void e(){
       super();
       this.e = new HashMap();
    }
    public static String f(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"_"+p1;
    }
    public synchronized void a(File p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "6")) {
          return;
       }
       e$b uob = this.g(p1, p2);
       if (uob == null) {
          return;
       }
       if (PatchProxy.applyVoidOneRefs(uob, this, e.class, "3")) {
       }else {
          this.e.remove(uob.b());
       }
       File uFile = new File(uob.c);
       if (uFile.exists()) {
          Object[] objArray = new Object[2];
          int i = 0;
          objArray[0] = uFile.getAbsolutePath();
          if (uFile.delete()) {
             i = 1;
          }
          objArray[1] = Integer.valueOf(i);
          Timber.e("[VPP] delete raw file: path=%s ret=%d", objArray);
       }
       return;
    }
    public void b(File p0,String p1,String p2,String p3){
       d uod = this;
       File uFile = p0;
       String str = p1;
       String str1 = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "5")) {
          return;
       }
       if (!uFile) {
          return;
       }
       d b = uod.b;
       if (b == null) {
          return;
       }
       int i = 2;
       int i1 = 1;
       if (!p0.exists()) {
          Object[] objArray = new Object[i];
          objArray[0] = p0.getAbsolutePath();
          objArray[i1] = Integer.valueOf(p0.mkdirs());
          Timber.i("[VPP] make dirs: path=%s ret=%d", objArray);
       }
       if (uod.g(str, str1) != null) {
          return;
       }else {
          e$b uob = new e$b(str, str1);
          File uFile1 = uob.c(uFile);
          if (uFile1.exists()) {
             uob.c = uFile1.getAbsolutePath();
             uod.h(uob);
             return;
          }else {
             _monitor_enter(this);
             if (PatchProxy.applyVoidTwoRefs(uFile, str, uod, e.class, "8")) {
                _monitor_exit(this);
             }else {
                Iterator iterator = uod.e.values().iterator();
                int i2 = 0;
                while (iterator.hasNext()) {
                   if (TextUtils.equals(iterator.next().a, str)) {
                      i2 = i2 + 1;
                   }
                }
                File[] uFileArray = p0.listFiles();
                if (uFileArray != null) {
                   int len = uFileArray.length;
                   int i3 = 0;
                   while (true) {
                      if (i3 < len) {
                         object oobject = uFileArray[i3];
                         if (oobject == null) {
                            _monitor_exit(this);
                            break ;
                         }else if((oobject.getName()).startsWith(str)){
                            if ((oobject.getName()).endsWith(".dat")) {
                               String str2 = "[VPP] delete dat file: path=%s ret=%d";
                               Object[] objArray2 = new Object[i];
                               objArray2[0] = oobject.getAbsolutePath();
                               int i4 = (oobject.delete())? 1: 0;
                               objArray2[1] = Integer.valueOf(i4);
                               Timber.e(str2, objArray2);
                            }
                            if ((oobject.getName()).endsWith(".raw") && !i2) {
                               String str3 = "[VPP] delete raw file: path=%s ret=%d";
                               Object[] objArray3 = new Object[i];
                               objArray3[0] = oobject.getAbsolutePath();
                               i1 = (oobject.delete())? 1: 0;
                               objArray3[1] = Integer.valueOf(i1);
                               Timber.e(str3, objArray3);
                            }
                         }
                      label_0104 :
                         i3 = i3 + 1;
                         StringBuilder str4 = 1;
                      }
                   }
                }
                _monitor_exit(this);
             }
             b.a(p2, "vpp_res_"+str+"_"+str1, uob.a(uFile).getAbsolutePath(), new e$a(uod, uFile, uob));
             uod.h(uob);
             Object[] objArray1 = new Object[]{str1};
             Timber.i("[VPP] download submit task success, md5=%s", objArray1);
             return;
          }
       }
    }
    public String d(File p0,String p1,String p2,String p3){
       p2 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, e.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (p0 != null && p0.exists()) {
          e$b uob = this.g(p1, p3);
          if (uob != null) {
             p1 = PatchProxy.apply(null, uob, e$b.class, "1");
             boolean b = (p1 != PatchProxyResult.class)? p1.booleanValue(): TextUtils.isEmpty(uob.c) ^ 0x01;
             if (b) {
                return uob.c;
             }
          }
       }
       return null;
    }
    public synchronized final e$b g(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.get(e.f(p0, p1));
    }
    public synchronized final void h(e$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.e.put(p0.b(), p0);
       return;
    }
}
