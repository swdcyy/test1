package com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.q;
import java.lang.Number;
import com.kwai.feature.api.social.message.imshare.model.IMShareRecoRequest;

public class IMShareRequest implements Serializable	// class@001159
{
    public String activityId;
    public String comment;
    public String hint;
    public String mIMShareBizSource;
    public int mIMShareSource;
    public String mShareResourceType;
    public String mShareScene;
    public String mShareSubBiz;
    public boolean mShowResultToast;
    public IMShareRecoRequest recoRequest;
    public boolean sendKeepOrder;
    public final List shareObjects;
    public final List targets;
    public d title;
    public final String transaction;
    public static final long serialVersionUID = 0xbf06b5e613dcddee;

    public void IMShareRequest(String p0,List p1,List p2){
       super();
       this.mIMShareSource = 0;
       this.mIMShareBizSource = "unknown";
       this.mShareScene = "";
       this.mShowResultToast = true;
       List list = Collections.synchronizedList(new ArrayList());
       this.targets = list;
       List list1 = Collections.synchronizedList(new ArrayList());
       this.shareObjects = list1;
       this.recoRequest = null;
       this.transaction = p0;
       list.addAll(p1);
       list1.addAll(p2);
    }
    public IMShareObject getDisplayShareObject(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, IMShareRequest.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.shareObjects)) {
          return objArray;
       }
       return this.shareObjects.get(0);
    }
    public String getIMShareBizSource(){
       return this.mIMShareBizSource;
    }
    public int getIMShareSource(){
       return this.mIMShareSource;
    }
    public int getShareAction(){
       IMShareObject obj = PatchProxy.apply(null, this, IMShareRequest.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getDisplayShareObject();
       int i = (obj == null)? 0: obj.getShareAction();
       return i;
    }
    public boolean isShowResultToast(){
       return this.mShowResultToast;
    }
    public void setIMShareBizSource(String p0){
       this.mIMShareBizSource = p0;
    }
    public void setIMShareSource(int p0){
       this.mIMShareSource = p0;
    }
    public void setRecoRequest(IMShareRecoRequest p0){
       this.recoRequest = p0;
    }
    public void setShareObjects(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMShareRequest.class, "2")) {
          return;
       }
       this.shareObjects.clear();
       this.shareObjects.addAll(p0);
       return;
    }
    public void setShowResultToast(boolean p0){
       this.mShowResultToast = p0;
    }
    public void setTargets(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMShareRequest.class, "1")) {
          return;
       }
       this.targets.clear();
       this.targets.addAll(p0);
       return;
    }
}
