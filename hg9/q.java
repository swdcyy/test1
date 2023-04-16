package hg9.q;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.g;
import java.lang.Object;
import j4b.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.video.westeros.models.EffectDescription;
import xi9.n;
import j8c.a;
import q87.c;

public final class q implements g	// class@002672
{
    public final g b;

    public void q(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "15")) {
       }else if(p0.a != null && (tb.A != null && tb.t2(tb.g.w0()))){
          Object[] objArray = new Object[0];
          a.D().w("PhotoMagicController", "showMagicEmoji by AutoApplyMagicFace with MagicEmojiFragmentExtraView when MagicEditionBtnChangeEvent", objArray);
          tb.s2(0);
       }
       return;
    }
}
