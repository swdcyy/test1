package com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabBarStyle;
import java.io.Serializable;
import java.lang.Object;
import androidx.collection.ArrayMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabItemStyle;

public class MerchantHomeSkin$TabBarStyle implements Serializable	// class@001837
{
    public List mItems;
    public String mSkinRootDirPath;
    public Map typeStyleMap;
    public static final long serialVersionUID = 0xd8629d3552f4c4ab;

    public void MerchantHomeSkin$TabBarStyle(){
       super();
       this.typeStyleMap = new ArrayMap();
    }
    public void mapItems(){
       if (PatchProxy.applyVoid(null, this, MerchantHomeSkin$TabBarStyle.class, "1")) {
          return;
       }
       if (this.mItems == null) {
          return;
       }
       this.typeStyleMap.clear();
       Iterator iterator = this.mItems.iterator();
       while (iterator.hasNext()) {
          MerchantHomeSkin$TabItemStyle tabItemStyle = iterator.next();
          this.typeStyleMap.put(tabItemStyle.mTabId, tabItemStyle);
       }
       return;
    }
}
