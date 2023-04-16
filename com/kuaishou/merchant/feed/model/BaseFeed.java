package com.kuaishou.merchant.feed.model.BaseFeed;
import mkd.a;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.io.ObjectInputStream;

public abstract class BaseFeed extends SyncableProvider implements a	// class@0016b5
{
    public CardStyle mCardStyle;
    public String mExpTag;
    public String mListLoadSequenceID;
    public String mOnlineNum;
    public String mServerExpTag;
    public boolean mShowLogSent;
    public int mType;
    public static final long serialVersionUID = 0x966a6c5ec95ae4f5;

    public void BaseFeed(){
       super();
       this.mType = 1;
       this.mOnlineNum = "";
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, BaseFeed.class, "3")) {
          return;
       }
       b.b().c(this, BaseFeed.class);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof BaseFeed) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       return TextUtils.n(this.getId(), p0.getId());
    }
    public final String getBizId(){
       Object obj = PatchProxy.apply(null, this, BaseFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getId();
    }
    public abstract String getId();
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, BaseFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getId() != null) {
          return (this.getId()).hashCode();
       }
       return super.hashCode();
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFeed.class, "5")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
