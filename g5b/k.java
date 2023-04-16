package g5b.k;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h;
import java.lang.Object;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import com.yxcorp.gifshow.model.MagicEmoji$a;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import s5b.b;
import w46.b;

public class k implements PrettifyDoubleSeekBar$a	// class@002a85
{
    public final h b;

    public void k(h p0){
       this.b = p0;
       super();
    }
    public void N2(PrettifyDoubleSeekBar p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ok, "2")) {
          return;
       }
       k tb = this.b;
       tb.j9(false, tb.X8(tb.J));
       tb = this.b;
       tb.E.removeCallbacks(tb.R);
       return;
    }
    public void U1(PrettifyDoubleSeekBar p0,int p1){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, k.class, "1")) {
          return;
       }
       this.b.Y8();
       return;
    }
    public void V1(PrettifyDoubleSeekBar p0,int p1){
       boolean b;
       k tb;
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ok, "3")) {
          return;
       }
       ok = this.b;
       MagicEmoji$a uoa = ok.X8(ok.J);
       if (uoa != null) {
          b = true;
          this.b.j9(b, uoa);
          float f = (float)p1 / (float)p0.getMaxProgress();
          uoa.g(f, b);
          if (!p1) {
             tb = this.b;
             tb.e9(tb.N.mId, tb.J, 0);
          }else {
             tb = this.b;
             tb.d9(tb.N.mId, tb.J);
          }
          tb = this.b;
          tb.O = b;
          tb.h9(tb.N.mId, tb.J, f);
          this.b.n9(p1);
       }else {
          Object[] objArray = new Object[0];
          b.D().t("MagicEmojiSeekBar", "onStopTrackingTouch with null MagicFace or SeekBarConfig", objArray);
       }
       tb = this.b;
       tb.E.postDelayed(tb.R, 3000);
       return;
    }
}
