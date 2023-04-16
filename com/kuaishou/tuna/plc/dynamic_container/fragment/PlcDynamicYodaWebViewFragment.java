package com.kuaishou.tuna.plc.dynamic_container.fragment.PlcDynamicYodaWebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;
import com.kwai.yoda.bridge.YodaBaseWebView;
import p55.a;
import com.yxcorp.gifshow.webview.helper.e;
import com.kwai.bridge.context.AbsBridgeContext;
import gy4.a;
import gy4.b;
import f55.c;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import com.kuaishou.tuna.plc.dynamic_container.exception.PlcDynamicException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.HashMap;

public final class PlcDynamicYodaWebViewFragment extends KwaiYodaWebViewFragment	// class@000fe0
{
    public HashMap C;

    public void PlcDynamicYodaWebViewFragment(){
       super();
    }
    public void Lh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicYodaWebViewFragment.class, "1")) {
          return;
       }
       super.Lh();
       Fragment parentFragme = this.getParentFragment();
       if (!parentFragme instanceof PlcDynamicContainerFragment) {
          parentFragme = objArray;
       }
       a uoa = e.e(this.r);
       if (uoa instanceof AbsBridgeContext) {
          objArray = uoa;
       }
       if (parentFragme != null && objArray != null) {
          objArray.n(a.class, new b(parentFragme));
       }else {
          PlcDynamicLogger.g("register webView bridge failed!");
          ExceptionHandler.handleCaughtException(new PlcDynamicException("register webView bridge failed!"));
       }
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, PlcDynamicYodaWebViewFragment.class, "3")) {
       }else {
          PlcDynamicYodaWebViewFragment tC = this.C;
          if (tC != null) {
             tC.clear();
          }
       }
       return;
    }
}
