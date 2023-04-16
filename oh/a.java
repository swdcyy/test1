package oh.a;
import vt5.c;
import java.lang.Object;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mh.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.pendant.core.model.FloatViewStatus;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.gifshow.kuaishou.floatwidget.close.view.CloseFloatViewActivity;
import android.content.Intent;
import android.content.Context;

public class a implements c	// class@0027d0
{

    public void a(){
       super();
    }
    public boolean A00(Activity p0){
       return false;
    }
    public void CV(Object p0){
    }
    public void HO(){
    }
    public PresenterV2 Hh(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "2");
       return new a();
    }
    public void KB(Activity p0,boolean p1){
    }
    public boolean M6(String p0,PopupInterface$h p1){
       return false;
    }
    public void MB(Activity p0,boolean p1){
    }
    public void Mu(boolean p0,User p1){
    }
    public void Os(int p0,String p1){
    }
    public void P50(Activity p0){
    }
    public boolean SK(boolean p0){
       return false;
    }
    public void UJ(Activity p0){
    }
    public void VX(){
    }
    public void Wu(int p0){
    }
    public boolean d9(){
       return false;
    }
    public void db(){
    }
    public void destroy(){
    }
    public boolean eJ(Activity p0,Object p1){
       return false;
    }
    public PresenterV2 eK(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(this.Hh());
       PatchProxy.onMethodExit(a.class, "1");
       return obj;
    }
    public void fG(){
    }
    public boolean fI(Activity p0){
       return false;
    }
    public boolean fK(GifshowActivity p0,String p1){
       return false;
    }
    public void g(String p0){
    }
    public boolean isAvailable(){
       return true;
    }
    public PresenterV2 j5(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "4");
       return new PresenterV2();
    }
    public void jJ(FloatViewStatus p0){
    }
    public void jz(Activity p0){
    }
    public boolean kl(int p0){
       return false;
    }
    public void l60(int p0,int p1){
    }
    public Object ln(QPhoto p0,BaseFragment p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new Object();
    }
    public void logout(){
    }
    public void mb(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, CloseFloatViewActivity.class, "2")) {
          p0.startActivity(new Intent(p0, CloseFloatViewActivity.class));
       }
       return;
    }
    public boolean oG(Activity p0){
       return false;
    }
    public void oN(boolean p0){
    }
    public void oa(Object p0){
    }
    public void pL(){
    }
    public void q30(Activity p0){
    }
    public boolean qN(){
       return false;
    }
    public float s3(){
       return 0xbf800000;
    }
    public void setPlayerState(int p0){
    }
    public void vG(int p0){
    }
    public PresenterV2 ve(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "3");
       return new a();
    }
    public boolean wA(){
       return false;
    }
    public void x60(String p0){
    }
    public void xS(Activity p0){
    }
    public boolean z9(int p0){
       return false;
    }
    public boolean zi(String p0){
       return false;
    }
}
