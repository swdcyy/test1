package com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import java.io.Serializable;
import java.lang.String;
import com.kwai.feature.api.social.message.imshare.model.ShareIMInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;

public final class IMShareTarget implements Serializable	// class@00115b
{
    public final String extraLog;
    public final int groupType;
    public final String headUri;
    public final String id;
    public boolean isLLSidCache;
    public final boolean isOnline;
    public final String llsId;
    public boolean mHasSent;
    public final String name;
    public final String onlineStatusText;
    public final ShareIMInfo shareIMInfo;
    public final String subBizId;
    public final String transactionId;
    public final int type;
    public static final long serialVersionUID = 0xc0a0d7820d425ee3;

    public void IMShareTarget(int p0,String p1,String p2,String p3,int p4){
       super("0", p0, p1, p2, p3, p4);
    }
    public void IMShareTarget(ShareIMInfo p0,int p1,String p2,String p3,String p4,int p5){
       super(p0, "0", p1, p2, p3, p4, p5, false, null, null);
    }
    public void IMShareTarget(ShareIMInfo p0,String p1,int p2,String p3,String p4,String p5,int p6,boolean p7,String p8,String p9){
       super();
       this.isLLSidCache = true;
       this.llsId = p0.mLlsId;
       this.transactionId = p0.mTransactionId;
       this.shareIMInfo = p0;
       this.subBizId = p1;
       this.type = p2;
       this.id = p3;
       this.name = p4;
       this.headUri = p5;
       this.groupType = p6;
       this.isOnline = p7;
       this.onlineStatusText = p8;
       this.extraLog = p9;
    }
    public void IMShareTarget(String p0,int p1,String p2,String p3,String p4,int p5){
       super(ShareIMInfo.from(p1, p2, p3, p4, p5), p0, p1, p2, p3, p4, p5, false, null, null);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMShareTarget.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof IMShareTarget) {
          return TextUtils.n(p0.id, this.id);
       }
       return super.equals(p0);
    }
    public int hashCode(){
       IMShareTarget obj = PatchProxy.apply(null, this, IMShareTarget.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.id;
       if (obj == null) {
          return 0;
       }
       return obj.hashCode();
    }
}
