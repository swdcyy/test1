package com.kwai.component.stargateegg.log.StargateEggIntervalLogger$handler$2$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.stargateegg.log.StargateEggIntervalLogger;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.component.stargateegg.log.StargateEggIntervalLogger$a;
import java.lang.Number;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import q2b.h$b;
import ekd.y0;

public final class StargateEggIntervalLogger$handler$2$a implements Runnable	// class@000b38
{
    public static final StargateEggIntervalLogger$handler$2$a b;

    static {
       StargateEggIntervalLogger$handler$2$a.b = new StargateEggIntervalLogger$handler$2$a();
    }
    public void StargateEggIntervalLogger$handler$2$a(){
       super();
    }
    public final void run(){
       h$b obj;
       ClientEvent$ElementPackage uElementPack;
       Set set;
       Map this;
       h$b uob;
       Iterator iterator2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StargateEggIntervalLogger$handler$2$a.class, "1")) {
          return;
       }
       StargateEggIntervalLogger e = StargateEggIntervalLogger.e;
       Objects.requireNonNull(e);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, e, StargateEggIntervalLogger.class, "2")) {
          Map b = StargateEggIntervalLogger.b;
          int i = 0;
          if (b.isEmpty() ^ 1) {
             StargateEggIntervalLogger.a = i;
             Iterator iterator = b.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                obj = uEntry.getKey();
                int i1 = uEntry.getValue().intValue();
                if (PatchProxy.isSupport(StargateEggIntervalLogger.class)) {
                   uElementPack = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i1), e, StargateEggIntervalLogger.class, "3");
                   if (uElementPack != patchProxyRe) {
                   }else {
                   label_0078 :
                      String str = obj.b();
                      switch (str.hashCode()){
                          case 0xa7bbf260:
                            if (str.equals("COMMENT_AT_IMAGE_TAIL")) {
                            label_00af :
                               str = "ACTIVITY_COMMENT_SHOW";
                            }else {
                            label_00b2 :
                               str = null;
                            }
                            break;
                          case 0xa8a6c88f:
                            if (str.equals("COMMENT_POST_KEYWORD_ANIMATION")) {
                               goto label_00af ;
                            }else {
                               goto label_00b2 ;
                            }
                            break;
                          case 0xbfd157df:
                            if (str.equals("DANMAKU_POST_KEYWORD_ANIMATION")) {
                            label_009f :
                               str = "ACTIVITY_DAMUKU_SHOW";
                            }else {
                               goto label_00b2 ;
                            }
                            break;
                          case 0xc6604515:
                            if (str.equals("KEYWORD_VIDEO_DANMAKU")) {
                               goto label_009f ;
                            }else {
                               goto label_00b2 ;
                            }
                            break;
                          case 0x6b69d57:
                            if (str.equals("WISH_DANMAKU")) {
                               goto label_009f ;
                            }else {
                               goto label_00b2 ;
                            }
                            break;
                          case 0x27b7f9f5:
                            if (str.equals("KEYWORD_IMAGE_DANMAKU")) {
                               goto label_009f ;
                            }else {
                               goto label_00b2 ;
                            }
                            break;
                          default:
                            goto label_00b2 ;
                      }
                      uElementPack = (str != null)? StargateEggIntervalLogger.e.a(str, obj.a(), obj.b(), i1): null;
                   }
                }else {
                   goto label_0078 ;
                }
                if (uElementPack != null) {
                   u1.C0("", null, 3, uElementPack, null);
                }
                obj = 1;
             }
             StargateEggIntervalLogger.b.clear();
             set = null;
          }else {
             set = 1;
          }
          this = StargateEggIntervalLogger.c;
          if (this.isEmpty() ^ 1) {
             StargateEggIntervalLogger.a = i;
             Iterator iterator1 = this.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry int uEntry1 = iterator1.next();
                StargateEggIntervalLogger$a key = uEntry1.getKey();
                uEntry1 = uEntry1.getValue().intValue();
                if (PatchProxy.isSupport(StargateEggIntervalLogger.class)) {
                   uob = PatchProxy.applyTwoRefs(key, Integer.valueOf(uEntry1), e, StargateEggIntervalLogger.class, "4");
                   if (uob != patchProxyRe) {
                      iterator2 = iterator1;
                   }else {
                   label_0121 :
                      String str1 = key.b();
                      switch (str1.hashCode()){
                          case 0xa7bbf260:
                            if (str1.equals("COMMENT_AT_IMAGE_TAIL")) {
                            label_0158 :
                               str1 = "ACTIVITY_COMMENT_PUBLISH";
                            }else {
                            label_015b :
                               str1 = null;
                            }
                            break;
                          case 0xa8a6c88f:
                            if (str1.equals("COMMENT_POST_KEYWORD_ANIMATION")) {
                               goto label_0158 ;
                            }else {
                               goto label_015b ;
                            }
                            break;
                          case 0xbfd157df:
                            if (str1.equals("DANMAKU_POST_KEYWORD_ANIMATION")) {
                            label_0148 :
                               str1 = "ACTIVITY_DAMUKU_PUBLISH";
                            }else {
                               goto label_015b ;
                            }
                            break;
                          case 0xc6604515:
                            if (str1.equals("KEYWORD_VIDEO_DANMAKU")) {
                               goto label_0148 ;
                            }else {
                               goto label_015b ;
                            }
                            break;
                          case 0x6b69d57:
                            if (str1.equals("WISH_DANMAKU")) {
                               goto label_0148 ;
                            }else {
                               goto label_015b ;
                            }
                            break;
                          case 0x27b7f9f5:
                            if (str1.equals("KEYWORD_IMAGE_DANMAKU")) {
                               goto label_0148 ;
                            }else {
                               goto label_015b ;
                            }
                            break;
                          default:
                            goto label_015b ;
                      }
                      if (str1 != null) {
                         obj = h$b.e(7, str1);
                         iterator2 = iterator1;
                         obj.k(StargateEggIntervalLogger.e.a(str1, key.a(), key.b(), uEntry1));
                         uob = obj;
                      }else {
                         iterator2 = iterator1;
                         uob = null;
                      }
                   }
                }else {
                   goto label_0121 ;
                }
                e0 uoe0 = null;
                if (uob != null) {
                   u1.p0("", uoe0, uob);
                }
                iterator1 = iterator2;
             }
             StargateEggIntervalLogger.c.clear();
          }else {
             i = set;
          }
          if (i != null) {
             int i2 = StargateEggIntervalLogger.a + 1;
             StargateEggIntervalLogger.a = i2;
             if (i2 >= 3) {
                y0 oy0 = e.b();
                if (oy0 != null) {
                   oy0.e();
                }
             }
          }
       }
    label_01a1 :
       return;
    }
}
