package i59.e;
import android.text.style.ClickableSpan;
import goc.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import e3a.a;
import wkd.b;
import my.a;
import goc.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import msd.l;

public class e extends ClickableSpan	// class@002633
{
    public final b b;

    public void e(b p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       Context context = p0.getContext();
       b f = this.b.f;
       if (f != null) {
          PhotoAdDataWrapper photoAdDataW = new PhotoAdDataWrapper(f.mEntity);
          b.a(0x1f7421d5).a(a.b(context), photoAdDataW, null, new a(photoAdDataW), null);
       }
       return;
    }
}
