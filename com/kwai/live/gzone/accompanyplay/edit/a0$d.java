package com.kwai.live.gzone.accompanyplay.edit.a0$d;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.a0;
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

public class a0$d implements View$OnClickListener	// class@000bd2
{
    public final a0 b;

    public void a0$d(a0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$d.class, "1")) {
          return;
       }
       n0.i(this.b.p.o.a(), this.b.s.b);
       this.b.P8(false);
       return;
    }
}
