package com.kuaishou.live.effect.resource.download.v2.d$a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import com.kuaishou.live.effect.resource.download.v2.d;
import java.lang.Object;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import wz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.effect.resource.download.v2.a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Status;
import java.lang.Throwable;
import java.lang.Integer;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Enum;

public class d$a implements IMagicGiftResourceLoader$a	// class@001b5c
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(IMagicGiftResourceLoader$Type p0,a p1,MagicEmoji$MagicFace p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d$a.class, "1")) {
          return;
       }
       b.P(d.d, "[onStart]"+p2+","+p0);
       this.a.i(p2).c(p0, IMagicGiftResourceLoader$Status.DOWNLOADING);
       return;
    }
    public void b(IMagicGiftResourceLoader$Type p0,a p1,MagicEmoji$MagicFace p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d$a.class, "2")) {
          return;
       }
       b.P(d.d, "[onSuccess]"+p2+","+p0);
       this.a.i(p2).c(p0, IMagicGiftResourceLoader$Status.DOWNLOAD_SUCCESS);
       this.a.h(p2, p1);
       return;
    }
    public void c(IMagicGiftResourceLoader$Type p0,a p1,MagicEmoji$MagicFace p2,int p3,Throwable p4){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
             return;
          }
       }
       b.P(d.d, "[onFail]"+p2.mName+","+p0.name());
       this.a.i(p2).d(p0, IMagicGiftResourceLoader$Status.DOWNLOAD_FAIL, p3, p4);
       this.a.h(p2, p1);
       return;
    }
}
