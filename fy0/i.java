package fy0.i;
import android.view.ViewStub;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.PointF;

public class i	// class@0023d7
{
    public ViewStub a;
    public ViewGroup b;
    public KwaiImageView c;
    public RecyclerView d;
    public i$a e;

    public void i(ViewStub p0){
       super();
       this.a = p0;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.c.setVisibility(8);
       }else {
          this.c.setVisibility(0);
          this.c.L(p0);
          this.c.getHierarchy().t(new PointF(0x3f800000, 0x3f000000));
       }
       return;
    }
}
