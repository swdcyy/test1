package gx9.f;
import yg5.q0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import java.lang.Object;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gx9.m;
import com.kwai.component.commenttopbar.a;

public final class f implements q0	// class@0024f7
{
    public final QPhoto a;
    public final TabsPanelConfig$Style b;

    public void f(QPhoto p0,TabsPanelConfig$Style p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final PresenterV2 a(TabsPanelConfig p0){
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new m());
       presenterV2.U7(new a(this.a, this.b));
       return presenterV2;
    }
}
