package com.feature.post.bridge.util.g;
import erd.o;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import s3b.a;
import ixc.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import brd.t;
import t45.d;
import brd.z;
import com.feature.post.bridge.util.h;

public final class g implements o	// class@0014d1
{
    public final PostVideoHelper$c b;

    public void g(PostVideoHelper$c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       a uoa = tb.d.KA();
       return uoa.l(p0, MagicBusinessId.VIDEO).observeOn(d.c).flatMap(new h(uoa, p0, tb));
    }
}
