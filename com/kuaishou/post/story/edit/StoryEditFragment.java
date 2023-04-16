package com.kuaishou.post.story.edit.StoryEditFragment;
import hka.a;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gq4.a$a;
import crd.a;
import zp4.k;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import android.os.Parcelable;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zp4.j;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import java.lang.Integer;
import com.kwai.feature.post.api.feature.story.model.PostStoryParams;
import java.lang.StringBuilder;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.activity.ComponentActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.UUID;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import com.kwai.feature.post.api.feature.story.model.PostStoryParams$a;
import lnc.a1;
import lnc.r5;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import android.graphics.Bitmap;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.m$g0;
import qr4.i;
import qr4.m$k0;
import k2b.u1;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.RuntimeException;
import lq.i;
import android.content.Intent;
import android.app.Activity;
import rp4.n;
import java.io.Serializable;
import ekd.j0;
import mca.a;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.b;
import lnc.b9;
import rp4.c;
import android.view.Window;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import androidx.lifecycle.ViewModel;
import sm6.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import rp4.a;
import q87.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import gq4.a;
import lq.a;
import brd.t;
import zp4.a;
import com.kuaishou.post.story.edit.a;
import erd.g;

public class StoryEditFragment extends BaseFragment implements a, g	// class@000ac4
{
    public BaseFragment j;
    public a k;
    public a$a l;
    public String m;
    public boolean n;
    public String o;
    public boolean p;
    public PresenterV2 q;
    public String r;
    public String s;
    public a t;
    public f u;
    public static final int v;

