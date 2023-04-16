package com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$d;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.gifshow.photo.download.widget.k;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$g;
import exb.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$h;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$i;
import java.util.Map;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$j;
import ywb.e;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import q87.c;

public class DownloadPicDialog$d	// class@000f30
{
    public Map a;
    public Map b;
    public boolean c;
    public DownloadPicDialog$i d;

    public void DownloadPicDialog$d(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       this.c = false;
       this.d = null;
    }
    public void DownloadPicDialog$d(k p0){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       this.c = false;
       this.d = null;
    }
    public b a(QPhoto p0,int p1,DownloadPicDialog$g p2){
       DownloadPicDialog$h obj;
       DownloadPicDialog$j oj;
       if (PatchProxy.isSupport(DownloadPicDialog$d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, DownloadPicDialog$d.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (this.c != null) {
          DownloadPicDialog$d td = this.d;
          if (td != null) {
             obj = td.a(p2);
          }
       }
       String photoId = p0.getPhotoId();
       this.b.put(photoId, p2.a);
       DownloadPicDialog$d ta = this.a;
       _monitor_enter(ta);
       Map map = this.a.get(p0.getPhotoId());
       if (map == null) {
          map = new HashMap();
          this.a.put(photoId, map);
       }
       if (map.get(Integer.valueOf(p1)) == null) {
          oj = new DownloadPicDialog$j(p2, obj);
          map.put(Integer.valueOf(p1), oj);
       }else {
          Object[] objArray = new Object[0];
          e.C().t(DownloadPicDialog.T, "Unexpected listener", objArray);
          oj = new DownloadPicDialog$j(p2, obj);
          map.put(Integer.valueOf(p1), oj);
       }
       _monitor_exit(ta);
       return oj;
    }
}
