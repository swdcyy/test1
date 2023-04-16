package ab0.m;
import android.view.View$OnClickListener;
import com.kuaishou.gifshow.smartalbum.ui.grid.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import fb0.l;

public final class m implements View$OnClickListener	// class@000043
{
    public final b b;

    public void m(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       l.f("CLICK_CANCEL");
       tb.R8();
    }
}
