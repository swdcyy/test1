package com.kwai.nearby.local.presenter.LocalDebugPresenter$doBindView$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.nearby.local.presenter.LocalDebugPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qc7.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;

public final class LocalDebugPresenter$doBindView$2 extends FunctionReferenceImpl implements l	// class@000fa6
{

    public void LocalDebugPresenter$doBindView$2(LocalDebugPresenter p0){
       super(1, p0, LocalDebugPresenter.class, "onLoadMoreDebugValueChange", "onLoadMoreDebugValueChange\(Lcom/kwai/nearby/event/LoadMoreDebugEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalDebugPresenter$doBindView$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, LocalDebugPresenter.class, "2")) {
          a.p(p0, "event");
          LocalDebugPresenter q = treceiver.q;
          if (q == null) {
             a.S("mText1");
          }
          q.setText("api时长:"+p0.a);
          q = treceiver.r;
          if (q == null) {
             a.S("mText2");
          }
          q.setText("单次拉取feed数:"+p0.f);
          q = treceiver.s;
          if (q == null) {
             a.S("mText3");
          }
          q.setText("feed持续时长:"+p0.b);
          q = treceiver.t;
          if (q == null) {
             a.S("mText4");
          }
          q.setText("滑动feed数:"+p0.c);
          q = treceiver.u;
          if (q == null) {
             a.S("mText5");
          }
          q.setText("上次PreSize:"+p0.d);
          LocalDebugPresenter v = treceiver.v;
          if (v == null) {
             a.S("mText6");
          }
          v.setText("这次PreSize:"+p0.e);
       }
       return;
    }
}
