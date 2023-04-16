package i6a.b$a;
import d6a.a;
import i6a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i6a.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import k2b.e0;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsMeta$InterestLabel;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import android.view.View;

public final class b$a extends a	// class@002788
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void F1(){
       this.b.A = false;
    }
    public void i2(){
       if (PatchProxy.applyVoidWithListener(null, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       tb.A = true;
       if (tb.C == null) {
          PatchProxy.onMethodExit(b$a.class, "1");
          return;
       }else {
          k b = k.b;
          QPhoto photo = b.P8(tb).getPhoto();
          a.o(photo, "mDetailParam.photo");
          BaseFeed entity = photo.getEntity();
          a.o(entity, "mDetailParam.photo.entity");
          b.c(entity, b.R8(this.b), Integer.valueOf(b.a()));
          Iterator iterator = b.S8(this.b).iterator();
          while (iterator.hasNext()) {
             iterator.next().mIsSelected = false;
          }
          iterator = ViewGroupKt.b(b.V8(this.b)).iterator();
          while (iterator.hasNext()) {
             iterator.next().setSelected(false);
          }
          this.b.X8();
          this.b.W8();
          PatchProxy.onMethodExit(b$a.class, "1");
          return;
       }
    }
}
