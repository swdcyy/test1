package com.yxcorp.plugin.search.widget.SearchDanmakuView$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.plugin.search.widget.SearchDanmakuView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;

public class SearchDanmakuView$b implements ViewTreeObserver$OnPreDrawListener	// class@0007d6
{
    public final View b;
    public final SearchDanmakuView c;

    public void SearchDanmakuView$b(SearchDanmakuView p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, SearchDanmakuView$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       this.b.setTranslationY((float)this.c.n);
       this.c.i(this.b, true);
       return true;
    }
}
