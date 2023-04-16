package bg1.a;
import lz2.c;
import java.lang.Object;
import pz2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lz2.b;
import ii1.a;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import s66.a;
import ki1.a;
import java.lang.System;
import pz2.a;
import java.util.List;

public final class a implements c	// class@00037c
{

    public void a(){
       super();
    }
    public void a(c p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       a.p(p0, "renderTask");
       b.a(this, p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "2") && p0 != null) {
          String str = "LIVE_EFFECT_GIFT_ID";
          if (p0 instanceof a) {
             a.d(str, String.valueOf(p0.l.mGiftId));
          }else if(p0 instanceof a){
             a.d(str, String.valueOf(p0.M()));
          }
          a.d("LIVE_EFFECT_CURRENT_TIME", String.valueOf(System.currentTimeMillis()));
          a.d("LIVE_EFFECT_MAGIC_FACE_ID", String.valueOf(p0.b()));
       }
       return;
    }
    public void e(List p0){
       b.f(this, p0);
    }
    public void g(c p0){
       b.e(this, p0);
    }
    public void h(c p0){
       b.d(this, p0);
    }
    public void i(c p0,boolean p1,String p2){
       b.c(this, p0, p1, p2);
    }
    public void j(List p0){
       b.b(this, p0);
    }
}
