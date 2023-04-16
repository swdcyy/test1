package com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig$flashSearchHint$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.camera.record.toolbox.ToolBoxHeaderConfig;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import org.json.JSONObject;
import qrd.p;

public final class ToolBoxHeaderConfig$flashSearchHint$2 extends Lambda implements a	// class@000f5e
{
    public final ToolBoxHeaderConfig this$0;

    public void ToolBoxHeaderConfig$flashSearchHint$2(ToolBoxHeaderConfig p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ToolBoxHeaderConfig$flashSearchHint$2 obj = PatchProxy.apply(objArray, this, ToolBoxHeaderConfig$flashSearchHint$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, ToolBoxHeaderConfig.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.a.getValue();
       }
       return obj1.optString("flashTemplateSearchWord");
    }
}
