package com.yxcorp.gifshow.homepage.presenter.w;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.homepage.presenter.z;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yf5.a;
import lnc.ja;
import mxb.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import yta.a2;
import android.view.View$OnClickListener;
import tkd.b;
import tkd.d;
import nl9.u;

public final class w implements View$OnLongClickListener	// class@0017ec
{
    public final z b;

    public void w(z p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, z.class, "15")) {
       }else {
          a.b(false);
          ja.a();
          q oq = new q(tb.getActivity(), tb.F.findViewById(0x7f0a3105), new QPhoto(tb.s), new a2(tb), true);
          d.a(-1694791652).Bo(v0);
       }
       return true;
    }
}
