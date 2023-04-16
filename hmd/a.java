package hmd.a;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.f$a;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.utility.n;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class a implements View$OnClickListener	// class@000f8a
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "9")) {
       }else if(tb.r == null){
          boolean b = true;
          tb.u = b;
          f b1 = tb.b;
          int i = 0;
          if (b1 != null && tb.n != null) {
             int[] ointArray = new int[2];
             b1.getLocationOnScreen(ointArray);
             b1 = tb.n;
             b1.a = (float)ointArray[i];
             b1.c = (float)ointArray[b];
          }
          n.X(tb.b, 4, 170, new f$a(tb));
          if (tb.n != null) {
             Object[] objArray = new Object[i];
             a.D().s("InteractStickerViewHelper", "showVoteView: "+tb.n.toString(), objArray);
          }
       }
       return;
    }
}
