package cg8.e;
import cg8.b;
import n88.b;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import dg8.g;
import java.lang.Throwable;
import java.util.ArrayList;
import dg8.c;
import com.mini.packagemanager.model.MiniAppPackageInfo;
import dg8.d;
import dg8.b;
import dg8.a;
import com.mini.packagemanager.model.MiniAppDetailInfo;
import com.mini.packagemanager.model.MainPackageModel;
import com.mini.packagemanager.model.FrameworkModel;
import com.mini.packagemanager.database.MiniPackageDb;
import androidx.room.RoomDatabase;
import com.mini.d;
import com.mini.host.HostSwitchConfigManager;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import oi8.l;
import com.mini.filemanager.b;
import com.mini.packagemanager.database.a;
import com.mini.utils.g$a;
import com.mini.utils.g;
import com.mini.packagemanager.model.SubPackageModel;
import cg8.a;

public class e implements b	// class@00041b
{
    public b a;
    public b b;

    public void e(b p0){
       super();
       this.b = p0;
    }
    public static boolean P(File p0){
       boolean b = (p0 != null && (p0.getName() != null && (p0.getName()).startsWith("mini_package_3.db")))? true: false;
       return b;
    }
    public List A(String p0,int p1,String p2){
       List obj;
       ArrayList uArrayList;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.A(p0, p1, p2);
       }
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public List B(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S();
       obj = this.a;
       if (obj != null) {
          objArray = obj.B();
       }
       if (objArray == null) {
          objArray = new ArrayList();
       }
       return objArray;
    }
    public void C(MiniAppPackageInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "38")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.C(p0);
       }
       return;
    }
    public List D(String p0){
       ArrayList uArrayList;
       List obj = PatchProxy.applyOneRefs(p0, this, e.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.D(p0);
       }
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, e.class, "44")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.E();
       }
       return;
    }
    public void F(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "30")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.F(p0);
       }
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.G();
       }
       return;
    }
    public MiniAppDetailInfo H(String p0){
       MiniAppDetailInfo obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.H(p0);
       }
       return obj;
    }
    public List I(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S();
       obj = this.a;
       if (obj != null) {
          objArray = obj.I();
       }
       if (objArray == null) {
          objArray = new ArrayList();
       }
       return objArray;
    }
    public List J(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S();
       obj = this.a;
       if (obj != null) {
          objArray = obj.J();
       }
       if (objArray == null) {
          objArray = new ArrayList();
       }
       return objArray;
    }
    public void K(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "13")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.K(p0);
       }
       return;
    }
    public void L(MainPackageModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "17")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.L(p0);
       }
       return;
    }
    public void M(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "24")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.M(p0);
       }
       return;
    }
    public void N(FrameworkModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.N(p0);
       }
       return;
    }
    public void O(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "31")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.O(p0);
       }
       return;
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, e.class, "40")) {
          return;
       }
       MiniPackageDb.E(this.b).f();
       return;
    }
    public final void R(Throwable p0){
       boolean b;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "2")) {
          return;
       }
       d.s(p0);
       if (this.b.G().getValue("mini_config_delete_corrupt_db", Boolean.TYPE, Boolean.TRUE).booleanValue()) {
          Object obj = PatchProxy.applyOneRefs(p0, this, uoe, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(p0 instanceof IllegalStateException && (p0.getMessage() != null && (p0.getMessage()).startsWith("Room cannot verify the data integrity"))){
             b = true;
          }else {
             b = false;
          }
          if (b && !PatchProxy.applyVoidOneRefs(p0, this, uoe, "4")) {
             d.c("package_manager", "delete database "+p0.getMessage());
             MiniPackageDb.E(this.b).g();
             this.b.n0().technologyEventLog(null, "mini_config_delete_corrupt_db", p0.getMessage());
             this.a = null;
             String str = this.b.a0().x3();
             a a = a.a;
             g.n(str, a);
          }
       }
    label_00c4 :
       return;
    }
    public final void S(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       if (this.a == null) {
          this.a = MiniPackageDb.E(this.b).F();
       }
       return;
    }
    public void a(String p0,int p1,String p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "32")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.a(p0, p1, p2);
       }
       return;
    }
    public void b(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "15")) {
          return;
       }
       this.S();
       uoe = this.a;
       if (uoe != null) {
          uoe.b(p0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "25")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.c();
       }
       return;
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "27")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.d(p0);
       }
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "18")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.e(p0);
       }
       return;
    }
    public void f(SubPackageModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "26")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.f(p0);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, e.class, "36")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.g();
       }
       return;
    }
    public MiniAppPackageInfo getMiniAppInfo(String p0,int p1,String p2){
       MiniAppPackageInfo obj;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.getMiniAppInfo(p0, p1, p2);
       }
       if (obj == null) {
          obj = new MiniAppPackageInfo();
       }
       return obj;
    }
    public void h(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "43")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.h(p0);
       }
       return;
    }
    public void i(){
       a.b(this);
    }
    public MainPackageModel j(String p0,int p1,String p2){
       MainPackageModel obj;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.j(p0, p1, p2);
       }
       return obj;
    }
    public void k(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "41")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.k(p0);
       }
       return;
    }
    public void l(SubPackageModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "28")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.l(p0);
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, e.class, "14")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.m();
       }
       return;
    }
    public List n(String p0,String p1){
       ArrayList uArrayList;
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.n(p0, p1);
       }
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public void o(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "29")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.o(p0);
       }
       return;
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "39")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.p(p0);
       }
       return;
    }
    public void q(MiniAppDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.q(p0);
       }
       return;
    }
    public List r(){
       e obj = PatchProxy.apply(null, this, e.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S();
       obj = this.a;
       if (obj != null) {
          return obj.r();
       }
       return new ArrayList();
    }
    public FrameworkModel s(int p0){
       FrameworkModel obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.s(p0);
       }
       return obj;
    }
    public void t(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "19")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.t(p0);
       }
       return;
    }
    public void u(String[] p0){
       a.f(this, p0);
    }
    public void v(){
       a.a(this);
    }
    public void w(MainPackageModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "16")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.w(p0);
       }
       return;
    }
    public List x(String p0){
       ArrayList uArrayList;
       List obj = PatchProxy.applyOneRefs(p0, this, e.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.x(p0);
       }
       if (obj == null) {
          uArrayList = new ArrayList();
       }
       return uArrayList;
    }
    public void y(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "10")) {
          return;
       }
       this.S();
       e ta = this.a;
       if (ta != null) {
          ta.y(p0);
       }
       return;
    }
    public SubPackageModel z(String p0,String p1,int p2,String p3){
       SubPackageModel obj;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, e.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.S();
       obj = null;
       e ta = this.a;
       if (ta != null) {
          obj = ta.z(p0, p1, p2, p3);
       }
       return obj;
    }
}
