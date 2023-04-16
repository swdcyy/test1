package com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import java.io.Serializable;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import nsd.u;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$c;
import java.lang.Object;

public final class MusicSearchUiOption implements Serializable	// class@0020aa
{
    public final int dividerColorId;
    public final boolean forbidSubFragmentLogPage;
    public final boolean hasHistoryTopEntrance;
    public final int historyLeftMargin;
    public final boolean isDarkMode;
    public final int mainColorId;
    public final int musicSearchSource;
    public final int sugKeywordLeftMargin;
    public final MusicSearchUiOption$c uiListener;
    public static final MusicSearchUiOption$b Companion;

    static {
       MusicSearchUiOption.Companion = new MusicSearchUiOption$b(null);
    }
    public void MusicSearchUiOption(int p0,int p1,boolean p2,boolean p3,MusicSearchUiOption$c p4,int p5,int p6,int p7,boolean p8){
       super();
       this.mainColorId = p0;
       this.dividerColorId = p1;
       this.isDarkMode = p2;
       this.hasHistoryTopEntrance = p3;
       this.uiListener = p4;
       this.musicSearchSource = p5;
       this.historyLeftMargin = p6;
       this.sugKeywordLeftMargin = p7;
       this.forbidSubFragmentLogPage = p8;
    }
    public final int getDividerColorId(){
       return this.dividerColorId;
    }
    public final boolean getForbidSubFragmentLogPage(){
       return this.forbidSubFragmentLogPage;
    }
    public final boolean getHasHistoryTopEntrance(){
       return this.hasHistoryTopEntrance;
    }
    public final int getHistoryLeftMargin(){
       return this.historyLeftMargin;
    }
    public final int getMainColorId(){
       return this.mainColorId;
    }
    public final int getMusicSearchSource(){
       return this.musicSearchSource;
    }
    public final int getSugKeywordLeftMargin(){
       return this.sugKeywordLeftMargin;
    }
    public final MusicSearchUiOption$c getUiListener(){
       return this.uiListener;
    }
    public final boolean isDarkMode(){
       return this.isDarkMode;
    }
}
