package com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;

public class SearchParams implements Serializable	// class@0008ae
{
    public ServiceEntryInfo mAfterSaleIconInfo;
    public ServiceEntryInfo mCsIconInfo;
    public String mHintText;
    public String mInputText;
    public HashMap mPostParams;
    public ServiceEntryInfo mSettingIconInfo;
    public static final long serialVersionUID = 0x769c9c586a3a577c;

    public void SearchParams(){
       super();
       this.mPostParams = new HashMap();
    }
}
