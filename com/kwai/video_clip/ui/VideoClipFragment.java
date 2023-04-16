package com.kwai.video_clip.ui.VideoClipFragment;
import dc7.c;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import ga9.b;
import com.kwai.video_clip.viewbinder.AbsVideoClipFragmentViewBinder;
import androidx.lifecycle.ViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ga9.c;
import vw7.a;
import androidx.fragment.app.Fragment;
import com.kwai.video_clip.viewbinder.DefaultViewClipFragmentViewBinder;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import java.util.Objects;
import sw7.e;
import android.widget.TextView;
import sw7.h;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import sw7.i;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.models.QMedia;
import ga9.c$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.video_clip.widget.CustomHorizontalScroller;
import com.kwai.video_clip.widget.CustomHorizontalScroller$b;
import com.yxcorp.gifshow.album.widget.preview.a$a;
import com.yxcorp.gifshow.album.widget.preview.a;
import com.kwai.video.editorsdk2.VideoEditorSession;
import uw7.a;
import uw7.c;
import java.util.List;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import java.lang.StringBuilder;
import android.util.LruCache;
import qw7.c;
import java.util.Map;
import uw7.d;
import s79.a;
import com.kwai.video_clip.widget.VideoSelectView;
import java.lang.Float;
import lnc.a1;
import java.util.Locale;
import java.lang.Double;
import java.lang.CharSequence;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController;
import com.kwai.video.editorsdk2.PreviewPlayer;
import java.lang.Exception;
import sw7.f;
import sw7.d;
import java.lang.Runnable;
import android.widget.HorizontalScrollView;
import sw7.g;
import androidx.lifecycle.Lifecycle;
import sw7.a;
import androidx.lifecycle.LifecycleObserver;
import sw7.c;
import com.kwai.video_clip.widget.VideoSelectView$a;
import java.lang.Throwable;

public class VideoClipFragment extends AlbumBaseFragment implements c	// class@001103
{
    public a i;
    public e j;

