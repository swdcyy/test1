package com.kwai.feature.post.api.feature.bridge.JSGetEligibleDraftDataResult$EligibleDraftData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import org.json.JSONObject;

public final class JSGetEligibleDraftDataResult$EligibleDraftData implements Serializable	// class@00131d
{
    public List mAssetDataList;
    public JSONObject mExtraData;
    public String mIdentifier;
    public List mMagicEmojiDataList;

    public void JSGetEligibleDraftDataResult$EligibleDraftData(){
       super();
    }
    public void JSGetEligibleDraftDataResult$EligibleDraftData(String p0,List p1,List p2,JSONObject p3){
       super();
       this.mIdentifier = p0;
       this.mAssetDataList = p1;
       this.mMagicEmojiDataList = p2;
       this.mExtraData = p3;
    }
}
