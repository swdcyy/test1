package com.kwai.live.gzone.guess.kshell.x$e;
import n57.b;
import com.kwai.live.gzone.guess.kshell.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;
import java.util.Objects;
import mrd.c;
import android.view.View;
import java.util.List;
import n57.b$a;
import java.util.ArrayList;
import com.kwai.live.gzone.guess.kshell.KShellGuessQuestionStatus;
import java.lang.Long;
import brd.y;
import java.util.Iterator;
import java.lang.Integer;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabSource;
import k67.b;

public class x$e implements b	// class@000d80
{
    public List a;
    public final x b;

    public void x$e(x p0){
       this.b = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, x$e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.W8();
    }
    public t b(){
       return this.b.Z;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, x$e.class, "2")) {
          return;
       }
       x$e tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, x.class, "14")) {
          tb.P8();
       }
       return;
    }
    public c d(){
       return this.b.i1;
    }
    public c e(){
       return this.b.U0;
    }
    public boolean f(){
       x obj = PatchProxy.apply(null, this, x$e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.a1;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public List g(){
       Object obj = PatchProxy.apply(null, this, x$e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.X0;
    }
    public void h(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$e.class, "5")) {
          return;
       }
       x$e ta = this.a;
       if (ta == null) {
          return;
       }
       ta.remove(p0);
       return;
    }
    public void i(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$e.class, "4")) {
          return;
       }
       if (this.a == null) {
          this.a = new ArrayList();
       }
       this.a.add(p0);
       x$e tb = this.b;
       if (tb.X == KShellGuessQuestionStatus.PAPER_GUESSING) {
          x w0 = tb.W0;
          if (w0 == -1) {
             p0.a((long)w0);
          }
       }
       return;
    }
    public void j(long p0){
       x$e uoe = x$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoe, "3")) {
          return;
       }
       this.b.Z.onNext(Long.valueOf((1000 * p0)));
       uoe = this.a;
       if (uoe != null) {
          Iterator iterator = uoe.iterator();
          while (iterator.hasNext()) {
             b$a uoa = iterator.next();
             if (uoa != null) {
                uoa.a(p0);
             }
          }
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, x$e.class, "1")) {
          return;
       }
       this.b.X8(0);
       return;
    }
    public void l(int p0){
       x$e uoe = x$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "8")) {
          return;
       }
       x y0 = this.b.Y0;
       if (y0 != null) {
          y0.setVisibility(p0);
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, x$e.class, "9")) {
          return;
       }
       this.b.F.jm(LiveGzoneAudienceFeatureEntranceItem.GUESS, LiveGzoneTabSource.GUESS);
       return;
    }
}
