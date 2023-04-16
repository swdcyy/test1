package com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.GalleryPageBigCardPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.view.HorizontalRecyclerView;
import androidx.recyclerview.widget.RecyclerView;

public final class GalleryPageBigCardPresenter$b implements Runnable	// class@001828
{
    public final GalleryPageBigCardPresenter b;
    public final int c;

    public void GalleryPageBigCardPresenter$b(GalleryPageBigCardPresenter p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GalleryPageBigCardPresenter$b.class, "1")) {
          return;
       }
       GalleryPageBigCardPresenter$b tb = this.b;
       tb.L = true;
       GalleryPageBigCardPresenter.Y8(tb).smoothScrollToPosition(this.c);
       return;
    }
}
