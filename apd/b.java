package apd.b;
import apd.a;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.plugin.kwaitoken.model.TachTemplateDialogInfo;
import apd.d;

public final class b implements a	// class@000210
{
    public final BaseDialogInfo b;

    public void b(BaseDialogInfo p0){
       this.b = p0;
       super();
    }
    public void c(String p0){
       b tb = this.b;
       if (tb instanceof TachTemplateDialogInfo) {
          tb.mTachItemId = p0;
       }
       d.onTokenDialogClickEvent("TOKEN_TACH_DIALOG_CLICK", tb);
       return;
    }
    public void d(String p0,String p1){
       b tb = this.b;
       if (tb instanceof TachTemplateDialogInfo) {
          tb.mTachItemId = p0;
       }
       d.onTokenDialogClickEvent("TOKEN_TACH_DIALOG_CLICK", tb);
       return;
    }
}
