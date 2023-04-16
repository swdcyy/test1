package com.yxcorp.gifshow.ad.webview.jshandler.component.JsonViewFragment;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.ad.webview.jshandler.component.JsonViewFragment$a;
import nsd.u;
import q59.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import t29.d;
import com.yxcorp.gifshow.ad.half.BottomSheetContainerFragment$b$b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import java.util.HashMap;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebSettings;

public final class JsonViewFragment extends BaseFragment implements BottomSheetContainerFragment$b	// class@0018f9
{
    public final c j;
    public HashMap k;
    public static final JsonViewFragment$a l;

    static {
       JsonViewFragment.l = new JsonViewFragment$a(null);
    }
    public void JsonViewFragment(c p0){
       a.p(p0, "jsonViewBridge");
       super(null, null, null, null, 15, null);
       this.j = p0;
    }
    public int G6(){
       Object obj = PatchProxy.apply(null, this, JsonViewFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public void Ib(int p0){
       if (PatchProxy.isSupport(JsonViewFragment.class)) {
          PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, JsonViewFragment.class, "5");
       }
       return;
    }
    public Fragment R1(){
       return this;
    }
    public void jb(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsonViewFragment.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       BottomSheetContainerFragment$b$b.a(this, p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, JsonViewFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       return a.g(p0, 0x7f0d004b, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, JsonViewFragment.class, "7")) {
       }else {
          JsonViewFragment tk = this.k;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JsonViewFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p0 = p0.findViewById(R.id.json_webview);
       a.o(p0, "view.findViewById\(R.id.json_webview\)");
       WebSettings settings = p0.getSettings();
       settings.setJavaScriptEnabled(true);
       settings.setDomStorageEnabled(true);
       p0.addJavascriptInterface(this.j, "jsonViewBridge");
       p0.loadUrl("https://static.yximgs.com/udata/pkg/ad-res/ad_debug/index.html");
       return;
    }
}
