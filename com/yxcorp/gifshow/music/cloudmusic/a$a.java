package com.yxcorp.gifshow.music.cloudmusic.a$a;
import android.view.View$OnLayoutChangeListener;
import com.yxcorp.gifshow.music.cloudmusic.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup$LayoutParams;
import lob.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import lnc.a1;

public class a$a implements View$OnLayoutChangeListener	// class@001feb
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(a$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
             return;
          }
       }
       this.b.v.removeOnLayoutChangeListener(this);
       if (this.b.getActivity() != null) {
          ViewGroup$LayoutParams layoutParams = this.b.v.getLayoutParams();
          Activity activity = this.b.getActivity();
          Object obj = PatchProxy.applyOneRefs(activity, null, q.class, "3");
          activity = (obj != PatchProxyResult.class)? obj.intValue(): (int)((float)(n.k(activity) - (a1.e(16.00f) * 2)) * 0x3f333333);
          layoutParams.width = activity;
          this.b.v.setLayoutParams(layoutParams);
       }
       return;
    }
}
