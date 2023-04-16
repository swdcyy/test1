package com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.bridge.ContextBaseJavaModule;
import android.content.Context;
import android.content.ClipboardManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.Promise;
import android.content.ClipData;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import android.content.ClipData$Item;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Throwable;

public class ClipboardModule extends ContextBaseJavaModule	// class@001289
{

    public void ClipboardModule(Context p0){
       super(p0);
    }
    public final ClipboardManager getClipboardService(){
       Object obj = PatchProxy.apply(null, this, ClipboardModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.getContext();
       return this.getContext().getSystemService("clipboard");
    }
    public String getName(){
       return "Clipboard";
    }
    public void getString(Promise p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipboardModule.class, "2")) {
          return;
       }
       try{
          ClipboardManager clipboardSer = this.getClipboardService();
          ClipData primaryClip = ClipboardInterceptor.getPrimaryClip(clipboardSer);
          if (primaryClip != null && primaryClip.getItemCount() >= 1) {
             p0.resolve(ClipboardInterceptor.getPrimaryClip(clipboardSer).getItemAt(0).getText());
          }else {
             p0.resolve("");
          }
       }catch(java.lang.Exception e0){
          p0.reject(e0);
       }
       return;
    }
    public void setString(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipboardModule.class, "3")) {
          return;
       }
       this.getClipboardService().setPrimaryClip(ClipData.newPlainText(null, p0));
       return;
    }
}
