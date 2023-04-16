package com.yxcorp.gifshow.activity.share.presenter.o;
import hka.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.kwai.feature.post.api.feature.publish.model.PublishBackDialogStyleParam;
import com.kwai.feature.post.api.feature.publish.model.PublishBackDialogStyleParam$b;
import xw8.p0;
import java.util.Set;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.d7;
import java.util.Objects;
import lq.i;
import lnc.p3;
import q87.c;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import android.widget.Button;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import bba.b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.edit.draft.Workspace$Source;
import java.util.ArrayList;
import lnc.x$c;
import lnc.a1;
import zw8.r;
import java.lang.Runnable;
import java.util.List;
import lnc.x;
import wba.p0;
import zw8.q;
import zw8.s;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.dialog.PostDialogPlugin;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import kotlin.Pair;
import zw8.t;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.Attributes;
import com.google.protobuf.Timestamp;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Math;
import f66.i;
import jq.a;

public class o extends PresenterV2 implements a	// class@00141d
{
    public FrameLayout p;
    public Button q;
    public p0 r;
    public GifshowActivity s;
    public c t;
    public b u;
    public long v;
    public String w;
    public int x;
    public boolean y;
    public PublishBackDialogStyleParam z;

    public void o(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity().getIntent() != null) {
          PublishBackDialogStyleParam publishBackD = j0.e(this.getActivity().getIntent(), "back_dialog_style");
          this.z = publishBackD;
          if (publishBackD == null) {
             this.z = new PublishBackDialogStyleParam$b().a();
          }
       }
       this.r.t.add(this);
       boolean b = (TextUtils.x(this.w) || (!(this.w).contains("preview") && (!(this.w).contains("previewimport") && ((this.w).contains("from_third_app") || (this.w).equals("import")))))? true: false;
       this.y = b;
       return;
    }
    public final void P8(int p0){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo, "8")) {
          return;
       }
       Object[] objArray = 1;
       if (!PatchProxy.applyVoid(null, null, a.class, "34")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 824;
          uElementPack.name = "back_to_edit";
          u1.u(objArray, uElementPack, new ClientContent$ContentPackage());
       }
       this.r.a(p0);
       if (TextUtils.x(this.w) || !(this.w).equals("import")) {
          objArray = null;
       }
       if (objArray) {
          Objects.requireNonNull(d7.a);
          if (i.h()) {
             objArray = new Object[false];
             p3.D().w("PostSessionUtils", "clearShareSettingInPostSession, hotspot and serviceLink clear.", objArray);
             i.m().Q("connect_hotspot", null);
             i.m().Q("serviceLinkData", null);
          }
          i.m().s();
          i.m().j(false);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a31e0);
       this.q = m1.f(p0, 0x7f0a1716);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.r = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.s = this.r8("SHARE_ACTIVITY");
       this.t = this.t8("WORKSPACE");
       this.u = this.t8("PUBLISH");
       this.v = this.r8("DRAFT_UPDATE_TIME").longValue();
       this.w = this.t8("SHARE_FROM_PAGE");
       this.x = this.r8("WorkspaceEditingAction").intValue();
       return;
    }
    public boolean onBackPressed(){
       ArrayList uArrayList;
       int i3;
       o oo = o.class;
       Object[] objArray = null;
       o obj = PatchProxy.apply(objArray, this, oo, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.p.getVisibility()) {
          oo = this.r;
          Objects.requireNonNull(oo);
          if (!PatchProxy.applyVoid(objArray, oo, p0.class, "2")) {
             oo.d.onNext(new Object());
          }
       }else {
          int i = 0;
          if (this.r.b()) {
             this.r.p(i);
          }else if(this.t != null){
             obj = (this.getActivity() != null && this.q != null)? 1: null;
             if (this.y != null && obj) {
                int i1 = 0x7f10034a;
                int i2 = 0x7f081b7f;
                if (this.t.T0() == Workspace$Source.JUXING) {
                   if (!PatchProxy.applyVoid(objArray, this, oo, "7")) {
                      a.i();
                      uArrayList = new ArrayList();
                      uArrayList.add(new x$c(i2, a1.p(i1), new r(this), true));
                      x.g(this.getActivity(), this.q, uArrayList, i, objArray);
                   }
                }else if(p0.a(this.t.T0())){
                   this.P8(this.x);
                }else if(PatchProxy.applyVoid(objArray, this, oo, "5")){
                   a.i();
                   uArrayList = new ArrayList();
                   boolean b = (this.z.mFirstBtnTxt).equals(a1.p(R.string.arg_RES_7f1042cf));
                   q oq = (b || (this.z.mFirstBtnTxt).equals(a1.p(0x7f100c50)))? 1: null;
                   if (!oq) {
                      i2 = 0x7f081b6b;
                   }
                   String str = (b)? a1.p(i1): this.z.mFirstBtnTxt;
                   uArrayList.add(new x$c(i2, str, new q(this), true));
                   uArrayList.add(new x$c(R.drawable.arg_RES_7f081b66, a1.p(R.string.arg_RES_7f1047a2), new s(this), i));
                   Pair pair = d.a(0x34dc9f9c).sl(uArrayList, PostDialogPlugin$DialogScenario.SHARE_BACK_WITHOUT_DRAFT);
                   x.g(this.getActivity(), this.q, pair.getFirst(), i, new t(pair));
                   x.f();
                }
             }else if(("H5").equals(this.w)){
                this.r.a(true);
             }else {
                oo = this.x;
                obj = this.u;
                if (obj != null) {
                   objArray = obj.v();
                }
                if (objArray != null && !Math.max(DraftUtils.s(this.t), DraftUtils.l0(objArray.getAttributes().getModifiedAt())) - this.v) {
                   Object[] objArray1 = new Object[i];
                   a.b().s("share_draft_tag", "onBackPressed draft has not updated, discard draft", objArray1);
                   if ((TextUtils.k(this.w)).equalsIgnoreCase("review")) {
                      i3 = 1;
                   }
                }
                this.P8(i3);
             }
          }else {
             this.P8(this.x);
          }
       }
       return true;
    }
}
