package com.kwai.video.wayne.player.subtitle.SubtitleProcessor$1;
import com.kwai.video.player.IKwaiSubtitleListener;
import com.kwai.video.wayne.player.subtitle.SubtitleProcessor;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.video.wayne.player.subtitle.VodSubtitleInfo;
import com.kwai.video.wayne.player.subtitle.IVodSubtitleListener;
import java.util.List;
import java.util.Iterator;
import com.kwai.player.KwaiSubtitle$Cue;
import com.kwai.video.wayne.player.subtitle.KSVodSubtitleDetail;
import com.kwai.player.KwaiSubtitle;
import com.kwai.video.wayne.player.subtitle.KSVodSubtitle;

public class SubtitleProcessor$1 implements IKwaiSubtitleListener	// class@000db5
{
    public final SubtitleProcessor this$0;

    public void SubtitleProcessor$1(SubtitleProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onSelectedSubtitleStatusChange(int p0,int p1){
       SubtitleProcessor mSubtitleLis;
       SubtitleProcessor$1 u1 = SubtitleProcessor$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, u1, "2")) {
          return;
       }
       if (!p1) {
          mSubtitleLis = this.this$0.mSubtitleList;
          if (mSubtitleLis != null && (p0 >= 0 && p0 < mSubtitleLis.size())) {
             for (int i = 0; i < this.this$0.mSubtitleList.size(); i = i + 1) {
                VodSubtitleInfo vodSubtitleI = this.this$0.mSubtitleList.get(i);
                boolean b = (i == p0)? true: false;
                vodSubtitleI.isSelected = b;
             }
          }
       }
       mSubtitleLis = this.this$0.mVodSubtitleListener;
       if (mSubtitleLis != null) {
          mSubtitleLis.onSelectedSubtitleStatusChange(p0, p1);
       }
       return;
    }
    public void onSubtitleCues(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleProcessor$1.class, "3")) {
          return;
       }
       SubtitleProcessor mVodSubtitle = this.this$0.mVodSubtitleListener;
       if (mVodSubtitle != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             KwaiSubtitle$Cue uCue = iterator.next();
             KSVodSubtitleDetail kSVodSubtitl = new KSVodSubtitleDetail();
             kSVodSubtitl.startTime = uCue.startTime;
             kSVodSubtitl.text = uCue.text;
             uArrayList.add(kSVodSubtitl);
          }
          mVodSubtitle.onSubtitleCues(uArrayList);
       }
       return;
    }
    public void onSubtitleUpdate(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleProcessor$1.class, "1")) {
          return;
       }
       if (this.this$0.mVodSubtitleListener != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             KwaiSubtitle kwaiSubtitle = iterator.next();
             KSVodSubtitle kSVodSubtitl = new KSVodSubtitle();
             kSVodSubtitl.index = kwaiSubtitle.index;
             kSVodSubtitl.url = kwaiSubtitle.url;
             uArrayList.add(kSVodSubtitl);
          }
          this.this$0.mVodSubtitleListener.onSubtitleUpdate(uArrayList);
       }
       return;
    }
}
