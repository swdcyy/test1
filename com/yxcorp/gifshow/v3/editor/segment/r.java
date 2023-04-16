package com.yxcorp.gifshow.v3.editor.segment.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.segment.r$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import etc.g0;
import android.view.ViewGroup;
import faa.a;
import q87.c;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import etc.b;
import com.yxcorp.gifshow.v3.editor.segment.n;
import erd.g;
import crd.b;
import etc.c;
import com.yxcorp.gifshow.v3.editor.segment.o;
import crd.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.segment.model.VideoSegmentsModel;
import lnc.a1;
import android.content.Context;
import ftc.h;
import java.lang.CharSequence;
import e17.i;
import ooc.g1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import h69.j;
import com.kuaishou.edit.draft.Workspace$Source;
import tkd.b;
import tkd.d;
import l26.e;
import android.app.Activity;
import android.content.Intent;
import l26.f;
import android.os.Bundle;
import om6.j;
import om6.k;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import com.kuaishou.edit.draft.Asset;
import java.lang.StringBuilder;
import java.io.File;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o79.a;
import java.lang.Math;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.v3.editor.segment.m;
import n3d.a;
import java.lang.Boolean;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Workspace$b;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import im8.f;
import com.yxcorp.gifshow.v3.editor.aicut.AICutProjectManager;
import android.view.View;
import ekd.m1;
import etc.a;
import android.view.View$OnClickListener;
import mrd.a;
import maa.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.segment.SegmentEditorFragment;

public class r extends PresenterV2	// class@0011df
{
    public AttrAnimProgressFragment A;
    public a B;
    public m C;
    public ViewGroup p;
    public ImageView q;
    public TextView r;
    public i s;
    public VideoSegmentsModel t;
    public a u;
    public c v;
    public a w;
    public PublishSubject x;
    public SegmentEditorFragment y;
    public f z;

