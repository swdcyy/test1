package com.kwai.sharelib.ui.SharePanelFragment$c$b;
import java.lang.Runnable;
import com.kwai.sharelib.ui.SharePanelFragment$c;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Double;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import qsd.d;
import qrd.l1;
import android.view.View;
import com.kwai.sharelib.ui.SharePanelFragment;

public final class SharePanelFragment$c$b implements Runnable	// class@001709
{
    public final SharePanelFragment$c b;
    public final Bitmap c;
    public final ImageView d;

    public void SharePanelFragment$c$b(SharePanelFragment$c p0,Bitmap p1,ImageView p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       double d;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, SharePanelFragment$c$b.class, "1")) {
          return;
       }
       SharePanelFragment$c b = this.b.b;
       ShareInitResponse$SharePanelElement mHeight = b.mHeight;
       if (mHeight > null) {
          ShareInitResponse$SharePanelElement mWidth = b.mWidth;
          if (mWidth > null) {
             d = (double)mHeight / (double)mWidth;
          label_006c :
             SharePanelFragment$c$b td = this.d;
             ViewGroup$LayoutParams layoutParams = td.getLayoutParams();
             layoutParams.height = d.G0(((double)this.d.getWidth() * d));
             td.setLayoutParams(layoutParams);
             td = this.b;
             td.a.Wg(td.c);
             PatchProxy.onMethodExit(SharePanelFragment$c$b.class, "1");
             return;
          }
       }
       if (this.c.getHeight() > 0 && this.c.getWidth() > 0) {
          Double uDouble = Double.valueOf(((double)this.c.getHeight() / (double)this.c.getWidth()));
          uDouble.doubleValue();
          d = ((this.c.getHeight() * this.d.getWidth()) != (this.d.getHeight() * this.c.getWidth()))? Double.MIN_VALUE: 0;
          if (d) {
             objArray = uDouble;
          }
          if (objArray != null) {
             d = objArray.doubleValue();
             goto label_006c ;
          }else {
             PatchProxy.onMethodExit(SharePanelFragment$c$b.class, "1");
             return;
          }
       }else {
          PatchProxy.onMethodExit(SharePanelFragment$c$b.class, "1");
          return;
       }
    }
}
