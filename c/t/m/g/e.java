package c.t.m.g.e;
import c.t.m.g.aw;
import java.lang.StringBuilder;
import java.lang.String;
import c.t.m.g.j;
import java.lang.Class;
import c.t.m.g.bu;
import android.content.Context;
import java.io.File;
import c.t.m.g.e$1;
import android.os.Handler;
import c.t.m.g.g;
import java.util.List;
import android.location.Location;
import android.os.Looper;
import c.t.m.g.bt;
import c.t.m.g.e$a;
import java.lang.System;
import c.t.m.g.bp;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Throwable;
import c.t.m.g.h;
import c.t.m.g.av;
import c.t.m.g.f;
import c.t.m.g.cb;
import c.t.m.g.bw;
import java.lang.Math;
import java.util.Collection;
import c.t.m.g.by;
import c.t.m.g.bv$a;
import c.t.m.g.bv;
import java.lang.Long;
import java.lang.Object;
import c.t.m.g.ca;
import java.lang.CharSequence;
import android.text.TextUtils;
import c.t.m.g.e$2;
import java.lang.Runnable;
import c.t.m.g.bn;
import java.lang.Boolean;

public class e extends aw	// class@000c62
{
    public g A;
    public f B;
    public BroadcastReceiver C;
    public Context d;
    public final File e;
    public boolean f;
    public Handler g;
    public long h;
    public long i;
    public int j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public long t;
    public long u;
    public long v;
    public List w;
    public List x;
    public Location y;
    public h z;
    public static final String c;

