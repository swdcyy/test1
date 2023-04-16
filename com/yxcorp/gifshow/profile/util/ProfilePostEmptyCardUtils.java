package com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils$disableSmartAlbum$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils$postCardABType$2;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils$isDisableGuideView$2;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils$postCardFrequencyDays$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import z5c.l2;
import s1c.o;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.lang.Boolean;
import lnc.a1;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Math;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import s1c.q;
import q87.c;
import java.lang.CharSequence;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import android.app.Application;
import o56.a;
import qh7.b;
import qh7.a;

public final class ProfilePostEmptyCardUtils	// class@0015ce
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final ProfilePostEmptyCardUtils e;

    static {
       ProfilePostEmptyCardUtils.e = new ProfilePostEmptyCardUtils();
       ProfilePostEmptyCardUtils.a = s.c(ProfilePostEmptyCardUtils$disableSmartAlbum$2.INSTANCE);
       ProfilePostEmptyCardUtils.b = s.c(ProfilePostEmptyCardUtils$postCardABType$2.INSTANCE);
       ProfilePostEmptyCardUtils.c = s.c(ProfilePostEmptyCardUtils$isDisableGuideView$2.INSTANCE);
       ProfilePostEmptyCardUtils.d = s.c(ProfilePostEmptyCardUtils$postCardFrequencyDays$2.INSTANCE);
    }
    public void ProfilePostEmptyCardUtils(){
       super();
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = ProfilePostEmptyCardUtils.b.getValue();
       }
       return obj.intValue();
    }
    public final List b(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, ProfilePostEmptyCardUtils.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l2.R;
       String str = o.a.getString(b.d("user")+"empty_profile_recommend_smart_album_id_list", "{}");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       if (objArray == null) {
          objArray = new ArrayList();
       }
       return objArray;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (o.a.getBoolean(b.d("user")+"is_user_closed_empty_profile_promote_post_card", false)) {
          if (this.g()) {
             this.i("isClosedPromotePostCard", "user is closed PromotePostCard");
             return true;
          }else {
             o.t(false);
          }
       }
       return false;
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a())? true: false;
       return b;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.a() != b) {
          b = false;
       }
       return b;
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, ProfilePostEmptyCardUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a() == 2)? true: false;
       return b;
    }
    public final boolean g(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProfilePostEmptyCardUtils profilePostE = ProfilePostEmptyCardUtils.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, profilePostE, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       long l = (long)Math.abs(DateUtils.r(o.a.getLong(b.d("user")+"last_empty_profile_post_card_close_timestamp", 0), a1.k()));
       Number number = PatchProxy.apply(objArray, this, profilePostE, "4");
       if (number == patchProxyRe) {
          number = ProfilePostEmptyCardUtils.d.getValue();
       }
       b = (l - number.longValue() < 0)? true: false;
       return b;
    }
    public final void h(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ProfilePostEmptyCardUtils.class, "9")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "message");
       q.C().e("ProfileEmptyPostCard", p0+": "+p1, p2);
       return;
    }
    public final void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfilePostEmptyCardUtils.class, "8")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "message");
       Object[] objArray = new Object[0];
       q.C().w("ProfileEmptyPostCard", p0+": "+p1, objArray);
       return;
    }
    public final void j(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfilePostEmptyCardUtils.class, "22")) {
          return;
       }
       a.p(p0, "materialId");
       a.p(p1, "materialType");
       String str = null;
       int i = (!p1.length())? 1: 0;
       if (!i) {
          if (!p0.length()) {
             str = 1;
          }
          if (!str) {
             this.i("logMaterialClickEvent", "materialId: "+p0+", materialType: "+p1);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "EMPTY_MATERIAL_POPUP";
             i3 oi3 = i3.f();
             oi3.d("material_id", p0);
             oi3.d("material_type", p1);
             oi3.e();
             uElementPack.params = oi3.e();
             u1.L("4122303", null, 1, uElementPack, null);
          }
       }
       return;
    }
    public final void k(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfilePostEmptyCardUtils.class, "21")) {
          return;
       }
       a.p(p0, "materialId");
       a.p(p1, "materialType");
       String str = 1;
       int i = (!p1.length())? 1: 0;
       if (!i) {
          if (p0.length()) {
             str = null;
          }
          if (!str) {
             this.i("logMaterialShownEvent", "materialId: "+p0+", materialType: "+p1);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "EMPTY_MATERIAL_POPUP";
             i3 oi3 = i3.f();
             oi3.d("material_id", p0);
             oi3.d("material_type", p1);
             oi3.e();
             uElementPack.params = oi3.e();
             u1.C0("4116288", null, 0, uElementPack, null);
          }
       }
       return;
    }
    public final void l(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfilePostEmptyCardUtils.class, "7")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       b uob = (p0 != null && !p0.isFinishing())? b.j(p0, p1): b.j(a.b(), p1).o(0x10000000);
       a.b(uob, null);
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, ProfilePostEmptyCardUtils.class, "18")) {
          return;
       }
       if (!this.g()) {
          o.v(a1.k());
       }
       o.t(true);
       return;
    }
}
