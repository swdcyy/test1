package hi2.b;
import hi2.d;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinCommonInfo;
import java.util.ArrayList;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$ConditionRedPackSkin;
import hi2.c;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo;
import hi2.g;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo;
import hi2.f;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo;
import fi2.d;
import java.lang.Integer;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class b extends d	// class@002d9f
{
    public c f;
    public g g;
    public f h;
    public c i;
    public String j;
    public List k;

    public void b(LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme p0){
       a.p(p0, "skinTheme");
       LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme commonInfo = p0.commonInfo;
       a.o(commonInfo, "skinTheme.commonInfo");
       super(commonInfo);
       this.j = "";
       this.k = new ArrayList();
       LiveCustomRedPackSkinMessage$ConditionRedPackSkin conditionRed = p0.getConditionRedPackSkin();
       if (conditionRed != null) {
          conditionRed = conditionRed.joinButton;
          if (conditionRed != null) {
             this.f = new c(conditionRed);
          }
       }
       conditionRed = p0.getConditionRedPackSkin();
       if (conditionRed != null) {
          conditionRed = conditionRed.innerInfo;
          if (conditionRed != null) {
             this.g = new g(conditionRed);
          }
       }
       conditionRed = p0.getConditionRedPackSkin();
       if (conditionRed != null) {
          conditionRed = conditionRed.badgeInfo;
          if (conditionRed != null) {
             this.h = new f(conditionRed);
          }
       }
       conditionRed = p0.getConditionRedPackSkin();
       if (conditionRed != null) {
          conditionRed = conditionRed.sendGiftButton;
          if (conditionRed != null) {
             this.i = new c(conditionRed);
          }
       }
       conditionRed = p0.getConditionRedPackSkin();
       if (conditionRed != null) {
          conditionRed = conditionRed.themeTextColor;
          if (conditionRed != null) {
             this.j = conditionRed;
          }
       }
       LiveCustomRedPackSkinMessage$ConditionRedPackSkin conditionRed1 = p0.getConditionRedPackSkin();
       if (conditionRed1 != null) {
          conditionRed1 = conditionRed1.resultRefreshButtonBgColor;
          if (conditionRed1 != null) {
             int len = conditionRed1.length;
             int i = 0;
             while (i < len) {
                object oobject = conditionRed1[i];
                a.o(oobject, "it");
                Integer integer = d.b.d(oobject);
                if (integer != null) {
                   this.k.add(integer);
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public final c e(){
       return this.f;
    }
    public final Integer f(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b.d(this.j);
    }
    public final boolean g(){
       boolean b;
       boolean b1;
       boolean b2;
       boolean b3;
       f uof = f.class;
       d uod = d.class;
       b uob = b.class;
       b obj = PatchProxy.apply(null, this, uob, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, uob, "5");
       b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          obj = PatchProxy.apply(null, this, uod, "12");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(!q.f(this.a) && (!q.f(this.b) && !q.f(this.c))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             obj = this.f;
             if (obj != null && obj.c() == true) {
                obj = this.i;
                if (obj != null && obj.c() == true) {
                   obj = this.h;
                   if (obj != null) {
                      Object obj5 = PatchProxy.apply(null, obj, uof, "3");
                      if (obj5 != PatchProxyResult.class) {
                         b1 = obj5.booleanValue();
                      }else if(obj.a() != null){
                         b1 = true;
                      }else {
                         b1 = false;
                      }
                      if (b1 == true && this.f() != null) {
                         b1 = true;
                      }
                   }
                }
             }
          }
          b1 = false;
       }
       if (b1) {
          return true;
       }else {
          Object obj1 = PatchProxy.apply(null, this, uob, "6");
          if (obj1 != PatchProxyResult.class) {
             b2 = obj1.booleanValue();
          }else {
             obj1 = PatchProxy.apply(null, this, uod, "13");
             if (obj1 != PatchProxyResult.class) {
                b3 = obj1.booleanValue();
             }else if(q.f(this.a) && (q.f(this.b) && q.f(this.c))){
                b3 = true;
             }else {
                b3 = false;
             }
             if (b3) {
                uob = this.f;
                if (uob != null) {
                   a.m(uob);
                   if (!uob.d()) {
                   label_0113 :
                      b2 = false;
                   }
                }
                uob = this.i;
                if (uob != null) {
                   a.m(uob);
                   if (!uob.d()) {
                   }
                }
                uob = this.h;
                if (uob != null) {
                   a.m(uob);
                   Object obj4 = PatchProxy.apply(null, uob, uof, "4");
                   if (obj4 != PatchProxyResult.class) {
                      b2 = obj4.booleanValue();
                   }else if(uob.a() == null){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                   if (!b2) {
                   }
                }
                if (this.f() == null) {
                   b2 = true;
                }else {
                   goto label_0113 ;
                }
             }else {
                goto label_0113 ;
             }
          }
          if (b2) {
             b obj2 = PatchProxy.apply(null, this, uod, "14");
             if (obj2 != PatchProxyResult.class) {
                b2 = obj2.booleanValue();
             }else if(!q.f(this.d) || !q.f(this.e)){
                b2 = true;
             }else {
                b2 = false;
             }
             if (!b2) {
                obj2 = this.g;
                if (obj2 != null) {
                   Object obj3 = PatchProxy.apply(null, obj2, g.class, "3");
                   b2 = (obj3 != PatchProxyResult.class)? obj3.booleanValue(): q.f(obj2.a) ^ true;
                   if (b2 != 1) {
                   label_0158 :
                      return b;
                   }
                }else {
                   goto label_0158 ;
                }
             }
             b = true;
             goto label_0158 ;
          }else {
             goto label_0158 ;
          }
       }
    }
}
