package hf1.j;
import cp3.d;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import cm1.a;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;

public final class j implements d	// class@002689
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final Drawable a(int p0){
       BitmapDrawable obj;
       Drawable uDrawable;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oj, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Bitmap uBitmap = a.b(p0);
       obj = (uBitmap != null)? new BitmapDrawable(a1.m(), uBitmap): null;
       return obj;
    }
}