    public void StoryEditFragment(){
       super();
       this.l = new a$a();
       this.m = "EDIT_MOOD_PHOTO";
       this.n = false;
       this.o = "";
       this.p = false;
       this.s = "";
       this.t = new a();
    }
    public static Bundle ch(k p0){
       Bundle obj = PatchProxy.applyOneRefs(p0, null, StoryEditFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       if (p0 == null) {
          return obj;
       }
       obj.putInt("INTENT_STORY_TYPE", p0.a);
       obj.putInt("INTENT_STORY_SOURCE", p0.b);
       obj.putString("INTENT_STORY_FILEPATH", p0.c);
       obj.putString("INTENT_ENCODE_PROFILE_KEY", p0.j);
       obj.putString("INTENT_COPY_TEXT", p0.n);
       obj.putInt("INTENT_TEXT_COLOR_INDEX", p0.o);
       if (p0.d() != null) {
          obj.putParcelable("INTENT_STORY_MOOD_TEMPLATE_DATA", p0.d());
       }
       if (p0.a() != null) {
          obj.putParcelable("INTENT_STORY_AI_VIDEO_BACKGROUND_DATA", p0.a());
       }
       if (p0.e() != null) {
          obj.putParcelable("INTENT_NEXT_STEP_AI_VIDEO_ERROR_CODE", p0.e());
       }
       if (p0.b() != null) {
          obj.putParcelable("INTENT_DEFAULT_DECORATION_DRAWER", p0.b());
       }
       if (!TextUtils.x(p0.h())) {
          obj.putString("INTENT_SHARED_PROJECT_KEY", p0.h());
       }
       if (!TextUtils.x(p0.g())) {
          obj.putString("INTENT_PLACEHOLDER_IMAGE_KEY", p0.g());
       }
       if (!TextUtils.x(p0.f())) {
          obj.putString("INTENT_PLACEHOLDER_IMAGE_FILE_PATH", p0.f());
       }
       if (p0.c() - null > 0) {
          obj.putLong("INTENT_STORY_DURATION", p0.c());
       }
       obj.putByteArray("INTENT_STORY_VIDEO_CONTEXT_JSON", p0.e);
       return obj;
    }
    public int M(){
       return 1;
    }
    public boolean Zg(){
       return false;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryEditFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, StoryEditFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(StoryEditFragment.class, new j());
       }else {
          obj.put(StoryEditFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, StoryEditFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.k.t.c.intValue() == 2) {
          return 0;
       }
       if (TextUtils.x(this.k.m.getEditPageName())) {
          return 322;
       }
       return super.getPage();
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, StoryEditFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.k.t.c.intValue() != 2)? "": "pure_text";
       return "task_id="+this.r+"&type="+obj;
    }
    public String h5(){
       return this.s;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, StoryEditFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k.t.c.intValue() == 2) {
          return this.m;
       }
       if (!TextUtils.x(this.k.m.getEditPageName())) {
          return this.k.m.getEditPageName();
       }
       return "STORY_EDIT_PREVIEW";
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, StoryEditFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getActivity() == null) {
          return false;
       }
       this.getActivity().onBackPressed();
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       String parcelable1;
       PostStoryParams$a parcelable1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, StoryEditFragment.class, "6");
       if (p2 != patchProxyRe) {
          return p2;
       }
       this.s = UUID.randomUUID().toString();
       p2 = this.getArguments();
       Serializable serializable = null;
       a uoa = PatchProxy.applyOneRefs(p2, serializable, a.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a();
          if (p2 != null) {
             i = 1;
             uoa.t.b = p2.getInt("INTENT_STORY_TYPE", i);
             int i1 = 2;
             uoa.t.c = Integer.valueOf(p2.getInt("INTENT_STORY_SOURCE", i1));
             uoa.t.j = p2.getString("INTENT_STORY_FILEPATH");
             uoa.b = p2.getLong("INTENT_STORY_DURATION", 0);
             DecorationDrawer parcelable = p2.getParcelable("INTENT_DEFAULT_DECORATION_DRAWER");
             uoa.n = parcelable;
             if (parcelable == null) {
                parcelable1 = p2.getString("INTENT_COPY_TEXT");
                int intx = p2.getInt("INTENT_TEXT_COLOR_INDEX", false);
                if (!TextUtils.x(parcelable1)) {
                   StoryTextDrawer storyTextDra = new StoryTextDataManager().a(false, intx);
                   storyTextDra.mText = parcelable1;
                   uoa.n = storyTextDra;
                   uoa.u = i;
                   uoa.v = i;
                   parcelable1 = new PostStoryParams$a();
                   parcelable1.e = a1.p(0x7f102f67);
                   uoa.m = parcelable1.a();
                }
             }
             uoa.s = p2.getString("INTENT_ENCODE_PROFILE_KEY");
             parcelable1 = "";
             String str = p2.getString("INTENT_SHARED_PROJECT_KEY", parcelable1);
             if (!TextUtils.x(str)) {
                uoa.o = r5.b().a(str, EditorSdk2V2$VideoEditorProject.class);
                r5.b().d(str);
             }
             str = p2.getString("INTENT_PLACEHOLDER_IMAGE_KEY", parcelable1);
             if (!TextUtils.x(str)) {
                uoa.p = r5.b().a(str, Bitmap.class);
                r5.b().d(str);
             }
             parcelable1 = p2.getString("INTENT_PLACEHOLDER_IMAGE_FILE_PATH", parcelable1);
             if (!TextUtils.x(parcelable1)) {
                uoa.q = parcelable1;
             }
             m$g0 byte[] parcelable11 = p2.getByteArray("INTENT_STORY_VIDEO_CONTEXT_JSON");
             if (parcelable11 != null) {
                VideoContext videoContext = new VideoContext();
                videoContext.k0(parcelable11);
                uoa.d = videoContext;
             }
             if (uoa.d == null) {
                uoa.d = new VideoContext();
             }
             parcelable11 = new m$g0();
             if (uoa.t.c.intValue() == i1) {
                parcelable11.a = 6;
                uoa.t.k = p2.getParcelable("INTENT_STORY_MOOD_TEMPLATE_DATA");
                uoa.t.l = p2.getParcelable("INTENT_STORY_AI_VIDEO_BACKGROUND_DATA");
                uoa.x = p2.getParcelable("INTENT_NEXT_STEP_AI_VIDEO_ERROR_CODE");
                p2.J = parcelable11;
                p2.i = uoa.d.Q();
                if (TextUtils.x(uoa.t.i)) {
                   p2.i = u1.f();
                }
                uoa.y = DraftFileManager.E().f(Workspace$Type.PHOTO_MOVIE, Workspace$Source.IMPORT, uoa.t.i, uoa.d);
             }else {
                throw new RuntimeException("story source is unknown");
             }
          }
          i.m().Z(uoa.y);
       }
       this.k = uoa;
       if (!PatchProxy.applyVoid(serializable, this, StoryEditFragment.class, "11")) {
          Intent intent = (this.getActivity() != null)? this.getActivity().getIntent(): serializable;
          StoryEditFragment tk = this.k;
          if (tk.m == null) {
             PostStoryParams postStoryPar = PatchProxy.applyOneRefs(intent, serializable, n.class, "15");
             if (postStoryPar != patchProxyRe) {
             }else if(intent != null){
                serializable = j0.e(intent, "start_story_activity_params");
             }
             if (serializable == null) {
                postStoryPar = new PostStoryParams$a().a();
             }else {
                postStoryPar = serializable;
             }
             tk.m = postStoryPar;
          }
       }
       a.u();
       return a.g(p0, 0x7f0d156d, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, StoryEditFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       StoryEditFragment tq = this.q;
       if (tq != null) {
          tq.unbind();
          this.q.destroy();
       }
       this.q = null;
       b9.a(this.t);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, StoryEditFragment.class, "14")) {
          return;
       }
       super.onDetach();
       c.b(404, "close");
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, StoryEditFragment.class, "13")) {
          return;
       }
       super.onResume();
       if (this.p == null) {
          this.p = true;
       }
       if (n.h()) {
          this.getActivity().getWindow().setStatusBarColor(0);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       FragmentActivity activity;
       StoryEditFragment tl;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryEditFragment.class, "7")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.getActivity() != null && this.getActivity().isFinishing()) {
          return;
       }
       if (this.k.v != null && (this.getActivity() != null && PostExperimentUtils.r())) {
          ViewModelProviders.of(this.getActivity()).get(FontViewModel.class).y0(true);
       }
    label_0045 :
       e uoe = 0x7f0a3f6a;
       if (this.k.t.c.intValue() == 2) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, StoryEditFragment.class, "8")) {
             View view = p0.findViewById(uoe);
             RelativeLayout$LayoutParams layoutParams = view.getLayoutParams();
             layoutParams.topMargin = b.p(this.getActivity(), p0);
             view.setLayoutParams(layoutParams);
          }
       }else {
          n.a(p0.findViewById(uoe));
       }
       a t = this.k.t;
       this.r = t.i;
       if (TextUtils.x(t.j)) {
          Object[] objArray = new Object[0];
          a.D().A("StoryEditFragment", "Missing file path. Finish.", objArray);
          activity = this.getActivity();
          if (activity != null) {
             activity.finish();
             return;
          }
       }
       activity.c = p0.findViewById(0x7f0a3120);
       this.k.c.setTaskId(this.r);
       t = this.k.t;
       if (t.b != null || t.c.intValue() == 2) {
          if (this.getActivity() != null) {
             t.b = j0.e(this.getActivity().getIntent(), "MUSIC_RECO_PARAMS");
             tl = this.l;
             if (tl.b == null) {
                tl.b = new MusicRecommendParams();
                tl.mPhotoDuration = this.k.b;
             }
             tl.a = j0.c(this.getActivity().getIntent(), "musicRecoDelayMs", 0);
          }
          tl.e = new a();
       }
       this.j = this;
       this.t.c(i.m().p().init().subscribe(new a(this, p0), a.b));
       if (this.k.t.c.intValue() != 2) {
          i.m().b0(0);
       }
       return;
    }
}
