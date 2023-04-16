package f7c.d;
import f7c.c;
import java.lang.Object;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qvb.a;
import h7c.b;
import java.util.List;
import java.util.Objects;
import com.yxcorp.gifshow.pymk.log.h;
import java.lang.StringBuilder;
import g7c.e;
import h7c.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import g7c.a;
import org.json.JSONObject;
import g7c.i;
import java.util.ArrayList;
import java.util.Iterator;
import f7c.b;
import java.lang.Throwable;
import qvb.q;
import qvb.p;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import a7c.h;
import android.view.View;
import com.yxcorp.gifshow.pymk.f;
import ok.x;
import g7c.g;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.pymk.b;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.Number;

public class d implements c	// class@0025e0
{
    public h b;
    public f c;
    public h d;
    public static final String e = "d";

    public void d(){
       super();
    }
    public void Ad(RecoUser p0,User p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, d.class, "1")) {
          return;
       }
       this.c.remove(p0);
       d td = this.d;
       b uob = new b(p1, p0.mFeedList);
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(uob, td, h.class, "5") && !td.c(uob)) {
          e.a("PymkStatManager", "onCloseClick - position is "+uob.a.mPosition+" , recoUser is "+uob.a.getName());
          b a = uob.a;
          PymkLogSender.reportPymkRemove(a, td.b.b(a.mIsNewFriend), td.b.c(uob.a.mIsNewFriend));
          PymkLogSender.reportUserRemove(td.b.b(uob.a.mIsNewFriend), td.b.c(uob.a.mIsNewFriend), uob.a, td.h);
          a = uob.a;
          i.b(a, td.b.b(a.mIsNewFriend), td.b.a(), "close");
          td.a(uob);
       }
       return;
    }
    public void Cc(int p0,String p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, d.class, "17")) {
          return;
       }
       d td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), td, h.class, "28")) {
          PymkLogSender.reportPolicy(14, p0, p1, td.h);
       }
       return;
    }
    public void Ce(int p0,String p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, d.class, "18")) {
          return;
       }
       d td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), td, h.class, "29")) {
          PymkLogSender.reportPolicy(15, p0, p1, td.h);
       }
       return;
    }
    public void Ee(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          RecoUser recoUser = iterator.next();
          uArrayList.add(new b(recoUser.mUser, recoUser.mFeedList));
       }
       this.d.o(uArrayList);
       return;
    }
    public void Gb(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       this.d.n();
       return;
    }
    public boolean If(RecoUser p0){
       return b.a(this, p0);
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Nc(){
       if (PatchProxy.applyVoid(null, this, d.class, "16")) {
          return;
       }
       e.a(d.e, "onScrolledBottom\(\)");
       return;
    }
    public void P2(){
       if (PatchProxy.applyVoid(null, this, d.class, "15")) {
          return;
       }
       e.a(d.e, "onPymkAreaShown\(\)");
       return;
    }
    public void Qe(BaseFeed p0,RecoUser p1,User p2,int p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, d.class, "7")) {
          return;
       }
       this.d.q(p0, new b(p2, p1.mFeedList), p3);
       return;
    }
    public int W2(){
       return 0;
    }
    public void W9(RecoUser p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       this.d.h(new b(p1, p0.mFeedList));
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, d.class, "2")) {
          return;
       }
       if (p0) {
          this.d.b();
       }
       return;
    }
    public void Z3(RecoUser p0,h p1,View p2){
    }
    public void Z7(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       this.b = p0;
       f uof = p0.s();
       this.c = uof;
       uof.h(this);
       a uoa = new a(this.c.l2(), this.b.t(), null);
       uoa.d(p0.m);
       g og = p0.v();
       h s = p0.s;
       h oh = PatchProxy.applyThreeRefs(uoa, og, s, null, h.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(uoa, og, true, s);
       }
       this.d = oh;
       oh.h = p0.j();
       this.d.r(this.c.l2());
       this.d.s(this.c.m2(), this.c.j2());
       return;
    }
    public void a5(RecoUser p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       d td = this.d;
       b uob = new b(p1, p0.mFeedList);
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(uob, td, h.class, "7") && !td.c(uob)) {
          e.a("PymkStatManager", "onItemClick - userName is "+uob.a.mName);
          PymkLogSender.reportClickUser(td.b.b(uob.a.mIsNewFriend), td.b.c(uob.a.mIsNewFriend), uob.a, td.h);
          b a = uob.a;
          i.b(a, td.b.b(a.mIsNewFriend), td.b.a(), "to_profile");
          td.a(uob);
          td.f();
       }
       return;
    }
    public f b(){
       return this.c;
    }
    public final String b7(User p0){
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          return "";
       }
       if (p0 == null || p0.mIsNewFriend == null) {
          return obj.m2();
       }
       if (obj.j2() != null) {
          return this.c.j2();
       }
       return this.c.m2();
    }
    public void c(RecoUser p0,User p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, d.class, "20")) {
          return;
       }
       d tc = this.c;
       if (tc != null) {
          tc.remove(p0);
       }
       tc = this.d;
       if (tc != null) {
          b uob = new b(p1, p0.mFeedList);
          String str = PatchProxy.apply(null, null, b.class, "17");
          if (str != PatchProxyResult.class) {
          }else {
             int i = b.g();
             if (i != 2) {
                str = (i != 3)? "close": "do_not_know";
             }else {
                str = "neglect";
             }
          }
          tc.k(uob, str);
       }
       return;
    }
    public void ce(RecoUser p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "5")) {
          return;
       }
       this.d.m(p1);
       return;
    }
    public void cf(RecoUser p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       this.d.l(new b(p1, p0.mFeedList));
       return;
    }
    public void g3(BaseFeed p0,RecoUser p1,User p2,int p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, d.class, "8")) {
          return;
       }
       this.d.p(p0, new b(p2, p1.mFeedList), p3);
       return;
    }
    public void h4(User p0,boolean p1,View p2,ImageView p3,TextView p4){
    }
    public final int od(User p0){
       d obj = PatchProxy.applyOneRefs(p0, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c;
       if (obj == null) {
          return 0;
       }
       if (p0 != null && p0.mIsNewFriend != null) {
          return 76;
       }
       return obj.l2();
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "13")) {
          return;
       }
       d td = this.d;
       if (td != null) {
          td.r(this.c.l2());
          this.d.s(this.c.m2(), this.c.j2());
       }
       return;
    }
}
