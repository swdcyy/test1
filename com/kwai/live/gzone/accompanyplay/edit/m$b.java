package com.kwai.live.gzone.accompanyplay.edit.m$b;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.m;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.api.LiveGzoneAccompanyLivelinkResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import n37.k;
import com.kwai.live.gzone.accompanyplay.model.LiveLinkBindConfig;
import io.reactivex.subjects.PublishSubject;

public class m$b implements g	// class@000c09
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b.class, "1")) {
       }else {
          k ok = this.b.l.i();
          LiveGzoneAccompanyLivelinkResponse mLivelinkBin = p0.mLivelinkBindConfig;
          if (mLivelinkBin != null) {
             if (ok != null) {
                ok.c.update(mLivelinkBin);
             }
             this.b.m.onNext(p0.mLivelinkBindConfig);
          }
       }
       return;
    }
}
