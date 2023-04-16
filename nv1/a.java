package nv1.a;
import ok.o;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetItemType;
import java.lang.Object;
import cs5.f;

public final class a implements o	// class@0033d7
{
    public final LiveMiniWidgetItemType b;

    public void a(LiveMiniWidgetItemType p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       a tb = this.b;
       boolean b = (p0 != null && p0.o() == tb)? true: false;
       return b;
    }
}
