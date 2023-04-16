package com.yxcorp.gifshow.camera.record.i;
import ce9.h0;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import oc9.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xe9.a;
import rm6.c;
import rm6.a$a;
import qm6.b$a;
import yfc.d;
import tkd.b;
import tkd.d;
import t5b.a;
import s3b.a;
import ixc.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import brd.t;
import yfc.b;
import yfc.a;
import erd.g;
import crd.b;

public class i implements h0	// class@001d48
{

    public void i(){
       super();
    }
    public t GH(CameraPageType p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(p0, p1);
    }
    public boolean isAvailable(){
       return true;
    }
    public void ja(c p0,a$a p1,b$a p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, i.class, "1")) {
          return;
       }
       d uod = new d(p0, p1, p2, p3);
       if (!PatchProxy.applyVoid(null, uod, d.class, "1")) {
          d.a(0x3bf0d115).KA().c(uod.b, MagicBusinessId.VIDEO, uod.e).subscribe(new b(uod), new a(uod));
       }
       return;
    }
}
