package nmd.j;
import erd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;

public final class j implements g	// class@001e5f
{
    public final c b;

    public void j(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       c d = tb.d;
       if (d != null) {
          d.dispose();
          tb.d = null;
       }
       tb.b();
       PostUtils.D("NewStickerEditor", "registerStickerClickSubject: ", p0);
       return;
    }
}
