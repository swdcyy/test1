package com.kuaishou.merchant.live.basic.model.ShopPunishException;
import java.lang.Exception;
import com.kuaishou.merchant.live.basic.model.punish.PunishInfo;
import java.lang.String;

public class ShopPunishException extends Exception	// class@00189c
{
    public PunishInfo mPunishInfo;

    public void ShopPunishException(PunishInfo p0){
       super();
       this.mPunishInfo = p0;
    }
    public String getMessage(){
       return this.mPunishInfo.mDescription;
    }
}
