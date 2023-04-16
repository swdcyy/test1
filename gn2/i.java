package gn2.i;
import z61.b;
import gn2.h;
import gn2.g;
import z61.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gn2.f;
import com.google.gson.JsonObject;

public class i extends b	// class@002b55
{
    public l a;
    public LiveWishLightGiftGuideConfig b;
    public e c;
    public a d;

    public void i(){
       super();
       this.mShowCallback = new h(this);
       this.mHiddenCallback = new g(this);
       this.mShouldReportLogWithBottomBar = false;
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this);
    }
    public void update(JsonObject p0){
    }
}
