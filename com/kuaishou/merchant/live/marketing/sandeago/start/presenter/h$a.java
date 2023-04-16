package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.h$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import java.util.List;
import j14.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.basic.util.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.n;
import android.app.Activity;
import ekd.i;

public class h$a extends m	// class@001a78
{
    public final h c;

    public void h$a(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       h s = this.c.s;
       int i = 0x7f0a36a4;
       o oo = o.H();
       SandeagoPublish mSelectCateg = this.c.q.mSelectCategoryList;
       Objects.requireNonNull(oo);
       String str = PatchProxy.applyOneRefs(mSelectCateg, oo, o.class, "5");
       if (str != PatchProxyResult.class) {
       }else if(q.f(mSelectCateg)){
          str = o.n;
       }else {
          str = TextUtils.d(o.n, "ids="+c.c(mSelectCateg));
       }
       f.k(s, i, str, "LiveAnchorStartSandeagoCategoryFragment");
       this.c.m8().setPadding(0, n.A(this.c.getContext()), 0, 0);
       i.a(this.c.getActivity(), -1, true);
       return;
    }
}
