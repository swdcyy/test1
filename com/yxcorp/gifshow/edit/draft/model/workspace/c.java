package com.yxcorp.gifshow.edit.draft.model.workspace.c;
import im8.g;
import laa.m0;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.io.File;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.Phase;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;
import java.util.Collections;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$From;
import android.util.Pair;
import com.kuaishou.edit.draft.Workspace$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import raa.e;
import laa.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import mba.m0;
import uaa.a;
import vaa.a;
import zaa.a;
import waa.a;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yaa.c;
import com.kuaishou.edit.draft.Music;
import com.kuaishou.edit.draft.FeatureId;
import java.util.Collection;
import lnc.s6;
import gba.a;
import taa.a;
import bba.b;
import cba.a;
import dba.a;
import com.kuaishou.edit.draft.Workspace$Source;
import eba.a;
import hba.a;
import iba.a;
import raa.g;
import jba.a;
import com.kuaishou.edit.draft.Workspace$Type;
import kba.a;
import java.lang.Double;
import raa.i;
import lba.a;
import mba.l0;
import java.util.Map;
import java.util.HashMap;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.util.PostUtils;
import crd.b;
import brd.m;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.edit.draft.model.workspace.b;
import java.lang.Throwable;
import java.util.Objects;
import java.util.Set;
import java.lang.Iterable;
import brd.t;
import mba.c;
import erd.o;
import com.yxcorp.gifshow.edit.draft.model.workspace.a;
import erd.c;
import mba.b;
import mba.a;
import erd.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import lnc.i1;
import laa.a0;
import java.lang.Runnable;
import raa.a;
import fba.a;
import maa.a;
import paa.a;
import saa.a;
import qaa.a;
import naa.a;
import oaa.a;
import xaa.a;
import saa.c;
import saa.e;
import raa.c;

public class c extends m0 implements g	// class@001b17
{
    public VideoContext l;
    public VideoContext m;
    public Phase n;
    public Map o;
    public b p;
    public Collection q;
    public static final z r;

