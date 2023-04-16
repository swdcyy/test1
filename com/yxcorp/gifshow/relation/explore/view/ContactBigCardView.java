package com.yxcorp.gifshow.relation.explore.view.ContactBigCardView;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import android.widget.TextView;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView$b;
import com.yxcorp.gifshow.relation.explore.view.ContactBigCardView$c;
import fac.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import lac.a;
import erd.g;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.app.Application;
import o56.a;
import eg.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import fac.c;
import com.yxcorp.gifshow.pymk.ContactCard;
import java.lang.CharSequence;
import android.widget.LinearLayout$LayoutParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;

public class ContactBigCardView extends BaseCardView	// class@001886
{
    public final ContactPermissionHolder e;
    public b f;
    public static final int g;

    public void ContactBigCardView(Context p0){
       super(p0, null, 0);
    }
    public void ContactBigCardView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ContactBigCardView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new ContactPermissionHolder(new b(new c()));
       this.b = a.c(p0, 0x7f0d129e, this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ContactBigCardView.class, "5")) {
          return;
       }
       ContactBigCardView tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       return;
    }
    public void b(TextView p0,TextView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ContactBigCardView.class, "3")) {
          return;
       }
       p1.setBackgroundResource(R.drawable.arg_RES_7f0801be);
       p1.setTextColor(this.getResources().getColor(R.color.arg_RES_7f0620c7));
       if (!ContactPermissionHolder.f()) {
          p1.setText(R.string.arg_RES_7f1012ba);
          p1.setOnClickListener(new ContactBigCardView$a(this, p1));
       }else {
          p1.setText(R.string.arg_RES_7f100528);
          p1.setOnClickListener(new ContactBigCardView$b(this));
       }
       p0.setText(R.string.arg_RES_7f101518);
       p0.setOnClickListener(new ContactBigCardView$c(this, p0));
       b a = this.d.a;
       if (a != null) {
          this.f = a.Vg().j().subscribe(new a(p1));
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, ContactBigCardView.class, "1")) {
          return;
       }
       KwaiImageView kwaiImageVie = this.b.findViewById(R.id.user_image);
       ImageView imageView = this.b.findViewById(R.id.user_icon);
       TextView textView = this.b.findViewById(R.id.contact_tip1);
       TextView textView1 = this.b.findViewById(R.id.contact_tip2);
       if (!PatchProxy.applyVoidTwoRefs(kwaiImageVie, imageView, this, ContactBigCardView.class, "2")) {
          RelativeLayout$LayoutParams layoutParams1 = kwaiImageVie.getLayoutParams();
          int i = a.c((this.d.a() * 0x42f00000), a.b().getResources());
          layoutParams1.width = i;
          layoutParams1.height = i;
          kwaiImageVie.setLayoutParams(layoutParams1);
          layoutParams1 = imageView.getLayoutParams();
          i = a.c((this.d.a() * 40.00f), a.b().getResources());
          layoutParams1.width = i;
          layoutParams1.height = i;
          imageView.setLayoutParams(layoutParams1);
       }
       g.a(kwaiImageVie, QCurrentUser.me(), HeadImageSize.MIDDLE);
       textView.setTextSize(0, (float)a.c((this.d.d.e() * 20.00f), a.b().getResources()));
       textView.setText(this.c.mTitle);
       LinearLayout$LayoutParams layoutParams = textView.getLayoutParams();
       layoutParams.setMargins(0, a.c((this.d.a() * 32.00f), a.b().getResources()), 0, 0);
       textView.setLayoutParams(layoutParams);
       textView1.setTextSize(0, (float)a.c((this.d.a() * 14.00f), a.b().getResources()));
       textView1.setText(this.c.mDes);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OPEN_CONTACTS_CARD";
       u1.u0(6, uElementPack, null);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactBigCardView.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OPEN_CONTACTS_CARD";
       i3 oi3 = i3.f();
       oi3.d("click_area", p0);
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setLogPage(this.d.a).setType(1).setElementPackage(uElementPack));
       return;
    }
}
