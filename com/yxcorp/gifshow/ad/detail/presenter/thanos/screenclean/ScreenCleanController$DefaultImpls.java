package com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController$DefaultImpls;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import msd.a;
import java.lang.Object;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController$clearScreen$1;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController$resumeScreen$1;

public final class ScreenCleanController$DefaultImpls	// class@0016c9
{

    public static void a(ScreenCleanController p0,boolean p1,int p2,a p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 8;
       }
       ScreenCleanController$clearScreen$1 iNSTANCE = (p4 & 0x04)? ScreenCleanController$clearScreen$1.INSTANCE: null;
       p0.d(p1, p2, iNSTANCE);
       return;
    }
    public static void b(ScreenCleanController p0,boolean p1,a p2,int p3,Object p4){
       ScreenCleanController$resumeScreen$1 iNSTANCE = (p3 & 0x02)? ScreenCleanController$resumeScreen$1.INSTANCE: null;
       p0.e(p1, iNSTANCE);
       return;
    }
}
