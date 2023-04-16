package bcd.n;
import java.lang.Object;
import java.lang.String;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gbd.i;
import gbd.d;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.plugin.search.entity.SearchHotTagItem;
import java.lang.Integer;
import java.lang.Boolean;
import com.search.common.entity.SearchBaseItem;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.entity.SearchHotTagItem$InterestIcon;
import com.yxcorp.plugin.search.entity.IconEntity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import oy5.h;

public class n	// class@0003ea
{

    public void n(){
       super();
    }
    public static void a(String p0,e0 p1,String p2,String p3,ClientEvent$AreaPackage p4){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, on, "3")) {
             return;
          }
       }
       if (p4 == null) {
          p4 = i.a("GUESS_KEYWORD");
       }
       d uod = d.r();
       uod.a(p0);
       uod.s();
       d uod1 = uod.j("list_id", p2);
       i.j(1, p1, uod1.j("list_type", "TRENDING").n("search_session_id", p3).d(), p4);
       return;
    }
    public static void b(e0 p0,SearchHotTagItem p1,int p2,String p3){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, n.class, "1")) {
          return;
       }
       n.c(p0, p1, p2, p3, "", null, false);
       return;
    }
    public static void c(e0 p0,SearchHotTagItem p1,int p2,String p3,String p4,ClientEvent$AreaPackage p5,boolean p6){
       ClientEvent$ElementPackage uElementPack;
       String str1;
       object oobject = p1;
       object oobject1 = p3;
       object oobject2 = p4;
       n on = n.class;
       d obj = null;
       int i = 1;
       if (PatchProxy.isSupport(on)) {
          Object[] objArray = new Object[]{p0,oobject,Integer.valueOf(p2),oobject1,oobject2,p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, on, "2")) {
             return;
          }
       }
       if (!p2) {
          if (oobject.mIsShow != null) {
             return;
          }else {
             oobject.mIsShow = i;
          }
       }
       ClientContent$ContentPackage uContentPack = i.b(oobject.mKsOrderId, obj);
       ClientEvent$AreaPackage uAreaPackage = (p5 == null)? i.a("GUESS_KEYWORD"): p5;
       if (PatchProxy.isSupport(on)) {
          uElementPack = PatchProxy.applyFourRefs(p1, p3, p4, Boolean.valueOf(p6), null, n.class, "4");
          if (uElementPack != PatchProxyResult.class) {
          label_0108 :
             i.k(p2, p0, uElementPack, uAreaPackage, uContentPack, 0);
             return;
          }
       }
       SearchHotTagItem mInterestIco = oobject.mInterestIcon;
       String str = "";
       if (mInterestIco != null) {
          str1 = String.valueOf(mInterestIco.mIconType);
       }else {
          mInterestIco = oobject.mIcon;
          if (mInterestIco != null) {
             str = mInterestIco.mIconText;
             str1 = str;
          }else {
             str1 = str;
          }
       }
       obj = d.r();
       obj.s();
       obj.a("GUESS_LIST");
       obj = obj.j("list_id", oobject1).j("list_type", "TRENDING");
       obj.q(oobject.mKeyword);
       obj.t(oobject.mPosition);
       if (!TextUtils.x(str)) {
          obj.n("label", str);
       }
       if (!TextUtils.x(str1)) {
          obj.n("icon_type", str1);
       }
       if (!TextUtils.x(oobject.mLinkUrl)) {
          obj.n("kwai", oobject.mLinkUrl);
          if (p6) {
             str1 = h.a(Uri.parse(oobject.mLinkUrl));
             if (!TextUtils.x(str1)) {
                obj.j("entry_source", str1);
             }
          }
       }
       if (!TextUtils.x(p4)) {
          obj.n("search_session_id", oobject2);
       }
       if (!TextUtils.x(oobject.mRefreshStrategyType)) {
          obj.n("refresh_type", oobject.mRefreshStrategyType);
       }
       uElementPack = obj.d();
       goto label_0108 ;
    }
}
