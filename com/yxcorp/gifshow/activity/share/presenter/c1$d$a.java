package com.yxcorp.gifshow.activity.share.presenter.c1$d$a;
import y8c.r;
import com.yxcorp.gifshow.activity.share.presenter.c1$d;
import com.yxcorp.gifshow.activity.share.presenter.c1$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kuaishou.android.model.mix.Location;
import android.widget.ImageView;
import com.yxcorp.gifshow.activity.share.presenter.c1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import fx8.b;
import gx8.d;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import java.lang.Integer;
import lnc.a1;
import zw8.h2;
import android.view.View$OnClickListener;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;

public class c1$d$a extends r	// class@0013cc
{
    public c1$f i;
    public final c1$d j;

    public void c1$d$a(c1$d p0,c1$f p1){
       this.j = p0;
       super();
       this.i = p1;
    }
    public void z(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c1$d$a.class, "1")) {
          return;
       }
       int i = 0x7f0a294b;
       LinearLayout linearLayout = this.q(i);
       TextView textView = this.q(R.id.tv_title);
       Location location = this.t();
       ImageView imageView = this.q(R.id.iv_location);
       ImageView imageView1 = this.q(R.id.history_tag);
       TextView textView1 = this.q(R.id.reward_tag);
       int i1 = 8;
       if (!location.mId - -1) {
          imageView1.setVisibility(i1);
          textView1.setVisibility(i1);
          imageView.setVisibility(0);
          imageView.setImageDrawable(j.n(this.j.z.w, R.drawable.arg_RES_7f081ff8, 0x7f0616aa));
          this.q(i).setBackgroundResource(R.drawable.arg_RES_7f081fab);
          if (!PatchProxy.applyVoid(objArray, objArray, a.class, "66")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SEARCH_MORE_POI";
             u1.u0(3, uElementPack, objArray);
          }
       }else {
          imageView.setVisibility(i1);
          int i2 = this.j.P0(location) - this.j.r1();
          Object[] objArray1 = new Object[0];
          a.b().w("ShareLocationPresenter", "LocationItemPresenter onBind : Location title is "+location.mTitle+", iconType is "+d.a(imageView1, textView1, location), objArray1);
          this.q(i).setBackgroundResource(R.drawable.arg_RES_7f081ff6);
          c1$d z = this.j.z;
          i = 900;
          Objects.requireNonNull(z);
          if (!PatchProxy.isSupport(c1.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), location, Integer.valueOf(i2), z, c1.class, "23")) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action = i;
             uElementPack1.action2 = "RECO_LOCATION_TAG";
             u1.u0(6, uElementPack1, a.f(location, i2));
          }
       }
       if (!location.mId - -1) {
          linearLayout.setPadding(a1.d(R.dimen.arg_RES_7f07031b), 0, a1.d(R.dimen.arg_RES_7f07025d), 0);
       }else {
          linearLayout.setPadding(a1.d(R.dimen.arg_RES_7f07025d), 0, a1.d(R.dimen.arg_RES_7f07025d), 0);
       }
       textView.setOnClickListener(new h2(this, location));
       textView.setText(TextUtils.k(location.mTitle));
       return;
    }
}
