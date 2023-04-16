package com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.magicfinger.h;
import java.util.Map;
import java.util.HashMap;

public class MagicFingerFragment$a implements g	// class@001028
{
    public MagicFingerFragment b;
    public int c;
    public String d;
    public String e;
    public BaseEditor$EditorShowMode f;
    public i g;
    public final MagicFingerFragment h;

    public void MagicFingerFragment$a(MagicFingerFragment p0){
       this.h = p0;
       super();
       this.c = 11;
       this.d = "scrawl";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicFingerFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MagicFingerFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MagicFingerFragment$a.class, new h());
       }else {
          obj.put(MagicFingerFragment$a.class, null);
       }
       return obj;
    }
}
