package hp8.i;
import java.lang.Runnable;
import com.tachikoma.core.component.text.c;
import android.graphics.Bitmap;
import hp8.g;
import hp8.o;
import android.widget.TextView;
import java.lang.Object;
import java.util.Objects;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.content.Context;
import iq8.n;

public final class i implements Runnable	// class@0025d0
{
    public final c b;
    public final Bitmap c;
    public final g d;
    public final o e;
    public final TextView f;

    public void i(c p0,Bitmap p1,g p2,o p3,TextView p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       i tb = this.b;
       i td = this.d;
       i te = this.e;
       Objects.requireNonNull(tb);
       BitmapDrawable uBitmapDrawa = new BitmapDrawable(tb.e.getResources(), this.c);
       uBitmapDrawa.setBounds(0, 0, n.b(td.k), n.b(td.l));
       te.setBounds(0, 0, n.b(td.k), n.b(td.l));
       te.a = uBitmapDrawa;
       te.invalidateSelf();
       this.f.invalidate();
    }
}
