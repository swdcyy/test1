package com.kwai.feature.api.corona.model.CoronaMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.feed.VideoFeed;
import fa6.e;
import fa6.b;

public class CoronaMeta implements Serializable	// class@000dfb
{
    public boolean isEnterFloatWindowFromLandscape;
    public boolean isHistoryPhoto;
    public boolean isLater;
    public boolean isSelected;
    public Boolean isSpecialPhoto;
    public boolean isTitleChanged;
    public boolean isWatchComplete;
    public CoronaActivityStrip mCoronaActivityStrip;
    public List mCoronaTags;
    public CoronaTube mCoronaTube;
    public CoronaTvFilm mCoronaTvFilm;
    public CoronaTvSerial mCoronaTvSerial;
    public HorizontalHolidayEggsInfo mHorizontalHolidayEggs;
    public CoronaMeta$VideoWatchedRecord mLandscapeWatchedRecord;
    public QPhoto mLatestPhoto;
    public String mStartPlaySource;
    public CoronaMeta$TalkTag mTalkTag;
    public static final String PART_FIELD = "coronaMeta";
    public static final long serialVersionUID = 0x2c5c98a5074aee74;

    public void CoronaMeta(){
       super();
       this.mLatestPhoto = null;
       this.isHistoryPhoto = false;
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, CoronaMeta.class, "1")) {
          return;
       }
       e uoe = new e(CoronaMeta.class, "", "coronaMeta");
       uoe.a(null);
       c.a.e(VideoFeed.class, uoe);
       return;
    }
}
