package com.kuaishou.tuna_core.krn.native_view.TunaRichTextViewManager;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.String;
import com.kuaishou.tuna_core.krn.native_view.TunaRichTextViewManager$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.x;
import ze.n0;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.text.Spanned;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.krn.native_view.a;
import msd.a;
import c15.b;

public class TunaRichTextViewManager extends BaseViewManager	// class@0010df
{

    public void TunaRichTextViewManager(){
       super();
    }
    public static String lambda$updateExtraData$0(){
       return "extraData is not instance of Spanned";
    }
    public TunaRichTextViewManager$a createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, TunaRichTextViewManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TunaRichTextViewManager$a();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public AppCompatTextView createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaRichTextViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AppCompatTextView(p0);
    }
    public String getName(){
       return "TunaRichTextView";
    }
    public Class getShadowNodeClass(){
       return TunaRichTextViewManager$a.class;
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(AppCompatTextView p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaRichTextViewManager.class, "2")) {
          return;
       }
       if (p1 instanceof Spanned) {
          p0.setText(p1);
       }else {
          b.d(KsLogTunaCoreTag.TUNA_KRN.appendTag("TunaRichTextViewManager"), a.b);
       }
       return;
    }
}
