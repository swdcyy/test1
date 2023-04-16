package com.yxcorp.gifshow.camera.record.magic.l$c;
import z3b.f;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import j8c.b;
import k4b.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Throwable;
import z3b.e;

public class l$c implements f	// class@000e47
{
    public final String a;
    public final l b;

    public void l$c(l p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$c.class, "1")) {
          return;
       }
       String str = "MagicHandler";
       b.a(str, p0.mName+" 重新下载完成");
       if (this.b.p.I0()) {
          this.b.p.M(this.a);
          l$c tb = this.b;
          if (tb.k != null && !tb.p.isRecording()) {
             tb = this.b;
             tb.o(tb.k);
          }else {
             b.b(str, "重试魔表为空或者正在拍摄");
          }
       }else {
          b.b(str, "MagicSDK不可用");
       }
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       e.c(this, p0, p1);
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       e.d(this, p0, p1, p2);
    }
}
