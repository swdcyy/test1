package com.feature.post.bridge.y0;
import mg.a;
import java.lang.String;
import p55.a;
import java.lang.Object;
import f55.g;
import com.feature.post.bridge.jsmodel.JsUploadVideoParams;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import android.app.Activity;
import mg.r1;
import og.b1;
import w26.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import og.v0;
import og.x0;
import erd.g;
import crd.b;
import java.lang.NumberFormatException;

public class y0 extends a	// class@0014df
{

    public void y0(){
       super();
    }
    public String d(){
       return "reUploadShopVideo";
    }
    public void e(a p0,Object p1,g p2){
       l ol = l.D();
       String str = "reUploadShopVideo "+p1;
       Object[] objArray = new Object[0];
       try{
          ol.w("PostVideoBridge", str, objArray);
          b1 uob1 = this.g(this.c(p0), p2);
          y6.s(c.class, LoadPolicy.DIALOG).R(new v0(p1, uob1), new x0(uob1));
       }catch(java.lang.NumberFormatException e5){
          this.b(p2, -1, e5.getMessage());
       }
       return;
    }
}
