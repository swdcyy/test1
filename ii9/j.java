package ii9.j;
import android.view.View$OnClickListener;
import ii9.v;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;

public final class j implements View$OnClickListener	// class@00283c
{
    public final v b;

    public void j(v p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("WhatsUpTakePicture", "close sub camera btn clicked", objArray);
       tb.o2();
    }
}
