package com.yxcorp.gifshow.reminder.friend.FriendsHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import lec.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import xh7.a;
import yh7.a;
import android.content.Intent;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import android.net.Uri;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.a;
import crd.b;
import lnc.b9;
import ekd.x0;
import lnc.o5;
import com.yxcorp.utility.TextUtils;
import idc.a;
import idc.b;
import zcc.l;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import nf6.e;
import tkd.b;
import tkd.d;
import hn5.n;
import android.app.Activity;
import wkd.b;
import ddc.a;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONArray;
import brd.t;
import lec.z;
import erd.g;
import lec.a0;
import erd.r;
import lec.c0;
import erd.o;
import lec.d0;
import lec.e0;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class FriendsHandler extends AnnotationUriHandler	// class@001a7b
{
    public f0 b;

    public void FriendsHandler(){
       super();
    }
    public void c(b p0,c p1){
       f0 a;
       Uri uri;
       f0 uof0 = f0.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FriendsHandler.class, str)) {
          return;
       }
       Context uContext = p0.b();
       String str1 = "com.kwai.platform.krouter.return_intent";
       if (p0.a(str1, false)) {
          a uoa = new a(201);
          Intent intent = new Intent(uContext, UriRouterActivity.class);
          intent.setData(p0.g());
          uoa.b.put(str1, intent);
          p1.a(uoa);
          return;
       }else {
          FriendsHandler tb = this.b;
          if (tb == null) {
             this.b = new f0(p0.g());
          }else {
             Uri uri1 = p0.g();
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(uri1, tb, uof0, str)) {
                a.p(uri1, "uri");
                b9.a(tb.c);
                tb.d = uri1;
                tb.a = x0.a(uri1, "taskId");
                tb.b = o5.c(x0.a(uri1, "subBizId"));
             }
          }
          str = TextUtils.i(x0.a(p0.g(), "topFeedId"), x0.a(p0.g(), "topPhotoId"));
          a uoa1 = b.a();
          Object[] objArray = null;
          if (uoa1.v3() || this.b.a()) {
             if (this.b.a()) {
                FriendsHandler tb1 = this.b;
                Objects.requireNonNull(tb1);
                if (!PatchProxy.applyVoid(objArray, tb1, uof0, "3")) {
                   b9.a(tb1.c);
                   a uoa2 = b.a(0x611ee2f7);
                   a = tb1.a;
                   String str2 = PatchProxy.applyOneRefs(a, tb1, uof0, "4");
                   if (str2 != PatchProxyResult.class) {
                   }else {
                      JSONArray jSONArray = new JSONArray();
                      if (a == null) {
                         a = "";
                      }
                      jSONArray.put(a);
                      str2 = jSONArray.toString();
                      a.o(str2, "JSONArray\(\).apply {\n    \x20\x02d ?: \"\"\)\n    }.toString\(\)\x00");
                   }
                   tb1.c = uoa2.d(str2, tb1.b).doOnError(new z(tb1)).filter(new a0(tb1)).flatMap(new c0(tb1)).subscribe(new d0(tb1), new e0(tb1));
                }
             }
             uoa1.x1(uContext, p0.g());
             p1.a(new a(200));
          }else if(l.c() || TextUtils.x(str)){
             n on = d.a(-1883158055);
             uri = p0.g();
             if (uContext instanceof Activity) {
                objArray = uContext.getIntent();
             }
             on.eV(uContext, uri, objArray);
             p1.a(new a(200));
          }else {
             p0.i(Uri.parse("kwai://work/"+str+"?isFollowPush=1"));
             if (e.c()) {
                p0.o(0x10000000);
             }
             p1.a(new a(302));
          }
          return;
       }
    }
}
