package com.yxcorp.gifshow.camerasdk.magicface.b;
import ui9.j;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import xi9.d;
import xi9.h;
import xi9.l;
import xi9.p;
import xi9.t;
import java.util.HashMap;
import android.content.Context;
import com.kwai.video.westeros.v2.faceless.FacelessPlugin;
import zi9.f;
import ui9.h;
import ui9.k;
import qi9.p1;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentHashMap;
import ui9.f;
import com.kwai.camerasdk.models.Business;
import wi9.f;
import wi9.c;
import wi9.m;
import wi9.l;
import wi9.d;
import wi9.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.westeros.v2.faceless.FaceMagicController;
import com.kwai.video.westeros.models.EffectType;
import ui9.w;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBoomGameListener;
import xi9.o;
import java.util.Set;
import java.util.Map;
import xi9.k;
import xi9.c;
import xi9.n;
import java.lang.Boolean;
import xi9.b;
import java.util.Objects;
import qi9.q1;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.westeros.models.EffectCommand$Builder;
import com.kwai.video.westeros.models.EffectCommand;
import com.kwai.video.westeros.models.EffectCommandType;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import ui9.u;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextsRequestListener;
import xi9.j;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickingServerMediaListener;
import ui9.e;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicMagicAlbumListener;
import xi9.f;
import ui9.v;
import java.lang.Integer;
import xi9.s;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicExpressionListener;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import xi9.r;
import ui9.f$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBodySlimmingListener;
import com.kwai.video.westeros.models.EffectControl$Builder;
import com.kwai.video.westeros.models.EffectControl;
import com.kwai.video.westeros.models.PoliticDetectParam$Builder;
import com.kwai.video.westeros.models.PoliticDetectParam;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import lnc.x6;
import lnc.y6;
import qi9.b;
import com.kwai.robust.PatchProxyResult;
import ok.x;
import o56.a;
import xf6.l;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.video.westeros.models.BatchEffectCommand$Builder;
import com.kwai.video.westeros.models.BatchEffectCommand;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.westeros.models.BeautifyVersion;
import java.util.List;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$a;
import com.yxcorp.gifshow.camerasdk.magicface.b$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPortraitListener;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$b;
import ui9.l;
import ui9.f$c;
import ui9.b;
import ui9.c;
import xi9.m;
import ui9.f$b;
import xi9.g;
import ui9.n;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicUserInfoListener;
import elb.k;
import java.lang.Number;
import com.kwai.video.westeros.models.AdjustIntensityConfig;
import com.kwai.video.westeros.models.GuideConfig;
import com.kwai.video.westeros.models.LookupConfig;
import vi9.a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.p;
import com.kwai.video.westeros.models.TitleDatas;
import elb.v;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextRequestWithConfigListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLockExposureListener;
import ui9.o;
import com.kwai.video.westeros.models.EffectHint;
import ui9.r;
import ui9.t;
import j8c.b;
import ui9.m;
import ui9.q;
import com.kwai.video.westeros.models.EffectError;
import ui9.s;
import android.view.MotionEvent;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickFaceImageListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicEffectDetectListener;
import com.kwai.video.westeros.models.UserInfo;
import com.kwai.video.westeros.models.SafeUIArea;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper$EffectType;
import com.yxcorp.gifshow.camerasdk.magicface.b$b;
import java.lang.Enum;
import java.lang.ClassCastException;

public class b implements j, FaceMagicController$FaceMagicListener, FaceMagicController$FaceMagicLoadEffectFailedListener, d, h, l, p, t	// class@001037
{
    public FacelessPlugin b;
    public f c;
    public b d;
    public c e;
    public e f;
    public final Set g;
    public final Map h;
    public final h i;
    public final f j;
    public final c k;
    public final m l;
    public final l m;
    public final d n;
    public final e[] o;
    public final f p;
    public p1 q;
    public Business r;
    public final k s;
    public boolean t;
    public Set u;
    public static final Map v;

