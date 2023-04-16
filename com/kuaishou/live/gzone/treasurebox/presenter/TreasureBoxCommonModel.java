package com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel;
import im8.g;
import java.lang.String;
import java.text.SimpleDateFormat;
import ekd.n0;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import java.util.BitSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.gzone.treasurebox.LiveTreasureBoxGzoneTaskModel;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Long;
import java.util.Date;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import p53.a2;
import java.util.Map;
import java.util.HashMap;
import o53.b;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import brd.y;
import com.kwai.live.gzone.common.LiveGzoneConfigResponse;
import r53.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.gzone.treasurebox.presenter.TreasureBoxCommonModel$a;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import pm8.a;
import java.util.ArrayList;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import k67.b;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import f37.c0$b;
import f37.c0;
import k67.l;

public final class TreasureBoxCommonModel implements g	// class@001c77
{
    public String A;
    public Fragment B;
    public final Object C;
    public LiveTreasureBoxModel D;
    public boolean E;
    public a F;
    public boolean G;
    public int H;
    public final BitSet I;
    public LiveTreasureBoxGzoneTaskModel J;
    public final c b;
    public final c c;
    public final c d;
    public final c e;
    public final c f;
    public final a g;
    public final c h;
    public final c i;
    public final c j;
    public final PublishSubject k;
    public final PublishSubject l;
    public final PublishSubject m;
    public final PublishSubject n;
    public String o;
    public boolean p;
    public final a q;
    public final a r;
    public final a s;
    public final c t;
    public d u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static SimpleDateFormat K;

    static {
       TreasureBoxCommonModel.K = n0.c("yyyy-MM-dd HH:mm:ss");
    }
    public void TreasureBoxCommonModel(){
       super();
       this.b = PublishSubject.g();
       this.c = PublishSubject.g();
       this.d = PublishSubject.g();
       this.e = PublishSubject.g();
       this.f = PublishSubject.g();
       this.g = a.g();
       this.h = a.g();
       this.i = PublishSubject.g();
       this.j = PublishSubject.g();
       this.k = PublishSubject.g();
       this.l = PublishSubject.g();
       this.m = PublishSubject.g();
       this.n = PublishSubject.g();
       this.q = a.g();
       this.r = a.g();
       this.s = a.g();
       this.t = PublishSubject.g();
       this.v = false;
       this.w = true;
       this.z = false;
       this.C = new Object();
       this.E = true;
       this.G = false;
       this.I = new BitSet();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, TreasureBoxCommonModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.v == null) {
          return b;
       }
       if (this.w == null) {
          return b;
       }
       if (!this.b()) {
          return b;
       }
       if (this.y != null) {
          return b;
       }
       if (this.z != null && this.i() == null) {
          return b;
       }
       if (this.D != null || !QCurrentUser.me().isLogined()) {
          b = true;
       }
       return b;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, TreasureBoxCommonModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.v == null) {
          return b;
       }
       if (this.x == null) {
          return b;
       }
       if (this.F != null && this.m()) {
          b = true;
       }
       return b;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, TreasureBoxCommonModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.v == null) {
          return false;
       }
       if (this.w == null) {
          return false;
       }
       if (this.x == null) {
          return false;
       }
       return this.b();
    }
    public final String d(long p0){
       TreasureBoxCommonModel treasureBoxC = TreasureBoxCommonModel.class;
       if (PatchProxy.isSupport(treasureBoxC)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, treasureBoxC, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 - null < 0) {
          return "not_set";
       }else {
          try{
             return TreasureBoxCommonModel.K.format(new Date(p0));
          }catch(java.lang.Exception e0){
             return "exception_"+p0;
          }
       }
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TreasureBoxCommonModel.class, "22")) {
          return;
       }
       b.Z(LiveLogTag.GZONE, "LiveTreasureBox:"+p0);
       return;
    }
    public String f(){
       return this.A;
    }
    public LiveTreasureBoxModel g(){
       return this.D;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TreasureBoxCommonModel.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, TreasureBoxCommonModel.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(TreasureBoxCommonModel.class, new a2());
       }else {
          obj.put(TreasureBoxCommonModel.class, null);
       }
       return obj;
    }
    public int h(){
       if (this.v == null) {
          return -1;
       }
       return this.H;
    }
    public LiveTreasureBoxGzoneTaskModel i(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, TreasureBoxCommonModel.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s.i();
       if (obj != null) {
          b b = obj.b;
          if (b != null && b.canShowPendant()) {
             if (this.J == null) {
                this.J = new LiveTreasureBoxGzoneTaskModel(obj.b);
             }
             return this.J;
          }
       }
       return objArray;
    }
    public boolean j(){
       return this.v;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxCommonModel.class, "26")) {
          return;
       }
       this.c.onNext(Boolean.FALSE);
       return;
    }
    public boolean l(){
       return this.E;
    }
    public final boolean m(){
       TreasureBoxCommonModel obj = PatchProxy.apply(null, this, TreasureBoxCommonModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       boolean b = (obj != null && (obj.a() != null && this.F.a().mShowKShell != null))? true: false;
       return b;
    }
    public boolean n(){
       Object obj = PatchProxy.apply(null, this, TreasureBoxCommonModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.o) ^ 0x01);
    }
    public boolean o(){
       return this.G;
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TreasureBoxCommonModel.class, "7")) {
          return;
       }
       List list = a.h0(new TreasureBoxCommonModel$a(this).getType());
       if (list == null) {
          list = new ArrayList();
       }
       list.add(p0);
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("live_treasure_box_already_showed_bubble_id", b.e(list));
       g.a(uEditor);
       return;
    }
    public void q(boolean p0){
       this.p = p0;
    }
    public void r(boolean p0){
       this.G = p0;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxCommonModel.class, "25")) {
          return;
       }
       TreasureBoxCommonModel tF = this.F;
       if (tF != null) {
          a j = tF.j;
          if (j != null && j.S2()) {
             this.F.j.jm(LiveGzoneAudienceFeatureEntranceItem.TREASURE_BOX, LiveGzoneTabSource.TREASURE_BOX);
          }
       }
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, TreasureBoxCommonModel.class, "3")) {
          return;
       }
       TreasureBoxCommonModel tF = this.F;
       if (tF != null && tF.g != null) {
          c0$b uob = new c0$b();
          uob.b(LiveGzoneAudienceFeatureEntranceItem.TREASURE_BOX.mEntranceId);
          uob.c(this.h());
          uob.g(this.n());
          String[] stringArray = new String[]{"activity_tab_group"};
          uob.e(stringArray);
          uob.f(this.n());
          this.F.g.a(uob.a());
       }
       return;
    }
    public void u(LiveGzoneTreasureTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TreasureBoxCommonModel.class, "32")) {
          return;
       }
       LiveGzoneTreasureTask liveGzoneTre = null;
       if (p0 == null) {
          TreasureBoxCommonModel tJ = this.J;
          if (tJ != null) {
             tJ.updateTaskModel(liveGzoneTre);
          }
          this.J = liveGzoneTre;
          return;
       }else if(p0.canShowTask() && p0.mTaskStatus != 1){
          TreasureBoxCommonModel tJ1 = this.J;
          if (tJ1 == null) {
             this.J = new LiveTreasureBoxGzoneTaskModel(p0);
          }else {
             tJ1.updateTaskModel(p0);
          }
       }else {
          this.J = liveGzoneTre;
       }
       return;
    }
}
