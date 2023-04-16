package c69.a;
import pl5.a;
import java.lang.Object;
import android.net.Uri;
import android.app.Activity;
import ol5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qa9.q;
import com.yxcorp.gifshow.aggregate.relation.RelationAggregateFragment;
import android.os.Bundle;
import ekd.x0;
import com.kwai.sdk.switchconfig.a;
import b69.a;
import android.net.Uri$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import com.yxcorp.utility.n;
import qa9.s;

public class a implements a	// class@0004f1
{

    public void a(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public Object wy(Uri p0,Activity p1,boolean p2,a p3){
       Bundle obj;
       String str13;
       String str14;
       Uri uri = p0;
       object oobject = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, a.class, "1");
          if (obj != patchProxyRe) {
          }else if(PatchProxy.isSupport(RelationAggregateFragment.class)){
             obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, RelationAggregateFragment.class, "9");
             if (obj != patchProxyRe) {
             }
          }
          obj = new Bundle();
          String str = "queryUrl";
          String str1 = x0.a(uri, str);
          String str2 = "title";
          String str3 = x0.a(uri, str2);
          String str4 = "type";
          String str5 = x0.a(uri, str4);
          String str6 = x0.a(uri, "followRefer");
          String str7 = "materialType";
          String str8 = x0.a(uri, str7);
          String str9 = "materialTitle";
          String str10 = x0.a(uri, str9);
          String str11 = x0.a(uri, "materialUrl");
          String str12 = str9;
          if (p2) {
             str13 = str10;
             boolean b = false;
             str14 = str7;
             if (a.t().d("notifyHalfScreenSupportRN", b)) {
                a uoa = a.class;
                if (PatchProxy.isSupport(uoa)) {
                   Object[] objArray = new Object[]{oobject,str1,str3,str5,str6};
                   if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
                   label_013e :
                      obj = null;
                   }
                }
                Uri$Builder uBuilder = new Uri$Builder();
                Uri$Builder uBuilder1 = uBuilder.scheme("kwai").authority("kds").path("react/bottom_sheet").appendQueryParameter("bundleId", "SocialHalfNotifyList").appendQueryParameter("componentName", "App").appendQueryParameter("themeStyle", "1").appendQueryParameter("enableLoading", "0").appendQueryParameter("useBottomSheetV2", "1");
                uBuilder1.appendQueryParameter(str, str1);
                Uri$Builder uBuilder2 = uBuilder1.appendQueryParameter("halfNotifyListTitle", str3).appendQueryParameter(str4, str5);
                if (TextUtils.x(str6)) {
                   str6 = "";
                }
                uBuilder2.appendQueryParameter("followRefer", str6).appendQueryParameter("cornerRadius", "16").appendQueryParameter("height", "544").appendQueryParameter("dismissOnTouchMask", "1").appendQueryParameter("enableAnimation", "1").appendQueryParameter("slideOffThreshold", "0.75").appendQueryParameter(str2, " ");
                a.b(b.j(oobject, uBuilder.toString()), null);
                goto label_013e ;
             }
          }else {
             str14 = str7;
             str13 = str10;
          }
          obj.putString(str, str1);
          obj.putString(str2, str3);
          obj.putString(str4, str5);
          obj.putString("followRefer", str6);
          obj.putString("materialUrl", str11);
          obj.putString(str14, str8);
          obj.putString(str12, str13);
          obj = s.c(oobject.getSupportFragmentManager(), RelationAggregateFragment.class, RelationAggregateFragment.I, obj, BottomSheetParams.ofStateless().setNeedPageLogger(true).setContentHeight((int)((float)n.j(p1) * 0x3f1e353f)));
          obj.g("param_callback", p3);
       }else {
          goto label_0028 ;
       }
       return obj;
    }
}
