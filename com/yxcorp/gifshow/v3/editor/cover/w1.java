package com.yxcorp.gifshow.v3.editor.cover.w1;
import erd.o;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import com.kuaishou.edit.draft.Cover$b;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import qaa.a;
import lnc.p6;
import java.lang.Boolean;
import ppc.h1;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import ppc.i1;
import com.yxcorp.gifshow.v3.editor.cover.v1;
import ppc.e1;

public final class w1 implements o	// class@000ee6
{
    public final VideoCoverEditorPresenter b;
    public final Cover$b c;

    public void w1(VideoCoverEditorPresenter p0,Cover$b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       p0 = this.b;
       w1 tc = this.c;
       Objects.requireNonNull(p0);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoCoverEditorPresenter videoCoverEd = VideoCoverEditorPresenter.class;
       t ot = PatchProxy.applyOneRefs(tc, p0, videoCoverEd, "28");
       if (ot != patchProxyRe) {
       }else if(!p6.f(p0.y) && !p0.P.booleanValue()){
          ot = t.fromCallable(new h1(p0, tc)).subscribeOn(d.c);
       }else {
          Object obj = PatchProxy.applyOneRefs(tc, p0, videoCoverEd, "13");
          if (obj != patchProxyRe) {
             ot = obj;
          }else {
             z c = d.c;
             t ot1 = t.fromCallable(new i1(p0, tc)).subscribeOn(c).flatMap(new v1(p0)).observeOn(c);
             ot = ot1.map(new e1(p0));
          }
       }
       return ot;
    }
}
