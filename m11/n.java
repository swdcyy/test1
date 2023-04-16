package m11.n;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import m11.p;
import java.lang.Object;
import java.util.Objects;
import m11.o;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class n implements LivePlayerTypeChangeListener	// class@003107
{
    public final p b;

    public void n(p p0){
       this.b = p0;
    }
    public final void onLiveTypeChange(int p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       f.i("LivePlayerTypeChangeListener.handleLiveStreamTypeChanged", new o(tb), tb);
    }
}
