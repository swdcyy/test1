package az6.a;
import im8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yy6.b;
import java.lang.Throwable;
import android.util.Log;
import q87.c;
import com.kwai.framework.model.feed.BaseFeed;
import az6.f;
import java.util.Map;
import java.util.HashMap;

public abstract class a implements g	// class@0003ac
{
    public int mFeedPosition;
    public String mFromNebulaThanosHotLiveLiveStreamId;
    public boolean mIsFromNebulaThanosHotLive;
    public int mPhotoIndex;
    public int mPhotoIndexByLog;
    public String mSlidePlayId;
    public int mSource;
    public int mSourceOfContainer;

    public void a(){
       super();
       this.mSource = 0;
       this.mSourceOfContainer = 0;
    }
    public a clone(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          Object[] objArray = new Object[0];
          b.C().t("SlidePlayParam", Log.getStackTraceString(e0), objArray);
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public a cloneWithoutUnnecessaryFields(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.clone();
    }
    public abstract boolean enablePullToRefresh();
    public BaseFeed getBaseFeed(){
       return null;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new f());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void setBaseFeed(BaseFeed p0){
    }
    public a setFromNebulaThanosHotLiveLiveStreamId(String p0){
       this.mFromNebulaThanosHotLiveLiveStreamId = p0;
       return this;
    }
    public a setIsFromNebulaThanosHotLive(boolean p0){
       this.mIsFromNebulaThanosHotLive = p0;
       return this;
    }
    public a setSlidePlayId(String p0){
       this.mSlidePlayId = p0;
       return this;
    }
}
