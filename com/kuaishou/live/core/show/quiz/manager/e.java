package com.kuaishou.live.core.show.quiz.manager.e;
import com.kuaishou.live.core.show.quiz.manager.j$a;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import dg2.d;
import java.util.Iterator;
import java.lang.Integer;
import java.lang.Boolean;
import eg2.b;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2InitConfig;

public final class e implements j$a	// class@000e13
{
    public final List a;

    public void e(){
       super();
       this.a = new LinkedList();
    }
    public void a(j$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void d(int p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoe, "10")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0, p1);
       }
       return;
    }
    public void e(d p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0, p1);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       return;
    }
    public void g(d p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "8")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().g(p0, p1);
       }
       return;
    }
    public void h(LiveQuiz2Proto$SCLiveQuiz2InitConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().h(p0);
       }
       return;
    }
    public void i(j$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
}
