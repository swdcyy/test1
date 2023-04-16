package com.feature.post.bridge.d1;
import mg.a;
import java.lang.String;
import p55.a;
import java.lang.Object;
import f55.g;
import com.feature.post.bridge.jsmodel.JsShopVideoUploadParams;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import android.app.Activity;
import mg.r1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import og.b1;
import w26.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import com.feature.post.bridge.util.k;
import og.w0;
import erd.g;
import crd.b;

public class d1 extends a	// class@001473
{

    public void d1(){
       super();
    }
    public String d(){
       return "uploadShopVideo";
    }
    public void e(a p0,Object p1,g p2){
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("UploadShopVideoBridge", "uploadShopVideo:"+p1, objArray);
       Activity uActivity = this.c(p0);
       if (!this.f(uActivity) || !uActivity instanceof GifshowActivity) {
          Object[] objArray1 = new Object[i];
          l.D().w("UploadShopVideoBridge", "uploadShopVideo activity is not GifshowActivity", objArray1);
       }
       b1 uob1 = this.g(uActivity, p2);
       y6.s(c.class, LoadPolicy.DIALOG).R(new k(uActivity, p1, uob1), new w0(uob1));
       return;
    }
}
