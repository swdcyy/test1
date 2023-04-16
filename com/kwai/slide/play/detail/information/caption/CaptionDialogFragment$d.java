package com.kwai.slide.play.detail.information.caption.CaptionDialogFragment$d;
import android.content.DialogInterface$OnKeyListener;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class CaptionDialogFragment$d implements DialogInterface$OnKeyListener	// class@0017c2
{
    public static final CaptionDialogFragment$d b;

    static {
       CaptionDialogFragment$d.b = new CaptionDialogFragment$d();
    }
    public void CaptionDialogFragment$d(){
       super();
    }
    public final boolean onKey(DialogInterface p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(CaptionDialogFragment$d.class)) {
          p2 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, CaptionDialogFragment$d.class, "1");
          if (p2 != PatchProxyResult.class) {
             return p2.booleanValue();
          }
       }
       if (p1 == 4 && p0 != null) {
          p0.dismiss();
       }
       return false;
    }
}
