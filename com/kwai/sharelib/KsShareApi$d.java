package com.kwai.sharelib.KsShareApi$d;
import uo7.b0;
import java.lang.Object;
import uo7.k;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uo7.b0$a;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;

public final class KsShareApi$d implements b0	// class@001692
{

    public void KsShareApi$d(){
       super();
    }
    public void a(k p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsShareApi$d.class, "3")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "it");
       b0$a.b(this, p0, p1);
       return;
    }
    public void b(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsShareApi$d.class, "2")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "element");
       b0$a.c(this, p0, p1);
       return;
    }
    public void c(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KsShareApi$d.class, "1")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "element");
       a.p(p2, "it");
       return;
    }
}
