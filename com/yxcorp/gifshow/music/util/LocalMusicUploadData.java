package com.yxcorp.gifshow.music.util.LocalMusicUploadData;
import java.io.Serializable;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Map;
import java.lang.String;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class LocalMusicUploadData implements Serializable	// class@00207e
{
    public List mWorkIdList;
    public Map mWorkMap;
    public static final long serialVersionUID = 0x9594a775e3202df9;

    public void LocalMusicUploadData(){
       super();
       this.mWorkMap = new ConcurrentHashMap();
       this.mWorkIdList = new CopyOnWriteArrayList();
    }
    public List getWorkIdList(){
       return this.mWorkIdList;
    }
    public Map getWorkMap(){
       return this.mWorkMap;
    }
    public void putMapDataSafe(String p0,LocalMusicUploadInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalMusicUploadData.class, "1")) {
          return;
       }
       try{
          this.mWorkMap.put(p0, p1);
       }catch(java.lang.Exception e3){
          PostUtils.D("LocalMusicUploadData", "putMapData ß∞‹", e3);
       }
       return;
    }
}
