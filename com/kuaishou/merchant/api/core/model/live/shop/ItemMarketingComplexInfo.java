package com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingComplexInfo;
import java.io.Serializable;
import vr3.a;
import java.util.ArrayList;

public final class ItemMarketingComplexInfo extends a implements Serializable	// class@00153a
{
    public ArrayList subs;

    public void ItemMarketingComplexInfo(){
       super();
    }
    public final ArrayList getSubs(){
       return this.subs;
    }
    public final void setSubs(ArrayList p0){
       this.subs = p0;
    }
}
