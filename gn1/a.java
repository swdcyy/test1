package gn1.a;
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

public final class a implements Observer	// class@00251f
{
    public final LiveHotSpotDetailBaseInfoDataBinding b;

    public void a(LiveHotSpotDetailBaseInfoDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 != null){
          this.b.d.findViewById(R.id.avatar_img).P(p0);
       }
       return;
    }
}
