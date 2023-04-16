package ap1.g;
import java.lang.Runnable;
import ap1.h;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import bp1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import p91.m;
import bp1.c;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMagicBoxConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.HashMap;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import java.util.Map;
import va1.s0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import lp3.e;
import kq3.a;
import va1.o0;
import com.kuaishou.live.webview.context.LiveWebViewBackgroundImageParam;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import qkd.b;
import android.graphics.drawable.Drawable;
import va1.n0;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class g implements Runnable	// class@000273
{
    public final h b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;

    public void g(h p0,String p1,int p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       LiveConfigStartupResponse$LiveMagicBoxConfig obj;
       Map obj1;
       g og = this;
       g b = og.b;
       g c = og.c;
       g d = og.d;
       g e = og.e;
       g f = og.f;
       Objects.requireNonNull(b);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(c, Integer.valueOf(d), e, f, b, h.class, "6")) {
          String liveStreamId = b.r.getLiveStreamId();
          String str = b.r.t();
          String str1 = b.r.i();
          c uoc = c.class;
          String str2 = "1";
          int i = 0;
          if (PatchProxy.isSupport(uoc)) {
             Object[] objArray = new Object[]{liveStreamId,c,Integer.valueOf(d),e,f,str,str1};
             obj = PatchProxy.apply(objArray, null, uoc, str2);
             if (obj != PatchProxyResult.class) {
             }else {
             label_0077 :
                obj = a.x(LiveConfigStartupResponse$LiveMagicBoxConfig.class);
                if (obj == null) {
                   obj = null;
                }else {
                   HashMap hashMap = new HashMap();
                   hashMap.put("live_stream_id", TextUtils.k(liveStreamId));
                   hashMap.put("source", TextUtils.k(c));
                   hashMap.put("gift_id", String.valueOf(d));
                   hashMap.put("combo_key", TextUtils.k(e));
                   if (!TextUtils.x(f)) {
                      hashMap.put("recipient", f);
                   }
                   hashMap.put("server_exp_tag", TextUtils.k(c.a(str)));
                   hashMap.put("exp_tag", TextUtils.k(c.a(str1)));
                   obj = s0.a(obj.mH5MagicBoxUrl, hashMap);
                }
             }
          }else {
             goto label_0077 ;
          }
          if (!TextUtils.x(obj)) {
             a uoa = o0.a(b.getActivity(), b.r.b().getChildFragmentManager(), b.q);
             uoa.g("live-h5-magic-box-dialog");
             uoa.f("live-h5-magic-box-dialog-fragment");
             LiveWebViewBackgroundImageParam liveWebViewB = new LiveWebViewBackgroundImageParam();
             LiveWebViewBackgroundImageParam liveWebViewB1 = liveWebViewB.setIsShowLoadingBackgroundImage(true);
             if (PatchProxy.isSupport(b.class)) {
                str1 = PatchProxy.applyOneRefs(Integer.valueOf(d), null, b.class, str2);
                if (str1 != PatchProxyResult.class) {
                }else if(TextUtils.x(b.a(d))){
                   str1 = "";
                }else {
                   str1 = LiveResourceFileUtil.k("live_magic_box_loading_background_resource")+File.separator+b.a(d);
                   LiveResourceFileUtil$LiveResourceFileType lIVE_LOADING = LiveResourceFileUtil$LiveResourceFileType.LIVE_LOADING_BACKGROUND_RESOURCE;
                   if (!b.S(LiveResourceFileUtil.j(lIVE_LOADING, str1))) {
                      LiveResourceFileUtil.h(lIVE_LOADING);
                   }
                }
             }else {
                goto label_011a ;
             }
             LiveWebViewBackgroundImageParam liveWebViewB2 = liveWebViewB1.setImageFilePath(str1);
             if (PatchProxy.isSupport(b.class)) {
                obj1 = PatchProxy.applyOneRefs(Integer.valueOf(d), null, b.class, "3");
                if (obj1 != PatchProxyResult.class) {
                }else if(PatchProxy.isSupport(b.class)){
                   obj1 = PatchProxy.applyOneRefs(Integer.valueOf(d), null, b.class, "5");
                   if (obj1 != PatchProxyResult.class) {
                   }
                }
                obj1 = b.d;
                if (obj1.containsKey(Integer.valueOf(d))) {
                   obj1 = obj1.get(Integer.valueOf(d));
                }else {
                   obj1 = b.a;
                }
             }else {
                goto label_016d ;
             }
             liveWebViewB2.setLocalResDrawable(obj1).setStartX(0).setStartY((float)(c.c() - c.b())).setWidth(n0.f()).setHeight(c.b());
             uoa.b.setPortraitHeightPixel(c.c()).setEnablePanDown(false).setOverScrollMode(2).setDisableScrollBar(true).setBackgroundImageParam(liveWebViewB);
             b.p = a.c().h(obj, uoa);
          }
       }
       b.P8();
       return;
    }
}
