package ezb.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.gifshow.post.api.feature.camera.model.CameraIconInfo;
import k2b.e0;
import java.lang.String;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.CommonParams;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import ezb.d;
import java.util.HashMap;
import java.util.List;

public abstract class a extends PresenterV2 implements g	// class@002503
{
    public List p;
    public CameraViewSwitcher q;

    public void a(){
       super();
    }
    public static void R8(a p0,CameraIconInfo p1,e0 p2,String p3,BaseFeed p4,CommonParams p5,Map p6,boolean p7,int p8,Object p9){
       boolean b = (p8 & 0x40)? false: p7;
       p0.P8(p1, p2, p3, p4, p5, p6, b);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.q = this.V8();
       return;
    }
    public final void P8(CameraIconInfo p0,e0 p1,String p2,BaseFeed p3,CommonParams p4,Map p5,boolean p6){
       ClientEvent$ElementPackage uElementPack;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       a uoa = a.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,p3,p4,p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "7")) {
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
       if (p3 != null) {
          photoPackage = w1.f(p3);
          a.o(photoPackage, "FeedUtil.buildPhotoPackage\(it\)");
       }
       uContentPack.photoPackage = photoPackage;
       String id = (p3 != null)? p3.getId(): null;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray1 = new Object[i];
          objArray1[0] = oobject;
          objArray1[1] = oobject1;
          objArray1[2] = id;
          objArray1[i2] = p5;
          objArray1[i1] = Boolean.valueOf(p6);
          uElementPack = PatchProxy.apply(objArray1, obj, uoa, "8");
          if (uElementPack != PatchProxyResult.class) {
          label_0075 :
             Object obj1 = uElementPack;
             u1.N("", p1, 1, obj1, uContentPack, null, p4);
             return;
          }
       }
       uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = "home_camera_click";
       uElementPack.type = 1;
       uElementPack.action2 = "VIDEO_REC";
       JsonObject jsonObject = new JsonObject();
       if (oobject != null) {
          uElementPack.index = oobject.mID;
          jsonObject.c0("entry_type", "operate");
       }
       if (id != null) {
          jsonObject.c0("photo_id", id);
       }
       if (oobject1 != null) {
          jsonObject.c0("entry_type", "photo");
          jsonObject.c0("link_url", oobject1);
       }
       String str = (p6)? "press": "click";
       jsonObject.c0("click_type", str);
       if (p5 != null) {
          Iterator iterator = p5.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             id = uEntry.getKey();
             jsonObject.c0(id, uEntry.getValue());
          }
       }
       uElementPack.params = jsonObject.toString();
       goto label_0075 ;
    }
    public final CameraViewSwitcher S8(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("cameraViewSwitcher");
       }
       return obj;
    }
    public abstract CameraViewSwitcher V8();
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       Object obj = this.r8("HOME_CAMERA_BTN_CLICK_DELEGATES");
       a.o(obj, "inject\(AccessIds.HOME_CAMERA_BTN_CLICK_DELEGATES\)");
       this.p = obj;
       return;
    }
}
