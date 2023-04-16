package com.yxcorp.gifshow.v3.previewer.ktv.z$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.previewer.ktv.z;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import ooc.p0;
import java.util.Objects;
import tkd.b;
import tkd.d;
import um6.f;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import um6.a;

public class z$a extends m	// class@0015d8
{
    public final z c;

    public void z$a(z p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$a.class, "1")) {
          return;
       }
       p0.b("video", this.c.I.getMusicInfo(), this.c.J);
       z$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, z.class, "12")) {
          d.a(0x6d6c0f8b).Yf(tc.getActivity(), tc.I, 2325, 0, tc.J);
       }
       return;
    }
}
