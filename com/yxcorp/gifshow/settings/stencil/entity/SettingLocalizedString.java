package com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ra6.a;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SettingLocalizedString implements Serializable	// class@001b37
{
    public final String en;
    public final String sc;
    public final String tc;

    public void SettingLocalizedString(String p0,String p1,String p2){
       super();
       this.sc = p0;
       this.en = p1;
       this.tc = p2;
    }
    public static SettingLocalizedString copy$default(SettingLocalizedString p0,String p1,String p2,String p3,int p4,Object p5){
       SettingLocalizedString sc;
       SettingLocalizedString en;
       SettingLocalizedString tc;
       if (p4 & 0x01) {
          sc = p0.sc;
       }
       if (p4 & 0x02) {
          en = p0.en;
       }
       if (p4 & 0x04) {
          tc = p0.tc;
       }
       return p0.copy(sc, en, tc);
    }
    public final String component1(){
       return this.sc;
    }
    public final String component2(){
       return this.en;
    }
    public final String component3(){
       return this.tc;
    }
    public final SettingLocalizedString copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, SettingLocalizedString.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SettingLocalizedString(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingLocalizedString.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SettingLocalizedString && (a.g(this.sc, p0.sc) && (a.g(this.en, p0.en) && a.g(this.tc, p0.tc))))) {
          return true;
       }
       return false;
    }
    public final String getEn(){
       return this.en;
    }
    public final String getSc(){
       return this.sc;
    }
    public final String getString(){
       String obj = PatchProxy.apply(null, this, SettingLocalizedString.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.d();
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                obj = TextUtils.k(this.sc);
                a.o(obj, "TextUtils.emptyIfNull\(sc\)");
             }else {
                obj = TextUtils.k(this.en);
                a.o(obj, "TextUtils.emptyIfNull\(en\)");
             }
          }else {
             obj = TextUtils.k(this.tc);
             a.o(obj, "TextUtils.emptyIfNull\(tc\)");
          }
       }else {
          obj = TextUtils.k(this.sc);
          a.o(obj, "TextUtils.emptyIfNull\(sc\)");
       }
       return obj;
    }
    public final String getTc(){
       return this.tc;
    }
    public int hashCode(){
       SettingLocalizedString obj = PatchProxy.apply(null, this, SettingLocalizedString.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sc;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SettingLocalizedString ten = this.en;
       int i2 = (ten != null)? ten.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ten = this.tc;
       if (ten != null) {
          i = ten.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SettingLocalizedString.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SettingLocalizedString\(sc="+this.sc+", en="+this.en+", tc="+this.tc+"\)";
    }
}
