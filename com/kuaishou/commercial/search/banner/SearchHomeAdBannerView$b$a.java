package com.kuaishou.commercial.search.banner.SearchHomeAdBannerView$b$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.commercial.search.banner.SearchHomeAdBannerView$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;

public class SearchHomeAdBannerView$b$a extends m	// class@001548
{
    public final int c;
    public final int d;
    public final SearchHomeAdBannerView$b e;

    public void SearchHomeAdBannerView$b$a(SearchHomeAdBannerView$b p0,int p1,int p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchHomeAdBannerView$b$a.class, "1")) {
          return;
       }
       SearchHomeAdBannerView$b e = this.e.e;
       e.f(this.c, e.getMBanners().get(this.d));
       return;
    }
}
