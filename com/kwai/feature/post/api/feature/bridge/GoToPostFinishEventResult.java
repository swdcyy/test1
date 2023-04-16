package com.kwai.feature.post.api.feature.bridge.GoToPostFinishEventResult;
import java.io.Serializable;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import com.kwai.feature.post.api.feature.bridge.GoToPostFinishEventResult$FileAndType;
import com.kwai.feature.post.api.feature.bridge.GoToPostValue;
import java.lang.StringBuilder;

public class GoToPostFinishEventResult implements Serializable	// class@00131a
{
    public final String content;
    public List mCustomParamList;
    public final List mFileList;
    public final String mTaskId;
    public final String photoMeta;
    public static final String b = "type";

    public void GoToPostFinishEventResult(List p0,String p1,List p2,String p3,String p4){
       super();
       this.mFileList = p0;
       this.mTaskId = p1;
       this.mCustomParamList = p2;
       this.content = p3;
       this.photoMeta = p4;
    }
    public Map toKrn(){
       ArrayList obj = PatchProxy.apply(null, this, GoToPostFinishEventResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int i = 0;
       for (int i1 = 0; i1 < this.mFileList.size(); i1 = i1 + 1) {
          HashMap hashMap = new HashMap();
          hashMap.put("filePath", this.mFileList.get(i1).mFilePath);
          hashMap.put("type", this.mFileList.get(i1).mType);
          obj.add(hashMap);
       }
       ArrayList uArrayList = new ArrayList();
       for (; i < this.mCustomParamList.size(); i = i + 1) {
          uArrayList.add(this.mCustomParamList.get(i).toKrn());
       }
       HashMap hashMap1 = new HashMap();
       hashMap1.put("fileList", obj);
       hashMap1.put("taskId", this.mTaskId);
       hashMap1.put("customParam", uArrayList);
       hashMap1.put("content", this.content);
       hashMap1.put("photoMeta", this.photoMeta);
       return hashMap1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GoToPostFinishEventResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GoToPostFinishEventResult{mResult="+this.mFileList+'}';
    }
}
