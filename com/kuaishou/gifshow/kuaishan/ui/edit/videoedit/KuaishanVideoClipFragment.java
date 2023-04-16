package com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import com.kwai.video_clip.ui.VideoClipFragment;
import t36.f;
import p90.e;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.a;
import t36.f$a;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import u80.e;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.app.Activity;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Collections;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import hka.a;
import java.lang.Runnable;
import android.view.View;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.d;
import qw7.e;
import sw7.e;
import ekd.j0;
import o90.a;
import qw7.c;
import p90.a;
import qw7.a;

public class KuaishanVideoClipFragment extends VideoClipFragment	// class@001abe
{
    public f k;
    public b l;
    public ProgressFragment m;
    public KSAssetExportInfo n;
    public QMedia o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public a u;
    public boolean v;
    public Handler w;
    public Runnable x;
    public static long y;
    public static final int z;

    public void KuaishanVideoClipFragment(){
       super();
       this.k = new f();
       this.u = new e(this);
       this.v = true;
       this.w = new Handler();
       this.x = null;
    }
    public final void eh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KuaishanVideoClipFragment.class, "9")) {
          return;
       }
       KuaishanVideoClipFragment tm = this.m;
       if (tm != null && tm.isAdded()) {
          this.m.dismiss();
          this.m = objArray;
          this.k.s0(a.a);
       }
       return;
    }
    public final void fh(QMedia p0,boolean p1){
       if (PatchProxy.isSupport(KuaishanVideoClipFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KuaishanVideoClipFragment.class, "12")) {
          return;
       }
       String str = "KuaishanVideoClipFragment";
       int i = 0;
       if (this.getActivity() == null) {
          Object[] objArray = new Object[i];
          e.D().s(str, "finishPage getActivity\(\) == null", objArray);
          return;
       }else {
          GifshowActivity activity = this.getActivity();
          Intent intent = this.getActivity().getIntent();
          if (p1 && intent != null) {
             SerializableHook.putExtra(intent, "kuaishan_clip_video_qmedia", p0);
             this.getActivity().setResult(-1, intent);
          }
          if (intent != null) {
             Object[] objArray1 = new Object[i];
             e.D().s(str, "finishPage: media="+p0, objArray1);
             SerializableHook.putExtra(intent, "album_data_list", Collections.singletonList(p0));
             if (p0 != null) {
                i = -1;
             }
             activity.setResult(i, intent);
          }
          activity.finish();
          activity.overridePendingTransition(R.anim.arg_RES_7f010106, 0x7f010112);
          return;
       }
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, KuaishanVideoClipFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!PatchProxy.isSupport(KuaishanVideoClipFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, KuaishanVideoClipFragment.class, "11")) {
          this.fh(null, b);
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaishanVideoClipFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KuaishanVideoClipFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       if (!PatchProxy.applyVoid(null, this, KuaishanVideoClipFragment.class, "14") && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this.u);
       }
       this.k.b();
       this.w.removeCallbacks(this.x);
       this.x = null;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaishanVideoClipFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Bundle arguments = this.getArguments();
       if (arguments == null) {
          return;
       }
       this.o = SerializableHook.getSerializable(arguments, "intent_key_qmedia");
       this.n = SerializableHook.getSerializable(arguments, "intent_key_asset_info");
       this.p = arguments.getString("INTENT_KEY_MAGIC_ID", "");
       this.q = arguments.getString("INTENT_KEY_TASK_ID", "");
       this.j.u(new d(this));
       this.r = j0.a(this.getActivity().getIntent(), "INTENT_KEY_HAS_SOUND", false);
       this.s = j0.a(this.getActivity().getIntent(), "INTENT_KEY_NEED_CLIP", false);
       this.t = j0.a(this.getActivity().getIntent(), "INTENT_KEY_FAKE_CLIP", false);
       if (!PatchProxy.applyVoid(null, this, KuaishanVideoClipFragment.class, "13") && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this.u);
       }
       this.j.t(new a());
       this.j.s(new a());
       return;
    }
}
