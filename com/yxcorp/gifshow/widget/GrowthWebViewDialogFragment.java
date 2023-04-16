package com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment;
import com.yxcorp.gifshow.webview.KwaiWebViewDialogFragment;
import com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment$a;
import nsd.u;
import android.content.Intent;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment$b;
import uxc.b;
import com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment$c;
import uxc.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.yxcorp.gifshow.widget.RoundCornerFrameLayout;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashMap;

public final class GrowthWebViewDialogFragment extends KwaiWebViewDialogFragment	// class@001856
{
    public RoundCornerFrameLayout J;
    public int K;
    public int L;
    public int M;
    public int N;
    public HashMap O;
    public static final GrowthWebViewDialogFragment$a P;

    static {
       GrowthWebViewDialogFragment.P = new GrowthWebViewDialogFragment$a(null);
    }
    public void GrowthWebViewDialogFragment(Intent p0){
       a.p(p0, "intent");
       super(p0);
    }
    public WebViewFragment Nh(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthWebViewDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       WebViewFragment webViewFragm = super.Nh(p0);
       webViewFragm.kh(new GrowthWebViewDialogFragment$b(this));
       webViewFragm.gh(new GrowthWebViewDialogFragment$c(this));
       a.o(webViewFragm, "fragment");
       return webViewFragm;
    }
    public int getLayoutResId(){
       return 0x7f0d058f;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrowthWebViewDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       View view = super.onCreateView(p0, p1, p2);
       Object[] objArray = null;
       RoundCornerFrameLayout roundCornerF = (view != null)? view.findViewById(R.id.content_fragment): objArray;
       this.J = roundCornerF;
       if (!PatchProxy.applyVoid(objArray, this, GrowthWebViewDialogFragment.class, "3")) {
          GrowthWebViewDialogFragment tJ = this.J;
          if (tJ != null) {
             a.m(tJ);
             tJ.setEnableCorner(true);
             tJ = this.J;
             a.m(tJ);
             tJ.setTopLeftRadius(this.K);
             tJ = this.J;
             a.m(tJ);
             tJ.setTopRightRadius(this.L);
             tJ = this.J;
             a.m(tJ);
             tJ.setBottomLeftRadius(this.M);
             tJ = this.J;
             a.m(tJ);
             tJ.setBottomRightRadius(this.N);
          }
       }
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, GrowthWebViewDialogFragment.class, "5")) {
       }else {
          GrowthWebViewDialogFragment tO = this.O;
          if (tO != null) {
             tO.clear();
          }
       }
       return;
    }
}