    public void VideoClipFragment(){
       super();
    }
    public b Wg(){
       return this.ch();
    }
    public b Yg(){
       return this.dh();
    }
    public ViewModel Zg(){
       return this.i;
    }
    public AbsVideoClipFragmentViewBinder ch(){
       VideoClipFragment obj = PatchProxy.apply(null, this, VideoClipFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj != null && obj.q0() != null) {
          return this.i.q0().a(AbsVideoClipFragmentViewBinder.class, this, 1);
       }
       return new DefaultViewClipFragmentViewBinder(this, 1);
    }
    public AbsVideoClipFragmentViewBinder dh(){
       return this.d;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, VideoClipFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isAdded()) {
          return false;
       }
       this.getActivity().finish();
       return true;
    }
    public void onBindClickEvent(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoClipFragment.class, "1")) {
          return;
       }
       VideoClipFragment tj = this.j;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoid(objArray, tj, e.class, "17")) {
          tj.g.n().setOnClickListener(new h(tj));
          tj.g.j().setOnClickListener(new i(tj));
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoClipFragment.class, "4")) {
          return;
       }
       Bundle arguments = this.getArguments();
       if (arguments != null && !PatchProxy.applyVoidOneRefs(arguments, this, VideoClipFragment.class, "6")) {
          Serializable serializable = null;
          a uoa = PatchProxy.applyOneRefs(arguments, serializable, a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             Serializable serializable1 = SerializableHook.getSerializable(arguments, "intent_key_qmedia");
             if (serializable1 != null) {
                serializable = serializable1;
             }
             a uoa1 = new a(serializable, c.d.a(arguments), arguments.getBoolean("INTENT_KEY_HAS_SOUND"), arguments.getBoolean("INTENT_KEY_NEED_CLIP"), arguments.getBoolean("INTENT_KEY_SHOW_SELECT_VIEW", true));
          }
          this.i = uoa;
       }
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoClipFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i != null) {
          Log.g("PreviewBug", "mManager initialized in onCreateView, create new viewbinder");
          this.d = this.ch();
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VideoClipFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       VideoClipFragment tj = this.j;
       if (tj != null) {
          Objects.requireNonNull(tj);
          e uoe = e.class;
          if (!PatchProxy.applyVoid(null, tj, uoe, "24")) {
             tj.g.l().getViewTreeObserver().removeOnGlobalLayoutListener(tj.s);
             tj.g.k().setOnScrollListener(null);
             e h = tj.h;
             if (h != null) {
                h.p("VideoClipViewStub2", null);
             }
             tj.g.l().f();
             h = tj.k;
             if (h != null) {
                h.release();
             }
             if (!PatchProxy.applyVoid(null, tj, uoe, "25")) {
                uoe = tj.m;
                if (uoe != null) {
                   a uoa = a.class;
                   c uoc = c.class;
                   if (!PatchProxy.applyVoid(null, uoe, uoc, "16")) {
                      String str = "TimeLineCache";
                      String str1 = "lrucache memory £º";
                      String str2 = "TimeLineGenerator";
                      if (!PatchProxy.applyVoid(null, uoe, uoc, "14")) {
                         uoe.p.clear();
                         uoc = uoe.c;
                         if (uoc != null) {
                            uoc.release();
                            uoe.c = null;
                         }
                         Log.b(str2, "stop: ");
                         uoe.q = null;
                         uoc = uoe.b;
                         Objects.requireNonNull(uoc);
                         if (!PatchProxy.applyVoid(null, uoc, uoa, "11")) {
                            Log.b(str, str1+uoc.c.size());
                            uoc.c.evictAll();
                         }
                         uoc = uoe.m;
                         if (uoc != null) {
                            uoc.b();
                         }
                      }
                      Log.b(str2, "release: ");
                      uoc = uoe.b;
                      Objects.requireNonNull(uoc);
                      if (!PatchProxy.applyVoid(null, uoc, uoa, "1")) {
                         Log.b(str, str1+uoc.c.size());
                         uoc.c.evictAll();
                         uoc.a.clear();
                         if (!PatchProxy.applyVoid(null, uoc, uoa, "12")) {
                            uoc.b.clear();
                         }
                      }
                      uoe.e = null;
                      uoe.s.a();
                      uoe.r.a();
                      uoe.t.clear();
                      uoe.u = null;
                   }
                   tj.m = null;
                }
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoClipFragment.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, VideoClipFragment.class, "9")) {
          this.j = new e(this.i, this, this.dh());
       }
       super.onViewCreated(p0, p1);
       if (this.i == null) {
          return;
       }else {
          super.onViewCreated(p0, p1);
          if (!PatchProxy.applyVoid(null, this, VideoClipFragment.class, "8")) {
             this.j.b(null);
          }
          try{
             VideoClipFragment tj = this.j;
             Objects.requireNonNull(tj);
             e uoe = e.class;
             if (!PatchProxy.applyVoid(null, tj, uoe, "2")) {
                tj.n = tj.e.p0().mClipStart;
                tj.o = tj.e.p0().mExportPositionX;
                tj.p = tj.e.p0().mExportPositionY;
                if (!PatchProxy.applyVoid(null, tj, uoe, "3")) {
                   float f = (float)tj.e.p0().mExportWidth / (float)tj.e.p0().mExportHeight;
                   VideoSelectView videoSelectV = tj.g.p();
                   QMedia mExportPosit = tj.e.p0().mExportPositionX;
                   QMedia mExportPosit1 = tj.e.p0().mExportPositionY;
                   Objects.requireNonNull(videoSelectV);
                   if (!PatchProxy.isSupport(VideoSelectView.class) || !PatchProxy.applyVoidThreeRefs(Float.valueOf(f), Float.valueOf(mExportPosit), Float.valueOf(mExportPosit1), videoSelectV, VideoSelectView.class, "2")) {
                      Log.b("KuaiShanVideoSelectView", "initData\(\) :resizeRatio = ["+f+"], startPercentX = ["+mExportPosit+"], startPercentY = ["+mExportPosit1+"]");
                      videoSelectV.l = f;
                      videoSelectV.j = mExportPosit;
                      videoSelectV.k = mExportPosit1;
                   }
                   tj.g.l().getViewTreeObserver().addOnGlobalLayoutListener(tj.s);
                }
                Object[] objArray = new Object[]{Double.valueOf(((double)tj.e.p0().mClipDuration / 0x408f400000000000))};
                String str = String.format(Locale.getDefault(), "%.1f", objArray)+a1.p(0x7f1045e8);
                AbsVideoClipFragmentViewBinder g = tj.g.g;
                g.setText(str);
                tj.k = new VideoEditorSession();
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tj, uoe, "5")) {
                   try{
                      tj.h = new KsAlbumVideoSDKPlayerController(tj.g.l());
                      tj.g.l().setPlayerController(tj.h);
                      tj.h.x(tj.k, null);
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                   e h = tj.h;
                   if (h != null) {
                      h.p("VideoClipViewStub2", new f(tj));
                   }
                   tj.l(1);
                }
                if (!PatchProxy.applyVoid(null, tj, uoe, "16")) {
                   tj.g.k().post(new d(tj));
                   tj.g.k().setOnScrollListener(new g(tj));
                }
                tj.f.getLifecycle().addObserver(new a(tj));
                tj.g.p().setScrollListener(new c(tj));
             }
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e12){
             Log.k(e12);
          }
          return;
       }
    }
}
