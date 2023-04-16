package bx6.e;
import qvb.q;
import com.kwai.library.slide.base.widget.a$a;
import uw6.e;
import yw6.h;
import bx6.b;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.System;
import bw6.a;
import cw6.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import lw6.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import p1b.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import yw6.g;
import qvb.p;

public class e implements q, a$a	// class@0004ab
{
    public long b;
    public long c;
    public boolean d;
    public g e;
    public final e f;
    public final h g;
    public final b h;
    public WeakReference i;

    public void e(e p0,h p1,b p2){
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = (p2.b() != null)? new WeakReference(p2.b()): null;
       return;
    }
    public void M1(boolean p0,Throwable p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoe, "8")) {
          return;
       }
       if (this.b - null) {
          this.d = false;
          this.c = System.currentTimeMillis() - this.b;
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, e.class, "6")) {
          return;
       }
       this.b = System.currentTimeMillis();
       return;
    }
    public void b(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "4")) {
          return;
       }
       if (this.b - null && !this.g.i()) {
          QPhoto qPhoto = this.f.Z();
          e tc = this.c;
          e td = this.d;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(tc), Boolean.valueOf(td), qPhoto, this, e.class, "5")) {
             a.b("SlideUpCatonEventUpload", "SLIDE_UP_LOAD_MORE upload");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SLIDE_UP_LOAD_MORE";
             i3 oi3 = i3.f();
             oi3.c("lastRequestCost", Long.valueOf(tc));
             String str = (td != null)? "success": "fail";
             oi3.d("lastRequestResult", str);
             str = "";
             String str1 = (qPhoto == null)? str: qPhoto.getPhotoId();
             oi3.d("latestPhotoId", str1);
             if (qPhoto != null) {
                str = qPhoto.getExpTag();
             }
             oi3.d("exptag", str);
             String str2 = this.h.e();
             if (!TextUtils.x(str2)) {
                oi3.d("poorNetSessionId", str2);
             }
             int i = this.h.c();
             if (i >= 0) {
                oi3.c("prefetchPoolSize", Integer.valueOf(i));
             }
             oi3.c("netScore", Integer.valueOf(NetworkQualityEstimator.b()));
             e ti = this.i;
             if (ti != null && ti.get() != null) {
                str2 = b.o0(this.i.get()).p0();
                if (str2 == null) {
                   str2 = "null";
                }
                oi3.d("loadMoreDecision", str2);
             }
             uElementPack.params = oi3.toString();
             u1.u(9, uElementPack, null);
          }
       }
       return;
    }
    public void c(){
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e te = this.e;
       if (te != null) {
          te.S0(this);
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoe, "7")) {
          return;
       }
       if (this.b - null) {
          this.d = true;
          this.c = System.currentTimeMillis() - this.b;
       }
       return;
    }
}
