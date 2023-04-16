package ik0.g;
import zj0.x;
import android.os.Bundle;
import android.app.Activity;
import ik0.e;
import java.lang.Object;
import com.kuaishou.krn.model.LaunchModel;
import android.view.Window;
import ik0.a;
import com.kuaishou.krn.delegate.c;
import com.kuaishou.krn.page.c;
import ik0.j;
import kk0.a;

public interface abstract g	// class@002912
{

    void D();
    void D2(boolean p0);
    void Gg(x p0);
    void Rb(x p0);
    void Vc(Bundle p0);
    Activity getActivity();
    e getDegradeHandler();
    Object getKrnContext();
    LaunchModel getLaunchModel();
    void setAttachedWindow(Window p0);
    void setCloseHandler(a p0);
    void setDegradeHandler(e p0);
    void setKrnDelegateConfig(c p0);
    void setKrnStateController(c p0);
    void setKrnTopBarController(j p0);
    void setTopBarConfig(a p0);
}
