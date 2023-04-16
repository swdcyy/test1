package com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import com.kuaishou.viewbinder.IBaseViewHost;
import fpb.a;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import com.yxcorp.gifshow.music.util.RealTimeLogger;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import fpb.b;
import com.yxcorp.gifshow.music.cloudmusic.search.b;
import com.yxcorp.utility.TextUtils;
import kob.k;
import q87.c;
import k2b.u1;
import s2b.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import i2b.a;
import fpb.d;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import j06.d;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import dpb.k;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$a;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import qvb.i;
import qvb.n0;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment$a;
import s2b.a;
import yob.e;
import dpb.l;
import com.trello.rxlifecycle3.android.FragmentEvent;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragment;
import crd.b;
import eoc.f;
import yob.c;
import dpb.m;
import qvb.a;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonObject;
import jqb.k;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import y8c.g;
import com.yxcorp.gifshow.music.cloudmusic.search.a;
import q46.t;
import hpb.a;

public class SearchMusicFragment extends CloudMusicRecyclerFragmentV2 implements IBaseViewHost, a	// class@002032
{
    public b U;
    public long U0;
    public RealTimeLogger V;
    public b V0;
    public String W;
    public e0 W0;
    public String X;
    public boolean X0;
    public int Y;
    public a Y0;
    public long Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public MusicSearchUiOption c1;
    public static final int d1;

