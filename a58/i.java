package a58.i;
import nh8.b;
import com.mini.app.installer.e;
import a58.j;
import java.lang.Object;
import nh8.a;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.mini.d;
import java.lang.StringBuilder;
import java.lang.System;

public class i implements b	// class@000035
{
    public final j a;
    public final e b;

    public void i(e p0,j p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(boolean p0){
       a.c(this, p0);
    }
    public void b(){
       a.b(this);
    }
    public void c(MiniAppInfo p0){
       a.d(this, p0);
    }
    public void d(int p0,String p1,MiniAppInfo p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, i.class, "1")) {
          return;
       }
       if (d.f()) {
          d.a("BOOTFLOW", "JSFrameworkInstallerProxy.onCallBack\(\) "+p2.toString());
       }
       i ta = this.a;
       boolean b = (!p0)? true: false;
       ta.a(b, p2, System.currentTimeMillis());
       return;
    }
    public void e(MiniAppInfo p0){
       a.a(this, p0);
    }
}
