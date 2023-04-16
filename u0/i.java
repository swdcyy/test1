package u0.i;
import android.view.Window$Callback;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import java.util.List;
import android.view.SearchEvent;
import android.view.WindowManager$LayoutParams;
import android.view.ActionMode$Callback;

public class i implements Window$Callback	// class@002cec
{
    public final Window$Callback b;

    public void i(Window$Callback p0){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("Window callback may not be null");
       }
       this.b = p0;
       return;
    }
    public final Window$Callback a(){
       return this.b;
    }
    public boolean dispatchGenericMotionEvent(MotionEvent p0){
       return this.b.dispatchGenericMotionEvent(p0);
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       return this.b.dispatchKeyEvent(p0);
    }
    public boolean dispatchKeyShortcutEvent(KeyEvent p0){
       return this.b.dispatchKeyShortcutEvent(p0);
    }
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0){
       return this.b.dispatchPopulateAccessibilityEvent(p0);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       return this.b.dispatchTouchEvent(p0);
    }
    public boolean dispatchTrackballEvent(MotionEvent p0){
       return this.b.dispatchTrackballEvent(p0);
    }
    public void onActionModeFinished(ActionMode p0){
       this.b.onActionModeFinished(p0);
    }
    public void onActionModeStarted(ActionMode p0){
       this.b.onActionModeStarted(p0);
    }
    public void onAttachedToWindow(){
       this.b.onAttachedToWindow();
    }
    public void onContentChanged(){
       this.b.onContentChanged();
    }
    public boolean onCreatePanelMenu(int p0,Menu p1){
       return this.b.onCreatePanelMenu(p0, p1);
    }
    public View onCreatePanelView(int p0){
       return this.b.onCreatePanelView(p0);
    }
    public void onDetachedFromWindow(){
       this.b.onDetachedFromWindow();
    }
    public boolean onMenuItemSelected(int p0,MenuItem p1){
       return this.b.onMenuItemSelected(p0, p1);
    }
    public boolean onMenuOpened(int p0,Menu p1){
       return this.b.onMenuOpened(p0, p1);
    }
    public void onPanelClosed(int p0,Menu p1){
       this.b.onPanelClosed(p0, p1);
    }
    public void onPointerCaptureChanged(boolean p0){
       this.b.onPointerCaptureChanged(p0);
    }
    public boolean onPreparePanel(int p0,View p1,Menu p2){
       return this.b.onPreparePanel(p0, p1, p2);
    }
    public void onProvideKeyboardShortcuts(List p0,Menu p1,int p2){
       this.b.onProvideKeyboardShortcuts(p0, p1, p2);
    }
    public boolean onSearchRequested(){
       return this.b.onSearchRequested();
    }
    public boolean onSearchRequested(SearchEvent p0){
       return this.b.onSearchRequested(p0);
    }
    public void onWindowAttributesChanged(WindowManager$LayoutParams p0){
       this.b.onWindowAttributesChanged(p0);
    }
    public void onWindowFocusChanged(boolean p0){
       this.b.onWindowFocusChanged(p0);
    }
    public ActionMode onWindowStartingActionMode(ActionMode$Callback p0){
       return this.b.onWindowStartingActionMode(p0);
    }
    public ActionMode onWindowStartingActionMode(ActionMode$Callback p0,int p1){
       return this.b.onWindowStartingActionMode(p0, p1);
    }
}
