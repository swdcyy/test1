package com.kuaishou.merchant.live.cart.onsale.audience.model.UpdateRequestBody$TabRequest;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class UpdateRequestBody$TabRequest implements Serializable	// class@001962
{
    public List mComponentNameList;
    public String mContext;
    public String mCursor;
    public String mTabId;
    public int mTabType;
    public static final long serialVersionUID = 0x823eed226ce1c19e;

    public void UpdateRequestBody$TabRequest(){
       super();
       this.mComponentNameList = new ArrayList();
    }
}
