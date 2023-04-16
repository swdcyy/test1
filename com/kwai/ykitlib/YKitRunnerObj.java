package com.kwai.ykitlib.YKitRunnerObj;
import com.kwai.ykitlib.YKitInfo$YKitConfig;
import java.lang.Object;
import com.kwai.ykitlib.YKitInfo$YKitFrame;
import com.kwai.ykitlib.YKitInfo$YKitJsonParam;
import com.kwai.ykitlib.YKitInfo$YKitOut;
import com.kwai.ykitlib.YKitRunnerJni;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.kwai.ykitlib.YKitRunnerObj$a;

public class YKitRunnerObj	// class@00115d
{
    public YKitInfo$YKitConfig mConfig;
    public YKitInfo$YKitFrame mFrameIn;
    public String mJNIRenderInfo;
    public YKitInfo$YKitJsonParam mParam;
    public YKitRunnerObj$a mUploadStatsCallBack;
    public YKitInfo$YKitOut mYKitOut;
    public long mYKitRunnerJniPtr;
    public YKitRunnerJni mYkitRunnerJni;
    public static final String TAG = "YKitRunnerObj";

    public void YKitRunnerObj(YKitInfo$YKitConfig p0){
       super();
       this.mFrameIn = new YKitInfo$YKitFrame();
       this.mConfig = new YKitInfo$YKitConfig();
       this.mParam = new YKitInfo$YKitJsonParam();
       this.mYKitOut = new YKitInfo$YKitOut();
       this.mYKitRunnerJniPtr = 0;
       this.mJNIRenderInfo = "none";
       this.mConfig = p0;
       this.mYkitRunnerJni = new YKitRunnerJni();
    }
    public void devFun(int p0){
       YKitRunnerObj yKitRunnerOb = YKitRunnerObj.class;
       if (PatchProxy.isSupport(yKitRunnerOb) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, yKitRunnerOb, "6")) {
          return;
       }
       this.mYkitRunnerJni.devFun(this, p0);
       return;
    }
    public String getInfo(){
       Object obj = PatchProxy.apply(null, this, YKitRunnerObj.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mJNIRenderInfo+"\n";
    }
    public YKitInfo$YKitOut getOut(){
       return this.mYKitOut;
    }
    public YKitInfo$YKitJsonParam getParam(){
       return this.mParam;
    }
    public boolean init(){
       Object obj = PatchProxy.apply(null, this, YKitRunnerObj.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.mYkitRunnerJni.init(this))? true: false;
       return b;
    }
    public boolean ready(){
       Object obj = PatchProxy.apply(null, this, YKitRunnerObj.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.mYkitRunnerJni.ready(this) != b) {
          b = false;
       }
       return b;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, YKitRunnerObj.class, "4")) {
          return;
       }
       this.mYkitRunnerJni.release(this);
       return;
    }
    public boolean run(YKitInfo$YKitFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YKitRunnerObj.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.ready()) {
          return b;
       }
       this.mFrameIn = p0;
       if (!this.mYkitRunnerJni.run(this)) {
          b = true;
       }
       return b;
    }
    public void setParam(YKitInfo$YKitJsonParam p0){
       this.mParam = p0;
    }
    public void setUploadStatsCallBack(YKitRunnerObj$a p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YKitRunnerObj.class, "7")) {
          return;
       }
       this.mUploadStatsCallBack = p0;
       this.mYkitRunnerJni.setUploadStatsCallBack(this, p1);
       return;
    }
}
