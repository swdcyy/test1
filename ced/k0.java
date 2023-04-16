package ced.k0;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.o;
import java.lang.Object;
import xdd.g;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.cloudmusic.h;
import android.widget.ImageView;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.kwai.library.widget.specific.misc.SpectrumView;
import com.kuaishou.android.model.music.Music;

public final class k0 implements g	// class@000562
{
    public final o b;

    public void k0(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.a;
       if (p0 != null) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 == 3 && !PatchProxy.applyVoid(null, tb, o.class, "10")) {
                   tb.B.e();
                   tb.v.setSelected(false);
                   if (tb.p.mIsMusicPlaying != null) {
                      tb.P8();
                   }
                   p0.mIsMusicPlaying = false;
                   tb.w.b();
                   tb.P8();
                }
             }else if(PatchProxy.applyVoid(null, tb, o.class, "9")){
                tb.B.h();
             }
          }else {
             tb.stop();
          }
       }else if(PatchProxy.applyVoid(null, tb, o.class, "8")){
          tb.B.l(tb.p.mMusic, false);
       }
       return;
    }
}
