package com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.lang.Object;
import com.yxcorp.gifshow.trending.inject.event.OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction;
import java.lang.String;

public class OnPlayTrendingInfoChangeEvent	// class@001da7
{
    public final TrendingInfo a;
    public final OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction b;
    public final String c;

    public void OnPlayTrendingInfoChangeEvent(TrendingInfo p0){
       super();
       this.a = p0;
       this.b = OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction.CLICK;
       this.c = "";
    }
    public void OnPlayTrendingInfoChangeEvent(TrendingInfo p0,OnPlayTrendingInfoChangeEvent$TrendingInfoChangeAction p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
}
