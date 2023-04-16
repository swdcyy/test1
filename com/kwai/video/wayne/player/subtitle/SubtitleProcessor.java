package com.kwai.video.wayne.player.subtitle.SubtitleProcessor;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import java.util.ArrayList;
import com.kwai.video.wayne.player.subtitle.SubtitleProcessor$1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.wayne.player.subtitle.VodSubtitleInfo;
import com.kwai.video.player.IKwaiSubtitleListener;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import java.util.Iterator;
import java.lang.Integer;
import com.kwai.video.wayne.player.subtitle.IVodSubtitleListener;

public class SubtitleProcessor extends AbsKpMidProcessor	// class@000db6
{
    public IKwaiSubtitleListener mKwaiSubtitleListener;
    public ArrayList mSubtitleList;
    public IVodSubtitleListener mVodSubtitleListener;

    public void SubtitleProcessor(){
       super();
       this.mSubtitleList = new ArrayList();
       this.mKwaiSubtitleListener = new SubtitleProcessor$1(this);
    }
    public int addSubtitle(String p0,boolean p1){
       VodSubtitleInfo obj;
       SubtitleProcessor subtitleProc = SubtitleProcessor.class;
       if (PatchProxy.isSupport(subtitleProc)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, subtitleProc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.getMediaPlayer().getKernelPlayer() != null) {
          obj = new VodSubtitleInfo();
          obj.url = p0;
          obj.isSelected = p1;
          this.mSubtitleList.add(obj);
          return this.getMediaPlayer().getKernelPlayer().addSubtitle(p0, p1);
       }else {
          return -1;
       }
    }
    public void onAttach(){
       if (PatchProxy.applyVoid(null, this, SubtitleProcessor.class, "1")) {
          return;
       }
       this.getMediaPlayer().setKwaiSubtitleListener(this.mKwaiSubtitleListener);
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, SubtitleProcessor.class, "2")) {
          return;
       }
       SubtitleProcessor tmSubtitleLi = this.mSubtitleList;
       if (tmSubtitleLi != null) {
          tmSubtitleLi.clear();
       }
       return;
    }
    public void onKernelPlayerCreated(){
       if (PatchProxy.applyVoid(null, this, SubtitleProcessor.class, "5")) {
          return;
       }
       SubtitleProcessor tmSubtitleLi = this.mSubtitleList;
       if (tmSubtitleLi != null) {
          Iterator iterator = tmSubtitleLi.iterator();
          while (iterator.hasNext()) {
             VodSubtitleInfo vodSubtitleI = iterator.next();
             this.getMediaPlayer().getKernelPlayer().addSubtitle(vodSubtitleI.url, vodSubtitleI.isSelected);
          }
       }
       return;
    }
    public void setSubtitleSelected(int p0,boolean p1){
       SubtitleProcessor subtitleProc = SubtitleProcessor.class;
       if (PatchProxy.isSupport(subtitleProc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, subtitleProc, "4")) {
          return;
       }
       if (this.getMediaPlayer().getKernelPlayer() != null) {
          this.getMediaPlayer().getKernelPlayer().setSutitleSelected(p0, p1);
       }
       return;
    }
    public void setVodSubtitleListener(IVodSubtitleListener p0){
       this.mVodSubtitleListener = p0;
    }
}
