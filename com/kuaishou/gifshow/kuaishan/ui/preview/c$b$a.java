package com.kuaishou.gifshow.kuaishan.ui.preview.c$b$a;
import com.kwai.framework.player.helper.g;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import lnc.a1;
import com.kuaishou.gifshow.kuaishan.ui.preview.f;
import e17.i;
import java.lang.System;
import w46.b;
import r90.r;

public class c$b$a extends g	// class@001aea
{
    public final c$b a;

    public void c$b$a(c$b p0){
       this.a = p0;
       super();
    }
    public void a(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSPreviewAdapter", "onFinished: "+p0.getPrettyString(), objArray);
       AcCallBackInfo stopReason = p0.stopReason;
       boolean b = true;
       if (stopReason != b && stopReason != 2) {
          c$b$a uob$a = (a1.o(c$b.f1) - 3000 > 0 && this.a.k != null)? 1: null;
          if (uob$a) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e7);
             c$b.f1 = System.currentTimeMillis();
          }
          uob$a = this.a;
          uob$a.W0 = b;
          uob$a.B();
          this.a.w(b, 0);
          if (p0.stopReason == 3) {
             this.a.c();
             Object[] objArray1 = new Object[0];
             e.D().t("KSPreviewAdapter", "download failed, release the player", objArray1);
          }
       }else if(stopReason == b){
          c$b$a ta = this.a;
          ta.Z0 = b;
          if (ta.Y0 != null && ta.k != null) {
             c$b q = ta.Q;
             if (q != null) {
                q.b(ta.b);
             }
          }
       }
       return;
    }
    public void b(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b$a.class, "1")) {
          return;
       }
       if (p0.progressPosition - c$b.e1 >= 0) {
          c$b$a ta = this.a;
          ta.Z0 = true;
          if (ta.Y0 != null && ta.k != null) {
             c$b q = ta.Q;
             if (q != null) {
                q.b(ta.b);
             }
          }
       }
       return;
    }
}
