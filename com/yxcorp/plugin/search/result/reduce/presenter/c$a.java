package com.yxcorp.plugin.search.result.reduce.presenter.c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.plugin.search.result.reduce.presenter.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;

public class c$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00232f
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.b.m8().getViewTreeObserver().removeGlobalOnLayoutListener(this);
       c$a tb = this.b;
       tb.P8(tb.m8());
       return;
    }
}
