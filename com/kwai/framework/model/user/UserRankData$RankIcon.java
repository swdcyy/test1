package com.kwai.framework.model.user.UserRankData$RankIcon;
import java.io.Serializable;
import java.lang.Object;

public class UserRankData$RankIcon implements Serializable	// class@00176c
{
    public float mHeight;
    public String mUrlDark;
    public String mUrlLight;
    public float mWidth;
    public static final long serialVersionUID = 0xe1b0d07a12239191;

    public void UserRankData$RankIcon(){
       super();
    }
    public float getIconRadio(){
       UserRankData$RankIcon tmHeight = this.mHeight;
       if (tmHeight) {
          UserRankData$RankIcon tmWidth = this.mWidth;
          if (tmWidth) {
             return (tmWidth / tmHeight);
          }
       }
       return 0;
    }
}
