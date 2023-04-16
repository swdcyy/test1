package com.kuaishou.merchant.interpretation.presenter.d;
import oj0.a;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import fg6.a;
import java.lang.String;
import com.google.gson.Gson;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationJsToNativeInfo;
import java.lang.Class;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.interpretation.log.InterpretationLogBiz;
import p74.a;
import o74.a;
import m04.s;
import java.lang.Runnable;
import ekd.k1;

public final class d implements a	// class@00185a
{
    public final MerchantInterpretationPlayerPresenter b;

    public void d(MerchantInterpretationPlayerPresenter p0){
       this.b = p0;
    }
    public final void W(Map p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       Gson a = a.a;
       List list = (a.h(a.q(p0), MerchantInterpretationJsToNativeInfo.class) == null)? null: a.h(a.q(p0), MerchantInterpretationJsToNativeInfo.class).mExchangePhotoUrl;
       tb.B = list;
       if (q.f(list)) {
          a.g(InterpretationLogBiz.INTERPRETATION, "MerchantInterpretationPlayerPresenter", "empty error, exchangePhotoUrl is empty");
       }else {
          k1.p(new s(tb), tb);
       }
       return;
    }
}
