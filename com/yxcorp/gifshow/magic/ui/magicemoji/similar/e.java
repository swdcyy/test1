package com.yxcorp.gifshow.magic.ui.magicemoji.similar.e;
import com.smile.gifmaker.mvps.presenter.a;
import lnc.a1;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import cw9.c;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import w3b.p;
import java.util.ArrayList;
import w3b.b;
import java.util.Set;
import com.yxcorp.gifshow.magic.ui.magicemoji.similar.a;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.util.List;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import h5b.d;
import lq.f;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h5b.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import g9c.a;
import java.util.Collection;
import ekd.q;
import android.view.View;
import com.yxcorp.utility.n;
import java.util.Map;
import e4b.a;
import e4b.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import com.google.common.base.a;
import t45.d;
import brd.z;
import h5b.c;
import erd.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.similar.c;
import com.yxcorp.gifshow.magic.ui.magicemoji.similar.d;
import java.lang.Integer;
import java.lang.Boolean;
import h5b.f;
import java.lang.Runnable;
import b4b.i;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import ekd.m1;
import com.yxcorp.gifshow.magic.ui.magicemoji.similar.SimilarPresenter$1;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import java.util.Arrays;
import h5b.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFaceShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFacePackage;
import k2b.u1;
import skd.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$a;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import com.yxcorp.gifshow.magic.ui.magicemoji.similar.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$c;
import io.reactivex.subjects.PublishSubject;

public class e extends a	// class@001c15
{
    public View A;
    public RecyclerView B;
    public int C;
    public MagicFaceAdapter D;
    public final Map r;
    public final Set s;
    public MagicEmojiPageConfig t;
    public MagicFaceAdapter$c u;
    public MagicEmojiFragment$Source v;
    public PublishSubject w;
    public PublishSubject x;
    public ViewStub y;
    public View z;
    public static final int E;
    public static final int F;

