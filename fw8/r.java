package fw8.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper$2;
import fw8.r$a;
import fka.e;
import fka.c;
import lnc.v8;
import o56.d;
import tkd.b;
import tkd.d;
import ju5.g;
import lnc.w8;
import ju5.c;
import java.lang.Error;
import k2b.u1;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import android.content.Intent;
import java.util.Iterator;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

public class r	// class@00169b
{
    public final List a;
    public static final r b;

    static {
       r.b = new r();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, r.class, "1")) {
       }else if(PatchProxy.applyVoid(objArray, objArray, PrivacyDialogHelper.class, "1")){
          r.c().a(new PrivacyDialogHelper$2());
       }
       if (!PatchProxy.applyVoid(objArray, objArray, e.class, "1")) {
          r.c().a(new c());
       }
       r.c().a(new v8());
       if (d.i) {
          int i = 0x6ea0c3d0;
          try{
             d.a(i).wr(new w8());
          }catch(java.lang.Error e0){
             u1.R("RelationReportHelper", e0.toString(), 14);
          }
       }
    }
    public void r(){
       super();
       this.a = new CopyOnWriteArrayList();
    }
    public static r c(){
       return r.b;
    }
    public void a(r$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       if (!this.a.contains(p0) && p0 != null) {
          this.a.add(p0);
       }
       return;
    }
    public void b(Intent p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r.class, "12")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          r$a uoa = iterator.next();
          if (uoa != null) {
             uoa.e(p0);
          }
       }
       PatchProxy.onMethodExit(r.class, "12");
       return;
    }
    public void d(FragmentActivity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, r.class, "5")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          r$a uoa = iterator.next();
          if (uoa != null) {
             uoa.f(p0, p1);
          }
       }
       PatchProxy.onMethodExit(r.class, "5");
       return;
    }
    public void e(FragmentActivity p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, r.class, "6")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          r$a uoa = iterator.next();
          if (uoa != null) {
             uoa.i(p0, p1);
          }
       }
       PatchProxy.onMethodExit(r.class, "6");
       return;
    }
    public void f(FragmentActivity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, r.class, "4")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          r$a uoa = iterator.next();
          if (uoa != null) {
             uoa.g(p0, p1);
          }
       }
       PatchProxy.onMethodExit(r.class, "4");
       return;
    }
    public void g(r$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "3")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
}
