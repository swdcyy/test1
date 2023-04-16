package androidx.appcompat.app.AppCompatActivity;
import q0.c;
import l1.g$a;
import q0.b;
import androidx.fragment.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import q0.d;
import android.content.Context;
import android.app.Activity;
import androidx.appcompat.app.ActionBar;
import android.view.Window;
import android.view.KeyEvent;
import androidx.core.app.ComponentActivity;
import q0.a;
import android.view.MenuInflater;
import android.content.res.Resources;
import androidx.appcompat.widget.j;
import android.view.ContextThemeWrapper;
import android.content.Intent;
import androidx.core.app.b;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import cw9.c;
import android.os.Bundle;
import l1.g;
import android.view.MenuItem;
import android.view.Menu;
import u0.b;
import androidx.core.app.a;
import java.lang.CharSequence;
import u0.b$a;
import android.os.Build$VERSION;
import androidx.appcompat.widget.Toolbar;

public class AppCompatActivity extends FragmentActivity implements c, g$a, b	// class@000569
{
    public d mDelegate;
    public Resources mResources;

    public void AppCompatActivity(){
       super();
    }
    public void AppCompatActivity(int p0){
       super(p0);
    }
    public void addContentView(View p0,ViewGroup$LayoutParams p1){
       this.getDelegate().d(p0, p1);
    }
    public void attachBaseContext(Context p0){
       super.attachBaseContext(this.getDelegate().g(p0));
    }
    public void closeOptionsMenu(){
       ActionBar supportActio = this.getSupportActionBar();
       if (this.getWindow().hasFeature(0) && (supportActio == null || !supportActio.k())) {
          super.closeOptionsMenu();
       }
       return;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       ActionBar supportActio = this.getSupportActionBar();
       if (p0.getKeyCode() == 82 && (supportActio != null && supportActio.G(p0))) {
          return true;
       }
       return super.dispatchKeyEvent(p0);
    }
    public View findViewById(int p0){
       return this.getDelegate().k(p0);
    }
    public d getDelegate(){
       if (this.mDelegate == null) {
          this.mDelegate = d.h(this, this);
       }
       return this.mDelegate;
    }
    public a getDrawerToggleDelegate(){
       return this.getDelegate().m();
    }
    public MenuInflater getMenuInflater(){
       return this.getDelegate().o();
    }
    public Resources getResources(){
       AppCompatActivity tmResources = this.mResources;
       if (tmResources == null) {
          boolean b = j.b;
       }
       if (tmResources == null) {
          tmResources = super.getResources();
       }
       return tmResources;
    }
    public ActionBar getSupportActionBar(){
       return this.getDelegate().p();
    }
    public Intent getSupportParentActivityIntent(){
       return b.a(this);
    }
    public void invalidateOptionsMenu(){
       this.getDelegate().s();
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       if (this.mResources != null) {
          this.mResources.updateConfiguration(p0, c.c(super.getResources()));
       }
       this.getDelegate().v(p0);
       return;
    }
    public void onContentChanged(){
       this.onSupportContentChanged();
    }
    public void onCreate(Bundle p0){
       d delegate = this.getDelegate();
       delegate.r();
       delegate.w(p0);
       super.onCreate(p0);
    }
    public void onCreateSupportNavigateUpTaskStack(g p0){
       p0.d(this);
    }
    public void onDestroy(){
       super.onDestroy();
       this.getDelegate().x();
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (this.performMenuItemShortcut(p1)) {
          return true;
       }
       return super.onKeyDown(p0, p1);
    }
    public final boolean onMenuItemSelected(int p0,MenuItem p1){
       if (super.onMenuItemSelected(p0, p1)) {
          return true;
       }
       ActionBar supportActio = this.getSupportActionBar();
       if (p1.getItemId() == 0x102002c && (supportActio != null && (supportActio.o() & 0x04))) {
          return this.onSupportNavigateUp();
       }
       return false;
    }
    public boolean onMenuOpened(int p0,Menu p1){
       return super.onMenuOpened(p0, p1);
    }
    public void onNightModeChanged(int p0){
    }
    public void onPanelClosed(int p0,Menu p1){
       super.onPanelClosed(p0, p1);
    }
    public void onPostCreate(Bundle p0){
       super.onPostCreate(p0);
       this.getDelegate().y(p0);
    }
    public void onPostResume(){
       super.onPostResume();
       this.getDelegate().z();
    }
    public void onPrepareSupportNavigateUpTaskStack(g p0){
    }
    public void onSaveInstanceState(Bundle p0){
       super.onSaveInstanceState(p0);
       this.getDelegate().A(p0);
    }
    public void onStart(){
       super.onStart();
       this.getDelegate().B();
    }
    public void onStop(){
       super.onStop();
       this.getDelegate().C();
    }
    public void onSupportActionModeFinished(b p0){
    }
    public void onSupportActionModeStarted(b p0){
    }
    public void onSupportContentChanged(){
    }
    public boolean onSupportNavigateUp(){
       Intent supportParen = this.getSupportParentActivityIntent();
       if (supportParen == null) {
          return false;
       }
       if (this.supportShouldUpRecreateTask(supportParen)) {
          g og = g.m(this);
          this.onCreateSupportNavigateUpTaskStack(og);
          this.onPrepareSupportNavigateUpTaskStack(og);
          try{
             og.n();
             a.a(this);
          }catch(java.lang.IllegalStateException e0){
             this.finish();
          }
       }else {
          this.supportNavigateUpTo(supportParen);
       }
    }
    public void onTitleChanged(CharSequence p0,int p1){
       super.onTitleChanged(p0, p1);
       this.getDelegate().O(p0);
    }
    public b onWindowStartingSupportActionMode(b$a p0){
       return null;
    }
    public void openOptionsMenu(){
       ActionBar supportActio = this.getSupportActionBar();
       if (this.getWindow().hasFeature(0) && (supportActio == null || !supportActio.H())) {
          super.openOptionsMenu();
       }
       return;
    }
    public final boolean performMenuItemShortcut(KeyEvent p0){
       if (Build$VERSION.SDK_INT < 26 && (!p0.isCtrlPressed() && (!KeyEvent.metaStateHasNoModifiers(p0.getMetaState()) && (!p0.getRepeatCount() && !KeyEvent.isModifierKey(p0.getKeyCode()))))) {
          Window window = this.getWindow();
          if (window != null && (window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(p0))) {
             return true;
          }
       }
    label_003e :
       return false;
    }
    public void setContentView(int p0){
       this.getDelegate().G(p0);
    }
    public void setContentView(View p0){
       this.getDelegate().H(p0);
    }
    public void setContentView(View p0,ViewGroup$LayoutParams p1){
       this.getDelegate().I(p0, p1);
    }
    public void setSupportActionBar(Toolbar p0){
       this.getDelegate().M(p0);
    }
    public void setSupportProgress(int p0){
    }
    public void setSupportProgressBarIndeterminate(boolean p0){
    }
    public void setSupportProgressBarIndeterminateVisibility(boolean p0){
    }
    public void setSupportProgressBarVisibility(boolean p0){
    }
    public void setTheme(int p0){
       super.setTheme(p0);
       this.getDelegate().N(p0);
    }
    public b startSupportActionMode(b$a p0){
       return this.getDelegate().P(p0);
    }
    public void supportInvalidateOptionsMenu(){
       this.getDelegate().s();
    }
    public void supportNavigateUpTo(Intent p0){
       b.e(this, p0);
    }
    public boolean supportRequestWindowFeature(int p0){
       return this.getDelegate().F(p0);
    }
    public boolean supportShouldUpRecreateTask(Intent p0){
       return b.f(this, p0);
    }
}
