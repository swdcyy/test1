package com.yxcorp.gifshow.share.screenshot.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import android.content.Context;
import r4d.a;
import h4d.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.ArrayList;
import uic.b0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import androidx.fragment.app.DialogFragment;
import android.view.View;
import java.util.Iterator;
import n80.b;
import java.lang.StringBuilder;
import q87.c;
import uic.b;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextPaint;
import android.net.Uri;

public class o extends PresenterV2	// class@001c61
{
    public String A;
    public String B;
    public BaseFeed C;
    public int D;
    public DialogFragment E;
    public KwaiImageView p;
    public ImageView q;
    public View r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;
    public TextView x;
    public Uri y;
    public String z;

    public void o(){
       super();
    }
    public void E8(){
       Iterator iterator;
       Object obj = this;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, oo, "3")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, obj, oo, "7")) {
          o oo1 = (!TextUtils.x(obj.z) && a.a(this.getActivity(), 6).isAvailable())? 1: null;
          int i3 = (obj.D == 34 && (obj.C != null && new QPhoto(obj.C).canDownload()))? 1: 0;
          ArrayList uArrayList = new ArrayList(4);
          ArrayList uArrayList1 = new ArrayList(4);
          ArrayList uArrayList2 = new ArrayList(4);
          if (oo1) {
             oo1 = obj.A;
             o z = obj.z;
             o oo2 = obj.B;
             o oo3 = z;
             o oo4 = z;
             if (!PatchProxy.applyVoidThreeRefs(oo1, oo3, oo2, null, b0.class, "3")) {
                String str = TextUtils.k(oo4);
                String str1 = TextUtils.k(oo2);
                ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                uElementPack1.action2 = "SHOW_SHARE_SCREEN_SHOT";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                if (("photo").equals(TextUtils.k(oo1))) {
                   ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
                   uContentPack.photoPackage = photoPackage;
                   photoPackage.identity = str;
                   photoPackage.sAuthorId = str1;
                   u1.v0(4, uElementPack1, uContentPack, objArray);
                }else {
                   ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   liveStreamPa.identity = str;
                   u1.v0(4, uElementPack1, uContentPack, objArray);
                }
             }
             uArrayList2.add(obj.q);
             uArrayList2.add(obj.r);
          }else {
             uArrayList.add(obj.q);
             uArrayList.add(obj.r);
             uArrayList1.add(obj.u);
             uArrayList1.add(obj.v);
          }
          if (!PatchProxy.applyVoid(objArray, objArray, b0.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SCREENSHOT_FEEDBACK";
             u1.v0(4, uElementPack, objArray, objArray);
          }
          uArrayList2.add(obj.s);
          if (i3) {
             uArrayList2.add(obj.t);
          }else {
             uArrayList.add(obj.t);
             uArrayList1.add(obj.w);
          }
          if (uArrayList2.size() != 4) {
             if (!uArrayList2.size()) {
                obj.E.dismissAllowingStateLoss();
             }else {
                int i4 = 8;
                if (uArrayList2.size() == 3) {
                   uArrayList.get(i).setVisibility(i4);
                   uArrayList1.get(i).setVisibility(i4);
                }else if(uArrayList2.size() == 2){
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().setVisibility(i4);
                   }
                   iterator = uArrayList1.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().setVisibility(i4);
                   }
                }else if(uArrayList2.size() == 1){
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().setVisibility(i4);
                   }
                   iterator = uArrayList1.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().setVisibility(i4);
                   }
                }
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, obj, oo, "4")) {
          Object[] objArray1 = new Object[i];
          b.C().w("SCREEN_SHOT_SHARE", "old screenshot share uri :"+obj.y, objArray1);
          c3.c(obj.y, new b(obj));
          if (!PatchProxy.applyVoid(objArray, obj, oo, "5")) {
             int i1 = n.k(this.getActivity());
             int i2 = (i1 - a1.e(335.00f)) / 2;
             if (i2 < a1.e(21.00f)) {
                i2 = a1.e(16.00f);
                obj.P8(obj.q, i2);
                obj.P8(obj.r, i2);
                obj.P8(obj.s, i2);
                obj.P8(obj.t, i2);
                obj.P8(obj.p, ((i1 - a1.e(303.00f)) / 2));
             }else {
                obj.P8(obj.p, i2);
             }
          }
       }
       return;
    }
    public final void P8(View p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oo, "6")) {
          return;
       }
       ConstraintLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.setMarginStart(p1);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a373c);
       this.q = m1.f(p0, 0x7f0a139a);
       this.r = m1.f(p0, 0x7f0a1399);
       this.s = m1.f(p0, 0x7f0a1366);
       this.t = m1.f(p0, 0x7f0a1364);
       this.u = m1.f(p0, 0x7f0a3e77);
       this.v = m1.f(p0, 0x7f0a3e76);
       this.w = m1.f(p0, 0x7f0a3e0a);
       TextView textView = m1.f(p0, R.id.layout_title);
       this.x = textView;
       textView.getPaint().setFakeBoldText(true);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.y = this.t8("SCREEN_SHOT_URI");
       this.z = this.r8("SCREEN_SHOT_CONTENT_ID");
       this.A = this.r8("SCREEN_SHOT_CONTENT_TYPE");
       this.B = this.r8("SCREEN_SHOT_AUTHOR_ID");
       this.C = this.t8("SCREEN_SHOT_FEED");
       this.D = this.r8("SCREEN_SHOT_CHANNEL").intValue();
       this.E = this.r8("SCREEN_SHOT_DIALOG_FRAGMENT");
       return;
    }
}
