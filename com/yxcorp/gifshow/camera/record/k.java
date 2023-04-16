package com.yxcorp.gifshow.camera.record.k;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.camera.record.SchemePairedPhotoVideoHelper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import tkd.b;
import tkd.d;
import t5b.a;
import s3b.a;
import ixc.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.camera.record.j;

public final class k implements o	// class@001d53
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, null, SchemePairedPhotoVideoHelper.class, "4");
       if (ot != PatchProxyResult.class) {
       }else {
          a uoa = d.a(0x3bf0d115).KA();
          ot = uoa.l(p0, MagicBusinessId.VIDEO).observeOn(d.c).flatMap(new j(uoa, p0));
       }
       return ot;
    }
}
