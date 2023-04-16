package ez9.c;
import sz9.u;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import i3a.b;
import java.util.HashMap;
import le5.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class c	// class@002261
{
    public final u a;
    public final SlidePageConfig b;

    public void c(u p0,SlidePageConfig p1){
       a.p(p0, "playerPanelPhotoConfig");
       a.p(p1, "pageConfig");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       String obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.a.b()) {
          obj = a1.p(R.string.arg_RES_7f103ca7);
          a.o(obj, "CommonUtil.string\(R.stri¡­ayer_panel_accessibility\)");
          return obj;
       }else {
          obj = b.d();
          if (obj != null) {
             int i = obj.hashCode();
             if (i != -1990637964) {
                if (i != 0x55635842) {
                   if (i == 0x570086c9 && obj.equals("ysopsia_blue")) {
                      obj = a1.p(R.string.arg_RES_7f103ca8);
                      a.o(obj, "CommonUtil.string\(R.stri¡­ccessibility_blue_yellow\)");
                   label_008b :
                      return obj;
                   }
                }else if(obj.equals("ysopsia_red")){
                   obj = a1.p(R.string.arg_RES_7f103cab);
                   a.o(obj, "CommonUtil.string\(R.stri¡­_panel_accessibility_red\)");
                   goto label_008b ;
                }
             }else if(obj.equals("ysopsia_green")){
                obj = a1.p(R.string.arg_RES_7f103ca9);
                a.o(obj, "CommonUtil.string\(R.stri¡­anel_accessibility_green\)");
                goto label_008b ;
             }
          }
          obj = a1.p(R.string.arg_RES_7f103caa);
          a.o(obj, "CommonUtil.string\(R.stri¡­l_accessibility_original\)");
          goto label_008b ;
       }
    }
    public final HashMap b(){
       HashMap obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (this.b.T() && this.a.i()) {
          obj.put("video_saveflow_icon_button", this.d(b.i()));
       }
       obj.put("assist_function_button", this.a());
       if (f.s()) {
          obj.put("sound_effect", "PANORAMIC_SOUND");
          obj.put("sound_effect_status", this.d(b.g()));
       }
       if (this.b.V() && this.a.j()) {
          obj.put("small_window_play", this.d(b.j()));
       }
       obj.put("source", b.d.c());
       return obj;
    }
    public final void c(QPhoto p0,BaseFragment p1,HashMap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "fragment");
       a.p(p2, "hashMap");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PLAYER_PANEL_FUNCTION_BUTTON";
       uElementPack.params = a.a.q(p2);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0.mEntity);
       u1.D0("", p1, 0, uElementPack, uContentPack, null);
       return;
    }
    public final String d(boolean p0){
       String str = (p0)? "OPEN": "CLOSE";
       return str;
    }
}
