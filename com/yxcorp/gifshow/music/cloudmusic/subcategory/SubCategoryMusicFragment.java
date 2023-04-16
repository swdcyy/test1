package com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragmentV2;
import com.yxcorp.gifshow.music.util.RealTimeLogger;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kob.m;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$n;
import z8c.a;
import bld.b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import android.graphics.drawable.Drawable;
import kqb.d0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import java.util.Map;
import java.lang.StringBuilder;
import jqb.k;
import android.os.Bundle;
import com.yxcorp.plugin.music.player.controller.VSVCloudMusicHelper;
import pob.a;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import android.view.View;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import ipb.c;
import s2b.a;
import s2b.d;
import java.lang.Boolean;
import qvb.i;
import oob.c;
import com.yxcorp.gifshow.music.network.model.response.MusicBanner;
import y8c.g;
import oob.b;
import mob.b;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import kob.n;

public class SubCategoryMusicFragment extends CloudMusicRecyclerFragmentV2	// class@00203f
{
    public RealTimeLogger U;
    public int V;
    public String W;
    public a X;

    public void SubCategoryMusicFragment(){
       super();
       this.U = new RealTimeLogger(0);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SubCategoryMusicFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(this);
    }
    public boolean Kh(){
       return true;
    }
    public RecyclerView$n Lh(){
       a obj = PatchProxy.apply(null, this, SubCategoryMusicFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.V <= null) {
          return super.Lh();
       }
       obj = new a();
       b uob = new b();
       uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060736));
       uob.n((float)n.c(this.getContext(), 15.00f), 0, (float)n.c(this.getContext(), 15.00f), 0);
       uob.t(this.getContext().getResources().getDimension(R.dimen.arg_RES_7f070195));
       obj.o(uob.a());
       obj.r(d0.e, 0, 0);
       return obj;
    }
    public int M(){
       return 4;
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, SubCategoryMusicFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
       tagPackage.name = this.J;
       obj.tagPackage = tagPackage;
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d1026;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SubCategoryMusicFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SubCategoryMusicFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       int i = (this.V > null)? 140: 0x7d95;
       return i;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, SubCategoryMusicFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.V > null) {
          return "type:"+this.V;
       }
       return k.g(this.M, this.J, String.valueOf(this.H));
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubCategoryMusicFragment.class, "1")) {
          return;
       }
       this.G = new VSVCloudMusicHelper();
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.V = this.getArguments().getInt("sub_category_type", 0);
          this.W = this.getArguments().getString("sub_title_name", "");
       }
       if (this.V > null) {
          this.H = -5;
       }
       this.X = new a();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, SubCategoryMusicFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       this.G.release();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubCategoryMusicFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, SubCategoryMusicFragment.class, "3")) {
          this.getView().findViewById(R.id.title_root).setVisibility(8);
       }
       p0.findViewById(R.id.recycler_view).setVerticalScrollBarEnabled(false);
       if (!PatchProxy.applyVoid(null, this, SubCategoryMusicFragment.class, "4")) {
          this.C.h(new c(this));
          this.U.a(this);
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(SubCategoryMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, SubCategoryMusicFragment.class, "6")) {
          return;
       }
       super.v2(p0, p1);
       this.X.a(this, this.q().w, false, null, true);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, SubCategoryMusicFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.V > null) {
          return new b(this.Hh(), this.V, this.N);
       }
       return new b(this.Hh(), this.N);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, SubCategoryMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.V > null) {
          return new b(this.V);
       }
       c uoc = new c(this.I, this.H, this.J, this.L.c());
       return obj;
    }
}
