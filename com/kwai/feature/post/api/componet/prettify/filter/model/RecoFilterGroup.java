package com.kwai.feature.post.api.componet.prettify.filter.model.RecoFilterGroup;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;

public class RecoFilterGroup extends FilterConfig	// class@0012f1
{
    public static final long serialVersionUID = 0xda27269c2f157e59;

    public void RecoFilterGroup(){
       super();
    }
    public static RecoFilterGroup getRecoGroup(){
       RecoFilterGroup obj = PatchProxy.apply(null, null, RecoFilterGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RecoFilterGroup();
       obj.mFilterId = -12;
       obj.setIsReco(true);
       ItemNameStyle itemNameStyl = new ItemNameStyle();
       obj.mItemNameStyle = itemNameStyl;
       itemNameStyl.mTextColor = "#FFFFFF";
       itemNameStyl.mBackgroundColor = "#1A000000";
       itemNameStyl.a = false;
       return obj;
    }
    public static ItemNameStyle getRecoItemNameStyle(){
       ItemNameStyle obj = PatchProxy.apply(null, null, RecoFilterGroup.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ItemNameStyle();
       obj.mTextColor = "#FFFFFF";
       obj.mBackgroundColor = "#F73B68";
       obj.a = false;
       return obj;
    }
}
