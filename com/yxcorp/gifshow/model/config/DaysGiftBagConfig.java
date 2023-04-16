package com.yxcorp.gifshow.model.config.DaysGiftBagConfig;
import java.lang.Object;
import java.util.ArrayList;

public final class DaysGiftBagConfig	// class@001ebd
{
    public int activityDays;
    public long amount;
    public String buttonText;
    public String buttonUrl;
    public int currentDay;
    public ArrayList rewardList;
    public boolean signInSuccess;
    public String title;
    public int type;

    public void DaysGiftBagConfig(){
       super();
       this.title = "";
       this.buttonText = "";
       this.buttonUrl = "";
       this.rewardList = new ArrayList();
    }
}
