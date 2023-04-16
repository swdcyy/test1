package nd6.e;
import yi5.a;
import nd6.e$a;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.google.gson.Gson;
import vi5.j;
import vi5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import nd6.e$e;
import java.lang.Runnable;
import nd6.e$c;
import nd6.e$d;
import java.lang.Integer;
import java.lang.Boolean;
import nd6.e$f;
import nd6.e$b;
import t45.c;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.plugin.ui.dialog.PluginInstallerDialog;
import com.kwai.framework.plugin.ui.page.PluginInstallerPage;

public final class e implements a	// class@001f33
{
    public final Gson a;
    public static final ConcurrentHashMap b;
    public static final e$a c;

    static {
       e.c = new e$a(null);
       e.b = new ConcurrentHashMap();
    }
    public void e(){
       super();
       this.a = new Gson();
    }
    public void a(j p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "6")) {
          return;
       }
       a.p(p0, "converter");
       a.p(p1, "installerUI");
       return;
    }
    public void b(j p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       a.p(p0, "converter");
       a.p(p1, "installerUI");
       this.g(new e$e(this, p1, p0));
       return;
    }
    public void c(j p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "4")) {
          return;
       }
       a.p(p0, "converter");
       a.p(p1, "installerUI");
       return;
    }
    public void d(j p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       a.p(p0, "converter");
       a.p(p1, "installerUI");
       this.g(new e$c(this, p1, p0));
       return;
    }
    public void e(j p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       a.p(p0, "converter");
       a.p(p1, "installerUI");
       this.g(new e$d(this, p1, p0));
       return;
    }
    public void f(int p0,j p1,c p2,boolean p3,boolean p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
             return;
          }
       }
       a.p(p1, "converter");
       a.p(p2, "installerUI");
       e$f uof = new e$f(this, p2, p3, p1, p0, p4);
       this.g(uoe);
       return;
    }
    public final void g(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       c.a(new e$b(p0));
       return;
    }
    public final void h(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "8")) {
          return;
       }
       u1.Q(p0, p1);
       return;
    }
    public final int i(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int pluginType = p0.getPluginType();
       int i = 2;
       if (pluginType != 1) {
          if (pluginType != i) {
             i = -1;
          }
       }else {
          i = 1;
       }
       return i;
    }
    public final int j(c p0){
       int i;
       if (p0 instanceof PluginInstallerDialog) {
          i = 1;
       }else if(p0 instanceof PluginInstallerPage){
          i = 2;
       }else {
          i = -1;
       }
       return i;
    }
}
