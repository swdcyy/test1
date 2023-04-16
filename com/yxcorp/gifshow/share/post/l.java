package com.yxcorp.gifshow.share.post.l;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import mz6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mz6.a;
import mz6.b$d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.k1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.yxcorp.gifshow.model.EditInfo;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import k2b.u1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import w26.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import qic.n;
import com.yxcorp.gifshow.share.post.i;
import erd.g;
import crd.b;

public class l	// class@001c41
{
    public static final long a;
    public static final int b;

    static {
       l.a = a.t().b("PhotoReeditDeleteDialog", 3600) * 1000;
    }
    public void l(){
       super();
    }
    public static void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, l.class, "4")) {
          return;
       }
       a uoa = a.b();
       uoa.g(R.string.arg_RES_7f104274);
       uoa.o(R.color.arg_RES_7f061767);
       p0.a(uoa.a());
       return;
    }
    public static boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (k1.t(p0.created()) - l.a <= 0 && l.d(p0))? true: false;
       return b;
    }
    public static ClientContent$ContentPackage c(String p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
       obj.photoPackage = photoPackage;
       photoPackage.identity = p0;
       return obj;
    }
    public static boolean d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getEditInfo() != null && p0.getEditInfo().mEnable != null)? true: false;
       return b;
    }
    public static void e(String p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, ol, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = "DELETE_ENSURE_DLG_BTN";
       try{
          uElementPack.action2 = str;
          uElementPack.params = new JSONObject().put("btn", p1).toString();
       }catch(org.json.JSONException e5){
          Log.k(e5);
       }
       u1.u(3, uElementPack, l.c(p0));
       return;
    }
    public static void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, l.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DELETE_ENSURE_DIALOG";
       u1.u0(4, uElementPack, l.c(p0));
       return;
    }
    public static void g(GifshowActivity p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, l.class, "8")) {
          return;
       }
       Log.g("mockData", "showReeditDeleteDialogIfNeeded click reedit");
       y6.s(c.class, LoadPolicy.DIALOG).R(new n(p1, p0), i.b);
       return;
    }
}
