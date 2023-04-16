package com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextsRequestListener;
import ui9.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$b;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import t4b.k;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$c;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.List;
import java.util.Collection;
import com.kwai.video.westeros.models.TriggerInputTextGroupConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.video.westeros.models.TriggerInputTextConfig;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.kwai.video.westeros.models.TriggerInputTextData;
import t4b.h;
import java.util.Objects;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import xi9.n;
import ce9.l;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import t4b.j;
import com.yxcorp.gifshow.camerasdk.q;
import s5b.b;
import q87.c;
import wc9.v;
import t4b.l;
import android.app.Activity;
import t4b.l$b$a;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$f;
import android.content.DialogInterface$OnDismissListener;
import jz6.a;
import android.app.Dialog;
import java.lang.StringBuilder;
import android.view.View;
import t4b.t;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$e;
import erd.g;
import crd.b;
import je9.a;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$onViewCreated$2;
import te9.b;
import msd.l;
import ui9.j;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$d;
import java.lang.Runnable;
import ekd.k1;

public final class MagicMultiInputTextController extends d implements FaceMagicController$FaceMagicInputTextsRequestListener, b	// class@000e42
{
    public k n;
    public l o;
    public final MagicMultiInputTextController$c p;
    public static final MagicMultiInputTextController$b q;

