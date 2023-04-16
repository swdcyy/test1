package com.yxcorp.gifshow.relation.explore.presenter.gallery.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.framework.model.user.RecoUser;
import com.kwai.framework.model.user.User;
import yl8.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.i;
import erd.o;
import t45.d;
import brd.z;
import iac.f0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.widget.ImageView;
import android.widget.TextView;
import wca.m;
import lnc.a1;
import wca.a;
import iac.c0;
import android.view.View$OnClickListener;
import iac.d0;
import iac.e0;
import y8c.d;
import io.reactivex.subjects.PublishSubject;
import f7c.c;

public class j extends PresenterV2	// class@001846
{
    public TextView p;
    public RecoUser q;
    public d r;
    public PublishSubject s;
    public c t;
    public PublishSubject u;
    public PublishSubject v;

    public void j(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       RecoUser tag = this.m8().getTag(R.id.item_view_bind_data);
       if (tag instanceof RecoUser) {
          this.q = tag;
       }
       tag = this.q.mUser;
       if (tag == null) {
          return;
       }else {
          this.P8(tag);
          this.q.mUser.b();
          this.X7(this.q.mUser.observable().distinctUntilChanged(i.b).observeOn(d.a).subscribe(new f0(this), Functions.d()));
          return;
       }
    }
    public void P8(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
          return;
       }
       if (p0.isFollowingOrFollowRequesting()) {
          m.b(p0, this.p, null, this.p);
          this.p.setBackgroundResource(R.drawable.arg_RES_7f0801b2);
          this.p.setTextColor(a1.a(R.color.arg_RES_7f061d96));
       }else {
          a.b(p0, this.p, null, this.p);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       p0.findViewById(R.id.close_btn).setOnClickListener(new c0(this));
       this.p = p0.findViewById(0x7f0a0f4c);
       p0.findViewById(R.id.gallery_item).setOnClickListener(new d0(this));
       this.p.setOnClickListener(new e0(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.q = this.r8("PYMK_ACCESS_IDSitem_data");
       this.r = this.r8("ADAPTER_POSITION_GETTER");
       this.s = this.r8("PYMK_ACCESS_IDScurrentUser");
       this.t = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.u = this.r8("PYMK_ACCESS_IDSfollowUser_position");
       this.v = this.r8("PYMK_ACCESS_IDSclose_user");
       return;
    }
}
