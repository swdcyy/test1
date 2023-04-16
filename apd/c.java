package apd.c;
import apd.e;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import java.lang.Object;
import java.lang.String;
import apd.d;

public final class c implements e	// class@000211
{
    public final BaseDialogInfo b;

    public void c(BaseDialogInfo p0){
       this.b = p0;
       super();
    }
    public void e(){
       d.onTokenDialogClickEvent("TOKEN_DIALOG_CLOSE", this.b);
    }
    public void f(String p0){
       d.onTokenDialogClickEvent("TOKEN_DIALOG_AVATAR_CLICK", this.b);
    }
    public void g(String p0){
       d.onTokenDialogClickEvent("TOKEN_DIALOG_ACTION_CLICK", this.b);
    }
    public void h(String p0){
       d.onTokenDialogClickEvent("TOKEN_DIALOG_SOURCE_CLICK", this.b);
    }
    public void i(String p0){
       d.onTokenDialogClickEvent("TOKEN_DIALOG_CONTENT_CLICK", this.b);
    }
}
