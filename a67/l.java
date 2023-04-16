package a67.l;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a67.l$a;
import a67.j;
import a67.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import oq5.c;
import oq5.a;
import eq5.a;
import lp3.c;
import lp3.e;
import eq5.a$a;
import com.kwai.library.widget.popup.common.c;
import a67.b;
import a67.b$a;
import a67.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import d61.y;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import android.view.View;
import android.widget.LinearLayout;
import io.reactivex.subjects.PublishSubject;
import t45.d;
import brd.z;
import brd.t;
import a67.k;
import bp6.a;
import erd.g;
import crd.b;
import a67.l$b;
import android.view.View$OnClickListener;
import tkd.b;
import tkd.d;
import os5.h;
import android.view.ViewGroup;
import a67.p;
import java.util.Map;
import java.util.HashMap;

public class l extends PresenterV2 implements g	// class@000062
{
    public a p;
    public e q;
    public LinearLayout r;
    public View s;
    public b t;
    public l$c u;
    public h v;
    public c w;
    public a$a x;

    public void l(){
       super();
       this.u = new l$a(this);
       this.w = new j(this);
       this.x = new i(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.R8();
       this.p.v.H6(this.w);
       this.q.a(a.class).Xg(this.x);
       this.V8();
       return;
    }
    public void J8(){
       l ol = l.class;
       if (PatchProxy.applyVoid(null, this, ol, "8")) {
          return;
       }
       this.p.v.Q0(this.w);
       this.q.a(a.class).co(this.x);
       if (!PatchProxy.applyVoid(null, this, ol, "10")) {
          ol = this.v;
          if (ol != null && ol.K()) {
             this.v.o();
             this.v = null;
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "7")) {
          return;
       }
       this.R8();
       this.t.c(false);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       if (this.t == null) {
          this.t = new b$a(this.p.U0);
       }
       return;
    }
    public void S8(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "11")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SHORTCUT_COMMENT";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.p.m.a();
       if (p0) {
          u1.u0(6, uElementPack, uContentPack);
       }else {
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
    public void V8(){
       boolean b;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "5")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, ol, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(y.d(this.getActivity()) && !q.f(this.q.a(a.class).ja())){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return;
       }else {
          this.R8();
          if (this.p.U0 != null) {
             this.t.d(objArray);
             this.X7(this.p.U0.g().observeOn(d.a).subscribe(new k(this), new a()));
          }else {
             this.r = this.t.d(this.m8());
          }
          this.t.a(new l$b(this));
          this.t.c(true);
          this.S8(true);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.s = d.a(0x2cb5d4a8).lJ(p0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l.class, new p());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
