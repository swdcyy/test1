package ag.c;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputConnection;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import df.c;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import ag.i;
import android.widget.EditText;
import df.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.lang.Integer;
import yd.e;
import android.view.KeyEvent;
import android.text.Editable;

public class c extends InputConnectionWrapper	// class@0001f2
{
    public ReactEditText a;
    public c b;
    public boolean c;
    public String d;

    public void c(InputConnection p0,ReactContext p1,ReactEditText p2){
       super(p0, false);
       this.d = null;
       this.b = p1.getNativeModule(UIManagerModule.class).getEventDispatcher();
       this.a = p2;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       if (p0.equals("\n")) {
          p0 = "Enter";
       }
       this.b.c(new i(this.a.getId(), p0));
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       if (this.c != null) {
          this.d = p0;
       }else {
          this.a(p0);
       }
       return;
    }
    public boolean beginBatchEdit(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c = true;
       return super.beginBatchEdit();
    }
    public boolean commitText(CharSequence p0,int p1){
       String obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, c.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p0.toString();
       if (!e.g || obj.length() <= 2) {
          if (obj.equals("")) {
             obj = "Backspace";
          }
          this.b(obj);
       }
       return super.commitText(p0, p1);
    }
    public boolean deleteSurroundingText(int p0,int p1){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, c.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.a("Backspace");
       return super.deleteSurroundingText(p0, p1);
    }
    public boolean endBatchEdit(){
       c obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.c = false;
       obj = this.d;
       if (obj != null) {
          this.a(obj);
          this.d = null;
       }
       return super.endBatchEdit();
    }
    public boolean sendKeyEvent(KeyEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction()) {
          if (p0.getKeyCode() == 67) {
             this.a("Backspace");
          }else if(p0.getKeyCode() == 66){
             this.a("Enter");
          }
       }
       return super.sendKeyEvent(p0);
    }
    public boolean setComposingText(CharSequence p0,int p1){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int selectionSta = this.a.getSelectionStart();
       boolean b = super.setComposingText(p0, p1);
       p1 = this.a.getSelectionStart();
       int i = 0;
       int i1 = (selectionSta == this.a.getSelectionEnd())? 1: 0;
       int i2 = (p1 == selectionSta)? 1: 0;
       if (p1 < selectionSta || p1 <= 0) {
          i = 1;
       }
       String str = (i || (!i1 && i2))? "Backspace": String.valueOf(this.a.getText().charAt((p1 - 1)));
       this.b(str);
       return b;
    }
}
