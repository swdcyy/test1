package h33.s;
import u07.u;
import h33.y;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import android.content.Intent;
import java.lang.String;
import h33.d;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class s implements u	// class@002c2e
{
    public final y b;
    public final SlipSwitchButton c;

    public void s(y p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       s tb = this.b;
       Objects.requireNonNull(tb);
       d uod = new d(tb, this.c);
       tb.b.t1(new Intent("android.settings.SETTINGS"), 1001, uod);
    }
}
