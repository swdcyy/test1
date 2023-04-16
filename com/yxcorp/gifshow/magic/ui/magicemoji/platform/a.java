package com.yxcorp.gifshow.magic.ui.magicemoji.platform.a;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.c;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import w3b.p;
import java.lang.Integer;
import brd.a0;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import x4b.h;
import com.yxcorp.gifshow.magic.ui.magicemoji.platform.b;

public final class a implements g	// class@001be7
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoc, "10")) {
       }else if(!PanelShowEvent.a(tb.getActivity(), p0)){
          c x = tb.x;
          if (x == null || (p0.b == x.mPageType && p0.c == PanelShowEvent$PanelType.MAGIC)) {
             b9.a(tb.w);
             Object[] objArray = null;
             if (p0.a != null) {
                tb.Y8(p.e(tb.x));
                if (!PatchProxy.applyVoid(objArray, tb, uoc, "11") && tb.r != null) {
                   tb.w = a0.B(Integer.valueOf(1)).l(300, TimeUnit.MILLISECONDS).G(d.a).R(new h(tb), b.b);
                }
             }else {
                tb.R8(0);
                tb.Y8(objArray);
                tb.V8();
             }
          }
       }
       return;
    }
}
