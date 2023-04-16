package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$f;
import com.kuaishou.webkit.extension.KsWebViewPageLoadListener;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import p80.v;

public final class KsWebViewInitModule$f implements KsWebViewPageLoadListener	// class@0019db
{

    public void KsWebViewInitModule$f(){
       super();
    }
    public void onPageLoad(String p0,int p1,boolean p2){
    }
    public void onPageLoad(String p0,int p1,boolean p2,String p3){
       if (PatchProxy.isSupport(KsWebViewInitModule$f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, KsWebViewInitModule$f.class, "1")) {
          return;
       }
       if (p1 == 4) {
          v.h(0, "recent_urls", p0, p3);
       }
       return;
    }
    public void onUploadKsWebViewAssistantInfo(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsWebViewInitModule$f.class, "2")) {
          return;
       }
       v.h(1, p0, p1, p2);
       return;
    }
}
