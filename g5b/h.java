package g5b.h;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.h;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;

public final class h implements g	// class@002a82
{
    public final h b;

    public void h(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       int i = p0.intValue();
       Objects.requireNonNull(tb);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, oh, "9")) {
          int i1 = 0;
          if (tb.N != null) {
             Object[] objArray = new Object[i1];
             b.D().w("MagicEmojiSeekBar", "onGenderDetect "+i, objArray);
             if (i == 1) {
                i1 = true;
             }
             tb.P = i1;
             tb.k9();
          }else {
             Object[] objArray1 = new Object[i1];
             b.D().w("MagicEmojiSeekBar", "Magicface null, discard current gender result "+i, objArray1);
          }
       }
       return;
    }
}
