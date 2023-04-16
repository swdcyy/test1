package com.kwai.framework.model.Stag$Factory;
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
import com.kuaishou.android.model.mix.ScoreMark;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.gifshow.platform.network.keyconfig.UploadConfig;
import com.kwai.framework.model.common.Distance;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kwai.framework.model.user.ProfileDynamicPendant;
import com.yxcorp.gifshow.pendant.kmessage.Message$BubbleConfig;
import com.yxcorp.gifshow.pendant.response.WatchVideoStyle;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import com.yxcorp.gifshow.tube.TubeRankInfo;
import com.yxcorp.gifshow.tube.StagFactorykskernelsframeworkmodel;
import com.yxcorp.gifshow.retrofit.degrade.StagFactorykskernelsframeworkmodel;
import com.yxcorp.gifshow.pendant.response.StagFactorykskernelsframeworkmodel;
import com.yxcorp.gifshow.pendant.kmessage.StagFactorykskernelsframeworkmodel;
import com.kwai.framework.model.user.StagFactorykskernelsframeworkmodel;
import com.kwai.framework.model.live.StagFactorykskernelsframeworkmodel;
import com.kwai.framework.model.common.StagFactorykskernelsframeworkmodel;
import com.kuaishou.gifshow.platform.network.keyconfig.StagFactorykskernelsframeworkmodel;
import com.kuaishou.android.model.music.StagFactorykskernelsframeworkmodel;
import com.kuaishou.android.model.mix.StagFactorykskernelsframeworkmodel;

public class Stag$Factory implements j	// class@000ba8
{
    public final HashMap b;
    public final j[] c;

    public void Stag$Factory(){
       super();
       this.b = new HashMap(10);
       j[] ojArray = new j[10];
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
                   oj = this.d(ScoreMark.class, obj, 0);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 1:
                   oj = this.d(Music.class, obj, 1);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 2:
                   oj = this.d(UploadConfig.class, obj, 2);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 3:
                   oj = this.d(Distance.class, obj, 3);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 4:
                   oj = this.d(LiveTipInfo.class, obj, 4);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 5:
                   oj = this.d(ProfileDynamicPendant.class, obj, 5);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 6:
                   oj = this.d(Message$BubbleConfig.class, obj, 6);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 7:
                   oj = this.d(WatchVideoStyle.class, obj, 7);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 8:
                   oj = this.d(DegradeConfig$UrlDegrade.class, obj, 8);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   }
                 case 9:
                   oj = this.d(TubeRankInfo.class, obj, 9);
                   if (oj != null) {
                      _monitor_exit(this);
                   }else {
                   label_00ba :
                      _monitor_exit(this);
                      oj = typeAdapter;
                   }
                   break;
                 default:
                   goto label_00ba ;
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
          StagFactorykskernelsframeworkmodel stagFactoryk = null;
          if (PatchProxy.isSupport(uFactory)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), stagFactoryk, uFactory, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             label_0076 :
                this.c[p0] = obj;
             }
          }
          switch (p0){
              case 0:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 1:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 2:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 3:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 4:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 5:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 6:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 7:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 8:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              case 9:
                stagFactoryk = new StagFactorykskernelsframeworkmodel();
                break;
              default:
          }
          obj = stagFactoryk;
          goto label_0076 ;
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