    public void r(){
       super();
       this.C = new r$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       int i = 0;
       if (!g0.a(this.s.f().N())) {
          this.p.setVisibility(8);
          Object[] objArray = new Object[i];
          a.D().w("SegmentAddPresenter", "annual album movie || AI_CUT", objArray);
          return;
       }else {
          this.p.setVisibility(i);
          this.X7(b9.d(this.t, this.y).subscribe(new b(this), n.b));
          this.X7(this.x.subscribe(new c(this), o.b));
          this.R8();
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       r tB = this.B;
       if (tB != null && !tB.isDisposed()) {
          this.B.dispose();
       }
       return;
    }
    public void P8(){
       String str;
       int b;
       Intent intent;
       String albumId;
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "10")) {
          return;
       }
       int i = 0x7f100c66;
       int i1 = 31;
       int i2 = 0;
       int i3 = 1;
       if (this.p.isSelected()) {
          str = PatchProxy.apply(objArray, this, or, "7");
          if (str != PatchProxyResult.class) {
          }else if(this.t.getSegmentInfoListSize() == i1){
             str = a1.p(i);
          }else {
             Object[] objArray1 = new Object[i3];
             objArray1[i2] = String.valueOf(((long)h.m / 0xea60));
             str = a1.c().getString(R.string.arg_RES_7f101063, objArray1);
          }
          i.d(R.style.arg_RES_7f11066a, str);
          return;
       }else if(PatchProxy.applyVoid(objArray, objArray, g1.class, "24")){
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 404;
          uElementPack.name = "add_photo_segment";
          uElementPack.type = i3;
          u1.u(i3, uElementPack, new ClientContent$ContentPackage());
       }
       int i4 = 2;
       int i5 = 0x7f1045fa;
       String str1 = "album_next_des_str";
       String str2 = "album_next_text_with_number";
       String str3 = "album_show_selected_count";
       String str4 = "album_des_str";
       if (j.j(this.v)) {
          b = (this.v.T0() == Workspace$Source.ANNUAL_ALBUM_2022)? true: false;
          intent = d.a(-1077260241).Xt(this.getActivity(), i4, b);
          String str5 = (b)? a1.p(R.string.arg_RES_7f1018e5): a1.p(R.string.arg_RES_7f103da9);
          intent.putExtra("ALBUM_SHOW_NO_SELECT_MEDIA_STR", str5);
          intent.putExtra(str4, a1.p(R.string.arg_RES_7f100b22));
          intent.putExtra(str3, i3);
          intent.putExtra(str2, i2);
          intent.putExtra(str1, a1.p(i5));
          intent.putExtra("album_next_step_with_total", i2);
          str = (b)? a1.p(R.string.arg_RES_7f1018e1): a1.p(R.string.arg_RES_7f10018a);
          intent.putExtra("album_next_empty_toast_str", str);
          str = "album_extra_param";
          Bundle bundleExtra = intent.getBundleExtra(str);
          if (bundleExtra == null) {
             bundleExtra = new Bundle();
          }
          bundleExtra.putBoolean("KEY_SHOULD_EXPORT", i3);
          intent.putExtra(str, bundleExtra);
       }else {
          intent = d.a(0x2538349d).nt(this.getActivity());
          intent.putExtra(str4, a1.p(R.string.arg_RES_7f10462a));
          intent.putExtra(str3, i3);
          intent.putExtra(str2, i2);
          intent.putExtra(str1, a1.p(i5));
          b = 0;
          while (true) {
             if (b < this.t.getSegmentInfoListSize()) {
                albumId = this.t.getSegmentInfoList().get(b).getAsset().getAlbumId();
                if (!albumId.contains("cache")) {
                   Object[] objArray2 = new Object[i2];
                   a.D().w("SegmentAddPresenter", "albumPath: "+albumId, objArray2);
                   if (new File(albumId).exists()) {
                   label_0184 :
                      intent.putExtra("album_scroll_to_path", albumId);
                   }
                }
                b = b + 1;
             }else {
                albumId = "";
                goto label_0184 ;
             }
          }
       }
       intent.putExtra("ALBUM_SHOW_PICTURE_DURATION", (PostExperimentUtils.e() ^ i3));
       intent.putExtra("ALBUM_BIZ_CODE", "post_edit_cut_reorder");
       intent.putExtra("album_tab_list", a.a);
       intent.putExtra("default_select_tab", i4);
       intent.putExtra("photo_task_id", this.v.V0());
       intent.putExtra("max_count", (i1 - this.t.getSegmentInfoListSize()));
       intent.putExtra("album_select_as_result", i3);
       intent.putExtra("album_selected_data_scroll_to_center", i3);
       intent.putExtra("album_max_duration_sdk_way", i3);
       intent.putExtra("album_max_duration", Math.round(((double)h.m - (this.t.getVideoDuration() * 0x408f400000000000))));
       intent.putExtra("album_reach_max_duration_str", g0.c((long)h.m));
       intent.putExtra("album_reach_max_count_str", a1.p(i));
       intent.putExtra("ALBUM_MIN_DURATION_PER_VIDEO", 1000);
       intent.putExtra("ALBUM_MASK_UNABLE_ITEM", i3);
       intent.putExtra("ALBUM_NOT_REACH_MIN_DURATION_PER_VIDEO_STR", a1.p(R.string.arg_RES_7f101bc1));
       if (this.getActivity() != null) {
          VideoSDKPlayerView videoSDKPlay = f.n(this.s.f());
          if (videoSDKPlay != null) {
             videoSDKPlay.pause();
          }
          this.getActivity().t1(intent, 1001, new m(this));
          this.getActivity().overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f010115);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, r.class, "6")) {
          return;
       }
       double videoDuratio = this.t.getVideoDuration();
       Object[] objArray = new Object[0];
       a.D().s("SegmentAddPresenter", "videoDuration: "+videoDuratio, objArray);
       if (((double)h.m - (videoDuratio * 0x408f400000000000)) - 0x408f400000000000 >= 0 && this.t.getSegmentInfoListSize() < 31) {
          this.S8(0);
       }else {
          this.S8(true);
       }
       return;
    }
    public final void S8(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "8")) {
          return;
       }
       this.p.setSelected(p0);
       this.q.setSelected(p0);
       this.r.setSelected(p0);
       return;
    }
    public final void V8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "12")) {
          return;
       }
       if (DraftUtils.i0(this.v) && this.v.v() != null) {
          this.v.n(0).m(true);
       }
       this.t.plusAddCount(p0.size());
       this.t.notifyChanged();
       this.z.set(Boolean.TRUE);
       AICutProjectManager.d(this.s.f());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a288f);
       this.r = m1.f(p0, 0x7f0a40e3);
       this.q = m1.f(p0, 0x7f0a14e4);
       m1.a(p0, new a(this), R.id.ll_add_segment);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.s = this.r8("EDITOR_HELPER_CONTRACT");
       this.t = this.r8("segment_video_model");
       this.u = this.r8("segment_selected_model");
       this.v = this.r8("WORKSPACE");
       this.w = this.r8("ASSET");
       this.x = this.r8("SEGMENT_DELETED_PUBLISHER");
       this.y = this.r8("FRAGMENT");
       this.z = this.x8("SEGMENT_IS_CHANGED");
       return;
    }
}
