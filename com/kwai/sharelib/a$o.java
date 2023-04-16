package com.kwai.sharelib.a$o;
import erd.g;
import com.kwai.sharelib.a;
import uo7.a0;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.f;
import java.lang.Runnable;
import ekd.k1;
import yo7.e;
import com.kwai.sharelib.model.ShareInitResponse;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelData;
import com.google.gson.JsonElement;
import java.lang.Integer;
import java.lang.Throwable;
import nsd.u;
import yo7.f;

public final class a$o implements g	// class@0016b2
{
    public final a b;
    public final a0 c;
    public final Ref$ObjectRef d;

    public void a$o(a p0,a0 p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$o.class, "1")) {
       }else {
          k1.o(new f(this, p0));
          ShareInitResponse shareInitRes = this.b.g.z();
          if (shareInitRes != null) {
             shareInitRes = shareInitRes.mSharePanel;
             if (shareInitRes != null) {
                ShareInitResponse$SharePanelData mExtParams = shareInitRes.mExtParams;
                if (mExtParams != null) {
                   str = mExtParams.toString();
                label_0032 :
                   e uoe = new e("social_share_pannel_will_appear", null, null, null, str, null, null, null, null, null, 1006, null);
                   f.b(p0, this.b.g);
                }
             }
          }
          str = null;
          goto label_0032 ;
       }
       return;
    }
}
