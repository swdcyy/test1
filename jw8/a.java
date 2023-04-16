package jw8.a;
import com.kuaishou.viewbinder.IViewBinder;
import java.lang.Object;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import ypc.a;
import jw8.r$a;

public abstract class a implements IViewBinder	// class@0029b8
{
    public KwaiImageView b;
    public FrameLayout c;
    public ImageView d;
    public MagicFaceDownloadProgressBar e;
    public TextView f;

    public void a(){
       super();
    }
    public final ImageView a(){
       return this.d;
    }
    public final MagicFaceDownloadProgressBar b(){
       return this.e;
    }
    public final KwaiImageView c(){
       return this.b;
    }
    public final TextView d(){
       return this.f;
    }
    public final FrameLayout e(){
       return this.c;
    }
    public abstract void f(int p0,a p1,r$a p2);
}
