package com.kwai.social.startup.relation.model.SocialShakeConfig;
import java.io.Serializable;
import com.kwai.social.startup.relation.model.EntranceConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.lang.Boolean;
import qe6.b;
import com.kwai.social.startup.relation.model.SocialShakeMutilLanguage;
import java.lang.Number;

public final class SocialShakeConfig implements Serializable	// class@0018b9
{
    public final boolean enableShake;
    public final EntranceConfig entranceConfig;

    public void SocialShakeConfig(boolean p0,EntranceConfig p1){
       super();
       this.enableShake = p0;
       this.entranceConfig = p1;
    }
    public static SocialShakeConfig copy$default(SocialShakeConfig p0,boolean p1,EntranceConfig p2,int p3,Object p4){
       SocialShakeConfig enableShake;
       SocialShakeConfig entranceConf;
       if (p3 & 0x01) {
          enableShake = p0.enableShake;
       }
       if (p3 & 0x02) {
          entranceConf = p0.entranceConfig;
       }
       return p0.copy(enableShake, entranceConf);
    }
    public final String a(){
       String obj = PatchProxy.apply(null, this, SocialShakeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b();
       if (a.g(obj, "zh")) {
          String str = a.a();
          StringBuilder str1 = (str == null || !str.length())? 1: null;
          if (!str1) {
             return obj+'-'+str;
          }
       }
       a.o(obj, "language");
       return obj;
    }
    public final boolean component1(){
       return this.enableShake;
    }
    public final EntranceConfig component2(){
       return this.entranceConfig;
    }
    public final SocialShakeConfig copy(boolean p0,EntranceConfig p1){
       if (PatchProxy.isSupport(SocialShakeConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, SocialShakeConfig.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SocialShakeConfig(p0, p1);
    }
    public final boolean enableShake(){
       Object obj = PatchProxy.apply(null, this, SocialShakeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.enableShake != null && b.a())? true: false;
       return b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SocialShakeConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SocialShakeConfig && (this.enableShake == p0.enableShake && a.g(this.entranceConfig, p0.entranceConfig)))) {
          return true;
       }
       return false;
    }
    public final boolean getEnableShake(){
       return this.enableShake;
    }
    public final EntranceConfig getEntranceConfig(){
       return this.entranceConfig;
    }
    public final String getIconUrl(){
       String iconUrl;
       SocialShakeConfig obj = PatchProxy.apply(null, this, SocialShakeConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.entranceConfig;
       if (obj != null) {
          iconUrl = obj.getIconUrl();
          if (iconUrl != null) {
          label_001d :
             return iconUrl;
          }
       }
       iconUrl = "";
       goto label_001d ;
    }
    public final String getSubTitle(){
       SocialShakeConfig tentranceCon;
       SocialShakeMutilLanguage subTitle;
       String obj = PatchProxy.apply(null, this, SocialShakeConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       int i = obj.hashCode();
       String str = "";
       if (i != 0x6e72b6a) {
          if (i == 0x6e72d82 && obj.equals("zh-TW")) {
             tentranceCon = this.entranceConfig;
             if (tentranceCon != null) {
                subTitle = tentranceCon.getSubTitle();
                if (subTitle != null) {
                   obj = subTitle.getZhTw();
                   if (obj != null) {
                   label_0067 :
                      str = obj;
                   }
                }
             }
          }else {
          label_0057 :
             tentranceCon = this.entranceConfig;
             if (tentranceCon != null) {
                subTitle = tentranceCon.getSubTitle();
                if (subTitle != null) {
                   obj = subTitle.getEnUs();
                   if (obj != null) {
                      goto label_0067 ;
                   }
                }
             }
          }
       }else if(obj.equals("zh-CN")){
          tentranceCon = this.entranceConfig;
          if (tentranceCon != null) {
             subTitle = tentranceCon.getSubTitle();
             if (subTitle != null) {
                obj = subTitle.getZhCn();
                if (obj != null) {
                   goto label_0067 ;
                }
             }
          }
       }else {
          goto label_0057 ;
       }
       return str;
    }
    public final String getTitle(){
       SocialShakeConfig tentranceCon;
       SocialShakeMutilLanguage title;
       String obj = PatchProxy.apply(null, this, SocialShakeConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       int i = obj.hashCode();
       String str = "";
       if (i != 0x6e72b6a) {
          if (i == 0x6e72d82 && obj.equals("zh-TW")) {
             tentranceCon = this.entranceConfig;
             if (tentranceCon != null) {
                title = tentranceCon.getTitle();
                if (title != null) {
                   obj = title.getZhTw();
                   if (obj != null) {
                   label_0067 :
                      str = obj;
                   }
                }
             }
          }else {
          label_0057 :
             tentranceCon = this.entranceConfig;
             if (tentranceCon != null) {
                title = tentranceCon.getTitle();
                if (title != null) {
                   obj = title.getEnUs();
                   if (obj != null) {
                      goto label_0067 ;
                   }
                }
             }
          }
       }else if(obj.equals("zh-CN")){
          tentranceCon = this.entranceConfig;
          if (tentranceCon != null) {
             title = tentranceCon.getTitle();
             if (title != null) {
                obj = title.getZhCn();
                if (obj != null) {
                   goto label_0067 ;
                }
             }
          }
       }else {
          goto label_0057 ;
       }
       return str;
    }
    public int hashCode(){
       int i;
       SocialShakeConfig obj = PatchProxy.apply(null, this, SocialShakeConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enableShake;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       SocialShakeConfig tentranceCon = this.entranceConfig;
       int i1 = (tentranceCon != null)? tentranceCon.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       String zhCn;
       Object[] objArray1;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, SocialShakeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "SocialShakeConfiguration\t enable: "+this.enableShake+", "+"titleZhCn: ";
       SocialShakeConfig tentranceCon = this.entranceConfig;
       if (tentranceCon != null) {
          SocialShakeMutilLanguage title = tentranceCon.getTitle();
          if (title != null) {
             zhCn = title.getZhCn();
          label_0039 :
             obj = obj+zhCn+' '+"titleZhTw: ";
             SocialShakeConfig tentranceCon1 = this.entranceConfig;
             if (tentranceCon1 != null) {
                SocialShakeMutilLanguage title1 = tentranceCon1.getTitle();
                if (title1 != null) {
                   String zhTw = title1.getZhTw();
                label_0056 :
                   obj = obj+zhTw+' '+"titleEnUs: ";
                   tentranceCon1 = this.entranceConfig;
                   if (tentranceCon1 != null) {
                      title1 = tentranceCon1.getTitle();
                      if (title1 != null) {
                         zhTw = title1.getEnUs();
                      label_0071 :
                         obj = obj+zhTw+' '+"subTitleZhCn: ";
                         tentranceCon1 = this.entranceConfig;
                         if (tentranceCon1 != null) {
                            title1 = tentranceCon1.getSubTitle();
                            if (title1 != null) {
                               zhTw = title1.getZhCn();
                            label_008c :
                               obj = obj+zhTw+' '+"subTitleZhTw: ";
                               tentranceCon1 = this.entranceConfig;
                               if (tentranceCon1 != null) {
                                  title1 = tentranceCon1.getSubTitle();
                                  if (title1 != null) {
                                     zhTw = title1.getZhTw();
                                  label_00a7 :
                                     obj = obj+zhTw+' '+"subTitleEnUs: ";
                                     tentranceCon1 = this.entranceConfig;
                                     if (tentranceCon1 != null) {
                                        title1 = tentranceCon1.getSubTitle();
                                        if (title1 != null) {
                                           zhTw = title1.getEnUs();
                                        label_00c2 :
                                           obj = obj+zhTw+' '+"iconUrl: ";
                                           tentranceCon1 = this.entranceConfig;
                                           zhTw = (tentranceCon1 != null)? tentranceCon1.getIconUrl(): objArray;
                                           obj = obj+zhTw+' '+"jumpUrl: ";
                                           tentranceCon1 = this.entranceConfig;
                                           if (tentranceCon1 != null) {
                                              objArray = tentranceCon1.getJumpUrl();
                                           }
                                           return obj+objArray+' ';
                                        }
                                     }
                                     objArray1 = objArray;
                                     goto label_00c2 ;
                                  }
                               }
                               objArray1 = objArray;
                               goto label_00a7 ;
                            }
                         }
                         objArray1 = objArray;
                         goto label_008c ;
                      }
                   }
                   objArray1 = objArray;
                   goto label_0071 ;
                }
             }
             objArray1 = objArray;
             goto label_0056 ;
          }
       }
       zhCn = objArray;
       goto label_0039 ;
    }
}
