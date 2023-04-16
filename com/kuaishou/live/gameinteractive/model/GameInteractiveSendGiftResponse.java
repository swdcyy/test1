package com.kuaishou.live.gameinteractive.model.GameInteractiveSendGiftResponse;
import java.io.Serializable;
import java.lang.Object;

public class GameInteractiveSendGiftResponse implements Serializable	// class@001bed
{
    public String orderMsg;
    public int orderStatus;
    public static final long serialVersionUID = 0x88f0f236ea192348;

    public void GameInteractiveSendGiftResponse(){
       super();
    }
    public boolean isLackOfKCoin(){
       boolean b = (this.orderStatus == 2)? true: false;
       return b;
    }
    public boolean isSuccess(){
       boolean b = true;
       if (this.orderStatus == b) {
       }else {
          b = false;
       }
       return b;
    }
}
