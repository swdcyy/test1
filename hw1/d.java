package hw1.d;
import w4.c;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import java.lang.Object;
import w4.i;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import java.lang.String;
import com.kuaishou.live.common.core.component.pk.b;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class d implements c	// class@00278f
{
    public final LivePkResource$PkSkinResource a;

    public void d(LivePkResource$PkSkinResource p0){
       this.a = p0;
    }
    public final Bitmap a(i p0){
       d ta = this.a;
       return BitmapUtil.t(b.i(ta.mLottieImageResFolderPath+p0.c(), ta.mResourceScopeType), p0.e(), p0.d(), false);
    }
}
