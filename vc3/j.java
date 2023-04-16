package vc3.j;
import androidx.lifecycle.LiveData;
import vc3.f;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;

public interface abstract j	// class@004299
{

    ViewController a(LiveData p0,f p1);
    ViewController b(LiveData p0,f p1);
    LiveLiteQuickInteractiveAreaItemType getType();
}
