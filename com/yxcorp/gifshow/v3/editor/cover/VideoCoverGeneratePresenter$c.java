package com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter$c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.feature.post.api.core.model.EditCoverConfiguration;
import wba.m;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Cover;
import ppc.g2;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.cover.b2;
import com.yxcorp.gifshow.v3.editor.cover.c2;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Runnable;
import ekd.k1;

public class VideoCoverGeneratePresenter$c extends VideoSDKPlayerView$e	// class@000e38
{
    public final VideoCoverGeneratePresenter a;

    public void VideoCoverGeneratePresenter$c(VideoCoverGeneratePresenter p0){
       this.a = p0;
       super();
    }
    public void onFrameRender(PreviewPlayer p0,double p1,long[] p2){
       double d;
       Object[] objArray1;
       VideoCoverGeneratePresenter videoCoverGe = VideoCoverGeneratePresenter.class;
       if (PatchProxy.isSupport(VideoCoverGeneratePresenter$c.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), p2, this, VideoCoverGeneratePresenter$c.class, "1")) {
          return;
       }
       VideoCoverGeneratePresenter$c ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       VideoCoverGeneratePresenter obj = PatchProxy.apply(objArray, ta, videoCoverGe, "8");
       if (obj != PatchProxyResult.class) {
          d = obj.doubleValue();
       }else {
          Object[] objArray4 = new Object[0];
          a.D().w("VideoCoverGeneratePresenter", "getCoverPosition mCoverPosition:"+ta.D+",mCoverConfiguration:"+ta.z, objArray4);
          obj = ta.D;
          if (obj < 0) {
             obj = ta.z;
             if (obj != null) {
                ta.D = m.d(obj, ta.s.o0());
                objArray4 = new Object[0];
                a.D().w("VideoCoverGeneratePresenter", "getCoverPosition mCoverConfiguration mCoverPosition:"+ta.D, objArray4);
                obj = ta.D;
                if (obj >= 0) {
                   objArray4 = new Object[0];
                   a.D().w("VideoCoverGeneratePresenter", "Set last frame at "+ta.D+" as cover.", objArray4);
                   ta.z = objArray;
                   boolean b = ta.t.D();
                   if (!b) {
                      ta.t.c0();
                   }
                   Cover$b uob = ta.t.k();
                   uob.h(Cover$Type.VIDEO);
                   VideoCoverParam$b uob1 = VideoCoverParam.newBuilder();
                   uob1.a(ta.D);
                   uob.i(uob1);
                   if (!b) {
                      ta.t.g(0);
                   }
                }
             }else if(ta.t.v() != null && ta.t.v().getVideoCoverParam().getTimePointsCount() > 0){
                ta.D = ta.t.v().getVideoCoverParam().getTimePoints(0);
                Object[] objArray5 = new Object[0];
                a.D().w("VideoCoverGeneratePresenter", "getCoverPosition getVideoCoverParam mCoverPosition:"+ta.D, objArray5);
             }else {
                ta.D = 0;
                Object[] objArray6 = new Object[0];
                a.D().w("VideoCoverGeneratePresenter", "getCoverPosition mCoverPosition:0", objArray6);
             }
             d = ta.D;
          }
          d = obj;
       }
       if (d < 0) {
          objArray1 = new Object[0];
          a.D().w("VideoCoverGeneratePresenter", "onFrameRender coverPosition:"+d, objArray1);
          return;
       }else if(this.a.y != null && (p1 >= 0 && (p1 - (d - 0x3fb1111120000000) >= 0 && p1 - (0x3fa1111120000000 + d) <= 0))){
          objArray1 = new Object[0];
          a.D().w("VideoCoverGeneratePresenter", "onFrameRender dump", objArray1);
          VideoCoverGeneratePresenter$c ta1 = this.a;
          Objects.requireNonNull(ta1);
          if (!PatchProxy.isSupport(videoCoverGe) || !PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(d), ta1, videoCoverGe, "9")) {
             Object[] objArray3 = new Object[0];
             a.D().w("VideoCoverGeneratePresenter", "dumpOriginalFrame at "+d, objArray3);
             ta1.X7(t.create(new g2(p0, d)).subscribeOn(d.c).observeOn(d.a).subscribe(new b2(ta1, d), c2.b));
          }
          this.a.S8();
       }
    label_01e7 :
       if (this.a.B != null) {
          Object[] objArray2 = new Object[0];
          a.D().w("VideoCoverGeneratePresenter", "onFrameRender mGenerateCoverAction not null", objArray2);
          k1.o(this.a.B);
       }
       return;
    }
}
