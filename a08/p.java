package a08.p;
import g08.a;
import java.lang.Object;
import l08.c;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import f08.f;
import f08.f$a;
import java.lang.Throwable;
import android.view.View;
import a08.p$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.bowl.event.utils.StageName;
import d08.b;
import c08.a;
import q08.c;
import com.kwaishou.merchant.daccore.pendant.base.PendantState;
import n08.a;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import a08.p$b;
import mv.d;
import java.lang.StringBuilder;
import i08.a;

public final class p	// class@000017
{
    public a a;

    public void p(a p0){
       super();
       this.a = p0;
    }
    public static void b(p p0,c p1,String p2,boolean p3,Map p4,boolean p5,int p6,Object p7){
       f$a a;
       String str2;
       int i = 0;
       String str = (p6 & 0x04)? null: p3;
       String str1 = null;
       Map map = (p6 & 0x08)? str1: p4;
       if (!(p6 & 0x10)) {
          i = p5;
       }
       Objects.requireNonNull(p0);
       if (!str) {
          a = f.a;
          str2 = (p1 != null)? p1.d(): str1;
          if (p1 != null) {
             str1 = p1.e();
          }
          f$a.t(a, str2, str1, p2, map, i, false, 32, null);
       }else {
          a = f.a;
          str2 = (p1 != null)? p1.d(): str1;
          if (p1 != null) {
             str1 = p1.e();
          }
          a.r(str2, str1, p2, null, map);
       }
       return;
    }
    public final void a(c p0){
       if (p0 != null) {
          View view = p0.g();
          if (view != null) {
             k1.o(new p$a(view, this, p0));
          }
       }
       return;
    }
    public final void c(c p0){
       StageName pendant_moun = StageName.pendant_mount_view_start;
       b uob = p0.c();
       String str = null;
       a uoa = (uob != null)? uob.b(): str;
       b uob1 = p0.c();
       String str1 = (uob1 != null)? uob1.e(): str;
       c.b(pendant_moun, p0, uoa, str1);
       View view = p0.g();
       if (view != null) {
          str = null;
          int i = 1;
          a uoa1 = (p0.d.getState() <= PendantState.INIT.getState())? 1: null;
          if (!uoa1) {
             p.b(this, p0, "reject be mount:wrong state", false, null, false, 28, null);
             return;
          }else {
             PendantMountInfo pendantMount = p0.f().e();
             if (pendantMount == null) {
                p.b(this, p0, "mountInfo is null", true, null, false, 24, null);
             }else {
                Pair[] pairArray = new Pair[i];
                pairArray[str] = r0.a("mountInfo", pendantMount);
                p.b(this, p0, "mountInfo data", 0, t0.j0(pairArray), 0, 20, 0);
             }
             k1.o(super(view, pendantMount, this, p0));
          }
       }else {
          b uob2 = p0.c();
          if (uob2 != null) {
             str = uob2.d();
          }
          d.g(str, t0.z());
       }
       return;
    }
    public final void d(c p0,Map p1){
       if (p0 == null) {
          return;
       }
       PendantMountInfo pendantMount = p0.f().e();
       if (pendantMount != null) {
          String area = pendantMount.getArea();
          if (area != null) {
             Pair[] pairArray = new Pair[]{r0.a("updateInfo", p1)};
             p.b(this, p0, "changeMountInfo area:"+area, false, t0.j0(pairArray), false, 20, null);
             View view = p0.g();
             if (view == null) {
                p.b(this, p0, "changeMountInfo error:view null", false, null, false, 28, null);
                return;
             }else {
                p ta = this.a;
                if (ta != null) {
                   a uoa = ta.c(area);
                   if (uoa != null) {
                      uoa.c(p1, view, pendantMount);
                   }
                }
             }
          }
       }
       return;
    }
}
