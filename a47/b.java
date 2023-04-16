package a47.b;
import m0d.a;
import a47.c;
import brd.v;
import java.lang.String;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import lnc.a1;
import brd.g;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public class b extends a	// class@00004a
{
    public final v b;
    public final String c;
    public final c d;

    public void b(c p0,v p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0 instanceof BitmapDrawable) {
          p0.setBounds(0, 0, a1.d(R.dimen.arg_RES_7f070e8d), a1.d(R.dimen.arg_RES_7f070e8d));
          this.b.onNext(p0);
          this.b.onComplete();
       }else {
          this.b.onError(new IllegalArgumentException("drawable is not BitmapDrawable , iconUrl = "+this.c));
       }
       return;
    }
}
