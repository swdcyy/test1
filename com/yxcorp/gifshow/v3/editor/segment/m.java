package com.yxcorp.gifshow.v3.editor.segment.m;
import n3d.a;
import com.yxcorp.gifshow.v3.editor.segment.r;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import java.io.Serializable;
import ekd.j0;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import mrd.a;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$PositionType;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import voc.o;
import maa.a;
import wba.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.upload.AuditFrameSwitch;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import etc.f;
import java.util.concurrent.Callable;
import brd.t;
import etc.e;
import erd.o;
import t45.d;
import brd.z;
import etc.d;
import erd.g;
import com.yxcorp.gifshow.v3.editor.segment.p;
import com.gifshow.tuna.player.poi.e;
import crd.b;

public final class m implements a	// class@0011d7
{
    public final r b;

    public void m(r p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       m tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       if (p1 != -1) {
          Object[] objArray = new Object[i];
          a.D().s("SegmentAddPresenter", "cancel", objArray);
       }else {
          List list = j0.e(p2, "album_data_list");
          if (list != null) {
             r or = r.class;
             if (!PatchProxy.applyVoidOneRefs(list, tb, or, "11")) {
                Object[] objArray1 = new Object[i];
                a.D().s("SegmentAddPresenter", "selected media list size: "+list.size(), objArray1);
                if (!PatchProxy.applyVoidOneRefs(list, tb, or, "13")) {
                   int i1 = tb.u.i().intValue() + 1;
                   SingleSegmentInfo singleSegmen = tb.t.getSegmentInfoList().get(tb.u.i().intValue());
                   if (singleSegmen.getAsset().getPositionType() == Asset$PositionType.ENDING) {
                      i1 = tb.u.i().intValue();
                   }
                   int i2 = list.size();
                   i2 = i2 - 1;
                   while (i2 >= 0) {
                      Object[] objArray2 = new Object[i];
                      a.D().s("SegmentAddPresenter", "updateVideoTrackAssets index: "+i2, objArray2);
                      QMedia qMedia = list.get(i2);
                      if (j.j(tb.v)) {
                         if (qMedia.isVideo()) {
                            if (qMedia.mExportFilePath != null) {
                               QMedia mClipDuratio = qMedia.mClipDuration;
                               if (mClipDuratio - null > 0) {
                                  qMedia.duration = mClipDuratio;
                               }
                            }
                            qMedia.mClipDuration = Math.min(4000, qMedia.duration);
                         }else {
                            qMedia.mClipDuration = 2500;
                         }
                      }else if(qMedia.isImage()){
                         float f = j.e(tb.s.f().x().g()) * 1000.00f;
                         qMedia.mClipDuration = (long)f;
                      }
                      SingleSegmentInfo singleSegmen1 = new SingleSegmentInfo();
                      singleSegmen1.setAsset(c.e(tb.w, qMedia, i1), tb.w);
                      tb.t.addSingleSegmentInfo(i1, singleSegmen1);
                   }
                   if (singleSegmen.getAsset().getPositionType() == Asset$PositionType.ENDING) {
                      tb.u.onNext(Integer.valueOf((tb.t.getSegmentInfoListSize() - 1)));
                   }
                }
                if (tb.v.a1() != Workspace$Type.ALBUM_MOVIE || (AuditFrameSwitch.getSwitch().mAlbumMovieEnabled != null || (tb.v.a1() == Workspace$Type.AI_CUT && AuditFrameSwitch.getSwitch().mAiCutEnabled != null))) {
                   tb.V8(list);
                   GifshowActivity activity = tb.getActivity();
                   if (activity != null && !activity.isFinishing()) {
                      tb.X7(t.fromCallable(new f(tb)).flatMap(new e(j.j(tb.v))).observeOn(d.a).doOnNext(new d(tb)).subscribe(p.b, e.b));
                   }
                }else {
                   tb.V8(list);
                }
             }
          }
       }
       return;
    }
}
