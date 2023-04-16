package com.kuaishou.live.core.show.wishlist.detail.widget.LiveWishListDetailFragmentV2;
import un2.a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import un2.b;
import t02.a0;
import t02.r1;
import p91.m;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import xn2.a;
import nn2.p;
import java.util.Set;
import rn2.b;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.DialogInterface;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import java.util.Iterator;
import nn2.y1;
import tn2.b;
import qn2.d;
import vn2.c;
import com.kuaishou.live.core.show.wishlist.sendgift.c;
import tkd.b;
import tkd.d;
import h02.b;
import java.util.List;
import com.kuaishou.live.core.show.wishlist.detail.sponsors.a;
import f37.y;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import nn2.r1;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import rn2.a;

public class LiveWishListDetailFragmentV2 extends LiveDialogContainerFragment implements a	// class@0012d7
{
    public final b A;
    public PresenterV2 B;
    public a0 C;
    public r1 D;
    public m E;
    public boolean F;
    public String G;
    public String H;

    public void LiveWishListDetailFragmentV2(){
       super();
       this.A = new b();
    }
    public static LiveWishListDetailFragmentV2 Eh(a0 p0,r1 p1,m p2,boolean p3,String p4,String p5){
       LiveWishListDetailFragmentV2 obj;
       if (PatchProxy.isSupport(LiveWishListDetailFragmentV2.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4,p5};
          obj = PatchProxy.apply(objArray, null, LiveWishListDetailFragmentV2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveWishListDetailFragmentV2();
       obj.C = p0;
       obj.D = p1;
       obj.E = p2;
       obj.F = p3;
       obj.G = p4;
       obj.H = p5;
       return obj;
    }
    public void Df(a p0){
       this.A.o = p0;
    }
    public void I8(p p0){
    }
    public void Xb(Set p0){
       this.A.k = p0;
    }
    public void af(Set p0){
       this.A.n = p0;
    }
    public void d6(b p0){
       this.A.m = p0;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWishListDetailFragmentV2.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (!PatchProxy.applyVoid(null, this, LiveWishListDetailFragmentV2.class, "8")) {
          p0.b = this.getActivity();
          LiveWishListDetailFragmentV2 tA = this.A;
          tA.c = this;
          tA.d = this.E;
          tA.f = this.C;
          tA.e = this.D;
          tA.g = this.F;
          tA.h = this.G;
          tA.i = this.H;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveWishListDetailFragmentV2.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = (this.F != null)? 0x7f0d0a68: 0x7f0d09d8;
       return a.g(p0, i, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveWishListDetailFragmentV2.class, "5")) {
          return;
       }
       super.onDestroyView();
       LiveWishListDetailFragmentV2 tB = this.B;
       if (tB != null) {
          tB.unbind();
          this.B.destroy();
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWishListDetailFragmentV2.class, "6")) {
          return;
       }
       super.onDismiss(p0);
       b k = this.A.k;
       if (k == null) {
          return;
       }
       Iterator iterator = k.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWishListDetailFragmentV2.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       String str = "7";
       Object[] objArray = null;
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, LiveWishListDetailFragmentV2.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new b());
          presenterV2.U7(new d());
          if (this.A.g != null) {
             presenterV2.U7(new c());
             presenterV2.U7(new c());
          }else {
             Iterator iterator1 = d.a(-204054297).Aa().iterator();
             while (iterator1.hasNext()) {
                presenterV2.U7(iterator1.next());
             }
          }
          presenterV2.U7(new a());
          presenterV2.U7(d.a(0x6fa7b5d6).D(72));
          PatchProxy.onMethodExit(LiveWishListDetailFragmentV2.class, str);
       }
       presenterV2.f(p0);
       int i = 1;
       Object[] objArray1 = new Object[i];
       int i1 = 0;
       objArray1[i1] = this.A;
       presenterV2.i(objArray1);
       this.B = presenterV2;
       String liveStreamId = this.E.getLiveStreamId();
       str = this.E.d();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.E.y();
       LiveStreamFeedWrapper liveStreamFe = this.E.r5();
       if (!PatchProxy.applyVoidFourRefs(liveStreamId, str, liveVoicePar, liveStreamFe, null, r1.class, "9")) {
          int i2 = 1476;
          int i3 = -1;
          Object[] objArray3 = (liveStreamFe == null)? objArray: liveStreamFe.mEntity;
          r1.s(i2, i3, liveStreamId, str, liveVoicePar, objArray3);
       }
       String liveStreamId1 = this.E.getLiveStreamId();
       String str1 = this.E.d();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar1 = this.E.y();
       LiveStreamFeedWrapper liveStreamFe1 = this.E.r5();
       r1 or1 = r1.class;
       if (PatchProxy.isSupport(or1)) {
          Object[] objArray2 = new Object[]{liveStreamId1,str1,Integer.valueOf(i),liveVoicePar1,liveStreamFe1};
          if (PatchProxy.applyVoid(objArray2, objArray, or1, "10")) {
          label_011b :
             b k = this.A.k;
             if (k == null) {
                return;
             }else {
                Iterator iterator = k.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b(this.u, this.xh());
                }
                return;
             }
          }
       }
       if (liveStreamFe1 != null) {
          objArray = liveStreamFe1.mEntity;
       }
       r1.s(1478, 1, liveStreamId1, str1, liveVoicePar1, objArray);
       goto label_011b ;
    }
    public void x7(a p0){
       this.A.l = p0;
    }
}
