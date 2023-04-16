package com.yxcorp.gifshow.camerasdk.magicface.a;
import ui9.j;
import java.lang.Object;
import xi9.n;
import xi9.m;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import java.util.Map;
import xi9.j;
import xi9.i;
import xi9.b;
import xi9.a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBoomGameListener;
import ui9.i;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextsRequestListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickingServerMediaListener;
import ui9.e;
import ui9.f;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicMagicAlbumListener;
import java.lang.String;
import xi9.r;
import xi9.q;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicExpressionListener;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import com.kwai.video.westeros.models.EffectType;
import ui9.f$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBodySlimmingListener;
import java.util.List;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPortraitListener;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$b;
import java.lang.Boolean;
import xi9.f;
import xi9.e;
import ui9.f$c;
import ui9.b;
import ui9.c;
import com.kwai.camerasdk.models.Business;
import ui9.f$b;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicUserInfoListener;
import elb.k;
import com.kwai.video.westeros.models.AdjustIntensityConfig;
import com.kwai.video.westeros.models.GuideConfig;
import com.kwai.video.westeros.models.LookupConfig;
import vi9.a;
import com.kwai.video.westeros.models.TitleDatas;
import elb.v;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextRequestWithConfigListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLockExposureListener;
import android.view.MotionEvent;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickFaceImageListener;
import com.kwai.video.westeros.models.UserInfo;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.SafeUIArea;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$EffectType;

public class a implements j	// class@001034
{

