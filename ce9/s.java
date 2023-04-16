package ce9.s;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.camera.record.magic.l;
import java.lang.Object;
import boc.b;
import java.util.Objects;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import k4b.a;
import m4b.c;
import boc.z;
import java.lang.Throwable;

public final class s implements n$c	// class@0005cf
{
    public final l a;

    public void s(l p0){
       this.a = p0;
    }
    public final void a(b p0){
       s ta = this.a;
       Objects.requireNonNull(ta);
       if (MagicEmojiResourceHelper.o(p0)) {
          ta.p.B0();
          ta.p.y(p0);
       }
       return;
    }
    public void b(b p0,float p1){
       z.c(this, p0, p1);
    }
    public void c(b p0){
       z.a(this, p0);
    }
    public void d(b p0,Throwable p1){
       z.b(this, p0, p1);
    }
}
