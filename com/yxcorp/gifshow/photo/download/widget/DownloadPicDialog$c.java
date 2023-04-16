package com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$c;
import h3.a;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import android.content.Context;
import java.util.List;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class DownloadPicDialog$c extends a	// class@000f2f
{
    public List d;
    public final DownloadPicDialog e;

    public void DownloadPicDialog$c(DownloadPicDialog p0,Context p1,List p2){
       this.e = p0;
       super();
       this.d = p2;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(DownloadPicDialog$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, DownloadPicDialog$c.class, "2")) {
          return;
       }
       p0.removeView(p2);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, DownloadPicDialog$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public Object o(ViewGroup p0,int p1){
       DownloadPicDialog$c uoc = DownloadPicDialog$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = this.d.get(p1);
       p0.addView(view);
       return view;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
