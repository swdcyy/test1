package com.kwai.component.photo.reduce.n$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.component.photo.reduce.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;
import java.util.Objects;
import com.yxcorp.utility.n;

public class n$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000afa
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n$a.class, "1")) {
          return;
       }
       this.b.m8().getViewTreeObserver().removeGlobalOnLayoutListener(this);
       n$a tb = this.b;
       tb.R8(tb.m8());
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, n.class, "7") && tb.y != null) {
          View[] viewArray = new View[]{tb.u,tb.t};
          n.Z(4, viewArray);
       }
       return;
    }
}
