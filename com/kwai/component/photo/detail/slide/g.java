package com.kwai.component.photo.detail.slide.g;
import ok.x;
import java.lang.Object;
import le5.f;
import rkd.b;
import java.lang.Boolean;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;

public final class g implements x	// class@000a53
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object get(){
       Boolean fALSE;
       if (b.f()) {
          fALSE = Boolean.FALSE;
       }else {
          int i = d.e();
          if (i != 1) {
             fALSE = (i != 2 && i != 3)? Boolean.valueOf(a.t().d("newFeedbackPanelSameios2", false)): Boolean.TRUE;
          }else {
             fALSE = Boolean.FALSE;
          }
       }
       return fALSE;
    }
}
