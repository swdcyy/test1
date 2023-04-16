package com.yxcorp.gifshow.v3.editor.prettify.makeup.c;
import o0c.d;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.c$a;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.c$b;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.b;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import p0c.f;
import p0c.h;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.c$d;
import i1c.c;
import p0c.f$c;
import com.kwai.robust.PatchProxyResult;
import n0c.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.g;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.c$c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Enum;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import java.util.List;
import wba.z;
import com.yxcorp.gifshow.v3.editor.prettify.filter.g;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import h80.j;
import h80.k;
import yyb.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.prettify.makeup.d;
import brd.t;
import vsc.b;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import uwc.a;
import java.util.Map;
import qsc.g;
import t36.f;
import com.yxcorp.gifshow.prettify.makeup.m;
import k2b.s$b;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import androidx.recyclerview.widget.RecyclerView;
import o0c.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Makeup;
import faa.a;
import q87.c;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.StringBuilder;
import java.lang.Float;
import java.util.Iterator;
import com.kuaishou.edit.draft.Makeup$SubFeatures;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import w46.b;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import f1c.c2;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import lnc.a1;
import rsc.e;
import vsc.i;
import java.util.ArrayList;
import com.kwai.video.westeros.models.MakeupResource;
import com.kuaishou.edit.draft.Makeup$SubFeatures$a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import com.kuaishou.edit.draft.Makeup$b;
import java.lang.Iterable;
import com.yxcorp.gifshow.log.EditFunnel;
import java.util.Objects;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Integer;
import p0c.c;
import d1c.e;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$f;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import android.view.View;
import ekd.m1;
import vsc.f;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment;
import xaa.a;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import android.os.Bundle;

public class c extends PresenterV2 implements d, g	// class@001195
{
    public b A;
    public e B;
    public View C;
    public y D;
    public g E;
    public EditPrettifyFragment p;
    public h q;
    public i r;
    public Set s;
    public c t;
    public a u;
    public PrettifyBaseFragment v;
    public PublishSubject w;
    public PrettifyConfigView x;
    public f y;
    public a z;

