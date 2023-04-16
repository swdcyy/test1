package co4.d;
import com.google.gson.JsonElement;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import java.lang.Throwable;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;

public interface abstract d	// class@0004a2
{

    void A(JsonElement p0,JsonElement p1);
    void L7(a p0,boolean p1,boolean p2);
    void V6(PageComponentResponse p0);
    void d0(JsonElement p0,JsonElement p1,JsonElement p2,JsonElement p3,Track p4);
    void onRefresh();
    void p6(a p0,int p1,Throwable p2);
    void r2(PageComponentGlobalInfo p0);
}
