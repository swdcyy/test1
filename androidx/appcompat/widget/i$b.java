package androidx.appcompat.widget.i$b;
import a2.o0;
import androidx.appcompat.widget.i;
import android.view.View;
import android.view.ViewGroup;

public class i$b extends o0	// class@00064e
{
    public boolean a;
    public final int b;
    public final i c;

    public void i$b(i p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
       this.a = false;
    }
    public void a(View p0){
       if (this.a == null) {
          this.c.a.setVisibility(this.b);
       }
       return;
    }
    public void b(View p0){
       this.c.a.setVisibility(0);
    }
    public void c(View p0){
       this.a = true;
    }
}
