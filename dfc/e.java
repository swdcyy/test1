package dfc.e;
import erd.g;
import dfc.g;
import java.lang.Object;
import dfc.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import crd.b;
import wkd.b;
import zec.a;
import brd.t;
import dfc.f;
import erd.o;
import dfc.b;
import erd.a;
import dfc.d;
import dfc.c;
import ncc.g;
import io.reactivex.subjects.PublishSubject;
import j9c.b;
import cfc.b;
import lnc.i3;
import java.lang.Number;
import k2b.h;
import k9c.h;
import k2b.e0;
import efc.a;
import java.util.List;
import bfc.j;
import ekd.k1;
import hm8.a;

public final class e implements g	// class@0021a2
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a g;
       e tb = this.b;
       g og = g.class;
       if (!tb.getActivity() instanceof GifshowActivity) {
       }else if(p0.a != null){
          g = p0.g;
          p0 = p0.h;
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(g), Boolean.valueOf(p0), tb, og, "5")) {
             og = tb.u;
             if (og == null || og.isDisposed()) {
                tb.u = b.a(0x5d38e284).a(g, p0).map(f.b).doOnTerminate(new b(tb)).subscribe(new d(tb), new c(tb));
             }
          }
       }else if(p0.b != null){
          int i = 1;
          if (b.a(-83154551).e() == i) {
             tb.s.onNext(Boolean.TRUE);
          }
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, og, "3")) {
             Boolean uBoolean = b.c(-8, Boolean.class);
             if (uBoolean != null && uBoolean.booleanValue()) {
                if (!PatchProxy.applyVoid(objArray, objArray, b.class, "6")) {
                   i3 oi3 = i3.f();
                   oi3.d("redpoint_loc", "news_slide");
                   oi3.c("style", Integer.valueOf(i));
                   h oh = h.m("2636863", "REDPOINT");
                   oh.n(oi3.toString());
                   oh.h();
                }
                h.b(objArray, h.d(1, "BottomMessage", "TopFriendWatching", null, 0, null, null));
             }
          }
          j.a(tb.getActivity(), p0.c, a.d(p0.d), p0.e);
          a.n(k1.i());
       }
       return;
    }
}
