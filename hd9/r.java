package hd9.r;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import android.view.View;
import ed9.h;

public final class r implements View$OnClickListener	// class@002629
{
    public final d b;

    public void r(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       r tb = this.b;
       int i = tb.s.isSelected() ^ 0x01;
       tb.F.e = i;
       tb.s.setSelected(i);
       tb.K2();
    }
}
