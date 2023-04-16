package com.yxcorp.gifshow.detail.plc.presenter.b$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;

public class b$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001699
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       this.b.m8().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.Z8();
       return;
    }
}
