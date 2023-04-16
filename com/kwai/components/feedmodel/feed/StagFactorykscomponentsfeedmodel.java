package com.kwai.components.feedmodel.feed.StagFactorykscomponentsfeedmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo$TypeAdapter;

public final class StagFactorykscomponentsfeedmodel implements j	// class@000c57
{

    public void StagFactorykscomponentsfeedmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfeedmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == KaraokeScoreInfo$KtvScoreRankInfo.class) {
          return new KaraokeScoreInfo$KtvScoreRankInfo$TypeAdapter(p0);
       }
       if (rawType == KaraokeScoreInfo.class) {
          return new KaraokeScoreInfo$TypeAdapter(p0);
       }
       return null;
    }
}
