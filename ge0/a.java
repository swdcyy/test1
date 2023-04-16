package ge0.a;
import tx4.l;
import java.lang.Object;
import java.lang.String;
import tx4.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import ce0.b;
import java.lang.Throwable;
import q87.c;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import k2b.u1;
import k2b.k2;
import tx4.k;
import o56.c;
import o56.a;
import android.app.Application;
import vid.b;

public class a implements l	// class@0024a7
{
    public SharedPreferences a;

    public void a(){
       super();
    }
    public Object a(String p0,String p1,h p2){
       boolean this;
       JsonElement jsonElement;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       if (p2 != patchProxyRe) {
          return p2;
       }
       Objects.requireNonNull(p0);
       int i = -1;
       this = true;
       switch (p0.hashCode()){
           case 0xaf11af30:
             if (p0.equals("getPageName")) {
                i = 0;
             }
             break;
           case 0xc4e387c5:
             if (p0.equals("logCustomEvent")) {
                i = 1;
             }
             break;
           case 0xe93d5d31:
             if (p0.equals("getDataValue")) {
                i = 2;
             }
             break;
           case 0x3d24e27:
             if (p0.equals("handleUrl")) {
                i = 3;
             }
             break;
           case 0x7cc75998:
             if (p0.equals("putDataValue")) {
                i = 4;
             }
             break;
           default:
       }
    label_0057 :
       p0 = "v";
       String str = "";
       switch (i){
           case 0:
             if (u1.j() != null) {
                str = u1.j().d;
             }
             return str;
             break;
           case 1:
             if (!PatchProxy.applyVoidOneRefs(p1, this, a.class, "6")) {
                jsonElement = c.d(p1);
                if (jsonElement.E()) {
                   u1.R(jsonElement.e0("k").w(), jsonElement.e0(p0).w(), 9);
                }
             }
             break;
           case 2:
             p0 = PatchProxy.applyOneRefs(p1, this, a.class, "5");
             if (p0 != patchProxyRe) {
                str = p0;
             }else {
                this.d();
                str = this.a.getString(p1, str);
             }
             return str;
             break;
           case 3:
             Activity uActivity = ActivityContext.g().e();
             if (!PatchProxy.applyVoidTwoRefs(p1, uActivity, null, a.class, "3") && !TextUtils.x(p1)) {
                a.b(b.j(uActivity, p1), null);
             }
             break;
           case 4:
             i = PatchProxy.applyOneRefs(p1, this, a.class, "4");
             if (i != patchProxyRe) {
                this = i.booleanValue();
             }else {
                this.d();
                jsonElement = c.d(p1);
                if (jsonElement.E()) {
                   g.a(this.a.edit().putString(jsonElement.e0("k").w(), jsonElement.e0(p0).w()));
                }
             }
             return Boolean.valueOf(this);
             break;
           default:
       }
    label_0125 :
       return null;
    }
    public Object b(String p0,String p1,String p2,h p3){
       return k.a(this, p0, p1, p2, p3);
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       this.a = b.c(a.a().a(), "UgTkGlobalBridge", 0);
       return;
    }
}
