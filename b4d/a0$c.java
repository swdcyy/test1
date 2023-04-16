package b4d.a0$c;
import com.yxcorp.gifshow.widget.EmojiEditText$c;
import b4d.a0;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import kotlin.jvm.internal.a;
import mrd.c;
import brd.y;

public final class a0$c implements EmojiEditText$c	// class@00034f
{
    public final a0 a;

    public void a0$c(a0 p0){
       this.a = p0;
       super();
    }
    public final boolean a(View p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(a0$c.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a0$c.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 4 && a0.R8(this.a).Fi()) {
          a.o(p2, "event");
          if (p2.getAction() == 1) {
             a0.P8(this.a).onNext(Boolean.FALSE);
          }
          return true;
       }else {
          return false;
       }
    }
}
