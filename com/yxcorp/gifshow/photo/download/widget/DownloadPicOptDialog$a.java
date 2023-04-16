package com.yxcorp.gifshow.photo.download.widget.DownloadPicOptDialog$a;
import im8.g;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photo.download.widget.h;
import java.util.Map;
import java.util.HashMap;

public class DownloadPicOptDialog$a implements g	// class@000f3a
{
    public QPhoto b;
    public DialogFragment c;
    public ObservableList d;
    public DownloadPhotoInfoResponse e;
    public String f;
    public int g;

    public void DownloadPicOptDialog$a(){
       super();
       this.d = new ObservableList(new ArrayList());
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadPicOptDialog$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, DownloadPicOptDialog$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(DownloadPicOptDialog$a.class, new h());
       }else {
          obj.put(DownloadPicOptDialog$a.class, null);
       }
       return obj;
    }
}
