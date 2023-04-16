package gn1.d;
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

public final class d implements Observer	// class@002522
{
    public final LiveHotSpotDetailBaseInfoDataBinding b;

    public void d(LiveHotSpotDetailBaseInfoDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else if(p0 != null){
          TextView textView = this.b.d.findViewById(R.id.hot_top_text);
          a.o(textView, "textView");
          textView.setText(p0);
       }
       return;
    }
}