    static {
       e.c = j.a()+(bu.a(e.class.getName(), "SHA-256")).substring(0, 8);
    }
    public void e(Context p0,File p1){
       super();
       this.d = null;
       this.h = 0x19000;
       this.i = 0x36ee80;
       this.j = 1;
       this.k = 0x6400;
       this.l = 0x6400000;
       this.m = 0xa00000;
       this.n = 0xf731400;
       this.o = 0x9a7ec800;
       this.p = true;
       this.q = false;
       this.r = false;
       this.s = 0;
       this.t = 0xea60;
       this.u = 3000;
       this.v = 0;
       this.C = new e$1(this);
       this.d = p0;
       this.e = p1;
       this.f = false;
    }
    public void e(Context p0,String p1){
       super(p0, new File(p1+"/"+"f_c"));
    }
    public static Handler a(e p0){
       return p0.g;
    }
    public static void a(e p0,Handler p1){
       p0.a(p1);
    }
    public static void a(e p0,File p1,String p2){
       p0.a(p1, p2);
    }
    public static g b(e p0){
       return p0.A;
    }
    public static long c(e p0){
       return p0.h;
    }
    public static String c(){
       return e.c;
    }
    public static boolean d(e p0){
       return p0.i();
    }
    public static File e(e p0){
       return p0.e;
    }
    public static long f(e p0){
       return p0.o;
    }
    public static long g(e p0){
       return p0.l;
    }
    public static long h(e p0){
       return p0.n;
    }
    public static long i(e p0){
       return p0.i;
    }
    public static int j(e p0){
       return p0.j;
    }
    public static List k(e p0){
       return p0.w;
    }
    public static Location l(e p0){
       return p0.y;
    }
    public static List m(e p0){
       return p0.x;
    }
    public static int n(e p0){
       return p0.k;
    }
    public static long o(e p0){
       return p0.m;
    }
    public int a(Looper p0){
       this.h();
       e te = this.e;
       boolean b = (te != null && (te.exists() || this.e.mkdirs()))? true: false;
       this.f = b;
       String str = "DC_Pro";
       if (bt.a()) {
          bt.a(str, "startup! prepared:"+this.f);
       }
       if (this.f != null) {
          this.g = new e$a(this, p0);
          this.v = System.currentTimeMillis() - 0x9c40;
          bp.a(this.g, 107, 0x493e0);
          UniversalReceiver.e(this.d, this.C, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
       }
    label_0073 :
       if (this.f != null && this.p != null) {
          h oh = new h(this.e);
          this.z = oh;
          oh.b(p0);
       }
       if (this.q != null) {
          g og = new g(this.e);
          this.A = og;
          og.b(p0);
       }
       if (this.r != null) {
          f uof = new f();
          this.B = uof;
          uof.b(p0);
       }
       bt.c("FC", "systemInfo,"+cb.d());
       bt.c("FC", "start,"+bw.a(this.p)+","+bw.a(this.q)+","+bw.a(this.r));
       return 0;
    }
    public final long a(long p0,long p1,long p2){
       return Math.max(p1, Math.min(p0, p2));
    }
    public void a(){
       UniversalReceiver.f(this.d, this.C);
       e tz = this.z;
       long l = 100;
       if (tz != null) {
          tz.b(l);
          this.z = null;
       }
       tz = this.A;
       if (tz != null) {
          tz.b(l);
          this.A = null;
       }
       tz = this.B;
       if (tz != null) {
          tz.c();
          this.B = null;
       }
       if (this.i()) {
          bp.a(this.g, 104);
          bp.a(this.g, 106);
          this.v = 0;
          bp.a(this.g, 107);
          bp.a(this.g, 105, 200);
          this.g = null;
       }
       return;
    }
    public void a(int p0,Location p1){
       e tA = this.A;
       if (tA != null) {
          tA.a(p0, p1);
       }
       tA = this.B;
       if (tA != null) {
          tA.a(p0, p1);
       }
       return;
    }
    public void a(long p0,int p1,double p2,double p3,double p4){
       e a = this.A;
       if (a != null) {
          a.a(p0, p1, p2, p3, p4);
       }
       return;
    }
    public synchronized void a(Location p0,List p1,List p2){
       long l = System.currentTimeMillis();
       if (p0 == null || (l - p0.getTime()) - 0x2710 > 0) {
          return;
       }
       this.y = p0;
       this.x = p1;
       this.w = p2;
       if (this.i()) {
          if (p1 == null) {
             if (!by.a(p2)) {
                bp.a(this.g, 102);
             }
          }else if(!by.a(p1)){
             bp.a(this.g, 101);
          }
       }
       return;
    }
    public final void a(Handler p0){
       e uoe = this;
       Handler handler = p0;
       String str = "log_fc_up_in_m";
       String str1 = "LocationSDK";
       bt.a("DC_Pro", "check upload.");
       long l = System.currentTimeMillis();
       if ((l - uoe.v) - 0xea60 < 0) {
          bt.a("DC_Pro", "last upload time: < 1min");
          return;
       }else {
          bp.a(handler, 106);
          bv$a uoa = bv.a();
          boolean b = true;
          if (uoa == bv$a.a) {
             b = false;
          }else if(uoa == bv$a.b){
             boolean f = j.f;
             if (!f && j.g) {
                long l1 = ca.b(str1, str, Long.valueOf(l)).longValue();
                if ((l - l1) - 0x5265c00 > 0) {
                   ca.a(str1, str, Long.valueOf(l));
                   if (bt.a()) {
                      bt.a("DC_Pro", "upload in mobile once today. lastUpT="+l1+",curT="+l);
                   }
                }
             }
             b = f;
          }
          if (bt.a()) {
             bt.a("DC_Pro", "network status:"+uoa+",isUpload:"+b);
          }
          if (b && this.i()) {
             bp.a(handler, 103);
             uoe.v = l;
             if (bt.a()) {
                bt.a("DC_Pro", "send upload msg, last upload time:"+uoe.v);
             }
          }
          return;
       }
    }
    public final void a(File p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       bn.a("th_loc_task_t_consume", new e$2(this, p0, p1));
       return;
    }
    public void a(String p0,String p1){
       int i = this;
       if (("D_UP_INTERVAL").equals(p0)) {
          i.i = Math.max(0xdbba0, Long.parseLong(p1));
       }else if(("D_UP_USE_HTTPS").equals(p0)){
          j.e = Boolean.parseBoolean(p1);
       }else if(("D_MAX_1F_SIZE").equals(p0)){
          i.h = this.a(Long.parseLong(p1), 0x2800, 0x7d000);
       }else if(("D_NUM_UP").equals(p0)){
          i.j = (int)this.a(Long.parseLong(p1), 1, 5);
       }else if(("D_MAX_BUF_WF").equals(p0)){
          i.k = (int)this.a(Long.parseLong(p1), 5120, 0xc800);
       }else if(("D_MAX_FOLDER_SIZE").equals(p0)){
          i.l = this.a(Long.parseLong(p1), 0xa00000, 0xc800000);
       }else if(("D_MAX_SIZE_UP_1DAY").equals(p0)){
          i.m = Math.max(Long.parseLong(p1), 0);
       }else if(("D_MAX_DAY_RENAME").equals(p0)){
          i.n = (((this.a(Long.parseLong(p1), 1, 5) * 24) * 60) * 60) * 1000;
       }else if(("D_MAX_DAY_DELETE").equals(p0)){
          i.o = (((this.a(Long.parseLong(p1), 1, 30) * 24) * 60) * 60) * 1000;
       }else if(("D_UP_WF_INFO").equals(p0)){
          i.p = Boolean.parseBoolean(p1);
       }else if(("D_UP_U_TRACK_INFO").equals(p0)){
          i.q = Boolean.parseBoolean(p1);
       }else if(("D_UP_GPS_FOR_NAVI").equals(p0)){
          i.r = Boolean.parseBoolean(p1);
       }
       return;
    }
    public void a(List p0){
       e tz = this.z;
       if (tz != null) {
          tz.a(p0);
       }
       return;
    }
    public String b(){
       return "DC_Pro";
    }
    public final void h(){
       this.w = null;
       this.x = null;
       this.y = null;
       this.v = 0;
    }
    public final boolean i(){
       return this.f;
    }
}
