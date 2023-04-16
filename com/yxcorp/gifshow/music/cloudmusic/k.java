package com.yxcorp.gifshow.music.cloudmusic.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.media.MediaPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.music.cloudmusic.RecordSelectMusicData;
import kob.k;
import java.lang.Throwable;
import w46.b;
import lob.y0;
import android.media.MediaPlayer$OnPreparedListener;
import lob.u0;
import android.media.MediaPlayer$OnCompletionListener;
import lnc.ha;
import com.yxcorp.gifshow.util.PostUtils;
import uzc.b;
import android.view.ViewStub;
import android.view.View;
import android.widget.LinearLayout;
import com.kwai.library.widget.specific.misc.PlayBackView;
import com.kwai.library.widget.textview.AlwaysMarqueeTextView;
import com.kwai.library.widget.specific.misc.SpectrumView;
import android.widget.RelativeLayout;
import com.kuaishou.android.model.music.Music;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import lnc.a1;
import lob.i1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import jd.c;
import ub.b;
import wb5.g;
import android.view.ViewTreeObserver;
import lob.h1;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import lob.a1;
import android.view.View$OnClickListener;
import lob.z0;
import lob.b1;
import lob.d1;
import lob.f1;
import erd.g;
import crd.b;
import brd.t;
import lob.w0;
import lob.g1;
import com.trello.rxlifecycle3.components.support.RxFragment;
import lob.e1;
import lob.v0;
import yob.e;
import lob.c1;
import com.trello.rxlifecycle3.android.FragmentEvent;
import eoc.f;
import im8.f;
import jqb.p;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import k2b.u1;
import ekd.y0;
import lob.x0;
import java.lang.Runnable;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout$LayoutParams;
import ekd.m1;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;

public class k extends PresenterV2	// class@002023
{
    public View A;
    public RelativeLayout B;
    public MediaPlayer C;
    public boolean D;
    public b E;
    public boolean F;
    public y0 G;
    public ViewStub p;
    public ViewPager q;
    public t r;
    public t s;
    public MusicFragment t;
    public RecordSelectMusicData u;
    public f v;
    public LinearLayout w;
    public PlayBackView x;
    public AlwaysMarqueeTextView y;
    public SpectrumView z;

    public void k(){
       super();
       this.C = new MediaPlayer();
       this.D = false;
       this.G = null;
    }
    public void E8(){
       RecordSelectMusicData mMusic;
       String str;
       ClientContent$ContentPackage uContentPack;
       ClientEvent$ElementPackage uElementPack;
       ClientEvent$UrlPackage urlPackage;
       b uob;
       int i;
       KwaiImageView kwaiImageVie;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "3")) {
          return;
       }
       if (this.u.mMusic == null) {
          return;
       }
       FragmentEvent uFragmentEve = null;
       if (!PatchProxy.applyVoid(objArray, this, ok, "9")) {
          try{
             this.C.setDataSource(this.u.mMusicPath);
          }catch(java.io.IOException e0){
             Object[] objArray1 = new Object[uFragmentEve];
             k.D().u("RecordSelectMusicPresenter", new Throwable("RecordSelectMusicPresenter init player error"), objArray1);
          }
          this.C.setOnPreparedListener(new y0(this));
          k tC = this.C;
          u0 ou0 = new u0(this);
          try{
             tC.setOnCompletionListener(ou0);
             this.C.prepareAsync();
          }catch(java.lang.Exception e3){
             String str1 = "RecordSelectMusicPresenter prepareAsync error";
             ha.a(str1);
             PostUtils.D("RecordSelectMusicPresenter", str1, e3);
          }
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.D = false;
       this.C.release();
       k tG = this.G;
       if (tG != null) {
          tG.e();
       }
       this.z.b();
       return;
    }
    public final void P8(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "8")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.q.getLayoutParams();
       layoutParams.bottomMargin = a1.e((float)p0);
       this.q.setLayoutParams(layoutParams);
       return;
    }
    public final int R8(){
       k tu = this.u;
       int i = (tu.mMusicPathIsWholeFile != null)? (int)tu.mMusicStartMills: 0;
       return i;
    }
    public final void S8(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "17")) {
          return;
       }
       PostUtils.D("RecordSelectMusicPresenter", p0, p1);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, k.class, "14")) {
          return;
       }
       this.D = false;
       this.C.pause();
       this.z.b();
       k tG = this.G;
       if (tG != null) {
          tG.e();
       }
       this.x.d();
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, k.class, "10")) {
          return;
       }
       k tG = this.G;
       if (tG != null) {
          tG.d();
       }
       this.C.seekTo(this.R8());
       this.C.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a444e);
       this.p = m1.f(p0, 0x7f0a34b7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.r = this.r8("RECORD_SELECT_MUSIC_UPDATE");
       this.s = this.r8("MUSIC_SEARCH_FRAGMENT");
       this.t = this.r8("MUSIC_FRAGMENT");
       this.u = this.r8("RECORD_SELECT_MUSIC_DATA");
       this.v = this.x8("TASK_ID");
       return;
    }
}
