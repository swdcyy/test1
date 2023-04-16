package com.kwai.live.gzone.accompanyplay.edit.a0$e$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.a0$e;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import e17.i;

public class a0$e$a implements g	// class@000bd3
{
    public final a0$e b;

    public void a0$e$a(a0$e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$e$a.class, "1")) {
       }else if(p0.booleanValue()){
          this.b.b.V8(null);
          i.a(R.style.arg_RES_7f11066a, 0x7f104ef8);
       }
       return;
    }
}
