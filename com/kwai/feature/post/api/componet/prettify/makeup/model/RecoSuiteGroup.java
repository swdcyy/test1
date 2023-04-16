package com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import java.util.List;
import java.lang.Boolean;

public class RecoSuiteGroup extends MakeupSuite	// class@001300
{
    public List d;
    public int e;
    public static final long serialVersionUID = 0x5bd27307318357d0;

    public void RecoSuiteGroup(String p0){
       super(p0);
       this.e = -1;
    }
    public static RecoSuiteGroup getRecoGroup(){
       RecoSuiteGroup obj = PatchProxy.apply(null, null, RecoSuiteGroup.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RecoSuiteGroup("-12");
       obj.mPassThroughParams = new PassThroughParams();
       obj.setIsReco(true);
       ItemNameStyle itemNameStyl = new ItemNameStyle();
       obj.mItemNameStyle = itemNameStyl;
       itemNameStyl.mTextColor = "#FFFFFF";
       itemNameStyl.mBackgroundColor = "#1A000000";
       itemNameStyl.a = false;
       return obj;
    }
    public static ItemNameStyle getRecoItemNameStyle(){
       ItemNameStyle obj = PatchProxy.apply(null, null, RecoSuiteGroup.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ItemNameStyle();
       obj.mTextColor = "#FFFFFF";
       obj.mBackgroundColor = "#F73B68";
       obj.a = false;
       return obj;
    }
    public MakeupSuite getNextRecoSuite(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RecoSuiteGroup.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.e + 1;
       RecoSuiteGroup td = this.d;
       if (td == null || td.size() <= 0) {
          return objArray;
       }
       if (i < this.d.size()) {
          return this.d.get(i);
       }
       return this.d.get(0);
    }
    public int getRecoIndex(){
       return this.e;
    }
    public MakeupSuite getRecoSuite(){
       Object[] objArray = null;
       RecoSuiteGroup obj = PatchProxy.apply(objArray, this, RecoSuiteGroup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null && obj.size() > 0) {
          obj = this.e;
          if (obj >= null && obj < this.d.size()) {
             return this.d.get(this.e);
          }
       }
       return objArray;
    }
    public List getRecoSuites(){
       return this.d;
    }
    public boolean isEmptyRecoGroup(){
       RecoSuiteGroup obj = PatchProxy.apply(null, this, RecoSuiteGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj == null || obj.isEmpty())? true: false;
       return b;
    }
    public void setRecoIndex(int p0){
       this.e = p0;
    }
    public void setRecoList(List p0){
       this.d = p0;
    }
}
