package com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import lob.f;
import com.yxcorp.plugin.music.player.controller.VSVCloudMusicHelper;
import jqb.m;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kob.m;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.yxcorp.gifshow.music.cloudmusic.common.CategoryMusicFragment;
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
import com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicFragment;
import java.lang.Boolean;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import android.os.Bundle;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import kob.n;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.app.Activity;
import java.util.Objects;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$a;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.RecyclerView;

public abstract class CloudMusicRecyclerFragment extends RecyclerFragment	// class@001fdd
{
    public f F;
    public CloudMusicHelper G;
    public long H;
    public int I;
    public String J;
    public int K;
    public n L;
    public String M;
    public boolean N;
    public final m O;
    public boolean P;

    public void CloudMusicRecyclerFragment(){
       super();
       this.F = new f();
       this.G = new VSVCloudMusicHelper();
       this.O = new m();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, CloudMusicRecyclerFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(this);
    }
    public boolean Dh(){
       return (this.P ^ 0x01);
    }
    public f Gh(){
       return this.F;
    }
    public CloudMusicHelper Hh(){
       return this.G;
    }
    public m Ih(){
       return this.O;
    }
    public void Jh(){
       CloudMusicRecyclerFragment tF = this.F;
       tF.c = this.H;
       tF.e = this.J;
       tF.b = this.G;
       tF.d = this.I;
       tF.g = this.L;
       tF.f = this.K;
       tF.h = this;
    }
    public boolean Kh(){
       return this instanceof CategoryMusicFragment;
    }
    public RecyclerView$n Lh(){
       a obj = PatchProxy.apply(null, this, CloudMusicRecyclerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(1, false, 1);
       b uob = new b();
       uob.v(a.a().a().getResources().getColor(R.color.arg_RES_7f060736));
       uob.n((float)n.c(this.getContext(), 15.00f), 0, (float)n.c(this.getContext(), 15.00f), 0);
       uob.t(this.getContext().getResources().getDimension(R.dimen.arg_RES_7f070195));
       obj.o(uob.a());
       return obj;
    }
    public void Mh(){
       if (PatchProxy.applyVoid(null, this, CloudMusicRecyclerFragment.class, "6")) {
          return;
       }
       this.G.reset();
       return;
    }
    public boolean S0(){
       return false;
    }
    public boolean Xg(){
       return this instanceof SubCategoryMusicFragment;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(CloudMusicRecyclerFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CloudMusicRecyclerFragment.class, "4")) {
          return;
       }
       if (p0) {
          if (this.Kh()) {
             this.O.g(this.G.f());
          }
          this.G.reset();
       }
       super.Z1(p0, p1);
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, CloudMusicRecyclerFragment.class, "5")) {
          return;
       }
       if (this.Kh()) {
          this.O.g(this.G.f());
       }
       this.G.reset();
       return;
    }
    public List fg(){
       Object obj = PatchProxy.apply(null, this, CloudMusicRecyclerFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList(super.fg());
       uArrayList.add(this.F);
       return uArrayList;
    }
    public int getLayoutResId(){
       return 0x7f0d01b6;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CloudMusicRecyclerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CloudMusicRecyclerFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CloudMusicRecyclerFragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.M = this.getArguments().getString("photo_task_id", "");
          this.H = this.getArguments().getLong("category_id", 0);
          this.I = this.getArguments().getInt("enter_type", 0);
          this.J = this.getArguments().getString("category_name", "");
          int i = Integer.MIN_VALUE;
          this.K = this.getArguments().getInt("duration", i);
          this.N = this.getArguments().getBoolean("MUSIC_TEMPLATE_ENTRANCE_ENABLED", 0);
          if (this.K == i) {
             throw new RuntimeException("please transmit duration, args: "+this.getArguments());
          }
       }
       this.L = new n(this.getActivity().getIntent());
       this.G.d(this);
       if (this.Kh()) {
          CloudMusicRecyclerFragment tO = this.O;
          CloudMusicRecyclerFragment tG = this.G;
          Objects.requireNonNull(tO);
          if (!PatchProxy.applyVoidOneRefs(tG, tO, m.class, str)) {
             tO.c = tG;
             tG.g(tO);
          }
          this.O.d(this);
       }
       this.Jh();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CloudMusicRecyclerFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       RecyclerView$n on = this.Lh();
       if (on != null) {
          this.h0().addItemDecoration(on);
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       this.P = true;
    }
}
