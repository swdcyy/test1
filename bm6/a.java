package bm6.a;
import tv6.c;
import f66.i;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import bm6.a$a;
import bm6.a$b;
import com.google.gson.JsonObject;
import tv6.b;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import q87.c;
import iv6.a;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent;

public class a extends i implements c	// class@0004f3
{
    public static final boolean c;

    static {
       a.c = a.t().d("disableCdnResourceLog", false);
    }
    public void a(){
       super("DynamicPrefetch", false);
    }
    public void a(a$a p0){
       super("DynamicPrefetch", false);
    }
    public static a C(){
       return a$b.a;
    }
    public void a(String p0,String p1,String p2,JsonObject p3){
       b.a(this, p0, p1, p2, p3);
    }
    public void b(String p0,String p1,String p2,Map p3){
       b.c(this, p0, p1, p2, p3);
    }
    public void c(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "9")) {
          return;
       }
       u1.R(p2, p3, 14);
       return;
    }
    public void h(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().t(p0, p1, objArray);
       return;
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       h$b uob = h$b.e(7, "KwaiDynamicPrefetchLogger");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
       photoPackage.identity = p0.a;
       uContentPack.photoPackage = photoPackage;
       uob.h(uContentPack);
       b.a(0x4b316083).J(uob);
       return;
    }
    public void j(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w(p0, p1, objArray);
       return;
    }
    public void l(String p0,String p1,String p2,int p3,String p4,String p5,String p6){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, uoa, "8")) {
             return;
          }
       }
       if (TextUtils.isEmpty(p6)) {
          p6 = "UNKNOWN";
       }
       i3 oi3 = i3.f();
       oi3.d("source", p0);
       oi3.d("taskState", p1);
       oi3.d("photoId", p2);
       oi3.c("offset", Integer.valueOf(p3));
       oi3.d("username", p4);
       oi3.d("caption", p5);
       oi3.d("page", p6);
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       ClientStat$CustomStatEvent uCustomStatE = new ClientStat$CustomStatEvent();
       uCustomStatE.key = "KwaiDynamicPrefetchLogger";
       uCustomStatE.value = oi3.e();
       uCustomStatE.biz = 14;
       statPackage.customStatEvent = uCustomStatE;
       b.a(0x4b316083).j(statPackage);
       return;
    }
    public void m(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w(p0, p1, objArray);
       return;
    }
    public void n(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w(p0, p1, objArray);
       return;
    }
}
