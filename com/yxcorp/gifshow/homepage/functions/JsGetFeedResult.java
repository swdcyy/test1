package com.yxcorp.gifshow.homepage.functions.JsGetFeedResult;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.functions.JsGetFeedResult$FeedExtraData;

public class JsGetFeedResult implements Serializable	// class@0016ce
{
    public JsGetFeedResult$FeedExtraData mFeedExtraData;
    public String mMsg;
    public QPhoto mPhoto;
    public int mResult;
    public static final long serialVersionUID = 0x5b2ff9b964474ff6;

    public void JsGetFeedResult(){
       super();
    }
    public static JsGetFeedResult successResult(QPhoto p0){
       JsGetFeedResult obj = PatchProxy.applyOneRefs(p0, null, JsGetFeedResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsGetFeedResult();
       obj.mResult = 1;
       obj.mPhoto = p0;
       JsGetFeedResult$FeedExtraData uFeedExtraDa = new JsGetFeedResult$FeedExtraData();
       uFeedExtraDa.mListLoadSequenceID = String.valueOf(p0.getListLoadSequenceID());
       uFeedExtraDa.mPhotoId = p0.getPhotoId();
       uFeedExtraDa.mUserId = p0.getUserId();
       obj.mFeedExtraData = uFeedExtraDa;
       return obj;
    }
}
