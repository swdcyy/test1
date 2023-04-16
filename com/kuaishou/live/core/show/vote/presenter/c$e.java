package com.kuaishou.live.core.show.vote.presenter.c$e;
import com.kuaishou.live.core.show.vote.presenter.c$d;
import com.kuaishou.live.core.show.vote.presenter.c;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mrd.c;
import java.lang.Boolean;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import crd.b;
import lnc.b9;
import yl2.a;
import o02.e;
import cjd.e;
import erd.o;
import dm2.n;
import erd.g;
import com.kuaishou.live.core.show.vote.e;

public class c$e implements c$d	// class@001243
{
    public final c a;

    public void c$e(c p0){
       this.a = p0;
       super();
    }
    public t a(){
       Object obj = PatchProxy.apply(null, this, c$e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b9();
    }
    public boolean b(){
       c obj = PatchProxy.apply(null, this, c$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.V;
       if (obj != null && obj.K()) {
          return true;
       }
       return false;
    }
    public long c(){
       return this.a.V0;
    }
    public void d(){
       this.a.W0 = true;
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(c$e.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, c$e.class, "1")) {
          return;
       }
       this.a.a9();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c$e.class, "2")) {
          return;
       }
       this.a.a9();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c$e.class, "7")) {
          return;
       }
       c$e ta = this.a;
       c x = ta.X;
       if (x != null) {
          LiveVoterResponse mVote = x.mVote;
          if (mVote != null) {
             LiveVoteContext mVoteId = mVote.mVoteId;
          label_001c :
             if (x == null) {
                return;
             }else {
                b9.a(ta.Z);
                this.a.Z = e.p().c(x).map(new e()).subscribe(new n(this));
                return;
             }
          }
       }
       x = ta.U0;
       goto label_001c ;
    }
    public t h(){
       Object obj = PatchProxy.apply(null, this, c$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c9();
    }
    public t i(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c$e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.U;
       if (obj != null) {
          objArray = obj.m;
       }
       return objArray;
    }
}
