package com.yxcorp.gifshow.hotword_v2.presenter.init.BaseHotWordInitPresenter$onHotWordViewProviderCreated$$inlined$apply$lambda$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import owa.a;
import java.lang.Object;
import java.lang.Number;
import rwa.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.Pair;
import java.util.Objects;
import oy5.e;
import oy5.f;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import com.kwai.feature.component.entry.a;
import wkd.b;
import com.kwai.feature.component.entry.SearchEntryActionRecorder;
import com.kwai.feature.component.entry.SearchEntryActionRecorder$SignalType;

public final class BaseHotWordInitPresenter$onHotWordViewProviderCreated$$inlined$apply$lambda$1 extends Lambda implements p	// class@001900
{
    public final a this$0;

    public void BaseHotWordInitPresenter$onHotWordViewProviderCreated$$inlined$apply$lambda$1(a p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0.intValue(), p1);
       return l1.a;
    }
    public final void invoke(int p0,a p1){
       if (PatchProxy.isSupport2(BaseHotWordInitPresenter$onHotWordViewProviderCreated$$inlined$apply$lambda$1.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), p1, this, BaseHotWordInitPresenter$onHotWordViewProviderCreated$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       Pair pair = new Pair(Integer.valueOf(p0), p1);
       this.this$0.V8(pair);
       BaseHotWordInitPresenter$onHotWordViewProviderCreated$$inlined$apply$lambda$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(pair, tthis$0, a.class, "10")) {
          if (pair.getFirst().intValue() == 1) {
             e uoe = a.R8(tthis$0, pair.getSecond(), false, 2, null);
             f.e("UNIFY_REDPOINT", uoe);
             Context context = tthis$0.getContext();
             a.m(context);
             a.c(context, uoe);
             b.a(0x7fb69d0c).e("search_entrance_searchbox_bottom_v3", SearchEntryActionRecorder$SignalType.USER_CLICK_COUNT);
          }else if(pair.getFirst().intValue() == 2){
             f.e("CLOSE_UNIFY_REDPOINT", a.R8(tthis$0, pair.getSecond(), false, 2, null));
          }
       }
       PatchProxy.onMethodExit(BaseHotWordInitPresenter$onHotWordViewProviderCreated$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
