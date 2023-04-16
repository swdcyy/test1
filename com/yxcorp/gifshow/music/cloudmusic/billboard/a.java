package com.yxcorp.gifshow.music.cloudmusic.billboard.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.cloudmusic.billboard.model.BillboardMusic;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.List;
import com.kuaishou.android.model.music.Music;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import mob.a;
import android.view.View$OnClickListener;
import ekd.p0;
import e17.i;
import android.app.Activity;
import android.content.Intent;
import okd.b;
import ipb.a;
import java.lang.Boolean;
import n3d.d;
import jqb.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMusicDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import k2b.b2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.StringBuilder;
import k2b.u1;

public class a extends PresenterV2	// class@001ff1
{
    public View A;
    public View B;
    public SizeAdjustableTextView C;
    public SizeAdjustableTextView D;
    public SizeAdjustableTextView E;
    public BillboardMusic p;
    public int q;
    public int r;
    public KwaiImageView s;
    public View t;
    public View u;
    public View v;
    public SizeAdjustableTextView w;
    public SizeAdjustableTextView x;
    public SizeAdjustableTextView y;
    public View z;
    public static final int F;

    static {
       a.F = n.c(a.b(), 100.00f);
    }
    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.s.V(this.p.mImages, a.F, a.F);
       BillboardMusic mMusic = this.p.mMusic;
       a uoa = this;
       uoa.P8(this.R8(mMusic, 0), this.t, this.w, this.z, this.C);
       uoa.P8(this.R8(mMusic, 1), this.u, this.x, this.A, this.D);
       uoa.P8(this.R8(mMusic, 2), this.v, this.y, this.B, this.E);
       return;
    }
    public final void P8(Music p0,View p1,TextView p2,View p3,TextView p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             return;
          }
       }
       if (p0 == null) {
          p1.setVisibility(8);
          return;
       }else {
          p1.setVisibility(0);
          if (TextUtils.x(p0.mName)) {
             p2.setVisibility(8);
          }else {
             p2.setText(p0.mName);
          }
          if (TextUtils.x(p0.mArtist)) {
             p3.setVisibility(8);
             p4.setVisibility(8);
          }else {
             p4.setText(p0.mArtist);
          }
          return;
       }
    }
    public final Music R8(List p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && (p1 >= p0.size() || p1 < 0)) {
          return null;
       }else {
          return p0.get(p1);
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0434);
       this.y = m1.f(p0, 0x7f0a2d1d);
       this.w = m1.f(p0, 0x7f0a2d19);
       this.z = m1.f(p0, 0x7f0a0a49);
       this.C = m1.f(p0, 0x7f0a024c);
       this.t = m1.f(p0, 0x7f0a4001);
       this.u = m1.f(p0, 0x7f0a401a);
       this.D = m1.f(p0, 0x7f0a024e);
       this.A = m1.f(p0, 0x7f0a0a4b);
       this.E = m1.f(p0, 0x7f0a024d);
       this.v = m1.f(p0, 0x7f0a4015);
       this.B = m1.f(p0, 0x7f0a0a4a);
       this.x = m1.f(p0, 0x7f0a2d1f);
       m1.a(p0, new a(this), R.id.item_root);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(BillboardMusic.class);
       this.q = this.r8("REQUEST_DURATION").intValue();
       this.r = this.r8("COULD_MUSIC_ENTER_TYPE").intValue();
       return;
    }
    public void onClick(View p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       if (!p0.C(p0.getContext())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          return;
       }else {
          Intent intent = this.getActivity().getIntent();
          b.a(-874179722).Q(this.getActivity(), this.r, this.q).d0(this.p.mName).I(this.p.mType).b(true).W(Boolean.TRUE).g(intent.getStringExtra("deliver_video_project")).f(intent.getStringExtra("background")).K(1001).h();
          a tp = this.p;
          if (PatchProxy.applyVoidOneRefs(tp, null, k.class, "30") || (tp != null && tp.mMusic != null)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.name = "SELECT_MUSIC_LIST";
             uElementPack.type = 1;
             uElementPack.status = 1;
             uElementPack.action = 903;
             i = tp.mMusic.size();
             ClientContent$BatchMusicDetailPackage uBatchMusicD = new ClientContent$BatchMusicDetailPackage();
             ClientContent$MusicDetailPackage[] musicDetailP = new ClientContent$MusicDetailPackage[tp.mMusic.size()];
             uBatchMusicD.musicDetailPackage = musicDetailP;
             for (int i1 = 0; i1 < i; i1 = i2) {
                ClientContent$MusicDetailPackage musicDetailP1 = b2.a(tp.mMusic.get(i1));
                int i2 = i1 + 1;
                musicDetailP1.index = i2;
                uBatchMusicD.musicDetailPackage[i1] = musicDetailP1;
             }
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.batchMusicDetailPackage = uBatchMusicD;
             u1.M0("name="+tp.mName+"&id="+tp.mType);
             u1.u(true, uElementPack, uContentPack);
          }
       label_00f2 :
          return;
       }
    }
}
