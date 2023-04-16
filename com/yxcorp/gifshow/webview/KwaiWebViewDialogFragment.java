package com.yxcorp.gifshow.webview.KwaiWebViewDialogFragment;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import android.content.Intent;
import txc.e;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import k2b.k2;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import q2b.i;
import android.view.View;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class KwaiWebViewDialogFragment extends DialogContainerFragment	// class@0016ca
{
    public k2 H;
    public static final int I;

    public void KwaiWebViewDialogFragment(Intent p0){
       super();
       this.Lh(new e(this, p0));
    }
    public WebViewFragment Nh(Intent p0){
       KwaiYodaWebViewFragment obj = PatchProxy.applyOneRefs(p0, this, KwaiWebViewDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiYodaWebViewFragment();
       obj.setArguments(p0.getExtras());
       return obj;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KwaiWebViewDialogFragment.class, "3")) {
          return;
       }
       super.onDestroy();
       if (!("UNKNOWN2").equals(this.H.d) && this.H.b != null) {
          b.a(0x4b316083).Y0(this.H.d());
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiWebViewDialogFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.getActivity() instanceof GifshowActivity) {
          this.H = b.a(0x4b316083).f();
       }
       return;
    }
}
