package com.kuaishou.merchant.live.pendant.model.DiscountPriceList;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public final class DiscountPriceList implements Serializable	// class@001abd
{
    public List itemList;

    public void DiscountPriceList(){
       super();
    }
    public final List getItemList(){
       return this.itemList;
    }
    public final void setItemList(List p0){
       this.itemList = p0;
    }
}
