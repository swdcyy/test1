package ef1.a;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$a;
import java.lang.Object;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import androidx.core.content.ContextCompat;

public final class a implements HighFluencyDescriptionBinder$a	// class@002142
{

    public void a(){
       super();
    }
    public Drawable a(Context p0,int p1){
       Drawable obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       obj = null;
       Gift gift = (p1 <= 0)? obj: a.a(p1);
       if (gift != null && !TextUtils.x(gift.mName)) {
          Bitmap uBitmap = a.b(gift.mId);
          BitmapDrawable uBitmapDrawa = (uBitmap != null && !uBitmap.isRecycled())? new BitmapDrawable(p0.getResources(), uBitmap): ContextCompat.getDrawable(p0, R.drawable.arg_RES_7f0814c2);
       }
    label_0051 :
       return obj;
    }
}
