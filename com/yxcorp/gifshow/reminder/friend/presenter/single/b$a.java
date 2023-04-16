package com.yxcorp.gifshow.reminder.friend.presenter.single.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.reminder.friend.presenter.single.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lec.f;
import k2b.h;
import com.yxcorp.gifshow.util.rx.RxBus;
import mec.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cdc.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Collections;
import wkd.b;
import zcc.k;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig$MoreActionEntrance;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.reminder.friend.presenter.single.b$b;
import ydc.e;
import z1.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.popup.bubble.a;
import k07.l;

public class b$a extends m	// class@001ad5
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, f.class, "32")) {
          h.m("3801441", "CLICK_ADD_ICON").h();
       }
       RxBus.f.b(new a());
       b$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, b.class, "5")) {
          Activity activity = tc.getActivity();
          if (activity != null) {
             List list = PatchProxy.apply(null, null, a.class, "4");
             if (list != PatchProxyResult.class) {
             }else if(!a.b()){
                list = Collections.emptyList();
             }else {
                list = b.a(0x78443100).a().mMoreActionEntrance.mMoreActions;
             }
             if (!q.f(list)) {
                a uoa = new a(activity);
                uoa.K0(KwaiBubbleOption.e);
                uoa.o0(tc.q);
                uoa.x0(new LinearLayoutManager(activity));
                uoa.D0(BubbleInterface$Position.BOTTOM);
                uoa.A0(1);
                uoa.z(1);
                uoa.p();
                uoa.A(1);
                uoa.m0(new b$b(list, new e(uoa, activity), null));
                l.c(uoa, R.layout.arg_RES_7f0d1096);
             }
          }
       }
       return;
    }
}
