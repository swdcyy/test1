package nfd.f3;
import nfd.b0;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.String;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import nfd.i3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.google.gson.JsonObject;
import nfd.q1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import sy5.a;
import gbd.d;
import lnc.a1;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.utils.k;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import com.yxcorp.plugin.search.SearchPage;
import nfd.l0;
import w7d.i;
import com.yxcorp.utility.TextUtils;
import x6d.e;
import com.yxcorp.plugin.search.b;

public class f3 implements b0	// class@001da7
{
    public final SearchItem a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final Activity e;
    public final BaseFragment f;
    public final boolean g;

    public void f3(SearchItem p0,boolean p1,boolean p2,String p3,Activity p4,BaseFragment p5,boolean p6){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void a(){
       boolean b;
       String str;
       i3 oi3 = i3.class;
       f3 uof3 = f3.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof3, "2")) {
          return;
       }
       f3 ta = this.a;
       if (ta.mKBoxItem == null) {
          return;
       }
       f3 tf = this.f;
       if (!PatchProxy.applyVoidTwoRefs(ta, tf, this, uof3, "3")) {
          KBoxItem mType = ta.mKBoxItem.mType;
          if (mType == 2) {
             str = "SIDESLIP_BUTTON_SUBCARD";
          }else if(mType == 13){
             str = "AUTOPLAY_BUTTON_SUBCARD";
          }else if(mType != 15 && (mType == 20 || mType == 19)){
             str = "INTERACT_SLIDE_SUBCARD";
          }else if(mType == 34){
             str = "FILTERABLE_BUTTON_SUBCARD";
          }else if(mType == 35){
             str = "FILTERAUTOPLAY_BUTTON_SUBCARD";
          }else if(mType == 18){
             str = "ALADDINSP_SLIDE_BUTTON";
          }else {
             str = "";
          }
          JsonObject jsonObject = q1.r(objArray);
          ClientEvent$ElementPackage uElementPack = PatchProxy.applyThreeRefs(ta, str, jsonObject, null, q1.class, "32");
          if (uElementPack != PatchProxyResult.class) {
          }else {
             JsonObject jsonObject1 = q1.a(ta);
             if (jsonObject != null) {
                jsonObject1 = a.k().h(jsonObject).h(q1.a(ta)).j();
             }
             d uod = q1.p(ta);
             uod.a(str);
             uod.l(jsonObject1);
             uod.g(a1.p(R.string.arg_RES_7f104592));
             uElementPack = uod.d();
          }
          t.n(1, tf, uElementPack, t.a(tf, "ALADDIN", ta), ta);
       }
       if (this.g != null) {
          k.c(this.f.getActivity(), this.d);
       }else {
          uof3 = this.a;
          Object obj = PatchProxy.applyOneRefs(uof3, objArray, oi3, "3");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(uof3 != null){
             SearchItem mKBoxItem = uof3.mKBoxItem;
             if (mKBoxItem != null && !TextUtils.isEmpty(mKBoxItem.mSlideLinkUrl)) {
                Uri uri = Uri.parse(uof3.mKBoxItem.mSlideLinkUrl);
                if (i3.a(uri)) {
                   b = ("gotab").equals(uri.getHost());
                }
             }
          }
          b = false;
          if (b) {
             uof3 = this.a;
             SearchItem obj1 = PatchProxy.applyOneRefs(uof3, objArray, oi3, "5");
             if (obj1 != PatchProxyResult.class) {
                objArray = obj1;
             }else if(uof3 != null){
                obj1 = uof3.mKBoxItem;
                if (obj1 != null && !TextUtils.isEmpty(obj1.mSlideLinkUrl)) {
                   objArray = l0.a(uof3.mKBoxItem.mSlideLinkUrl);
                }
             }
             i.c(objArray, this.e);
          }else {
             k.c(this.e, this.d);
          }
       }
       return;
    }
    public boolean isEnable(){
       Object obj = PatchProxy.apply(null, this, f3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       obj = (this.a.mKBoxItem != null && (this.b != null && (this.c != null && !TextUtils.x(this.d))))? 1: 0;
       f3 te = this.e;
       if (te instanceof e) {
          b uob = te.C();
          if (uob != null && (uob.t != null && l0.c(this.d))) {
          label_004a :
             return b;
          }
       }
       b = obj;
       goto label_004a ;
    }
}
