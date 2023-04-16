package b53.a0;
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
import b53.e;

public class a0 implements SeekBar$OnSeekBarChangeListener	// class@0002ff
{
    public final i b;

    public void a0(i p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(a0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, a0.class, "1")) {
          return;
       }
       this.b.q.f(p1);
       this.b.h0(p1);
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       int i = p0.getProgress() + 1;
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), null, uoe, "6")) {
          e.a("SELECT_LIVE_BARRAGE_FONT_SIZE", i);
       }
       return;
    }
}
