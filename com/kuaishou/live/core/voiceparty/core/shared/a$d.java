package com.kuaishou.live.core.voiceparty.core.shared.a$d;
import hp2.e;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.a$c;
import mrd.a;
import hp2.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import hp2.t;
import hp2.d;
import java.lang.IllegalStateException;
import hp2.q;
import java.util.Objects;
import msd.a;
import brd.t;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public class a$d implements e	// class@0013fc
{
    public q a;
    public final a$c b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public final a h;
    public d i;
    public final a j;

    public void a$d(a p0){
       a.p(p0, "manager");
       super();
       this.j = p0;
       this.b = new a$c();
       this.c = "";
       this.d = "";
       this.e = "";
       this.f = "";
       this.g = "";
       p0 = a.g();
       a.o(p0, "BehaviorSubject.create<CommonInfo>\(\)");
       this.h = p0;
    }
    public k a(){
       return this.k();
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.j.h().e;
    }
    public String c(){
       return this.d;
    }
    public String d(){
       return this.e;
    }
    public d f(){
       a$d obj = PatchProxy.apply(null, this, a$d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException("BUG!!! _commonInfo not initialized");
    }
    public String g(){
       return this.c;
    }
    public String g0(){
       a$d obj = PatchProxy.apply(null, this, a$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("voicePartyInfo");
       }
       return obj.b;
    }
    public String getLiveStreamId(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a$d obj = PatchProxy.apply(objArray, this, a$d.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("voicePartyInfo");
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, q.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.a.invoke();
       }
       return obj1;
    }
    public t getMode(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.h().f;
    }
    public final t h(){
       return this.h;
    }
    public String i(){
       return this.g;
    }
    public a$c k(){
       return this.b;
    }
    public String k0(){
       return this.f;
    }
    public void l(d p0){
       LiveStreamMessages$VoicePartyCommonInfo version;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "13")) {
          return;
       }
       a.p(p0, "value");
       a$d ti = this.i;
       String str = (ti == null)? 1: null;
       if (ti != null) {
          LiveStreamMessages$VoicePartyCommonInfo voicePartyCo = ti.a();
          if (voicePartyCo != null) {
             version = voicePartyCo.version;
          label_0024 :
             LiveStreamMessages$VoicePartyCommonInfo version1 = p0.a().version;
             if (!str && version - version1 > 0) {
                b.Z(LiveLogTag.LIVE_VOICE_PARTY, "drop CommonInfo since "+"version["+version1+"] < current["+version+']');
                return;
             }else {
                b.Z(LiveLogTag.LIVE_VOICE_PARTY, "update CommonInfo, version="+version1);
                this.i = p0;
                if (str == null) {
                   this.h.onNext(p0);
                   this.j.h().i();
                }
                return;
             }
          }
       }
       version = Long.MIN_VALUE;
       goto label_0024 ;
    }
    public void m(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "9")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public final void n(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
}
