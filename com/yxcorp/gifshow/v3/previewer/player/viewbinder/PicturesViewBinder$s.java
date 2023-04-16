package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$s;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.database.DataSetObserver;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;

public final class PicturesViewBinder$s implements ViewTreeObserver$OnGlobalLayoutListener	// class@001600
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$s(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, PicturesViewBinder$s.class, "1")) {
          return;
       }
       this.b.j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (!this.b.l.getVisibility()) {
          this.b.l.getDataSetObserver().onChanged();
          PicturesViewBinder$s tb = this.b;
          tb.l.g(tb.J.q0());
          tb = this.b;
          tb.S(tb.J.q0());
       }
       return;
    }
}
