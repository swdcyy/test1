package com.kwai.slide.play.detail.information.caption.CaptionDialogFragment$b;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.caption.e;
import java.util.Map;
import java.util.HashMap;

public final class CaptionDialogFragment$b implements g	// class@0017c0
{
    public CaptionDialogFragment b;
    public CharSequence c;
    public CharSequence d;

    public void CaptionDialogFragment$b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CaptionDialogFragment$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, CaptionDialogFragment$b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(CaptionDialogFragment$b.class, new e());
       }else {
          obj.put(CaptionDialogFragment$b.class, null);
       }
       return obj;
    }
}
