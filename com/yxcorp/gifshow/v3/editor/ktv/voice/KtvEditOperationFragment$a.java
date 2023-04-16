package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment$a;
import im8.g;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.ktv.voice.g;
import java.util.Map;
import java.util.HashMap;

public class KtvEditOperationFragment$a implements g	// class@000ff3
{
    public KtvEditOperationFragment b;
    public int c;
    public String d;
    public i e;
    public String f;
    public final KtvEditOperationFragment g;

    public void KtvEditOperationFragment$a(KtvEditOperationFragment p0){
       this.g = p0;
       super();
       this.c = 13;
       this.d = "ktvEdit";
       this.f = "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvEditOperationFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, KtvEditOperationFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(KtvEditOperationFragment$a.class, new g());
       }else {
          obj.put(KtvEditOperationFragment$a.class, null);
       }
       return obj;
    }
}
