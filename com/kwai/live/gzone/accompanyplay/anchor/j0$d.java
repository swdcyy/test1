package com.kwai.live.gzone.accompanyplay.anchor.j0$d;
import g37.d;
import com.kwai.live.gzone.accompanyplay.anchor.j0;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jg0.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import xl6.b;
import xl6.h;
import brd.t;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import android.os.Bundle;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class j0$d implements d	// class@000b19
{
    public final j0 a;

    public void j0$d(j0 p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.a("0.1.0", p0) >= 0)? true: false;
       return b;
    }
    public void b(LiveGzoneAccompanyGameInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j0$d.class, "2")) {
          return;
       }
       this.a.P8(p0);
       if (!this.a.q.f()) {
          this.a.W8();
          return;
       }else {
          j0$d ta = this.a;
          ta.q.b(ta.R8(p1, false));
          return;
       }
    }
    public t c(){
       Object obj = PatchProxy.apply(null, this, j0$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.s.hide();
    }
    public t d(){
       Object obj = PatchProxy.apply(null, this, j0$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.t.hide();
    }
    public void e(LiveGzoneAccompanyGameInfo p0,String p1,LiveGzoneAccompanyBindGameAccountInfo p2,String p3,boolean p4){
       j0$d uod = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       boolean b = p4;
       j0$d uod1 = j0$d.class;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uod1, "1")) {
             return;
          }
       }
       uod.a.P8(oobject);
       if (!uod.a.q.f()) {
          uod.a.W8();
          return;
       }else {
          Bundle uBundle = new Bundle();
          uBundle.putBoolean("IS_NEXT_ROUND", b);
          uBundle.putString("EXTRA_USER_INFO", oobject2.mGameAccountDesc);
          b.e0(LiveLogTag.LIVE_GZONE_ACCOMPANY, "createRoom", "uid:", oobject2.mGameUid, "roundId:", p1, "isNextRound", Boolean.valueOf(p4));
          if (b) {
             uod.a.q.a(null, oobject2.mGameUid, oobject1, uBundle);
          }else {
             j0$d a = uod.a;
             a.q.a(a.R8(oobject3, 1), oobject2.mGameUid, oobject1, uBundle);
          }
          return;
       }
    }
}
