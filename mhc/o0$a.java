package mhc.o0$a;
import mhc.o0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import mhc.o0$b;
import mhc.p1;
import android.view.View;
import mhc.j2;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import mhc.k2;
import java.lang.Enum;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import com.google.gson.JsonObject;
import kp.r1;
import com.google.gson.JsonElement;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public class o0$a implements o0	// class@00358e
{
    public final BaseFeed a;

    public void o0$a(BaseFeed p0){
       super();
       this.a = p0;
    }
    public void a(Object p0){
    }
    public void c(Object p0){
       PatchProxy.applyVoidOneRefs(p0, this, o0$a.class, "2");
    }
    public void d(Object p0){
    }
    public List e(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o0$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "ops");
       return o0$b.a(this, p0);
    }
    public void g(p1 p0,View p1){
       ClientEvent$ElementPackage uElementPack;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o0$a.class, "1")) {
          return;
       }
       String str = "operation";
       a.p(p0, str);
       a.p(p1, "view");
       o0$a ta = this.a;
       if (!PatchProxy.applyVoidTwoRefs(ta, p0, null, j2.class, "4")) {
          a.p(p0, str);
          int i = k2.a[p0.M().ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "KWAI_QR_CODE";
                   u1.u0(6, uElementPack, j2.d(ta));
                }
             }else {
                ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                uElementPack1.action2 = "CREATE_LIVE_PHOTO";
                JsonObject jsonObject = new JsonObject();
                if (ta != null) {
                   if (r1.f2(ta)) {
                      jsonObject.c0("content_type", "IMAGE");
                   }else if(r1.D3(ta)){
                      jsonObject.c0("content_type", "PHOTO");
                   }
                   uElementPack1.params = TextUtils.I(jsonObject.toString());
                   ShowMetaData showMetaData = new ShowMetaData();
                   showMetaData.setType(6);
                   showMetaData.setElementPackage(uElementPack1);
                   showMetaData.setContentPackage(j2.d(ta));
                   u1.B0(showMetaData);
                }
             }
          }else {
             uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PHOTO_DOWNLOAD";
             u1.u0(6, uElementPack, j2.d(ta));
          }
       }
       return;
    }
}
