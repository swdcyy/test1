package nmd.a$c;
import android.view.View$OnTouchListener;
import nmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteStickerFeedUIData;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class a$c implements View$OnTouchListener	// class@001e47
{
    public final a b;
    public final MultiVoteStickerFeedUIData c;
    public final int d;

    public void a$c(a p0,MultiVoteStickerFeedUIData p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       if (1 == p1.getAction()) {
          this.b.b(this.c, this.d);
       }
       return false;
    }
}
