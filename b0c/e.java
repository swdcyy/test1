package b0c.e;
import vx4.l;
import java.lang.Object;
import java.util.HashMap;
import android.view.View;
import com.tkruntime.v8.JsValueRef;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.postentrance.bubblev2.widget.BubbleTitlesLayout;
import java.util.Map;
import tx4.y;
import java.lang.Integer;
import lnc.a1;
import java.lang.CharSequence;
import android.text.TextUtils;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import b0c.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import b0c.c;
import b0c.b;
import erd.g;
import com.yxcorp.gifshow.postentrance.bubblev2.util.OperateBubbleTitlePlaceHolderUtil;
import java.lang.Boolean;
import java.lang.Float;
import android.content.Context;
import android.graphics.Color;

public class e implements l	// class@000382
{
    public final Map b;
    public final Map c;

    public void e(){
       super();
       this.b = new HashMap();
       this.c = new HashMap();
    }
    public void Db(View p0,JsValueRef p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       y.c(this.b.remove(p0));
       if (p1 == null) {
          return;
       }
       this.b.put(p0, p1);
       return;
    }
    public void Fc(View p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "16")) {
          return;
       }
       p0.setTitlesIntervalSpace(a1.e((float)p1));
       return;
    }
    public void Ik(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "9")) {
          return;
       }
       p0.setSubTitle(p1);
       return;
    }
    public void JP(View p0,String p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "3")) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       b9.a(this.c.get(p0));
       JsValueRef jsValueRef = this.b.get(p0);
       t ot = PatchProxy.applyOneRefs(p1, this, uoe, "4");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new a(this, p1));
       }
       this.c.put(p0, ot.subscribeOn(d.c).observeOn(d.a).subscribe(new c(jsValueRef, p0), new b(jsValueRef)));
       return;
    }
    public void MS(View p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "5")) {
          return;
       }
       p0.setImageTitleMaxHeight(a1.e((float)p1));
       return;
    }
    public void NS(View p0,String p1,String p2,String p3,int p4){
       if (PatchProxy.isSupport(e.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, e.class, "8")) {
             return;
          }
       }
       p0.O(OperateBubbleTitlePlaceHolderUtil.b.b(p1), null);
       return;
    }
    public void Ou(View p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "13")) {
          return;
       }
       p0.setTitlesMaxWidth(a1.e((float)p1));
       return;
    }
    public void S0(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "6")) {
          return;
       }
       p0.O(p1, null);
       return;
    }
    public void Vu(View p0,float p1,float p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, e.class, "15")) {
          return;
       }
       p0.P((float)a1.e(p1), (float)a1.e(p2));
       return;
    }
    public void W6(View p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "17")) {
          return;
       }
       p0.setTitleStyle(p1);
       return;
    }
    public View b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BubbleTitlesLayout(p0);
    }
    public void eF(View p0,float p1,float p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, e.class, "14")) {
          return;
       }
       p0.M((float)a1.e(p1), (float)a1.e(p2));
       return;
    }
    public void eY(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "10")) {
          return;
       }
       Integer integer = this.n(p1);
       if (integer == null) {
          return;
       }
       p0.setTitleColor(integer.intValue());
       return;
    }
    public void i(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "18")) {
          return;
       }
       y.c(this.b.remove(p0));
       b9.a(this.c.remove(p0));
       return;
    }
    public void i6(View p0){
    }
    public boolean isAvailable(){
       return true;
    }
    public final Integer n(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Integer.valueOf(Color.parseColor(p0));
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public void nu(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "12")) {
          return;
       }
       Integer integer = this.n(p1);
       if (integer == null) {
          return;
       }
       p0.setSubTitleColor(integer.intValue());
       return;
    }
    public void zx(View p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "7")) {
          return;
       }
       p0.setTitleMaxLines(p1);
       return;
    }
}
