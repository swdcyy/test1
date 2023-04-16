package com.kwai.components.featuremodel.Stag$Factory;
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
import com.kwai.feature.api.social.profile.model.DraftGuideConfig;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot;
import com.yxcorp.gifshow.model.response.RealtimeStartupResponse;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import com.yxcorp.gifshow.reco.FeedMiscPojo;
import com.yxcorp.gifshow.reco.StagFactorykscomponentsfeaturemodel;
import com.yxcorp.gifshow.model.response.feed.StagFactorykscomponentsfeaturemodel;
import com.yxcorp.gifshow.model.response.StagFactorykscomponentsfeaturemodel;
import com.yxcorp.gifshow.model.StagFactorykscomponentsfeaturemodel;
import com.kwai.feature.api.social.profile.model.StagFactorykscomponentsfeaturemodel;

public class Stag$Factory implements j	// class@000ab5
{
    public final HashMap b;
    public final j[] c;

    public void Stag$Factory(){
       super();
       this.b = new HashMap(5);
       j[] ojArray = new j[5];
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
       j oj1;
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
             int i = this.b.size();
             TypeAdapter typeAdapter1 = 4;
             if (i) {
                if (i != 1) {
                   if (i != 2) {
                      if (i != 3) {
                         if (i != typeAdapter1) {
                         label_0085 :
                            _monitor_exit(this);
                            typeAdapter1 = typeAdapter;
                         }else {
                         label_007b :
                            oj = this.d(FeedMiscPojo.class, obj, typeAdapter1);
                            if (oj != null) {
                               _monitor_exit(this);
                            }else {
                               goto label_0085 ;
                            }
                         }
                      }else {
                      label_0071 :
                         oj1 = this.d(HomeFeedResponse.class, obj, 3);
                         if (oj1 != null) {
                            _monitor_exit(this);
                         }else {
                            goto label_007b ;
                         }
                      }
                   }else {
                   label_0067 :
                      oj1 = this.d(RealtimeStartupResponse.class, obj, 2);
                      if (oj1 != null) {
                         _monitor_exit(this);
                      }else {
                         goto label_0071 ;
                      }
                   }
                }else {
                label_005d :
                   oj1 = this.d(ProfileTemplateCard$ProfileCardRedDot.class, obj, 1);
                   if (oj1 != null) {
                      _monitor_exit(this);
                   }else {
                      goto label_0067 ;
                   }
                }
             }else {
                oj1 = this.d(DraftGuideConfig.class, obj, 0);
                if (oj1 != null) {
                   _monitor_exit(this);
                }else {
                   goto label_005d ;
                }
             }
             oj = oj1;
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
          StagFactorykscomponentsfeaturemodel stagFactoryk = null;
          if (PatchProxy.isSupport(uFactory)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), stagFactoryk, uFactory, "2");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             label_0063 :
                this.c[p0] = obj;
             }
          }
          if (p0) {
             if (p0 != 1) {
                if (p0 != 2) {
                   if (p0 != 3) {
                      if (p0 == 4) {
                         stagFactoryk = new StagFactorykscomponentsfeaturemodel();
                      }
                   }else {
                      stagFactoryk = new StagFactorykscomponentsfeaturemodel();
                   }
                }else {
                   stagFactoryk = new StagFactorykscomponentsfeaturemodel();
                }
             }else {
                stagFactoryk = new StagFactorykscomponentsfeaturemodel();
             }
          }else {
             stagFactoryk = new StagFactorykscomponentsfeaturemodel();
          }
          obj = stagFactoryk;
          goto label_0063 ;
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