    static {
       e.E = a1.e(10.00f);
       e.F = c.b(a.b().getResources(), 0x7f070e93);
    }
    public void e(){
       super();
       this.r = new HashMap();
       this.s = new HashSet();
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       b.D().w("SimilarPresenter", "onBind", objArray1);
       this.Y8();
       MagicEmoji$MagicFace magicFace = p.e(this.t);
       if (magicFace == null && !PatchProxy.applyVoid(objArray, this, uoe, "15")) {
          objArray = new Object[0];
          b.D().w("SimilarPresenter", "prefetchHotSimilarMagics", objArray);
          ArrayList uArrayList = new ArrayList();
          MagicEmoji magicEmoji = y.y(b.d().a(), a.b).orNull();
          if (magicEmoji != null) {
             for (int i = 0; i < 15 && i < magicEmoji.mMagicFaces.size(); i = i + 1) {
                Object[] objArray2 = new Object[0];
                b.D().w("SimilarPresenter", "预取 "+magicEmoji.mName+"-"+magicEmoji.mMagicFaces.get(i).mName, objArray2);
                uArrayList.add(magicEmoji.mMagicFaces.get(i).mId);
             }
          }
          this.V8(uArrayList);
       }
       this.X8(magicFace);
       this.X7(this.x.subscribe(new d(this), f.b));
       this.X7(this.w.subscribe(new e(this), f.b));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       e tB = this.B;
       if (tB != null && tB.getAdapter() instanceof g) {
          this.B.getAdapter().Z0();
       }
       this.B = null;
       return;
    }
    public final String R8(){
       e tt = this.t;
       MagicEmojiPageConfig mPageIdentif = (tt != null)? tt.mPageIdentify: "";
       return mPageIdentif;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       e tD = this.D;
       if (tD != null && !q.f(tD.Q0())) {
          this.D.M0();
       }
       n.Y(this.z, 4, false);
       return;
    }
    public final void V8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "16")) {
          return;
       }
       if (p0 != null) {
          p0.removeAll(this.r.keySet());
       }
       String str = "SimilarPresenter";
       int i = 0;
       if (q.f(p0)) {
          Object[] objArray = new Object[i];
          b.D().w(str, "requestSimilarMagics ids empty, return", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          b.D().w(str, "requestSimilarMagics", objArray1);
          this.s.addAll(p0);
          a uoa = c.a();
          MagicBusinessId mId = l.d(this.v).mId;
          String str1 = "["+a.f(',').c(p0)+"]";
          e tt = this.t;
          MagicEmojiPageConfig mTaskId = (tt != null)? tt.mTaskId: "";
          this.X7(uoa.s(mId, str1, mTaskId, i).observeOn(d.a).doFinally(new c(this, p0)).subscribe(new c(this, p0), d.b));
          return;
       }
    }
    public final void W8(int p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoe, "13")) {
          return;
       }
       uoe = this.A;
       if (uoe != null && p0 >= 0) {
          uoe.post(new f(this, p0, p1));
       }
       return;
    }
    public final void X8(MagicEmoji$MagicFace p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "9")) {
          return;
       }
       if (p0 == null) {
          this.Z8(p0, null);
          return;
       }else {
          p0 = p.b().h(this.R8(), p0);
          String str = "-";
          Object[] objArray = new Object[0];
          b.D().w("SimilarPresenter", "updateSimilarData "+p0.mName+str+p0.mId, objArray);
          List list = i.b(this.r.get(p0.mId), this.t);
          if (list != null) {
             Object[] objArray1 = new Object[0];
             b.D().w("SimilarPresenter", "use cache "+p0.mName+str+p0.mId, objArray1);
             this.Z8(p0, list);
          }else {
             objArray = new Object[0];
             b.D().w("SimilarPresenter", "update from network "+p0.mName+str+p0.mId, objArray);
             this.S8();
             if (this.s.contains(p0.mId)) {
                Object[] objArray2 = new Object[0];
                b.D().w("SimilarPresenter", "is already requesting, return.", objArray2);
             }else {
                ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, uoe, "14");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                   uArrayList = new ArrayList();
                   uArrayList.add(p0.mId);
                   MagicEmoji magicEmoji = b.d().b(p0.mGroupId);
                   if (magicEmoji == null || q.f(magicEmoji.mMagicFaces)) {
                      b uob = b.D();
                      StringBuilder str1 = "没有找到魔表所在的tab ";
                      String str2 = (magicEmoji == null)? "null": magicEmoji.mName;
                      Object[] objArray3 = new Object[0];
                      uob.w("SimilarPresenter", str1+str2, objArray3);
                   }else {
                      MagicBaseConfig mMagicEmojiI = p0.mMagicEmojiIndex;
                      mMagicEmojiI++;
                      while (mMagicEmojiI >= 0 && (mMagicEmojiI < magicEmoji.mMagicFaces.size() && uArrayList.size() < 15)) {
                         Object[] objArray4 = new Object[0];
                         b.D().w("SimilarPresenter", "预取 "+magicEmoji.mName+str+magicEmoji.mMagicFaces.get(mMagicEmojiI).mName, objArray4);
                         uArrayList.add(magicEmoji.mMagicFaces.get(mMagicEmojiI).mId);
                      }
                   }
                }
                this.V8(uArrayList);
             }
          }
          return;
       }
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e tz = this.z;
       if (tz == null) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = tz.getLayoutParams();
       e tt = this.t;
       int i = 0;
       MagicEmojiPageConfig mSimilarBarT = (tt != null)? tt.mSimilarBarTopMargin: 0;
       int i1 = mSimilarBarT / 2;
       if (i1 != layoutParams.topMargin) {
          Object[] objArray = new Object[i];
          b.D().w("SimilarPresenter", "updateListPosition topMargin to "+i1, objArray);
          layoutParams.topMargin = i1;
          this.z.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void Z8(MagicEmoji$MagicFace p0,List p1){
       Object[] objArray;
       boolean b;
       MagicEmojiPageConfig mTaskId;
       int i;
       MagicEmoji$MagicFace magicFace;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "10")) {
          return;
       }
       String str = "-";
       String str1 = "updateSimilarListView ";
       String str2 = "SimilarPresenter";
       if (p0 == null || q.f(p1)) {
          if (p0 == null) {
             objArray = new Object[0];
             b.D().w(str2, "updateSimilarListView no magic", objArray);
          }else {
             Object[] objArray1 = new Object[0];
             b.D().w(str2, str1+p0.mName+str+p0.mId+" no similar", objArray1);
          }
          this.S8();
          p.b().m(this.R8(), null);
       }else {
          Object[] objArray2 = new Object[0];
          b.D().w(str2, str1+p0.mName+str+p0.mId+" similar size "+p1.size(), objArray2);
          b = true;
          if (this.B == null && !PatchProxy.applyVoid(null, this, uoe, "5")) {
             e ty = this.y;
             if (ty != null && ty.getParent() != null) {
                this.z = this.y.inflate();
             }
             ty = this.z;
             if (ty != null) {
                this.B = m1.f(ty, 0x7f0a396f);
                this.A = m1.f(this.z, 0x7f0a3972);
                ty = this.B;
                if (ty != null) {
                   ty.setLayoutManager(new SimilarPresenter$1(this, this.getContext(), b, 0));
                   this.B.addItemDecoration(new b(b, e.E, e.E, e.E));
                   this.B.setHasFixedSize(b);
                }
             }
          }
       label_00aa :
          if (this.B == null) {
             objArray = new Object[0];
             b.D().w(str2, "mSimilarMagicList is null, cann\'t show", objArray);
             return;
          }else {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(p0);
             if (i.b(uArrayList, this.t).isEmpty()) {
                this.S8();
                return;
             }else {
                uArrayList.addAll(p1);
                e tD = this.D;
                if (tD != null && tD.Q0() != null) {
                   MagicEmoji$MagicFace[] magicFaceArr = new MagicEmoji$MagicFace[this.D.Q0().size()];
                   magicFaceArr = new MagicEmoji$MagicFace[uArrayList.size()];
                   if (Arrays.equals(this.D.Q0().toArray(magicFaceArr), uArrayList.toArray(magicFaceArr))) {
                      tD = null;
                   label_019b :
                      e tD1 = this.D;
                      if (tD1 == null) {
                         MagicFaceAdapter magicFaceAda = PatchProxy.apply(null, this, uoe, "6");
                         if (magicFaceAda != patchProxyRe) {
                         }else {
                            MagicFaceAdapter$a uoa1 = MagicFaceAdapter.H1();
                            uoa1.c(a.b(this.getContext(), "magicFace"));
                            uoa1.f(this.v);
                            uoa1.d(this.B);
                            uoa1.i = b;
                            uoa1.e(new b(this));
                            if (this.t != null) {
                               uoa1.b(this.R8());
                            }
                            magicFaceAda = uoa1.a();
                         }
                         this.D = magicFaceAda;
                         magicFaceAda.G0(b);
                         this.D.W0(uArrayList);
                         this.B.setAdapter(this.D);
                      }else if(tD != null){
                         tD1.W0(uArrayList);
                         this.D.k0();
                      }else {
                         magicFace = p.b().c(this.R8());
                         if (magicFace != null) {
                            i1 = uArrayList.indexOf(magicFace);
                            if (i1 >= 0) {
                               this.D.l0(i1);
                               e tC = this.C;
                               if (tC != i1) {
                                  this.D.l0(tC);
                                  this.C = i1;
                               }
                            }
                         }
                         this.D.p0(0, uArrayList.size());
                      }
                      p.b().m(this.R8(), uArrayList);
                      if (!PatchProxy.applyVoid(null, this, uoe, "12")) {
                         n.Y(this.z, 0, 0);
                      }
                      if (tD) {
                         tD1 = this.B;
                         if (tD1 != null) {
                            tD1.requestLayout();
                         }
                      }
                      if (tD) {
                         this.W8(this.C, 0);
                      }
                   }
                }
                tD = this.t;
                if (tD != null) {
                   mTaskId = tD.mTaskId;
                   a uoa = a.class;
                   if (!PatchProxy.applyVoidTwoRefs(uArrayList, mTaskId, null, uoa, "2")) {
                      Object[] objArray3 = new Object[0];
                      b.D().y(str2, "logShowEvent", objArray3);
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "RECO_MAGIC_FACE";
                      i3 oi3 = i3.f();
                      oi3.d("task_id", mTaskId);
                      uElementPack.params = oi3.e();
                      ClientContent$ContentPackage uContentPack = PatchProxy.applyOneRefs(uArrayList, null, uoa, "3");
                      if (uContentPack != patchProxyRe) {
                      }else {
                         uContentPack = new ClientContent$ContentPackage();
                         ClientContent$MagicFaceShowPackage magicFaceSho = new ClientContent$MagicFaceShowPackage();
                         uContentPack.magicFaceShowPackage = magicFaceSho;
                         ClientContent$MagicFacePackage[] magicFacePac = new ClientContent$MagicFacePackage[uArrayList.size()];
                         magicFaceSho.magicFacePackage = magicFacePac;
                         for (i1 = 0; i1 < uArrayList.size(); i1 = i2) {
                            int i2 = i1 + 1;
                            uContentPack.magicFaceShowPackage.magicFacePackage[i1] = a.a(uArrayList.get(i1), i2, uArrayList.get(0).mId);
                         }
                      }
                      u1.u0(b, uElementPack, uContentPack);
                   }
                }
                this.C = 0;
                mTaskId = p.b().c(this.R8());
                if (mTaskId != null) {
                   i = uArrayList.indexOf(mTaskId);
                   if (i >= 0) {
                      this.C = i;
                   }
                }
                tD = 1;
                goto label_019b ;
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.y = p0.findViewById(0x7f0a396e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.v = this.r8("SOURCE");
       this.t = this.t8("MAGIC_EMOJI_PAGE_CONFIG");
       this.w = this.r8("MAGIC_EMOJI_PAGE_CONFIG_CHANGED");
       this.u = this.t8("SELECT_MAGIC_FACE_LISTENER");
       this.x = this.r8("SELECTED_MAGIC_PUBLISHER");
       return;
    }
}
