package com.kuaishou.live.common.core.component.effect.renderer.c$a;
import ag1.e;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import java.lang.Object;
import pz2.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gz2.h;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFaceTransDataMessage;
import java.lang.Boolean;
import ta3.a$b;
import lp3.i;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.livestage.VideoScaleMode;
import java.lang.Enum;
import java.util.Map;
import pz2.j;
import eg1.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;

public class c$a implements e	// class@0010ee
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void b(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "5")) {
          return;
       }
       this.a.R8().C0(p0, p1);
       return;
    }
    public void c(LiveFlvStream$LiveFaceTransDataMessage p0,boolean p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "4")) {
          return;
       }
       this.a.R8().c(p0, p1);
       return;
    }
    public void d(a$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "3")) {
          return;
       }
       h oh = this.a.R8();
       if (!this.a.t.b() && (this.a.x != null && !p0.equals(oh.f()))) {
          HashMap hashMap = new HashMap();
          hashMap.put("streamRect", a.a.q(p0));
          hashMap.put("scaleMode", p0.a().toString());
          this.a.x.tm(0x2719, null, 2, hashMap, null);
       }
    label_0054 :
       oh.d(p0);
       return;
    }
    public a$b f(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.R8().f();
    }
    public void h(int p0,int p1,int p2,int p3,VideoScaleMode p4){
       Object[] objArray;
       if (PatchProxy.isSupport(c$a.class)) {
          objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, c$a.class, "1")) {
             return;
          }
       }
       a$b uob = new a$b(p0, p1, p2, p3, n.z(a.b()), n.v(a.b()), p4);
       if (!PatchProxy.applyVoidOneRefs(objArray, this, c$a.class, "3")) {
          h oh = this.a.R8();
          if (!this.a.t.b() && (this.a.x != null && !objArray.equals(oh.f()))) {
             HashMap hashMap = new HashMap();
             hashMap.put("streamRect", a.a.q(objArray));
             hashMap.put("scaleMode", objArray.a().toString());
             this.a.x.tm(0x2719, null, 2, hashMap, null);
          }
       label_00a0 :
          oh.d(objArray);
       }
       return;
    }
}
