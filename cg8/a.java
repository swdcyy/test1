package cg8.a;
import cg8.b;
import dg8.d;
import dg8.g;
import dg8.a;
import dg8.b;
import dg8.c;
import java.lang.String;
import com.mini.packagemanager.model.MiniAppPackageInfo;
import com.mini.packagemanager.model.MainPackageModel;
import com.mini.packagemanager.model.FrameworkModel;
import com.mini.packagemanager.model.MiniAppDetailInfo;
import java.util.List;

public final class a	// class@000404
{

    public static void a(b p0){
       p0.c();
       p0.g();
       p0.G();
       p0.E();
    }
    public static void b(b p0){
       p0.m();
    }
    public static MiniAppPackageInfo c(b p0,String p1,int p2,String p3){
       MiniAppPackageInfo miniAppPacka = new MiniAppPackageInfo();
       MainPackageModel mainPackageM = p0.j(p1, p2, p3);
       miniAppPacka.mainPackageModel = mainPackageM;
       miniAppPacka.frameworkModel = p0.s(mainPackageM.frameworkVersionCode);
       miniAppPacka.appDetailInfo = p0.H(p1);
       return miniAppPacka;
    }
    public static void d(b p0,MiniAppPackageInfo p1){
       MiniAppPackageInfo frameworkMod = p1.frameworkModel;
       if (frameworkMod != null) {
          p0.N(frameworkMod);
       }
       frameworkMod = p1.mainPackageModel;
       if (frameworkMod != null) {
          p0.w(frameworkMod);
       }
       frameworkMod = p1.appDetailInfo;
       if (frameworkMod != null) {
          p0.q(frameworkMod);
       }
       p1 = p1.subPackageModels;
       if (p1 != null) {
          p0.d(p1);
       }
       return;
    }
    public static void e(b p0,String p1){
       p0.e(p1);
       p0.O(p1);
    }
    public static void f(b p0,String[] p1){
       p0.t(p1);
       p0.F(p1);
    }
}
