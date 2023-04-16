package b53.z;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kuaishou.live.gzone.barrage.i;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import b53.s;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import b53.e;

public class z implements SeekBar$OnSeekBarChangeListener	// class@00032d
{
    public final i b;

    public void z(i p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, z.class, "1")) {
          return;
       }
       z tb = this.b;
       p1 = p1 + 20;
       tb.r = p1;
       tb.q.d(((float)p1 / 100.00f));
       this.b.u.setText(this.b.r+"%");
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       int i = p0.getProgress() + 20;
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), null, uoe, "5")) {
          e.a("SELECT_LIVE_BARRAGE_FONT_ALPHA", i);
       }
       return;
    }
}
