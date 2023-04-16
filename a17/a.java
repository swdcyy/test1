package a17.a;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import android.graphics.Path;
import a17.a$a;
import android.view.View;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView$y;

public final class a extends RecyclerView$n	// class@00000c
{
    public RectF a;
    public Path b;
    public final RecyclerView c;
    public final float d;
    public final float e;

    public void a(RecyclerView p0,float p1,float p2){
       a.p(p0, "recyclerView");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.a = new RectF();
       this.b = new Path();
       f.F(p0, new a$a(this));
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       a.p(p0, "c");
       a.p(p1, "parent");
       a.p(p2, "state");
       p0.clipRect(this.a);
       p0.clipPath(this.b);
    }
    public final RecyclerView f(){
       return this.c;
    }
}
