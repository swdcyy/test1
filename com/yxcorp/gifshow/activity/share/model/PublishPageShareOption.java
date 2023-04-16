package com.yxcorp.gifshow.activity.share.model.PublishPageShareOption;
import java.lang.Enum;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.kuaishou.edit.draft.Publish$ShareType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PublishPageShareOption extends Enum	// class@001393
{
    public String mClickAction;
    public int mDescribeResId;
    public Publish$ShareType mDraftType;
    public int mIconResId;
    public String mKSwitch;
    public KwaiOp mKwaiOp;
    public int mPhotoMetaType;
    public int mTitleResId;
    public static final PublishPageShareOption[] $VALUES;
    public static final PublishPageShareOption MOMENT;
    public static final PublishPageShareOption NONE;
    public static final PublishPageShareOption QQ_FRIEND;
    public static final PublishPageShareOption QQ_ZONE;
    public static final PublishPageShareOption WECHAT_SESSION;
    public static final PublishPageShareOption WECHAT_TIMELINE;
    public static final PublishPageShareOption WEIBO;

    static {
       PublishPageShareOption publishPageS = new PublishPageShareOption("NONE", 0, KwaiOp.NONE, "", Publish$ShareType.NONE, 0x7f103ded, 0, 0, null, 0);
       PublishPageShareOption.NONE = v11;
       PublishPageShareOption publishPageS1 = new PublishPageShareOption("WECHAT_SESSION", 1, KwaiOp.FORWARD_WECHAT_FRIEND, "wechatSession", Publish$ShareType.WECHAT_SESSION, 0x7f104736, 0x7f104735, 0x7f081fb3, "wechat", 1);
       PublishPageShareOption.WECHAT_SESSION = publishPageS;
       PublishPageShareOption publishPageS2 = new PublishPageShareOption("WECHAT_TIMELINE", 2, KwaiOp.FORWARD_WECHAT_MOMENT, "wechatTimeline", Publish$ShareType.WECHAT_TIMELINE, 0x7f104738, 0x7f104737, 0x7f081fac, "moments", 2);
       PublishPageShareOption.WECHAT_TIMELINE = v1;
       publishPageS1 = new PublishPageShareOption("QQ_FRIEND", 3, KwaiOp.FORWARD_QQ, "qqFriend", Publish$ShareType.QQ_FRIEND, 0x7f104730, 0x7f10472f, 0x7f081fb0, "qq", 5);
       PublishPageShareOption.QQ_FRIEND = v2;
       KwaiOp fORWARD_QZON = KwaiOp.FORWARD_QZONE;
       publishPageS2 = new PublishPageShareOption("QQ_ZONE", 4, fORWARD_QZON, "qqZone", Publish$ShareType.QQ_ZONE, 0x7f104732, 0x7f104731, 0x7f081fb1, "qzone", 3);
       PublishPageShareOption.QQ_ZONE = v3;
       publishPageS1 = new PublishPageShareOption("WEIBO", 5, fORWARD_QZON, "weibo", Publish$ShareType.WEIBO, 0x7f104734, 0x7f104733, 0x7f081fb2, "blog", 4);
       PublishPageShareOption.WEIBO = v4;
       publishPageS2 = new PublishPageShareOption("MOMENT", 6, KwaiOp.MOMENT, "moment", Publish$ShareType.MOMENT, 0x7f10472e, 0x7f10472d, 0x7f081faf, "moment", 6);
       PublishPageShareOption.MOMENT = v5;
       PublishPageShareOption[] publishPageS3 = new PublishPageShareOption[]{v11,publishPageS,v1,v2,v3,v4,v5};
       PublishPageShareOption.$VALUES = publishPageS3;
    }
    public void PublishPageShareOption(String p0,int p1,KwaiOp p2,String p3,Publish$ShareType p4,int p5,int p6,int p7,String p8,int p9){
       super(p0, p1);
       this.mKwaiOp = p2;
       this.mKSwitch = p3;
       this.mDraftType = p4;
       this.mTitleResId = p5;
       this.mDescribeResId = p6;
       this.mIconResId = p7;
       this.mClickAction = p8;
       this.mPhotoMetaType = p9;
    }
    public static PublishPageShareOption valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PublishPageShareOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PublishPageShareOption.class, p0);
    }
    public static PublishPageShareOption[] values(){
       Object obj = PatchProxy.apply(null, null, PublishPageShareOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PublishPageShareOption.$VALUES.clone();
    }
    public String getClickAction(){
       return this.mClickAction;
    }
    public int getDescribeResId(){
       return this.mDescribeResId;
    }
    public Publish$ShareType getDraftType(){
       return this.mDraftType;
    }
    public int getIconResId(){
       return this.mIconResId;
    }
    public String getKSwitch(){
       return this.mKSwitch;
    }
    public KwaiOp getKwaiOp(){
       return this.mKwaiOp;
    }
    public int getPhotoMetaType(){
       return this.mPhotoMetaType;
    }
    public int getTitleResId(){
       return this.mTitleResId;
    }
}
