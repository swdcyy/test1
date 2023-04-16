package com.yxcorp.gifshow.growth.test.GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$b;
import zn.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.CharSequence;
import e17.i;

public final class GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$b implements a	// class@0014df
{

    public void GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$b(){
       super();
    }
    public void a(int p0,Throwable p1){
       if (PatchProxy.isSupport(GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$b.class, "2")) {
          return;
       }
       if (p1 != null) {
          String localizedMes = p1.getLocalizedMessage();
          if (localizedMes != null) {
             i.d(R.style.arg_RES_7f110668, localizedMes);
          }
       }
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, GrowthTestBubbleLayoutKt$inflateBubbleLayout$3$4$b.class, "1")) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, "kbubble tk success");
       return;
    }
}
