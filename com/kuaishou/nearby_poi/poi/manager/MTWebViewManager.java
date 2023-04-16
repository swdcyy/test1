package com.kuaishou.nearby_poi.poi.manager.MTWebViewManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import com.kuaishou.nearby_poi.poi.model.LoadWebViewParams;
import com.yxcorp.utility.n;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.kuaishou.nearby_poi.poi.view.RoundCornerFrameLayout;
import android.content.res.Resources;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import com.kwai.sdk.switchconfig.a;
import android.view.ViewGroup$LayoutParams;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import java.util.List;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import java.lang.ref.SoftReference;
import android.view.ViewParent;
import android.widget.AbsoluteLayout;
import com.kwai.yoda.YodaWebView;
import com.kuaishou.nearby_poi.poi.manager.MTWebViewManager$a;
import com.kuaishou.webkit.WebViewClient;
import com.kwai.yoda.bridge.YodaBaseWebView;
import org.greenrobot.eventbus.a;
import com.kwai.locallife.model.LocalLifeGlobalEvent;

public class MTWebViewManager	// class@000a29
{
    public MTWebViewManager$LifecycleObserver a;
    public static MTWebViewManager b;
    public static SoftReference c;

    public void MTWebViewManager(){
       super();
    }
    public static MTWebViewManager b(){
       MTWebViewManager mTWebViewMan = MTWebViewManager.class;
       Object obj = PatchProxy.apply(null, null, mTWebViewMan, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (MTWebViewManager.b == null) {
          _monitor_enter(mTWebViewMan);
          if (MTWebViewManager.b == null) {
             MTWebViewManager.b = new MTWebViewManager();
          }
          _monitor_exit(mTWebViewMan);
       }
       return MTWebViewManager.b;
    }
    public final void a(Activity p0,WebView p1,LoadWebViewParams p2){
       ViewGroup$MarginLayoutParams marginLayout;
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MTWebViewManager.class, "7")) {
          return;
       }
       int i = n.j(p0);
       ViewGroup viewGroup = p0.findViewById(0x1020002);
       Context context = viewGroup.getContext();
       super(context);
       LoadWebViewParams cornerRadius = p2.cornerRadius;
       if (cornerRadius < 0) {
          cornerRadius = context.getResources().getDimension(R.dimen.arg_RES_7f070295);
       }
       this.c = cornerRadius;
       this.d = cornerRadius;
       this.e = 0;
       this.f = 0;
       LoadWebViewParams width = p2.width;
       cornerRadius = 0x3f800000;
       if (!width - cornerRadius && !p2.height - cornerRadius) {
          marginLayout = new ViewGroup$MarginLayoutParams(1, 1);
          marginLayout.topMargin = i - 1;
       }else if(width <= 0){
          i1 = (int)((double)i * 0x3fe999999999999a);
       }else {
          i1 = n.c(p0, p2.height);
       }
       ViewGroup$MarginLayoutParams marginLayout1 = new ViewGroup$MarginLayoutParams(-1, i1);
       marginLayout1.topMargin = i - i1;
       marginLayout = marginLayout1;
       this.addView(p1);
       if (!a.t().d("LocalLifeMTAuthHotfix", 1)) {
          viewGroup.addView(this, marginLayout);
          return;
       }else {
          List fragments = p0.getSupportFragmentManager().getFragments();
          if (!fragments.isEmpty()) {
             KwaiDialogFragment kwaiDialogFr = this.e(fragments.get(0));
             if (kwaiDialogFr != null) {
                Dialog dialog = kwaiDialogFr.getDialog();
                if (dialog != null && dialog.getWindow() != null) {
                   View decorView = dialog.getWindow().getDecorView();
                   if (decorView instanceof ViewGroup) {
                      decorView.addView(this, marginLayout);
                   }
                }else {
                   viewGroup.addView(this, marginLayout);
                }
             }else {
                viewGroup.addView(this, marginLayout);
             }
          }else {
             viewGroup.addView(this, marginLayout);
          }
          return;
       }
    }
    public final WebView c(Activity p0){
       WebView webView;
       SoftReference obj = PatchProxy.applyOneRefs(p0, this, MTWebViewManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MTWebViewManager.c;
       if (obj != null && obj.get() != null) {
          webView = MTWebViewManager.c.get();
          ViewParent parent = webView.getParent();
          if (parent instanceof ViewGroup) {
             parent.removeView(webView);
          }
       }else {
          YodaWebView yodaWebView = new YodaWebView(p0);
          yodaWebView.setWebViewClient(new MTWebViewManager$a());
          MTWebViewManager.c = new SoftReference(yodaWebView);
          webView = yodaWebView;
       }
       return webView;
    }
    public void d(Activity p0){
       MTWebViewManager mTWebViewMan = MTWebViewManager.class;
       if (PatchProxy.applyVoidOneRefs(null, this, mTWebViewMan, "11")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, mTWebViewMan, "10")) {
          a.d().t(this);
       }
       try{
          SoftReference c = MTWebViewManager.c;
          if (c != null && c.get() != null) {
             View view = MTWebViewManager.c.get();
             if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                   parent.removeView(view);
                }
             }
             MTWebViewManager.c.clear();
             MTWebViewManager.c = null;
          }
       label_0044 :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final KwaiDialogFragment e(Fragment p0){
       Fragment uFragment;
       Object obj = PatchProxy.applyOneRefs(p0, this, MTWebViewManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List fragments = p0.getChildFragmentManager().getFragments();
       if (fragments.isEmpty()) {
          return null;
       }
       int i = fragments.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          uFragment = fragments.get(i);
          if (uFragment instanceof KwaiDialogFragment) {
             break ;
          }else {
             KwaiDialogFragment kwaiDialogFr = this.e(uFragment);
             if (kwaiDialogFr != null) {
                return kwaiDialogFr;
             }
             i = i - 1;
          }
       }
       return uFragment;
    }
    public void onLocalLifeGlobalEvent(LocalLifeGlobalEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MTWebViewManager.class, "2")) {
          return;
       }
       MTWebViewManager.b().d(null);
       return;
    }
}
