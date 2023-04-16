package com.kuaishou.live.audience.component.comments.send.e$a;
import ft5.b;
import com.kuaishou.live.audience.component.comments.send.e;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import ft5.e;
import java.util.HashSet;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import erd.g;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import zx0.u$a;
import androidx.lifecycle.LiveData;
import com.kwai.feature.api.live.service.show.comments.sendcomment.LiveActivityCommentQueryUserConsumedResponse;
import ft5.d;
import com.kwai.robust.PatchProxyResult;
import ft5.a;
import t02.a0;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kwai.feature.api.live.service.show.comments.sendcomment.CustomerServiceCommentInfo;
import java.util.Objects;

public class e$a implements b	// class@000aba
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void Al(CharSequence p0,boolean p1,boolean p2,String p3,float p4,int p5){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),p3,Float.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }
       this.b.W8(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void An(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "15")) {
          return;
       }
       this.b.H.add(p0);
       return;
    }
    public void Ea(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "16")) {
          return;
       }
       this.b.H.remove(p0);
       return;
    }
    public void Eh(String p0,String p1,int p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, e$a.class, "10")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       try{
          BaseEditorFragment$g$a og$a = new BaseEditorFragment$g$a();
          og$a.l(p0);
          og$a.o = p1;
          og$a.p = p2;
          this.b.V.accept(og$a.a());
       }catch(java.lang.Exception e8){
          b.y(LiveLogTag.COMMENT.appendTag("LiveAudienceSendCommentsPresenter"), "sendComment", e8);
       }
       return;
    }
    public boolean Hk(){
       return this.b.J;
    }
    public void Ii(boolean p0){
       this.b.N = p0;
    }
    public void J0(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "7")) {
          return;
       }
       this.b.z.J0();
       return;
    }
    public LiveData Ka(){
       return this.b.I;
    }
    public boolean Kh(){
       return this.b.M;
    }
    public boolean Kl(){
       e o = this.b.O;
       boolean b = (o != null && o.mHasConsumed != null)? true: false;
       return b;
    }
    public void Le(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "13")) {
          return;
       }
       this.b.z.V2(p0);
       return;
    }
    public boolean M(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.z.M();
    }
    public void N3(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "18")) {
          return;
       }
       this.b.z.N3();
       return;
    }
    public void O5(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "19")) {
          return;
       }
       this.b.z.O5();
       return;
    }
    public boolean T6(){
       return this.b.N;
    }
    public void U2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "9")) {
          return;
       }
       this.Eh(p0, null, 0);
       return;
    }
    public void Wn(LiveActivityCommentQueryUserConsumedResponse p0){
       this.b.O = p0;
    }
    public boolean Xd(){
       return a.a(this);
    }
    public void Y3(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "8")) {
          return;
       }
       this.b.z.Y3(p0);
       return;
    }
    public void Yj(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "14")) {
          return;
       }
       this.b.z.a6(p0);
       return;
    }
    public void Zn(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       this.b.V8(p0, true, false, p1);
       return;
    }
    public void bo(boolean p0){
       this.b.r.i = p0;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void ed(String p0,boolean p1,String p2){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, e$a.class, "2")) {
          return;
       }
       this.b.V8(p0, p1, false, p2);
       return;
    }
    public void ej(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "12")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       try{
          BaseEditorFragment$g$a og$a = new BaseEditorFragment$g$a();
          og$a.l(p0);
          og$a.e(true);
          og$a.b(true);
          og$a.b = "UNKNOWN";
          this.b.V.accept(og$a.a());
       }catch(java.lang.Exception e3){
          b.y(LiveLogTag.COMMENT.appendTag("LiveAudienceSendCommentsPresenter"), "sendComment", e3);
       }
       return;
    }
    public void m6(CharSequence p0,boolean p1,boolean p2,String p3){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, e$a.class, "3")) {
          return;
       }
       this.b.V8(p0, p1, p2, p3);
       return;
    }
    public CustomerServiceCommentInfo mf(){
       return this.b.A;
    }
    public void nn(boolean p0){
       this.b.M = p0;
    }
    public void p8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "11")) {
          return;
       }
       e$a tb = this.b;
       boolean b = true;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidTwoRefs(Boolean.TRUE, p0, tb, uoe, "18") && !TextUtils.x(p0))) {
          try{
             BaseEditorFragment$g$a og$a = new BaseEditorFragment$g$a();
             og$a.i = b;
             og$a.l(p0);
             tb.V.accept(og$a.a());
          }catch(java.lang.Exception e6){
             b.y(LiveLogTag.COMMENT.appendTag("LiveAudienceSendCommentsPresenter"), "sendComment", e6);
          }
       }
    }
    public boolean v5(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.z.v5();
    }
    public void ze(int p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "17")) {
          return;
       }
       this.b.z.c(p0);
       return;
    }
}
