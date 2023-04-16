package com.kuaishou.live.common.core.component.admin.user.a;
import bb1.p;
import ib1.a;
import java.util.ArrayList;
import ib1.b;
import bb1.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import bb1.e;
import lp3.e;
import lp3.a;
import v51.a;
import lp3.c;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAssistantPrivilegeChanged;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCAssistantStatus;
import java.lang.Boolean;
import xp5.g;
import cb1.c;
import cb1.b;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import cjd.e;
import erd.o;
import ib1.d;
import ib1.c;
import erd.g;
import crd.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import java.lang.Integer;

public class a extends p	// class@000f57
{
    public a e;
    public boolean f;
    public boolean g;
    public final g h;
    public final List i;
    public final g j;

    public void a(){
       super();
       this.f = false;
       this.h = new a(this);
       this.i = new ArrayList();
       this.j = new b(this);
    }
    public void Bk(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.i.remove(p0);
       return;
    }
    public List Ch(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.To();
       obj = PatchProxy.applyOneRefs(p0, this, p.class, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = this.d.Ch(p0);
       }
       return obj;
    }
    public void D8(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public void Qo(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       this.e = this.Po().a(a.class).u();
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          this.e.u0(415, LiveStreamMessages$SCAssistantPrivilegeChanged.class, this.h);
          this.e.u0(311, LiveStreamMessages$SCAssistantStatus.class, this.j);
       }
       return;
    }
    public void Ro(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "13")) {
          return;
       }
       super.Ro();
       if (!PatchProxy.applyVoid(null, this, uoa, "6")) {
          this.e.o(415, this.h);
          this.e.o(311, this.j);
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "4")) {
          this.i.clear();
       }
       return;
    }
    public final void To(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       if (this.g != null) {
          this.Uo(false);
       }
       return;
    }
    public final void Uo(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "8")) {
          return;
       }
       if (this.f != null) {
          return;
       }
       this.f = true;
       this.Oo(b.b().l(this.Po().a(g.class).getLiveStreamId(), QCurrentUser.me().getId()).map(new e()).subscribe(new d(this, p0), new c(this)));
       return;
    }
    public LiveAdminAbilityModel rg(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.To();
       return super.rg(p0);
    }
}
