package k99.g0;
import erd.g;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.f;
import java.lang.Object;
import java.lang.Boolean;
import im8.f;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Integer;

public final class g0 implements g	// class@002b7a
{
    public final f b;

    public void g0(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g0 tb = this.b;
       p0 = tb.C.get();
       if (p0 != null) {
          f e = tb.E;
          if (e.mFromCaptionOrCommentClick != null) {
             float f = 3.00f;
             int i = (int)(((float)(tb.z * 4) / f) - (float)tb.y);
             if (i < 0 && e.mDetailImageAnimaOpt == null) {
                p0 = p0.getLayoutManager();
                if (p0 != null) {
                   p0.scrollToPositionWithOffset(0, (int)(((float)(tb.z * 4) / f) - (float)tb.y));
                }
                tb.v.set(Integer.valueOf((- i)));
             }
          }
       }
       return;
    }
}
