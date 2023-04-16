package jgd.l;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import os5.l;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class l implements View$OnClickListener	// class@0016e8
{
    public GifshowActivity b;

    public void l(){
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       d.a(-1492894991).EQ(this.b);
       return;
    }
}
