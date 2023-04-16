package com.yxcorp.gifshow.action.startup.UserSignalRealActionsBizConfig;
import zv8.l;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.action.startup.c;
import java.util.Map;
import com.google.protobuf.nano.MessageNano;

public class UserSignalRealActionsBizConfig implements l, Serializable	// class@00132c
{
    public boolean mDisableSourceFilter;
    public String mKey;
    public int mMaxActionNum;
    public Map mRealActionConfigMap;
    public List mSignalConfigs;
    public List mUrlPath;
    public static final long serialVersionUID = 0xc815627cebd88b52;

    public void UserSignalRealActionsBizConfig(){
       super();
    }
    public List actionFilters(){
       ArrayList obj = PatchProxy.apply(null, this, UserSignalRealActionsBizConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(c.a);
       return obj;
    }
    public Map availableActionConfig(){
       return this.mRealActionConfigMap;
    }
    public MessageNano buildRealActionPage(List p0){
       return null;
    }
    public boolean disableSourceFilter(){
       return this.mDisableSourceFilter;
    }
    public List getUrlPaths(){
       return this.mUrlPath;
    }
    public int maxActions(){
       return this.mMaxActionNum;
    }
    public void setRealActionConfigMap(Map p0){
       this.mRealActionConfigMap = p0;
    }
    public String subBiz(){
       return this.mKey;
    }
}
