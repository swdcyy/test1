package com.kuaishou.live.model.Stag$Factory;
import zk.j;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Integer;
import com.kuaishou.live.basic.model.CheckResolutionResponse;
import com.kuaishou.live.core.show.background.LiveBackgroundMusicTipConfig;
import com.kuaishou.live.core.show.chat.model.LiveChatFollowTipConfig;
import com.kuaishou.live.core.show.push.LiveDivertPushV2Config;
import com.kuaishou.live.core.show.race.LiveRaceConfig;
import com.kuaishou.live.core.show.share.LiveCommonShareConfig;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEscrowNoticeConfig;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import com.kuaishou.live.core.voiceparty.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import com.kuaishou.live.core.show.startup.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import com.kuaishou.live.core.show.share.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import com.kuaishou.live.core.show.race.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import com.kuaishou.live.core.show.push.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import com.kuaishou.live.core.show.chat.model.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import com.kuaishou.live.core.show.background.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import com.kuaishou.live.basic.model.StagFactoryksfeaturesftlivelivelibrarieslivemodel;

public class Stag$Factory implements j	// class@000cf3
{
    public final HashMap b;
    public final j[] c;

    public void Stag$Factory(){
       super();
       this.b = new HashMap(8);
       j[] ojArray = new j[8];
       this.c = ojArray;
    }
    public static String b(Class p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, Stag$Factory.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String name = p0.getName();
       int i = name.lastIndexOf(46);
       if (i != -1) {
          str = name.substring(0, i);
       }
       return str;
    }
    public TypeAdapter a(Gson p0,a p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Stag$Factory uFactory = Stag$Factory.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, uFactory, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = Stag$Factory.b(p1.getRawType());
       TypeAdapter typeAdapter = null;
       if (obj == null) {
          return typeAdapter;
       }
       _monitor_enter(this);
       j oj = PatchProxy.applyOneRefs(obj, this, uFactory, "5");
       if (oj != patchProxyRe) {
          _monitor_exit(this);
       }else {
          Integer integer = this.b.get(obj);
          if (integer != null) {
             oj = this.c(integer.intValue());
             _monitor_exit(this);
          }else {
             switch (this.b.size()){
                 case 0:
                   oj = this.d(CheckResolutionResponse.class, obj, 0);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 1:
                   oj = this.d(LiveBackgroundMusicTipConfig.class, obj, 1);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 2:
                   oj = this.d(LiveChatFollowTipConfig.class, obj, 2);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 3:
                   oj = this.d(LiveDivertPushV2Config.class, obj, 3);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 4:
                   oj = this.d(LiveRaceConfig.class, obj, 4);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 5:
                   oj = this.d(LiveCommonShareConfig.class, obj, 5);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 6:
                   oj = this.d(LiveConfigStartupResponse$LiveEscrowNoticeConfig.class, obj, 6);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 7:
                   oj = this.d(LiveVoicePartyTheaterCommonConfig.class, obj, 7);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   label_00a0 :
                      _monitor_exit(this);
                      oj = typeAdapter;
                   }
                   break;
                 default:
                   goto label_00a0 ;
             }
          }
       }
       if (oj != null) {
          typeAdapter = oj.a(p0, p1);
       }
       return typeAdapter;
    }
    public final j c(int p0){
       object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Stag$Factory uFactory = Stag$Factory.class;
       if (PatchProxy.isSupport(uFactory)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uFactory, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.c[p0];
       if (obj == null) {
          StagFactoryksfeaturesftlivelivelibrarieslivemodel stagFactoryk = null;
          if (PatchProxy.isSupport(uFactory)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), stagFactoryk, uFactory, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             label_006a :
                this.c[p0] = obj;
             }
          }
          switch (p0){
              case 0:
                stagFactoryk = new StagFactoryksfeaturesftlivelivelibrarieslivemodel();
                break;
              case 1:
                stagFactoryk = new StagFactoryksfeaturesftlivelivelibrarieslivemodel();
                break;
              case 2:
                stagFactoryk = new StagFactoryksfeaturesftlivelivelibrarieslivemodel();
                break;
              case 3:
                stagFactoryk = new StagFactoryksfeaturesftlivelivelibrarieslivemodel();
                break;
              case 4:
                stagFactoryk = new StagFactoryksfeaturesftlivelivelibrarieslivemodel();
                break;
              case 5:
                stagFactoryk = new StagFactoryksfeaturesftlivelivelibrarieslivemodel();
                break;
              case 6:
                stagFactoryk = new StagFactoryksfeaturesftlivelivelibrarieslivemodel();
                break;
              case 7:
                stagFactoryk = new StagFactoryksfeaturesftlivelivelibrarieslivemodel();
                break;
              default:
          }
          obj = stagFactoryk;
          goto label_006a ;
       }
       return obj;
    }
    public final j d(Class p0,String p1,int p2){
       if (PatchProxy.isSupport(Stag$Factory.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, Stag$Factory.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = Stag$Factory.b(p0);
       this.b.put(str, Integer.valueOf(p2));
       if (p1.equals(str)) {
          return this.c(p2);
       }else {
          return null;
       }
    }
}
