package com.kuaishou.merchant.home2.main.widget.MerchantHomeRootView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import mrd.a;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;

public class MerchantHomeRootView extends ConstraintLayout	// class@00181c
{
    public final c B;
    public boolean C;

    public void MerchantHomeRootView(Context p0){
       super(p0, null);
    }
    public void MerchantHomeRootView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.B = a.g();
       this.C = true;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomeRootView.class, "2")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.C != null) {
          this.B.onNext(Boolean.TRUE);
       }
       return;
    }
    public void setDispatchDrawSubjectEnabled(boolean p0){
       this.C = p0;
    }
}
