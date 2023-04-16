package com.feature.post.bridge.x0;
import mg.a;
import java.lang.String;
import p55.a;
import java.lang.Object;
import f55.g;
import com.feature.post.bridge.jsmodel.JSPreviewVideoParams;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import mg.r1;
import android.app.Activity;
import om6.o;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import og.u0;
import og.y0;
import erd.g;
import crd.b;

public class x0 extends a	// class@0014dd
{

    public void x0(){
       super();
    }
    public String d(){
       return "previewVideo";
    }
    public void e(a p0,Object p1,g p2){
       Object[] objArray = new Object[0];
       l.D().w("PreviewVideoBridge", "startPreviewVideoActivity "+p1, objArray);
       if (p1 == null) {
          this.b(p2, -1, "params is null");
       }else {
          y6.s(o.class, LoadPolicy.DIALOG).R(new u0(this.c(p0), p1), new y0(p2));
       }
       return;
    }
}
