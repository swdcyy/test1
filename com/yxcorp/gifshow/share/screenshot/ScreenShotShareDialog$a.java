package com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$a;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.screenshot.m;
import java.util.Map;
import java.util.HashMap;

public class ScreenShotShareDialog$a implements g	// class@001c4c
{
    public BaseFeed b;
    public DialogFragment c;
    public int d;
    public Uri e;
    public Bitmap f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public void ScreenShotShareDialog$a(){
       super();
       this.d = 22;
       this.g = "";
       this.h = "";
       this.i = "";
       this.j = "";
       this.k = "";
       this.l = "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ScreenShotShareDialog$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ScreenShotShareDialog$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ScreenShotShareDialog$a.class, new m());
       }else {
          obj.put(ScreenShotShareDialog$a.class, null);
       }
       return obj;
    }
}