    static {
       b.v = new HashMap();
    }
    public void b(Context p0,FacelessPlugin p1,f p2,h p3,k p4,p1 p5){
       super();
       this.g = new CopyOnWriteArraySet();
       this.h = new ConcurrentHashMap();
       this.p = new f();
       this.r = Business.kVideoRecord;
       this.t = false;
       this.u = new CopyOnWriteArraySet();
       this.i = p3;
       this.b = p1;
       this.c = p2;
       this.s = p4;
       this.q = p5;
       f uof = new f(p0, this);
       this.j = uof;
       c uoc = new c(p0, this);
       this.k = uoc;
       m om = new m(p0, this);
       this.l = om;
       l ol = new l(p0, this);
       this.m = ol;
       d uod = new d(p0, this);
       this.n = uod;
       e[] uoeArray = new e[]{ol,uof,uoc,om,uod};
       this.o = uoeArray;
       if (this.b != null && (!PatchProxy.applyVoid(null, this, b.class, "29") && this.e1() != null)) {
          this.S0();
          this.Q0(EffectType.kEffectTypeFaceMagic, 1);
          this.Q0(EffectType.kEffectTypeBeauty, false);
          this.Q0(EffectType.kEffectTypeDeform, false);
          this.Q0(EffectType.kEffectTypeLookup, false);
          this.Q0(EffectType.kEffectTypeMakeup, false);
          this.Q0(EffectType.kEffectTypeBodySlimming, false);
          this.e1().setFaceMagicListener(this);
          FaceMagicController.setFaceMagicLoadEffectFailedListener(this);
          this.e1().setFaceMagicBoomGameListener(new w(this));
       }
    label_00b4 :
       return;
    }
    public void A(int p0){
       o.c0(this, p0);
    }
    public void A0(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       this.g.add(p0);
       return;
    }
    public void B(Map p0){
       o.U(this, p0);
    }
    public void B0(float p0){
       k.f(this, p0);
    }
    public boolean C(){
       return o.t(this);
    }
    public void C0(boolean p0){
       c.a(this, p0);
    }
    public boolean D(){
       return o.r(this);
    }
    public n D0(){
       return this.m;
    }
    public void E(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "39")) {
          return;
       }
       c uoc = this.a1();
       Objects.requireNonNull(uoc);
       c uoc1 = c.class;
       if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoc, uoc1, "5")) {
          Object[] objArray = new Object[0];
          q1.C().w("MagicSDK_Beautify", "updateBeautifyForPkLowResolutionPreview: "+p0, objArray);
          uoc.e1(EffectCommand.newBuilder().setCommandType(EffectCommandType.kIsLivePK360p).setIsLivePk360P(p0).build());
       }
       return;
    }
    public void E0(FaceMagicController$FaceMagicBoomGameListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "36")) {
          return;
       }
       k1.o(new u(this, p0));
       return;
    }
    public void F(FaceMagicController$FaceMagicInputTextsRequestListener p0){
       o.S(this, p0);
    }
    public j F0(){
       return this.j;
    }
    public void G(FaceMagicController$FaceMagicPickingServerMediaListener p0){
       o.N(this, p0);
    }
    public void G0(e p0){
       this.f = p0;
    }
    public void H(boolean p0){
       o.f0(this, p0);
    }
    public void H0(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("MagicSDK", "setEffects ", objArray);
       b to = this.o;
       int len = to.length;
       for (; i < len; i = i + 1) {
          to[i].z(p0);
       }
       return;
    }
    public void I(FaceMagicController$FaceMagicMagicAlbumListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "42")) {
          return;
       }
       if (this.e1() != null) {
          this.e1().setFaceMagicMagicAlbumListener(p0);
       }
       return;
    }
    public void I0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("MagicSDK", "onCancelRecording "+p0, objArray);
       this.i1(EffectCommand.newBuilder().setCommandType(EffectCommandType.kRecordingReset).setAllDeletedWhenResetRecording(p0).build());
       return;
    }
    public void J(boolean p0){
       k.b(this, p0);
    }
    public void J0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "22")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("MagicSDK", "onStartRecording "+p0, objArray);
       EffectCommand$Builder uBuilder = EffectCommand.newBuilder();
       EffectCommandType kRecordingRe = (p0)? EffectCommandType.kRecordingResume: EffectCommandType.kRecordingStart;
       this.i1(uBuilder.setCommandType(kRecordingRe).build());
       return;
    }
    public void K(){
       o.D(this);
    }
    public f K0(){
       return this.n;
    }
    public boolean L(){
       return c.b(this);
    }
    public void L0(FaceMagicController$FaceMagicBoomGameListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "37")) {
          return;
       }
       k1.o(new v(this, p0));
       return;
    }
    public void M(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "25")) {
          return;
       }
       b.v.put(p0, Integer.valueOf((this.g1(p0) + 1)));
       return;
    }
    public void M0(){
       if (PatchProxy.applyVoid(null, this, b.class, "23")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("MagicSDK", "onStopRecording", objArray);
       this.i1(EffectCommand.newBuilder().setCommandType(EffectCommandType.kRecordingPause).build());
       return;
    }
    public boolean N(){
       return s.a(this);
    }
    public void N0(String p0,FaceMagicController$FaceMagicExpressionListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "46")) {
          return;
       }
       if (this.e1() != null) {
          this.e1().setFaceMagicExpressionListener(p0, p1);
       }
       return;
    }
    public void O(float p0,MagicEmoji$SeekBarType p1){
       o.G(this, p0, p1);
    }
    public f O0(){
       return this.p;
    }
    public void P(Map p0){
       o.e0(this, p0);
    }
    public r P0(){
       return this.l;
    }
    public boolean Q(){
       return o.o(this);
    }
    public void Q0(EffectType p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "9")) {
          return;
       }
       if (this.e1() == null) {
          return;
       }
       if (this.p.b(p0) != p1) {
          Object[] objArray = new Object[0];
          q1.C().w("MagicSDK", "setEffectEnable， EffectType = ["+p0+"], enabled = ["+p1+"]", objArray);
          this.e1().setEffectEnable(p0, p1);
          this.p.f.put(p0, Boolean.valueOf(p1));
       }
       return;
    }
    public boolean R(f$a p0){
       return c.e(this, p0);
    }
    public void R0(FaceMagicController$FaceMagicBodySlimmingListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "35")) {
          return;
       }
       if (this.e1() != null) {
          this.e1().setFaceMagicBodySlimmingListener(p0);
       }
       return;
    }
    public void S(String p0){
       o.K(this, p0);
    }
    public void S0(){
       boolean b;
       boolean b1;
       k a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "30")) {
          return;
       }
       if (this.e1() == null) {
          return;
       }
       b = true;
       EffectControl$Builder uBuilder = EffectControl.newBuilder().setEnableDeformEffect(b).setEnableBeautifyEffect(b).setEnableBodySlimmingEffect(b).setEnableLookupEffect(this.s.b).setEnableMakeupEffect(this.s.c).setPoliticDetectParam(PoliticDetectParam.newBuilder().setEnable(b));
       RecordPostPlugin recordPostPl = y6.r(RecordPostPlugin.class);
       if (this.s.d != null) {
          BeautifyConfig obj = PatchProxy.apply(objArray, objArray, b.class, "1");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(!b.a.get().booleanValue()){
             b1 = (a.d() && l.c("KEY_ENABLE_CAMERA_RECREATE_OPT", i))? true: false;
             if (!b1) {
                b = null;
             }
          }
          b1 = b;
          if (b1 && recordPostPl != null) {
             obj = recordPostPl.Ar();
             if (obj != null) {
                Object[] objArray1 = new Object[i];
                q1.C().w("MagicSDK", "updateEffectControl setEnableSmartBeauty : "+obj.mIsRecoConfig, objArray1);
                this.e1().sendBatchEffectCommand(BatchEffectCommand.newBuilder().addCommands(EffectCommand.newBuilder().setCommandType(EffectCommandType.kSetEnableSmartBeauty).setEnableSmartBeauty(obj.mIsRecoConfig).build()).build());
                String str = recordPostPl.jK();
                objArray1 = new Object[i];
                q1.C().w("MagicSDK", "updateEffectControl BEAUTY_YIMEI_STATUS"+str, objArray1);
                FaceMagicController.setRunningKeyandValue("BEAUTY_YIMEI_STATUS", str);
                Object[] objArray2 = new Object[i];
                q1.C().w("MagicSDK", "updateEffectControl group path"+TextUtils.k(obj.mResourcePathKey), objArray2);
                uBuilder.setBeautifyGroupPath(TextUtils.k(obj.mResourcePathKey));
             }else {
                Object[] objArray3 = new Object[i];
                q1.C().w("MagicSDK", "updateEffectControl is old beauty", objArray3);
             }
          }
       }
    label_0133 :
       a = this.s.a;
       if (a != null) {
          uBuilder.setBeautifyVersion(BeautifyVersion.forNumber(a.intValue()));
       }
       this.e1().updateEffectControl(uBuilder.build());
       return;
    }
    public void T(boolean p0){
       o.a0(this, p0);
    }
    public void T0(boolean p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, b.class, "27")) {
          return;
       }
       if (p1) {
          this.Q0(EffectType.kEffectTypeBeauty, p0);
          this.Q0(EffectType.kEffectTypeDeform, p0);
       }
       if (p2) {
          this.Q0(EffectType.kEffectTypeMakeup, p0);
       }
       if (p3) {
          this.Q0(EffectType.kEffectTypeLookup, p0);
       }
       return;
    }
    public void U(List p0){
       o.J(this, p0);
    }
    public void U0(ILiveImageHelper$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       b$a uoa = new b$a(this, p0);
       this.h.put(p0, uoa);
       this.E0(uoa);
       return;
    }
    public void V(){
       o.C(this);
    }
    public void V0(FaceMagicController$FaceMagicPortraitListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "47")) {
          return;
       }
       if (this.e1() != null) {
          this.e1().setFaceMagicPortraitListener(p0);
       }
       return;
    }
    public void W(ILiveImageHelper$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "40")) {
          return;
       }
       FaceMagicController$FaceMagicMagicAlbumListener uFaceMagicMa = (p0 == null)? null: new l(p0);
       this.I(uFaceMagicMa);
       return;
    }
    public Boolean W0(){
       Object obj = PatchProxy.apply(null, this, b.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.W0();
    }
    public void X(f$c p0,float p1){
       k.a(this, p0, p1);
    }
    public void X0(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "44")) {
          return;
       }
       this.n.X0(p0);
       return;
    }
    public void Y(String p0){
       c.g(this, p0);
    }
    public void Y0(b p0){
       this.d = p0;
    }
    public boolean Z(){
       return o.y(this);
    }
    public void Z0(c p0){
       this.e = p0;
    }
    public boolean a(){
       return k.d(this);
    }
    public void a0(){
       s.b(this);
    }
    public b a1(){
       return this.k;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "38")) {
          return;
       }
       this.D0().b(p0);
       return;
    }
    public void b0(String p0){
       c.f(this, p0);
    }
    public Map b1(){
       return m.k(this);
    }
    public String c(boolean p0){
       return o.d(this, p0);
    }
    public void c0(String p0,int p1){
       o.g0(this, p0, p1);
    }
    public void c1(Business p0){
       this.r = p0;
    }
    public void d(List p0){
       o.Z(this, p0);
    }
    public void d0(f$b p0){
       g.b(this, p0);
    }
    public void d1(){
       if (PatchProxy.applyVoid(null, this, b.class, "28")) {
          return;
       }
       if (this.q != null && this.O0().c()) {
          k1.o(new n(this));
       }
       return;
    }
    public String e(){
       return o.i(this);
    }
    public void e0(){
       s.e(this);
    }
    public FaceMagicController e1(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t == null) {
          obj = this.b;
          if (obj != null) {
             objArray = obj.getFaceMagicController();
          }
       }
       return objArray;
    }
    public void f(FaceMagicController$FaceMagicUserInfoListener p0){
       o.O(this, p0);
    }
    public void f0(k p0){
       o.R(this, p0);
    }
    public h f1(){
       return this.i;
    }
    public List g(){
       return o.j(this);
    }
    public Map g0(){
       return m.i(this);
    }
    public final int g1(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, b.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = b.v;
       int i = (obj.containsKey(p0))? obj.get(p0).intValue(): 0;
       return i;
    }
    public int getActivityId(){
       return o.a(this);
    }
    public AdjustIntensityConfig getAdjustIntensityConfig(){
       return o.b(this);
    }
    public String getAudioPath(){
       return o.c(this);
    }
    public Business getBusiness(){
       return this.r;
    }
    public String getFaceMagicEncodeProfile(){
       return o.f(this);
    }
    public GuideConfig getGuideConfig(){
       return o.g(this);
    }
    public String getInputText(){
       return m.h(this);
    }
    public String getLanguage(){
       return o.h(this);
    }
    public LookupConfig getLookupConfig(){
       return k.c(this);
    }
    public String getTopic(){
       return o.m(this);
    }
    public a getVideoLength(){
       return o.n(this);
    }
    public void h(int p0,String p1,String p2){
       o.P(this, p0, p1, p2);
    }
    public boolean h0(){
       return c.c(this);
    }
    public void h1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, b.class, "16")) {
          return;
       }
       q1 oq1 = q1.C();
       StringBuilder str = "onEffectDescriptionUpdated, EffectDescription : \n";
       String str1 = (p0 != null)? p0.toString(): "null";
       int i = 0;
       Object[] objArray = new Object[i];
       oq1.w("MagicSDK", str+str1, objArray);
       b td = this.d;
       if (!this.i.isClosed() && td != null) {
          Object[] objArray1 = new Object[i];
          q1.C().w("MagicSDK", "dispatch onBeforeEffectDescriptionUpdated... isCancel = "+p3, objArray1);
          td.S1(p0, p1, p2, p3);
       }
       p op = new p(this, p0, p1, p2, p3);
       k1.o(td);
       return;
    }
    public TitleDatas i(){
       return o.k(this);
    }
    public void i0(v p0){
       o.W(this, p0);
    }
    public final void i1(EffectCommand p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "34")) {
          return;
       }
       if (this.e1() != null) {
          this.e1().sendEffectCommand(p0);
       }
       return;
    }
    public void j(MagicEmoji$MagicFace p0,String p1){
       o.T(this, p0, p1);
    }
    public void j0(long p0){
       o.H(this, p0);
    }
    public void k(List p0){
       o.Y(this, p0);
    }
    public void k0(FaceMagicController$FaceMagicInputTextRequestWithConfigListener p0){
       o.Q(this, p0);
    }
    public void l(){
       o.B(this);
    }
    public boolean l0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = this.g1(p0);
       int i1 = 0;
       Object[] objArray = new Object[i1];
       q1.C().w("MagicSDK", "isMaxRetryTimes...path:"+p0+" , times:"+i, objArray);
       if (i >= 1) {
          i1 = true;
       }
       return i1;
    }
    public List m(){
       return o.l(this);
    }
    public List m0(){
       return o.e(this);
    }
    public void n(FaceMagicController$FaceMagicLockExposureListener p0){
       o.L(this, p0);
    }
    public void n0(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       this.g.remove(p0);
       return;
    }
    public void o(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "41")) {
          return;
       }
       this.D0().o(p0);
       return;
    }
    public void o0(){
       c.h(this);
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "13")) {
          return;
       }
       q1 oq1 = q1.C();
       StringBuilder str = "onEffectDescriptionUpdated, old : \n";
       String str1 = (p0 != null)? p0.toString(): "null";
       Object[] objArray = new Object[0];
       oq1.w("MagicSDK", str+str1, objArray);
       return;
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "14")) {
          return;
       }
       this.h1(p0, p1, p2, false);
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("MagicSDK", "onEffectDescriptionUpdatedOnCancel, EffectDescription:"+p0+" slot:"+p1+" resource:"+p2, objArray);
       this.h1(null, p1, p2, true);
       return;
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "17")) {
          return;
       }
       q1 oq1 = q1.C();
       StringBuilder str = "onEffectDescriptionUpdated, EffectDescription : \n";
       String str1 = (p0 != null)? p0.toString(): "null";
       Object[] objArray = new Object[0];
       oq1.w("MagicSDK", str+str1, objArray);
       k1.o(new o(this, p0, p1, p2));
       return;
    }
    public void onEffectHintUpdated(EffectHint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "18")) {
          return;
       }
       q1 oq1 = q1.C();
       StringBuilder str = "onEffectHintUpdated, EffectHint : \n";
       String str1 = (p0 != null)? p0.toString(): "null";
       Object[] objArray = new Object[0];
       oq1.w("MagicSDK", str+str1, objArray);
       if (this.e != null) {
          k1.o(new r(this, p0));
       }
       return;
    }
    public void onEffectPlayCompleted(EffectSlot p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("MagicSDK", "onEffectPlayCompleted, effectSlot: "+p0+", playCount: "+p1, objArray);
       if (this.f != null) {
          k1.o(new t(this, p0, p1));
       }
       return;
    }
    public void onLoadFileError(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().t("MagicSDK", "onLoadFileError:"+p0, objArray);
       b.b("MagicSDK", "MagicSDK onLoadFileError:"+p0);
       k1.o(new m(this, p0, p1));
       return;
    }
    public void onLoadGroupEffect(EffectDescription p0,EffectSlot p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("MagicSDK", "onLoadGroupEffect, effectDescription: "+p0+", effectSlot: "+p1+", groupName: "+p2, objArray);
       if (this.f != null) {
          k1.o(new q(this, p0, p1, p2));
       }
       return;
    }
    public void onSetEffectFailed(EffectResource p0,EffectSlot p1,EffectError p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().t("MagicSDK", "onSetEffectFailed, resource: "+p0+", slot: "+p1+", error: "+p2, objArray);
       if (this.f != null) {
          k1.o(new s(this, p0, p1, p2));
       }
       return;
    }
    public void onTouch(MotionEvent p0){
       o.A(this, p0);
    }
    public void p(FaceMagicController$FaceMagicPickFaceImageListener p0){
       o.M(this, p0);
    }
    public boolean p0(){
       return o.q(this);
    }
    public void q(String p0){
       o.F(this, p0);
    }
    public void q0(String p0){
       c.d(this, p0);
    }
    public boolean r(){
       return o.s(this);
    }
    public void r0(f$c p0){
       k.e(this, p0);
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("MagicSDK", "release", objArray);
       FaceMagicController.setFaceMagicLoadEffectFailedListener(null);
       if (this.e1() != null) {
          this.e1().setFaceMagicListener(null);
          this.e1().setFaceMagicEffectDetectListener(null);
       }
       this.d = null;
       this.e = null;
       this.f = null;
       this.b = null;
       return;
    }
    public void s(UserInfo p0){
       o.b0(this, p0);
    }
    public void s0(List p0,boolean p1,boolean p2){
       s.c(this, p0, p1, p2);
    }
    public void stop(){
       this.t = true;
    }
    public boolean t(){
       return o.x(this);
    }
    public boolean t0(){
       return o.w(this);
    }
    public void u(String p0){
       o.V(this, p0);
    }
    public void u0(float p0,String p1){
       s.d(this, p0, p1);
    }
    public void v(int p0){
       o.d0(this, p0);
    }
    public boolean v0(){
       return o.z(this);
    }
    public boolean w(){
       return o.v(this);
    }
    public EffectDescription w0(){
       Object obj = PatchProxy.apply(null, this, b.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.w0();
    }
    public void x(SafeUIArea p0){
       o.X(this, p0);
    }
    public boolean x0(){
       return g.a(this);
    }
    public boolean y(){
       return o.p(this);
    }
    public boolean y0(){
       return o.u(this);
    }
    public void z(ILiveImageHelper$EffectType p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "10")) {
          return;
       }
       int i = b$b.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2) {
             this.Q0(EffectType.kEffectTypeFaceMagic, p1);
          }else {
             throw new ClassCastException("EffectType需要转换成sdk类型");
          }
       }else {
          this.Q0(EffectType.kEffectTypeBeauty, p1);
       }
       return;
    }
    public void z0(ILiveImageHelper$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       FaceMagicController$FaceMagicBoomGameListener uFaceMagicBo = this.h.remove(p0);
       if (uFaceMagicBo != null) {
          this.L0(uFaceMagicBo);
       }
       return;
    }
}
