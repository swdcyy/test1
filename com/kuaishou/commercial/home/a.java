package com.kuaishou.commercial.home.a;
import android.view.View$OnClickListener;
import com.kuaishou.commercial.home.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import yf5.a;
import lnc.ja;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import mxb.q;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import qx.e;
import qx.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import tkd.b;
import tkd.d;
import nl9.u;

public final class a implements View$OnClickListener	// class@0014d6
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       a.b(false);
       ja.a();
       if (PatchProxy.applyVoid(null, tb, b.class, "9")) {
       }else {
          tb.u.h0().requestDisallowInterceptTouchEvent(true);
          q oq = new q(tb.getActivity(), tb.w, new QPhoto(tb.r), new e(tb), false);
          v0.i(new f(tb));
          d.a(-1694791652).Bo(v0);
       }
       return;
    }
}
