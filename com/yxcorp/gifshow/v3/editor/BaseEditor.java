package com.yxcorp.gifshow.v3.editor.BaseEditor;
import android.util.SparseArray;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import java.lang.Object;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import voc.o;
import android.view.View;
import bmd.b;
import java.lang.Integer;
import ekd.k1;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import ooc.g1;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.util.Pair;
import lnc.v6;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import aw9.c0;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import k2b.s$b;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.f;
import voc.a;
import java.lang.Runnable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import gka.g;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import lnc.a1;
import rsc.c;
import com.yxcorp.gifshow.util.resource.f;
import java.util.List;
import java.lang.Number;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import ekd.j;
import vmd.a;
import java.util.Set;
import java.util.Iterator;
import voc.y;
import android.content.Context;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import boc.b;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.io.File;
import com.yxcorp.gifshow.util.resource.p;
import faa.a;
import com.yxcorp.gifshow.util.resource.g;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.util.resource.c;
import voc.b;
import z3b.t0;
import frc.a;
import fca.a;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditor;

public abstract class BaseEditor	// class@000d8f
{
    public EditorItemFunc b;
    public g c;
    public EditorDelegate d;
    public g e;
    public BaseEditorFragment f;
    public BaseEditor$a g;
    public s$b h;
    public String i;
    public long j;
    public String k;
    public boolean l;
    public boolean m;
    public static final SparseArray n;

