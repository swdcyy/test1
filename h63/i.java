package h63.i;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import i63.b;
import dz1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.SystemClock;
import com.kwai.live.gzone.tab.bean.LiveGzoneTab;
import com.kwai.live.gzone.tab.page.a;
import java.lang.Integer;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;

public class i	// class@002c81
{
    public long a;
    public String b;
    public String c;
    public int d;
    public long e;
    public boolean f;
    public String g;

    public void i(){
       super();
       this.a = -1;
    }
    public long a(ClientContent$LiveStreamPackage p0,e0 p1,b p2){
       int i;
       i this;
       i e;
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       ClientContent$ContentPackage uContentPack;
       i3 oi31;
       i oi = this;
       object oobject = p0;
       a uoa = a.class;
       i obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (oi.b == null || (v4 = oi.a) < 0) {
          return -1;
       }
       if (v4 > 0) {
          oi.e = oi.e + (SystemClock.elapsedRealtime() - oi.a);
       }
       obj = oi.g;
       String str = "stay_length";
       i = 3;
       int i1 = 1;
       if (obj != null) {
          String str1 = (p2 != null)? p2.t().d(): obj;
          String str2 = (p2 != null)? p2.t().e(): oi.g;
          int i2 = (p2 != null)? p2.n(): 0;
          i b = oi.b;
          i c = oi.c;
          this = oi.d;
          e = oi.e;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[10];
             objArray[0] = obj;
             objArray[i1] = str1;
             objArray[2] = str2;
             objArray[i] = Integer.valueOf(i2);
             objArray[4] = b;
             objArray[5] = c;
             objArray[6] = Integer.valueOf(this);
             objArray[7] = Long.valueOf(e);
             objArray[8] = oobject;
             objArray[9] = p1;
             if (!PatchProxy.applyVoid(objArray, null, uoa, "39")) {
             }
          }else {
          }
       }else if(p2 != null){
          String str3 = p2.t().d();
          String str4 = p2.t().e();
          int this1 = p2.n();
          e = oi.c;
          i b1 = oi.b;
          i d = oi.d;
          i e1 = oi.e;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray1 = new Object[9];
             objArray1[0] = str3;
             objArray1[i1] = str4;
             objArray1[2] = Integer.valueOf(this1);
             objArray1[i] = e;
             objArray1[4] = b1;
             objArray1[5] = Integer.valueOf(d);
             objArray1[6] = Long.valueOf(e1);
             objArray1[7] = oobject;
             objArray1[8] = p1;
             if (!PatchProxy.applyVoid(objArray1, null, uoa, "38")) {
             }
          }else {
          }
       }else if(!SystemUtil.I()){
          throw new RuntimeException("gzone log error");
       }
       oi.b = null;
       oi.c = null;
       oi.d = 0;
       oi.a = -1;
       oi.f = false;
       return oi.e;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       i ta = this.a;
       if (ta >= 0 && this.b != null) {
          if (ta > 0) {
             this.e = this.e + (SystemClock.elapsedRealtime() - this.a);
          }
          this.f = false;
          this.a = 0;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       long l = SystemClock.elapsedRealtime();
       i ta = this.a;
       if (ta - null > 0) {
          this.e = this.e + (l - ta);
       }
       this.a = l;
       this.f = true;
       return;
    }
    public void d(String p0,String p1,int p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, i.class, "1")) {
          return;
       }
       this.e(p0, p1, p2, null);
       return;
    }
    public void e(String p0,String p1,int p2,String p3){
       this.g = p3;
       this.e = 0;
       this.a = -1;
       this.f = false;
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
}
