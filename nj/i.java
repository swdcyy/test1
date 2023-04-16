package nj.i;
import android.view.View$OnClickListener;
import com.gifshow.tuna.player.component.TunaSlidePlayFragment;
import java.lang.Object;
import android.view.View;

public final class i implements View$OnClickListener	// class@002715
{
    public final TunaSlidePlayFragment b;

    public void i(TunaSlidePlayFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.ch();
    }
}
