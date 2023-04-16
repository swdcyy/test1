package com.kuaishou.merchant.home2.main.widget.MerchantMallRootView;
import com.yxcorp.gifshow.widget.density.KwaiFixedConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import mrd.a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Canvas;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Boolean;
import brd.y;

public class MerchantMallRootView extends KwaiFixedConstraintLayout	// class@00181d
{
    public final c C;
    public boolean D;

    public void MerchantMallRootView(Context p0){
       super(p0, null);
    }
    public void MerchantMallRootView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.C = a.g();
       this.D = true;
    }
    public t L(){
       Object obj = PatchProxy.apply(null, this, MerchantMallRootView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.hide();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantMallRootView.class, "2")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.D != null) {
          this.C.onNext(Boolean.TRUE);
       }
       return;
    }
    public void setDispatchDrawSubjectEnabled(boolean p0){
       this.D = p0;
    }
}
