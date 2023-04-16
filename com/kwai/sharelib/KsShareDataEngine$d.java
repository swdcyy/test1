package com.kwai.sharelib.KsShareDataEngine$d;
import erd.g;
import uo7.k;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yo7.e;
import com.kwai.sharelib.tools.Gsons;
import com.google.gson.Gson;
import java.lang.Integer;
import java.lang.Throwable;
import nsd.u;
import yo7.f;

public final class KsShareDataEngine$d implements g	// class@001699
{
    public final k b;

    public void KsShareDataEngine$d(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsShareDataEngine$d.class, "1")) {
       }else {
          e uoe = new e("social_share_receive_share_any", null, null, null, null, null, Gsons.b.a().q(p0), null, null, null, 958, null);
          f.b(v0, this.b);
       }
       return;
    }
}
