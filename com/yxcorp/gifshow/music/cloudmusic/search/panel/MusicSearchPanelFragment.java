package com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.kwai.feature.post.api.music.cloudmusic.DefaultSearchInteractionImpl;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment$b;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dpb.b;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import com.kwai.robust.PatchProxyResult;
import gpb.h;
import java.util.Map;
import java.util.HashMap;
import nsd.r0;
import com.yxcorp.utility.TextUtils;
import java.util.Arrays;
import android.os.Bundle;
import kob.k;
import q87.c;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.fragment.app.FragmentActivity;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import b46.b;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k2b.e0;
import k2b.u1;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout;
import java.util.Objects;
import dpb.i$a;
import dpb.h;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$a;
import lnc.a1;
import gpb.a;
import dpb.i;
import com.kwai.feature.component.searchhistory.SearchLayout;
import gpb.i;

public final class MusicSearchPanelFragment extends BaseFragment implements g	// class@00203d
{
    public SearchMusicPanelInteraction j;
    public BaseFragment k;
    public PublishSubject l;
    public b m;
    public e0 n;
    public PresenterV2 o;
    public String p;
    public int q;
    public int r;
    public View s;
    public MusicSearchPanelFragment$b t;
    public static final MusicSearchPanelFragment$a u;

    static {
       MusicSearchPanelFragment.u = new MusicSearchPanelFragment$a(null);
    }
    public void MusicSearchPanelFragment(){
       PublishSubject this;
       super(null, null, null, null, 15, null);
       this.j = super();
       this = PublishSubject.g();
       a.o(this, "PublishSubject.create<Boolean>\(\)");
       this.l = this;
       this.p = "";
       this.q = -1;
       this.t = new MusicSearchPanelFragment$b(this);
    }
    public int M(){
       return 4;
    }
    public final SearchMusicPanelInteraction ch(){
       return this.j;
    }
    public final PublishSubject dh(){
       return this.l;
    }
    public final void eh(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment.class, "17")) {
          return;
       }
       MusicSearchPanelFragment tm = this.m;
       if (tm == null) {
          a.S("musicSearchHandler");
       }
       if (tm.g()) {
          tm = this.m;
          if (tm == null) {
             a.S("musicSearchHandler");
          }
          SearchMusicFragment searchMusicF = tm.c();
          if (searchMusicF != null) {
             CloudMusicHelper uCloudMusicH = searchMusicF.Hh();
             if (uCloudMusicH != null) {
                uCloudMusicH.reset();
             }
          }
       }
    label_0031 :
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicSearchPanelFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MusicSearchPanelFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MusicSearchPanelFragment.class, new h());
       }else {
          obj.put(MusicSearchPanelFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, MusicSearchPanelFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{TextUtils.k(this.p)};
       obj = String.format("task_id=%s", Arrays.copyOf(objArray, 1));
       a.o(obj, "java.lang.String.format\(format, *args\)");
       return obj;
    }
    public String o(){
       return "MUSIC_SEARCH_PANEL";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicSearchPanelFragment.class, "9")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       k.D().w("music_search_panel", "panel fragment onCreate", objArray);
       this.k = this;
       p0 = this.getArguments();
       if (p0 != null) {
          String str = p0.getString("photo_task_id", "");
          a.o(str, "it.getString\(CameraConstants.KEY_TASK_ID, \"\"\)");
          this.p = str;
          this.q = p0.getInt("enter_type");
          this.r = p0.getInt("duration");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicSearchPanelFragment.class, "10");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       int i = 0;
       Object[] objArray = new Object[i];
       k.D().w("music_search_panel", "panel fragment onCreateView", objArray);
       View view = a.h(p0, R.layout.arg_RES_7f0d1023, p1, i, 2);
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          a.o(layoutParams, "layoutParams");
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             a.o(activity, "it");
             layoutParams.height = b.a.a(activity);
             view.setLayoutParams(layoutParams);
          }
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment.class, "14")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       k.D().w("music_search_panel", "panel fragment onDestroy", objArray);
       MusicSearchPanelFragment tm = this.m;
       if (tm == null) {
          a.S("musicSearchHandler");
       }
       tm.i();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment.class, "13")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       k.D().w("music_search_panel", "panel fragment onDestroyView", objArray);
       MusicSearchPanelFragment to = this.o;
       if (to != null) {
          to.unbind();
       }
       to = this.o;
       if (to != null) {
          to.destroy();
       }
       this.o = null;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MusicSearchPanelFragment.class, "12")) {
          return;
       }
       super.onResume();
       u1.L0(this);
       MusicSearchPanelFragment ts = this.s;
       if (ts != null && ts instanceof DragScrollContainerLayout) {
          Objects.requireNonNull(ts, "null cannot be cast to non-null type com.kwai.feature.post.api.music.widget.DragScrollContainerLayout");
          ts.setCurrentOffset(0);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       MusicSearchPanelFragment to;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicSearchPanelFragment.class, "11")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[0];
       k.D().w("music_search_panel", "panel fragment onViewCreate", objArray);
       this.s = p0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, MusicSearchPanelFragment.class, "15")) {
          i$a uoa = new i$a().d(this).g(this.t);
          uoa.c(this.q);
          uoa.h(this.p);
          uoa.e(this.r);
          uoa.b(0);
          uoa.f(R.id.search_fragment_container);
          uoa.h = true;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          MusicSearchUiOption musicSearchU = PatchProxy.apply(null, this, MusicSearchPanelFragment.class, "16");
          if (musicSearchU != patchProxyRe) {
          }else {
             MusicSearchUiOption$a uoa1 = new MusicSearchUiOption$a();
             uoa1.a = 0x7f06018a;
             uoa1.b = 0x7f06190e;
             uoa1.c = true;
             uoa1.d = true;
             uoa1.b(1);
             uoa1.g = a1.d(0x7f070e4d);
             uoa1.c(a1.d(R.dimen.arg_RES_7f070cb1));
             uoa1.i = true;
             a uoa2 = new a(this);
             Object obj = PatchProxy.applyOneRefs(uoa2, uoa1, MusicSearchUiOption$a.class, "1");
             if (obj != patchProxyRe) {
                uoa1 = obj;
             }else {
                a.p(uoa2, "listener");
                uoa1.e = uoa2;
             }
             musicSearchU = uoa1.a();
          }
          b uob = new b(uoa.i(musicSearchU).a());
          this.m = uob;
          uob.b(p0);
          to = this.m;
          if (to == null) {
             a.S("musicSearchHandler");
          }
          Objects.requireNonNull(to);
          if (!PatchProxy.applyVoid(null, to, b.class, "6")) {
             uob = to.a;
             if (uob != null) {
                uob.u();
             }
          }
       }
    label_00e2 :
       PresenterV2 presenterV2 = new PresenterV2();
       this.o = presenterV2;
       a.m(presenterV2);
       presenterV2.U7(new i());
       to = this.o;
       a.m(to);
       to.f(p0);
       MusicSearchPanelFragment to1 = this.o;
       a.m(to1);
       Object[] objArray1 = new Object[]{this};
       to1.i(objArray1);
       return;
    }
}
