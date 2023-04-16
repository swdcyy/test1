package com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import brd.t;
import com.kuaishou.live.core.voiceparty.d0;
import gs2.b;
import erd.g;
import crd.b;

public class c$a implements View$OnClickListener	// class@00152c
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       tb.X7(d0.a(tb.getActivity()).subscribe(new b(this), d0.s("LiveVoicePartyEmptyRecommendItemPresenter", "orderMusicListener click")));
       return;
    }
}
