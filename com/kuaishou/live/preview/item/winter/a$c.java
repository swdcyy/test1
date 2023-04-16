package com.kuaishou.live.preview.item.winter.a$c;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.kuaishou.live.preview.item.winter.a;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive;
import java.lang.Object;
import uxc.f;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import lnc.i3;
import h61.a;
import java.lang.Integer;

public class a$c implements WebViewFragment$a	// class@000e62
{
    public final LiveStreamModel$WinterOlympicSimpleLive a;
    public final a b;

    public void a$c(a p0,LiveStreamModel$WinterOlympicSimpleLive p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       f.c(this);
    }
    public void b(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a$c.class, "1")) {
          return;
       }
       if (!p2) {
          this.b.R8();
       }
       a.e("OLYMPIC_PREVIEW_LOAD_FINISH", a.a(p2, this.a));
       return;
    }
    public void c(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, a$c.class, "2")) {
          return;
       }
       this.b.R8();
       a.e("OLYMPIC_PREVIEW_LOAD_FINISH", a.a(false, this.a));
       return;
    }
    public void d(WebView p0,int p1){
       f.d(this, p0, p1);
    }
}
