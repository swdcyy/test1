package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.e;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import com.kuaishou.live.external.invoke.deserializer.gift.LiveGiftItemHintActionInfo;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import rp5.a;
import lp3.c;
import lp3.e;
import androidx.fragment.app.c;
import kq3.a;
import va1.o0;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import kz0.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;

public final class e implements Runnable	// class@000b2e
{
    public final f b;
    public final LiveGiftItemHintActionInfo c;

    public void e(f p0,LiveGiftItemHintActionInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       LiveGiftItemHintActionInfo mLink = this.c.mLink;
       if (PatchProxy.applyVoidOneRefs(mLink, tb, f.class, "10")) {
       }else if(!TextUtils.x(mLink) && (tb.getContext() == null || tb.getActivity() == null)){
          a uoa = o0.a(tb.getActivity(), tb.q.a(a.class).getChildFragmentManager(), tb.q);
          uoa.g("live-privilege-gift");
          uoa.f("live-privilege-gift-fragment");
          uoa.b.setPortraitHeightRatio(0x3f4ccccd).setLayoutType("3");
          a uoa1 = a.c();
          uoa1.f(new a(tb));
          tb.w = uoa1.h(mLink, uoa);
       }
       return;
    }
}
