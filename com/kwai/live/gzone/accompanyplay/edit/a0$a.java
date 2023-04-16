package com.kwai.live.gzone.accompanyplay.edit.a0$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import java.lang.Object;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import e17.i;

public class a0$a implements g	// class@000bcf
{
    public final a0 b;

    public void a0$a(a0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$a.class, "1")) {
       }else {
          this.b.V8(p0.mBindGameAccountInfo);
          i.a(R.style.arg_RES_7f110669, 0x7f1003ac);
       }
       return;
    }
}
