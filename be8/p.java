package be8.p;
import io.reactivex.g;
import java.lang.String;
import v88.h;
import java.lang.Object;
import brd.v;
import x88.d;
import ya8.n0$b;
import ya8.n0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import brd.g;

public final class p implements g	// class@00033d
{
    public final String b;
    public final h c;

    public void p(String p0,h p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       d uod = new d();
       n0.b(this.b, this.c).a("binary", uod);
       d h = uod.h;
       p0.onNext(BitmapFactory.decodeByteArray(h, 0, h.length));
       p0.onComplete();
    }
}
