package com.yxcorp.gifshow.camera.record.music.f$b;
import yf9.j$c;
import com.yxcorp.gifshow.camera.record.music.f;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.music.n;
import com.yxcorp.gifshow.camera.record.music.e;

public class f$b implements j$c	// class@000e74
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public CameraPageType A(){
       return this.a.c;
    }
    public MusicRecommendParams a(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.g2();
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.i2(false);
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$b.class, "3")) {
          return;
       }
       f t = this.a.t;
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoid(objArray, t, n.class, "93")) {
          t.Q.h2();
       }
       return;
    }
}
