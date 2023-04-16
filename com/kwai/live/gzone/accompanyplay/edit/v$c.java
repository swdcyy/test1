package com.kwai.live.gzone.accompanyplay.edit.v$c;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.v;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import n37.k;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import h37.n0;

public class v$c implements View$OnClickListener	// class@000c1c
{
    public final v b;

    public void v$c(v p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$c.class, "1")) {
          return;
       }
       n0.j(this.b.p.o.a(), this.b.r.b);
       this.b.V8(false);
       return;
    }
}
