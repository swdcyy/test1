package com.kuaishou.common.encryption.model.AppendRedPackParam;
import com.kuaishou.common.encryption.model.AbstractRedPackPurchaseParam;
import com.kuaishou.common.encryption.model.AppendRedPackParam$a;
import java.lang.String;

public class AppendRedPackParam extends AbstractRedPackPurchaseParam	// class@0016ae
{
    public String redPackId;
    public int redPackType;

    public void AppendRedPackParam(){
       super();
    }
    public static AppendRedPackParam$a newBuilder(){
       return new AppendRedPackParam$a();
    }
    public String getRedPackId(){
       return this.redPackId;
    }
    public int getRedPackType(){
       return this.redPackType;
    }
    public void setRedPackId(String p0){
       this.redPackId = p0;
    }
    public void setRedPackType(int p0){
       this.redPackType = p0;
    }
}
