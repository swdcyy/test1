package com.yxcorp.gifshow.relation.util.KwaiRelationFollowHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jga.h;
import android.net.Uri;
import xh7.a;
import q87.c;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import fka.e;
import fka.e$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Throwable;
import f66.i;
import jga.f$a;
import org.json.JSONObject;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import jga.c;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import android.app.Activity;
import lnc.a1;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import hcc.z;
import n3d.a;
import jga.f;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class KwaiRelationFollowHandler extends AnnotationUriHandler	// class@001a51
{

    public void KwaiRelationFollowHandler(){
       super();
    }
    public void c(b p0,c p1){
       f$a uoa1;
       JSONObject jSONObject;
       Iterator iterator;
       String str1;
       c uoc;
       Activity uActivity;
       LoginParams$a uoa2;
       LoginParams loginParams;
       String str2;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiRelationFollowHandler.class, str)) {
          return;
       }
       Object[] objArray = new Object[0];
       h.C().w("KwaiRelationFollowHandler", p0.g().toString(), objArray);
       String queryParamet = p0.g().getQueryParameter("userId");
       String queryParamet1 = p0.g().getQueryParameter("action");
       String queryParamet2 = p0.g().getQueryParameter("followRefer");
       String queryParamet3 = p0.g().getQueryParameter("extra");
       User user = new User(queryParamet, null, null, null, null);
       e$a uoa = e.a().d();
       if (!TextUtils.x(queryParamet2)) {
          try{
             queryParamet2 = (uoa.a).concat(","+Integer.parseInt(queryParamet2));
          }catch(java.lang.NumberFormatException e2){
             h.C().B("KwaiRelationFollowHandler", e2);
             queryParamet2 = uoa.a;
          }
       }
    }
    public final void e(String p0,f$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiRelationFollowHandler.class, "2")) {
          return;
       }
       int i = 1;
       try{
          if (i == Integer.parseInt(p0)) {
             FollowHelper.b(p1.b());
          }else if(2 == Integer.parseInt(p0)){
             FollowHelper.k(p1.b()).subscribe(Functions.d(), Functions.d());
          }
       }catch(java.lang.NumberFormatException e3){
          h.C().B("KwaiRelationFollowHandler", e3);
       }
       return;
    }
}