    static {
       BaseEditor.n = new SparseArray();
       EditorDelegate$ShowLoggerType[] showLoggerTy = EditorDelegate$ShowLoggerType.values();
       int len = showLoggerTy.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = showLoggerTy[i];
          BaseEditor.n.put(oobject.mPageType, oobject);
       }
    }
    public void BaseEditor(){
       super();
       this.k = "";
       this.l = false;
       this.m = true;
    }
    public static FilterVideoPlugin$FilterEntranceType m(){
       return FilterVideoPlugin$FilterEntranceType.EDIT;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, BaseEditor.class, "16")) {
          return;
       }
       BaseEditor tf = this.f;
       if (tf != null) {
          tf.onActivityResume();
       }
       return;
    }
    public void B(EditorDelegate p0,String p1){
       this.d = p0;
       this.i = p1;
    }
    public abstract void C(o p0);
    public abstract void D(boolean p0);
    public boolean E(EditorDelegate p0,View p1){
       return false;
    }
    public boolean F(EditorDelegate p0,View p1){
       return this instanceof b;
    }
    public abstract void G();
    public abstract void H();
    public void I(){
       if (PatchProxy.applyVoid(null, this, BaseEditor.class, "11")) {
          return;
       }
       this.G();
       return;
    }
    public void J(int p0){
       String str;
       BaseEditor uBaseEditor = BaseEditor.class;
       if (PatchProxy.isSupport(uBaseEditor) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseEditor, "14")) {
          return;
       }
       long l = k1.t(this.j);
       BaseEditor$a uoa = this.j();
       g1 og1 = g1.class;
       if (!PatchProxy.isSupport(og1) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), uoa, null, og1, "28")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          BaseEditor$a a = uoa.a;
          int i = 3;
          if (a != 2) {
             if (a != i) {
                if (a != 12) {
                   if (a != 18) {
                      str = "";
                   }else {
                   label_0053 :
                      str = "CLOSE_PRETTIFY_AGGREGATION_DIALOG";
                   }
                }else {
                   str = "CLOSE_PHOTO_MOVIE_THEME_DIALOG";
                }
             }else {
                str = "CLOSE_MUSIC_DIALOG";
             }
          }else {
             goto label_0053 ;
          }
          uElementPack.action2 = str;
          Pair[] pairArray = new Pair[i];
          Pair pair = new Pair("time_cost", Long.valueOf(l));
          pairArray[0] = pair;
          pairArray[1] = new Pair("close_type", Integer.valueOf(uoa.d));
          pairArray[2] = new Pair("click_area", uoa.c);
          uElementPack.params = pair.a(pairArray);
          u1.u(1, uElementPack, new ClientContent$ContentPackage());
       }
       return;
    }
    public boolean K(){
       return this instanceof MusicEditor;
    }
    public void L(EditorDelegate p0){
       this.d = p0;
    }
    public void M(EditorItemFunc p0){
       this.b = p0;
    }
    public void N(boolean p0){
       this.m = p0;
    }
    public void O(BaseEditor$EditorShowMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditor.class, "17")) {
          return;
       }
       BaseEditor tf = this.f;
       if (tf != null) {
          tf.s = p0;
       }
       return;
    }
    public void P(boolean p0){
       BaseEditor uBaseEditor = BaseEditor.class;
       if (PatchProxy.isSupport(uBaseEditor) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBaseEditor, "8")) {
          return;
       }
       if (PatchProxy.isSupport(uBaseEditor) && PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.TRUE, this, uBaseEditor, "9") != PatchProxyResult.class) {
       }else {
          int i = 0;
          boolean b = true;
          int i1 = (this.f == null)? 1: 0;
          if (this.y() && this.d.n()) {
             i = 1;
          }
          if (this.d.O().b()) {
             this.d.O().w((i ^ 0x01));
          }
          if (i) {
             this.d.O().pause();
          }
          if (PostExperimentUtils.W0() && this instanceof MusicEditor) {
             this.d.O().play();
          }
          if (p0 && this.h() != null) {
             this.h().f(b);
          }
          this.H();
          BaseEditor tf = this.f;
          Objects.requireNonNull(tf);
          if (!PatchProxy.applyVoid(null, tf, BaseEditorFragment.class, "13")) {
             if (!tf.sh()) {
                tf.y = 0;
             }else if(!tf.t.O().b()){
                tf.y = 0;
             }else {
                tf.y = f.n(tf.t).getCurrentTime();
             }
          }
          if (this.z() && (this.d.O().b() && i)) {
             this.d.O().x();
          }
       label_00e2 :
          k1.r(new a(this, (i1 ^ 0x01)), 0);
          if (this.g == null) {
             this.g = this.d();
          }
          BaseEditor tg = this.g;
          if (tg != null && (!TextUtils.isEmpty(tg.b) && p0)) {
             long l = System.currentTimeMillis();
             this.j = l;
             p0.z = l;
          }
       label_0110 :
          if (i1) {
             this.f.wh(this.e);
          }
       }
       return;
    }
    public void a(String p0,e p1){
       if (this.f.isAdded()) {
          p1.E(this.f).m();
       }else {
          Fragment uFragment = this.d.q().getChildFragmentManager().findFragmentByTag(p0);
          if (uFragment != null) {
             p1.u(uFragment);
          }
          p1.g(this.d.m(), this.f, p0);
          p1.m();
       }
       return;
    }
    public void b(String p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseEditor.class, "19")) {
          return;
       }
       if (this.f.isAdded()) {
          p1.E(this.f).o();
       }else {
          Fragment uFragment = this.d.q().getChildFragmentManager().findFragmentByTag(p0);
          if (uFragment != null) {
             p1.u(uFragment);
          }
          p1.g(this.d.m(), this.f, p0);
          p1.o();
       }
       return;
    }
    public void c(int p0,boolean p1){
       BaseEditor uBaseEditor = BaseEditor.class;
       if (PatchProxy.isSupport(uBaseEditor) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uBaseEditor, "22")) {
          return;
       }
       this.d.G(a1.d(p0), a1.d(R.dimen.arg_RES_7f0703a1), a1.d(R.dimen.arg_RES_7f0703a1), p1, true);
       return;
    }
    public abstract BaseEditor$a d();
    public boolean e(){
       return this instanceof c;
    }
    public Fragment f(c p0,String p1,Class p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BaseEditor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && !TextUtils.isEmpty(p1)) {
          Fragment uFragment = p0.findFragmentByTag(p1);
          if (uFragment != null && p2.isInstance(uFragment)) {
             return uFragment;
          }
       }
       return null;
    }
    public final void g(boolean p0){
       BaseEditor uBaseEditor = BaseEditor.class;
       if (PatchProxy.isSupport(uBaseEditor) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBaseEditor, "10")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uBaseEditor, "6")) {
          uBaseEditor = this.c;
          if (uBaseEditor != null) {
             uBaseEditor.dismiss();
             this.c = null;
          }
       }
       this.D(p0);
       return;
    }
    public final s$b h(){
       SparseArray obj = PatchProxy.apply(null, this, BaseEditor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          obj = BaseEditor.n;
          if (obj.get(this.j().a) != null) {
             this.h = this.d.a(obj.get(this.j().a));
          }
       }
       return this.h;
    }
    public EditorDelegate i(){
       return this.d;
    }
    public final BaseEditor$a j(){
       Object obj = PatchProxy.apply(null, this, BaseEditor.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          this.g = this.d();
       }
       return this.g;
    }
    public BaseEditor$EditorShowMode k(){
       BaseEditor obj = PatchProxy.apply(null, this, BaseEditor.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          return obj.nh();
       }
       return BaseEditor$EditorShowMode.SHOW_FOREGROUND;
    }
    public String l(){
       return null;
    }
    public BaseEditorFragment n(){
       return this.f;
    }
    public List o(){
       return null;
    }
    public View p(){
       BaseEditor obj = PatchProxy.apply(null, this, BaseEditor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          return obj.mh();
       }
       return null;
    }
    public abstract int q();
    public int r(){
       VideoSDKPlayerView obj = PatchProxy.apply(null, this, BaseEditor.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.i().O().b()) {
          this.i().N().o0();
          obj = f.n(this.i());
          if (obj.getVideoProject() != null && !j.h(obj.getVideoProject().trackAssets().toNormalArray())) {
             return obj.getVideoProject().trackAssetsSize();
          }
       }
       return 0;
    }
    public boolean s(){
       Iterator iterator;
       BaseEditor obj = PatchProxy.apply(null, this, BaseEditor.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.K()) {
          if (this.p().findViewById(0x7f0a2eff).isShown() || this instanceof a) {
             obj = this.f;
             if (obj != null) {
                iterator = obj.qh().iterator();
                while (iterator.hasNext()) {
                   iterator.next().rd();
                }
                obj = this.e;
                if (obj != null) {
                   obj.d();
                }
                return true;
             }
          }
       }else if(this.p() != null && this.p().isShown()){
          obj = this.f;
          if (obj != null) {
             iterator = obj.qh().iterator();
             while (iterator.hasNext()) {
                iterator.next().yd();
             }
             obj = this.e;
             if (obj != null) {
                obj.a(2);
             }
             return true;
          }
       }
       return false;
    }
    public void t(boolean p0){
       BaseEditor uBaseEditor = BaseEditor.class;
       if (PatchProxy.isSupport(uBaseEditor) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBaseEditor, "20")) {
          return;
       }
       this.u(p0, true, R.anim.arg_RES_7f01010d);
       return;
    }
    public void u(boolean p0,boolean p1,int p2){
       if (PatchProxy.isSupport(BaseEditor.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, BaseEditor.class, "21")) {
          return;
       }
       e uoe = this.d.q().getChildFragmentManager().beginTransaction();
       if (p0) {
          uoe.y(R.anim.arg_RES_7f010105, p2);
       }else {
          this.f.r = true;
          uoe.y(R.anim.arg_RES_7f010105, p2);
       }
       uoe.s(this.f).m();
       this.e.c(p0, p1);
       return;
    }
    public boolean v(){
       Object obj = PatchProxy.apply(null, this, BaseEditor.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.r() <= b) {
          b = false;
       }
       return b;
    }
    public boolean w(Context p0,boolean p1){
       ArrayList obj;
       Object[] obj1;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseEditor uBaseEditor = BaseEditor.class;
       if (PatchProxy.isSupport(uBaseEditor)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uBaseEditor, "3");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (q.f(this.o())) {
          return true;
       }else {
          obj = new ArrayList();
          Iterator iterator = this.o().iterator();
          boolean b = true;
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob == Category.FILTER_HOLDER) {
                if (Filters.hasFilterConfigs(BaseEditor.m())) {
                   FilterVideoPlugin$FilterEntranceType uFilterEntra = BaseEditor.m();
                   obj1 = PatchProxy.applyOneRefs(uFilterEntra, null, n.class, "1");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      Object[] objArray = new Object[0];
                      a.D().w("FilterDownloadHelper", "isAllFilterResExist "+uFilterEntra, objArray);
                      Filters.init(uFilterEntra);
                      Iterator iterator1 = new ArrayList(Filters.getAllFilterForType(uFilterEntra)).iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            if (n.l(iterator1.next())) {
                               continue ;
                            }else {
                               b1 = false;
                            }
                         }else {
                            b1 = true;
                         }
                      }
                   }
                   if (b1) {
                   }
                }
                obj.add(uob);
                b = false;
             }else if(p.d(uob, "").exists()){
                Object obj2 = PatchProxy.applyOneRefs(uob, this, uBaseEditor, "4");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else if(uob == Category.EFFECT){
                   b1 = p.d(uob, "icons").exists();
                }else {
                   b1 = true;
                }
                if (b1) {
                label_00e4 :
                   obj1 = new Object[0];
                   a.D().w("BaseEditor", "isResourceValid category:"+uob+",downloadIfInvalid:"+p1, obj1);
                }
             }
             obj.add(uob);
             b = false;
             goto label_00e4 ;
          }
          if (b || (p1 && !PatchProxy.applyVoidTwoRefs(p0, obj, this, uBaseEditor, "5"))) {
             BaseEditor tc = this.c;
             if (tc != null) {
                tc.dismiss();
             }
             Category fILTER_HOLDE = Category.FILTER_HOLDER;
             if (obj.contains(fILTER_HOLDE)) {
                obj.remove(fILTER_HOLDE);
                this.c = new g(p0, obj, n.i(BaseEditor.m()), d.a(-860154223));
             }else {
                this.c = new g(p0, obj);
             }
             String str = this.l();
             if (str != null) {
                c.b(this.c, u1.k(), str);
             }
             this.c.i(new b(this));
             this.c.show();
          }
       label_0167 :
          return b;
       }
    }
    public boolean x(){
       return this instanceof a;
    }
    public boolean y(){
       return (this instanceof a ^ 0x01);
    }
    public boolean z(){
       return (this instanceof CoverEditor ^ 0x01);
    }
}
