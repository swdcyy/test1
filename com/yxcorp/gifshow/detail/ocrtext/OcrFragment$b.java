package com.yxcorp.gifshow.detail.ocrtext.OcrFragment$b;
import im8.g;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.ocrtext.d;
import java.util.HashMap;

public final class OcrFragment$b implements g	// class@0015fd
{
    public QPhoto b;
    public ObservableMap c;

    public void OcrFragment$b(){
       super();
       this.c = new ObservableMap(new LinkedHashMap());
    }
    public final ObservableMap a(){
       return this.c;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OcrFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, OcrFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(OcrFragment$b.class, new d());
       }else {
          obj.put(OcrFragment$b.class, null);
       }
       return obj;
    }
}
