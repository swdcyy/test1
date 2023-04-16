package a01.h;
import java.lang.Runnable;
import a01.i;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lz0.c;
import t02.a0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import kq3.a;
import c22.a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import a01.a;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;

public final class h implements Runnable	// class@00000e
{
    public final i b;
    public final String c;

    public void h(i p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       h tb = this.b;
       h tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, i.class, "5")) {
       }else if(tb.getContext() != null && (tb.getActivity() == null || TextUtils.x(tc))){
          a uoa = a.b(tb.getActivity(), tb.w.Z2.b().getChildFragmentManager(), tb.w);
          uoa.g("live-privilege-gift-activity");
          uoa.f("live-privilege-gift-activity_fragment");
          uoa.b.setLayoutType("3").setPortraitHeightRatio(0x3f4ccccd);
          a uoa1 = a.c();
          uoa1.f(new a(tb));
          tb.S = uoa1.h(tc, uoa);
       }
       return;
    }
}
