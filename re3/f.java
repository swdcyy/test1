package re3.f;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import re3.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import msd.l;
import re3.e;

public interface abstract f	// class@003c1c
{

    LayoutConfig getLatestLayout();
    d getLayoutInterceptor();
    ConstraintLayout getOverlayContainer();
    RecyclerView getOverlayRecyclerView();
    l getPlayerViewPositionObserver();
    l getPlayerViewVisibilityObserver();
    e getPositionCalculator();
    void setLayoutInterceptor(d p0);
    void setPlayerViewPositionObserver(l p0);
    void setPlayerViewVisibilityObserver(l p0);
    void setPositionCalculator(e p0);
}
