package com.kuaishou.tuna_core.widget.dialog.presenter.TunaProfileTabModuleWebClient$onPageFinished$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class TunaProfileTabModuleWebClient$onPageFinished$1 extends Lambda implements a	// class@00113b
{
    public final String $url;
    public final WebView $view;

    public void TunaProfileTabModuleWebClient$onPageFinished$1(String p0,WebView p1){
       this.$url = p0;
       this.$view = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, TunaProfileTabModuleWebClient$onPageFinished$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "TunaProfileTabModuleWebClient onPageFinished : "+this.$url+" , height : ";
       TunaProfileTabModuleWebClient$onPageFinished$1 t$view = this.$view;
       if (t$view != null) {
          objArray = Integer.valueOf(t$view.getContentHeight());
       }
       return obj+objArray;
    }
}
