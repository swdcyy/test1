package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.w$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.w;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j24.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import q64.j0;
import j24.b$a;
import com.kuaishou.merchant.live.marketing.sandeago.model.SandeagoPropertyItemModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.v;
import java.util.List;
import ok.h;
import com.google.common.collect.Lists;

public class w$a extends m	// class@001a99
{
    public final w c;

    public void w$a(w p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$a.class, "1")) {
          return;
       }
       b uob = new b(this.c.getContext());
       uob.g = a1.a(0x7f061dfb);
       uob.h = a1.a(0x7f061d77);
       uob.a(new j0(this));
       SandeagoPropertyItemModel mPropAlias = this.c.u.mPropAlias;
       if (TextUtils.x(mPropAlias)) {
          mPropAlias = this.c.u.mPropName;
       }
       List list = Lists.h(this.c.u.mPropValueList, v.b);
       if (!PatchProxy.applyVoidTwoRefs(mPropAlias, list, uob, b.class, "3")) {
          uob.c(mPropAlias, list, 0);
       }
       return;
    }
}
