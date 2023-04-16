package fu2.g;
import at5.a;
import fu2.g$a;
import nsd.u;
import lnc.a1;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import fu2.h;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.video.waynelive.LivePlayerController;
import android.view.ViewGroup;
import java.lang.Boolean;
import sp5.b;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kwai.framework.plugin.PluginManager;
import android.content.res.Resources;
import com.kuaishou.android.live.log.LiveLogTag;
import fu2.a;
import android.content.Context;
import android.graphics.Point;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil;
import com.yxcorp.utility.n;
import java.util.Objects;

public class g implements a	// class@0029ea
{
    public b a;
    public b b;
    public final LiveStreamFeed c;
    public final Object d;
    public static final String e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final g$a i;

    static {
       g.i = new g$a(null);
       g.e = "VoicePartyPlayViewInterceptor";
       g.f = a1.d(0x7f070a1f);
       g.g = a1.d(0x7f070a1e);
       g.h = a1.d(0x7f070a06);
    }
    public void g(LiveStreamFeed p0,Object p1){
       a.p(p0, "feed");
       super();
       this.c = p0;
       this.d = p1;
    }
    public final int a(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 4;
       int i1 = 2;
       if (p0 != null && p0.intValue() == 5) {
          i = 2;
       }else if(p0 != null && p0.intValue() == i1){
          i = 1;
       }else if(p0 != null && p0.intValue() == 3){
          if (p0 != null && p0.intValue() == i) {
             i = 5;
          }else if(p0 != null && p0.intValue() == 1){
             i = 3;
          }else {
             i = 6;
             i = (p0 != null && p0.intValue() == i)? 7: 0;
          }
       }
       return i;
    }
    public void b(View p0,View p1,Rect p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "7")) {
          return;
       }
       a.p(p0, "playView");
       a.p(p1, "playViewContainer");
       a.p(p2, "rect");
       ViewGroup$MarginLayoutParams marginLayout = h.d(p1.getLayoutParams(), p2.width(), p2.height(), p2.left, p2.top, 0, 0);
       if (marginLayout instanceof ConstraintLayout$LayoutParams) {
          ViewGroup$MarginLayoutParams marginLayout1 = marginLayout;
          int i = 0;
          marginLayout1.h = i;
          marginLayout1.d = i;
       }else if(marginLayout instanceof FrameLayout$LayoutParams){
          marginLayout.gravity = 51;
       }
       p1.setLayoutParams(marginLayout);
       if (p2.width() && p2.height()) {
          p0.setLayoutParams(h.e(p0.getLayoutParams(), p2.width(), p2.height(), 0, 0, 0, 0, 120, null));
       }
       return;
    }
    public boolean l(LivePlayerController p0,int p1,int p2,int p3,int p4,View p5,ViewGroup p6){
       int b;
       LiveStreamFeed obj3;
       b uob4;
       String str1;
       Object[] objArray2;
       Rect rect;
       int i9;
       PluginManager obj4;
       Object obj = this;
       object oobject = p0;
       int i = p1;
       int i1 = p2;
       boolean i2 = p3;
       int i3 = p4;
       object oobject1 = p5;
       object oobject2 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       int i4 = 2;
       boolean i5 = 7;
       int i6 = 3;
       int i7 = 1;
       int i8 = 0;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[i5];
          objArray[i8] = oobject;
          objArray[i7] = Integer.valueOf(p1);
          objArray[i4] = Integer.valueOf(p2);
          objArray[i6] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = oobject1;
          objArray[6] = oobject2;
          Object obj1 = PatchProxy.apply(objArray, obj, og, "1");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       a.p(oobject, "livePlayerController");
       a.p(oobject1, "playView");
       a.p(oobject2, "playViewContainer");
       b uob = new b(i, i1);
       b uob1 = new b(i2, i3);
       if (a.g(uob, obj.a) && a.g(uob1, obj.b)) {
          return i7;
       }else {
          g d = obj.d;
          g c = obj.c;
          LiveVoicePartyLogTag obj2 = PatchProxy.applyTwoRefs(d, c, obj, og, "8");
          b uob2 = uob;
          String str = "feed";
          b uob3 = uob1;
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else {
             a.p(c, str);
             obj2 = LiveVoicePartyLogTag.AUDIENCE;
             str1 = g.e;
             b.Z(obj2, str1+" isNeedInterceptPlayViewResize playViewTag: "+d);
             if (!h.b(d)) {
                if (d == null) {
                   obj4 = PatchProxy.applyOneRefs(c, obj, og, "9");
                   if (obj4 != patchProxyRe) {
                      i2 = obj4.booleanValue();
                   }else {
                      LiveStreamFeed mConfig = c.mConfig;
                      Integer integer1 = (mConfig != null)? Integer.valueOf(mConfig.mStreamType): null;
                      b = StreamType.VIDEO.toInt();
                      if (integer1 == null || integer1.intValue() != b) {
                         b = StreamType.AUDIO.toInt();
                         if (integer1 == null || integer1.intValue() != b) {
                            b = StreamType.VOICEPARTY.toInt();
                            if (integer1 == null || integer1.intValue() != b) {
                            label_016b :
                               i2 = false;
                            }
                         }
                      }
                      StringBuilder str2 = str1+" isPlayerViewAdjustmentNeededBasedOnFeed streamType: ";
                      obj3 = c.mConfig;
                      Integer integer2 = (obj3 != null)? Integer.valueOf(obj3.mStreamType): null;
                      b.Z(obj2, str2+integer2);
                      mConfig = c.mLiveStreamModel;
                      integer1 = (mConfig != null)? Integer.valueOf(mConfig.mVoicePartySubType): null;
                      if (h.b(Integer.valueOf(obj.a(integer1)))) {
                         str2 = str1+" isPlayerViewAdjustmentNeededBasedOnFeed subType: ";
                         LiveStreamFeed mLiveStreamM1 = c.mLiveStreamModel;
                         Integer integer3 = (mLiveStreamM1 != null)? Integer.valueOf(mLiveStreamM1.mVoicePartySubType): null;
                         b.Z(obj2, str2+integer3);
                         i2 = true;
                      }else {
                         goto label_016b ;
                      }
                   }
                   if (!i2) {
                   label_016f :
                      obj4 = null;
                   label_0172 :
                      b = obj4;
                   }
                }else {
                   goto label_016f ;
                }
             }
             obj4 = 1;
             goto label_0172 ;
          }
          if (b) {
             obj3 = null;
             i4 = 2;
             i5 = false;
             PluginManager.K(PluginManager.H, p5.getResources(), i5, i4, obj3);
             g c1 = obj.c;
             if (PatchProxy.isSupport(og)) {
                Object[] objArray1 = new Object[]{c1,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),oobject1,oobject2};
                if (!PatchProxy.applyVoid(objArray1, obj, og, "2")) {
                label_01b9 :
                   a.p(c1, str);
                   a.p(oobject1, "playView");
                   a.p(oobject2, "playViewContainer");
                   g d1 = obj.d;
                   if (!d1 instanceof Integer) {
                      d1 = obj3;
                   }
                   if (d1 == null) {
                      LiveStreamFeed mLiveStreamM = c1.mLiveStreamModel;
                      Integer integer = (mLiveStreamM != null)? Integer.valueOf(mLiveStreamM.mVoicePartySubType): obj3;
                      d1 = Integer.valueOf(obj.a(integer));
                   }
                   LiveLogTag lIVE_VOICE_P = LiveLogTag.LIVE_VOICE_PARTY;
                   b = p3;
                   i4 = p4;
                   str1 = "adjustPlayerView vw:"+i+" vh:"+i1+" rw:"+b+" rh:"+i4+' '+"mode:"+d1+' ';
                   i5 = (!p5.getVisibility())? true: false;
                   b.Z(lIVE_VOICE_P, str1+i5);
                   if (i > 0 && (i1 > 0 && (b > 0 && i4 > 0))) {
                      i3 = 2;
                      if (d1.intValue() == i3) {
                         if (PatchProxy.isSupport(og)) {
                            objArray2 = new Object[]{Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),oobject1,oobject2};
                            if (!PatchProxy.applyVoid(objArray2, obj, og, "3")) {
                            }
                         }else {
                         }
                      }else if(d1.intValue() == 7){
                         if (PatchProxy.isSupport(og)) {
                            objArray2 = new Object[]{Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),oobject1,oobject2};
                            if (!PatchProxy.applyVoid(objArray2, obj, og, "4")) {
                            }
                         }else {
                         }
                      }else if(d1.intValue() == 1){
                         if (PatchProxy.isSupport(og)) {
                            uob4 = uob2;
                            if (PatchProxy.applyVoidFourRefs(Integer.valueOf(p1), Integer.valueOf(p2), p5, p6, this, g.class, "5")) {
                            label_0397 :
                               obj.a = uob4;
                               obj.b = uob3;
                               h e = h.e;
                               Objects.requireNonNull(e);
                               Objects.requireNonNull(e);
                               oobject1.setTag(h.b, Integer.valueOf(h.c));
                               return true;
                            }
                         }else {
                            uob4 = uob2;
                         }
                         a.p(oobject1, "playView");
                         a.p(oobject2, "playViewContainer");
                         b.Z(LiveVoicePartyLogTag.KTV, "adjustPlayerViewForKTV");
                         Point point = VoicePartySurfaceUtil.f(p6.getContext());
                         i = n.A(p5.getContext()) + a1.d(0x7f070a09);
                         obj.b(oobject1, oobject2, new Rect(0, i, point.x, (point.y + i)));
                         goto label_0397 ;
                      }else {
                         uob4 = uob2;
                         if (d1.intValue() == 3 || (d1.intValue() == 5 || (d1.intValue() != 4 || PatchProxy.applyVoidTwoRefs(oobject1, oobject2, obj, og, "6")))) {
                            goto label_0397 ;
                         }else {
                            a.p(oobject1, "playView");
                            a.p(oobject2, "playerViewContainer");
                            b.Z(LiveVoicePartyLogTag.AUDIENCE, "adjustPlayerViewForAudioScene");
                            obj.b(oobject1, oobject2, new Rect(0, 0, 0, 0));
                            goto label_0397 ;
                         }
                      }
                   }
                }
             }else {
                goto label_01b9 ;
             }
          label_0395 :
             uob4 = uob2;
             goto label_0397 ;
          }else {
             return false;
          }
       }
    }
}
