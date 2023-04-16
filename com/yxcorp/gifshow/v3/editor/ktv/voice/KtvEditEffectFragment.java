package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditEffectFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import ppb.a;
import com.yxcorp.gifshow.v3.editor.i;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import uaa.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import oa0.a;
import mwc.p;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditEffectFragment$a;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaGridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;

public class KtvEditEffectFragment extends BaseFragment implements d	// class@000ff2
{
    public RecyclerView j;
    public List k;
    public KtvEditEffectFragment$a l;
    public i m;
    public a n;
    public KtvInfo o;

    public void KtvEditEffectFragment(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, KtvEditEffectFragment.class, "5")) {
          return;
       }
       this.l.k0();
       return;
    }
    public final void ch(Minecraft$AudioFilterParam p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvEditEffectFragment.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p1.c == null) {
          p0.setAudioChangeType(p1.d);
       }else {
          p0.setAudioEffectType(p1.d);
       }
       return;
    }
    public void dh(i p0){
       this.m = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvEditEffectFragment.class, "1")) {
          return;
       }
       this.j = m1.f(p0, 0x7f0a34da);
       return;
    }
    public void eh(a p0){
       this.n = p0;
    }
    public void fh(KtvInfo p0){
       this.o = p0;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvEditEffectFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.k = new ArrayList(a.a(this.getArguments().getInt("EFFECT_TYPE", 0)));
       int i = a.Q();
       if (i != -1 && a.b(i) != null) {
          p.a().k(i);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KtvEditEffectFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d04d3, p1, false);
       this.doBindView(view);
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvEditEffectFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.l = new KtvEditEffectFragment$a(this);
       this.j.setLayoutManager(new NpaGridLayoutManager(this.getContext(), 5));
       this.j.setAdapter(this.l);
       return;
    }
}
