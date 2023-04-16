package com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ToolbarStyle;
import java.io.Serializable;
import java.lang.Object;
import androidx.collection.ArrayMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ToolbarItemStyle;
import java.lang.Integer;

public class MerchantHomeSkin$ToolbarStyle implements Serializable	// class@00183a
{
    public String mBackgroundImgPath;
    public MerchantHomeSkin$BubbleStyle mBubbleStyle;
    public List mItems;
    public String mPageControlColor;
    public int mPattern;
    public String mSkinRootDirPath;
    public String mToolFontColor;
    public Map typeStyleMap;
    public static final long serialVersionUID = 0xbeae06ba240068f9;

    public void MerchantHomeSkin$ToolbarStyle(){
       super();
       this.typeStyleMap = new ArrayMap();
    }
    public void mapItems(){
       if (PatchProxy.applyVoid(null, this, MerchantHomeSkin$ToolbarStyle.class, "1")) {
          return;
       }
       if (this.mItems == null) {
          return;
       }
       this.typeStyleMap.clear();
       Iterator iterator = this.mItems.iterator();
       while (iterator.hasNext()) {
          MerchantHomeSkin$ToolbarItemStyle toolbarItemS = iterator.next();
          this.typeStyleMap.put(Integer.valueOf(toolbarItemS.mType), toolbarItemS);
       }
       return;
    }
}
