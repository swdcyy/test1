package gn1.c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class c implements Observer	// class@002521
{
    public final LiveHotSpotDetailBaseInfoDataBinding b;

    public void c(LiveHotSpotDetailBaseInfoDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(p0 != null){
          this.b.d.findViewById(R.id.hot_icon_img).P(p0);
       }
       return;
    }
}
