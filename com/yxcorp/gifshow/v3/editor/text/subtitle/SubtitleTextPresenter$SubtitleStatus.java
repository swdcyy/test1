package com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter$SubtitleStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SubtitleTextPresenter$SubtitleStatus extends Enum	// class@00148a
{
    public static final SubtitleTextPresenter$SubtitleStatus[] $VALUES;
    public static final SubtitleTextPresenter$SubtitleStatus SUBTITLE_EXCLUDE;
    public static final SubtitleTextPresenter$SubtitleStatus SUBTITLE_INCLUDE;
    public static final SubtitleTextPresenter$SubtitleStatus SUBTITLE_NONE;

    static {
       SubtitleTextPresenter$SubtitleStatus subtitleStat = new SubtitleTextPresenter$SubtitleStatus("SUBTITLE_NONE", 0);
       SubtitleTextPresenter$SubtitleStatus.SUBTITLE_NONE = subtitleStat;
       SubtitleTextPresenter$SubtitleStatus subtitleStat1 = new SubtitleTextPresenter$SubtitleStatus("SUBTITLE_INCLUDE", 1);
       SubtitleTextPresenter$SubtitleStatus.SUBTITLE_INCLUDE = subtitleStat1;
       SubtitleTextPresenter$SubtitleStatus subtitleStat2 = new SubtitleTextPresenter$SubtitleStatus("SUBTITLE_EXCLUDE", 2);
       SubtitleTextPresenter$SubtitleStatus.SUBTITLE_EXCLUDE = subtitleStat2;
       SubtitleTextPresenter$SubtitleStatus[] subtitleStat3 = new SubtitleTextPresenter$SubtitleStatus[]{subtitleStat,subtitleStat1,subtitleStat2};
       SubtitleTextPresenter$SubtitleStatus.$VALUES = subtitleStat3;
    }
    public void SubtitleTextPresenter$SubtitleStatus(String p0,int p1){
       super(p0, p1);
    }
    public static SubtitleTextPresenter$SubtitleStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubtitleTextPresenter$SubtitleStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SubtitleTextPresenter$SubtitleStatus.class, p0);
    }
    public static SubtitleTextPresenter$SubtitleStatus[] values(){
       Object obj = PatchProxy.apply(null, null, SubtitleTextPresenter$SubtitleStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SubtitleTextPresenter$SubtitleStatus.$VALUES.clone();
    }
}
