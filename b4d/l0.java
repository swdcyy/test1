package b4d.l0;
import android.content.DialogInterface$OnDismissListener;
import b4d.n0$a;
import com.yxcorp.plugin.emotion.searchgif.SearchEmotionGifFragment;
import java.lang.Object;
import android.content.DialogInterface;
import b4d.n0;

public final class l0 implements DialogInterface$OnDismissListener	// class@00037b
{
    public final n0$a b;
    public final SearchEmotionGifFragment c;

    public void l0(n0$a p0,SearchEmotionGifFragment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onDismiss(DialogInterface p0){
       this.b.a.R8(true, this.c.F);
    }
}
