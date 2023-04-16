package com.kwai.library.widget.edittext.PasteTextEditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.Context;
import com.kwai.library.widget.edittext.PasteTextEditText$a;
import java.lang.String;
import java.lang.Object;
import android.content.ClipboardManager;
import android.content.ClipData;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import android.content.ClipData$Item;
import java.lang.CharSequence;
import android.text.TextUtils;

public class PasteTextEditText extends AppCompatEditText	// class@000926
{
    public Context e;
    public ClipboardManager f;
    public ClipData g;
    public PasteTextEditText$a h;

    public void PasteTextEditText(Context p0,PasteTextEditText$a p1){
       super(p0);
       this.e = p0;
       this.h = p1;
    }
    public String getClipboardData(){
       PasteTextEditText te = this.e;
       if (te == null) {
          return "";
       }
       if (this.f == null) {
          this.f = te.getSystemService("clipboard");
       }
       ClipData primaryClip = ClipboardInterceptor.getPrimaryClip(this.f);
       this.g = primaryClip;
       if (primaryClip != null && primaryClip.getItemCount() > 0) {
          ClipData$Item itemAt = this.g.getItemAt(0);
          if (itemAt != null && !TextUtils.isEmpty(itemAt.getText())) {
             return itemAt.getText().toString();
          }
       }
       return "";
    }
    public boolean onTextContextMenuItem(int p0){
       PasteTextEditText th;
       switch (p0){
           case 0x1020020:
             th = this.h;
             if (th != null) {
                th.c(this.getClipboardData());
                return true;
             }
             break;
           case 0x1020021:
             th = this.h;
             if (th != null) {
                th.b(this.getClipboardData());
                return true;
             }
             break;
           case 0x1020022:
             th = this.h;
             if (th != null) {
                th.a(this.getClipboardData());
                return true;
             }
             break;
           default:
       }
    label_0029 :
       return false;
    }
}
