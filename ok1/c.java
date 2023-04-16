package ok1.c;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem;
import z61.b;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import z61.c;
import com.kwai.robust.PatchProxyResult;
import ok1.b;
import java.lang.Integer;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import ac.a;

public class c extends b implements LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem	// class@00351f
{
    public int b;
    public a c;
    public b d;
    public final LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem e;

    public void c(){
       super();
       this.e = new LiveAudienceGiftBottomBarEntryService$BottomBarGiftItem$BehaviorBottomBarGiftItem();
    }
    public void a(int p0){
       this.b = p0;
    }
    public void b(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.e.b(p0);
       return;
    }
    public c getViewItemInstanceFactory(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
    public void m(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "5")) {
          return;
       }
       this.e.m(p0);
       return;
    }
    public void o(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "3")) {
          return;
       }
       this.e.o(p0);
       return;
    }
    public void setEnabled(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.e.setEnabled(p0);
       return;
    }
    public void update(JsonObject p0){
    }
    public void x(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.e.x(p0);
       return;
    }
}
