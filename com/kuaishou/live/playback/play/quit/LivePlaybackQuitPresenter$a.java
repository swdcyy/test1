package com.kuaishou.live.playback.play.quit.LivePlaybackQuitPresenter$a;
import tq5.c;
import com.kuaishou.live.playback.play.quit.LivePlaybackQuitPresenter;
import java.lang.Object;
import tq5.a;
import com.kuaishou.live.playback.play.quit.LivePlaybackQuitPresenter$Order;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qw1.c$a;
import qw1.c;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import com.kwai.feature.api.live.base.service.statistics.CloseLiveReason;
import tq5.b;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class LivePlaybackQuitPresenter$a implements c	// class@000d38
{
    public final LivePlaybackQuitPresenter b;

    public void LivePlaybackQuitPresenter$a(LivePlaybackQuitPresenter p0){
       this.b = p0;
       super();
    }
    public void Ci(a p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlaybackQuitPresenter$a.class, "3")) {
       }else {
          LivePlaybackQuitPresenter$a tb = this.b;
          tb.p.add(new c$a(tb, p1, p0));
          LivePlaybackQuitPresenter$a tb1 = this.b;
          Collections.sort(tb1.p, tb1.q);
       }
       return;
    }
    public void Cn(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackQuitPresenter$a.class, "2")) {
          return;
       }
       Iterator iterator = this.b.p.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().b.onBackPressed();
          if (i == 1 || i == -1) {
             break ;
          }
       }
       return;
    }
    public CloseLiveReason Qf(){
       return b.b(this);
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public boolean onBackPressed(){
       Iterator obj = PatchProxy.apply(null, this, LivePlaybackQuitPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.p.iterator();
       while (obj.hasNext()) {
          int i = obj.next().b.onBackPressed();
          boolean b = true;
          if (i == b) {
             return b;
          }
          if (i == -1) {
             break ;
          }
       }
       return false;
    }
    public void tc(){
       b.a(this);
    }
    public void ub(CloseLiveReason p0){
       b.c(this, p0);
    }
}
