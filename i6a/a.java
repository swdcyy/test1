package i6a.a;
import android.view.View$OnClickListener;
import i6a.b;
import com.yxcorp.gifshow.detail.model.meta.InterestLabelsMeta$InterestLabel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a implements View$OnClickListener	// class@002787
{
    public final b b;
    public final InterestLabelsMeta$InterestLabel c;

    public void a(b p0,InterestLabelsMeta$InterestLabel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       this.c.mIsSelected = p0.isSelected() ^ 0x01;
       p0.setSelected(this.c.mIsSelected);
       this.b.X8();
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
