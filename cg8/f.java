package cg8.f;
import dg8.e;
import n88.b;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Long;
import com.mini.packagemanager.model.PackageLifecycleItem;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Collections;
import com.mini.d;
import com.mini.host.HostSwitchConfigManager;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.mini.packagemanager.database.MiniPackageLifecycleRecordDb;
import oi8.l;
import com.mini.filemanager.b;
import com.mini.packagemanager.database.b;
import com.mini.utils.g$a;
import com.mini.utils.g;

public class f implements e	// class@00041c
{
    public e a;
    public b b;

    public void f(b p0){
       super();
       this.b = p0;
    }
    public static boolean e(File p0){
       boolean b = (p0 != null && (p0.getName() != null && (p0.getName()).startsWith("mini_package_lifecycle_record.db")))? true: false;
       return b;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       try{
          this.g();
          this.a.a(p0);
       }catch(java.lang.Exception e3){
          this.f(e3);
       }
       return;
    }
    public void b(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "7")) {
          return;
       }
       try{
          this.g();
          this.a.b(p0);
       }catch(java.lang.Exception e4){
          this.f(e4);
       }
       return;
    }
    public PackageLifecycleItem c(List p0,List p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          this.g();
          return this.a.c(p0, p1, p2);
       }catch(java.lang.Exception e7){
          this.f(e7);
          return null;
       }
    }
    public List d(long p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, uof, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          this.g();
          return this.a.d(p0, p1);
       }catch(java.lang.Exception e5){
          this.f(e5);
          return Collections.emptyList();
       }
    }
    public final void f(Throwable p0){
       boolean b;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "2")) {
          return;
       }
       d.s(p0);
       if (this.b.G().getValue("mini_config_delete_corrupt_db", Boolean.TYPE, Boolean.TRUE).booleanValue()) {
          Object obj = PatchProxy.applyOneRefs(p0, this, uof, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p0 instanceof IllegalStateException && (p0.getMessage() != null && (p0.getMessage()).startsWith("Room cannot verify the data integrity"))){
             b = true;
          }else {
             b = false;
          }
          if (b && !PatchProxy.applyVoidOneRefs(p0, this, uof, "3")) {
             d.c("package_manager", "delete package lifecycle database "+p0.getMessage());
             MiniPackageLifecycleRecordDb.F(this.b).g();
             this.b.n0().technologyEventLog(null, "mini_config_delete_corrupt_db", p0.getMessage());
             this.a = null;
             String str = this.b.a0().x3();
             b a = b.a;
             g.n(str, a);
          }
       }
    label_00c4 :
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.a = MiniPackageLifecycleRecordDb.F(this.b).E();
       }
       return;
    }
}