    public void c(boolean p0){
       super();
       this.w = PublishSubject.g();
       this.D = new c$a(this);
       this.E = new c$b(this);
       if (p0) {
          this.U7(new b());
       }else {
          this.U7(new e());
       }
       return;
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       this.s.add(this.D);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "7")) {
          f uof = this.q.i();
          this.y = uof;
          uof.o(true);
          this.y.s(R.layout.arg_RES_7f0d12da);
          this.y.C(R.layout.arg_RES_7f0d119c);
          this.y.w(R.layout.arg_RES_7f0d1198);
          this.y.y(R.layout.arg_RES_7f0d12dc);
          this.y.v(R.layout.arg_RES_7f0d119c);
          this.y.x(true);
          this.y.t(MakeupKey.EDIT);
          this.y.A(false);
          this.y.q(new c$d(this));
          this.y.r(this);
          this.y.n(true);
          this.y.u(new f$c(false, false));
          this.y.p(true);
          c ty = this.y;
          g og = PatchProxy.apply(objArray, this, uoc, "9");
          if (og != PatchProxyResult.class) {
          }else {
             c ty1 = this.y;
             if (ty1 == null || !ty1.c()) {
                og = objArray;
             }else {
                EditorDelegate uEditorDeleg = this.p.kh();
                g og1 = new g();
                og1.a = this.q.c();
                og1.d = uEditorDeleg.getTaskId();
                switch (c$c.a[uEditorDeleg.N().T0().ordinal()]){
                    case 1:
                    case 3:
                    case 4:
                    case 2:
                      og1.b = 2;
                      break;
                    case 5:
                    case 7:
                    case 6:
                      og1.b = 3;
                      break;
                    default:
                      og1.b = 5;
                }
                if (f.E(uEditorDeleg.getType())) {
                   List list = q.g(z.x(uEditorDeleg.getType(), uEditorDeleg.N()), g.a);
                   if (!PatchProxy.applyVoidOneRefs(list, og1, g.class, "1") && list != null) {
                      og1.g.clear();
                      og1.g.addAll(list);
                   }
                }else {
                   og1.f = this.r.e();
                   if (this.r.j() != null) {
                      og1.c = (double)(float)(this.r.j().getVideoLength() * 0x408f400000000000);
                   }
                }
                og = og1;
             }
          }
          ty.z(og);
          if (PatchProxy.applyVoid(objArray, this, uoc, "8") || (k.d() != null && k.d() != null)) {
             b uob = k.d().b(new b());
             b b = uob.b;
             if (b != null) {
                this.y.h = b.booleanValue();
             }
             b = uob.c;
             if (b != null) {
                this.y.u(new f$c(b.booleanValue(), uob.c.booleanValue()));
             }
          }
       }
    label_017c :
       if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
          this.A = d.a().c(this.y.h(), this.y.e(), this.y.a(), this.y.c()).subscribe(new b(this), e.b);
       }
       this.P8();
       f.o0(this.E, f.h(this.r.f().q()).t0(), g.class);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.S8().a();
       f.p0(f.h(this.r.f().q()).t0(), g.class).c(this.E);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       d.a().b(this.y.h()).n();
       c tA = this.A;
       if (tA != null && !tA.isDisposed()) {
          this.A.dispose();
       }
       s$b uob = this.R8();
       if (uob != null) {
          c tx = this.x;
          if (tx != null) {
             uob.c(tx.getFilterItemList());
          }
       }
       return;
    }
    public void M3(){
       c.g(this);
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       s$b uob = this.R8();
       if (uob != null) {
          c tx = this.x;
          if (tx != null) {
             uob.b(tx.getFilterItemList());
          }
       }
       return;
    }
    public s$b R8(){
       Object obj = PatchProxy.apply(null, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.f().a(EditorDelegate$ShowLoggerType.MAKEUP);
    }
    public m S8(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a().b(MakeupKey.EDIT);
    }
    public void V8(){
       Object[] objArray3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "11")) {
          return;
       }
       Makeup makeup = this.u.v();
       m om = this.S8();
       if (makeup == null) {
          Object[] objArray1 = new Object[0];
          a.D().s("EditMakeupPresenter", "No makeup draft for restore", objArray1);
          this.z = objArray;
          this.y.A(0);
          om.p("-10");
          om.o("-10");
          return;
       }else if(makeup.getIsReco()){
          objArray = new Object[0];
          a.D().w("EditMakeupPresenter", "restore is reco makeup", objArray);
          return;
       }else {
          String primaryTypeI = makeup.getPrimaryTypeId();
          MakeupSuite makeupSuite = om.h(primaryTypeI);
          if (makeupSuite == null) {
             Object[] objArray2 = new Object[0];
             a.D().w("EditMakeupPresenter", "Not found suit for "+primaryTypeI, objArray2);
             return;
          }else {
             om.p(primaryTypeI);
             om.o(primaryTypeI);
             boolean isSuitAdjust = makeup.getIsSuitAdjust();
             if (this.y.a() && isSuitAdjust) {
                makeupSuite.setIntensity(Float.valueOf(makeup.getSuitIntensity()));
             }
             Iterator iterator = makeup.getSubFeaturesList().iterator();
             while (iterator.hasNext()) {
                Makeup$SubFeatures subFeatures = iterator.next();
                MakeupPart part = makeupSuite.getPart(subFeatures.getSecodaryTypeId());
                if (part == null || part.isNull()) {
                   objArray3 = new Object[0];
                   a.D().t("EditMakeupPresenter", "MakeupPartError:"+subFeatures.getSecodaryTypeId(), objArray3);
                }else if(TextUtils.n("-1000", subFeatures.getThirdType())){
                   continue ;
                }else {
                   MakeupMaterial material = part.getMaterial(subFeatures.getThirdType());
                   if (material == null || material.isEmpty()) {
                      objArray3 = new Object[0];
                      a.D().t("EditMakeupPresenter", "MakeupMaterialError:"+subFeatures.getThirdType(), objArray3);
                   }else {
                      part.setSelectMaterial(material);
                      if (isSuitAdjust || !this.y.a()) {
                         material.setUserIntensity(Float.valueOf(subFeatures.getIntensity()));
                      }
                   }
                }
             }
             c ty = this.y;
             isSuitAdjust = (ty != null && ty.a())? true: false;
             this.z = c2.c(makeupSuite, 0, isSuitAdjust);
             this.y.A((makeup.getIsReco() ^ 1));
             return;
          }
       }
    }
    public void W5(){
       c.b(this);
    }
    public void W8(MakeupSuite p0,boolean p1){
       c tz;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "17")) {
          return;
       }
       List list = c2.f(this.y.h(), p0);
       if (this.B != null && !p1) {
          tz = this.z;
          if (tz == null || !TextUtils.n(tz.a, p0.mId)) {
             this.B.e(c2.g(p0), a1.p(R.string.arg_RES_7f10318a));
          }
       }
       if (!q.f(list)) {
          tz = this.y;
          boolean b = (tz != null && tz.a())? true: false;
          a uoa = c2.c(p0, false, b);
          this.z = uoa;
          i oi = new i();
          oi.a = list;
          oi.b = p1;
          oi.c = uoa;
          if (!PatchProxy.applyVoidTwoRefs(p0, oi, this, uoc, "12")) {
             if (p0.isEmpty()) {
                this.u.d();
             }else {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator1 = oi.a.iterator();
                while (iterator1.hasNext()) {
                   MakeupResource makeupResour1 = iterator1.next();
                   Makeup$SubFeatures$a subFeatures$ = Makeup$SubFeatures.newBuilder();
                   subFeatures$.copyOnWrite();
                   subFeatures$.instance.setIntensity(makeupResour1.getIntensity());
                   subFeatures$.copyOnWrite();
                   subFeatures$.instance.setPriority(makeupResour1.getPriority());
                   subFeatures$.copyOnWrite();
                   subFeatures$.instance.setSecodaryTypeId(makeupResour1.getType());
                   subFeatures$.a(makeupResour1.getResourceDir());
                   c tz1 = this.z;
                   a$a uoa1 = PatchProxy.applyTwoRefs(tz1, makeupResour1, this, uoc, "13");
                   if (uoa1 != PatchProxyResult.class) {
                   }else {
                      Iterator iterator2 = tz1.c.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            uoa1 = iterator2.next();
                            if ((uoa1.a).equals(makeupResour1.getType())) {
                               uoa1 = uoa1.c;
                            }
                         }else {
                            uoa1 = "";
                         }
                      }
                   }
                   subFeatures$.copyOnWrite();
                   subFeatures$.instance.setThirdType(uoa1);
                   uArrayList.add(subFeatures$.build());
                }
                Makeup$b uob = this.u.k().clear();
                uob.copyOnWrite();
                uob.instance.setPrimaryTypeId(p0.mId);
                uob.copyOnWrite();
                uob.instance.setIsReco(p0.isReco());
                uob.copyOnWrite();
                uob.instance.setSuitIntensity(p0.getIntensity());
                uob.copyOnWrite();
                uob.instance.setIsSuitAdjust(this.y.a());
                uob.copyOnWrite();
                uob.instance.addAllSubFeatures(uArrayList);
             }
          }
          Objects.requireNonNull(EditFunnel.a);
          this.w.onNext(oi);
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             MakeupResource makeupResour = iterator.next();
             Object[] objArray = new Object[false];
             a.D().s("EditMakeupPresenter", "type : "+makeupResour.getType()+" resource : "+makeupResour.getResourceDir()+" intensity : "+makeupResour.getIntensity(), objArray);
          }
          if (p1) {
             Object[] objArray1 = new Object[false];
             a.D().s("EditMakeupPresenter", "onlyUpdateIntensity = true, no need refresh filter, suite.mPassThroughParams.mFilterIdForMakeup = "+p0.mPassThroughParams.mFilterIdForMakeup+", suite.mPassThroughParams.mFilterIntensityForMakeup = "+p0.mPassThroughParams.mFilterIntensityForMakeup, objArray1);
             return;
          }else {
             a0$f uof = -1;
             if (!TextUtils.x(p0.mPassThroughParams.mFilterIdForMakeup) && !TextUtils.x(p0.mPassThroughParams.mFilterIntensityForMakeup)) {
                FilterConfig uFilterConfi = new FilterConfig();
                uFilterConfi.mFilterId = Integer.parseInt(p0.mPassThroughParams.mFilterIdForMakeup);
                uFilterConfi.mIntensity = Float.parseFloat(p0.mPassThroughParams.mFilterIntensityForMakeup);
                if (uFilterConfi.mFilterId != uof) {
                   this.q.e().f().Q0(false, uFilterConfi, a0.h());
                }else {
                   this.q.e().f().Q0(uof, FilterConfig.getEmpty(), a0.h());
                }
             }else {
                this.q.e().f().Q0(uof, FilterConfig.getEmpty(), a0.h());
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a2f73);
       return;
    }
    public void f5(){
       c.d(this);
    }
    public void f6(){
       c.a(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new f());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("GENERATE_FRAGMENT");
       this.r = this.r8("EDITOR_HELPER_CONTRACT");
       this.s = this.r8("EDITOR_VIEW_LISTENERS");
       this.t = this.r8("WORKSPACE");
       this.u = this.r8("EDIT_MAKEUP");
       this.v = this.t8("PRETTIFY_FRAGMENT");
       this.B = this.t8("PRETTIFY_NAME_HELPER");
       return;
    }
    public void n4(){
       c.f(this);
    }
    public void q4(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "16")) {
          return;
       }
       this.x = p0.findViewById(0x7f0a2a65);
       this.P8();
       return;
    }
    public void u3(){
       c.i(this);
    }
    public void v6(boolean p0){
       c.e(this, p0);
    }
    public void x5(){
       c.c(this);
    }
    public void y6(){
       c.h(this);
    }
}
