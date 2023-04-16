package com.kuaishou.live.audience.course.a;
import erd.g;
import com.kuaishou.live.audience.course.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.live.common.course.model.QLiveCourse;
import s31.e0;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.PayCourseApiService;
import com.kwai.framework.model.user.QCurrentUser;
import zfc.b;
import erd.o;
import cjd.e;
import com.kuaishou.live.audience.course.i;
import android.content.Context;
import s31.y;
import com.kuaishou.live.audience.course.k;
import s31.i;
import s31.j;
import crd.b;
import java.lang.Throwable;

public final class a implements g	// class@000bf9
{
    public final e b;
    public final boolean c;

    public void a(e p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          p0 = tb.s.b().getActivity();
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(tc), tb, uoe, "16")) {
             QLiveCourse mCourseId = tb.u.mCourseId;
             e t = tb.t;
             t ot = PatchProxy.applyThreeRefs(p0, mCourseId, t, null, e0.class, "5");
             if (ot != PatchProxyResult.class) {
             }else {
                ot = b.a(0x74d268f).checkOrder(mCourseId, QCurrentUser.me().getId()).retryWhen(new b(3, 1000)).map(new e()).doOnNext(new i(p0, t)).map(k.b);
             }
             tb.y = ot.subscribe(new i(tb, tc), new j(tb, tc));
          }
       }else {
          tb.S8(null, false, tc);
       }
       return;
    }
}
