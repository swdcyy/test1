package androidx.appcompat.app.AppCompatDelegateImpl$i;
import u0.i;
import androidx.appcompat.app.AppCompatDelegateImpl;
import android.view.Window$Callback;
import android.view.ActionMode$Callback;
import android.view.ActionMode;
import u0.f$a;
import android.content.Context;
import u0.b$a;
import u0.b;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.view.menu.e;
import android.view.View;
import java.util.List;
import androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState;
import android.os.Build$VERSION;

public class AppCompatDelegateImpl$i extends i	// class@00057a
{
    public final AppCompatDelegateImpl c;

    public void AppCompatDelegateImpl$i(AppCompatDelegateImpl p0,Window$Callback p1){
       this.c = p0;
       super(p1);
    }
    public final ActionMode b(ActionMode$Callback p0){
       f$a uoa = new f$a(this.c.h, p0);
       b uob = this.c.P(uoa);
       if (uob != null) {
          return uoa.e(uob);
       }
       return null;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       boolean b = (this.c.c0(p0) || super.dispatchKeyEvent(p0))? true: false;
       return b;
    }
    public boolean dispatchKeyShortcutEvent(KeyEvent p0){
       boolean b = (super.dispatchKeyShortcutEvent(p0) || this.c.z0(p0.getKeyCode(), p0))? true: false;
       return b;
    }
    public void onContentChanged(){
    }
    public boolean onCreatePanelMenu(int p0,Menu p1){
       if (!p0 && !p1 instanceof e) {
          return false;
       }
       return super.onCreatePanelMenu(p0, p1);
    }
    public boolean onMenuOpened(int p0,Menu p1){
       super.onMenuOpened(p0, p1);
       this.c.C0(p0);
       return true;
    }
    public void onPanelClosed(int p0,Menu p1){
       super.onPanelClosed(p0, p1);
       this.c.D0(p0);
    }
    public boolean onPreparePanel(int p0,View p1,Menu p2){
       e uoe = (p2 instanceof e)? p2: null;
       if (!p0 && !uoe) {
          return false;
       }else if(uoe){
          uoe.e0(true);
       }
       boolean b = super.onPreparePanel(p0, p1, p2);
       if (uoe != null) {
          uoe.e0(false);
       }
       return b;
    }
    public void onProvideKeyboardShortcuts(List p0,Menu p1,int p2){
       AppCompatDelegateImpl$PanelFeatureState j = this.c.m0(0, true).j;
       if (j != null) {
          super.onProvideKeyboardShortcuts(p0, j, p2);
       }else {
          super.onProvideKeyboardShortcuts(p0, p1, p2);
       }
       return;
    }
    public ActionMode onWindowStartingActionMode(ActionMode$Callback p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return null;
       }
       if (this.c.u()) {
          return this.b(p0);
       }
       return super.onWindowStartingActionMode(p0);
    }
    public ActionMode onWindowStartingActionMode(ActionMode$Callback p0,int p1){
       if (!this.c.u() || p1) {
          return super.onWindowStartingActionMode(p0, p1);
       }
       return this.b(p0);
    }
}
