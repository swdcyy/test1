package com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog$b;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;
import com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog;
import java.lang.Object;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import dxb.o;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.viewpager2.widget.ViewPager2;

public class ImageDownloadForSearchDialog$b implements PagerIndicator$d	// class@000ed0
{
    public final ImageDownloadForSearchDialog a;

    public void ImageDownloadForSearchDialog$b(ImageDownloadForSearchDialog p0){
       this.a = p0;
       super();
    }
    public void a(PagerIndicator$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageDownloadForSearchDialog$b.class, "1")) {
          return;
       }
       this.a.E.remove(p0);
       return;
    }
    public int b(){
       return this.a.q.i;
    }
    public void c(int p0){
    }
    public void d(PagerIndicator$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageDownloadForSearchDialog$b.class, "2")) {
          return;
       }
       this.a.E.add(p0);
       return;
    }
    public int e(){
       return (this.a.q.n - this.a.q.m);
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, ImageDownloadForSearchDialog$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.s.getAdapter() != null)? true: false;
       return b;
    }
}
