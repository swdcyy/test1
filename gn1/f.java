package gn1.f;
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

public final class f implements Observer	// class@002524
{
    public final LiveHotSpotDetailBaseInfoDataBinding b;

    public void f(LiveHotSpotDetailBaseInfoDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(p0 != null){
          TextView textView = this.b.d.findViewById(R.id.watch_value_text);
          a.o(textView, "watchViewText");
          textView.setText(p0);
       }
       return;
    }
}
