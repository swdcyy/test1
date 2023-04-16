package com.kuaishou.android.model.feed.HotInsertFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.String;
import com.kuaishou.android.model.entity.HotInsertType;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import yp.s;
import java.util.Map;
import java.lang.Number;
import java.lang.Enum;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import java.lang.StringBuilder;

public class HotInsertFeed extends BaseFeed	// class@000aeb
{
    public CommonMeta mCommonMeta;
    public int mCrowdUserTagPage;
    public Object mDataResponse;
    public String mId;
    public Object mInteractionStrategy;
    public Object mStartUpConfig;
    public Integer mTriggerType;
    public HotInsertType mType;
    public User mUser;

    public void HotInsertFeed(){
       super();
       this.mCommonMeta = new CommonMeta();
    }
    public void HotInsertFeed(String p0,HotInsertType p1){
       super();
       this.mCommonMeta = new CommonMeta();
       this.mId = p0;
       this.mType = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotInsertFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!super.equals(p0)) {
          return false;
       }
       if (!TextUtils.equals(this.mId, p0.mId)) {
          return false;
       }
       if (this.mType != p0.mType) {
          b = false;
       }
       return b;
    }
    public String getId(){
       return this.mId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotInsertFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, HotInsertFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(HotInsertFeed.class, new s());
       }else {
          obj.put(HotInsertFeed.class, null);
       }
       return obj;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, HotInsertFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = super.hashCode() * 31;
       HotInsertFeed tmId = this.mId;
       int i1 = 0;
       int i2 = (tmId != null)? tmId.hashCode(): 0;
       i = (i + i2) * 31;
       tmId = this.mType;
       if (tmId != null) {
          i1 = tmId.hashCode();
       }
       return (i + i1);
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotInsertFeed.class, "4")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HotInsertFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HotInsertFeed <id="+this.mId+";type="+this.mType.toString()+">";
    }
}
