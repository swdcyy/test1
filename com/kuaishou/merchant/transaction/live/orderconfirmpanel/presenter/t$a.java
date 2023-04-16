package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.t$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.t;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import kx7.c;
import kx7.b;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import android.graphics.Rect;
import lx7.a$a;
import lx7.a;
import tkd.b;
import tkd.d;
import ix7.c0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class t$a extends m	// class@000840
{
    public final t c;

    public void t$a(t p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "1")) {
          return;
       }
       t$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, t.class, "8") && !q.f(tc.t)) {
          ArrayList uArrayList = new ArrayList();
          c uoc = new c();
          uoc.d(1);
          b uob = new b();
          uob.b(tc.t.get(0).mUrl);
          uoc.a = uob;
          uArrayList.add(uoc);
          Rect rect = new Rect();
          int[] ointArray = new int[2];
          p0.getLocationOnScreen(ointArray);
          rect.top = ointArray[1];
          int i = ointArray[0];
          rect.left = i;
          rect.right = i + p0.getWidth();
          rect.bottom = rect.top + p0.getHeight();
          a$a uoa = new a$a();
          uoa.b(0);
          uoa.c(1);
          d.a(0x5ca58684).Mw(tc.getActivity(), rect, uArrayList, uoa.a());
       }
       return;
    }
}
