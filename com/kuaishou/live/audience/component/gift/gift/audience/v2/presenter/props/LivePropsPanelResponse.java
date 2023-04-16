package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.LivePropsPanelResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LivePropsPanelResponse implements Serializable, b	// class@000b58
{
    public List mPropsList;
    public static final long serialVersionUID = 0x5844a3b120764d14;

    public void LivePropsPanelResponse(){
       super();
    }
    public List getItems(){
       return this.mPropsList;
    }
    public boolean hasMore(){
       return false;
    }
}
