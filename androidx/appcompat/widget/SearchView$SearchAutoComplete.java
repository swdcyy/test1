package androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.SearchView$SearchAutoComplete$a;
import android.widget.AutoCompleteTextView;
import android.os.Build$VERSION;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView$n;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.lang.Object;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.Runnable;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.KeyEvent$DispatcherState;
import android.view.ViewGroup;
import android.os.IBinder;

public class SearchView$SearchAutoComplete extends AppCompatAutoCompleteTextView	// class@000618
{
    public int e;
    public SearchView f;
    public boolean g;
    public final Runnable h;

    public void SearchView$SearchAutoComplete(Context p0){
       super(p0, null);
    }
    public void SearchView$SearchAutoComplete(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040126);
    }
    public void SearchView$SearchAutoComplete(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = new SearchView$SearchAutoComplete$a(this);
       this.e = this.getThreshold();
    }
    public void a(){
       if (Build$VERSION.SDK_INT >= 29) {
          this.setInputMethodMode(1);
          if (this.enoughToFilter()) {
             this.showDropDown();
          }
       }else {
          SearchView.l1.c(this);
       }
       return;
    }
    public boolean b(){
       boolean b = (!TextUtils.getTrimmedLength(this.getText()))? true: false;
       return b;
    }
    public void c(){
       if (this.g != null) {
          this.getContext().getSystemService("input_method").showSoftInput(this, 0);
          this.g = false;
       }
       return;
    }
    public boolean enoughToFilter(){
       boolean b = (this.e <= null || super.enoughToFilter())? true: false;
       return b;
    }
    public final int getSearchViewTextMinWidthDp(){
       Configuration configuratio = this.getResources().getConfiguration();
       Configuration screenWidthD = configuratio.screenWidthDp;
       Configuration screenHeight = configuratio.screenHeightDp;
       if (screenWidthD >= 960 && (screenHeight >= 720 && configuratio.orientation == 2)) {
          return 256;
       }
       if (screenWidthD >= 600 || (screenWidthD >= 640 && screenHeight >= 480)) {
          return 192;
       }
       return 160;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       if (this.g != null) {
          this.removeCallbacks(this.h);
          this.post(this.h);
       }
       return inputConnect;
    }
    public void onFinishInflate(){
       super.onFinishInflate();
       this.setMinWidth((int)TypedValue.applyDimension(1, (float)this.getSearchViewTextMinWidthDp(), c.c(this.getResources())));
    }
    public void onFocusChanged(boolean p0,int p1,Rect p2){
       super.onFocusChanged(p0, p1, p2);
       this.f.Z();
    }
    public boolean onKeyPreIme(int p0,KeyEvent p1){
       if (p0 == 4) {
          if (!p1.getAction() && !p1.getRepeatCount()) {
             KeyEvent$DispatcherState keyDispatche = this.getKeyDispatcherState();
             if (keyDispatche != null) {
                keyDispatche.startTracking(p1, this);
             }
             return true;
          }else if(p1.getAction() == 1){
             KeyEvent$DispatcherState keyDispatche1 = this.getKeyDispatcherState();
             if (keyDispatche1 != null) {
                keyDispatche1.handleUpEvent(p1);
             }
             if (p1.isTracking() && !p1.isCanceled()) {
                this.f.clearFocus();
                this.setImeVisibility(false);
                return true;
             }
          }
       }
       return super.onKeyPreIme(p0, p1);
    }
    public void onWindowFocusChanged(boolean p0){
       super.onWindowFocusChanged(p0);
       if (p0 && (this.f.hasFocus() && !this.getVisibility())) {
          this.g = true;
          if (SearchView.M(this.getContext())) {
             this.a();
          }
       }
       return;
    }
    public void performCompletion(){
    }
    public void replaceText(CharSequence p0){
    }
    public void setImeVisibility(boolean p0){
       InputMethodManager systemServic = this.getContext().getSystemService("input_method");
       if (!p0) {
          this.g = false;
          this.removeCallbacks(this.h);
          systemServic.hideSoftInputFromWindow(this.getWindowToken(), false);
          return;
       }else if(systemServic.isActive(this)){
          this.g = false;
          this.removeCallbacks(this.h);
          systemServic.showSoftInput(this, false);
          return;
       }else {
          this.g = true;
          return;
       }
    }
    public void setSearchView(SearchView p0){
       this.f = p0;
    }
    public void setThreshold(int p0){
       super.setThreshold(p0);
       this.e = p0;
    }
}
