package com.kuaishou.live.common.core.component.comments.display.e;
import pe1.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.display.config.LiveCommentsDisplayParams;
import pe1.m;
import java.util.List;
import com.kwai.feature.api.live.base.model.LiveCommentsFoldMessageConfig;
import pe1.o;
import ze1.a;
import pe1.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Collection;
import pe1.k;
import com.kuaishou.live.common.core.component.comments.display.CommentMessageQueueType;
import pe1.l;
import pe1.q;
import pe1.p;
import java.util.Iterator;
import java.lang.Runnable;
import java.lang.Boolean;
import pe1.r;
import pe1.j;

public class e implements b	// class@001073
{
    public b a;
    public final List b;
    public boolean c;

    public void e(){
       super();
       this.b = new ArrayList();
    }
    public void E3(){
       if (PatchProxy.applyVoid(null, this, e.class, "15")) {
          return;
       }
       e ta = this.a;
       if (ta == null) {
          this.c = false;
       }else {
          ta.E3();
       }
       return;
    }
    public void M3(LiveCommentsDisplayParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       e ta = this.a;
       if (ta == null) {
          this.b.add(new m(this, p0));
       }else {
          ta.M3(p0);
       }
       return;
    }
    public void N1(LiveCommentsFoldMessageConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       e ta = this.a;
       if (ta == null) {
          this.b.add(new o(this, p0));
       }else {
          ta.N1(p0);
       }
       return;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "16")) {
          return;
       }
       e ta = this.a;
       if (ta == null) {
          this.b.add(new n(this, p0));
       }else {
          ta.a(p0);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          ta.b();
       }
       return;
    }
    public List c(){
       e obj = PatchProxy.apply(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          return null;
       }
       return obj.c();
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          ta.clear();
       }
       this.b.clear();
       this.c = false;
       return;
    }
    public void d(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "14")) {
          return;
       }
       uoe = this.a;
       if (uoe == null) {
          this.c = true;
       }else {
          uoe.d(p0);
       }
       return;
    }
    public void e(int p0,Collection p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "11")) {
          return;
       }
       uoe = this.a;
       if (uoe == null) {
          this.b.add(new k(this, p0, p1));
       }else {
          uoe.e(p0, p1);
       }
       return;
    }
    public void f(CommentMessageQueueType p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "12")) {
          return;
       }
       e ta = this.a;
       if (ta == null) {
          this.b.add(new l(this, p0, p1));
       }else {
          ta.f(p0, p1);
       }
       return;
    }
    public void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       e ta = this.a;
       if (ta == null) {
          this.b.add(new q(this, p0));
       }else {
          ta.g(p0);
       }
       return;
    }
    public void h(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       e ta = this.a;
       if (ta == null) {
          this.b.add(new p(this, p0));
       }else {
          ta.h(p0);
       }
       return;
    }
    public void i(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.a = p0;
       if (this.c != null) {
          this.c = false;
          p0.w4();
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       this.b.clear();
       return;
    }
    public void m2(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       uoe = this.a;
       if (uoe == null) {
          this.b.add(new r(this, p0));
       }else {
          uoe.m2(p0);
       }
       return;
    }
    public void s2(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "3")) {
          return;
       }
       uoe = this.a;
       if (uoe == null) {
          this.b.add(new j(this, p0));
       }else {
          uoe.s2(p0);
       }
       return;
    }
    public void w4(){
       if (PatchProxy.applyVoid(null, this, e.class, "13")) {
          return;
       }
       e ta = this.a;
       if (ta == null) {
          this.c = true;
       }else {
          ta.w4();
       }
       return;
    }
}
