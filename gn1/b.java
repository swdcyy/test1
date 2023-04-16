package gn1.b;
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
import android.text.TextPaint;

public final class b implements Observer	// class@002520
{
    public final LiveHotSpotDetailBaseInfoDataBinding b;

    public void b(LiveHotSpotDetailBaseInfoDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else if(p0 != null){
          TextView textView = this.b.d.findViewById(R.id.title_text);
          a.o(textView, "title");
          textView.setText(p0);
          p0 = textView.getPaint();
          a.o(p0, "title.paint");
          p0.setFakeBoldText(true);
       }
       return;
    }
}
