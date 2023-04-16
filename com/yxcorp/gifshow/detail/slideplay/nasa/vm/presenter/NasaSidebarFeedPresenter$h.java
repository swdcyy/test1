package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$h;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;

public class NasaSidebarFeedPresenter$h implements ViewTreeObserver$OnPreDrawListener	// class@0017fa
{
    public final View b;
    public final LinearLayoutManager c;
    public final int d;
    public final int e;
    public int f;

    public void NasaSidebarFeedPresenter$h(View p0,LinearLayoutManager p1,int p2,int p3){
       super();
       this.f = 0;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.applyWithListener(null, this, NasaSidebarFeedPresenter$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.f = this.f + 1;
       if (this.c.findViewByPosition(this.d) != null || this.f > 3) {
          this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       }else {
          this.c.scrollToPositionWithOffset(this.d, this.e);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter$h.class, "1");
       return 1;
    }
}
