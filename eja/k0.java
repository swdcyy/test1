package eja.k0;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.v;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.lang.String;
import java.util.List;
import yga.b;
import yga.c;
import iha.b;
import wkd.b;
import hha.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hha.c;
import tkd.b;
import tkd.d;
import lv5.c;
import lv5.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import iv5.a;

public final class k0 implements g	// class@0026d1
{
    public final v b;

    public void k0(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       int i = -713764853;
       if (!p0.booleanValue()) {
          c.i(KsLogFollowTag.FOLLOW_VISIT.appendTag("FollowSelectStatePresenter"), "unSelected");
          tb.q.a();
          b uob = b.a(i);
          _monitor_enter(uob);
          if (PatchProxy.applyVoid(null, uob, b.class, "4")) {
             _monitor_exit(uob);
          }else {
             uob.a = null;
             uob.b.clear();
             b = false;
             uob.c = b;
             uob.d = b;
             _monitor_exit(uob);
          }
       }else {
          c.i(KsLogFollowTag.FOLLOW_VISIT.appendTag("FollowSelectStatePresenter"), "selected");
          b.a(i).b(tb.p);
          d.a(-242212848).WY(true);
       }
       RxBus.f.b(new a(p0.booleanValue()));
       return;
    }
}
