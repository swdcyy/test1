package com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$c;
import n3d.a;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import android.app.Activity;
import x80.g;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.yxcorp.gifshow.activity.BasePostActivity;

public final class KuaiShanEditActivityV2$c implements a	// class@001ab8
{
    public final KuaiShanEditActivityV2 b;

    public void KuaiShanEditActivityV2$c(KuaiShanEditActivityV2 p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       Object[] objArray1;
       if (PatchProxy.isSupport(KuaiShanEditActivityV2$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KuaiShanEditActivityV2$c.class, "1")) {
          return;
       }
       KuaiShanEditActivityV2$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(KuaiShanEditActivityV2.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, tb, KuaiShanEditActivityV2.class, "9")) {
          Object[] objArray = new Object[0];
          e.D().s("KuaiShanEditActivityV2", "onKSAlbumReturn\(\) called with: requestCode = ["+p0+"], resultCode = ["+p1+"], data = ["+p2+"]", objArray);
          if (p0 == 100) {
             if (p1 == -1) {
                objArray1 = new Object[0];
                e.D().s("KuaiShanEditActivityV2", "onKSAlbumReturn: back from album, navi to edit page", objArray1);
                if (!PostExperimentUtils.a0()) {
                   m1 om1 = m1.w0();
                   a.o(om1, "KuaiShanManager.getInstance\(\)");
                   e.y(tb, om1.v0(), m1.w0().f, tb.T);
                }
             }else {
                objArray1 = new Object[0];
                e.D().w("KuaiShanEditActivityV2", "onKSAlbumReturn: not select medias", objArray1);
                tb.setResult(0);
                tb.finish();
                tb.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f01010d);
             }
          }
       }
       return;
    }
}
