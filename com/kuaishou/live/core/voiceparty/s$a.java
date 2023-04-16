package com.kuaishou.live.core.voiceparty.s$a;
import com.kuaishou.live.core.voiceparty.a;
import com.kuaishou.live.core.voiceparty.s;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import ap2.g;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import co2.t0;
import java.lang.Runnable;
import q00.b;
import com.kuaishou.live.core.voiceparty.h;

public class s$a implements a	// class@0018fa
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public void e(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "4")) {
          return;
       }
       this.a.z.c().a(p0);
       return;
    }
    public String h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       RtcManager obj = PatchProxy.apply(objArray, this, s$a.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.z.c();
       Objects.requireNonNull(obj);
       g og = PatchProxy.apply(objArray, obj, RtcManager.class, "9");
       if (og != patchProxyRe) {
       }else {
          og = obj.a.d;
       }
       return og;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "2")) {
          return;
       }
       this.a.m8().post(new t0(this, p0));
       return;
    }
    public void j(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "3")) {
          return;
       }
       this.a.z.c().a(p0);
       return;
    }
    public b k(){
       Object obj = PatchProxy.apply(null, this, s$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.a.z.c().e();
       }catch(java.lang.IllegalStateException e0){
          return v1;
       }
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, s$a.class, "1")) {
          return;
       }
       this.a.i1.f(0);
       return;
    }
}
