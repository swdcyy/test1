package com.kuaishou.merchant.live.cart.onsale.audience.model.RealTimeUpdateResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class RealTimeUpdateResponse implements Serializable	// class@00195a
{
    public List mTabResponses;
    public static final long serialVersionUID = 0x57c291b44e870c9c;

    public void RealTimeUpdateResponse(){
       super();
       this.mTabResponses = new ArrayList();
    }
}
