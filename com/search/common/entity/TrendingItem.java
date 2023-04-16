package com.search.common.entity.TrendingItem;
import mkd.a;
import iy5.c;
import com.search.common.entity.SearchBaseItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import android.graphics.Color;

public class TrendingItem extends SearchBaseItem implements a, c	// class@000b87
{
    public String mFromSessionId;
    public int mIconColor;
    public String mIconColorStr;
    public String mIconText;
    public boolean mIsResultBarDefaultKeyword;
    public boolean mIsShowByKeyBoard;
    public boolean mIsShowed;
    public String mLinkUrl;
    public int mPosition;
    public String mQuery;
    public int mRankNumber;
    public String mRealQuery;
    public Map mSignalParams;
    public static final long serialVersionUID = 0x1e4355bda7c1f4b0;

    public void TrendingItem(){
       super();
    }
    public void afterDeserialize(){
       try{
          if (!TextUtils.x(this.mIconColorStr)) {
             this.mIconColor = Color.parseColor(this.mIconColorStr);
          }
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public int getPosition(){
       return this.mPosition;
    }
    public String getQuery(){
       if (!TextUtils.x(this.mRealQuery)) {
          return this.mRealQuery;
       }
       return this.mQuery;
    }
    public boolean isShowed(){
       return this.mIsShowed;
    }
    public void setPosition(int p0){
       this.mPosition = p0;
    }
    public void setShowed(boolean p0){
       this.mIsShowed = p0;
    }
}
