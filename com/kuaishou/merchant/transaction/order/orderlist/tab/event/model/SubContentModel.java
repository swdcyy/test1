package com.kuaishou.merchant.transaction.order.orderlist.tab.event.model.SubContentModel;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.order.orderlist.tab.event.model.SubContentModel$a;
import nsd.u;
import java.lang.Object;

public final class SubContentModel implements Serializable	// class@0008ca
{
    public String mClickText;
    public String mClickTextColor;
    public MerchantEventLoggerParam mLogs;
    public String mText;
    public String mTextColor;
    public String mUrl;
    public static final SubContentModel$a Companion;
    public static final long serialVersionUID;

    static {
       SubContentModel.Companion = new SubContentModel$a(null);
    }
    public void SubContentModel(){
       super();
    }
}
