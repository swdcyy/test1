package c57.f$b;
import y47.k;
import c57.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kwai.emotionsdk.bean.EmotionInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import d61.y;
import a57.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.widget.e$a;
import android.os.Bundle;
import hz1.a;
import lp3.c;
import lp3.i;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.library.widget.popup.common.c$b;
import c57.f$b$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.live.gzone.emotion.f;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Objects;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode;

public class f$b implements k	// class@0004ec
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.a.w) ^ 0x01);
    }
    public List b(){
       return this.a.w;
    }
    public String c(){
       return this.a.x;
    }
    public void d(EmotionInfo p0){
       e$a uoa1;
       f z;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "3")) {
          return;
       }
       if (!a1.i(this.a.getActivity())) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.r.a();
       boolean b = y.d(this.a.getActivity());
       a uoa = a.class;
       EmotionPackage uEmotionPack = null;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Boolean.valueOf(b), uEmotionPack, uoa, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_LIVE_GZONE_EMO_UNLOCK";
          uElementPack.type = 18;
          uElementPack.params = a.b(b);
          u1.u0(10, uElementPack, a.a(liveStreamPa));
       }
       Iterator iterator = this.a.w.iterator();
       while (true) {
          if (iterator.hasNext()) {
             EmotionPackage uEmotionPack1 = iterator.next();
             if (TextUtils.n(uEmotionPack1.mId, p0.mEmotionPackageId)) {
                uEmotionPack = uEmotionPack1.mEmotions;
             }
          }
          if (q.f(uEmotionPack)) {
             this.a.P8();
             return;
          }else {
             uoa1 = new e$a(this.a.getActivity());
             Bundle uBundle = new Bundle();
             uBundle.putBoolean("FORCE_DARK", this.a.q.a(a.class).l());
             uBundle.putString("AnchorId", this.a.u.getUserId());
             SerializableHook.putSerializable(uBundle, "EMOTION_INFO", uEmotionPack);
             uoa1.y(uBundle);
             uoa1.M(new f$b$a(this));
             z = this.a.z;
             if (z != null) {
                z.q(0);
                break ;
             }
             break ;
          }
       }
       this.a.z = new f(uoa1);
       f$b ta = this.a;
       z = ta.z;
       z.z = ta.r;
       z.A = ta.p;
       ta.P8();
       this.a.z.Z();
       return;
    }
    public void e(String p0,String p1,long p2){
       if (PatchProxy.isSupport(f$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, f$b.class, "5")) {
          return;
       }
       if (q.f(this.a.w)) {
          return;
       }
       Iterator iterator = this.a.w.iterator();
       while (iterator.hasNext()) {
          EmotionPackage uEmotionPack = iterator.next();
          if (TextUtils.n(p0, uEmotionPack.mId) && !q.f(uEmotionPack.mEmotions)) {
             EmotionInfo uEmotionInfo = null;
             iterator = uEmotionPack.mEmotions.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   EmotionInfo uEmotionInfo1 = iterator.next();
                   if (TextUtils.n(uEmotionInfo1.mId, p1)) {
                      uEmotionInfo1.mPayTime = p2;
                      uEmotionInfo1.mPayStatus = 1;
                      uEmotionInfo = uEmotionInfo1;
                   }else {
                      continue ;
                   }
                }
                if (uEmotionInfo != null && uEmotionPack.mEmotions.remove(uEmotionInfo)) {
                   uEmotionPack.mEmotions.add(0, uEmotionInfo);
                   break ;
                }else {
                   break ;
                }
             }
             return;
          }
       }
    }
    public void f(String p0){
       this.a.x = p0;
    }
    public String[] g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.apply(null, this, f$b.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.a.w != null) {
          obj = new ArrayList();
          Iterator iterator = this.a.w.iterator();
          while (iterator.hasNext()) {
             Iterator iterator1 = iterator.next().mEmotions.iterator();
             while (iterator1.hasNext()) {
                EmotionInfo uEmotionInfo = iterator1.next();
                if (uEmotionInfo.mPayType > 1 && uEmotionInfo.mPayStatus == null) {
                   f$b ta = this.a;
                   uEmotionInfo = uEmotionInfo.mEmotionCode;
                   Objects.requireNonNull(ta);
                   EmotionInfo$EmotionCode obj1 = PatchProxy.applyOneRefs(uEmotionInfo, ta, f.class, "8");
                   if (obj1 != patchProxyRe) {
                   }else if(!q.f(uEmotionInfo)){
                      Iterator iterator2 = uEmotionInfo.iterator();
                      while (true) {
                         if (iterator2.hasNext()) {
                            obj1 = iterator2.next();
                            if (!TextUtils.x(obj1.mLanguage) && !q.f(obj1.mCode)) {
                               obj1 = obj1.mCode.get(0);
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                   obj1 = null;
                   if (!TextUtils.x(obj1)) {
                      obj.add(obj1);
                   }
                }
             }
          }
          if (obj.size() > 0) {
             String[] stringArray = new String[0];
             return obj.toArray(stringArray);
          }
       }
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "4")) {
          return;
       }
       f z = this.a.z;
       if (z != null && z.K()) {
          this.a.z.q(0);
       }
       return;
    }
}
