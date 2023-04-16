package com.yxcorp.gifshow.relation.guest.GuestRelationActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import lt7.b;
import com.yxcorp.gifshow.relation.guest.model.SameRelationModel;
import android.net.Uri$Builder;
import com.yxcorp.gifshow.relation.util.c;
import com.yxcorp.gifshow.pymk.b;
import java.lang.StringBuilder;
import cbc.a;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;

public class GuestRelationActivity extends GifshowActivity	// class@0018d2
{
    public SameRelationModel y;

    public void GuestRelationActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GuestRelationActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       GuestRelationActivity guestRelatio = GuestRelationActivity.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, guestRelatio, str)) {
          return;
       }
       super.onCreate(p0);
       Uri data = this.getIntent().getData();
       if (data != null && ("guest").equals(data.getHost())) {
          String str1 = x0.a(data, "userId");
          String str2 = x0.a(data, "title");
          if (TextUtils.isEmpty(str1)) {
             this.finish();
          }
          if (!QCurrentUser.me().isLogined()) {
             this.finish();
          }
          if (!b.a()) {
             this.finish();
          }
          SameRelationModel sameRelation = new SameRelationModel();
          this.y = sameRelation;
          sameRelation.uid = str1;
          sameRelation.name = str2;
          if (!PatchProxy.applyVoidTwoRefs(str1, str2, this, guestRelatio, "2")) {
             Uri$Builder uBuilder = new Uri$Builder().scheme("kwai").authority("krn").appendQueryParameter("bundleId", "SocialGuestFansFollowList").appendQueryParameter("componentName", "GuestFansFollowList").appendQueryParameter("minBundleVersion", "81").appendQueryParameter("themeStyle", str).appendQueryParameter(c.o, "0");
             uBuilder.appendQueryParameter(c.m, str2);
             Uri$Builder uBuilder1 = uBuilder;
             str2 = uBuilder1.appendQueryParameter(c.n, str1).appendQueryParameter(c.q, String.valueOf(b.h())).toString();
             a.a("scheme:"+str2);
             a.b(b.j(this, str2), null);
          }
          this.finish();
       }
       return;
    }
}
