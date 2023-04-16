package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$c$a;
import com.kuaishou.webkit.extension.KsWebViewPageLoadListener;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import p80.v;

public final class KsWebViewInitModule$c$a implements KsWebViewPageLoadListener	// class@0019d6
{

    public void KsWebViewInitModule$c$a(){
       super();
    }
    public void onPageLoad(String p0,int p1,boolean p2){
       if (PatchProxy.isSupport(KsWebViewInitModule$c$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, KsWebViewInitModule$c$a.class, "1")) {
          return;
       }
       if (p1 == 4) {
          v.f(p0, p1, p2);
       }
       return;
    }
    public void onPageLoad(String p0,int p1,boolean p2,String p3){
       if (PatchProxy.isSupport(KsWebViewInitModule$c$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, KsWebViewInitModule$c$a.class, "2")) {
          return;
       }
       if (p1 == 4) {
          v.f(p0, p1, p2);
          v.h(0, "recent_urls", p0, p3);
       }
       return;
    }
    public void onUploadKsWebViewAssistantInfo(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsWebViewInitModule$c$a.class, "3")) {
          return;
       }
       v.h(1, p0, p1, p2);
       return;
    }
}
