package oj.e;
import java.lang.Runnable;
import com.gifshow.tuna.player.poi.f;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import android.widget.LinearLayout;

public final class e implements Runnable	// class@0027d5
{
    public final f b;
    public final View c;
    public final View d;

    public void e(f p0,View p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       this.c.setTranslationX(((float)this.d.getWidth() - ((float)tb.f.getWidth() / 2.00f)));
    }
}
