package com.kuaishou.ark.rtx.widget.RTXText;
import com.tachikoma.core.component.text.TKText;
import gx4.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import yp8.a;
import com.tachikoma.core.component.e;
import jq8.a;
import java.lang.Number;
import java.lang.Integer;
import java.util.HashMap;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import iq8.n;
import android.widget.TextView;
import java.lang.Exception;

public class RTXText extends TKText	// class@000f99
{
    public String ellipsizeMode;
    public int numberOfLines;

    public void RTXText(f p0){
       super(p0);
       this.setEllipsizeMode("tail");
    }
    public void setEllipsizeMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXText.class, "1")) {
          return;
       }
       if (TextUtils.equals(p0, "tail")) {
          p0 = "ellipsis";
       }
       this.getDomNode().c().b();
       this.setTextOverflow(p0);
       return;
    }
    public void setLineHeight(Number p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXText.class, "4")) {
          return;
       }
       this.setTextLineHeight(p0);
       return;
    }
    public void setNumberOfLines(int p0){
       RTXText rTXText = RTXText.class;
       if (PatchProxy.isSupport(rTXText) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, rTXText, "2")) {
          return;
       }
       this.numberOfLines = p0;
       this.getDomNode().c().b();
       this.setTextLineClamp(this.numberOfLines);
       return;
    }
    public void setStyle(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXText.class, "5")) {
          return;
       }
       e tstyle = this.style;
       if (tstyle != null && tstyle.equals(p0)) {
          return;
       }
       if (p0 != null && p0.containsKey("maxWidth")) {
          try{
             this.getView().setMaxWidth(n.b(p0.get("maxWidth").intValue()));
             p0.remove("maxWidth");
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public void setTextDecorationLine(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXText.class, "3")) {
          return;
       }
       this.setTextDecoration(p0);
       return;
    }
}
