package op2.j;
import op2.f;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;

public interface abstract j	// class@003b29
{

    void B(int p0,f p1);
    void P(f p0);
    void W();
    void e0();
    void k(TheaterDisplayMode p0);
    void onPause();
    void onProgress(long p0,long p1);
    void onResume();
    void p();
    void y(LiveQualityItem p0,List p1);
}
