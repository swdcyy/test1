package com.taobao.gcanvas.surface.GTextureView;
import android.view.TextureView;
import android.content.Context;
import java.lang.String;
import com.taobao.gcanvas.surface.GTextureViewCallback;
import android.view.TextureView$SurfaceTextureListener;
import android.graphics.Paint;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;

public class GTextureView extends TextureView	// class@000dff
{
    public GTextureViewCallback b;

    public void GTextureView(Context p0,String p1){
       super(p0);
       GTextureViewCallback gTextureView = new GTextureViewCallback(this, p1);
       this.b = gTextureView;
       this.setSurfaceTextureListener(gTextureView);
       this.setOpaque(false);
       this.setLayerType(2, null);
    }
    public String getCanvasKey(){
       GTextureView tb = this.b;
       if (tb != null) {
          return tb.b;
       }
       return "";
    }
    public void onWindowVisibilityChanged(int p0){
       super.onWindowVisibilityChanged(p0);
    }
    public void setBackgroundColor(String p0){
       GTextureView tb = this.b;
       if (tb != null) {
          Objects.requireNonNull(tb);
          if (!TextUtils.isEmpty(p0)) {
             tb.c = p0;
          }
       }
       return;
    }
}