    public void SearchMusicFragment(){
       super();
       this.V = new RealTimeLogger(4);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchMusicFragment$b(this, this);
    }
    public ClientContent$ContentPackage K3(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W0;
       if (obj != null) {
          return obj.Nf();
       }
       return null;
    }
    public boolean Kh(){
       return true;
    }
    public b Oh(){
       return this.V0;
    }
    public String Pd(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.U;
       if (obj != null) {
          return TextUtils.k(obj.h2());
       }
       return "";
    }
    public void Ph(){
       if (PatchProxy.applyVoid(null, this, SearchMusicFragment.class, "26")) {
          return;
       }
       if (this.X0 != null) {
          Object[] objArray = new Object[0];
          k.D().w("music_search_fragment", "music search result page hide", objArray);
          u1.L0(this.W0);
          this.X0 = false;
       }
       return;
    }
    public void Qh(){
       if (PatchProxy.applyVoid(null, this, SearchMusicFragment.class, "13")) {
          return;
       }
       RecyclerFragment tC = this.C;
       if (tC != null) {
          tC.e();
       }
       return;
    }
    public ClientContent$ContentPackage Tg(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W0;
       if (obj != null) {
          return obj.Q3();
       }
       return null;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SearchMusicFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       SearchMusicFragment tc1 = this.c1;
       tc1 = (tc1 != null && tc1.isDarkMode())? 1: 0;
       int i = (tc1)? 2: 0;
       return a.h(p0, 0x7f0d01b6, p1, false, i);
    }
    public String f4(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SearchMusicFragment obj = PatchProxy.apply(objArray, this, SearchMusicFragment.class, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.U;
       if (obj == null) {
          return "";
       }
       d a = d.a;
       String str = TextUtils.k(obj.h2());
       Objects.requireNonNull(a);
       Object obj1 = PatchProxy.applyOneRefs(str, a, d.class, "22");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(str, "keyWord");
          Object obj2 = PatchProxy.applyOneRefs(str, objArray, c.class, "5");
          obj1 = (obj2 != patchProxyRe)? obj2: d.a(str);
          a.o(obj1, "SearchPluginUtil.generateQueryId\(keyWord\)");
       }
       return obj1;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchMusicFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SearchMusicFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.X0 != null) {
          return this.V0.getPageParams();
       }
       return "task_id="+this.W;
    }
    public String getTaskId(){
       Object obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(this.W)) {
          return this.W;
       }
       return "";
    }
    public String getUssid(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.U;
       if (obj != null) {
          return TextUtils.k(obj.i2());
       }
       return "";
    }
    public Context host(){
       Object obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getContext();
    }
    public boolean i0(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.U;
       if (obj != null && !TextUtils.x(obj.h2())) {
          return true;
       }
       this.Ac().setRefreshing(false);
       return false;
    }
    public String je(){
       return "SEARCH_MUSIC_SHOOT";
    }
    public String le(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.U;
       if (obj != null) {
          return TextUtils.k(obj.h2());
       }
       return "";
    }
    public LifecycleOwner lifecycleOwner(){
       return this;
    }
    public String m9(){
       return "USER_INPUT";
    }
    public int md(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.U;
       if (obj != null) {
          return obj.t;
       }
       return 0;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.X0 == null) {
          return super.o();
       }
       Objects.requireNonNull(this.V0);
       return "SEARCH_RESULT_GENERAL";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchMusicFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       k.D().w("music_search_fragment", "on create", objArray);
       this.H = 9999;
       this.J = "ËÑË÷";
       this.G.g(new k(this));
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SearchMusicFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       k.D().w("music_search_fragment", "on destroy", objArray);
       this.V0 = null;
       this.W0 = null;
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(SearchMusicFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchMusicFragment.class, "11")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (this.X0 != null) {
          this.Ph();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       SearchMusicFragment tU;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchMusicFragment.class, "10")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.U = this.q();
       if (this.getArguments() != null) {
          String str = "keyword";
          if (this.getArguments().getString(str) != null) {
             tU = this.U;
             str = this.getArguments().getString(str);
             Objects.requireNonNull(tU);
             if (!PatchProxy.applyVoidOneRefs(str, tU, b.class, "1")) {
                tU.q = str;
                tU.invalidate();
             }
          }
       }
       tU = this.c1;
       if (tU != null && tU.getMusicSearchSource() != -1) {
          tU.u = this.c1.getMusicSearchSource();
       }
       this.C.h(new SearchMusicFragment$a(this));
       this.V.a(this);
       if (this.getArguments() != null) {
          this.W = this.getArguments().getString("photo_task_id");
       }
       FragmentEvent dESTROY_VIEW = FragmentEvent.DESTROY_VIEW;
       f.c(e.class, new l(this), this, dESTROY_VIEW);
       f.c(c.class, new m(this), this, dESTROY_VIEW);
       return;
    }
    public int ug(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.W0;
       if (obj != null) {
          return obj.M();
       }
       return 0;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SearchMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SearchMusicFragment.class, "17")) {
          return;
       }
       super.v2(p0, p1);
       if (this.U.isEmpty()) {
          k.o(new ArrayList(), String.valueOf(this.H), "SHOW_MUSIC_SEARCH_EMPTY_RESULT", 0, this.J, this.W, 1, this.U.i2(), this.U.h2(), null, this);
       }
       if (p0) {
          SearchMusicFragment tX = this.X;
          SearchMusicFragment tY = this.Y;
          String str = this.U.h2();
          if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidThreeRefs(tX, Integer.valueOf(tY), str, null, k.class, "27")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_SEARCH_MUSIC";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("trigger", tX);
             if (tY >= null) {
                jsonObject.a0("sugg_index", Integer.valueOf((tY + 1)));
             }
             jsonObject.c0("keyword", str);
             uElementPack.params = jsonObject.toString();
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
    public g vh(){
       a obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.Hh(), this.N);
       this.Y0 = obj;
       obj.C = t.d(this.getArguments());
       obj.B = this;
       SearchMusicFragment tY0 = this.Y0;
       tY0.D = this.c1;
       return tY0;
    }
    public String w3(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W0;
       if (obj instanceof BaseFragment) {
          return obj.getUrl();
       }
       return "";
    }
    public i yh(){
       b uob = PatchProxy.apply(null, this, SearchMusicFragment.class, "16");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.I);
       }
       return uob;
    }
    public String z(){
       SearchMusicFragment obj = PatchProxy.apply(null, this, SearchMusicFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c1;
       if (obj != null && obj.getMusicSearchSource() != -1) {
          return a.a.a(this.I, this.c1.getMusicSearchSource());
       }
       return "search_entrance_cloud_music";
    }
}
