package com.yxcorp.gifshow.v3.editor.segment.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import etc.i;
import com.yxcorp.gifshow.v3.editor.segment.s;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import android.view.View;
import ekd.m1;
import etc.h;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import im8.f;
import raa.a;

public class t extends PresenterV2	// class@0011e1
{
    public View p;
    public PublishSubject q;
    public VideoSegmentsModel r;
    public a s;
    public i t;
    public c u;
    public a v;
    public f w;
    public a x;
    public long y;

    public void t(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       this.X7(this.r.observable().subscribe(new i(this), s.b));
       this.P8(this.r);
       return;
    }
    public final void P8(VideoSegmentsModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "4")) {
          return;
       }
       if (p0.getSegmentInfoListSize() <= 1) {
          this.p.setAlpha(0x3f000000);
       }else {
          this.p.setAlpha(0x3f800000);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1518);
       m1.a(p0, new h(this), R.id.iv_delete);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.q = this.r8("SEGMENT_DELETED_PUBLISHER");
       this.r = this.r8("segment_video_model");
       this.s = this.r8("segment_selected_model");
       this.t = this.r8("EDITOR_HELPER_CONTRACT");
       this.u = this.r8("WORKSPACE");
       this.v = this.r8("ASSET");
       this.w = this.x8("SEGMENT_IS_CHANGED");
       this.x = this.r8("AE_MAGIC_EFFECT");
       return;
    }
}
