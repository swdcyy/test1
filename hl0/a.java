package hl0.a;
import nl9.q;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashMap;
import com.kuaishou.lite.presenter.LiveLiteAdLogPresenter;
import com.kuaishou.lite.presenter.LiveLiteCustomAdLogPresenter;
import com.kuaishou.lite.presenter.LiveLiteCommercialPresenter;

public class a implements q	// class@0026ff
{

    public void a(){
       super();
    }
    public Map a0(){
       LinkedHashMap obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       obj.put("AdLogPresenter", new LiveLiteAdLogPresenter());
       obj.put("CustomAdLogPresenter", new LiveLiteCustomAdLogPresenter());
       obj.put("CommercialPresenter", new LiveLiteCommercialPresenter());
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
}
