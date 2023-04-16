package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$a;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$b;
import android.os.Handler;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$c;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$d;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$e;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$f;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mwc.p;
import android.widget.SeekBar;
import com.yxcorp.gifshow.music.KaraokeDoubleSeekBar;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.music.IndicatorSeekBar;
import com.yxcorp.widget.selector.view.SelectShapeImageView;
import erc.d;
import android.view.View$OnClickListener;
import java.lang.Integer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.work.c;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.yxcorp.gifshow.music.KaraokeDoubleSeekBar$a;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.util.List;
import java.util.Arrays;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import erc.b;
import android.widget.ImageView;
import erc.c;
import erc.j;
import com.yxcorp.gifshow.util.resource.Category;
import java.util.Objects;
import brd.t;
import kotlin.jvm.internal.a;
import erc.h;
import java.util.concurrent.Callable;
import erc.i;
import erd.o;
import t45.d;
import brd.z;
import crd.b;

public class KtvEditVolumeFragment extends BaseFragment implements d	// class@000ffc
{
    public KaraokeDoubleSeekBar$a A;
    public KaraokeDoubleSeekBar$a B;
    public c$c C;
    public SlipSwitchButton$b D;
    public IndicatorSeekBar j;
    public IndicatorSeekBar k;
    public SlipSwitchButton l;
    public KaraokeDoubleSeekBar m;
    public KaraokeDoubleSeekBar n;
    public SelectShapeImageView o;
    public SelectShapeImageView p;
    public TextView q;
    public c r;
    public boolean s;
    public i t;
    public a u;
    public KtvInfo v;
    public SeekBar$OnSeekBarChangeListener w;
    public SeekBar$OnSeekBarChangeListener x;
    public Handler y;
    public Runnable z;
    public static final int E;

    public void KtvEditVolumeFragment(){
       super();
       this.w = new KtvEditVolumeFragment$a(this);
       this.x = new KtvEditVolumeFragment$b(this);
       this.y = new Handler();
       this.z = new KtvEditVolumeFragment$c(this);
       this.A = new KtvEditVolumeFragment$d(this);
       this.B = new KtvEditVolumeFragment$e(this);
       this.C = new KtvEditVolumeFragment$f(this);
       this.D = new KtvEditVolumeFragment$g(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, KtvEditVolumeFragment.class, "11")) {
          return;
       }
       this.j.setProgress(p.a().a);
       this.k.setProgress(p.a().b);
       this.m.setProgress(p.a().g);
       this.n.setProgress(p.a().h);
       this.l.setSwitch(p.a().c);
       this.ch();
       return;
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, KtvEditVolumeFragment.class, "10")) {
          return;
       }
       int progress = this.m.getProgress();
       int i = 0;
       if (progress > 0) {
          this.q.setVisibility(i);
          this.q.setText(a1.q(R.string.arg_RES_7f101b91, progress));
       }else if(progress < 0){
          this.q.setVisibility(i);
          this.q.setText(a1.q(R.string.arg_RES_7f101b90, (- progress)));
       }else {
          this.q.setVisibility(4);
       }
       p.a().g = progress;
       return;
    }
    public void dh(Minecraft$AudioFilterParam p0,boolean p1){
       if (PatchProxy.isSupport(KtvEditVolumeFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, KtvEditVolumeFragment.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setEnableDenoise(p1);
       p0.setDenoiseModelDir(p.c());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvEditVolumeFragment.class, "1")) {
          return;
       }
       this.k = m1.f(p0, 0x7f0a1647);
       this.l = m1.f(p0, 0x7f0a1638);
       this.j = m1.f(p0, 0x7f0a1649);
       this.m = m1.f(p0, 0x7f0a0e6c);
       this.n = m1.f(p0, 0x7f0a3ee0);
       this.p = m1.f(p0, 0x7f0a163f);
       this.o = m1.f(p0, 0x7f0a1641);
       this.q = m1.f(p0, 0x7f0a4494);
       m1.a(p0, new d(this), R.id.switch_btn_label);
       return;
    }
    public void eh(Minecraft$AudioFilterParam p0,int p1){
       if (PatchProxy.isSupport(KtvEditVolumeFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KtvEditVolumeFragment.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.setTimbre(p1);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KtvEditVolumeFragment.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d04d4, p1, false);
       this.doBindView(view);
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KtvEditVolumeFragment.class, "4")) {
          return;
       }
       KtvEditVolumeFragment tr = this.r;
       if (tr != null) {
          tr.n(this.C);
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KtvEditVolumeFragment.class, "8")) {
          return;
       }
       KtvEditVolumeFragment tr = this.r;
       if (tr != null) {
          tr.n(this.C);
       }
       super.onDestroyView();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvEditVolumeFragment.class, "7")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.j.c(this.w);
       this.k.c(this.x);
       this.m.setOnSeekBarChangeListener(this.A);
       this.n.setOnSeekBarChangeListener(this.B);
       this.l.setOnSwitchChangeListener(this.D);
       String[] stringArray = new String[]{"voice_detect","mmu"};
       List list = Arrays.asList(stringArray);
       PluginDownloadExtension k = PluginDownloadExtension.k;
       k.b(list);
       k.t(list, 40);
       this.r = Dva.instance().getPluginInstallManager().k(list).a(this.C);
       this.p.setOnClickListener(new b(this));
       this.o.setOnClickListener(new c(this));
       this.a();
       if (!PatchProxy.applyVoid(null, this, KtvEditVolumeFragment.class, "9")) {
          j a = j.a;
          Category dENOISE_MODE = Category.DENOISE_MODEL;
          Objects.requireNonNull(a);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          t ot = PatchProxy.applyOneRefs(dENOISE_MODE, a, j.class, "1");
          if (ot != patchProxyRe) {
          }else {
             a.p(dENOISE_MODE, "category");
             t ot1 = PatchProxy.applyOneRefs(dENOISE_MODE, a, j.class, "2");
             if (ot1 != patchProxyRe) {
             }else {
                ot1 = t.fromCallable(new h(dENOISE_MODE));
                a.o(ot1, "Observable.fromCallable ¡­FileExist\(category\)\n    }");
             }
             ot = ot1.flatMap(new i(dENOISE_MODE));
             a.o(ot, "hasModelCache\(category\)\n¡­ry\)\n          }\n        }");
          }
          ot.subscribeOn(d.c).subscribe();
       }
       return;
    }
}
