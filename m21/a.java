package m21.a;
import qq5.a;
import android.content.Context;
import l12.c;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouseItemView;
import android.util.AttributeSet;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import m21.a$a;
import android.widget.FrameLayout;

public final class a extends a	// class@00310c
{
    public final Context a;
    public final c b;
    public final View$OnClickListener c;

    public void a(Context p0,c p1,View$OnClickListener p2){
       a.p(p0, "context");
       a.p(p1, "liveCarousePedantItem");
       a.p(p2, "clickListener");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public View f(){
       Object[] objArray = null;
       LiveCarouseItemView obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveCarouseItemView(this.a, objArray, 0);
       c cdnUrls = this.b.cdnUrls;
       if (!PatchProxy.applyVoidOneRefs(cdnUrls, obj, LiveCarouseItemView.class, "2")) {
          a.p(cdnUrls, "urls");
          LiveCarouseItemView b = obj.b;
          if (b == null) {
             a.S("mImageView");
          }
          b.U(cdnUrls);
       }
       obj.setOnClickListener(new a$a(this));
       return obj;
    }
}
