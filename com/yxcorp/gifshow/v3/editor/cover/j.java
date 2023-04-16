package com.yxcorp.gifshow.v3.editor.cover.j;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import com.yxcorp.gifshow.v3.editor.cover.j$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import wwc.n0;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.f;
import java.util.concurrent.atomic.AtomicReference;
import com.kwai.flash.Flash$Type;
import com.yxcorp.gifshow.v3.editor.cover.i;
import io.reactivex.g;
import brd.t;
import ppc.h;
import ppc.i;
import erd.g;
import maa.a;
import com.yxcorp.gifshow.v3.previewer.ktv.p;

public class j extends GraphTask	// class@000e76
{

    public void j(j$a p0){
       super(p0);
    }
    public String[] e(){
       String[] obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("CoverGenerateNSTask", "dependOn isPicturesType:"+this.r(), objArray);
       if (this.r()) {
          obj = new String[]{"PhotosCropWorkCountDownNSTask"};
          return obj;
       }else if(this.b.c.a1() == Workspace$Type.KTV_SONG){
          obj = new String[]{"KtvSongDefaultCoverGenerateNSTask"};
          return obj;
       }else {
          return super.e();
       }
    }
    public Object key(){
       return "CoverGenerateNSTask";
    }
    public synchronized void m(){
       boolean b1;
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       super.m();
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("CoverGenerateNSTask", "realRun isPicturesType:"+this.r(), objArray);
       GraphTask tb = this.b;
       boolean b = true;
       if (tb.d != null && (tb.e == null || tb.f == null)) {
          this.s(b);
          return;
       }else if(this.r()){
          b1 = DraftUtils.b0(this.b.c);
          if (b1) {
             this.u(b, i);
          }else {
             this.b.f.e();
             this.s(b);
          }
          objArray1 = new Object[i];
          a.D().w("CoverGenerateNSTask", "realRun photos cover maybe generate pictureTypeNeedGenerateCover:"+b1, objArray1);
       }else {
          b1 = this.v();
          if (b1) {
             this.u(b, i);
          }else {
             this.s(b);
          }
          objArray1 = new Object[i];
          a.D().w("CoverGenerateNSTask", "realRun video cover maybe generate videoTypeNeedGenerateCover:"+b1, objArray1);
       }
       return;
    }
    public final boolean r(){
       Object obj = PatchProxy.apply(null, this, j.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.E(this.b.c.a1());
    }
    public final void s(boolean p0){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, j.class, "6")) {
          return;
       }
       this.c.set(Boolean.valueOf(p0));
       return;
    }
    public Flash$Type type(){
       return Flash$Type.BACKGROUND;
    }
    public final void u(boolean p0,boolean p1){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, j.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CoverGenerateNSTask", "updateCover blocking", objArray);
       t.create(new i(this, p0, p1)).blockingSubscribe(new h(this), new i(this));
       if (this.r()) {
          this.b.f.e();
       }
       Object[] objArray1 = new Object[0];
       a.D().w("CoverGenerateNSTask", "updateCover block finished", objArray1);
       return;
    }
    public final boolean v(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (DraftUtils.b0(this.b.c)) {
          obj = PatchProxy.apply(null, this, j.class, "3");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(!f.z(this.b.c)){
             b1 = false;
          }else {
             b1 = p.h(this.b.c.o0());
          }
          if (!b1) {
             b = true;
          }
       }
       return b;
    }
}
