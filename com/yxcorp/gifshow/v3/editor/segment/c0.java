package com.yxcorp.gifshow.v3.editor.segment.c0;
import tyc.w1;
import com.yxcorp.gifshow.v3.editor.segment.b0;
import tyc.m3;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import im8.f;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import mrd.a;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import w46.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace$b;
import etc.d0;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public class c0 extends w1	// class@0011ca
{
    public final b0 p;

    public void c0(b0 p0,m3 p1,int p2){
       this.p = p0;
       super(p1, p2);
    }
    public void B(RecyclerView$ViewHolder p0,int p1){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc0, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("SegmentListPresenter", "onItemMove fromPos: "+this.e+", toPos: "+this.f, objArray);
       if (this.e == this.f) {
          return;
       }
       Boolean tRUE = Boolean.TRUE;
       this.p.z.set(tRUE);
       int i1 = this.p.v.i().intValue();
       this.p.t.getSegmentInfoList().get(i1).setSelected(i);
       w1 te = this.e;
       if (te < i1) {
          if (this.f >= i1) {
             i1 = i1 - 1;
          }
       }else if(te == i1){
          i1 = this.f;
       }else if(this.f <= i1){
          i1 = i1 + 1;
       }
       this.p.I.m0(i1, tRUE);
       SingleSegmentInfo singleSegmen = this.p.t.removeSingleSegmentInfo(this.e);
       if (singleSegmen != null) {
          this.p.t.addSingleSegmentInfo(this.f, singleSegmen);
       }else {
          Object[] objArray1 = new Object[i];
          a.D().t("SegmentListPresenter", "onItemMove singleSegmentInfo removed from mVideoSegmentsModel is null", objArray1);
       }
       if (DraftUtils.i0(this.p.x) && this.p.x.v() != null) {
          this.p.x.n(i).m(true);
       }
       this.p.w.H(this.e, this.f);
       k1.r(new d0(this), 300);
       return;
    }
    public void C(RecyclerView$ViewHolder p0,int p1){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc0, "1")) {
          return;
       }
       super.C(p0, p1);
       if (this.p.F.isPlaying()) {
          this.p.F.pause();
       }
       return;
    }
}
