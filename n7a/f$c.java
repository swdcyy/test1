package n7a.f$c;
import android.view.ViewTreeObserver$OnPreDrawListener;
import n7a.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;
import n7a.a;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import o7a.d;

public class f$c implements ViewTreeObserver$OnPreDrawListener	// class@0030f8
{
    public final f b;

    public void f$c(f p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       View obj = PatchProxy.apply(null, this, f$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.m8().findViewById(R.id.poster);
       if (obj == null) {
          return true;
       }
       obj.getViewTreeObserver().removeOnPreDrawListener(this);
       f$c tb = this.b;
       if (tb.u == null) {
          return true;
       }
       ImageMeta$SinglePicture mSize = tb.p.getSinglePicture().mSize;
       int i = (int)((float)obj.getWidth() / (mSize[0].mWidth / mSize[0].mHeight));
       this.b.u.setViewSize(obj.getWidth(), i);
       this.b.u.d(((obj.getHeight() - i) / 2));
       this.b.u.e(((obj.getHeight() - i) / 2));
       return true;
    }
}
