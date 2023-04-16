package com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment;
import lob.r;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$Tab;
import java.lang.Enum;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import com.kwai.robust.PatchProxyResult;
import kob.k;
import java.lang.StringBuilder;
import w46.b;
import java.lang.IllegalArgumentException;
import android.content.Intent;
import java.lang.Integer;
import q87.c;
import java.lang.Boolean;
import ik0.f;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.os.Bundle;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.View;
import lob.s0;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import java.util.List;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import lnc.a1;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import um6.i;
import um6.j;

public class PostMusicTabHostFragment extends TabHostFragment implements r	// class@001fea
{
    public final ViewPager$l B;
    public int C;
    public PostBubbleManager D;
    public static final int E;

    public void PostMusicTabHostFragment(){
       super();
       this.B = new PostMusicTabHostFragment$a(this);
    }
    public int Bh(){
       return 0x7f0a2cdc;
    }
    public void Ea(){
       if (PatchProxy.applyVoid(null, this, PostMusicTabHostFragment.class, "7")) {
          return;
       }
       Fragment uFragment = this.rh(PostMusicTabHostFragment$Tab.MUSIC.ordinal());
       if (uFragment instanceof MusicFragment) {
          uFragment.Ea();
       }
       return;
    }
    public Fragment H8(){
       return this;
    }
    public int f(){
       return 56;
    }
    public int getLayoutResId(){
       return 0x7f0d1187;
    }
    public int getPage(){
       return 50;
    }
    public String getUrl(){
       PostMusicTabHostFragment obj = PatchProxy.apply(null, this, PostMusicTabHostFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj == null) {
          return "ks://online_music/record";
       }
       if (obj == 1) {
          return "ks://online_music/edit";
       }
       if (obj == 2) {
          return "ks://online_music/live";
       }
       Object[] objArray = new Object[0];
       k.D().t("PostMusicTabHostFragment", "Illegal enter type:"+this.C, objArray);
       throw new IllegalArgumentException("Illegal enter type:"+this.C);
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PostMusicTabHostFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PostMusicTabHostFragment.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().w("PostMusicTabHostFragment", "onActivityResult, requestCode is "+p0+", resultCode is "+p1, objArray);
       super.onActivityResult(p0, p1, p2);
       Fragment uFragment = this.t();
       if (uFragment != null) {
          uFragment.onActivityResult(p0, p1, p2);
       }
       return;
    }
    public boolean onBackPressed(){
       Fragment obj = PatchProxy.apply(null, this, PostMusicTabHostFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       k.D().w("PostMusicTabHostFragment", "onBackPressed", objArray);
       obj = this.t();
       if (obj instanceof MusicFragment && obj.onBackPressed()) {
          return true;
       }
       if (obj instanceof f && obj.onBackPressed()) {
          return true;
       }
       this.Ea();
       if (this.getActivity() != null) {
          this.getActivity().setResult(0, null);
          this.getActivity().finish();
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostMusicTabHostFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       k.D().w("PostMusicTabHostFragment", "onCreate", objArray);
       if (this.getArguments() != null) {
          this.C = this.getArguments().getInt("enter_type", 0);
       }
       this.D = new PostBubbleManager(this);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PostMusicTabHostFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       k.D().w("PostMusicTabHostFragment", "onDestroyView", objArray);
       TabHostFragment tt = this.t;
       if (tt != null) {
          tt.setOnPageChangeListener(null);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostMusicTabHostFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[0];
       k.D().w("PostMusicTabHostFragment", "onViewCreate", objArray);
       p0 = p0.findViewById(R.id.music_tab_host_tab_back_btn);
       if (p0 != null) {
          p0.setOnClickListener(new s0(this));
       }
       TabHostFragment tt = this.t;
       if (tt != null) {
          tt.setOnPageChangeListener(this.B);
          PagerSlidingTabStrip g = this.t.g;
          if (g != null) {
             g.getViewTreeObserver().addOnPreDrawListener(new PostMusicTabHostFragment$b(this));
          }
       }
       tt = this.u;
       if (tt instanceof CommonLogViewPager) {
          tt.setScrollable(0);
       }
       return;
    }
    public String qh(){
       Object obj = PatchProxy.apply(null, this, PostMusicTabHostFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t.g != null && this.getArguments() != null) {
          PostMusicTabHostFragment$Tab kTV_RN = PostMusicTabHostFragment$Tab.KTV_RN;
          if (this.getArguments().getInt("EXTRA_DEFAULT_HEADER_SELECT_TAB", PostMusicTabHostFragment$Tab.MUSIC.ordinal()) == kTV_RN.ordinal()) {
             return kTV_RN.name();
          }
       }
       return PostMusicTabHostFragment$Tab.MUSIC.name();
    }
    public List wh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, PostMusicTabHostFragment.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       b uob = PatchProxy.apply(objArray, this, PostMusicTabHostFragment.class, "6");
       if (uob != patchProxyRe) {
       }else {
          uob = new b(new PagerSlidingTabStrip$d(PostMusicTabHostFragment$Tab.MUSIC.name(), a1.p(0x7f103db1)), MusicFragment.class, this.getArguments());
       }
       obj.add(uob);
       b uob1 = PatchProxy.apply(objArray, this, PostMusicTabHostFragment.class, "5");
       if (uob1 != patchProxyRe) {
       }else {
          uob1 = d.a(0x6ea9440a).Tu(new PagerSlidingTabStrip$d(PostMusicTabHostFragment$Tab.KTV_RN.name(), a1.p(R.string.arg_RES_7f103db0)), this.getArguments(), true);
       }
       obj.add(uob1);
       return obj;
    }
}
