package gn1.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;

public final class e implements Observer	// class@002523
{
    public final LiveHotSpotDetailBaseInfoDataBinding b;

    public void e(LiveHotSpotDetailBaseInfoDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else if(p0 != null){
          TextView textView = this.b.d.findViewById(R.id.hot_value_text);
          a.o(textView, "hotValueText");
          textView.setText(p0);
       }
       return;
    }
}
