package nz9.z0$h;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$c;
import nz9.z0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import as7.a;
import java.lang.StringBuilder;
import q87.c;
import nz9.m1;
import tkd.b;
import tkd.d;
import os5.l;
import nz9.b1;
import java.lang.Runnable;
import ekd.k1;
import nz9.c1;

public class z0$h implements LiveAutoPlay$c	// class@00325f
{
    public final z0 a;

    public void z0$h(z0 p0){
       this.a = p0;
       super();
    }
    public void onVideoSizeChanged(int p0,int p1){
    }
    public void onVideoSizeChangedWithType(int p0,int p1,int p2){
       if (PatchProxy.isSupport(z0$h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, z0$h.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("AvatarAndFollowBaseElement", "onVideoSizeChangedWithType: width = "+p0+"£¬height =  "+p1+", type = "+p2+", mIsPkOrLineLive = "+this.a.a1, objArray);
       if (p0 && p1) {
          z0$h ta = this.a;
          boolean b = (p0 < p1)? true: false;
          ta.Z0 = b;
          if (m1.a()) {
             int i = -1492894991;
             if (!d.a(i).Z9(p2) && !d.a(i).kA(p2)) {
                p0.a1 = false;
                if (this.a.Z0 != null) {
                   k1.o(new b1(this));
                }
             }else if(d.a(i).Z9(p2)){
                p2.a1 = true;
                if (this.a.Z0 == null) {
                   k1.o(new c1(this, p1, p0));
                }
             }
          }
       }
    label_00ba :
       return;
    }
}
