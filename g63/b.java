package g63.b;
import im8.g;
import k51.c;
import g63.b$a;
import g63.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.robust.PatchProxyResult;
import g63.g;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import tma.c;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$TabBarConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import g63.i;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$SubTabBarConfig;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$FollowButtonConfig;
import com.yxcorp.gifshow.gamezone.model.LiveGzoneAudienceCustomSkinConfig$ExtensionConfig;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import android.graphics.Color;
import lnc.a1;
import android.view.View;
import android.content.res.ColorStateList;
import android.util.StateSet;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import c77.l;
import c77.p;
import c77.o;
import oq5.c;
import jv1.b;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import g63.e;
import java.util.Map;
import java.util.HashMap;

public class b extends c implements g	// class@002a7d
{
    public h p;
    public a0 q;
    public View r;
    public GzonePagerSlidingTabStrip s;
    public KwaiImageView t;
    public boolean u;
    public g v;
    public c w;
    public static String sLivePresenterClassName = "LiveGzoneBackgroundSkinPresenter";

    public void b(){
       super();
       this.p = new b$a(this);
       this.w = new a(this);
    }
    public void E8(){
       int i;
       boolean i2;
       int[] ointArray;
       b uob = b.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, uob, str)) {
          return;
       }
       a0 c = this.q.c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       int[][] obj = PatchProxy.applyOneRefs(c, objArray, og, "1");
       if (obj != patchProxyRe) {
       }else {
          LiveStreamFeedWrapper obj1 = PatchProxy.applyOneRefs(c, objArray, og, str);
          if (obj1 != patchProxyRe) {
             i2 = obj1.booleanValue();
          }else if(c != null){
             obj1 = c.mEntity;
             if (obj1 != null && (c.a.a(obj1) != null && c.mEntity.mConfig != null)) {
                i2 = true;
             }
          }
          i2 = false;
          if (i2) {
             obj1 = c.mEntity;
             g og1 = PatchProxy.applyOneRefs(obj1, objArray, og, "2");
             if (og1 != patchProxyRe) {
             }else {
                LiveGzoneAudienceCustomSkinConfig liveGzoneAud = c.a.a(obj1);
                if (liveGzoneAud != null) {
                   og1 = new g();
                   og1.a = liveGzoneAud.mCustomSkinBackgroundCDNUrls;
                   og1.b = liveGzoneAud.mBottomBgPicUrls;
                   og1.c = liveGzoneAud.mTopPicUrls;
                   og1.d = liveGzoneAud.mBottomPicUrls;
                   og1.e = liveGzoneAud.mCompetitionTopPicUrls;
                   LiveGzoneAudienceCustomSkinConfig mTabBarConfi = liveGzoneAud.mTabBarConfig;
                   if (mTabBarConfi != null && !TextUtils.isEmpty(mTabBarConfi.mBgColor)) {
                      mTabBarConfi = liveGzoneAud.mTabBarConfig;
                      og1.f = i.a(mTabBarConfi.mTransparency, mTabBarConfi.mBgColor);
                   }
                   mTabBarConfi = liveGzoneAud.mSubTabBarConfig;
                   if (mTabBarConfi != null && !TextUtils.isEmpty(mTabBarConfi.mBgColor)) {
                      mTabBarConfi = liveGzoneAud.mSubTabBarConfig;
                      og1.i = i.a(mTabBarConfi.mTransparency, mTabBarConfi.mBgColor);
                   }
                   mTabBarConfi = liveGzoneAud.mFollowButtonConfig;
                   if (mTabBarConfi != null) {
                      og1.g = mTabBarConfi.mHighlightBgColor;
                      og1.h = mTabBarConfi.mHighlightFontColor;
                   }
                   liveGzoneAud = liveGzoneAud.mExtensionConfig;
                   if (liveGzoneAud != null) {
                      og1.j = liveGzoneAud.mRelayBgColor;
                   }
                }
             }
             obj = og1;
          }
          obj = objArray;
       }
       this.v = obj;
       if (obj != null) {
          this.P8(true, y.e(this.getActivity()));
          if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
             uob = this.v;
             if (uob != null) {
                g f = uob.f;
                if (f != null) {
                   try{
                      i = Color.parseColor(f);
                      int i1 = Color.parseColor(this.v.g);
                      i2 = Color.parseColor(this.v.h);
                      int i3 = -1;
                      if (!i1) {
                         i1 = -1;
                      }
                      if (!i2) {
                         i2 = a1.a(R.color.arg_RES_7f061e07);
                      }
                      this.r.setBackgroundColor(i);
                      obj = new int[][2]{ointArray,StateSet.WILD_CARD};
                      ointArray = new int[true];
                      ointArray[0] = 0x10100a1;
                      int[] ointArray1 = new int[]{i3,a1.a(0x7f06204e)};
                      this.s.setTextColor(new ColorStateList(obj, ointArray1));
                      this.s.setIndicatorColor(R.color.arg_RES_7f061c32);
                      a0 n1 = this.q.N1;
                      if (n1 != null && n1.fe().d != null) {
                         this.q.N1.fe().d.a(i1, i2);
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
             }
          }
       }
       this.q.x.W0(this.w, false);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.q.x.Q0(this.w);
       return;
    }
    public final void P8(boolean p0,boolean p1){
       if (this.v == null) {
          return;
       }
       if (!p0 && p1 == this.u) {
          return;
       }
       this.u = p1;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1f95);
       this.s = m1.f(p0, 0x7f0a3cb6);
       this.t = m1.f(p0, 0x7f0a041c);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       return;
    }
}
