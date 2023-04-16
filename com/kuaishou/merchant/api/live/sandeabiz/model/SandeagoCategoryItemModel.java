package com.kuaishou.merchant.api.live.sandeabiz.model.SandeagoCategoryItemModel;
import java.io.Serializable;
import java.lang.Object;

public class SandeagoCategoryItemModel implements Serializable	// class@001571
{
    public String mCategoryId;
    public String mCategoryName;
    public int mCategoryType;
    public int mSkuType;
    public static final long serialVersionUID = 0xe18806cab0859968;

    public void SandeagoCategoryItemModel(){
       super();
    }
    public boolean isOftenUse(){
       boolean b = true;
       if (this.mCategoryType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isSupportMultiSku(){
       boolean b = (this.mSkuType == 2)? true: false;
       return b;
    }
}
