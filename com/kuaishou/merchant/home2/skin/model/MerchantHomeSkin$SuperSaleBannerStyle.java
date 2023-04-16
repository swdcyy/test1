package com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$SuperSaleBannerStyle;
import java.io.Serializable;
import java.lang.Object;
import androidx.collection.ArrayMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$HotWord;
import java.lang.Integer;

public class MerchantHomeSkin$SuperSaleBannerStyle implements Serializable	// class@001835
{
    public String mBackgroundImgUrl;
    public Map mHotWordMap;
    public List mHotWords;
    public String mJumpUrl;
    public String mSkinRootDirPath;
    public static final long serialVersionUID = 0xaf7109018e4a8411;

    public void MerchantHomeSkin$SuperSaleBannerStyle(){
       super();
       this.mHotWordMap = new ArrayMap();
    }
    public void mapItems(){
       if (PatchProxy.applyVoid(null, this, MerchantHomeSkin$SuperSaleBannerStyle.class, "1")) {
          return;
       }
       if (this.mHotWords == null) {
          return;
       }
       this.mHotWordMap.clear();
       Iterator iterator = this.mHotWords.iterator();
       while (iterator.hasNext()) {
          MerchantHomeSkin$HotWord hotWord = iterator.next();
          this.mHotWordMap.put(Integer.valueOf(hotWord.mType), hotWord);
       }
       return;
    }
}
