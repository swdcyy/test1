package com.kwai.live.gzone.accompanyplay.edit.a0$f;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import n37.k;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import g37.d;

public class a0$f implements g	// class@000bd5
{
    public final a0 b;

    public void a0$f(a0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$f.class, "1")) {
       }else if(p0.booleanValue()){
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a0.class, "14")) {
             a0 s = p0.s;
             p0.r.b(s.b, s.d);
          }
       }
       return;
    }
}
