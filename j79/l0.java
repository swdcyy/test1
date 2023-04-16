package j79.l0;
import androidx.lifecycle.ViewModel;
import java.util.List;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import ga9.c;
import w69.d;
import w69.f;
import w69.k;
import android.os.Bundle;
import ha9.c;
import java.util.ArrayList;
import java.util.HashMap;
import androidx.lifecycle.MutableLiveData;
import java.lang.Float;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import java.util.Collection;
import o79.b;
import w69.k$a;
import q79.d;
import r79.c;
import o79.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import android.util.Pair;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import g79.a;
import w69.x;
import ekd.q;
import com.yxcorp.gifshow.album.preview.h;
import java.util.Comparator;
import java.util.Collections;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import e17.s;
import android.app.Application;
import o79.q;
import java.lang.Long;
import o79.i;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import androidx.lifecycle.LiveData;
import java.lang.Number;
import w69.n0;

public class l0 extends ViewModel	// class@002780
{
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final Bundle E;
    public final b F;
    public PublishSubject G;
    public PublishSubject H;
    public PublishSubject I;
    public PublishSubject J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public d O;
    public c a;
    public ArrayList b;
    public List c;
    public c d;
    public Map e;
    public Map f;
    public o0 g;
    public MutableLiveData h;
    public MutableLiveData i;
    public Boolean j;
    public MediaPreviewInfo k;
    public final MutableLiveData l;
    public int m;
    public c n;
    public d o;
    public AlbumLimitOption p;
    public f q;
    public k r;
    public int s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public void l0(List p0,int p1,int p2,List p3,int p4,boolean p5,AlbumLimitOption p6,c p7,d p8,f p9,k p10,List p11,int p12,boolean p13,boolean p14,boolean p15,Bundle p16){
       Object obj;
       l0 ol0 = this;
       int i = p1;
       AlbumLimitOption uAlbumLimitO = p6;
       List list = p11;
       super();
       ol0.a = new c();
       ol0.b = new ArrayList();
       ol0.c = new ArrayList();
       ol0.d = new c();
       ol0.e = new HashMap(2);
       ol0.f = new HashMap(2);
       Float uFloat = Float.valueOf(0xbf800000);
       ol0.h = new MutableLiveData(uFloat);
       ol0.i = new MutableLiveData(uFloat);
       ol0.j = Boolean.TRUE;
       int i1 = 0;
       MutableLiveData mutableLiveD = new MutableLiveData(Integer.valueOf(i1));
       ol0.l = mutableLiveD;
       ol0.G = PublishSubject.g();
       ol0.H = PublishSubject.g();
       ol0.I = PublishSubject.g();
       ol0.J = PublishSubject.g();
       ol0.K = i1;
       ol0.L = i1;
       ol0.M = i1;
       ol0.N = i1;
       Log.d("PreviewBug", "MediaPreviewViewModel index: "+p1+" mediaList: "+p0.size());
       ol0.a.r(p0);
       l0 ol01 = l0.class;
       if (PatchProxy.isSupport(ol01)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, ol01, "1");
          if (obj != PatchProxyResult.class) {
          label_00dc :
             ol0.k = obj;
             ol0.m = p2;
             ol0.c.addAll(p3);
             ol0.t = p6.j();
             ol0.u = p6.f();
             ol0.v = (long)p6.l();
             ol0.s = p4;
             ol0.w = p6.q();
             ol0.x = p6.h();
             ol0.y = p6.n();
             ol0.z = p6.s();
             b uob = new b(uAlbumLimitO, new k$a().b());
             ol0.F = uob;
             uob.a = p12;
             ol0.n = p7;
             ol0.o = p8;
             ol0.p = uAlbumLimitO;
             ol0.q = p9;
             ol0.r = p10;
             ol0.A = p5;
             ol0.C = p13;
             ol0.D = p14;
             if (list) {
                ol0.d.r(list);
             }
             ol0.B = p15;
             ol0.E = p16;
             return;
          }
       }
       if (i < 0) {
          i = null;
       }
       if (i >= ol0.a.u()) {
          i = ol0.a.u() - 1;
       }
       mutableLiveD.setValue(Integer.valueOf(i));
       obj = ol0.a.s(i);
       goto label_00dc ;
    }
    public c A0(){
       return this.a;
    }
    public List C0(){
       return this.c;
    }
    public List D0(){
       Object obj = PatchProxy.apply(null, this, l0.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.t();
    }
    public c E0(){
       return this.d;
    }
    public c F0(){
       return this.n;
    }
    public boolean G0(){
       l0 obj = PatchProxy.apply(null, this, l0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.O;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       List list = obj.m();
       if (list != null && !list.isEmpty()) {
          b = true;
       }
       return b;
    }
    public boolean H0(){
       Object obj = PatchProxy.apply(null, this, l0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.k.isSelected();
    }
    public boolean I0(){
       return this.L;
    }
    public boolean J0(){
       return this.B;
    }
    public void K0(boolean p0){
       Iterator iterator;
       Map$Entry uEntry;
       Object[] objArray;
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol0, "3")) {
          return;
       }
       String str = (p0)? "close": "pick_"+this.k.getMedia().getTypeLoggerStr();
       l0 te = this.e;
       l0 tf = this.f;
       if (!PatchProxy.applyVoidThreeRefs(str, te, tf, null, d.class, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 406;
          uElementPack.name = str;
          int i = 1;
          uElementPack.type = i;
          ArrayList uArrayList = new ArrayList(4);
          int i1 = 0;
          if (te != null) {
             iterator = te.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                objArray = new Object[i];
                objArray[i1] = uEntry.getKey();
                uArrayList.add(new Pair(String.format("select_%s_cnt", objArray), uEntry.getValue()));
             }
          }
          if (tf != null) {
             iterator = tf.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                objArray = new Object[i];
                objArray[i1] = uEntry.getKey();
                uArrayList.add(new Pair(String.format("cancel_%s_cnt", objArray), uEntry.getValue()));
             }
          }
          uElementPack.params = d.h(uArrayList);
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          uClickEvent.type = i;
          uClickEvent.elementPackage = uElementPack;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          uClickEvent.urlPackage = urlPackage;
          urlPackage.params = "task_id="+d.a;
          a.c.f().e(uClickEvent);
       }
       if (q.f(this.b)) {
          this.G.onNext(new Object());
          return;
       }else {
          Collections.sort(this.b, h.b);
          this.G.onNext(new Object());
          return;
       }
    }
    public void L0(){
       int b;
       q a;
       l0 ol0 = l0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol0, "8")) {
          return;
       }
       ArrayList obj = PatchProxy.apply(objArray, this, ol0, "12");
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.m >= this.p.d()){
          if (!TextUtils.x(this.F.e())) {
             s.h(this.F.e());
          }else {
             Object[] objArray1 = new Object[i];
             objArray1[0] = String.valueOf(this.p.d());
             s.h(a.c.b().getString(R.string.arg_RES_7f10188e, objArray1));
          }
       }else if(q.j(this.k.getMedia())){
          if (this.k.getMedia().getDuration() - this.u > 0) {
             if (!TextUtils.x(this.F.h())) {
                s.h(this.F.h());
             }
             d.r(false, this.k.getMedia().getDuration());
          }else if(this.k.getMedia().getDuration() - this.v < 0){
             if (!TextUtils.x(this.F.d())) {
                s.h(this.F.d());
             }
             d.r(false, this.k.getMedia().getDuration());
          }
       }
       l0 ol01 = null;
       if (this.w - ol01 > 0 && this.k.getMedia().getSize() - this.w < 0) {
          if (!TextUtils.x(this.F.c())) {
             s.h(this.F.c());
          }
       }else if(this.x - ol01 > 0 && this.k.getMedia().getSize() - this.x > 0){
          if (!TextUtils.x(this.F.g())) {
             s.h(this.F.g());
          }
       }else if(this.k.getMedia().getHeight() < this.y || this.k.getMedia().getWidth() < this.z){
          if (!TextUtils.x(this.F.b())) {
             s.h(this.F.b());
          }
       }else {
          obj = new ArrayList(this.d.t());
          obj.add(this.k.getMedia());
          if (this.t - Long.MAX_VALUE) {
             a = q.a;
             Long longx = Long.valueOf(a.a(this.q.f(), obj));
             if (longx.longValue() - this.t > 0) {
                long l = a.a(this.q.f(), this.d.t());
                if (this.q.f() && (float)(this.p.j() - l) - 0x447a0000 >= 0) {
                   this.k.getMedia().setClipDuration((this.p.j() - l));
                }else if(!TextUtils.x(this.F.f())){
                   s.h(this.F.f());
                }else {
                   s.h(i.p(R.string.arg_RES_7f10189b));
                }
                d.r(i, longx.longValue());
             }else if(this.p.u() != null){
                if (this.p.u().isSelectable(this.t0().getMedia(), this.D0())) {
                   s.h(this.F.a());
                }else if(this.p.u().isClickable(this.t0().getMedia())){
                   s.h(this.F.a());
                }
             }
          }else {
             goto label_01e6 ;
          }
          b = true;
       }
    label_005e :
       b = false;
       if (!b) {
          return;
       }else {
          this.o0(this.e, this.k.getMedia().getTypeLoggerStr());
          b = this.m + i;
          this.m = b;
          this.k.select(b);
          if (!this.b.contains(this.k)) {
             this.b.add(this.k);
          }
          this.c.add(Integer.valueOf(this.u0()));
          this.d.q(this.k.getMedia(), this.d.u());
          if (this.r.o()) {
             this.P0(false);
          }
          return;
       }
    }
    public void M0(){
       l0 ol0 = l0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol0, "6")) {
          return;
       }
       if (this.H0()) {
          if (!PatchProxy.applyVoid(objArray, this, ol0, "9")) {
             int selectIndex = this.k.getSelectIndex();
             int i = this.u0();
             this.o0(this.f, this.k.getMedia().getTypeLoggerStr());
             this.m = this.m - 1;
             this.k.unSelect();
             if (!this.b.contains(this.k)) {
                this.b.add(this.k);
             }
             this.c.remove(Integer.valueOf(i));
             this.d.w(this.k.getMedia());
             this.S0(selectIndex);
          }
       }else {
          this.L0();
       }
       return;
    }
    public void O0(d p0){
       this.O = p0;
    }
    public void P0(boolean p0){
       this.L = p0;
    }
    public boolean Q0(){
       return this.C;
    }
    public void R0(int p0){
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol0, "17")) {
          return;
       }
       this.l.setValue(Integer.valueOf(p0));
       this.k = this.a.s(p0);
       return;
    }
    public final void S0(int p0){
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ol0, "7")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          MediaPreviewInfo mediaPreview = this.a.s(iterator.next().intValue());
          if (mediaPreview.getSelectIndex() > p0) {
             mediaPreview.decreaseSelectIndex();
          }
       }
       return;
    }
    public final void o0(Map p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l0.class, "5")) {
          return;
       }
       if (p0 != null && p1 != null) {
          Integer integer = p0.get(p1);
          int i = 1;
          if (integer != null) {
             i = i + integer.intValue();
          }
          p0.put(p1, Integer.valueOf(i));
       }
       return;
    }
    public d p0(){
       return this.o;
    }
    public AlbumLimitOption q0(){
       return this.p;
    }
    public k r0(){
       return this.r;
    }
    public LiveData s0(){
       return this.l;
    }
    public MediaPreviewInfo t0(){
       return this.k;
    }
    public int u0(){
       Object obj = PatchProxy.apply(null, this, l0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.l.getValue().intValue();
    }
    public int v0(){
       Object obj = PatchProxy.apply(null, this, l0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k.getSelectIndex();
    }
    public MutableLiveData w0(){
       return this.h;
    }
    public Bundle x0(){
       return this.E;
    }
    public n0 y0(){
       l0 obj = PatchProxy.apply(null, this, l0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == null) {
          return null;
       }
       return obj.d();
    }
    public PublishSubject z0(){
       return this.I;
    }
}
