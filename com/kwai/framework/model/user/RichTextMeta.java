package com.kwai.framework.model.user.RichTextMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.yxcorp.utility.TextUtils;

public class RichTextMeta implements Serializable	// class@001728
{
    public String mCutRawShowText;
    public String mCutRawText;
    public Map mEventTrackInfo;
    public String mInteractActionUrl;
    public RichTextMeta mInteractRecoTextInfo;
    public String mPageType;
    public List mParamList;
    public String mRawText;
    public String mRealShowName;
    public String mScene;
    public List mShowUsers;
    public String mTitle;
    public SpannableStringBuilder mTotalRawSpanText;
    public String mTotalRawText;
    public int mUserCount;
    public static final long serialVersionUID = 0xaf59a56bfbadd630;

    public void RichTextMeta(){
       super();
    }
    public String getRelationId(){
       RichTextMeta obj = PatchProxy.apply(null, this, RichTextMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mEventTrackInfo;
       if (obj != null) {
          return TextUtils.I(obj.get("relation_text_id"));
       }
       return "";
    }
}
