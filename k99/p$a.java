package k99.p$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import k99.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.viewpager.PhotosViewPager;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import sd5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import androidx.recyclerview.widget.RecyclerView;

public final class p$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@002b8b
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       int height1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p$a.class, "1")) {
          return;
       }
       p.P8(this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
       p r = this.b.r;
       if (r == null) {
          a.S("mPhoto");
       }
       String obj = PatchProxy.applyOneRefs(r, objArray, a.class, "2");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          ImageMeta$AtlasCoverSize[] atlasSizes = r.getAtlasSizes();
          if (atlasSizes != null) {
             obj = null;
             height1 = 0;
             int i = 0;
             while (height1 >= atlasSizes.length || (atlasSizes[height1].mHeight - obj && atlasSizes[height1].mWidth - obj)) {
                float f = atlasSizes[height1].mWidth / atlasSizes[height1].mHeight;
                if (!height1) {
                   i = f;
                }else if(f - i){
                   b = false;
                   break ;
                }
                height1 = height1 + 1;
             }
          }
       }
       if (b) {
          return;
       }else {
          r = this.b.p;
          if (r == null) {
             a.S("mRecyclerView");
          }
          RecyclerView recyclerView = r.get();
          if (recyclerView != null) {
             int height = p.P8(this.b).getHeight();
             height1 = recyclerView.getHeight();
             if (height <= height1) {
                return;
             }else {
                recyclerView.scrollBy(0, (int)((float)(height - height1) / 2.00f));
             }
          }
          return;
       }
    }
}
