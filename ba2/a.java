package ba2.a;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class a implements g	// class@000383
{
    public final LiveFancyRankResultViewV2 b;

    public void a(LiveFancyRankResultViewV2 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.i.setBackground(new BitmapDrawable(a1.m(), p0));
    }
}
