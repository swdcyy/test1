package com.yxcorp.gifshow.widget.l;
import com.yxcorp.gifshow.player.KsAudioPlayer$c;
import java.lang.Object;
import java.util.HashSet;
import com.yxcorp.gifshow.player.KsAudioPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import java.util.Set;
import yaa.c;
import java.lang.Boolean;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.Music;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import qkd.b;
import com.kuaishou.edit.draft.Song;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.Float;
import com.yxcorp.gifshow.player.KsAudioPlayer$b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Objects;
import tyc.m0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;

public class l implements KsAudioPlayer$c	// class@001992
{
    public KsAudioPlayer a;
    public KsAudioPlayer b;
    public boolean c;
    public Set d;

    public void l(){
       super();
       this.d = new HashSet();
    }
    public void a(KsAudioPlayer p0){
       l ta1;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "25")) {
          return;
       }
       l tb = this.b;
       int i = 0;
       int i1 = (tb == null || tb.i())? 0: this.b.g();
       l ta = this.a;
       if (ta != null && !ta.i()) {
          i = this.a.g();
       }
       if (p0.g() >= Math.max(i1, i)) {
          this.d.clear();
          if (this.c != null) {
             ta1 = this.a;
             if (ta1 != null) {
                this.i(ta1);
             }
          }
          if (this.c != null) {
             ta1 = this.b;
             if (ta1 != null) {
                this.i(ta1);
             }
          }
       }else {
          this.d.add(p0);
       }
       return;
    }
    public final void b(c p0,boolean p1){
       Object[] objArray1;
       File uFile;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ol, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "createAudioPlayerWithDraftByType isRecord:"+p1, objArray);
       Music music = DraftUtils.x(p0, p1);
       if (music == null) {
          objArray1 = new Object[0];
          a.D().w("DraftAudioPlayer", "createAudioPlayerWithDraftByType music is null", objArray1);
          return;
       }else if(TextUtils.x(music.getFile())){
          uFile = null;
       }else {
          uFile = DraftFileManager.E().B(music.getFile(), p0);
       }
       if (b.S(uFile)) {
          this.k(uFile.getAbsolutePath(), p1);
       }else {
          Song song = DraftUtils.B(music);
          if (song == null) {
             i1.c(new RuntimeException("createAudioPlayerWithDraftByType error song is null"));
             return;
          }else {
             File uFile1 = DraftFileManager.E().B(song.getFile(), p0);
             if (!b.S(uFile1)) {
                objArray1 = new Object[0];
                a.D().A("DraftAudioPlayer", "createAudioPlayerWithDraftByType song file does not exist", objArray1);
                return;
             }else {
                this.k(uFile1.getAbsolutePath(), p1);
                TimeRange timeRange = DraftUtils.z(music);
                if (timeRange != null) {
                   this.u((int)(timeRange.getStart() * 0x408f400000000000), p1);
                   this.r((int)(timeRange.getDuration() * 0x408f400000000000), p1);
                }else {
                   this.u(0, p1);
                   this.r(Integer.MAX_VALUE, p1);
                   i1.c(new RuntimeException("changeAudioStateFromDraft error TimeRange is null"));
                }
             }
          }
       }
       float volume = music.getVolume();
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(volume), Boolean.valueOf(p1), this, ol, "21")) {
          objArray = new Object[0];
          a.D().w("DraftAudioPlayer", "setVolume volume:"+volume+",isRecord:"+p1+"mRecordPlayer:"+this.b+",mMusicPlayer:"+this.a, objArray);
          if (p1) {
             ol = this.b;
             if (ol != null) {
                ol.u(volume);
             }
          }
          if (!p1) {
             l ta = this.a;
             if (ta != null) {
                ta.u(volume);
             }
          }
       }
    label_0137 :
       this.q((music.getDisableLoop() ^ 0x01));
       this.d();
       objArray1 = new Object[0];
       a.D().w("DraftAudioPlayer", "createAudioPlayerWithNewMusicFile success", objArray1);
       return;
    }
    public final boolean c(KsAudioPlayer$b p0,KsAudioPlayer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.g(p0) && this.f(p1)) {
          return b;
       }
       if (this.g(p0) || this.f(p1)) {
          return true;
       }
       boolean b1 = (!TextUtils.x(p0.b) && !TextUtils.x(p1.f()))? TextUtils.n(p0.b, p1.f()): false;
       boolean b2 = (!TextUtils.x(p0.a) && !TextUtils.x(p1.e()))? TextUtils.n(p0.a, p1.e()): false;
       if (!b1 && !b2) {
          b = true;
       }
       return b;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "init mRecordPlayer:"+this.b+",mMusicPlayer:"+this.a, objArray);
       l tb = this.b;
       if (tb != null) {
          tb.h();
       }
       tb = this.a;
       if (tb != null) {
          tb.h();
       }
       this.d.clear();
       return;
    }
    public void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       if (p0.J0() == null) {
          return;
       }
       this.b(p0.J0(), true);
       this.b(p0.J0(), false);
       return;
    }
    public final boolean f(KsAudioPlayer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || (TextUtils.x(p0.f()) && TextUtils.x(p0.e())))? true: false;
       return b;
    }
    public final boolean g(KsAudioPlayer$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || (TextUtils.x(p0.b) && TextUtils.x(p0.a)))? true: false;
       return b;
    }
    public boolean h(){
       boolean b;
       l obj = PatchProxy.apply(null, this, l.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj == null || !obj.k()) {
          obj = this.b;
          if (obj == null || !obj.k()) {
             b = false;
          label_002b :
             return b;
          }
       }
       b = true;
       goto label_002b ;
    }
    public final void i(KsAudioPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "26")) {
          return;
       }
       if (PostExperimentUtils.X0()) {
          Objects.requireNonNull(p0);
          k1.r(new m0(p0), 100);
       }else {
          p0.v();
       }
       return;
    }
    public final void j(String p0,int p1,int p2,boolean p3,float p4){
       l tb;
       Object[] objArray2;
       KsAudioPlayer ksAudioPlaye;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ol, "5")) {
             return;
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("DraftAudioPlayer", "newAudioPlayerByType audioFilePath:"+p0+",isRecord:"+p3+",startTime:"+p1+",duration:"+p2, objArray1);
       if (p3) {
          tb = this.b;
          if (tb != null) {
             tb.n();
             objArray2 = new Object[0];
             a.D().w("DraftAudioPlayer", "newAudioPlayerByType audio player released", objArray2);
          }
          ksAudioPlaye = new KsAudioPlayer(p0, p1, p2, p4);
          this.b = ksAudioPlaye;
          ksAudioPlaye.r(this);
       }else {
          tb = this.a;
          if (tb != null) {
             tb.n();
             objArray2 = new Object[0];
             a.D().w("DraftAudioPlayer", "newAudioPlayerByType music player released", objArray2);
          }
          ksAudioPlaye = new KsAudioPlayer(p0, p1, p2, p4);
          this.a = ksAudioPlaye;
          ksAudioPlaye.r(this);
       }
       return;
    }
    public final void k(String p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ol, "4")) {
          return;
       }
       this.j(p0, 0, Integer.MAX_VALUE, p1, 0x3f800000);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, l.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "pause mRecordPlayer:"+this.b+",mMusicPlayer:"+this.a, objArray);
       l tb = this.b;
       if (tb != null) {
          tb.l();
       }
       tb = this.a;
       if (tb != null) {
          tb.l();
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, l.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "release mRecordPlayer:"+this.b+",mMusicPlayer:"+this.a, objArray);
       this.n(0);
       this.n(true);
       return;
    }
    public void n(boolean p0){
       Object[] objArray;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "17")) {
          return;
       }
       int i = 0;
       if (p0 && this.a != null) {
          objArray = new Object[i];
          a.D().w("DraftAudioPlayer", "release mMusicPlayer:"+this.a, objArray);
          this.a(this.a);
          this.a.n();
          this.d.remove(this.a);
          this.a = null;
       }else if(!p0 && this.b != null){
          objArray = new Object[i];
          a.D().w("DraftAudioPlayer", "release mRecordPlayer:"+this.b, objArray);
          this.a(this.b);
          this.b.n();
          this.d.remove(this.b);
          this.b = null;
       }
       return;
    }
    public KsAudioPlayer o(KsAudioPlayer p0,KsAudioPlayer$b p1,boolean p2){
       KsAudioPlayer$b obj;
       if (PatchProxy.isSupport(l.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, l.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 != null && (TextUtils.x(p1.b) || !b.S(new File(p1.a)))) {
          if (p0 != null) {
             p0.n();
             p0 = null;
          }
          return p0;
       }else if(p0 == null || this.c(p1, p0)){
          if (p0 != null) {
             p0.n();
          }
          p0 = new KsAudioPlayer(p1.a, p1.c, p1.d, p1.e);
          p0.h = p1.b;
          p0.r(this);
          p0.h();
          return p0;
       }else {
          obj = p1.c;
          if (obj != p0.b) {
             p0.t(obj);
          }
          if (p1.e - p0.e) {
             p0.u(p1.e);
          }
          if (!p2 && p1.d != p0.g()) {
             p0.q(p1.d);
          }
          return p0;
       }
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, l.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "seekToStart mRecordPlayer:"+this.b+",mMusicPlayer:"+this.a, objArray);
       l tb = this.b;
       if (tb != null) {
          tb.p();
       }
       tb = this.a;
       if (tb != null) {
          tb.p();
       }
       return;
    }
    public void q(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "setAudioLoop audioLoop:"+p0, objArray);
       this.c = p0;
       return;
    }
    public void r(int p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ol, "23")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "setDuration duration:"+p0+",isRecord:"+p1+"mRecordPlayer:"+this.b+",mMusicPlayer:"+this.a, objArray);
       if (p1) {
          ol = this.b;
          if (ol != null) {
             ol.q(p0);
          }else if(!p1){
             l ta = this.a;
             if (ta != null) {
                ta.q(p0);
             }
          }
       }else {
          goto label_005c ;
       }
       return;
    }
    public void s(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "setMusicMuted muted:"+p0+",mMusicPlayer:"+this.a, objArray);
       ol = this.a;
       if (ol != null) {
          ol.s(p0);
       }
       return;
    }
    public void t(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "19")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "setMuted muted:"+p0+",mRecordPlayer:"+this.b, objArray);
       ol = this.b;
       if (ol != null) {
          ol.s(p0);
       }
       return;
    }
    public final void u(int p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ol, "22")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "setStartTime startTime:"+p0+",isRecord:"+p1+"mRecordPlayer:"+this.b+",mMusicPlayer:"+this.a, objArray);
       if (p1) {
          ol = this.b;
          if (ol != null) {
             ol.t(p0);
          }else if(!p1){
             l ta = this.a;
             if (ta != null) {
                ta.t(p0);
             }
          }
       }else {
          goto label_005c ;
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, l.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("DraftAudioPlayer", "start mRecordPlayer:"+this.b+",mMusicPlayer:"+this.a, objArray);
       l tb = this.b;
       if (tb != null && !this.d.contains(tb)) {
          this.b.v();
       }
       tb = this.a;
       if (tb != null && !this.d.contains(tb)) {
          this.a.v();
       }
       return;
    }
}
