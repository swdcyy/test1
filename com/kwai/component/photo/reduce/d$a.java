package com.kwai.component.photo.reduce.d$a;
import com.kwai.component.photo.reduce.d$b;
import com.kwai.component.photo.reduce.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import l66.a;
import dda.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import gda.a;
import com.yxcorp.gifshow.action.c;
import org.greenrobot.eventbus.a;
import cda.e;
import yf5.p;
import yf5.c;
import xpa.g;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ayb.g;
import java.util.Objects;
import cda.i;
import e17.i;
import java.lang.Integer;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
import e17.i$b;
import com.kwai.library.widget.popup.common.f;
import java.lang.Throwable;
import yf5.l;

public class d$a implements d$b	// class@000add
{
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final String f;
    public final d g;

    public void d$a(d p0,String p1,int p2,boolean p3,String p4,int p5,String p6){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       a uoa = b.a(0x6d2a4fdd);
       QPhoto mEntity = this.g.a.mEntity;
       String str = (TextUtils.x(this.a))? "0": this.a;
       uoa.b(new i(mEntity, str));
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mNegativeType = a.b(this.a, this.g.a.mEntity);
       c.b(9, this.g.a.mEntity, uExtParams);
       if (this.b == 1) {
          a.d().k(new e(this.g.a.getPhotoId(), false, this.a));
       }
       return;
    }
    public void b(){
       i oi;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, d$a.class, str)) {
          return;
       }
       p.c(this.g.a.getPhotoId());
       c c = c.c;
       String photoId = this.g.a.getPhotoId();
       if (!PatchProxy.applyVoidOneRefs(photoId, objArray, c.class, str)) {
          str = "photoId";
          if (!PatchProxy.applyVoidOneRefs(photoId, objArray, g.class, str)) {
             a.p(photoId, str);
             Objects.requireNonNull(c);
             c.b = TextUtils.n(d.a(-908290672).Iy(), photoId);
          }
          a.p(photoId, str);
       }
       d$a tb = this.b;
       boolean b = false;
       boolean b1 = true;
       if (tb == 3) {
          oi = new i(false, this.g.a.getPhotoId(), true, this.g.a.getUserId(), this.c, true);
          a.d().k(objArray);
          a.d().k(new e(this.g.a.getPhotoId(), b, this.a, b1));
       }else if(tb == b1){
          a.d().k(new e(this.g.a.getPhotoId(), b1, this.a));
       }else {
          d$a uoa = 2;
          if (tb == uoa) {
             i oi1 = new i(false, this.g.a.getPhotoId(), false, this.g.a.getUserId(), this.c);
             a.d().k(v7);
          }else {
             a uoa1 = a.d();
             boolean b2 = false;
             String photoId1 = this.g.a.getPhotoId();
             boolean b3 = (this.b != uoa)? true: false;
             oi = new i(b2, photoId1, b3, this.g.a.getUserId(), this.c, false, true);
             uoa1.k(v12);
          }
       }
       int i = 0x7f100a69;
       if (("PYMK").equals(this.d)) {
          i.a(R.style.arg_RES_7f11066a, i);
       }else {
          tb = this.g;
          d$a te = this.e;
          d$a tf = this.f;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(te), tf, tb, d.class, "10")) {
             if (!TextUtils.x(tf)) {
                i.d(R.style.arg_RES_7f11066a, tf);
             }else if(!FeedMiscPojo.isFeedRecommendEnabled() && (te == 8 || te == 90)){
                i$b uob = i.m();
                uob.y(f.o(R.string.arg_RES_7f100a62));
                i.z(uob);
             }else {
                i.a(R.style.arg_RES_7f11066a, i);
             }
          }
       }
       return;
    }
    public void c(Throwable p0){
       l.a(this, p0);
    }
}
