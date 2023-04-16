package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$g;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import a4b.a;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import com.yxcorp.gifshow.magic.data.repo.response.RecordInfoResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;

public final class MagicEditionHandler$g implements g	// class@001bc0
{
    public final MagicEditionHandler b;
    public final a c;
    public final int d;
    public final String e;
    public final JsonObject f;

    public void MagicEditionHandler$g(MagicEditionHandler p0,a p1,int p2,String p3,JsonObject p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler$g.class, "1")) {
       }else {
          this.b.p(this.c, this.d, this.e, this.f);
          Object[] objArray = new Object[0];
          b.D().w("MagicEditionController", "response: "+p0, objArray);
       }
       return;
    }
}
