package com.kwai.live.gzone.accompanyplay.edit.w;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.v;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveLinkBindConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;

public class w implements g	// class@000c21
{
    public final v b;

    public void w(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
       }else {
          w tb = this.b;
          tb.X8(tb.R8(p0.mBindUserInfo));
       }
       return;
    }
}
