package ov1.a;
import cs5.d;
import java.lang.Object;
import java.util.HashMap;
import cs5.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetPositionType;
import cs5.a;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetItemType;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import lp3.e;
import lp3.c;
import lp3.b;

public final class a implements d	// class@0035b0
{
    public final HashMap b;

    public void a(){
       super();
       this.b = new HashMap();
    }
    public void J1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "widgetItem");
       a uoa = this.b.get(p0.u());
       if (uoa != null) {
          uoa.J1(p0);
       }
       return;
    }
    public void P8(LiveMiniWidgetItemType p0,LiveMiniWidgetPositionType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       a.p(p0, "itemType");
       a.p(p1, "positionType");
       a uoa = this.b.get(p1);
       if (uoa != null) {
          uoa.N1(p0);
       }
       return;
    }
    public List Ui(String p0,LiveMiniWidgetPositionType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "widgetId");
       a.p(p1, "positionType");
       a uoa = this.b.get(p1);
       List list = (uoa != null)? uoa.K1(p0): null;
       return list;
    }
    public boolean X8(a p0,LiveMiniWidgetPositionType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "container");
       a.p(p1, "positionType");
       if (this.b.containsKey(p1)) {
          return false;
       }
       this.b.put(p1, p0);
       return true;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void i6(a p0,LiveMiniWidgetPositionType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "container");
       a.p(p1, "positionType");
       if (a.g(this.b.get(p1), p0)) {
          this.b.remove(p1);
       }
       return;
    }
    public void il(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       uoa = this.b.get(LiveMiniWidgetPositionType.RIGHT_BOTTOM_NORMAL);
       if (uoa != null) {
          uoa.M1(p0);
       }
       uoa = this.b.get(LiveMiniWidgetPositionType.RIGHT_BOTTOM_LARGE_STYLE);
       if (uoa != null) {
          uoa.M1(p0);
       }
       return;
    }
    public void pk(String p0,LiveMiniWidgetPositionType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       a.p(p0, "widgetId");
       a.p(p1, "positionType");
       a uoa = this.b.get(p1);
       if (uoa != null) {
          uoa.L1(p0);
       }
       return;
    }
}
