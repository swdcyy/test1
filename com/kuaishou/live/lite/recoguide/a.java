package com.kuaishou.live.lite.recoguide.a;
import n93.a;
import com.kuaishou.live.lite.recoguide.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.View;
import wc3.a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public class a extends a	// class@000adc
{
    public final a$a j;

    public void a(a$a p0){
       super();
       this.j = p0;
    }
    public void F2(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0d7c);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          this.A2(R.id.live_lite_reco_guide_close_button).setOnClickListener(new a(this));
       }
       return;
    }
    public int V2(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(50.00f);
    }
}
