package com.yxcorp.gifshow.model.response.dialog.KemBottomDialogResponse;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.model.response.dialog.KemBottomDialogResponse$DialogText;
import com.yxcorp.gifshow.model.response.dialog.KemBottomDialogResponse$DialogButton;

public class KemBottomDialogResponse extends KemDialogResponse	// class@001f78
{
    public KemBottomDialogResponse$DialogButton button;
    public String headImageUrl;
    public List primaryText;
    public List secondaryText;
    public KemBottomDialogResponse$DialogText title;
    public static final long serialVersionUID = 0xade047565bd8e56;

    public void KemBottomDialogResponse(){
       super();
    }
    public boolean isValid(){
       KemBottomDialogResponse obj = PatchProxy.apply(null, this, KemBottomDialogResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.title != null && this.button != null) {
          obj = this.primaryText;
          if (obj != null && !obj.isEmpty()) {
             obj = this.secondaryText;
             if (obj != null && !obj.isEmpty()) {
                Iterator iterator = this.primaryText.iterator();
                int i = 1;
                while (iterator.hasNext()) {
                   if (!iterator.next().isValid()) {
                      i = 0;
                   }
                }
                iterator = this.secondaryText.iterator();
                int i1 = 1;
                while (iterator.hasNext()) {
                   if (!iterator.next().isValid()) {
                      i1 = 0;
                   }
                }
                if (this.title.isValid() && (i && (i1 && this.button.isValid()))) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
}
