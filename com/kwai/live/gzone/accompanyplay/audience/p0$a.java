package com.kwai.live.gzone.accompanyplay.audience.p0$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.p0;
import java.lang.Object;
import o37.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;

public class p0$a implements g	// class@000ba2
{
    public final p0 b;

    public void p0$a(p0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0$a.class, "1")) {
       }else {
          p0 = p0.mGameInfo;
          if (p0.mEnableOneClick != null) {
             this.b.S8(p0);
          }
       }
       return;
    }
}
