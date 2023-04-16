package com.kuaishou.ark.rtx.widget.RTXImage;
import com.tachikoma.component.imageview.TKAnimatedImage;
import gx4.f;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.tachikoma.core.component.e;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.Objects;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;

public class RTXImage extends TKAnimatedImage	// class@000f8f
{
    public HashMap defaultSource;
    public String resizeMode;
    public HashMap source;

    public void RTXImage(f p0){
       super(p0);
       this.setResizeMode("cover");
    }
    public void setDefaultSource(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXImage.class, "2")) {
          return;
       }
       this.setPlaceholder(p0.get("uri"));
       this.defaultSource = p0;
       return;
    }
    public void setResizeMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXImage.class, "3")) {
          return;
       }
       this.resizeMode = p0;
       String str = 3;
       if (this.getView() instanceof KwaiImageView) {
          KwaiImageView view = this.getView();
          Objects.requireNonNull(p0);
          switch (p0.hashCode()){
              case 0x8fd4e705:
                if (p0.equals("stretch")) {
                   str = 0;
                }
                break;
              case 0xc3e1af26:
                if (p0.equals("origin")) {
                   str = 1;
                }
                break;
              case 0x5a753b7:
                if (p0.equals("cover")) {
                   str = 2;
                }
                break;
              case 0x38b724d4:
                if (p0.equals("contain")) {
                }
                break;
              default:
             label_0030 :
                str = -1;
          }
          switch (str){
              case 0:
                view.getHierarchy().u(t$b.a);
                break;
              case 1:
                view.getHierarchy().u(t$b.d);
                break;
              case 2:
                view.getHierarchy().u(t$b.i);
                break;
              case 3:
                view.getHierarchy().u(t$b.e);
                break;
              default:
          }
       }else {
          Objects.requireNonNull(p0);
          switch (p0.hashCode()){
              case 0x8fd4e705:
                if (p0.equals("stretch")) {
                   str = 0;
                }
                break;
              case 0xaeb2cc55:
                if (p0.equals("center")) {
                   str = 1;
                }
                break;
              case 0x5a753b7:
                if (p0.equals("cover")) {
                   str = 2;
                }
                break;
              case 0x38b724d4:
                if (p0.equals("contain")) {
                }
                break;
              default:
             label_0095 :
                str = -1;
          }
          switch (str){
              case 0:
                this.setContentMode("stretch");
                break;
              case 1:
              case 3:
                this.setContentMode("contain");
                break;
              case 2:
                this.setContentMode("cover");
                break;
              default:
          }
       }
       return;
    }
    public void setSource(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXImage.class, "1")) {
          return;
       }
       this.setUri(p0.get("uri"));
       this.source = p0;
       return;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXImage.class, "4")) {
          return;
       }
       e tstyle = this.style;
       if (tstyle != null && tstyle.equals(p0)) {
          return;
       }
       super.setStyle(p0);
       return;
    }
}
