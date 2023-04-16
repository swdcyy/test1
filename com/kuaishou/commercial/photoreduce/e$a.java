package com.kuaishou.commercial.photoreduce.e$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.commercial.photoreduce.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;

public class e$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001525
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       this.b.m8().getViewTreeObserver().removeGlobalOnLayoutListener(this);
       e$a tb = this.b;
       tb.S8(tb.m8());
       return;
    }
}
