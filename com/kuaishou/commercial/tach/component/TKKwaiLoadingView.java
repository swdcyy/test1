package com.kuaishou.commercial.tach.component.TKKwaiLoadingView;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.refresh.path.LoadingStyle;
import java.lang.Integer;

public class TKKwaiLoadingView extends e	// class@00165b
{

    public void TKKwaiLoadingView(f p0){
       super(p0);
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public KwaiLoadingView createViewInstance(Context p0){
       KwaiLoadingView obj = PatchProxy.applyOneRefs(p0, this, TKKwaiLoadingView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KwaiLoadingView(p0);
       obj.setLoadingStyle(LoadingStyle.GRAY);
       return obj;
    }
    public void setLoadingType(int p0){
       TKKwaiLoadingView tKKwaiLoadin = TKKwaiLoadingView.class;
       if (PatchProxy.isSupport(tKKwaiLoadin) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKKwaiLoadin, "2")) {
          return;
       }
       this.getView().setLoadingStyle(LoadingStyle.fromOrdinal(p0));
       return;
    }
    public void startLoading(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLoadingView.class, "3")) {
          return;
       }
       this.getView().h();
       return;
    }
    public void stopLoading(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLoadingView.class, "4")) {
          return;
       }
       this.getView().i();
       return;
    }
}
