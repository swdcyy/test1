package com.kwai.video.wayne.player.main.RepresentationProcessor$mOnRepresentationListener$1;
import com.kwai.video.player.IKwaiRepresentationListener;
import com.kwai.video.wayne.player.main.RepresentationProcessor;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import java.util.Iterator;
import java.util.Set;
import com.kwai.video.wayne.player.listeners.OnQualityChangeListener;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.wayne.player.main.WaynePlayer;
import com.kwai.video.wayne.player.main.AbsKpMidProcessor;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.wayne.player.datasource.IDatasource;
import kotlin.jvm.internal.a;
import com.kwai.player.KwaiRepresentation;
import java.util.Collection;

public final class RepresentationProcessor$mOnRepresentationListener$1 implements IKwaiRepresentationListener	// class@000d90
{
    public final RepresentationProcessor this$0;

    public void RepresentationProcessor$mOnRepresentationListener$1(RepresentationProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onRepresentationSelected(int p0,boolean p1){
       RepresentationProcessor$mOnRepresentationListener$1 omOnRepresen = RepresentationProcessor$mOnRepresentationListener$1.class;
       if (PatchProxy.isSupport(omOnRepresen) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, omOnRepresen, "2")) {
          return;
       }
       omOnRepresen = this.this$0;
       omOnRepresen.mRealRepresentationId = p0;
       DebugLog.i(omOnRepresen.getLogTag(), "onRepresentationSelected "+this.this$0.mRealRepresentationId+" + isAuto: "+p1);
       Iterator iterator = this.this$0.mOnQualityChangeListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onRealQualityIdSelect(p0, p1);
       }
       return;
    }
    public int onSelectRepresentation(List p0){
       Iterator iterator;
       IDatasource obj = PatchProxy.applyOneRefs(p0, this, RepresentationProcessor$mOnRepresentationListener$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.getMediaPlayer().getBuildData().getDataSourceModule();
       a.o(obj, "mediaPlayer.getBuildData\(\).dataSourceModule");
       if (obj.getWayneDataSourceType() == 8) {
          this.this$0.resolutionIsReadyForHlsMaster(p0);
       }
       int i = -1;
       if (!this.this$0.isAttach()) {
          DebugLog.i(this.this$0.getLogTag(), "onSelectRepresentation unAttach return");
          return i;
       }else {
          DebugLog.i(this.this$0.getLogTag(), "onSelectRepresentation currentrepId: "+this.this$0.mUserRepresentationId);
          if (p0 != null) {
             this.this$0.mReps = p0;
             iterator = p0.iterator();
             while (iterator.hasNext()) {
                KwaiRepresentation kwaiRepresen = iterator.next();
                DebugLog.i(this.this$0.getLogTag(), "id "+kwaiRepresen.id+" qualitytype "+kwaiRepresen.qualityType+" hdrtype: "+kwaiRepresen.hdrType+" + isHdr + "+kwaiRepresen.isHdr());
             }
          }
          RepresentationProcessor$mOnRepresentationListener$1 tthis$0 = this.this$0;
          boolean b = true;
          tthis$0.mIsSupportChangeRepAtRuntime = b;
          RepresentationProcessor mUserReprese = tthis$0.mUserRepresentationId;
          if (mUserReprese != i) {
             return mUserReprese;
          }else if(p0 == null || p0.isEmpty()){
             b = false;
          }
          if (!b) {
             iterator = p0.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   int aUTO_ID = KwaiRepresentation.AUTO_ID;
                   if (iterator.next().id == aUTO_ID) {
                      RepresentationProcessor$mOnRepresentationListener$1 tthis$01 = this.this$0;
                      tthis$01.mUserRepresentationId = aUTO_ID;
                      DebugLog.i(tthis$01.getLogTag(), "onSelectRepresentation repid auto");
                      return this.this$0.mUserRepresentationId;
                   }
                }
             }
          }
          tthis$0 = this.this$0;
          if (tthis$0.mUserRepresentationId == i) {
             tthis$0.mUserRepresentationId = tthis$0.getMediaPlayer().getBuildData().getInitRepresentationId(p0);
          }
          DebugLog.i(this.this$0.getLogTag(), "onSelectRepresentation currentrepId null and then : "+this.this$0.mUserRepresentationId);
          return this.this$0.mUserRepresentationId;
       }
    }
    public void representationChangeEnd(int p0,boolean p1){
       RepresentationProcessor$mOnRepresentationListener$1 omOnRepresen = RepresentationProcessor$mOnRepresentationListener$1.class;
       if (PatchProxy.isSupport(omOnRepresen) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, omOnRepresen, "3")) {
          return;
       }
       this.this$0.dispatchRepresentationSwitchEnd(p0, p1);
       return;
    }
    public void representationChangeStart(int p0,int p1){
    }
}
