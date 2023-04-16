package com.yxcorp.gifshow.upload.e0$c$f;
import ojd.f;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import com.yxcorp.gifshow.upload.e0;

public class e0$c$f implements f	// class@001e72
{
    public final e0$c a;

    public void e0$c$f(e0$c p0){
       this.a = p0;
       super();
    }
    public boolean a(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(e0$c$f.class)) {
          p2 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, e0$c$f.class, "1");
          if (p2 != PatchProxyResult.class) {
             return p2.booleanValue();
          }
       }
       p2 = this.a;
       if (p2.c == null) {
          e0$c b = p2.b;
          b.mProgress = (float)p0 / (float)p1;
          p2.o.b(b);
       }
       return this.a.c;
    }
}
