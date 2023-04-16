package dl9.t$b;
import erd.g;
import dl9.t;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class t$b implements g	// class@001fa0
{
    public final t b;

    public void t$b(t p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$b.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          t ot = t.class;
          if (PatchProxy.isSupport(ot) && (!PatchProxy.applyVoidOneRefs(Boolean.TRUE, p0, ot, "5") && p0.R8())) {
             ot = p0.p;
             String str = "mComment";
             if (ot == null) {
                a.S(str);
             }
             if (ot.mUpdateLikeType == true) {
                ot = p0.p;
                if (ot == null) {
                   a.S(str);
                }
                if (ot.mDisliked != null) {
                   ot = p0.p;
                   if (ot == null) {
                      a.S(str);
                   }
                   if (ot.mIsDislikeHideComment == null) {
                      p0.S8(true);
                   }
                }
                ot = p0.p;
                if (ot == null) {
                   a.S(str);
                }
                if (ot.mDisliked == null) {
                   ot = p0.p;
                   if (ot == null) {
                      a.S(str);
                   }
                   if (ot.mIsDislikeHideComment != null) {
                      p0.Z8(true);
                   }
                }
             }else {
                ot = p0.p;
                if (ot == null) {
                   a.S(str);
                }
                if (ot.mUpdateLikeType == null) {
                   ot = p0.p;
                   if (ot == null) {
                      a.S(str);
                   }
                   if (ot.mDisliked != null) {
                      p0.S8(false);
                   }else {
                      p0.Z8(false);
                   }
                }else {
                   p0.Y8();
                }
             }
          }
       }
       return;
    }
}
