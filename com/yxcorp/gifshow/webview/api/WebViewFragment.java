package com.yxcorp.gifshow.webview.api.WebViewFragment;
import uxc.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import com.kuaishou.webkit.WebView;
import uxc.a;
import android.util.Pair;
import uxc.b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$c;
import uxc.e;

public abstract class WebViewFragment extends BaseFragment implements d	// class@0016fe
{
    public final List j;

    public void WebViewFragment(){
       super();
       this.j = new ArrayList();
    }
    public void ch(WebViewFragment$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewFragment.class, "2")) {
          return;
       }
       if (this.j.contains(p0)) {
          return;
       }
       this.j.add(p0);
       return;
    }
    public void dh(JsEmitParameter p0){
    }
    public abstract WebView eh();
    public void fh(WebViewFragment$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewFragment.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.j.remove(p0);
       return;
    }
    public abstract void gh(a p0);
    public abstract void hh(int p0);
    public void ih(Pair p0){
    }
    public abstract void jh(boolean p0);
    public abstract void kh(b p0);
    public abstract void lh(WebViewFragment$b p0);
    public abstract void mh(int p0);
    public abstract void nh(int p0);
    public void oh(boolean p0){
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, WebViewFragment.class, "1")) {
          return;
       }
       super.onDestroyView();
       this.j.clear();
       return;
    }
    public void ph(WebViewFragment$c p0){
    }
    public void qh(e p0){
    }
}
