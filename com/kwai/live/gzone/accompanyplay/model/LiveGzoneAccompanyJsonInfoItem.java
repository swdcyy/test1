package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyJsonInfoItem;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyJsonInfoItem$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import pp.a;
import java.lang.Throwable;
import q87.c;

public class LiveGzoneAccompanyJsonInfoItem implements Serializable	// class@000c39
{
    public String mContent;
    public String mTitle;

    public void LiveGzoneAccompanyJsonInfoItem(){
       super();
    }
    public static List fromJsonString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAccompanyJsonInfoItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return a.a.i(p0, new LiveGzoneAccompanyJsonInfoItem$a().getType());
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          a.C().u("GameAccountInfo", e4, objArray);
          return v1;
       }
    }
}