    public void a(){
       super();
    }
    public void A(int p0){
       m.Z(this, p0);
    }
    public void A0(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
    }
    public void B(Map p0){
       m.R(this, p0);
    }
    public void B0(float p0){
       i.f(this, p0);
    }
    public boolean C(){
       return m.v(this);
    }
    public void C0(boolean p0){
       a.a(this, p0);
    }
    public boolean D(){
       return m.t(this);
    }
    public void E(boolean p0){
    }
    public void E0(FaceMagicController$FaceMagicBoomGameListener p0){
       i.a(this, p0);
    }
    public void F(FaceMagicController$FaceMagicInputTextsRequestListener p0){
       m.P(this, p0);
    }
    public void G(FaceMagicController$FaceMagicPickingServerMediaListener p0){
       m.K(this, p0);
    }
    public void G0(e p0){
    }
    public void H(boolean p0){
    }
    public void H0(f p0){
       i.f(this, p0);
    }
    public void I(FaceMagicController$FaceMagicMagicAlbumListener p0){
       i.g(this, p0);
    }
    public void I0(boolean p0){
    }
    public void J(boolean p0){
       i.b(this, p0);
    }
    public void J0(boolean p0){
    }
    public void K(){
    }
    public boolean L(){
       return a.b(this);
    }
    public void L0(FaceMagicController$FaceMagicBoomGameListener p0){
       i.c(this, p0);
    }
    public void M(String p0){
    }
    public void M0(){
    }
    public boolean N(){
       return q.a(this);
    }
    public void N0(String p0,FaceMagicController$FaceMagicExpressionListener p1){
       i.h(this, p0, p1);
    }
    public void O(float p0,MagicEmoji$SeekBarType p1){
       m.E(this, p0, p1);
    }
    public f O0(){
       return i.b(this);
    }
    public void P(Map p0){
       m.b0(this, p0);
    }
    public boolean Q(){
       return false;
    }
    public void Q0(EffectType p0,boolean p1){
       i.e(this, p0, p1);
    }
    public boolean R(f$a p0){
       return a.e(this, p0);
    }
    public void R0(FaceMagicController$FaceMagicBodySlimmingListener p0){
       i.d(this, p0);
    }
    public void S(String p0){
       m.H(this, p0);
    }
    public void S0(){
       i.i(this);
    }
    public void T(boolean p0){
       m.X(this, p0);
    }
    public void T0(boolean p0,boolean p1,boolean p2,boolean p3){
    }
    public void U(List p0){
       m.G(this, p0);
    }
    public void U0(ILiveImageHelper$a p0){
    }
    public void V(){
    }
    public void V0(FaceMagicController$FaceMagicPortraitListener p0){
    }
    public void W(ILiveImageHelper$b p0){
    }
    public Boolean W0(){
       return e.a(this);
    }
    public void X(f$c p0,float p1){
       i.a(this, p0, p1);
    }
    public void X0(boolean p0){
       e.c(this, p0);
    }
    public void Y(String p0){
       a.g(this, p0);
    }
    public void Y0(b p0){
    }
    public boolean Z(){
       return m.A(this);
    }
    public void Z0(c p0){
    }
    public boolean a(){
       return i.d(this);
    }
    public void a0(){
       q.b(this);
    }
    public void b(String p0){
    }
    public void b0(String p0){
       a.f(this, p0);
    }
    public Map b1(){
       return m.k(this);
    }
    public String c(boolean p0){
       return m.d(this, p0);
    }
    public void c0(String p0,int p1){
       m.c0(this, p0, p1);
    }
    public void c1(Business p0){
    }
    public void d(List p0){
       m.W(this, p0);
    }
    public void d0(f$b p0){
       e.d(this, p0);
    }
    public String e(){
       return m.l(this);
    }
    public void e0(){
       q.e(this);
    }
    public void f(FaceMagicController$FaceMagicUserInfoListener p0){
       m.L(this, p0);
    }
    public void f0(k p0){
       m.O(this, p0);
    }
    public List g(){
       return m.m(this);
    }
    public Map g0(){
       return m.i(this);
    }
    public int getActivityId(){
       return m.a(this);
    }
    public AdjustIntensityConfig getAdjustIntensityConfig(){
       return m.b(this);
    }
    public String getAudioPath(){
       return m.c(this);
    }
    public Business getBusiness(){
       return null;
    }
    public String getFaceMagicEncodeProfile(){
       return m.f(this);
    }
    public GuideConfig getGuideConfig(){
       return m.g(this);
    }
    public String getInputText(){
       return m.h(this);
    }
    public String getLanguage(){
       return m.j(this);
    }
    public LookupConfig getLookupConfig(){
       return i.c(this);
    }
    public String getTopic(){
       return m.p(this);
    }
    public a getVideoLength(){
       return m.q(this);
    }
    public void h(int p0,String p1,String p2){
       m.M(this, p0, p1, p2);
    }
    public boolean h0(){
       return a.c(this);
    }
    public TitleDatas i(){
       return m.n(this);
    }
    public void i0(v p0){
       m.T(this, p0);
    }
    public void j(MagicEmoji$MagicFace p0,String p1){
       m.Q(this, p0, p1);
    }
    public void j0(long p0){
       m.F(this, p0);
    }
    public void k(List p0){
       m.V(this, p0);
    }
    public void k0(FaceMagicController$FaceMagicInputTextRequestWithConfigListener p0){
       m.N(this, p0);
    }
    public void l(){
    }
    public boolean l0(String p0){
       return false;
    }
    public List m(){
       return m.o(this);
    }
    public List m0(){
       return m.e(this);
    }
    public void n(FaceMagicController$FaceMagicLockExposureListener p0){
       m.I(this, p0);
    }
    public void n0(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
    }
    public void o(boolean p0){
    }
    public void o0(){
       a.h(this);
    }
    public void onTouch(MotionEvent p0){
       m.C(this, p0);
    }
    public void p(FaceMagicController$FaceMagicPickFaceImageListener p0){
       m.J(this, p0);
    }
    public boolean p0(){
       return m.s(this);
    }
    public void q(String p0){
       m.D(this, p0);
    }
    public void q0(String p0){
       a.d(this, p0);
    }
    public boolean r(){
       return m.u(this);
    }
    public void r0(f$c p0){
       i.e(this, p0);
    }
    public void release(){
    }
    public void s(UserInfo p0){
       m.Y(this, p0);
    }
    public void s0(List p0,boolean p1,boolean p2){
       q.c(this, p0, p1, p2);
    }
    public void stop(){
    }
    public boolean t(){
       return m.z(this);
    }
    public boolean t0(){
       return m.y(this);
    }
    public void u(String p0){
       m.S(this, p0);
    }
    public void u0(float p0,String p1){
       q.d(this, p0, p1);
    }
    public void v(int p0){
       m.a0(this, p0);
    }
    public boolean v0(){
       return m.B(this);
    }
    public boolean w(){
       return m.x(this);
    }
    public EffectDescription w0(){
       return null;
    }
    public void x(SafeUIArea p0){
       m.U(this, p0);
    }
    public boolean x0(){
       return e.b(this);
    }
    public boolean y(){
       return m.r(this);
    }
    public boolean y0(){
       return m.w(this);
    }
    public void z(ILiveImageHelper$EffectType p0,boolean p1){
    }
    public void z0(ILiveImageHelper$a p0){
    }
}
