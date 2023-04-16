package ls1.h;
import ls1.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import pu1.d;
import hc.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import pu1.j;
import lnc.i3;
import k2b.u1;
import com.kuaishou.android.live.log.b;
import pu1.k;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.x0;
import ls1.h$a;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.io.File;

public final class h implements a	// class@003018
{
    public static final List a;
    public static final h b;

    static {
       h.b = new h();
       h.a = LiveCommonLogTag.MULTI_LINE.appendTag("MultilineManager");
    }
    public void h(){
       super();
    }
    public boolean a(KwaiImageView p0,d p1,boolean p2,Object p3,b p4){
       boolean b;
       i3 oi3;
       Boolean tRUE;
       boolean b1;
       i3 oi31;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       int i = 0;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),oobject2,oobject3};
          Object obj1 = PatchProxy.apply(objArray, obj, oh, "7");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       a.p(oobject, "targetView");
       a.p(oobject1, "resource");
       String obj2 = PatchProxy.apply(null, obj, oh, "2");
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else {
          obj2 = LiveResourceFileUtil.k("live_multi_pk");
          a.o(obj2, "LiveResourceFileUtil.get¡­TI_PK_RESOURCE_DIRECTORY\)");
          b = obj.e(obj2, LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE);
       }
       if (b && obj.e(obj.d(p1.getLocalFileName(), "live_multi_pk"), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE)) {
          oi3 = i3.f();
          oi3.d("resource", p1.toString());
          tRUE = Boolean.TRUE;
          oi3.a("is_resource_exist", tRUE);
          u1.R("LIVE_MULTI_LINE_GIFT_BATTLE_RESOURCE_EVENT_KEY", oi3.e(), 3);
          b.T(h.a, "bindAnimResource", "isBindLocalFile", tRUE, "filePath: ", obj.d(p1.getLocalFileName(), "live_multi_pk"));
          obj.b(oobject, obj.d(p1.getLocalFileName(), "live_multi_pk"), oobject3);
          return 1;
       }else {
          Object obj3 = PatchProxy.apply(null, obj, oh, "3");
          if (obj3 != patchProxyRe) {
             b1 = obj3.booleanValue();
          }else {
             String str = LiveResourceFileUtil.k("live_multi_pk_resource_image_normal_skin");
             a.o(str, "LiveResourceFileUtil.get¡­E_IMAGE_NORMAL_SKIN_PATH\)");
             b1 = obj.e(str, LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN);
          }
          if (b1 && obj.e(obj.d(p1.getLocalFileName(), "live_multi_pk_resource_image_normal_skin"), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN)) {
             oi3 = i3.f();
             oi3.d("resource", p1.toString());
             tRUE = Boolean.TRUE;
             oi3.a("is_resource_exist", tRUE);
             u1.R("LIVE_MULTI_LINE_GIFT_BATTLE_RESOURCE_EVENT_KEY", oi3.e(), 3);
             b.T(h.a, "bindAnimResource", "isBindLocalFile", tRUE, "filePath: ", obj.d(p1.getLocalFileName(), "live_multi_pk_resource_image_normal_skin"));
             obj.b(oobject, obj.d(p1.getLocalFileName(), "live_multi_pk_resource_image_normal_skin"), oobject3);
             return 1;
          }else if(p2 && p1.hasCDNUrl()){
             k.b.a(oobject, p1.getCDNUrl(), oobject3, oobject2);
             oi31 = i3.f();
             oi31.d("resource", p1.toString());
             oi31.a("is_resource_exist", Boolean.FALSE);
             oi31.d("cdn", p1.getCDNUrl());
             u1.R("LIVE_MULTI_LINE_GIFT_BATTLE_RESOURCE_EVENT_KEY", oi31.e(), 3);
             return 1;
          }else {
             oi31 = i3.f();
             oi31.d("resource", p1.toString());
             Boolean fALSE = Boolean.FALSE;
             oi31.a("is_resource_exist", fALSE);
             u1.R("LIVE_MULTI_LINE_GIFT_BATTLE_RESOURCE_EVENT_KEY", oi31.e(), 3);
             b.S(h.a, "bindAnimResource", "isBindLocalFile", fALSE);
             return false;
          }
       }
    }
    public final void b(KwaiImageView p0,String p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "8")) {
          return;
       }
       b.S(h.a, "bindLocalFile", "localFilePath", p1);
       d uod = Fresco.newDraweeControllerBuilder();
       uod.q(true);
       d uod1 = uod.D(x0.f("file://"+p1));
       uod1.s(new h$a(p2));
       AbstractDraweeController uAbstractDra = uod1.e();
       a.o(uAbstractDra, "Fresco.newDraweeControll¡­}\n      }\)\n      .build\(\)");
       p0.setController(uAbstractDra);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE);
       LiveResourceFileUtil.h(LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN);
       return;
    }
    public final String d(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveResourceFileUtil.k(p1)+'/'+p0;
    }
    public final boolean e(String p0,LiveResourceFileUtil$LiveResourceFileType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       File uFile = LiveResourceFileUtil.j(p1, p0);
       List a = h.a;
       b.U(a, "isFileExist\(\)", "filePath: ", p0, "fileType: ", p1, "file: ", uFile);
       if (uFile == null || !uFile.exists()) {
          b.P(a, "do not has resource");
          return false;
       }else {
          b.P(a, "has resource");
          return true;
       }
    }
    public final boolean f(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "resource");
       boolean b = (this.e(this.d(p0.getLocalFileName(), "live_multi_pk_resource_image_normal_skin"), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE_IMAGE_NORMAL_SKIN) || this.e(this.d(p0.getLocalFileName(), "live_multi_pk"), LiveResourceFileUtil$LiveResourceFileType.LIVE_MULTI_PK_RESOURCE))? true: false;
       return b;
    }
}
