package l69.t;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.aicut.api.MusicAnalysisResult;
import com.kuaishou.android.model.music.Music$MusicAnalysisResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.aicut.api.MusicBeats;
import com.kuaishou.android.model.music.Music$MusicBeats;
import java.util.Collection;
import java.util.Objects;
import java.lang.Long;

public final class t	// class@002cab
{
    public static final t a;

    static {
       t.a = new t();
    }
    public void t(){
       super();
    }
    public final AICutMusicInfo a(Music p0){
       AICutMusicInfo obj = PatchProxy.applyOneRefs(p0, this, t.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "music");
       obj = new AICutMusicInfo();
       Music mId = p0.mId;
       if (mId == null) {
          mId = "";
       }
       obj.setMId(mId);
       mId = p0.mType;
       a.o(mId, "music.mType");
       obj.setMType(mId.getValue());
       obj.setMUrls(p0.mUrls);
       obj.setMName(p0.mName);
       obj.setMChorus(p0.mChorus);
       obj.setMAvatarUrl(p0.mAvatarUrl);
       obj.setMDuration(p0.mDuration);
       obj.setMLocalFilePath(p0.mPath);
       obj.setMMmuLrcUrls(p0.mMmuLrcUrls);
       mId = p0.mAnalysisResult;
       ArrayList uArrayList = null;
       if (mId != null) {
          MusicAnalysisResult musicAnalysi = new MusicAnalysisResult();
          Music$MusicAnalysisResult mMusicBeats = mId.mMusicBeats;
          if (mMusicBeats != null) {
             uArrayList = new ArrayList(mMusicBeats.length);
             int len = mMusicBeats.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = mMusicBeats[i];
                MusicBeats musicBeats = new MusicBeats();
                musicBeats.setBeatsUrls(oobject.mBeatsUrls);
                musicBeats.setAlgorithm(oobject.mAlgorithm);
                uArrayList.add(musicBeats);
             }
             MusicBeats[] musicBeatsAr = new MusicBeats[0];
             Object[] objArray = uArrayList.toArray(musicBeatsAr);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
             uArrayList = objArray;
          }
          musicAnalysi.setBeats(uArrayList);
          uArrayList = musicAnalysi;
       }
       obj.setMAnalysisResult(uArrayList);
       obj.setMMusicBeatsString(p0.mMusicBeatsString);
       obj.setMOriginData(p0);
       return obj;
    }
    public final Music b(AICutMusicInfo p0){
       Music obj = PatchProxy.applyOneRefs(p0, this, t.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       if (p0.getMOriginData() != null) {
          p0 = p0.getMOriginData();
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.android.model.music.Music");
          return p0;
       }else {
          obj = new Music();
          obj.mName = p0.getMName();
          obj.mId = p0.getMId();
          obj.mUrls = p0.getMUrls();
          obj.mAvatarUrl = p0.getMAvatarUrl();
          obj.mDuration = p0.getMDuration();
          obj.mChorus = p0.getMChorus();
          obj.mType = MusicType.valueOf(p0.getMType());
          obj.mPath = p0.getMLocalFilePath();
          obj.mMmuLrcUrls = p0.getMMmuLrcUrls();
          MusicAnalysisResult mAnalysisRes = p0.getMAnalysisResult();
          ArrayList uArrayList = null;
          if (mAnalysisRes != null) {
             Music$MusicAnalysisResult musicAnalysi = new Music$MusicAnalysisResult();
             MusicBeats[] beats = mAnalysisRes.getBeats();
             if (beats != null) {
                uArrayList = new ArrayList(beats.length);
                int len = beats.length;
                for (int i = 0; i < len; i = i + 1) {
                   object oobject = beats[i];
                   Music$MusicBeats musicBeats = new Music$MusicBeats();
                   musicBeats.mBeatsUrls = oobject.getBeatsUrls();
                   musicBeats.mAlgorithm = oobject.getAlgorithm();
                   uArrayList.add(musicBeats);
                }
                Music$MusicBeats[] musicBeatsAr = new Music$MusicBeats[0];
                Object[] objArray = uArrayList.toArray(musicBeatsAr);
                Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                uArrayList = objArray;
             }
             musicAnalysi.mMusicBeats = uArrayList;
             uArrayList = musicAnalysi;
          }
          obj.mAnalysisResult = uArrayList;
          Long mBegin = p0.getMBegin();
          long l = (mBegin != null)? mBegin.longValue(): (long)p0.getMChorus();
          obj.mUsedStart = l;
          mBegin = p0.getMEnd();
          long l1 = 0;
          long l2 = (mBegin != null)? mBegin.longValue(): l1;
          mBegin = p0.getMBegin();
          if (mBegin != null) {
             l1 = mBegin.longValue();
          }
          obj.mUsedDuration = l2 - l1;
          p0.setMOriginData(obj);
          return obj;
       }
    }
}
