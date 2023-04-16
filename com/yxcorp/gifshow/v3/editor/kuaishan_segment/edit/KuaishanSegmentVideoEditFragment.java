package com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaishanSegmentVideoEditFragment;
import com.kwai.video_clip.ui.VideoClipFragment;
import android.os.Handler;
import grc.p;
import ga9.b;
import com.kwai.video_clip.viewbinder.AbsVideoClipFragmentViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaiShanSegmentVideoClipVB;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.models.QMedia;
import androidx.fragment.app.FragmentActivity;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Intent;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.model.KeyFrameTransform;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import lnc.g7;
import java.lang.Boolean;
import android.os.Bundle;
import hka.a;
import java.lang.Runnable;
import android.view.View;
import lnc.r5;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.e;
import qw7.e;
import sw7.e;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.KuaishanSegmentVideoEditFragment$a;
import qw7.c;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.edit.d;
import qw7.a;

public class KuaishanSegmentVideoEditFragment extends VideoClipFragment	// class@00101b
{
    public KeyFrameTransform k;
    public b l;
    public ProgressFragment m;
    public QMedia n;
    public boolean o;
    public long p;
    public int q;
    public EditorSdk2MvAsset r;
    public boolean s;
    public Handler t;
    public Runnable u;
    public a v;
    public static final int w;

    public void KuaishanSegmentVideoEditFragment(){
       super();
       this.s = true;
       this.t = new Handler();
       this.u = null;
       this.v = new p(this);
    }
    public b Wg(){
       return this.ch();
    }
    public AbsVideoClipFragmentViewBinder ch(){
       Object obj = PatchProxy.apply(null, this, KuaishanSegmentVideoEditFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KuaiShanSegmentVideoClipVB(this, 1);
    }
    public final void eh(){
       if (PatchProxy.applyVoid(null, this, KuaishanSegmentVideoEditFragment.class, "7")) {
          return;
       }
       KuaishanSegmentVideoEditFragment tm = this.m;
       if (tm != null && tm.isAdded()) {
          this.m.dismiss();
          this.m = null;
       }
       return;
    }
    public final void fh(String p0,QMedia p1,float[] p2){
       Object[] objArray;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KuaishanSegmentVideoEditFragment.class, "12")) {
          return;
       }
       String str = "KuaishanSegmentVideoEditFragment";
       int i = 0;
       if (this.getActivity() == null) {
          objArray = new Object[i];
          a.D().s(str, "finishPage getActivity\(\) == null", objArray);
          return;
       }else {
          GifshowActivity activity = this.getActivity();
          if (TextUtils.x(p0) || p1 == null) {
             objArray = new Object[i];
             a.D().s(str, "finishPage: exportFilePath is empty or media == null", objArray);
             activity.setResult(i);
             activity.finish();
             activity.overridePendingTransition(R.anim.arg_RES_7f010106, 0x7f010112);
             return;
          }else {
             Intent intent = new Intent();
             KeyFrameTransform keyFrameTran = new KeyFrameTransform();
             keyFrameTran.setTransformedVideoPath(p0);
             keyFrameTran.setClipStartInSeconds(((double)p1.mClipStart / 0x408f400000000000));
             keyFrameTran.setClipDurationInSeconds(((double)p1.mClipDuration / 0x408f400000000000));
             if (p2 != null && p2.length == 2) {
                keyFrameTran.setCenterX((0x3f800000 - p2[i]));
                keyFrameTran.setCenterY((0x3f800000 - p2[1]));
             }
             KuaishanSegmentVideoEditFragment tk = this.k;
             if (tk != null) {
                keyFrameTran.setRotate(tk.getRotate());
                keyFrameTran.setScale(this.k.getScale());
                keyFrameTran.setOriginalScaleFromSdk(this.k.getOriginalScaleFromSdk());
             }
             SerializableHook.putExtra(intent, "INTENT_KEY_CROP_TRANSFORM", keyFrameTran);
             SerializableHook.putExtra(intent, "intent_key_qmedia", p1);
             this.getActivity().setResult(-1, intent);
             activity.finish();
             activity.overridePendingTransition(R.anim.arg_RES_7f010106, 0x7f010112);
             return;
          }
       }
    }
    public final void gh(){
       if (PatchProxy.applyVoid(null, this, KuaishanSegmentVideoEditFragment.class, "15")) {
          return;
       }
       g7.q();
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, KuaishanSegmentVideoEditFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.fh(null, null, null);
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaishanSegmentVideoEditFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KuaishanSegmentVideoEditFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, KuaishanSegmentVideoEditFragment.class, "14") && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this.v);
       }
       this.t.removeCallbacks(this.u);
       this.u = null;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaishanSegmentVideoEditFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Bundle arguments = this.getArguments();
       if (arguments == null) {
          return;
       }
       this.n = SerializableHook.getSerializable(arguments, "intent_key_qmedia");
       this.k = SerializableHook.getSerializable(arguments, "intent_key_transform");
       boolean b = true;
       this.o = arguments.getBoolean("INTENT_KEY_SHOW_SELECT_VIEW", b) ^ b;
       KuaishanSegmentVideoEditFragment tn = this.n;
       long l = (tn == null)? 0: tn.mClipDuration;
       this.p = arguments.getLong("intent_key_clip_duration", l);
       this.q = arguments.getInt("intent_key_template_grade", 0);
       String str = arguments.getString("intent_key_mv_asset", "");
       if (!TextUtils.x(str)) {
          EditorSdk2MvAsset uEditorSdk2M = r5.b().a(str, EditorSdk2MvAsset.class);
          this.r = uEditorSdk2M;
          if (uEditorSdk2M != null) {
             r5.b().d(str);
          }
       }
       this.j.u(new e(this));
       if (!PatchProxy.applyVoid(null, this, KuaishanSegmentVideoEditFragment.class, "13") && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this.v);
       }
       this.j.t(new KuaishanSegmentVideoEditFragment$a(this));
       this.j.s(d.a);
       return;
    }
}
