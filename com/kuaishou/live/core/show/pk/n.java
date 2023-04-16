package com.kuaishou.live.core.show.pk.n;
import com.kuaishou.live.core.show.pk.i$a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.pk.n$a;
import com.kuaishou.live.core.show.pk.i$b;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStatistic;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LivePkMessages$LivePkGiftCritMoment;

public class n implements i$a	// class@000da1
{
    public List a;

    public void n(){
       super();
       this.a = new ArrayList();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, n.class, "16")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void b(i$b p0,long p1){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, n.class, "13")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void c(i$b p0,LiveStreamMessages$SCPkStatistic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "6")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void d(i$b p0,long p1){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, n.class, "10")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void e(i$b p0,LiveStreamMessages$SCPkStatistic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "5")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0, p1);
       }
       return;
    }
    public void f(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "14")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void g(i$b p0,LiveStreamMessages$SCPkStatistic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "8")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void h(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "15")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void i(i$b p0,LiveStreamMessages$SCPkStatistic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "9")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void j(i$b p0,long p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, on, "7")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().j(p0, p1);
       }
       return;
    }
    public void k(i$b p0,boolean p1){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, n.class, "4")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
    public void l(i$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "11")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().l(p0);
       }
       return;
    }
    public void m(i$b p0,LivePkMessages$LivePkGiftCritMoment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "12")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          Objects.requireNonNull(iterator.next());
       }
       return;
    }
}
