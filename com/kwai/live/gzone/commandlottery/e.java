package com.kwai.live.gzone.commandlottery.e;
import erd.g;
import com.kwai.live.gzone.commandlottery.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.commandlottery.d;
import e47.a;
import e47.a$a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public class e implements g	// class@000c96
{
    public final f b;

    public void e(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          p0 = this.b;
          f c = p0.c;
          c.v.r4(p0.b.d.mJumpUrl, c.getContext());
       }
       return;
    }
}