    static {
       MagicMultiInputTextController.q = new MagicMultiInputTextController$b(null);
    }
    public void MagicMultiInputTextController(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.d.n(k.class, new MagicMultiInputTextController$a(this));
       this.p = new MagicMultiInputTextController$c(this);
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       MagicMultiInputTextController magicMultiIn = this;
       if (PatchProxy.isSupport(MagicMultiInputTextController.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, MagicMultiInputTextController.class, "4")) {
          return;
       }
       k ok = null;
       List triggerInput = (p0 != null)? p0.getTriggerInputTextsConfigList(): ok;
       int i = 0;
       TriggerInputTextGroupConfig triggerInput1 = (triggerInput == null || triggerInput.isEmpty())? 1: null;
       if (triggerInput1) {
          magicMultiIn.n = ok;
          return;
       }else {
          triggerInput1 = p0.getInputTextGroupInfo();
          if (triggerInput1 != null) {
             if (!triggerInput1.getDefaultGroup()) {
                return;
             }else {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = triggerInput.iterator();
                int i1 = 0;
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   int i2 = i1 + 1;
                   if (i1 < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   TriggerInputTextData dataOrDefaul = obj.getDataOrDefault(MagicFaceExtraParams.getLanguage(), ok);
                   a.o(obj, "triggerInputTextConfig");
                   String title = obj.getTitle();
                   a.o(title, "triggerInputTextConfig.title");
                   String inputHint = (dataOrDefaul != null)? dataOrDefaul.getInputHint(): ok;
                   String str = "";
                   String str1 = (inputHint != null)? inputHint: str;
                   String str2 = (dataOrDefaul == null || !dataOrDefaul.getTextCount())? str: dataOrDefaul.getText(i);
                   a.o(str2, "if \(data == null || data¡­\) \"\" else data.getText\(0\)");
                   if (triggerInput1.getGroupMemberNum()) {
                      i1 = i1 % triggerInput1.getGroupMemberNum();
                      if (i1) {
                         i1 = 0;
                      label_00b3 :
                         h oh = new h(title, str1, str2, i1, obj.getMaxInputLength());
                         uArrayList.add(v15);
                         i1 = i2;
                      }
                   }
                   i1 = 1;
                   goto label_00b3 ;
                }
                ok = new k(uArrayList.subList(i, (triggerInput1.getDefaultGroup() * triggerInput1.getGroupMemberNum())), uArrayList.subList((triggerInput1.getDefaultGroup() * triggerInput1.getGroupMemberNum()), uArrayList.size()));
                magicMultiIn.n = ok;
                a.m(ok);
                ok.c = triggerInput1.getMaxGroup();
                MagicMultiInputTextController n = magicMultiIn.n;
                a.m(n);
                n.b = triggerInput1.getMinGroup();
                n = magicMultiIn.n;
                a.m(n);
                n.a = triggerInput1.getGroupMemberNum();
                n = magicMultiIn.n;
                a.m(n);
                String groupName = triggerInput1.getGroupName();
                a.o(groupName, "it.groupName");
                Objects.requireNonNull(n);
                if (!PatchProxy.applyVoidOneRefs(groupName, n, k.class, "1")) {
                   a.p(groupName, "<set-?>");
                   n.d = groupName;
                }
                n = magicMultiIn.n;
                a.m(n);
                n.e = triggerInput1.getDefaultGroup();
             }
          }
          return;
       }
    }
    public final void f2(List p0,boolean p1){
       MagicMultiInputTextController magicMultiIn = MagicMultiInputTextController.class;
       if (PatchProxy.isSupport(magicMultiIn) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, magicMultiIn, "8")) {
          return;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.iterator();
       j oj = null;
       int i = 0;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          hashMap.put(Integer.valueOf(i), obj.a());
          i = i1;
       }
       d tg = this.g;
       if (tg != null) {
          tg.B(hashMap);
       }
       l a = this.d.d(l.i).a;
       if (a != null && !p1) {
          SimpleMagicFace mId = a.mId;
          if (mId == null || !mId.length()) {
             oj = 1;
          }
          if (!oj) {
             SimpleMagicFace mId1 = a.mId;
             a.o(mId1, "it.mId");
             this.d.m(new j(mId1, hashMap));
          }
       }
    label_0075 :
       return;
    }
    public final void g2(int p0){
       Object[] objArray1;
       MagicMultiInputTextController magicMultiIn = MagicMultiInputTextController.class;
       if (PatchProxy.isSupport(magicMultiIn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, magicMultiIn, "6")) {
          return;
       }
       int i = 0;
       String str = "MagicMultiInputTextController";
       if (this.o != null || this.n == null) {
          Object[] objArray = new Object[i];
          b.D().w(str, this.o+" ... "+this.n, objArray);
          return;
       }else {
          d th = this.h;
          a.o(th, "mCameraHelper");
          if (th.isRecording()) {
             objArray1 = new Object[i];
             b.D().w(str, "isRecording", objArray1);
             return;
          }else if(this.d.d(v.e).b != null){
             objArray1 = new Object[i];
             b.D().w(str, "isCountdowning", objArray1);
             return;
          }else {
             d te = this.e;
             a.o(te, "mActivity");
             MagicMultiInputTextController tn = this.n;
             a.m(tn);
             l ol = new l(te, this.p, tn, p0);
             this.o = ol;
             ol.setOnDismissListener(new MagicMultiInputTextController$f(this));
             MagicMultiInputTextController to = this.o;
             if (to != null) {
                to.show();
             }
             return;
          }
       }
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicMultiInputTextController.class, "1")) {
          return;
       }
       super.k(p0);
       this.d.l(t.class, new MagicMultiInputTextController$e(this));
       this.d.l(a.class, new b(new MagicMultiInputTextController$onViewCreated$2(this)));
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicMultiInputTextController.class, "2")) {
          return;
       }
       a.p(p0, "camera");
       super.nb(p0);
       j oj = p0.q();
       if (oj != null) {
          oj.F(this);
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MagicMultiInputTextController.class, "3")) {
          return;
       }
       super.onDestroyView();
       d th = this.h;
       if (th != null) {
          j oj = th.q();
          if (oj != null) {
             oj.F(null);
          }
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void onInputTextsRequest(int p0){
       MagicMultiInputTextController magicMultiIn = MagicMultiInputTextController.class;
       if (PatchProxy.isSupport(magicMultiIn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, magicMultiIn, "5")) {
          return;
       }
       k1.o(new MagicMultiInputTextController$d(this, p0));
       return;
    }
}
