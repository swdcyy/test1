package ie9.a;
import k4b.a;
import java.lang.Object;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ui9.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camerasdk.q;
import aj9.b;
import xi9.n;
import java.lang.Number;
import ui9.f;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicMagicAlbumListener;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.MotionEvent;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper;
import java.util.List;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicUserInfoListener;
import com.kwai.video.westeros.models.AdjustIntensityConfig;
import com.kwai.video.westeros.models.TitleDatas;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLockExposureListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickFaceImageListener;
import w46.b;
import com.kwai.video.westeros.models.UserInfo;
import com.kwai.camerasdk.videoCapture.cameras.AFAEController;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.SafeUIArea;

public abstract class a implements a	// class@002804
{
    public final String a;

    public void a(){
       super();
       this.a = "MagicControlAdapter";
    }
    public void A0(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.A0(p0);
       }
       return;
    }
    public boolean B(){
       q obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p0();
       boolean b = (obj != null)? obj.B(): false;
       return b;
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       q oq = this.p0();
       if (oq != null) {
          oq.L();
       }
       return;
    }
    public boolean C0(){
       q obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p0();
       boolean b = (obj != null)? obj.isClosed(): false;
       return b;
    }
    public boolean D0(){
       j obj = PatchProxy.apply(null, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q0();
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (!obj.t() && (obj.C() || obj.t0())) {
          b = true;
       }
       return b;
    }
    public int E0(){
       j obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.q0();
       int activityId = (obj != null)? obj.getActivityId(): 0;
       return activityId;
    }
    public String F0(){
       j obj = PatchProxy.apply(null, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q0();
       String topic = (obj != null)? obj.getTopic(): "";
       return topic;
    }
    public boolean G0(){
       j obj = PatchProxy.apply(null, this, a.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q0();
       boolean b = (obj != null && obj.O0().a != null)? true: false;
       return b;
    }
    public void H0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       q oq = this.p0();
       if (oq != null && p0 != null) {
          oq.E0(p0);
       }
       return;
    }
    public void I(FaceMagicController$FaceMagicMagicAlbumListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "47")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.I(p0);
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicControlAdapter", "setFaceMagicMagicAlbumListener listener:"+p0+" , imageHelper:"+oj, objArray);
       return;
    }
    public boolean I0(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.q0() != null)? true: false;
       return b;
    }
    public void J0(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.onTouch(p0);
       }
       return;
    }
    public boolean K0(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.q0() != null && (!p1 && !TextUtils.x(p0)))? true: false;
       return b;
    }
    public void M(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "30")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.M(p0);
       }
       return;
    }
    public boolean N(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.q0() != null && this.p0() != null)? true: false;
       return b;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "42")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.b(p0);
       }
       return;
    }
    public String c(boolean p0){
       j obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "33");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.q0();
       String str = (obj != null)? obj.c(p0): "";
       return str;
    }
    public void d(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "23")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.d(p0);
       }
       return;
    }
    public String e(){
       j obj = PatchProxy.apply(null, this, a.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q0();
       String str = (obj != null)? obj.e(): "";
       return str;
    }
    public void f(FaceMagicController$FaceMagicUserInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "44")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.f(p0);
       }
       return;
    }
    public List g(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q0();
       if (obj != null) {
          objArray = obj.g();
       }
       return objArray;
    }
    public AdjustIntensityConfig getAdjustIntensityConfig(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q0();
       if (obj != null) {
          objArray = obj.getAdjustIntensityConfig();
       }
       return objArray;
    }
    public String getLanguage(){
       j obj = PatchProxy.apply(null, this, a.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q0();
       String language = (obj != null)? obj.getLanguage(): "";
       return language;
    }
    public void h(int p0,String p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "41")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.h(p0, p1, p2);
       }
       return;
    }
    public TitleDatas i(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, a.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q0();
       if (obj != null) {
          objArray = obj.i();
       }
       return objArray;
    }
    public boolean isFrontCamera(){
       q obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p0();
       boolean b = (obj != null)? obj.isFrontCamera(): false;
       return b;
    }
    public boolean isPreviewing(){
       q obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p0();
       boolean b = (obj != null)? obj.R(): false;
       return b;
    }
    public boolean isRecording(){
       q obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p0();
       boolean b = (obj != null && obj.isRecording())? true: false;
       return b;
    }
    public void j(MagicEmoji$MagicFace p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       q oq = this.p0();
       if (oq != null) {
          oq.F0(p0, p1);
       }
       return;
    }
    public void k(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "24")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.k(p0);
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.l();
       }
       return;
    }
    public boolean l0(String p0){
       j obj = PatchProxy.applyOneRefs(p0, this, a.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q0();
       boolean b = (obj != null)? obj.l0(p0): false;
       return b;
    }
    public List m(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q0();
       if (obj != null) {
          objArray = obj.m();
       }
       return objArray;
    }
    public void n(FaceMagicController$FaceMagicLockExposureListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "46")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.n(p0);
       }
       return;
    }
    public void n0(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.n0(p0);
       }
       return;
    }
    public void p(FaceMagicController$FaceMagicPickFaceImageListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "45")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.p(p0);
       }
       return;
    }
    public abstract q p0();
    public void q(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "39")) {
          return;
       }
       j oj = this.q0();
       if (oj == null) {
          Object[] objArray = new Object[0];
          a.D().t("MagicControlAdapter", "setCustomSticker error", objArray);
          return;
       }else {
          oj.q(p0);
          return;
       }
    }
    public abstract j q0();
    public boolean r(){
       j obj = PatchProxy.apply(null, this, a.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q0();
       boolean b = (obj != null && obj.r())? true: false;
       return b;
    }
    public void s(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "35")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.s(p0);
       }
       return;
    }
    public boolean setAutoExposureLock(boolean p0){
       q obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.p0();
       p0 = (obj != null)? obj.setAutoExposureLock(p0): false;
       return p0;
    }
    public void switchCamera(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "8")) {
          return;
       }
       q oq = this.p0();
       if (oq != null) {
          oq.switchCamera(p0);
       }
       return;
    }
    public boolean t(){
       j obj = PatchProxy.apply(null, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q0();
       boolean b = (obj != null)? obj.t(): false;
       return b;
    }
    public void u(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "37")) {
          return;
       }
       j oj = this.q0();
       if (oj == null) {
          Object[] objArray = new Object[0];
          a.D().t("MagicControlAdapter", "setPickedFaceImage error", objArray);
          return;
       }else {
          oj.u(p0);
          return;
       }
    }
    public void v(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "25")) {
          return;
       }
       j oj = this.q0();
       if (oj != null) {
          oj.v(p0);
       }
       return;
    }
    public boolean w(){
       j obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q0();
       boolean b = (obj != null)? obj.w(): false;
       return b;
    }
    public EffectDescription w0(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q0();
       if (obj != null) {
          objArray = obj.w0();
       }
       return objArray;
    }
    public void x(SafeUIArea p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "36")) {
          return;
       }
       j oj = this.q0();
       if (oj != null && oj.r()) {
          oj.x(p0);
       }
       return;
    }
}
