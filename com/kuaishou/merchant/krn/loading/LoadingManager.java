package com.kuaishou.merchant.krn.loading.LoadingManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.kuaishou.merchant.krn.loading.RnLoadingView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import java.lang.Integer;
import com.kwai.library.widget.refresh.path.LoadingStyle;

public class LoadingManager extends SimpleViewManager	// class@001867
{

    public void LoadingManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public RnLoadingView createViewInstance(n0 p0){
       RnLoadingView obj = PatchProxy.applyOneRefs(p0, this, LoadingManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RnLoadingView(p0);
       obj.k();
       return obj;
    }
    public String getName(){
       return "RnLoadingView";
    }
    public void showLoadingView(RnLoadingView p0,int p1){
       LoadingManager loadingManag = LoadingManager.class;
       if (PatchProxy.isSupport(loadingManag) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, loadingManag, "2")) {
          return;
       }
       if (p1) {
          if (p1 != 1) {
             if (p1 != 2) {
                if (p1 != 3) {
                   if (p1 == 4) {
                      p0.setLoadingStyle(LoadingStyle.GRADIENT);
                   }
                }else {
                   p0.setLoadingStyle(LoadingStyle.WHITE);
                }
             }else {
                p0.setLoadingStyle(LoadingStyle.GRAY_DARK);
             }
          }else {
             p0.setLoadingStyle(LoadingStyle.GRAY_LIGHT);
          }
       }else {
          p0.setLoadingStyle(LoadingStyle.GRAY);
       }
       return;
    }
}
