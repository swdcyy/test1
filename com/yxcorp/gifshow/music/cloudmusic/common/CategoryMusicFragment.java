package com.yxcorp.gifshow.music.cloudmusic.common.CategoryMusicFragment;
import c35.c;
import com.yxcorp.gifshow.music.cloudmusic.common.TabMusicFragment;
import sob.a;
import com.yxcorp.gifshow.music.util.RealTimeLogger;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.common.CategoryMusicFragment$b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jqb.j;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import lob.f;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Map;
import jqb.k;
import android.os.Bundle;
import pob.a;
import java.lang.IllegalArgumentException;
import java.util.List;
import android.view.View;
import qvb.i;
import com.yxcorp.gifshow.music.cloudmusic.common.c;
import com.yxcorp.gifshow.music.cloudmusic.common.CategoryMusicFragment$a;
import s2b.a;
import s2b.d;
import java.lang.Boolean;
import com.yxcorp.gifshow.music.network.model.response.MusicBanner;
import java.util.Collection;
import ekd.q;
import kob.n;
import com.google.gson.JsonObject;
import java.lang.Integer;
import k2b.e0;
import y8c.g;
import com.yxcorp.gifshow.music.cloudmusic.common.a;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import androidx.recyclerview.widget.f;
import androidx.fragment.app.Fragment;
import q46.t;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import com.kuaishou.android.model.music.Music;

public class CategoryMusicFragment extends TabMusicFragment implements c	// class@001ffe
{
    public c U;
    public f V;
    public final a W;
    public final RealTimeLogger X;
    public a Y;
    public static final int Z;

    public void CategoryMusicFragment(){
       super();
       this.W = new a();
       this.X = new RealTimeLogger(0);
    }
    public t Bh(){
       CategoryMusicFragment$b obj = PatchProxy.apply(null, this, CategoryMusicFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CategoryMusicFragment$b(this, this);
       obj.u((float)j.g);
       return obj;
    }
    public void Jh(){
       if (PatchProxy.applyVoid(null, this, CategoryMusicFragment.class, "5")) {
          return;
       }
       super.Jh();
       this.F.j = this.W;
       return;
    }
    public int M(){
       return 4;
    }
    public void Nh(){
       if (PatchProxy.applyVoid(null, this, CategoryMusicFragment.class, "13")) {
          return;
       }
       super.Nh();
       this.W.a();
       return;
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, CategoryMusicFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getUrl();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CategoryMusicFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CategoryMusicFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 50;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, CategoryMusicFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.g(this.M, this.J, String.valueOf(this.H));
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CategoryMusicFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!this.H) {
          throw new IllegalArgumentException("Illegal Music Category ID.");
       }
       this.Y = new a();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CategoryMusicFragment.class, "15")) {
          return;
       }
       super.onDestroy();
       CategoryMusicFragment tW = this.W;
       _monitor_enter(tW);
       if (PatchProxy.applyVoid(null, tW, a.class, "4")) {
          _monitor_exit(tW);
       }else {
          tW.a.clear();
          _monitor_exit(tW);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, CategoryMusicFragment.class, "4")) {
          return;
       }
       super.onPause();
       this.W.a();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CategoryMusicFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       c uoc = this.q();
       this.U = uoc;
       p1.i = uoc;
       this.C.h(new CategoryMusicFragment$a(this));
       this.X.a(this);
       return;
    }
    public void v2(boolean p0,boolean p1){
       String this;
       if (PatchProxy.isSupport(CategoryMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CategoryMusicFragment.class, "9")) {
          return;
       }
       super.v2(p0, p1);
       if (this.Y != null) {
          this.Y.a(this, this.q().v, true, "OPERATE_BANNER", false);
       }
       if (p0 && !q.f(this.U.W1())) {
          List list = this.U.W1();
          if (!PatchProxy.applyVoidOneRefs(list, this, CategoryMusicFragment.class, "10")) {
             this = String.valueOf(this.H);
             CloudMusicRecyclerFragment tJ = this.J;
             String str = this.L.f();
             JsonObject jsonObject = k.e(this.U.t);
             k ok = k.class;
             if (PatchProxy.isSupport(ok)) {
                Object[] objArray = new Object[]{list,this,tJ,str,Integer.valueOf(1),jsonObject,this};
                if (!PatchProxy.applyVoid(objArray, null, ok, "18")) {
                }
             }else if(q.f(list)){
                k.o(list, this, "SHOW_RECOMMEND_MUSIC", 0, tJ, str, 1, "", null, jsonObject, this);
             }
          }
       }
    label_00a9 :
       return;
    }
    public g vh(){
       a obj = PatchProxy.apply(null, this, CategoryMusicFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.Hh(), this.F, this.V, this.N);
       obj.A = t.d(this.getArguments());
       obj.z = this;
       return obj;
    }
    public i yh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, CategoryMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CloudMusicRecyclerFragment tI = this.I;
       CloudMusicRecyclerFragment tH = this.H;
       CloudMusicRecyclerFragment tJ = this.J;
       MusicRecommendParams musicRecomme = this.L.c();
       if (this.getArguments() != null) {
          objArray = this.getArguments().get("RECORD_FORCE_INSERT_MAGIC_MUSIC");
       }
       c uoc = new c(tI, tH, tJ, musicRecomme, objArray);
       return obj;
    }
    public f zh(){
       f obj = PatchProxy.apply(null, this, CategoryMusicFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.zh();
       this.V = obj;
       return obj;
    }
}
