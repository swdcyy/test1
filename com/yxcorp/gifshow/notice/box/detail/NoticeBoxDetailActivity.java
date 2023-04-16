package com.yxcorp.gifshow.notice.box.detail.NoticeBoxDetailActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import rkd.b;
import com.yxcorp.gifshow.notice.box.detail.NoticeBoxDetailActivityTablet;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.Fragment;
import ekd.j0;
import android.net.Uri;
import lnc.o5;
import fg6.a;
import zsb.l;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.notice.box.detail.NoticeBoxDetailFragment;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class NoticeBoxDetailActivity extends SingleFragmentActivity	// class@002163
{

    public void NoticeBoxDetailActivity(){
       super();
    }
    public static void A3(Context p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, NoticeBoxDetailActivity.class, "3")) {
          return;
       }
       NoticeBoxDetailActivityTablet noticeBoxDet = (b.g())? NoticeBoxDetailActivityTablet.class: NoticeBoxDetailActivity.class;
       Intent intent = new Intent(p0, noticeBoxDet);
       intent.putExtra("KEY_NOTICE_BOX_ID", p1);
       intent.putExtra("KEY_NOTICE_BOX_NAME", p2);
       p0.startActivity(intent);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxDetailActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NoticeBoxDetailActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       l boxId;
       NoticeBoxDetailFragment noticeBoxDet;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, NoticeBoxDetailActivity.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = j0.f(this.getIntent(), "KEY_NOTICE_BOX_ID");
       String str = j0.f(this.getIntent(), "KEY_NOTICE_BOX_NAME");
       String str1 = j0.f(this.getIntent(), "KEY_NOTICE_BOX_EXTRA_INFO");
       int i = 0;
       int i1 = j0.b(this.getIntent(), "KEY_NOTICE_BOX_DIRECTION", i);
       if (obj == null || str == null) {
          Uri data = this.getIntent().getData();
          String queryParamet = (data != null)? data.getQueryParameter("extraInfo"): objArray;
          String queryParamet1 = (data != null)? data.getQueryParameter("upScrollDirection"): objArray;
          if (queryParamet1 != null) {
             i = o5.b(queryParamet1, i);
          }
          str1 = (data != null)? data.getQueryParameter("noticeBoxItem"): objArray;
          l ol = (str1 != null)? a.a.h(str1, l.class): objArray;
          boxId = (ol != null)? ol.boxId: objArray;
          str = (ol != null)? ol.boxName: objArray;
          str1 = queryParamet;
          i1 = i;
       }
       if (!TextUtils.x(boxId) && !TextUtils.x(str)) {
          if (PatchProxy.isSupport(NoticeBoxDetailFragment.class)) {
             noticeBoxDet = PatchProxy.applyFourRefs(boxId, str, Integer.valueOf(i1), str1, null, NoticeBoxDetailFragment.class, "10");
             if (noticeBoxDet != patchProxyRe) {
             label_00cf :
                return noticeBoxDet;
             }
          }
          noticeBoxDet = new NoticeBoxDetailFragment();
          Bundle uBundle = new Bundle();
          uBundle.putString("KEY_NOTICE_BOX_ID", boxId);
          uBundle.putString("KEY_NOTICE_BOX_NAME", str);
          uBundle.putInt("KEY_NOTICE_BOX_DIRECTION", i1);
          if (str1 != null) {
             uBundle.putString("KEY_NOTICE_BOX_EXTRA_INFO", str1);
          }
          noticeBoxDet.setArguments(uBundle);
          goto label_00cf ;
       }else {
          this.finish();
          return objArray;
       }
    }
}
