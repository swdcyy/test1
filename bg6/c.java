package bg6.c;
import com.kwai.sdk.etools_api.IDataReport;
import k2b.e0;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.log.model.CommonParams;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public class c implements IDataReport	// class@00049d
{
    public final e0 a;

    public void c(e0 p0){
       super();
       this.a = p0;
    }
    public void postEvent(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       if (p1 != null && p1.size()) {
          p0 = p1.get("event_type");
          int i = 0x4b316083;
          if (p0.equals("click")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = p1.get("element_action");
             if (!TextUtils.isEmpty(p1.get("element_params"))) {
                uElementPack.params = p1.get("element_params");
             }
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             uClickEvent.direction = 0;
             uClickEvent.type = 1;
             uClickEvent.elementPackage = uElementPack;
             b.a(i).Y("", uClickEvent, this.a, true, null, null, null);
          }else if(p0.equals("show")){
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             showEvent.urlPackage = urlPackage;
             urlPackage.page2 = p1.get("show_page");
             b.a(i).W0("", showEvent, this.a);
          }
       }
       return;
    }
}
