package com.kuaishou.live.ad.fanstop.h$b;
import xq5.c;
import com.kuaishou.live.ad.fanstop.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import tkd.b;
import tkd.d;
import os5.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import mxb.f0;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class h$b implements c	// class@0009a5
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "1")) {
          return;
       }
       if (this.b.q == null) {
          return;
       }
       int i = d.a(-2004767397).U40(this.b.getActivity());
       int i1 = 2;
       if (i == 1) {
          this.b.r = i1;
       }else if(i == i1){
          this.b.r = 3;
       }
       h$b tb = this.b;
       b.a(-762347696).r1(tb.q.mPhoto, "key_enteraction", Integer.valueOf(tb.r));
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
