package com.kuaishou.webkit.internal.KsWebViewUtils$2;
import android.view.View$OnClickListener;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import java.lang.String;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import java.lang.StringBuilder;
import com.kuaishou.webkit.extension.KwSdk;
import com.kuaishou.webkit.internal.InitSettingsImpl;

public class KsWebViewUtils$2 implements View$OnClickListener	// class@00131a
{
    public final TextView val$devModeView;

    public void KsWebViewUtils$2(TextView p0){
       this.val$devModeView = p0;
       super();
    }
    public void onClick(View p0){
       if ((this.val$devModeView.getText().toString()).length() < 10) {
          int i = 1;
          String str = KsWebViewUtils.sLoadInfo+"\nKsWebView="+(KsWebViewUtils.useSysWebView() ^ i)+"\nSdk="+KwSdk.getVersionName();
          if (!KsWebViewUtils.useSysWebView()) {
             int asyncComposi = InitSettingsImpl.getInstance().getAsyncCompositingMode();
             str = str+"\nCore="+KwSdk.getCoreVersionName()+"\n进程模式:";
             if (!asyncComposi) {
                str = str+"单进程";
             }else if(asyncComposi == 3){
                str = str+"Renderer";
             }else if(asyncComposi == i){
                str = str+"GPU";
             }else if(asyncComposi == 4){
                str = str+"Renderer+GPU";
             }else {
                str = str+asyncComposi;
             }
          }
          str = str+"\nLoadStep="+KsWebViewUtils.getLoaderStep();
          if (KsWebViewUtils.useSysWebView()) {
             str = str+"\nException="+KsWebViewUtils.getException();
          }
          this.val$devModeView.setText(str);
       }else {
          this.val$devModeView.setText(" ...  ");
       }
       return;
    }
}
