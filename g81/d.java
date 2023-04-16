package g81.d;
import g81.c;
import g81.a;
import com.kuaishou.live.comments.view.LiveCommentsView;
import android.view.ViewGroup;
import java.lang.Object;
import k81.a;
import k81.c;
import z8c.e;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.comments.view.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k81.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import p81.c;
import android.view.View;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import p81.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p81.b;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.comments.view.a;
import k81.j;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import k81.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import p81.e;
import et5.a;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$ScrollSpeed;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.comments.view.LiveCommentLinearLayoutManager$a;
import gt5.a;
import p81.d;
import g9c.a;
import k81.k;
import java.util.List;
import q81.e;

public class d implements c	// class@00243a
{
    public final b b;
    public final a c;
    public final LiveCommentsView d;
    public final a e;
    public final ViewGroup f;
    public final ViewGroup g;
    public c h;

    public void d(a p0,LiveCommentsView p1,ViewGroup p2,ViewGroup p3){
       super();
       this.d = p1;
       a uoa = new a(p0);
       this.e = uoa;
       c uoc = new c(uoa);
       this.b = uoc;
       p1.addItemDecoration(new e(p0.a, false));
       this.f = p2;
       this.g = p3;
       c uoc1 = new c(p2, p1, p0, uoa, uoc);
       this.c = p3;
    }
    public void Ag(int p0,boolean p1){
       c b;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uod, "32")) {
          return;
       }
       if (this.Zd() == null) {
          return;
       }
       if (this.h == null) {
          this.h = new c(this.Zd());
       }
       if (!p1) {
          this.h.a(p0);
       }else {
          d th = this.h;
          Objects.requireNonNull(th);
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), th, uoc, "1")) {
             int height = th.a.getHeight();
             if (height == p0) {
                b.Z(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "same height");
             }else {
                b = th.b;
                if (b != null && b.isRunning()) {
                   th.b.cancel();
                }
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                valueAnimato.addUpdateListener(new a(th, height, (p0 - height)));
                valueAnimato.addListener(new b(th, p0));
                valueAnimato.setDuration(300);
                valueAnimato.start();
                th.b = valueAnimato;
             }
          }
       }
       return;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, d.class, "27")) {
          return;
       }
       this.c.E();
       return;
    }
    public void Fm(){
       if (PatchProxy.applyVoid(null, this, d.class, "25")) {
          return;
       }
       this.c.Fm();
       return;
    }
    public void G(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       this.b.G(p0);
       return;
    }
    public void If(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "22")) {
          return;
       }
       this.c.If(p0);
       return;
    }
    public void K0(LayoutParamsType p0,int p1,int p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d.class, "6")) {
          return;
       }
       this.c.K0(p0, p1, p2);
       return;
    }
    public void N(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.b.N(p0);
       return;
    }
    public void Nl(){
       if (PatchProxy.applyVoid(null, this, d.class, "23")) {
          return;
       }
       this.c.Nl();
       return;
    }
    public void Pa(){
       if (PatchProxy.applyVoid(null, this, d.class, "29")) {
          return;
       }
       this.c.Pa();
       return;
    }
    public int Tl(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.Tl();
    }
    public void Wa(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "19")) {
          return;
       }
       this.c.Wa(p0);
       return;
    }
    public void Wd(){
       if (PatchProxy.applyVoid(null, this, d.class, "28")) {
          return;
       }
       this.c.Wd();
       return;
    }
    public void X1(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       this.c.X1(p0);
       return;
    }
    public boolean Zb(){
       Object obj = PatchProxy.apply(null, this, d.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.Zb();
    }
    public ViewGroup Zd(){
       return this.g;
    }
    public ViewGroup a2(){
       d tf = this.f;
       if (tf != null) {
          return tf;
       }
       return this.d;
    }
    public void c4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       this.c.c4(p0);
       return;
    }
    public void cn(LiveCommentLinearLayoutManager$ScrollSpeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "12")) {
          return;
       }
       this.c.cn(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void db(LiveCommentLinearLayoutManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "13")) {
          return;
       }
       this.c.db(p0);
       return;
    }
    public void de(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "30")) {
          return;
       }
       this.d.setCustomFadingEdgeLength(p0);
       return;
    }
    public void destroy(){
       b.b(this);
    }
    public void do(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "11")) {
          return;
       }
       this.c.do(p0);
       return;
    }
    public int f8(LayoutParamsType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.f8(p0);
    }
    public boolean ga(){
       Object obj = PatchProxy.apply(null, this, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.ga();
    }
    public void ho(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       this.c.ho(p0);
       return;
    }
    public a ia(){
       return this.e;
    }
    public void ic(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       this.c.ic(p0);
       return;
    }
    public void mc(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "18")) {
          return;
       }
       this.c.mc(p0);
       return;
    }
    public void oj(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "20")) {
          return;
       }
       this.c.oj(p0);
       return;
    }
    public void r(int p0,k p1,List p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, d.class, "3")) {
          return;
       }
       this.b.r(p0, p1, p2);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, d.class, "26")) {
          return;
       }
       this.c.release();
       this.b.release();
       return;
    }
    public void sm(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "16")) {
          return;
       }
       this.c.sm(p0);
       return;
    }
    public int t6(){
       Object obj = PatchProxy.apply(null, this, d.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a2().getId();
    }
    public RecyclerView vk(){
       return this.d;
    }
    public void w(int p0,k p1,Class p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, d.class, "2")) {
          return;
       }
       this.b.w(p0, p1, p2);
       return;
    }
    public void wf(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "17")) {
          return;
       }
       this.c.wf(p0);
       return;
    }
    public void xj(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       this.c.xj(p0);
       return;
    }
}
