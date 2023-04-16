package com.kwai.component.kcube.model.model.TabConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ra6.a;

public class TabConfig implements Serializable	// class@000995
{
    public TabBizParams mBizParams;
    public String mDefaultSelectSubTab;
    public String mId;
    public List mSubTabList;
    public String mTabName;
    public String mTabNameEn;
    public String mTabNameTc;
    public String mType;
    public static final long serialVersionUID = 0x8169d11b59f0023f;

    public void TabConfig(){
       super();
    }
    public String getName(boolean p0){
       if (PatchProxy.isSupport(TabConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, TabConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return this.mTabName;
       }else {
          int i = a.d();
          if (i != 2) {
             if (i != 3) {
                return this.mTabName;
             }else {
                return this.mTabNameEn;
             }
          }else {
             return this.mTabNameTc;
          }
       }
    }
}