    static {
       c.r = b.b(c.e("draft_copy_asset", 1));
    }
    public void c(File p0,Workspace p1,VideoContext p2,Phase p3){
       super(new File(""), p1, p0);
       this.q = Collections.emptyList();
       if (p2 == null) {
          p2 = new VideoContext();
       }
       this.l = p2;
       this.n = p3;
       return;
    }
    public File A0(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.f0(), "fileMap.json");
    }
    public boolean B(){
       return true;
    }
    public Workspace$From B0(){
       Pair obj = PatchProxy.apply(null, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t0();
       Pair first = obj.first;
       if (first != null) {
          return first.instance.getFrom();
       }
       obj = obj.second;
       Workspace$From from = (obj != null)? obj.getFrom(): Workspace$From.FROM_UNKNOW;
       return from;
    }
    public e C0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().w;
       }
       return objArray;
    }
    public String D0(){
       Pair obj = PatchProxy.apply(null, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t0();
       Pair first = obj.first;
       if (first != null) {
          return first.getIdentifier();
       }
       obj = obj.second;
       String identifier = (obj != null)? obj.getIdentifier(): "";
       return identifier;
    }
    public a E0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().B;
       }
       return objArray;
    }
    public a F0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().G;
       }
       return objArray;
    }
    public a G0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().E;
       }
       return objArray;
    }
    public a H0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().n;
       }
       return objArray;
    }
    public void I(boolean p0){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, c.class, "16")) {
          return;
       }
       this.m = null;
       return;
    }
    public List I0(){
       ArrayList obj = PatchProxy.apply(null, this, c.class, "65");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.d1().x().iterator();
       while (iterator.hasNext()) {
          MagicEmoji$MagicFace magicFace = iterator.next();
          if (magicFace != null && !TextUtils.x(magicFace.mId)) {
             obj.add(magicFace.mId);
          }
       }
       return obj;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       c tm = this.m;
       if (tm == null) {
          tm = new VideoContext();
       }
       this.l = tm;
       this.m = null;
       return;
    }
    public c J0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().z;
       }
       return objArray;
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       m0 om0 = this.u();
       if (om0 != null) {
          Workspace$b uob = om0.f();
          uob.f("Android");
          uob.v("2.9.602");
       }
       this.m = this.l.f();
       return;
    }
    public String K0(){
       c obj = PatchProxy.apply(null, this, c.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J0();
       if (obj != null && obj.v() != null) {
          return obj.v().getFeatureId().getExternal();
       }
       return null;
    }
    public Collection L0(){
       Object obj = PatchProxy.apply(null, this, c.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!s6.c()) {
          return Collections.emptyList();
       }
       return this.q;
    }
    public Phase M0(){
       return this.n;
    }
    public a N0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().F;
       }
       return objArray;
    }
    public a O0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().L;
       }
       return objArray;
    }
    public a P0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().I;
       }
       return objArray;
    }
    public b Q0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().C;
       }
       return objArray;
    }
    public a R0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().y;
       }
       return objArray;
    }
    public a S0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().D;
       }
       return objArray;
    }
    public Workspace$Source T0(){
       Pair obj = PatchProxy.apply(null, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t0();
       Pair first = obj.first;
       if (first != null) {
          return first.getSource();
       }
       obj = obj.second;
       Workspace$Source source = (obj != null)? obj.getSource(): Workspace$Source.NONE;
       return source;
    }
    public a U0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().x;
       }
       return objArray;
    }
    public String V0(){
       Object[] objArray = null;
       Pair obj = PatchProxy.apply(objArray, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t0();
       Pair first = obj.first;
       if (first != null) {
          return first.getTaskId();
       }
       obj = obj.second;
       if (obj != null) {
          objArray = obj.getTaskId();
       }
       return objArray;
    }
    public a W0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().k;
       }
       return objArray;
    }
    public a X0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().A;
       }
       return objArray;
    }
    public g Y0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().t;
       }
       return objArray;
    }
    public a Z0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().K;
       }
       return objArray;
    }
    public Workspace$Type a1(){
       Pair obj = PatchProxy.apply(null, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t0();
       Pair first = obj.first;
       if (first != null) {
          return first.getType();
       }
       obj = obj.second;
       Workspace$Type type = (obj != null)? obj.getType(): Workspace$Type.UNKNOWN;
       return type;
    }
    public Workspace$Type b1(){
       Pair obj = PatchProxy.apply(null, this, c.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t0();
       Pair first = obj.first;
       if (first != null) {
          return first.instance.getTypeFrom();
       }
       obj = obj.second;
       Workspace$Type typeFrom = (obj != null)? obj.getTypeFrom(): Workspace$Type.UNKNOWN;
       return typeFrom;
    }
    public a c1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().p;
       }
       return objArray;
    }
    public VideoContext d1(){
       return this.l;
    }
    public Double e1(){
       Pair obj = PatchProxy.apply(null, this, c.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t0();
       Pair first = obj.first;
       if (first != null) {
          return Double.valueOf(first.instance.getVideoDuration());
       }
       obj = obj.second;
       double videoDuratio = (obj != null)? obj.getVideoDuration(): 0;
       return Double.valueOf(videoDuratio);
    }
    public i f1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().s;
       }
       return objArray;
    }
    public a g1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().m;
       }
       return objArray;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new l0());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void h0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("WorkspaceDraft", "addFileMap\(\) "+this.D0()+" internalPath="+p0+" externalPath="+p1, objArray);
       if (this.o == null) {
          this.o = new HashMap();
       }
       this.o.put(p0, p1);
       this.i1();
       return;
    }
    public void h1(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (this.o != null) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().w("WorkspaceDraft", "loadFileMap\(\) called "+this.D0(), objArray);
       this.o = PostUtils.C(this.A0(), HashMap.class);
       return;
    }
    public e i(GeneratedMessageLite p0){
       m0 om0 = PatchProxy.applyOneRefs(p0, this, c.class, "13");
       if (om0 != PatchProxyResult.class) {
       }else {
          om0 = new m0(this.q(), p0, this);
       }
       return om0;
    }
    public void i0(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       c to = this.o;
       if (to != null && !to.isEmpty()) {
          int i = 0;
          String str = "WorkspaceDraft";
          if (this.D()) {
             objArray = new Object[i];
             f.D().s(str, "asyncCopyFilesInFileMap\(\) is editing ignore", objArray);
             return;
          }else {
             to = this.p;
             if (to != null && !to.isDisposed()) {
                objArray = new Object[i];
                f.D().A(str, "asyncCopyFilesInFileMap\(\) already has one ", objArray);
                return;
             }else {
                this.p = this.k0().y(Functions.d(), b.b);
             }
          }
       }
       return;
    }
    public void i1(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          return;
       }
       c to = this.o;
       if (to != null && !to.isEmpty()) {
          PostUtils.H(this.A0(), this.o);
          if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
             File uFile = new File(this.f0(), "asset_waiting_copy");
             if (!uFile.exists()) {
                try{
                   Object[] objArray1 = new Object[0];
                   f.D().w("WorkspaceDraft", "createCopyWaitingFile\(\) create waiting flag file "+uFile.createNewFile()+" "+this.D0(), objArray1);
                }catch(java.io.IOException e0){
                   f.D().z("WorkspaceDraft", "createCopyWaitingFile\(\) saveFileMap "+this.D0(), e0);
                }
             }
          }
       }
    }
    public void j0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "60")) {
          return;
       }
       if (this.u() == null) {
          return;
       }
       m0 om0 = this.u();
       Objects.requireNonNull(om0);
       if (!PatchProxy.applyVoid(objArray, om0, m0.class, "14")) {
          om0 = om0.C;
          if (om0 != null) {
             om0.d();
          }
       }
       return;
    }
    public void j1(Phase p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "61")) {
          return;
       }
       this.k1(p0);
       if (s6.c()) {
          Iterator iterator = this.L0().iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             if (uoc != this) {
                uoc.k1(p0);
             }
          }
       }
       return;
    }
    public m k0(){
       Object[] objArray;
       c obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       int i = 0;
       if (obj == null || obj.isEmpty()) {
          objArray = new Object[i];
          f.D().w("WorkspaceDraft", "copyFilesFromFileMap\(\) file map is empty", objArray);
          return m.s(Boolean.TRUE);
       }else if(!new File(this.f0(), "asset_waiting_copy").exists()){
          objArray = new Object[i];
          f.D().s("WorkspaceDraft", "asyncCopyFilesInFileMap\(\) no waiting flag file ", objArray);
          return m.s(Boolean.TRUE);
       }else {
          objArray = new Object[i];
          f.D().w("WorkspaceDraft", "copyFilesFromFileMap\(\) ", objArray);
          return t.fromIterable(this.o.entrySet()).observeOn(c.r).map(new c(this)).reduce(a.a).k(new b(this)).h(new a(this));
       }
    }
    public final void k1(Phase p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "62")) {
          return;
       }
       this.n = p0;
       DraftFileManager uDraftFileMa = DraftFileManager.E();
       Objects.requireNonNull(uDraftFileMa);
       if (!PatchProxy.applyVoidTwoRefs(this, p0, uDraftFileMa, DraftFileManager.class, "79")) {
          if (!this.D()) {
             i1.c(new DraftEditException("setPhase: draft "+this.D0()+" is not editing"));
          }else {
             uDraftFileMa.c.d(new a0(this.f0(), p0));
          }
       }
       return;
    }
    public void l0(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       if (!new File(this.f0(), "asset_waiting_copy").delete()) {
          Object[] objArray = new Object[0];
          f.D().A("WorkspaceDraft", "deleteCopyWaitingFile\(\) delete failed "+this.D0(), objArray);
       }
       return;
    }
    public void l1(Phase p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "63")) {
          return;
       }
       this.m1(p0);
       if (s6.c()) {
          Iterator iterator = this.L0().iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             if (uoc != this) {
                uoc.m1(p0);
             }
          }
       }
       return;
    }
    public a m0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().v;
       }
       return objArray;
    }
    public void m1(Phase p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "64")) {
          return;
       }
       if (this.n != p0) {
          return;
       }
       this.k1(Phase.NONE);
       return;
    }
    public a n0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().H;
       }
       return objArray;
    }
    public a o0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().l;
       }
       return objArray;
    }
    public String p0(){
       String obj = PatchProxy.apply(null, this, c.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.u() != null)? this.u().h().getBusinessId(): "";
       return obj;
    }
    public a q0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().o;
       }
       return objArray;
    }
    public String r(){
       return "";
    }
    public a r0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().g;
       }
       return objArray;
    }
    public a s0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().f;
       }
       return objArray;
    }
    public final Pair t0(){
       Workspace workspace;
       Object[] objArray = null;
       m0 obj = PatchProxy.apply(objArray, this, c.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u();
       if (obj != null) {
          workspace = obj.h();
          obj = (obj.b != null)? 1: null;
          if (obj) {
             Workspace$b uob = this.u().f();
             if (uob != null) {
                return new Pair(uob, workspace);
             }
          }
       }else {
          workspace = objArray;
       }
       return new Pair(objArray, workspace);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+"\n type="+this.a1()+",source="+this.T0()+",from="+this.B0()+",typeFrom="+this.b1()+",taskId="+this.V0();
    }
    public a u0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().h;
       }
       return objArray;
    }
    public a v0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().j;
       }
       return objArray;
    }
    public a w0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().i;
       }
       return objArray;
    }
    public c x0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().r;
       }
       return objArray;
    }
    public e y0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().J;
       }
       return objArray;
    }
    public c z0(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u() != null) {
          objArray = this.u().u;
       }
       return objArray;
    }
}
