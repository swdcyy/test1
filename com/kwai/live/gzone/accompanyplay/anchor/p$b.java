package com.kwai.live.gzone.accompanyplay.anchor.p$b;
import com.kwai.live.gzone.accompanyplay.edit.g$i;
import com.kwai.live.gzone.accompanyplay.anchor.p;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetSetting;
import java.lang.String;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import g37.d;

public class p$b implements g$i	// class@000b2b
{
    public final p a;

    public void p$b(p p0){
       this.a = p0;
       super();
    }
    public void a(LiveGzoneAccompanyFleetSetting p0,String p1,String p2,String p3,LiveGzoneAccompanyGameInfo p4){
       p$b uob = p$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       this.a.q.e(p4, p2, p0.mBindGameAccountInfo, p0.mFleetId, false);
       return;
    }
}
